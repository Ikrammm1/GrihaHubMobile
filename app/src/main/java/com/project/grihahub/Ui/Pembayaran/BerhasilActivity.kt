package com.project.grihahub.Ui.Pembayaran

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.project.grihahub.R
import com.project.grihahub.Ui.Dashboard.Dashboard
import com.project.grihahub.Ui.Fragment.Pesanan.PesananFragment


class BerhasilActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berhasil)

        val BtnPesanan = findViewById<LinearLayout>(R.id.BtnPesanan)
        BtnPesanan.setOnClickListener {
            startActivity(Intent(this, Dashboard::class.java))
        }
    }
}
