package jp.ac.it_college.std.s23006.messageboard.infrastructure.database.repository

import jp.ac.it_college.std.s23006.messageboard.domain.model.User
import jp.ac.it_college.std.s23006.messageboard.domain.repository.UserRepository
import jp.ac.it_college.std.s23006.messageboard.infrastructure.database.dao.UserEntity
import jp.ac.it_college.std.s23006.messageboard.infrastructure.database.dao.UsersTable
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImpl(
    private val usersTable: UsersTable
) : UserRepository {

    override fun findByEmail(email: String): User? {
        val userEntity = usersTable.findByEmail(email)
        return userEntity?.toModel()
    }

    override fun save(user: User): User {
        val userEntity = UserEntity.fromModel(user)
        usersTable.save(userEntity)
        return userEntity.toModel()
    }
}