package com.emri.jair.KotlinFragmentsAndDialogBoxes.Adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.emri.jair.KotlinFragmentsAndDialogBoxes.DataClasses.RepairJobs
import com.emri.jair.KotlinFragmentsAndDialogBoxes.R

class RepairJobsAdapter(val testList: ArrayList<RepairJobs>): RecyclerView.Adapter<RepairJobsAdapter.ViewHolder>() {




    override fun onCreateViewHolder(pO: ViewGroup, p1: Int): ViewHolder {


        val v = LayoutInflater.from(pO?.context).inflate(R.layout.repairjobs_adapter_viewholder,pO,false)
        return ViewHolder(v)

    }

    override fun getItemCount(): Int {

        return testList.size

    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val repair= testList[p1]
        p0.test.text = repair.date
        p0.client.text = repair.client
        p0.relationFile.text = repair.relationFile
        p0.repairstatus.text = repair.status




    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val test = itemView.findViewById(R.id.test) as TextView
        val client = itemView.findViewById(R.id.clientTextView) as TextView
        val relationFile = itemView.findViewById(R.id.relationFileTextView) as TextView
        val repairstatus = itemView.findViewById(R.id.statusTextView) as TextView

    }

}