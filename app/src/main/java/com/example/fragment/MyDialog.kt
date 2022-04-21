package com.example.fragment

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.DialogFragment
import java.util.*
import android.widget.Toast

class MyDialog: DialogFragment(){
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            AlertDialog.Builder(it)
                .setMessage("Сменить дизайн?")
                .setPositiveButton("Да", activity as DialogInterface.OnClickListener)
                .setNegativeButton("Нет", activity as DialogInterface.OnClickListener)
                .create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}