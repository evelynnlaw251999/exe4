package com.android.example.exe4



import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.widget.DatePicker
import androidx.fragment.app.DialogFragment
import java.util.*


/**
 * A simple [Fragment] subclass.
 */
class DatePickerFragment : DialogFragment(), DatePickerDialog.OnDateSetListener {

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        val activity = activity as MainActivity?
        activity?.processDatePickerResult(year, month, dayOfMonth)
    }


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

// Create a new instance of DatePickerDialog and return it.
        return DatePickerDialog(activity as MainActivity, this, year, month, day)
    }

}
