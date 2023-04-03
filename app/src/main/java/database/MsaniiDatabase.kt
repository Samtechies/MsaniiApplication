package database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import dao.MsaniiDao
import entities.msanii

@Database(entities = [msanii::class], version = 2, exportSchema = false)
abstract class MsaniiDatabase: RoomDatabase() {

    companion object{
        var msaniiDatabase: MsaniiDatabase? =null

        @Synchronized
        fun getDatabase(context: Context): MsaniiDatabase{
            if(msaniiDatabase!=null){
                msaniiDatabase = Room.databaseBuilder(context,MsaniiDatabase::class.java,"msanii.db").build()
            }
            return msaniiDatabase!!
        }
    }
    abstract fun msaniiDao(): MsaniiDao


}