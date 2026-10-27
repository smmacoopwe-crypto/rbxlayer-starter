package com.example.rbxlayer

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    // These two functions are written in C++ (see native-lib.cpp).
    external fun stringFromJNI(): String
    external fun add(a: Int, b: Int): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val tv = TextView(this)
        tv.textSize = 20f
        tv.setPadding(48, 96, 48, 48)
        tv.text = stringFromJNI() + "\n\n2 + 3 = " + add(2, 3)
        setContentView(tv)
    }

    companion object {
        init {
            // Loads librbxlayer.so, which CMake builds from the C++ files
            System.loadLibrary("rbxlayer")
        }
    }
}
