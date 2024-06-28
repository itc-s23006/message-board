package jp.ac.it_college.std.s23006.messageboard.infrastructure.database.dao

import org.jetbrains.exposed.dao.id.LongIdTable
import org.jetbrains.exposed.sql.kotlin.datetime.datetime

object MessagesTable : LongIdTable("messages") {
    val user = reference("user_id", UsersTable)
    val thread = reference("thread_id", ThreadsTable)
    val message = varchar("message", 255)
    val postedAt = datetime("posted_at")
    val updatedAt = datetime("updated_at")
}