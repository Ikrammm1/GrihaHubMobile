package com.project.grihahub.Ui.Layanan.Kendaraan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import com.project.grihahub.R
import com.project.grihahub.Ui.Layanan.PilihJenisActivity

class KendaraanActivity : AppCompatActivity() {

    private lateinit var BtnMesin : LinearLayout
    private lateinit var BtnCuciMotor: LinearLayout
    private lateinit var BtnBan : LinearLayout
    private lateinit var BtnRem : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kendaraan)

        val BtnBack = findViewById<ImageView>(R.id.BtnBack)
        BtnBack.setOnClickListener {
            finish()
        }

        BtnMesin = findViewById(R.id.BtnMesin)
        BtnCuciMotor = findViewById(R.id.BtnCuciMotor)
        BtnBan = findViewById(R.id.BtnBan)
        BtnRem = findViewById(R.id.BtnRem)

        BtnMesin.setOnClickListener {
            startActivity(
                Intent(this, PilihJenisActivity::class.java)
                .putExtra("title", "Perbaikan Mesin" ))
        }
        BtnCuciMotor.setOnClickListener {
            startActivity(
                Intent(this, PilihJenisActivity::class.java)
                .putExtra("title", "Cuci Motor & Mobil" ))
        }
        BtnBan.setOnClickListener {
            startActivity(
                Intent(this, PilihJenisActivity::class.java)
                .putExtra("title", "Service Ban" ))
        }
        BtnRem.setOnClickListener {
            startActivity(
                Intent(this, PilihJenisActivity::class.java)
                    .putExtra("title", "Service Rem" ))
        }

    }
}
