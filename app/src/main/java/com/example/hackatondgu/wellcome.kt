package com.example.hackatondgu

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.hackatondgu.data.CONST_PASS
import com.example.hackatondgu.data.pref
import com.example.hackatondgu.databinding.ActivityWellcomeBinding

class wellcome : AppCompatActivity() {
    private lateinit var bindingClass: ActivityWellcomeBinding

    @SuppressLint("CommitPrefEdits")
    override fun onCreate(savedInstanceState: Bundle?)  {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityWellcomeBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)


        pref = getSharedPreferences(CONST_PASS.TABLE_PASS, Context.MODE_PRIVATE)
        val n = pref.getInt(CONST_PASS.WAS_OPEN, -1)
        Log.d("wellcome", n.toString())
        if (pref.getInt(CONST_PASS.WAS_OPEN, -1) == 1) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val editor = pref.edit()
        editor?.putInt(CONST_PASS.WAS_OPEN, 1)
        editor?.apply()


        bindingClass.nextBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}