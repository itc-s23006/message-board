/*
package jp.ac.it_college.std.s23006.messageboard.infrastructure.database.repository

import jp.ac.it_college.std.s23006.messageboard.domain.repository.ThreadRepository
import jp.ac.it_college.std.s23006.messageboard.infrastructure.database.dao.ThreadEntity
import jp.ac.it_college.std.s23006.messageboard.infrastructure.database.dao.ThreadsTable
import org.jetbrains.exposed.sql.update
import org.springframework.stereotype.Repository

@Repository
class ThreadRepositoryImpl(
    private val threadsTable: ThreadsTable
) : ThreadRepository {

    override fun findAll(): List<Thread> {
        return threadsTable.findAll().map(ThreadEntity::toModel)
    }

    override fun findById(id: Long): Thread? {
        val threadEntity = threadsTable.findById(id)
        return threadEntity?.toModel()
    }

    override fun save(thread: Thread): Thread {
        val threadEntity = ThreadEntity.fromModel(thread)
        threadsTable.save(threadEntity)
        return threadEntity.toModel()
    }

    override fun update(thread: Thread): Thread {
        val threadEntity = ThreadEntity.fromModel(thread)
        threadsTable.update(threadEntity)
        return threadEntity.toModel()
    }

    override fun deleteById(id: Long) {
        threadsTable.deleteById(id)
    }
}*/
