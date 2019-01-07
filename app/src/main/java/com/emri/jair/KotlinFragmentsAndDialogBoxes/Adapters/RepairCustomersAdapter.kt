package com.emri.jair.KotlinFragmentsAndDialogBoxes.Adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.emri.jair.KotlinFragmentsAndDialogBoxes.R

class RepairCustomersAdapter: RecyclerView.Adapter<RepairCustomersAdapter.ViewHolder>(){

    //temporary array for testing purposes
    val customers = arrayListOf<String>("pedro","juan","jhony")

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {

        val v = LayoutInflater.from(p0?.context).inflate(R.layout.repaircustomer_adapter_viewholder,p0,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
       return customers.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val cus = customers[p1]
        p0.xCustomer.text = cus
    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val xCustomer = itemView.findViewById<TextView>(R.id.repairCustomerViewHolderText)


    }
}