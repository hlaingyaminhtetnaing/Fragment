package com.hlaingyaminhtetnaing.myshopping.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.hlaingyaminhtetnaing.myshopping.R
import com.hlaingyaminhtetnaing.myshopping.adapter.DressAdapter
import com.hlaingyaminhtetnaing.myshopping.adapter.IphoneAdapter
import com.hlaingyaminhtetnaing.myshopping.model.Dress
import com.hlaingyaminhtetnaing.myshopping.model.Iphone
import kotlinx.android.synthetic.main.fragment_dress.*
import kotlinx.android.synthetic.main.fragment_iphone.*

class DressFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dress, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var dressList=ArrayList<Dress>()
        dressList.add(Dress("NEW","BELAROI Womens Comfy Swing Tunic Short......","Belaroi",18990,R.drawable.dressbb))
        var dressadapter = DressAdapter(dressList)
        dressRecycler.layoutManager= LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        dressRecycler.adapter = dressadapter
    }

}