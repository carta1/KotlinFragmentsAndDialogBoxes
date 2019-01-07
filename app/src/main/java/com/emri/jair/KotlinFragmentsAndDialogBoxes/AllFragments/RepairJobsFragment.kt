package com.emri.jair.KotlinFragmentsAndDialogBoxes.AllFragments

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.emri.jair.KotlinFragmentsAndDialogBoxes.Adapters.RepairJobsAdapter
import com.emri.jair.KotlinFragmentsAndDialogBoxes.DataClasses.RepairJobs
import com.emri.jair.KotlinFragmentsAndDialogBoxes.R




class RepairJobsFragment: Fragment(){
     override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //val recyclerView2  = view!!.findViewById(R.id.recyclerView_main) as RecyclerView
        //recyclerView2.layoutManager = LinearLayoutManager(this.context)
        //recyclerView2.adapter = RepairJobsAdapter()



    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        return inflater!!.inflate(R.layout.fragment_repairjobs,container,false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //creation of the data using the dataClass RepairJobs for testing purposes
        val repair = arrayListOf<RepairJobs>()
        repair.add(RepairJobs("01012018","CG55","4556755667","Pending"))
        repair.add(RepairJobs("20122015","Wind mill","1234567890","Signed up"))
        repair.add(RepairJobs("15081992","COL mining","2222222222","Pending"))
        repair.add(RepairJobs("09082000","Panama Canal","11111111","In process"))
        repair.add(RepairJobs("111222005","CG55","2222222222","In progress"))
        repair.add(RepairJobs("01022003","CG55","333333333","In progress"))
        repair.add(RepairJobs("12122018","HW90","4556755667","Pending"))
        repair.add(RepairJobs("01012018","HW90","4556755667","Pending"))
        repair.add(RepairJobs("20122015","Panama Canal","1234567890","Signed up"))
        repair.add(RepairJobs("15081992","CG55","2222222222","Pending"))
        repair.add(RepairJobs("09082000","Panama Canal","44444444","In process"))
        repair.add(RepairJobs("111222005","Wind mill ","55555555555","In progress"))
        repair.add(RepairJobs("01022003","ND Frigate","66666666666","In progress"))
        repair.add(RepairJobs("01012018","CG55","4556755667","Pending"))
        repair.add(RepairJobs("20122015","Wind mill","1234567890","Signed up"))
        repair.add(RepairJobs("15081992","COL mining","2222222222","Pending"))
        repair.add(RepairJobs("09082000","Panama Canal","11111111","In process"))
        repair.add(RepairJobs("111222005","CG55","2222222222","In progress"))
        repair.add(RepairJobs("01022003","CG55","333333333","In progress"))
        repair.add(RepairJobs("12122018","HW90","4556755667","Pending"))
        repair.add(RepairJobs("01012018","HW90","4556755667","Pending"))
        repair.add(RepairJobs("20122015","Panama Canal","1234567890","Signed up"))
        repair.add(RepairJobs("15081992","CG55","2222222222","Pending"))
        repair.add(RepairJobs("09082000","Panama Canal","44444444","In process"))
        repair.add(RepairJobs("111222005","Wind mill ","55555555555","In progress"))
        repair.add(RepairJobs("01022003","ND Frigate","66666666666","In progress"))
        repair.add(RepairJobs("01012018","CG55","4556755667","Pending"))
        repair.add(RepairJobs("20122015","Wind mill","1234567890","Signed up"))
        repair.add(RepairJobs("15081992","COL mining","2222222222","Pending"))
        repair.add(RepairJobs("09082000","Panama Canal","11111111","In process"))
        repair.add(RepairJobs("111222005","CG55","2222222222","In progress"))
        repair.add(RepairJobs("01022003","CG55","333333333","In progress"))
        repair.add(RepairJobs("12122018","HW90","4556755667","Pending"))
        repair.add(RepairJobs("01012018","HW90","4556755667","Pending"))
        repair.add(RepairJobs("20122015","Panama Canal","1234567890","Signed up"))
        repair.add(RepairJobs("15081992","CG55","2222222222","Pending"))
        repair.add(RepairJobs("09082000","Panama Canal","44444444","In process"))
        repair.add(RepairJobs("111222005","Wind mill ","55555555555","In progress"))
        repair.add(RepairJobs("01022003","ND Frigate","66666666666","In progress"))





        //recyclerView must be initialize here and then attached to the adapter in this location for the
        //fragment to work properly
        val recView = view?.findViewById<RecyclerView>(R.id.recyclerView_main2)



        recView?.layoutManager = LinearLayoutManager(context)
        recView?.adapter = RepairJobsAdapter(repair)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onDetach() {
        super.onDetach()
    }




}