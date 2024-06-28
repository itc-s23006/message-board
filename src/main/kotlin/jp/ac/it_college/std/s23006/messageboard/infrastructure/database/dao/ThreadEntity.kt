package jp.ac.it_college.std.s23006.messageboard.infrastructure.database.dao

import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import jp.ac.it_college.std.s23006.messageboard.domain.model.Thread
import kotlinx.datetime.LocalDateTime

class ThreadEntity(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<ThreadEntity>(ThreadsTable)

    var title by ThreadsTable.title
    var createdAt by ThreadsTable.createdAt

    fun toModel() = Thread(id.value, title, createdAt)

    companion object {
        fun fromModel(model: Thread) = ThreadEntity(EntityID(model.id, ThreadsTable)).apply {
            title = model.title
            createdAt = model.createdAt
        }
    }
}