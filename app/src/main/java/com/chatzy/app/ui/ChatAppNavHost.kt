package com.chatzy.app.ui

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.navArgument
import com.chatzy.app.ui.screens.ChatListScreen
import com.chatzy.app.ui.screens.ChatScreen
import com.chatzy.app.viewmodel.ChatListViewModel

@Composable
fun ChatAppNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "chats") {
        composable("chats") {
            val vm = hiltViewModel<ChatListViewModel>()
            ChatListScreen(vm) { chatId ->
                navController.navigate("chat/$chatId")
            }
        }
        composable(
            "chat/{chatId}",
            arguments = listOf(navArgument("chatId") { type = NavType.StringType })
        ) { backStackEntry ->
            val chatId = backStackEntry.arguments?.getString("chatId") ?: return@composable
            ChatScreen(chatId = chatId)
        }
    }
}
