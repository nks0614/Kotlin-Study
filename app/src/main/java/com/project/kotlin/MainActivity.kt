package com.project.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val random = Random()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        select.setOnClickListener{
            var text1 = edit1.text.toString()
            var text2 = edit2.text.toString()
            var text3 = edit3.text.toString()
            if(text1 == "" || text2 == "" || text3 == "") {
                Toast.makeText(this, "입력해라", Toast.LENGTH_SHORT).show()
            }
            else{

                edit1.isEnabled = false
                edit2.isEnabled = false
                edit3.isEnabled = false

                var number = random.nextInt(3)
                var menu = arrayOf(text1, text2, text3)
                result.text = menu[number].toString()
            }

        }
        
        restart.setOnClickListener{
            edit1.isEnabled = true
            edit2.isEnabled = true
            edit3.isEnabled = true

            edit1.text = null
            edit2.text = null
            edit3.text = null

            result.text = "결과"
        }

        intent_page.setOnClickListener{
            val next = Intent(this, SecondActivity::class.java)
            startActivity(next)
        }
    }
}
