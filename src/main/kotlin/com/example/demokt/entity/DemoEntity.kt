package com.example.demokt.entity

import org.springframework.data.annotation.Id
import org.springframework.data.domain.Persistable
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.annotation.Transient

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
    var oid: String,
    @Column("name")
    val name: String,
    @Column("phone")
    val phone: String,
    @Column("age")
    val age: Int,
    @Transient var new: Boolean
): Persistable<String> {

    override fun getId(): String {
        return oid
    }

    override fun isNew(): Boolean {
        return new
    }
}