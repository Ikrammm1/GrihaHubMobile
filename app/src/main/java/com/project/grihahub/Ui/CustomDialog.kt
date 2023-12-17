package com.project.grihahub.Ui

import android.app.Dialog
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import com.project.grihahub.R
import com.project.grihahub.Ui.Login.LoginActivity

class CustomDialog(context: Context) : Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.custom_dialog)

        val titleTextView: TextView = findViewById(R.id.Title)
        val YaButton: Button = findViewById(R.id.BtnYa)
        val NoButton: Button = findViewById(R.id.BtnTidak)

        // Sesuaikan judul dialog dan teks tombol sesuai kebutuhan
        titleTextView.text = "Yakin untuk keluar?"

        YaButton.setOnClickListener {
            val intent = Intent(context.applicationContext, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

            // Pastikan untuk memanggil context yang sesuai untuk memulai activity
            context.startActivity(intent)
            dismiss()
        }
        NoButton.setOnClickListener {
            dismiss()
        }
    }



}
