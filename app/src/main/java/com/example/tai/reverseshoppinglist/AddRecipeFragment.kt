package com.example.tai.reverseshoppinglist

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout


class AddRecipeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.addrecipe_fragment, container, false)

        val linearLayout = view.findViewById<LinearLayout>(R.id.linearLayout) as LinearLayout

        val recipeName = EditText(context)
        recipeName.hint = "Recipe name"
        recipeName.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)

        linearLayout.addView(recipeName)

        return view
    }
}