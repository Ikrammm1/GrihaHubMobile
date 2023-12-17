package com.project.grihahub.Ui.Layanan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import com.project.grihahub.R
import com.project.grihahub.Ui.Pembayaran.PembayaranActivity

class PilihTanggal : AppCompatActivity() {

    lateinit var BtnLanjut : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilih_tanggal)

        val BtnBack = findViewById<ImageView>(R.id.BtnBack)
        BtnBack.setOnClickListener {
            finish()
        }

        BtnLanjut = findViewById(R.id.BtnSelanjutnya)

        BtnLanjut.setOnClickListener {
            startActivity(Intent(this, PembayaranActivity::class.java))
        }
    }
}
