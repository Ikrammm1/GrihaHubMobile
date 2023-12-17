package com.project.grihahub.Ui.Layanan.Elektronik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import com.project.grihahub.R
import com.project.grihahub.Ui.Layanan.PilihJenisActivity

class ElektronikActivity : AppCompatActivity() {

    private lateinit var BtnTv : LinearLayout
    private lateinit var BtnWashing : LinearLayout
    private lateinit var BtnAc : LinearLayout
    private lateinit var BtnCctv : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elektronik)

        val BtnBack = findViewById<ImageView>(R.id.BtnBack)
        BtnBack.setOnClickListener {
            finish()
        }

        BtnTv = findViewById(R.id.BtnTv)
        BtnWashing = findViewById(R.id.BtnWashing)
        BtnCctv = findViewById(R.id.BtnCctv)
        BtnAc = findViewById(R.id.BtnAc)

        BtnTv.setOnClickListener {
            startActivity(
                Intent(this, PilihJenisActivity::class.java)
                .putExtra("title", "Televisi" ))
        }
        BtnWashing.setOnClickListener {
            startActivity(
                Intent(this, PilihJenisActivity::class.java)
                .putExtra("title", "Mesin Cuci" ))
        }
        BtnAc.setOnClickListener {
            startActivity(
                Intent(this, PilihJenisActivity::class.java)
                .putExtra("title", "Air Conditioner" ))
        }
        BtnCctv.setOnClickListener {
            startActivity(
                Intent(this, PilihJenisActivity::class.java)
                    .putExtra("title", "CCTV" ))
        }
    }
}
