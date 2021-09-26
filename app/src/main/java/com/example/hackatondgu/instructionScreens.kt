package com.example.hackatondgu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.hackatondgu.databinding.ActivityInstructionScreensBinding
import com.example.hackatondgu.databinding.ActivityWellcomeBinding
import com.example.hackatondgu.wellcomeScreens.registerScreen
import com.example.hackatondgu.wellcomeScreens.singInScreen

class instructionScreens : AppCompatActivity() {

    private lateinit var bindingClass: ActivityInstructionScreensBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityInstructionScreensBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)



        supportFragmentManager.beginTransaction()
            .replace(R.id.placeHolder, registerScreen.newInstance()).commit()

        bindingClass.accExist.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.placeHolder, singInScreen.newInstance()).commit()

            bindingClass.accExist.visibility = View.GONE
            bindingClass.accExist2.visibility = View.VISIBLE
        }

    }
}