package com.zack.tugas5mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var suhu : EditText
    private lateinit var fah : Button
    private lateinit var kel : Button
    private lateinit var re : Button
    private lateinit var konv : TextView
    private lateinit var pin : Button
    private lateinit var pin2 : Button
    private lateinit var pin3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        suhu= findViewById(R.id.suhu)
        fah= findViewById(R.id.F)
        kel= findViewById(R.id.K)
        re= findViewById(R.id.R)
        konv= findViewById(R.id.konversi)
        pin = findViewById(R.id.move)
        pin2 =findViewById(R.id.move2)
        pin3 =findViewById(R.id.move3)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        fah.setOnClickListener(){
            val angka1 = suhu.text.toString().toInt()

            val hasil = ((1.8)*angka1) + 32
            konv.setText("konversi suhu = "+hasil+" fahrenheit")
        }
        kel.setOnClickListener(){
            val angka1 = suhu.text.toString().toInt()


            val hasil = angka1 +273.15
            konv.setText("konversi suhu = "+hasil+"kelvin")
        }
        re.setOnClickListener(){
            val angka1 = suhu.text.toString().toInt()


            val hasil = ((0.8)*angka1)
            konv.setText("hasil tambah = "+hasil)
        }

        pin.setOnClickListener(){
            val intent = Intent(this, pdiskon::class.java)
            intent.putExtra("EXTRA_MESSAGE", "Hello from MainActivity")
            startActivity(intent)
        }

        pin2.setOnClickListener(){
            val intent = Intent(this, pbalok::class.java)
            intent.putExtra("EXTRA_MESSAGE", "Hello from MainActivity")
            startActivity(intent)
        }
        pin3.setOnClickListener(){
            val intent = Intent(this, ganjil_genap::class.java)
            intent.putExtra("EXTRA_MESSAGE", "Hello from MainActivity")
            startActivity(intent)
        }

    }
}