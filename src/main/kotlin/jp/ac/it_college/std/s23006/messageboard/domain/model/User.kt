package jp.ac.it_college.std.s23006.messageboard.domain.model

data class User(
    val id: Long,
    val viewName: String,
    val email: String,
    val password: String
)


