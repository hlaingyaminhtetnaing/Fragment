package com.hlaingyaminhtetnaing.myshopping.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.hlaingyaminhtetnaing.myshopping.R
import com.hlaingyaminhtetnaing.myshopping.adapter.CountryAdapter
import com.hlaingyaminhtetnaing.myshopping.adapter.IphoneAdapter
import com.hlaingyaminhtetnaing.myshopping.adapter.ItemAdapter
import com.hlaingyaminhtetnaing.myshopping.model.Country
import com.hlaingyaminhtetnaing.myshopping.model.Iphone
import kotlinx.android.synthetic.main.fragment_iphone.*
import kotlinx.android.synthetic.main.fragment_item.*

class IphoneFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_iphone, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var iphoneList=ArrayList<Iphone>()
        iphoneList.add(Iphone("NEW","30 % off","Iphone 8 Plus","Apple",980000,R.drawable.iphonee))
        iphoneList.add(Iphone("NEW","34 % off","GhostBed 11 inch Cooling Gel Memory Foam....","GhostedBed",325000,R.drawable.bed))
        var iphoneadapter =IphoneAdapter(iphoneList)
        IphoneRecycler.layoutManager= LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        IphoneRecycler.adapter = iphoneadapter
    }


}