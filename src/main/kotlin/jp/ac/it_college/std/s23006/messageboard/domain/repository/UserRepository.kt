package jp.ac.it_college.std.s23006.messageboard.domain.repository

import jp.ac.it_college.std.s23006.messageboard.domain.model.User

interface UserRepository {
    fun findById(id: Long): User?
    fun findByEmail(email: String): User?
    fun save(user: User): User
    fun deleteById(id: Long)
}
