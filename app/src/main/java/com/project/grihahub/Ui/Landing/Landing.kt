package com.project.grihahub.Ui.Landing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.project.grihahub.R
import com.project.grihahub.Ui.Daftar.DaftarActivity
import com.project.grihahub.Ui.Login.LoginActivity

class Landing : AppCompatActivity() {

    lateinit var BtnMasuk : Button
    lateinit var BtnDaftar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)

        BtnDaftar = findViewById(R.id.btnDaftar)
        BtnMasuk = findViewById(R.id.btnMasuk)

        BtnDaftar.setOnClickListener {
            startActivity(Intent(this, DaftarActivity::class.java))
        }
        BtnMasuk.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
