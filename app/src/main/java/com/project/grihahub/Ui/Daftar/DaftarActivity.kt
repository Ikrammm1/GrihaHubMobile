package com.project.grihahub.Ui.Daftar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.project.grihahub.MainActivity
import com.project.grihahub.R
import com.project.grihahub.Ui.Dashboard.Dashboard
import com.project.grihahub.Ui.Login.LoginActivity

class DaftarActivity : AppCompatActivity() {

    lateinit var BtnDaftar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        BtnDaftar = findViewById(R.id.btnDaftar)

        BtnDaftar.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
