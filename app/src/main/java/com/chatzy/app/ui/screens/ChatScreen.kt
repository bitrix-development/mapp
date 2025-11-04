package com.chatzy.app.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ChatScreen(chatId: String) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Chat screen: $chatId")
        // TODO: messages list, composer, attachments, send button
    }
}
