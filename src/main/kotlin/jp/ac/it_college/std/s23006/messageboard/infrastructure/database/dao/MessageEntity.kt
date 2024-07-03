package jp.ac.it_college.std.s23006.messageboard.infrastructure.database.dao

import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class MessageEntity(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<MessageEntity>(MessagesTable)

    var user by MessagesTable.user
    var thread by MessagesTable.thread
    var message by MessagesTable.message
    var postedAt by MessagesTable.postedAt
    var updatedAt by MessagesTable.updatedAt
    override fun toString() = """
        MessageEntity(user=$user, thread=$thread, message=$message, postedAt=$postedAt, updatedAt=$updatedAt)
    """.trimIndent()
    }