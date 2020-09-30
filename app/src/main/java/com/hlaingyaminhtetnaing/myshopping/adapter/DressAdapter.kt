package com.hlaingyaminhtetnaing.myshopping.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hlaingyaminhtetnaing.myshopping.R
import com.hlaingyaminhtetnaing.myshopping.model.Dress
import com.hlaingyaminhtetnaing.myshopping.model.Iphone
import kotlinx.android.synthetic.main.dress.view.*
import kotlinx.android.synthetic.main.iphone.view.*
import kotlinx.android.synthetic.main.neon.view.*

class DressAdapter( var dressList: ArrayList<Dress>) :
RecyclerView.Adapter<DressAdapter.dressViewHolder>(){
    class dressViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(dress: Dress) {
            itemView.edittextNew.setText(dress.time.toString())
            itemView.txtDressName.text = dress.name
            itemView.txtDressMade.text = dress.made
            itemView.txtDressPrice.text = dress.price.toString()
            itemView.ImgDress.setImageResource(dress.img)
            itemView.ratingDress.rating=dress.rating.toFloat()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): dressViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.dress,parent,false)
        return dressViewHolder(view)
    }

    override fun getItemCount(): Int=dressList.size

    override fun onBindViewHolder(holder: dressViewHolder, position: Int) {
      holder.bind((dressList[position]))
    }
}