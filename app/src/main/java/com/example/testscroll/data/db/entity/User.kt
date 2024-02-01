package com.example.testscroll.data.db.entity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "users")
@Parcelize
data class User(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var profileImage: String,
    var userName: String,
    var email: String,
    var name: String
): Parcelable
