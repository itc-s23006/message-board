/*
package jp.ac.it_college.std.s23006.messageboard.application.service

import jp.ac.it_college.std.s23006.messageboard.domain.repository.ThreadRepository
import jp.ac.it_college.std.s23006.messageboard.domain.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import jp.ac.it_college.std.s23006.messageboard.domain.model.Thread
import jp.ac.it_college.std.s23006.messageboard.infrastructure.database.repository.MessageRepositoryImpl

@Service
class ThreadService(
    private val threadRepository: ThreadRepository,
    private val userRepository: UserRepository,
    private val messageRepository: MessageRepositoryImpl
) {

    fun getList(): List<Thread> {
        return threadRepository.findAll()
    }

    fun getDetails(id: Long): Thread {
        return threadRepository.findById(id) ?: throw IllegalArgumentException("Thread not found")
    }

    @Transactional
    fun newPost(title: String, message: String, userId: Long): Long {
        val user = userRepository.findById(userId) ?: throw IllegalArgumentException("User not found")
        val newThread = Thread(title)
        val savedThread = threadRepository.save(newThread)
        // Assuming a MessageService exists to post the first message in the thread
        val messageService = MessageService(messageRepository, threadRepository, userRepository)
        messageService.newPost(savedThread.id, message, userId)
        return savedThread.id
    }

    @Transactional
    fun updateTitle(id: Long, newTitle: String, userId: Long): Thread {
        val thread = threadRepository.findById(id) ?: throw IllegalArgumentException("Thread not found")
        val updatedThread = thread.copy(title = newTitle)
        return threadRepository.update(updatedThread)
    }

    @Transactional
    fun delete(id: Long, userId: Long) {
        val thread = threadRepository.findById(id) ?: throw IllegalArgumentException("Thread not found")
        threadRepository.deleteById(id)
    }
}*/
