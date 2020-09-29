package com.hlaingyaminhtetnaing.myshopping.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hlaingyaminhtetnaing.myshopping.R
import com.hlaingyaminhtetnaing.myshopping.model.Item
import kotlinx.android.synthetic.main.item.view.*

class ItemAdapter (var itemList: ArrayList<Item>) :
    RecyclerView.Adapter<ItemAdapter.itemViewHolder>() {
    class itemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item:Item) {
            itemView.imgItem.setImageResource(item.imageItem)
           itemView.txtName.text = item.name
            itemView.txtMade.text=item.made
            itemView.txtPrice.text=item.price.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return itemViewHolder(view)
    }

    override fun getItemCount(): Int=itemList.size

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
        holder.bind(itemList[position])
    }


}