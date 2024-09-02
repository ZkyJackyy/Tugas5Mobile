package com.zack.tugas5mobile

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ganjil_genap : AppCompatActivity() {

    private lateinit var ipt : EditText
    private lateinit var btn : Button
    private lateinit var opt : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ganjil_genap)

        ipt = findViewById(R.id.input)
        btn = findViewById(R.id.btn)
        opt =findViewById(R.id.output)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btn.setOnClickListener(){
            val nilai = ipt.text.toString().toInt()
            if(nilai%2==0){
                opt.setText("$nilai adalah bilangan genap")
            }
            else{
                opt.setText("$nilai adalah bilangan ganjil")
            }
        }
    }
}