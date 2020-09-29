package com.hlaingyaminhtetnaing.myshopping.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hlaingyaminhtetnaing.myshopping.R
import com.hlaingyaminhtetnaing.myshopping.model.Iphone
import com.hlaingyaminhtetnaing.myshopping.model.Neon
import kotlinx.android.synthetic.main.iphone.view.*
import kotlinx.android.synthetic.main.neon.view.*

class NeonAdapter (var neonList: ArrayList<Neon>) :
    RecyclerView.Adapter<NeonAdapter.neonViewHolder>() {
    class neonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(neon:Neon) {
            itemView.txtNeonName.text = neon.name
            itemView.txtNeonMade.text = neon.made
            itemView.txtNeonPrice.text = neon.price.toString()
            itemView.ImgNeon.setImageResource(neon.img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): neonViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(
        R.layout.neon, parent, false)
        return NeonAdapter.neonViewHolder(view)
    }

    override fun getItemCount(): Int =neonList.size

    override fun onBindViewHolder(holder: neonViewHolder, position: Int) {
        holder.bind(neonList[position])
    }
}