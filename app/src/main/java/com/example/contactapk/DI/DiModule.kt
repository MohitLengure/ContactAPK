package com.example.contactapk.DI

import android.app.Application
import androidx.room.Room
import com.example.contactapk.DATABASE_NAME
import com.example.contactapk.data.database.ContactAppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DiModule {

    @Provides
    @Singleton
    fun provideContactDatabase(application: Application): ContactAppDatabase {
        return Room.
        databaseBuilder(application,
            ContactAppDatabase::class.java,
            DATABASE_NAME).build()
    }


}
