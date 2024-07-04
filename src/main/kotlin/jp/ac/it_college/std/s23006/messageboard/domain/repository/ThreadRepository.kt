package jp.ac.it_college.std.s23006.messageboard.domain.repository

import org.springframework.stereotype.Repository

@Repository
interface ThreadRepository {
    fun findAll(): List<Thread>
    fun findById(id: Long): Thread?
}