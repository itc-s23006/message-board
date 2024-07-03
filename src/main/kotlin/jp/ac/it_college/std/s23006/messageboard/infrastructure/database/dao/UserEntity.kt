package jp.ac.it_college.std.s23006.messageboard.infrastructure.database.dao

import org.jetbrains.exposed.dao.LongEntity
import org.jetbrains.exposed.dao.LongEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class UserEntity(id: EntityID<Long>) : LongEntity(id) {
    companion object : LongEntityClass<UserEntity>(UsersTable)

    var viewName by UsersTable.viewName
    var email by UsersTable.email
    var password by UsersTable.password
}