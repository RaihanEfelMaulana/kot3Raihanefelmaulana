package com.efel.kot3raihanefelmaulana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener{



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val id = findViewById<EditText>(R.id.editid)
        val name = findViewById<EditText>(R.id.editnama)
        val gaji = findViewById<EditText>(R.id.editgaji)
        val tnjngn = findViewById<EditText>(R.id.edittunjangan)
        val ja = findViewById<Spinner>(R.id.editja)
        ja.onItemSelectedListener=this
        val submit = findViewById<Button>(R.id.btnsubmit)
        val output = findViewById<TextView>(R.id.txtoutput)

        output.setOnClickListener(){

        }
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        TODO("Not yet implemented")
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}