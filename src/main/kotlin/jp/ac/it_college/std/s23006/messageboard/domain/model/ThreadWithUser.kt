package jp.ac.it_college.std.s23006.messageboard.domain.model

data class ThreadWithUser(
    val thread: Thread,
    val user: User?
) {
    val isUser: Boolean
        get() = user != null
}
