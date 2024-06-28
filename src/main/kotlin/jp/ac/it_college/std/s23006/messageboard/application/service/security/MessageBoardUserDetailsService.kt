package jp.ac.it_college.std.s23006.messageboard.application.service.security

import jp.ac.it_college.std.s23006.messageboard.domain.repository.UserRepository
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class MessageBoardUserDetailsService(
    private val userRepository: UserRepository
) : UserDetailsService {

    override fun loadUserByUsername(username: String): UserDetails {
        val user = userRepository.findByEmail(username) ?: throw UsernameNotFoundException("User not found")

        return MessageBoardUserDetails(user)
    }

    class MessageBoardUserDetails(private val user: jp.ac.it_college.std.s23006.messageboard.domain.model.User) : UserDetails {
        override fun getAuthorities(): Collection<GrantedAuthority> {
            return listOf(SimpleGrantedAuthority("ROLE_USER"))
        }

        override fun getPassword(): String = user.password

        override fun getUsername(): String = user.email

        override fun isAccountNonExpired(): Boolean = true

        override fun isAccountNonLocked(): Boolean = true

        override fun isCredentialsNonExpired(): Boolean = true

        override fun isEnabled(): Boolean = true

        fun getId(): Long = user.id
    }
}
