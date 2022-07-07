package com.example.demokt.service

import com.example.demokt.dto.DemoDTO
import reactor.core.publisher.Mono

/**
 *packageName    : com.example.demokt.service
 * fileName       : DemoService
 * author         : kimdonggyuuuuu
 * date           : 2022/07/07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/07/07        kimdonggyuuuuu       최초 생성
 */
interface DemoService {

    fun get(oid: String): Mono<DemoDTO>

    fun add(demoDTO: DemoDTO): Mono<DemoDTO>

    fun update(demoDTO: DemoDTO): Mono<DemoDTO>

    fun delete(demoDTO: DemoDTO): Mono<DemoDTO>

}