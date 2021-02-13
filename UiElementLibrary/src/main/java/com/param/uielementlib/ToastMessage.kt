package com.param.uielementlib

import android.content.Context
import android.widget.Toast

class ToastMessage {
    fun small(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}