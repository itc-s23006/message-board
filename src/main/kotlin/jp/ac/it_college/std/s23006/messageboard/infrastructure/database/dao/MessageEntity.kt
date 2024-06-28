package jp.ac.it_college.std.s23006.messageboard.infrastructure.database.dao

import jp.ac.it_college.std.s23006.messageboard.domain.model.Message
import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class MessageEntity(id: EntityID<Long>) : LongEntity(id) {
    private companion object : LongEntityClass<MessageEntity>(MessagesTable)

    var user by UserEntity referencedOn MessagesTable.user
    var thread by ThreadEntity referencedOn MessagesTable.thread
    var message by MessagesTable.message
    var postedAt by MessagesTable.postedAt
    var updatedAt by MessagesTable.updatedAt

    fun toModel() = Message(
        id.value, user.toModel(), thread.toModel(), message
    )

    companion object {
        fun fromModel(model: Message) = MessageEntity(EntityID(model.id, MessagesTable)).apply {
            user = UserEntity[model.userId.id]
            thread = ThreadEntity[model.threadId.id]
            message = model.message
            postedAt = model.postedAt
            updatedAt = model.updatedAt
        }
    }

}