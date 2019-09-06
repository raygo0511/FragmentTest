package com.raygo.fragmenttest

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(): BaseAdapter() {

    var context: Context? = null
    lateinit var cityName:ArrayList<String>

    constructor(context: Context?, cityName:ArrayList<String>):this() {
        this.context=context
        this.cityName=cityName
    }

    override fun getCount(): Int {
        return cityName.size
    }

    override fun getItem(position: Int): Any {
        return 0
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    @SuppressLint("WrongViewCast")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.custom_list, parent,false)

        val txtCityName = view.findViewById(R.id.txt_city_list) as TextView

        txtCityName.setText(cityName.get(position))

        return view
    }
}