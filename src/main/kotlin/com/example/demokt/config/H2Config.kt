package com.example.demokt.config

import com.example.demokt.logger
import org.h2.tools.Server
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.context.event.ContextClosedEvent
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.context.event.EventListener

/**
 *packageName    : com.example.demokt.config
 * fileName       : H2Config
 * author         : kimdonggyuuuuu
 * date           : 2022/07/07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/07/07        kimdonggyuuuuu       최초 생성
 */
@Configuration
class H2Config(
    @Value("\${server.port:8080}")
    val serverPort: Int
) {

    lateinit var h2Server: Server

    @EventListener(ContextRefreshedEvent::class)
    fun start() {
        logger<H2Config>().info("start!!!!")
        h2Server = Server.createWebServer("-webPort", (serverPort + 1).toString() + "", "-tcpAllowOthers")
        h2Server.start()
    }

    @EventListener(ContextClosedEvent::class)
    fun stop() {
        h2Server.stop()
    }

}