package com.example.demokt.controller

import com.example.demokt.dto.DemoDTO
import com.example.demokt.service.DemoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

/**
 *packageName    : com.example.demokt.controller
 * fileName       : DemoController
 * author         : kimdonggyuuuuu
 * date           : 2022/07/07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/07/07        kimdonggyuuuuu       최초 생성
 */

@RestController
class DemoController(
    val demoService: DemoService
) {

    @PostMapping("/demo")
    fun add(@RequestBody demoDTO: DemoDTO): Mono<ResponseEntity<DemoDTO>> {
        return demoService.add(demoDTO)
            .map { ResponseEntity.ok(demoDTO) }
    }
}