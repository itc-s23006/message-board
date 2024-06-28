package jp.ac.it_college.std.s23006.messageboard.presentation.form

import kotlinx.serialization.Serializable

@Serializable
data class LoginResponse(
    val userId: Long,
    val viewName: String,
)
