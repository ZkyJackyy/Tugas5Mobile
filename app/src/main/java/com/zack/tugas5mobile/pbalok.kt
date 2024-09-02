package com.zack.tugas5mobile

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class pbalok : AppCompatActivity() {

    private lateinit var pnjg : EditText
    private lateinit var lbr : EditText
    private lateinit var tng : EditText
    private lateinit var lp : Button
    private lateinit var vol : Button
    private lateinit var hsl : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pbalok)

        pnjg = findViewById(R.id.panjang)
        lbr = findViewById(R.id.lebar)
        tng = findViewById(R.id.tinggi)
        lp = findViewById(R.id.lp)
        vol = findViewById(R.id.vol)
        hsl = findViewById(R.id.hasil)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        lp.setOnClickListener(){
            val p = pnjg.text.toString().toInt()
            val l = lbr.text.toString().toInt()
            val t = tng.text.toString().toInt()

            val hasil = 2*((p*l)+(p*t)+(l*t))
            hsl.setText("luas permukaan balok adalah " +hasil)

        }

        vol.setOnClickListener(){
            val p = pnjg.text.toString().toInt()
            val l = lbr.text.toString().toInt()
            val t = tng.text.toString().toInt()

            val hasil = (p*l*t)
            hsl.setText("volume balok adalah " +hasil)

        }

    }
}