package com.hlaingyaminhtetnaing.myshopping.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hlaingyaminhtetnaing.myshopping.R
import com.hlaingyaminhtetnaing.myshopping.model.Country
import kotlinx.android.synthetic.main.country.view.*

class CountryAdapter(var countryList: ArrayList<Country>) :
    RecyclerView.Adapter<CountryAdapter.countryViewHolder>() {
    class countryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(country: Country) {
            itemView.ImgCountry.setImageResource(country.imageCountry)
            itemView.txtCountry.text = country.nameCounty
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): countryViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.country, parent, false)
        return countryViewHolder(view)
    }

    override fun getItemCount(): Int = countryList.size
    override fun onBindViewHolder(holder: countryViewHolder, position: Int) {
        holder.bind(countryList[position])
    }
}