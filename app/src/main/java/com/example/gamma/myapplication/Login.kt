package com.example.gamma.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun sendUser(view: View) {
        val editUser = findViewById<EditText>(R.id.Email_input)
        val User = editUser.text.toString()
        val editPass = findViewById<EditText>(R.id.Pass_input)
        val Pass = editPass.text.toString()

        if ('@' in User){
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("email", User)
            }
            startActivity(intent)
        }
        else{
            Toast.makeText(this, "Invalid Mail", Toast.LENGTH_SHORT).show()
        }
    }
}