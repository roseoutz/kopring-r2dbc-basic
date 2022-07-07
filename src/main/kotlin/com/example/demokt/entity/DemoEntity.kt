package com.example.demokt.entity

import org.springframework.data.annotation.Id
import org.springframework.data.domain.Persistable
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

/**
 *packageName    : com.example.demokt.entity
 * fileName       : DemoEntity
 * author         : kimdonggyuuuuu
 * date           : 2022/07/07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/07/07        kimdonggyuuuuu       최초 생성
 */

@Table("demo_table")
data class DemoEntity(
    @Id
    val oid: String,
    @Column("name")
    val name: String,
    @Column("phone")
    val phone: String,
    @Column("age")
    val age: Int,
    @org.springframework.data.annotation.Transient val isNew: Boolean?
): Persistable<String> {

    override fun getId(): String {
        return oid
    }

    override fun isNew(): Boolean {
        TODO("Not yet implemented")
    }
}