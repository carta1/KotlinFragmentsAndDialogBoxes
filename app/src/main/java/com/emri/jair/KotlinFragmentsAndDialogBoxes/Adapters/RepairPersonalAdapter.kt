package com.emri.jair.KotlinFragmentsAndDialogBoxes.Adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.emri.jair.KotlinFragmentsAndDialogBoxes.R

class RepairPersonalAdapter:RecyclerView.Adapter<RepairPersonalAdapter.ViewHolder>(){

    val personal = arrayListOf<String>("Joe","Doe","Camilo")

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
       val v = LayoutInflater.from(p0.context).inflate(R.layout.repairpersonal_adapter_viewholder,p0,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return personal.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val pers = personal[p1]
        p0.xxPersonal.text = pers

    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val xxPersonal = itemView.findViewById<TextView>(R.id.repairPersonalViewHolderText)



    }
}