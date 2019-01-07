package com.emri.jair.KotlinFragmentsAndDialogBoxes.AllFragments

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import com.emri.jair.KotlinFragmentsAndDialogBoxes.R
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.emri.jair.KotlinFragmentsAndDialogBoxes.Adapters.RepairPartsAdapter
import com.emri.jair.KotlinFragmentsAndDialogBoxes.DataClasses.RepairParts
import kotlinx.android.synthetic.main.dialogbox_repairparts.view.*


class RepairPartsFragment: Fragment(){

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_repairparts,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val repairPartsB = view?.findViewById<Button>(R.id.repairPartsButton)

        //val dialogWR = activity!!.layoutInflater.inflate(R.layout.write_review_activity, null)
        //etWR = dialogWR.findViewById(R.id.etWR) as EditText

        //var input = repairPartsNumber?.text




        //create mock up array
        val repair = ArrayList<RepairParts>()
        repair.add(RepairParts("12345","DELTA","Engine","1432w","CS35999","40.50","3600"))
        repair.add(RepairParts("54321","DELTA","Engine","1432t","CS35999","160.50","1640"))
        repair.add(RepairParts("22222","DELTA","Engine","67150f63","CS35999","120.50","1640"))
        repair.add(RepairParts("33333","DELTA","Motor","ne80m4","CS35999","3.50","1640"))
        repair.add(RepairParts("44444","DELTA","Ex motor","Arrt1607m0","CS35999","0.50","1640"))
        repair.add(RepairParts("55555","DELTA","Piston","tuy1607m0","CS35999","40.50","1640"))
        repair.add(RepairParts("66666","DELTA","Piston","tuy1607m0","CS35999","15.50","1640"))
        repair.add(RepairParts("77777","DELTA","Piston","tuy1607m0","CS35999","10.50","1540"))
        repair.add(RepairParts("88888","DELTA","Piston","tuy1607m0","CS35999","5.50","1640"))

        //setting up recycler view with adapter and arrayList
        val recV = view?.findViewById<RecyclerView>(R.id.repairPartsRecView)
        recV?.layoutManager = LinearLayoutManager(context)
        recV?.adapter = RepairPartsAdapter(repair)







        //button that activates the dialog box that saves new items inside the arrayList
        repairPartsB?.setOnClickListener {

            //inflates the dialog box view for easier management
            val mdialogView = LayoutInflater.from(this.context).inflate(R.layout.dialogbox_repairparts,null)

            //create dialog box
            val builder = AlertDialog.Builder(this.context)
            //set dialog box layout
            builder.setView(mdialogView)

                //add action buttons
                .setPositiveButton("Save"){dialog, which ->

                    //initiation of the EditText must be here because is being used by the dialog box and is the only
                    //way it will detect it and use it properly.
                    val repairPartsNumber = mdialogView.repairPartsDialogNumberEditText.text.toString()
                    val repairPartsBrand = mdialogView.repairPartsDialogBrandEditText.text.toString()
                    val repairPartsKind = mdialogView.repairPartsDialogKindEditText.text.toString()
                    val repairPartsType = mdialogView.repairPartsDialogTypeEditText.text.toString()
                    val repairPartsPower = mdialogView.repairPartsDialogPowerEditText.text.toString()
                    val repairPartsRevolution = mdialogView.repairPartsDialogRevolutionEditText.text.toString()
                    val repairPartsClass = mdialogView.repairPartsDialogClassEditText.text.toString()






                    //adds the new information into the array to late rbe display by the recycler view
                    repair.add(RepairParts(repairPartsNumber,repairPartsBrand,
                        repairPartsKind,repairPartsType,repairPartsPower,
                        repairPartsRevolution,repairPartsClass))


                    recV!!.adapter?.notifyDataSetChanged()

                }

                .setNegativeButton("Cancel"){dialog, which ->
                    Toast.makeText(context,"why did you cancel!!",Toast.LENGTH_SHORT).show()
                }



            //making alert dialog and showing it
            val dialog: AlertDialog = builder.create()
            dialog.show()



        }





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