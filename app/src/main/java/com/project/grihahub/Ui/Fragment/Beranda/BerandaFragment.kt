package com.project.grihahub.Ui.Fragment.Beranda

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import com.project.grihahub.R
import com.project.grihahub.Ui.Layanan.Elektronik.ElektronikActivity
import com.project.grihahub.Ui.Layanan.Kebersihan.KebersihanActivity
import com.project.grihahub.Ui.Layanan.Kendaraan.KendaraanActivity

class BerandaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_beranda, container, false)

        val LihatKebersihan: Button = view.findViewById(R.id.lihatKebersihan)
        val LihatElektronik: Button = view.findViewById(R.id.lihatElektronik)
        val LihatKendaraan: Button = view.findViewById(R.id.lihatKendaraan)


        LihatKebersihan.setOnClickListener {
            val intent = Intent(activity, KebersihanActivity::class.java)
            startActivity(intent)
        }
        LihatElektronik.setOnClickListener {
            val intent = Intent(activity, ElektronikActivity::class.java)
            startActivity(intent)
        }
        LihatKendaraan.setOnClickListener {
            val intent = Intent(activity, KendaraanActivity::class.java)
            startActivity(intent)
        }


        return view
    }

    private fun navigateToAnotherActivity() {
        // Buat Intent untuk perpindahan ke Activity tujuan
        val intent = Intent(activity, KebersihanActivity::class.java)
        startActivity(intent)
    }
}
