package com.uty.listviewicon_109

import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.uty.listviewicon_109.R
import com.uty.listviewicon_109.Model.Bahasa

class ListBahasaAdapter(private val listBahasa: ArrayList<Bahasa>) : RecyclerView.Adapter<ListBahasaAdapter.BahasaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListBahasaAdapter.BahasaViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_bahasa, parent, false)
        return BahasaViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBahasa.size
    }

    override fun onBindViewHolder(holder: BahasaViewHolder, position: Int) {
        val bhs = listBahasa[position]
        holder.tvBahasa.text = bhs.bahasa
        holder.tvDetail.text = bhs.detail
        Glide.with(holder.itemView.context)
            .load(bhs.logo)
            .into(holder.logoBahasa)
    }

    inner class BahasaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvBahasa: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var logoBahasa: ImageView = itemView.findViewById(R.id.logoBahasa)
    }
}