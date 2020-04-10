package com.project.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        nextButton.setOnClickListener{
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("Info_name",name.text.toString())
            intent.putExtra("Info_school",school.text.toString())
            intent.putExtra("Info_number",number.text.toString())
            startActivity(intent)
        }
    }
}
