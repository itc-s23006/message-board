package jp.ac.it_college.std.s23006.messageboard.exception

open class ApplicationException(message: String) : RuntimeException(message)

class UserNotFoundException(userId: Long) : ApplicationException("User with ID $userId not found")

class ThreadNotFoundException(threadId: Long) : ApplicationException("Thread with ID $threadId not found")

class MessageNotFoundException(messageId: Long) : ApplicationException("Message with ID $messageId not found")

class DuplicateEmailException(email: String) : ApplicationException("Email $email is already registered")

class UnauthorizedActionException(action: String) : ApplicationException("Unauthorized action: $action")