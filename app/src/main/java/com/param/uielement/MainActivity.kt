package com.param.uielement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.param.uielementlib.ToastMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToastMessage().small(this, "Hello Library")
    }
}