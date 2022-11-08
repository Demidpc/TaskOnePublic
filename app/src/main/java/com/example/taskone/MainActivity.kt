package com.example.taskone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    //рабочая функция
    fun funktion(a: Int, b:Int){
        for (n in a..b) {
            //вывод каждого из чисел
            println(n)
//            Log.d("Terminal", "$n") //проверка через логи
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //переменные-константы т.к не собираюсь их менять
        val a = 10
        val b = 100

        //вызов функции
        funktion(a, b)

        //выполнил Курицын Демид Михайлович
    }
}