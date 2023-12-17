package com.project.grihahub.Ui.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.project.grihahub.R
import com.project.grihahub.Ui.Dashboard.Dashboard

class LoginActivity : AppCompatActivity() {

    lateinit var BtnMasuk : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        BtnMasuk = findViewById(R.id.btnMasuk)

        BtnMasuk.setOnClickListener {
            startActivity(Intent(this, Dashboard::class.java))
        }
    }
}
