package jp.ac.it_college.std.s23006.messageboard.domain.model

data class User(
    val id: Long,
    var viewName: String,
    val email: String,
    var password: String
)