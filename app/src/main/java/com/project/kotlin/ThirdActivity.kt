package com.project.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        name_text.text = intent.getStringExtra("Info_name")
        school_text.text = intent.getStringExtra("Info_school")
        number_text.text = intent.getStringExtra("Info_number")
    }
}
