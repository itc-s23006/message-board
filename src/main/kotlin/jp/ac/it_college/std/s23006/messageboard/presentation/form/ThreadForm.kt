package jp.ac.it_college.std.s23006.messageboard.presentation.form

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable

@kotlinx.serialization.Serializable
data class GetThreadListResponse(val threadsList: List<ThreadInfo>)

@kotlinx.serialization.Serializable
data class ThreadInfo(
    val id: Long,
    val title: String,
    val createdAt: LocalDateTime
) {
    constructor(model: Thread) : this(model.id, model.title, model.createdAt)
}

@kotlinx.serialization.Serializable
data class PostThreadRequest(
    val title: String,
    val message: String,
)

@kotlinx.serialization.Serializable
data class CreatedThreadResponse(
    val id: Long
)

@kotlinx.serialization.Serializable
data class PutThreadUpdateRequest(
    val title: String,
)

@kotlinx.serialization.Serializable
data class ThreadUpdateResponse(
    val id: Long,
    val title: String,
)

@Serializable
data class ThreadDeleteResponse(
    val id: Long,
    val title: String,
    val updatedAt: LocalDateTime,
)