package com.emri.jair.KotlinFragmentsAndDialogBoxes.DataClasses

data class RepairJobs(val date: String, val client: String, val relationFile: String, val status:String)

data class RepairParts(val number: String,val brand: String,val kind: String,val type: String,
                       val power: String,val revolution: String,val clas: String)