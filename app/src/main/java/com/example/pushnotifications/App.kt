package com.example.pushnotifications

import android.app.Application
import android.content.ContentValues.TAG
import android.util.Log
import android.util.Log.d
import android.widget.Toast
import com.example.pushnotifications.R
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.messaging.FirebaseMessaging

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
            if (!task.isSuccessful) {
                d( "firebase messinging","Fetching FCM registration token failed", task.exception)
                return@OnCompleteListener
            }

            // Get new FCM registration token
            val token = task.result

            // Log and toast
            d("firebase Mess", token)
        })



    }
}