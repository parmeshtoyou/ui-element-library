package com.param.uielementlib

import android.content.Context
import android.widget.Toast

object ToastMessage {
    fun s(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}