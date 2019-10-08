package com.example.notepad

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import kotlinx.android.parcel.Parcelize
import java.util.*

@Entity(tableName = "note_table")
@TypeConverters(Converters::class)
@Parcelize
data class Note (


    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "date")
    var lastUpdated: Date,

    @ColumnInfo(name = "text")
    var text: String,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null

) : Parcelable