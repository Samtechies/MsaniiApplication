package dao

import android.provider.MediaStore.Audio.Artists
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import entities.msanii


@Dao

interface MsaniiDao {

    @Query("SELECT * FROM msanii ORDER BY id DESC")
    fun getAllArtists() : LiveData<List<Artists>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMsanii(msanii: msanii)
}