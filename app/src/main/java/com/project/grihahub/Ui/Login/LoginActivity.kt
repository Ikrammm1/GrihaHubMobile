package com.project.grihahub.Ui.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.project.grihahub.R
import com.project.grihahub.Ui.Dashboard.Dashboard

class LoginActivity : AppCompatActivity() {

    lateinit var BtnMasuk : Button
    lateinit var Email : EditText
    lateinit var Pass : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Email = findViewById(R.id.EdEmail)
        Pass = findViewById(R.id.EdPassword)
        BtnMasuk = findViewById(R.id.btnMasuk)

        BtnMasuk.setOnClickListener {
            when{
                Email.text.toString() == "" ->{
                    Email.error = "Email Tidak Boleh Kosong!"
                }
                Pass.text.toString() == "" -> {
                    Pass.error = "Password Tidak Boleh Kosong!"
                }
                else -> {
                    startActivity(Intent(this, Dashboard::class.java))
                }
            }

        }
    }
}
