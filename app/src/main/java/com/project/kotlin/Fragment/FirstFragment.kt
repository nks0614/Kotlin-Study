package com.project.kotlin.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.project.kotlin.R
import com.project.kotlin.SecondActivity
import com.project.simplecode.spfIntentNoFin
import com.project.simplecode.spfToastShort
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        moveBtn.setOnClickListener {
            spfToastShort("이동합니다")
            spfIntentNoFin(SecondActivity::class.java)
        }
    }
}