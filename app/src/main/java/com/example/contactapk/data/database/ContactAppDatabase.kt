package com.example.contactapk.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.contactapk.data.tables.Contact
import com.example.contactapk.data.tables.ContactDao

@Database(entities = arrayOf(Contact::class), version = 1, exportSchema = false)
abstract class ContactAppDatabase : RoomDatabase (){

    abstract fun getContactDao(): ContactDao

}