package com.ispc.tallerandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var etUser: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etUser = findViewById(R.id.et_user)
        etPassword = findViewById(R.id.et_password)
        btnLogin = findViewById(R.id.btn_login)

        btnLogin.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            intent.putExtra("user", etUser.text.toString())
            intent.putExtra("password", etPassword.text.toString())

            startActivity(intent)
        }
    }
}