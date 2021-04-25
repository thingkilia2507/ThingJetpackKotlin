package com.thing.bangkit.thingjetpackkotlin.helper

import java.text.SimpleDateFormat
import java.util.*


object DateGenerator {
    @Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
    fun modifyDateStringFormat(convertDate :String) : String {
        val date: Date = SimpleDateFormat("MM/dd/yyyy", Locale.getDefault()).parse(convertDate)
        return SimpleDateFormat("MMMM dd, yyyy", Locale.getDefault()).format(date)
    }
}