package com.chatzy.app.data.model

data class Chat(
    val id: String,
    val title: String?,
    val avatarUrl: String?,
    val lastMessage: String?,
    val unreadCount: Int = 0
)
