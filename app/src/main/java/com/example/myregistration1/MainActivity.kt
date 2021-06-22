package com.example.myregistration1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var etname1:EditText
    lateinit var etEmail:EditText
    lateinit var etPhone:EditText
    lateinit var etPassword:EditText
    lateinit var spnGender:Spinner
    lateinit var btnLogin:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        onClick()
    }
    fun castViews(){
        etname1=findViewById(R.id.etname1)
        etEmail=findViewById(R.id.etEmail)
        etPhone=findViewById(R.id.etPhone)
        etPassword=findViewById(R.id.etPassword)
        btnLogin=findViewById(R.id.btnLogin)
        spnGender =findViewById(R.id.spnGender)

        var gender=arrayOf("FEMALE","MALE")
        var genderAdapter=ArrayAdapter(baseContext,android.R.layout.simple_spinner_item,gender)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spnGender.adapter=genderAdapter
    }
    fun onClick(){
        btnLogin.setOnClickListener {
            var name=etname1.text.toString()
             if (name.isEmpty()){
              etname1.setError("This field is requires!")
             }
            var email=etEmail.text.toString()
            var phone=etPhone.text.toString()
            var password=etPassword.text.toString()
            var gender=spnGender.selectedItem.toString()
            var User=User(name,email,phone,password,gender)
            Toast.makeText(baseContext,User.toString(),Toast.LENGTH_LONG).show()
            var intent=Intent(baseContext,logIn::class.java)
            startActivity(intent)

        }

    }
}
data class User(var name:String,var email:String,var phone:String,var password:String,var gender:String)