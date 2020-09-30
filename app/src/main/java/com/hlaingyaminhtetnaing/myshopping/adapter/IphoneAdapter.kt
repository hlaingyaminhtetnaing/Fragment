package com.hlaingyaminhtetnaing.myshopping.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hlaingyaminhtetnaing.myshopping.R
import com.hlaingyaminhtetnaing.myshopping.model.Country
import com.hlaingyaminhtetnaing.myshopping.model.Iphone
import kotlinx.android.synthetic.main.country.view.*
import kotlinx.android.synthetic.main.iphone.view.*
import kotlinx.android.synthetic.main.neon.view.*

class IphoneAdapter(var iphoneList: ArrayList<Iphone>) :
    RecyclerView.Adapter<IphoneAdapter.iphoneViewHolder>() {
    class iphoneViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(iphone: Iphone) {
            itemView.editTextNew.setText(iphone.time.toString())
            itemView.editTextPer.setText(iphone.percent.toString())
            itemView.txtIphoneName.text = iphone.name
            itemView.txtIphoneMade.text = iphone.made
            itemView.txtIphonePrice.text = iphone.price.toString()
            itemView.ImgIphone.setImageResource(iphone.img)
            itemView.ratingIphone.rating=iphone.rating.toFloat()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): iphoneViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.iphone, parent, false)
        return iphoneViewHolder(view)
    }

    override fun getItemCount(): Int = iphoneList.size

    override fun onBindViewHolder(holder: iphoneViewHolder, position: Int) {
        holder.bind(iphoneList[position])
    }
}


