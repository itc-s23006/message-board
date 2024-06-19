package jp.ac.it_college.std.s23006.messageboard.domain.model

import java.time.LocalDateTime

data class Threads(
    val id: Long,
    val title: String,
    val user_id: String,
    val created_at: LocalDateTime = LocalDateTime.now(),
    val updated_at: LocalDateTime = LocalDateTime.now(),
    val deleted: Boolean = false
)
