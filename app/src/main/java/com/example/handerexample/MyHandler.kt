package com.example.handerexample

import android.os.Handler
import android.os.HandlerThread
import android.os.Looper
import android.os.Message

public class MyHandler: HandlerThread(MyHandler::class.java.simpleName) {
    var handler: Handler? = null

    override fun onLooperPrepared() {
        super.onLooperPrepared()
        handler= Handler(Looper.getMainLooper()) {
            println("Message received" + it.obj)
            true
        }
    }
}