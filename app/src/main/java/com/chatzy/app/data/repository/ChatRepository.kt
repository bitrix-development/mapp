package com.chatzy.app.data.repository

import com.chatzy.app.data.api.ApiService
import com.chatzy.app.data.local.ChatDatabase
import com.chatzy.app.data.model.Chat
import com.chatzy.app.data.model.Message
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ChatRepository @Inject constructor(
    private val api: ApiService,
    private val db: ChatDatabase
) {
    suspend fun getChats(): List<Chat> = api.getChats()
    suspend fun getMessages(chatId: String): List<Message> {
        val remote = api.getMessages(chatId)
        db.messageDao().insertAll(remote)
        return db.messageDao().getMessages(chatId)
    }
    // TODO: add sendMessage, file upload, websocket handling
}
