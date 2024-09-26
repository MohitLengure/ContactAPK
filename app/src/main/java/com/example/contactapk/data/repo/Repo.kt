package com.example.contactapk.data.repo

import com.example.contactapk.data.tables.Contact
import com.example.contactapk.data.database.ContactAppDatabase
import kotlinx.coroutines.flow.Flow

class Repo(val database: ContactAppDatabase) {

    suspend fun upsertContact(contact: Contact){
        database.getContactDao().upsertContact(contact)
    }
    suspend fun deleteContact(contact: Contact){
        database.getContactDao().deleteContact(contact)
    }
    fun getAllContact(): Flow<List<Contact>> {
        return database.getContactDao().getAllContact()

    }
}