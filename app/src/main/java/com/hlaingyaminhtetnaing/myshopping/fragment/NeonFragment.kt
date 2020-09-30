package com.hlaingyaminhtetnaing.myshopping.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.hlaingyaminhtetnaing.myshopping.R
import com.hlaingyaminhtetnaing.myshopping.adapter.IphoneAdapter
import com.hlaingyaminhtetnaing.myshopping.adapter.NeonAdapter
import com.hlaingyaminhtetnaing.myshopping.model.Iphone
import com.hlaingyaminhtetnaing.myshopping.model.Neon
import kotlinx.android.synthetic.main.fragment_iphone.*
import kotlinx.android.synthetic.main.fragment_neon.*

class NeonFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_neon, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var neonList=ArrayList<Neon>()
        neonList.add(Neon("Nintendo Switch-Neon Blue and Red Joy-Con","Nintendo",359000,R.drawable.gameswitch,4.0))

        var neonadapter = NeonAdapter(neonList)
        neonRecycler.layoutManager= LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        neonRecycler.adapter = neonadapter
    }
}