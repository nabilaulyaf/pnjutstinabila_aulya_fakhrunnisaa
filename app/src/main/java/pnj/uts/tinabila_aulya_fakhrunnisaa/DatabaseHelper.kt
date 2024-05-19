package pnj.uts.tinabila_aulya_fakhrunnisaa

import android.content.Context
import androidx.room.Room

object DatabaseHelper {

    private lateinit var appDatabase: AppDatabase

    fun getInstance(context: Context): AppDatabase {
        if (!::appDatabase.isInitialized) {
            appDatabase = Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java, "room_db"
            ).build()
        }
        return appDatabase
    }
}