package com.example.demokt.repository

import com.example.demokt.entity.DemoEntity
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

/**
 *packageName    : com.example.demokt.repository
 * fileName       : DemoRepository
 * author         : kimdonggyuuuuu
 * date           : 2022/07/07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/07/07        kimdonggyuuuuu       최초 생성
 */
@Repository
interface DemoRepository:ReactiveCrudRepository<DemoEntity, String> {
}