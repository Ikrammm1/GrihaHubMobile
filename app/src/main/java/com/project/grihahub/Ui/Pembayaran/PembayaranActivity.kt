package com.project.grihahub.Ui.Pembayaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.project.grihahub.R

class PembayaranActivity : AppCompatActivity() {

    lateinit var BtnBayar : LinearLayout
    lateinit var TxtTotal : TextView
    private val Total by lazy { intent.getStringExtra("Total") }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran)

        val BtnBack = findViewById<ImageView>(R.id.BtnBack)
        BtnBack.setOnClickListener {
            finish()
        }

        BtnBayar = findViewById(R.id.BtnBayar)
        TxtTotal = findViewById(R.id.TxtTotal)
        TxtTotal.text = "Rp.${Total.toString()}"

        BtnBayar.setOnClickListener {
            startActivity(Intent(this, BerhasilActivity::class.java))
        }

    }
}
