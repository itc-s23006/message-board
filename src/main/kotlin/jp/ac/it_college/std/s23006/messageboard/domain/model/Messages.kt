package jp.ac.it_college.std.s23006.messageboard.domain.model

import java.time.LocalDateTime

data class Messages(
    val id: Long,
    val thread_id: Long,
    val user_id: Long,
    val message: String,
    val posted_at: LocalDateTime,
    val updated_at: LocalDateTime,
    val deleted: Boolean
)
