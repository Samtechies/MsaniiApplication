package entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "msanii")
data class msanii(
    @PrimaryKey(autoGenerate = true)
    var id:Int
) : Serializable