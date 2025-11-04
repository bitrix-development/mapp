package com.chatzy.app.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.chatzy.app.viewmodel.ChatListViewModel

@Composable
fun ChatListScreen(vm: ChatListViewModel, onOpenChat: (String) -> Unit) {
    // Very small example list UI
    val chats = vm.chatsState
    Column(modifier = Modifier.padding(16.dp)) {
        for (c in chats) {
            Text(
                text = c.title ?: "Chat ${c.id}",
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .clickable { onOpenChat(c.id) }
            )
        }
    }
}
