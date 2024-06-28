package jp.ac.it_college.std.s23006.messageboard.infrastructure.database.dao

import org.jetbrains.exposed.sql.Table

object UsersTable : Table("users") {
    val id = long("id").autoIncrement().primaryKey()
    val viewName = varchar("view_name", 255)
    val email = varchar("email", 255).uniqueIndex()
    val password = varchar("password", 255)
}