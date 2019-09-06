package com.raygo.fragmenttest

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

class FirstFragment : Fragment() {

    var arryList = arrayListOf<String>("Rajkot", "Gandhinagar", "Ahmedabad", "Surat", "Junagadh",
        "Jamnagar", "Morabi", "Amreli", "Baroda", "Mumbai", "Pune")

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        Log.e("First","Fragment")

        val view = inflater.inflate(R.layout.fragment_first, container,false)
        val listView = view.findViewById(R.id.list_view) as ListView

        val listAdapter = ListViewAdapter(context, arryList)
        listView.adapter = listAdapter
        return view


    }
}
