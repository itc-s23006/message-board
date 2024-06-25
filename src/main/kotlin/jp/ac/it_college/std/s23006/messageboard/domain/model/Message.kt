package jp.ac.it_college.std.s23006.messageboard.domain.model

import java.time.LocalDateTime

data class Message(
    val id: Long,
    val threadId: Long,
    val userId: Long,
    val message: String,
    val postedAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val deleted: Boolean = false
)

