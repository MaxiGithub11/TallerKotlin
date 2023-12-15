package com.ispc.tallerandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private lateinit var tvUser: TextView
    private lateinit var tvPassword: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tvUser = findViewById(R.id.tv_user)
        tvPassword = findViewById(R.id.tv_password)

        val data = intent.extras

        tvUser.text = data?.getString("user")
        tvPassword.text = data?.getString("password")


    }
}