/*
package jp.ac.it_college.std.s23006.messageboard.infrastructure.database.repository

import jp.ac.it_college.std.s23006.messageboard.domain.model.Message
import jp.ac.it_college.std.s23006.messageboard.domain.repository.MessageRepository
import jp.ac.it_college.std.s23006.messageboard.infrastructure.database.dao.MessageEntity
import jp.ac.it_college.std.s23006.messageboard.infrastructure.database.dao.MessagesTable
import org.jetbrains.exposed.sql.transactions.transaction
import org.jetbrains.exposed.sql.*
import org.springframework.stereotype.Repository

@Repository
class MessageRepositoryImpl : MessageRepository {
    override fun findAll(): List<Message> {
        return transaction {
            MessageEntity.all().map(::toModel)
        }
    }

    override fun findById(id: Long): Message? {
        return transaction {
            MessageEntity.findById(id)?.let(::toModel)
        }
    }

    override fun findByThreadId(threadId: Long): List<Message> {
        return transaction {
            MessageEntity.find { MessagesTable.threadId eq threadId }
                .map(::toModel)
        }
    }

    override fun save(message: Message): Message {
        return transaction {
            val entity = MessageEntity.new {
                this.message = message.message
                this.threadId = message.threadId
            }
            toModel(entity)
        }
    }

    override fun update(message: Message): Message {
        return transaction {
            val entity = MessageEntity.findById(message.id)
                ?: throw IllegalArgumentException("Message not found")
            entity.message = message.message
            toModel(entity)
        }
    }

    override fun deleteById(id: Long) {
        transaction {
            val entity = MessageEntity.findById(id)
                ?: throw IllegalArgumentException("Message not found")
            entity.delete()
        }
    }

    private fun toModel(entity: MessageEntity): Message {
        return Message(
            id = entity.id.value,
            message = entity.message,
            threadId = entity.threadId
        )
    }
}
*/
