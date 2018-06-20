package com.behaviordemo.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewCompat
import android.view.View

class MainActivity : AppCompatActivity() {
    var size=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getNestedScrollView(v: View){
        ViewCompat.offsetTopAndBottom(v,5)
    }
}
