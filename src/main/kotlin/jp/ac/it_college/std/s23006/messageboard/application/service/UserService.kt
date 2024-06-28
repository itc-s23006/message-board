package jp.ac.it_college.std.s23006.messageboard.application.service

import jp.ac.it_college.std.s23006.messageboard.domain.model.User
import jp.ac.it_college.std.s23006.messageboard.domain.repository.UserRepository
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserService(
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder = BCryptPasswordEncoder()
) {

    @Transactional
    fun register(viewName: String, email: String, password: String): User {
        val hashedPassword = passwordEncoder.encode(password)
        val user = User(0, viewName, email, hashedPassword)
        return userRepository.save(user)
    }

    fun find(id: Long): User {
        return userRepository.findById(id) ?: throw IllegalArgumentException("User not found")
    }
}