package com.project.grihahub.Ui.Layanan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.project.grihahub.Model.ModelLayanan
import com.project.grihahub.R

class CuciKasurActivity : AppCompatActivity() {

    private lateinit var Title : TextView
    private val Judul by lazy { intent.getStringExtra("title") }
    lateinit var BtnLanjut : LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuci_kasur)

        val BtnBack = findViewById<ImageView>(R.id.BtnBack)
        BtnBack.setOnClickListener {
            finish()
        }
        BtnLanjut = findViewById(R.id.BtnSelanjutnya)

        Title = findViewById(R.id.title)

        Title.text = Judul.toString()
    }
}
