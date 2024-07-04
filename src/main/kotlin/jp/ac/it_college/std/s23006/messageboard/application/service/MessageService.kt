/*
package jp.ac.it_college.std.s23006.messageboard.application.service

import jp.ac.it_college.std.s23006.messageboard.domain.model.Message
import jp.ac.it_college.std.s23006.messageboard.domain.repository.MessageRepository
import jp.ac.it_college.std.s23006.messageboard.domain.repository.ThreadRepository
import jp.ac.it_college.std.s23006.messageboard.domain.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MessageService(
    private val messageRepository: MessageRepository,
    private val threadRepository: ThreadRepository,
    private val userRepository: UserRepository
) {

    fun getListByThread(threadId: Long): List<Message> {
        return messageRepository.findByThreadId(threadId)
    }

    @Transactional
    fun newPost(threadId: Long, message: String, userId: Long): Message {
        val user = userRepository.findById(userId) ?: throw IllegalArgumentException("User not found")
        val thread = threadRepository.findById(threadId) ?: throw IllegalArgumentException("Thread not found")
        val newMessage = Message(0, user, thread, message)
        return messageRepository.save(newMessage)
    }

    @Transactional
    fun updateMessage(id: Long, newMessage: String, userId: Long): Message {
        val message = messageRepository.findById(id) ?: throw IllegalArgumentException("Message not found")
        if (message.userId.id != userId) throw IllegalAccessException("You cannot update this message")
        val updatedMessage = message.copy(message = newMessage)
        return messageRepository.update(updatedMessage)
    }

    @Transactional
    fun deleteMessage(id: Long, userId: Long) {
        val message = messageRepository.findById(id) ?: throw IllegalArgumentException("Message not found")
        if (message.userId.id != userId) throw IllegalAccessException("You cannot delete this message")
        messageRepository.deleteById(id)
    }
}*/
