package com.example.test.toast

import android.content.Context
import android.widget.Toast

object ToastClass {
    fun simpleToast(context: Context, toast:String){
        Toast.makeText(context, toast, Toast.LENGTH_SHORT).show()
    }

}