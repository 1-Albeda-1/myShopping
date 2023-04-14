package com.example.myshopping.activities

import android.app.Application
import com.example.myshopping.db.MainDataBase

class MainApp : Application(){
    val database by lazy {MainDataBase.getDataBase(this)}
}