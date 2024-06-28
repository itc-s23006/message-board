package jp.ac.it_college.std.s23006.messageboard.domain.model

data class Message(
    val id: Long,
    val threadId: User,
    val userId: Thread,
    val message: String,
    val deleted: Boolean = false
)

