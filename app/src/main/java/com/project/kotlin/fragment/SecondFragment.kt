package com.project.kotlin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ethanhua.skeleton.Skeleton
import com.ethanhua.skeleton.SkeletonScreen
import com.project.kotlin.R
import io.reactivex.rxjava3.annotations.NonNull
import io.reactivex.rxjava3.core.Observable
import kotlinx.android.synthetic.main.fragment_second.*


class SecondFragment : Fragment() {

    lateinit var skeletonScreen : SkeletonScreen

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        skeletonScreen = Skeleton.bind(testView)
            .load(R.layout.fragment_second)
            .duration(1000)
            .color(R.color.shimmer_color)
            .show()
    }
}