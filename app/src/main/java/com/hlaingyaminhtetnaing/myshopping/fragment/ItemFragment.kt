package com.hlaingyaminhtetnaing.myshopping.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.hlaingyaminhtetnaing.myshopping.R
import com.hlaingyaminhtetnaing.myshopping.adapter.ItemAdapter
import com.hlaingyaminhtetnaing.myshopping.model.Item
import kotlinx.android.synthetic.main.fragment_item.*


class ItemFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_item, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var itemList=ArrayList<Item>()
        itemList.add(Item(R.drawable.lv,"Hyde Park N41015","LOUIS VUITTON",9999999,4.0))
        itemList.add(Item(R.drawable.ladygaga,"HORNS PINK LONG SLEEVE T SHIRT","Lady Gaga",72000,5.0))
        itemList.add(Item(R.drawable.iphone,"Iphone 8","Apple",600000,5.0))
        var itemAdapter = ItemAdapter(itemList)
        itemRecycler.layoutManager= LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
        itemRecycler.adapter = itemAdapter
    }
}