package com.raygo.fragmenttest

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView

class SecondFragment : Fragment() {

    var arryList = arrayListOf<Int>(R.drawable.back, R.drawable.background, R.drawable.download,
        R.drawable.header, R.drawable.background, R.drawable.imag, R.drawable.images, R.drawable.back)

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        Log.e("Second","Fragment")
        val view = inflater.inflate(R.layout.fragment_second, container,false)
        val gridView = view.findViewById(R.id.grid_view) as GridView

        val gridAdapter = GridViewAdapter(context, arryList)
        gridView.adapter = gridAdapter
        return view
    }
}
