package jp.ac.it_college.std.s23006.messageboard.domain.model

import kotlinx.datetime.LocalDateTime

data class Message(
    val id: Long,
    val thread: Long,
    val user: Long,
    val message: String,
    val postedAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val deleted: Boolean
)