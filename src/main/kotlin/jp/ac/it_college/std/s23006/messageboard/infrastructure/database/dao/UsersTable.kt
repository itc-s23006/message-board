package jp.ac.it_college.std.s23006.messageboard.infrastructure.database.dao

import org.jetbrains.exposed.dao.id.LongIdTable

object UsersTable : LongIdTable("users") {

    val viewName = varchar("view_name", 255)
    val email = varchar("email", 255)
    val password = varchar("password", 255)
}