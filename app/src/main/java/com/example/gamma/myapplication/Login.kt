package com.example.gamma.myapplication

import android.app.Activity
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
            val result = Intent(this, MainActivity::class.java)
            result.putExtra("User", User)
            result.putExtra("Pass", Pass)
            setResult(Activity.RESULT_OK,result)
            finish()
        }
        else{
            if((User == null) or (Pass == null)){
                Toast.makeText(this, "Empty elements", Toast.LENGTH_SHORT).show()
            }
            else if((User != null))
            else{
                Toast.makeText(this, "Invalid Mail", Toast.LENGTH_SHORT).show()
            }
        }
    }
}