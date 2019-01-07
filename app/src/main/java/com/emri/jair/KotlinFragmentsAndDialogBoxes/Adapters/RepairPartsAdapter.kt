package com.emri.jair.KotlinFragmentsAndDialogBoxes.Adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.emri.jair.KotlinFragmentsAndDialogBoxes.DataClasses.RepairParts
import com.emri.jair.KotlinFragmentsAndDialogBoxes.R

class RepairPartsAdapter(val parts: ArrayList<RepairParts>): RecyclerView.Adapter<RepairPartsAdapter.ViewHolder>(){



    //val listOfParts = arrayListOf<String>("motor","engine","chips")

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0.context).inflate(R.layout.repairparts_adapter_viewholder,p0,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return parts.size

    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val emriPart = parts[p1]
        p0.partNum.text = emriPart.number
        p0.partbrand.text = emriPart.brand
        p0.partKind.text = emriPart.kind
        p0.partType.text = emriPart.type
        p0.partPower.text = emriPart.power
        p0.partRev.text = emriPart.revolution
        p0.partClas.text = emriPart.clas


    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val partNum = itemView.findViewById<TextView>(R.id.numberTextView)
        val partbrand = itemView.findViewById<TextView>(R.id.brandTextView)
        val partKind = itemView.findViewById<TextView>(R.id.kindFileTextView)
        val partType = itemView.findViewById<TextView>(R.id.typeNumberTextView)
        val partPower = itemView.findViewById<TextView>(R.id.powerTextView)
        val partRev = itemView.findViewById<TextView>(R.id.revolutionTextView)
        val partClas = itemView.findViewById<TextView>(R.id.classTextView)





        //data class RepairParts(val number: String,val brand: String,val kind: String,val type: String,
                               //val power: String,val revolution: String,val clas: String)

    }
}