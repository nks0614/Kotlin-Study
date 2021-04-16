package com.project.kotlin.fragment

import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.TransitionManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.fragment.app.Fragment
import com.project.kotlin.R
import kotlinx.android.synthetic.main.fragment_second.*
import kotlinx.android.synthetic.main.fragment_third.*

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val a : ArrayList<Any> = ArrayList()
        a.add("222")
        a.add(222)
        Log.d("tests", a.toString())

        val anim : Animation = AnimationUtils.loadAnimation(context, R.anim.mix)
        img.startAnimation(anim)
    }
}