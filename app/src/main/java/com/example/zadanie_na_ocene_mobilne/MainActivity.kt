package com.example.zadanie_na_ocene_mobilne

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var a = ""
        var b = ""
        var LiczbaPierwsza = 0
        var LiczbaDruga = 0
        var wynik = 0

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.zmien).setOnClickListener{
            findViewById<TextView>(R.id.pole_wys).text= findViewById<EditText>(R.id.wpro_text).text
        }
        findViewById<Button>(R.id.dodaj_text).setOnClickListener{
            b = findViewById<EditText>(R.id.wpro_text).text.toString()
            a=a+b
            findViewById<TextView>(R.id.pole_wys).text = a
        }
        findViewById<Button>(R.id.dodaj_liczby).setOnClickListener{
            LiczbaPierwsza = findViewById<EditText>(R.id.wpro_LiczbaPierwsza).text.toString().toInt()
            LiczbaDruga = findViewById<EditText>(R.id.wpro_LiczbaDruga).text.toString().toInt()
            wynik = LiczbaPierwsza + LiczbaDruga
            findViewById<TextView>(R.id.pole_wys).text = wynik.toString()
        }

    }
}