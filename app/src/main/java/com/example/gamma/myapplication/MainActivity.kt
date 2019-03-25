package com.example.gamma.myapplication

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


const val get_log_request = 1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this, Login::class.java)
        startActivityForResult(intent, get_log_request)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == get_log_request){
            if(resultCode == Activity.RESULT_OK){
                val UserText: TextView = findViewById(R.id.Email)
            }
        }
    }

    private fun Logout() {
        val intent = Intent(this, Login::class.java)
        startActivityForResult(intent, get_log_request)
    }
}






