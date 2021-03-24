package com.project.kotlin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.project.kotlin.R
import io.reactivex.rxjava3.annotations.NonNull
import io.reactivex.rxjava3.core.Observable


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

//        val source = Observable.create { emitter: ObservableEmitter<String?> ->
//            emitter.onNext("Hello")
//            emitter.onNext("Yena")
//            emitter.onComplete()
//        }
//        source.subscribe { s: String? -> Log.d("test", s) }
   
    }
}