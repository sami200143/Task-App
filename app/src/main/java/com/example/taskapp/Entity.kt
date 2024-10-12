package com.example.taskapp

import android.icu.text.CaseMap.Title
import android.security.identity.AccessControlProfileId
import androidx.activity.result.contract.ActivityResultContracts
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "alltasks")
data class Entity(
    @PrimaryKey(autoGenerate = true)
    var  id:Int,
    var title: String,
    var content: String
)
