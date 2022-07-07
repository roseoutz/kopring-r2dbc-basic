package com.example.demokt.service

import com.example.demokt.dto.DemoDTO
import com.example.demokt.entity.DemoEntity
import com.example.demokt.repository.DemoRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

/**
 *packageName    : com.example.demokt.service
 * fileName       : DefaultDemoService
 * author         : kimdonggyuuuuu
 * date           : 2022/07/07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/07/07        kimdonggyuuuuu       최초 생성
 */
@Service
class DefaultDemoService(
    val demoRepository: DemoRepository
): DemoService {

    override fun get(oid: String): Mono<DemoDTO> {
        return demoRepository.findById(oid)
            .map { toDTO(it) }
    }

    override fun add(demoDTO: DemoDTO): Mono<DemoDTO> {
        return demoRepository.save(toEntity(demoDTO))
            .map { toDTO(it) }
    }

    override fun update(demoDTO: DemoDTO): Mono<DemoDTO> {
        TODO("Not yet implemented")
    }

    override fun delete(demoDTO: DemoDTO): Mono<DemoDTO> {
        TODO("Not yet implemented")
    }

    fun toDTO(demoEntity: DemoEntity): DemoDTO {
        TODO("Not yet implemented")
    }

    fun toEntity(demoDTO: DemoDTO): DemoEntity {
        TODO("Not yet implemented")
    }
}