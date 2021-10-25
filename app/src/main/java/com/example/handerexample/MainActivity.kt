package com.example.handerexample

import android.os.Bundle
import android.os.Message
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
   private val handlerThread = MyHandler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handlerThread.start()
    }

    public fun sendMessage(view: View){
        val msg: Message = Message.obtain(handlerThread.handler)
        msg.obj = "Simple Object"
        msg.sendToTarget()
    }

    override fun onDestroy() {
        handlerThread.quit()
        super.onDestroy()
    }
}