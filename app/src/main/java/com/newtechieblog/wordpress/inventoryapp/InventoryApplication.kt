package com.newtechieblog.wordpress.inventoryapp

import android.app.Application
import com.newtechieblog.wordpress.inventoryapp.data.ItemRoomDatabase

class InventoryApplication : Application() {
    val database: ItemRoomDatabase by lazy { ItemRoomDatabase.getDatabase(this) }
}