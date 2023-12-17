package com.project.grihahub.Ui.Layanan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Spinner
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.grihahub.Adapter.AdapterJenis
import com.project.grihahub.Adapter.AdapterPesanan
import com.project.grihahub.Adapter.CustomSpinnerAdapter
import com.project.grihahub.Model.ModelLayanan
import com.project.grihahub.Model.ModelPesanan
import com.project.grihahub.R
import java.lang.reflect.Array

class PilihJenisActivity : AppCompatActivity() {

    private lateinit var Title : TextView
    private val Judul by lazy { intent.getStringExtra("title") }
    lateinit var ItemList : List<ModelLayanan>
    lateinit var BtnLanjut : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilih_jenis)

        val BtnBack = findViewById<ImageView>(R.id.BtnBack)
        BtnBack.setOnClickListener {
            finish()
        }
        BtnLanjut = findViewById(R.id.BtnSelanjutnya)

        Title = findViewById(R.id.title)

        Title.text = Judul.toString()

        val recyclerView: RecyclerView = findViewById(R.id.list_jenis)
        recyclerView.layoutManager = LinearLayoutManager(this)

        if (Judul == "Daily Cleaning"){

            ItemList = listOf(
                ModelLayanan("Sapu", "150000", 0,"sapu"),
                ModelLayanan("Sapu + Pel", "200000", 0,"sapupel")
            )

        }else if (Judul == "Cuci Sofa"){
            ItemList = listOf(
                ModelLayanan("Deep Clean Sofa  kecil" ,"150000", 0, "sofa2"),
                ModelLayanan("Deep Clean Sofa besar", "200000", 0,"sofa2")
            )
        }else if (Judul == "Cuci Karpet"){
            ItemList = listOf(
                ModelLayanan("Karpet Kecil" ,"150000", 0,"karpet"),
                ModelLayanan("karpet Besar", "200000", 0,"karpet")
            )
        }else if (Judul == "Televisi"){
            ItemList = listOf(
                ModelLayanan("Service" ,"150000", 0,"tv2")
            )
        }else if (Judul == "Mesin Cuci"){
            ItemList = listOf(
                ModelLayanan("Service" ,"150000", 0,"washing2")
            )
        }else if (Judul == "Air Conditioner"){
            ItemList = listOf(
                ModelLayanan("Cuci AC" ,"150000", 0,"ac2"),
                ModelLayanan("Service", "200000", 0,"ac2")
            )
        }else if (Judul == "CCTV"){
            ItemList = listOf(
                ModelLayanan("Service" ,"150000", 0,"cctv2")
            )
        }else if (Judul == "Perbaikan Mesin"){
            ItemList = listOf(
                ModelLayanan("Service" ,"150000", 0,"kunci2")
            )
        }else if (Judul == "Service Ban"){
            ItemList = listOf(
                ModelLayanan("Service ban" ,"150000", 0,"ban2")
            )
        }else if (Judul == "Cuci Motor & Mobil"){
            ItemList = listOf(
                ModelLayanan("Cuci Mobil" ,"50000", 0,"mobil2"),
                ModelLayanan("Cuci Motor", "25000", 0,"motor2")
            )
        }else if (Judul == "Service Rem"){
            ItemList = listOf(
                ModelLayanan("Service" ,"150000", 0,"rem2")
            )
        }

        val adapter = AdapterJenis(this, ItemList)
        recyclerView.adapter = adapter


        val spinner: Spinner = findViewById(R.id.SpinJam)

        // Daftar item untuk ditampilkan dalam Spinner
        val items = resources.getStringArray(R.array.Jam).toList()

        // Gunakan adapter kustom untuk Spinner
        val AdapterSpinner = CustomSpinnerAdapter(this, R.layout.custom_spinner_adapter, items)
        spinner.adapter = AdapterSpinner

        BtnLanjut.setOnClickListener {
            startActivity(Intent(this, PilihTanggal::class.java))
        }

    }
}
