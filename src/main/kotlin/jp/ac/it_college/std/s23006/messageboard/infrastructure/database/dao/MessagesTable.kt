package jp.ac.it_college.std.s23006.messageboard.infrastructure.database.dao

import org.jetbrains.exposed.dao.id.LongIdTable
import org.jetbrains.exposed.sql.kotlin.datetime.datetime

object MessagesTable : LongIdTable("messages") {
    val user = reference("user", MessagesTable)
    val thread = reference("thread", MessagesTable)
    val message = varchar("message", 255)
    val postedAt = datetime("posted_at")
    val updatedAt = datetime("updated_at")
}