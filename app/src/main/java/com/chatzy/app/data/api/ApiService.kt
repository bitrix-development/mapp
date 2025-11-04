package com.chatzy.app.data.api

import com.chatzy.app.data.model.Chat
import com.chatzy.app.data.model.Message
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("chats")
    suspend fun getChats(): List<Chat>

    @GET("chats/{id}/messages")
    suspend fun getMessages(@Path("id") chatId: String): List<Message>

    // TODO: добавить другие эндпоинты (auth, upload, devices -> FCM)
}
