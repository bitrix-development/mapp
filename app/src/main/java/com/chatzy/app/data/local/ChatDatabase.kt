package com.chatzy.app.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.chatzy.app.data.local.dao.MessageDao
import com.chatzy.app.data.model.Message

@Database(entities = [Message::class], version = 1, exportSchema = false)
abstract class ChatDatabase : RoomDatabase() {
    abstract fun messageDao(): MessageDao
}
