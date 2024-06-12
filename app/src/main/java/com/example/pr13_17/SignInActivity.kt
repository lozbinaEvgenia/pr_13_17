package com.example.pr13_17

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class SignInActivity : AppCompatActivity() {
    lateinit var email:EditText
    lateinit var password:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        email=findViewById(R.id.email)
        password=findViewById(R.id.password)
    }

    fun signin(view: View) {
        if(email.text.toString().isNotEmpty()&&password.text.toString().isNotEmpty()){

        }
        else{
            val alert= AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас есть незаполненные поля")
                .setPositiveButton("Ok",null)
                .create()
                .show()
        }
    }

}