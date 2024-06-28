package jp.ac.it_college.std.s23006.messageboard.domain.repository

import jp.ac.it_college.std.s23006.messageboard.domain.model.Message

interface MessageRepository {
    fun findById(id: Long): Message?
    fun findByThreadId(threadId: Long): List<Message>
    fun save(message: Message): Message
    fun update(message: Message): Message
    fun deleteById(id: Long)
}
