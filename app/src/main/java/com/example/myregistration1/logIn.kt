package com.example.myregistration1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class logIn : AppCompatActivity() {
    lateinit var btnBack:Button
    lateinit var etEmail2:EditText
    lateinit var etPassword2:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
    }
    fun castViews2(){
        btnBack=findViewById(R.id.btnBack)
        etEmail2=findViewById(R.id.etEmail2)
        etPassword2=findViewById(R.id.etPassword2)
    }
    fun onClick(){
        btnBack.setOnClickListener {
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)

        }
    }
}