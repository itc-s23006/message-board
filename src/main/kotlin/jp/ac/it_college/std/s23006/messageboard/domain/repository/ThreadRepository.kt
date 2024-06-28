package jp.ac.it_college.std.s23006.messageboard.domain.repository

import jp.ac.it_college.std.s23006.messageboard.domain.model.Thread

interface ThreadRepository {
    fun findById(id: Long): Thread?
    fun findAll(): List<Thread>
    fun save(thread: java.lang.Thread): Thread
    fun update(thread: Thread): Thread
    fun deleteById(id: Long)
}