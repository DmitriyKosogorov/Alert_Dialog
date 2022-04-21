package com.example.fragment

import android.content.DialogInterface
import android.util.Log
import android.view.View
import android.widget.Button

class MyListener: DialogInterface.OnClickListener {
    override fun onClick(dialog: DialogInterface?, choice: Int) {
        Log.d("mytag", "Dialog click ${choice}")

    }
}