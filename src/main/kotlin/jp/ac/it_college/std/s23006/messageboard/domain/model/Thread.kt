package jp.ac.it_college.std.s23006.messageboard.domain.model

import java.time.LocalDateTime

data class Thread(
    val id: Long,
    val title: String,
    val userId: Long,
    val createdAt: LocalDateTime,
    var updatedAt: LocalDateTime,
    val deleted: Boolean = false
)
