package com.example.taskone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //рабочая функция
        fun funktion(a: Int, b:Int){
            for (n in a..b) {
                if (n % 2 == 1){
                    //вывод только простых чисел
                    println(n)
                    Log.d("Terminal", "$n") //проверка через логи
                }
            }
        }

        //переменные-константы т.к не собираюсь их менять
        val a = 10
        val b = 100

        //вызов функции
        funktion(a, b)

        //выполнил Курицын Демид Михайлович
    }
}