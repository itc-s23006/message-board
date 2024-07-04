/*
package jp.ac.it_college.std.s23006.messageboard.application.service

import jp.ac.it_college.std.s23006.messageboard.domain.repository.UserRepository
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import jp.ac.it_college.std.s23006.messageboard.presentation.form.LoginRequest
import jp.ac.it_college.std.s23006.messageboard.presentation.form.LoginResponse


@Service
class AuthenticationService(
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder = BCryptPasswordEncoder()
) {

    fun authenticate(request: LoginRequest): LoginResponse {
        val user = userRepository.findByEmail(request.email)
            ?: throw IllegalArgumentException("Invalid email or password")

        if (!passwordEncoder.matches(request.password, user.password)) {
            throw IllegalArgumentException("Invalid email or password")
        }

        return LoginResponse(user.id, user.viewName)
    }

}
*/
