package com.project.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.simplecode.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    var prev = -1
    var next = 1

    var conc = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        date.text = spDateFormat("YYYY년 MM월 dd일", 0)

        prevBtn.setOnClickListener {
            date.text = spDateFormat("YYYY년 MM월 dd일", prev)
            prev--
            next--
        }
        nextBtn.setOnClickListener {
            date.text = spDateFormat("YYYY년 MM월 dd일", next)
            prev++
            next++
        }

        checkDigitBtn.setOnClickListener {
            if(spStringDigit(checkDigit.text.toString())){
                spaToastShort("Int형으로 변환가능합니다.")
            }
            else{
                spaToastShort("Int형으로 변환 불가능합니다.")
            }
        }

        concatBtn.setOnClickListener {
            conc = concatText.text.toString()
            concatText.text = spStringConcat(conc, concat.text.toString())
        }

        randomBtn.setOnClickListener {
            randomText.text = spRandom(1, 100).toString()
        }

        averageText.text = spAverage(3,5,100).toString()

        similarityText.text = spStringSimilarity("ABC", "ABD").toString()

        emptyBtn.setOnClickListener {
            if(spCheckEmpty(empty1.text.toString(), empty2.text.toString(), empty3.text.toString())){
                spaToastShort("문자열이 비어있지 않습니다!")
            }else{
                spaToastShort("문자열이 비어있습니다.")
            }
        }


    }
}
