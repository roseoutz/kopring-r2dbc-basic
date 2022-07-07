package com.example.demokt

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 *packageName    : com.example.demokt
 * fileName       : Util
 * author         : kimdonggyuuuuu
 * date           : 2022/07/07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/07/07        kimdonggyuuuuu       최초 생성
 */

inline fun <reified T> logger(): Logger {
    return LoggerFactory.getLogger(T::class.java)
}