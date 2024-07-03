package jp.ac.it_college.std.s23006.messageboard.infrastructure.database.dao

import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class ThreadEntity(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<ThreadEntity>(ThreadsTable)

    var title by ThreadEntity referencedOn ThreadsTable.title
    var createdAt by ThreadsTable.createdAt
    var updatedAt by ThreadsTable.updatedAt

}