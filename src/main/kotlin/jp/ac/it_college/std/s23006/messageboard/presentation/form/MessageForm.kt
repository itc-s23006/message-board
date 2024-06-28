package jp.ac.it_college.std.s23006.messageboard.presentation.form

import jp.ac.it_college.std.s23006.messageboard.domain.model.Message
import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.Serializable
import org.jetbrains.exposed.sql.Column

@Serializable
data class GetMessageListResponse(
    val threadId: Long,
    val title: String,
    val messages: List<MessageInfo>
)

@Serializable
data class MessageInfo(
    val id: Long,
    val userId: Long?,
    val username: String?,
    val message: String?,
    val postedAt: String,
    val updatedAt: String,
) {
    constructor(model: Message) : this(
        id = model.id,
        userId = if (model.deleted) null else model.userId.id,
        username = if (model.deleted) null else model.userId.viewName,
        message = if (model.deleted) null else model.message,
        postedAt = model.updatedAt,
        updatedAt = model.updatedAt,
    )
}

@Serializable
data class PostMessageRequest(
    val message: String
)

@Serializable
data class PostedMessageResponse(
    val id: Long,
    val threadId: Long,
    val userId: Long,
    val postedAt: LocalDateTime,
) {
    constructor(model: Message) : this(
        id = model.id,
        threadId = model.threadId.id,
        userId = model.userId.id,
        postedAt = model.postedAt
    )
}

@Serializable
data class PutMessageUpdateRequest(
    val message: String,
)

@Serializable
data class MessageUpdateResponse(
    val id: Long,
    val threadId: Long,
    val message: String,
    val updatedAt: Column<LocalDateTime>,
)

@Serializable
data class MessageDeleteResponse(
    val id: Long,
    val threadId: Long,
    val updatedAt: Column<LocalDateTime>,
)