package com.project.grihahub.Adapter

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.project.grihahub.Model.ModelLayanan
import com.project.grihahub.Model.ModelPesanan
import com.project.grihahub.R
import kotlinx.android.synthetic.main.activity_pilih_jenis.view.*

class AdapterJenis(private val context: Context, private val itemList: List<ModelLayanan>) : RecyclerView.Adapter<AdapterJenis.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtJenis: TextView = itemView.findViewById(R.id.TxtJenis)
        val txtHarga: TextView = itemView.findViewById(R.id.TxtHarga)
        val txtQty: TextView = itemView.findViewById(R.id.TxtQty)
        val gambar: ImageView = itemView.findViewById(R.id.imageJenis)
        val btnPlus : LinearLayout = itemView.findViewById(R.id.plus)
        val btnMinus : LinearLayout = itemView.findViewById(R.id.minus)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_jenis, parent, false)
        val Qty : String
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.txtJenis.text = currentItem.jenis
        holder.txtHarga.text = currentItem.harga
        holder.txtQty.text = currentItem.qty.toString()
        // Dapatkan resource ID dari nama gambar
        val imageResourceId = getImageResourceId(currentItem.gambar)

        // Set gambar menggunakan ID resource
        holder.gambar.setImageResource(imageResourceId)
        Log.d("gambar", currentItem.gambar)
        Log.d("resource", imageResourceId.toString())


        holder.btnMinus.setOnClickListener {
            if (currentItem.qty != 0){
                val newqty = (currentItem.qty - 1)
                holder.txtQty.text = newqty.toString()
            }

        }
        holder.btnPlus.setOnClickListener {
            val newqty = (currentItem.qty + 1)
            holder.txtQty.text = newqty.toString()
        }

    }

    override fun getItemCount(): Int {
        return itemList.size
    }
    private fun getImageResourceId(imageName: String): Int {
        return context.resources.getIdentifier(imageName, "drawable", context.packageName)
    }
}