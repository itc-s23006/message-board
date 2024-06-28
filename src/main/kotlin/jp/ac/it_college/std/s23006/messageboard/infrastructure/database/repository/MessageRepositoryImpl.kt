package jp.ac.it_college.std.s23006.messageboard.infrastructure.database.repository

import jp.ac.it_college.std.s23006.messageboard.domain.model.Message
import jp.ac.it_college.std.s23006.messageboard.domain.repository.MessageRepository
import jp.ac.it_college.std.s23006.messageboard.infrastructure.database.dao.MessageEntity
import jp.ac.it_college.std.s23006.messageboard.infrastructure.database.dao.MessagesTable
import org.jetbrains.exposed.sql.update
import org.springframework.stereotype.Repository

@Repository
class MessageRepositoryImpl(
    private val messagesTable: MessagesTable
) : MessageRepository {

    override fun findByThreadId(threadId: Long): List<Message> {
        return messagesTable.findByThreadId(threadId).map(MessageEntity::toModel)
    }

    override fun save(message: Message): Message {
        val messageEntity = MessageEntity.fromModel(message)
        messagesTable.save(messageEntity)
        return messageEntity.toModel()
    }

    override fun update(message: Message): Message {
        val messageEntity = MessageEntity.fromModel(message)
        messagesTable.update(messageEntity)
        return messageEntity.toModel()
    }

    override fun deleteById(id: Long) {
        messagesTable.deleteById(id)
    }
}