package jp.ac.it_college.std.s23006.messageboard.domain.model

data class MessageWithThread(
    val message: Message,
    val thread: Thread?
) {
    val isThread: Boolean
    get() = thread != null
}
