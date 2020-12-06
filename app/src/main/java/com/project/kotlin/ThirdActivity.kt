package com.project.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RestrictTo
import kotlinx.android.synthetic.main.activity_third.*
import kotlinx.coroutines.*
import java.lang.Thread.sleep
import kotlin.coroutines.CoroutineContext

class ThirdActivity : AppCompatActivity(), CoroutineScope {

    lateinit var job : Job

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        job = Job()

//        Log.d("Coroutine", "doing something in main thread")    // 1
//
//        GlobalScope.launch {    // 2
//            delay(3000)
//            Log.d("Coroutine", "done something in Coroutine")   // 3
//        }
//
//        Log.d("Coroutine", "done in main thread")     // 2

//        GlobalScope.launch {    // 1
//            launch {    // 2
//                Log.d("Coroutine", "Launch has NO return value") // 3
//            }
//
//            val value: Int = async {   // 2
//                1 + 2
//            }.await()   //async는 반환 값이 존재하고, await 함수를 사용해 작업이 완료되는 것을 기다리고 반환 값을 리턴
//
//            Log.d("Coroutine", "Async has return value: $value") // 4
//        }

//        GlobalScope.launch {
//            doSomething()
//            Log.d("Coroutine", "done something")
//        }

//        GlobalScope.launch(Dispatchers.IO) { // 이렇게 launch의 인자값으로 넘겨주면 된다
//            Log.d("Coroutine", "doing IOThread")
//        }

//        Dispatchers.Main : 안드로이드의 메인 쓰레드. UI 작업은 여기서 처리되어야 합니다.
//        Dispatchers.IO : Disk 또는 네트워크에서 데이터 읽는 I/O 작업은 이 쓰레드에서 처리. 예를들어, 파일을 읽거나 AAC의 Room 등도 여기에 해당됩니다.
//        Dispatchers.Default : 그외 CPU에서 처리하는 대부분의 작업들은 이 쓰레드에서 처리하면 됩니다.

//        GlobalScope.launch(Dispatchers.IO) {
//            Log.d("Coroutine", "Do something on IO thread")
//            val name = withContext(Dispatchers.Main) { //async와 비슷하지만 다른 느낌, 얘는 그냥 await가 없이 기다린다
//                sleep(2000)
//                "My name is Android"
//            }
//
//            Log.d("Coroutine", "Result : $name")
//        }

        // GlobalScope는 앱이 종료될 때까지 돈다. 근데 이러한 작업은 불필요할 수 있다.
        // Activity 자체를 Scope로 할 수 있다. 위로 가보자

        // 코루틴에서 예외 처리 하는 법
//        val handler = CoroutineExceptionHandler { coroutineScope, exception ->
//            Log.d("Coroutine", "$exception handled!")
//        }
//
//        GlobalScope.launch(Dispatchers.IO + handler) {
//            launch {
//                throw Exception()
//            }
//        }

        //async나 withContext는 저렇게 하면 안됨
//        GlobalScope.launch(Dispatchers.IO) {
//            try {
//                val name = withContext(Dispatchers.Main) {
//                    throw Exception()
//                }
//            } catch (e: java.lang.Exception) {
//                Log.d("Coroutine", "$e handled!")
//            }
//        }


    }



//    private suspend fun doSomething() {
//        GlobalScope.launch {
//            sleep(1000)
//            Log.d("Coroutine", "do something in a suspend method")
//        }
//    }

    override fun onDestroy() {
        super.onDestroy()
        job.cancel()
    }
}
