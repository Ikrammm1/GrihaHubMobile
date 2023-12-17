package com.project.grihahub.Ui.Fragment.Pesanan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.grihahub.Adapter.AdapterPesanan
import com.project.grihahub.Model.ModelPesanan

import com.project.grihahub.R


class PesananFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pesanan, container, false)

        val recyclerView: RecyclerView = view.findViewById(R.id.list_pesanan)
        recyclerView.layoutManager = LinearLayoutManager(context)

        val itemList = listOf(
            ModelPesanan("Item 1", "Description 1"),
            ModelPesanan("Item 2", "Description 2"),
            ModelPesanan("Item 3", "Description 3"),
            ModelPesanan("Item 4", "Description 4"),
            ModelPesanan("Item 5", "Description 5")
        )

        val adapter = AdapterPesanan(itemList)
        recyclerView.adapter = adapter

        return view
    }
}
