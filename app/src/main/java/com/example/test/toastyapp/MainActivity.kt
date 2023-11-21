package com.example.test.toastyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.toast.ToastClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToastClass.simpleToast(this,"Test My Work Library")
    }
}