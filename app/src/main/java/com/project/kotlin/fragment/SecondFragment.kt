package com.project.kotlin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.project.kotlin.R
import com.project.kotlin.SecondActivity
import com.project.kotlin.ThirdActivity
import com.project.simplecode.spfIntentNoFin
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        moveBtn.setOnClickListener {
            spfIntentNoFin(ThirdActivity::class.java)
        }
    }
}