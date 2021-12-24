package com.example.uselessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.SystemClock
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.*
import java.util.concurrent.TimeUnit
import kotlin.coroutines.coroutineContext
import android.util.Log.i
import java.util.*
import kotlin.concurrent.schedule


class MainActivity : AppCompatActivity() {
    private var button: Button? = null
    private var answer: TextView? = null

//    fun fun1(){
////        GlobalScope.launch{
//        answer?.text = "Вкл"
//        button!!.visibility = View.GONE
//        Timer().schedule(2000){
//            result()
//        }
////        Thread.sleep(1000)
////        }
////        runBlocking {
////            launch{
////                Thread.sleep(5000)
////                result()
////            }
////        }
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        answer = findViewById(R.id.textView)

        answer?.text = "Выкл"

        button?.setOnClickListener{
            if(answer?.text?.toString()?.trim()?.equals("Выкл") == true){
                val rand = (1000..30000).random()

                answer?.text = "Вкл"
                button!!.visibility = View.GONE


                val handler = Handler()
                handler.postDelayed({
                    answer?.text = "Выкл"
                    button!!.visibility = View.VISIBLE
                }, rand.toLong())

            }

        }
    }

//    fun result(){
//        answer?.text = "Выкл"
//        button!!.visibility = View.VISIBLE
//    }
}