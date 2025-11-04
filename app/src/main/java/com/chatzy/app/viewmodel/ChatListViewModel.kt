package com.chatzy.app.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chatzy.app.data.model.Chat
import com.chatzy.app.data.repository.ChatRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ChatListViewModel @Inject constructor(
    private val repo: ChatRepository
) : ViewModel() {

    var chatsState: List<Chat> = emptyList()
        private set

    init {
        loadChats()
    }

    private fun loadChats() {
        viewModelScope.launch {
            try {
                chatsState = repo.getChats()
            } catch (e: Exception) {
                // handle error
            }
        }
    }
}
