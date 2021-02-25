package com.example.interview_android.core

import android.app.Application


/**
 * Copyright 2019 (C) Xplo
 *
 * Created  : 5/28/2019
 * Author   : Xplo
 * Version  : 1.0
 * Desc     :
 * Comment  :
 */
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Contextor.getInstance().init(applicationContext)
//        com.xlib.limeutils.core.Contextor.getInstance().init(applicationContext)

//        Log.d("contextor","asdasdasddddddddddddddd")

        //FirebaseApp.initializeApp(this)

    }


}