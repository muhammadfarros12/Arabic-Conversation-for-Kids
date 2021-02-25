package com.farroos.conversationforkids

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageView

class pilihan1 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilihan1)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        val kembali: ImageView = findViewById(R.id.btn_back)
        kembali.setOnClickListener(this)

        val laki: ImageView = findViewById(R.id.btn_laki)
        laki.setOnClickListener(this)

        val perempuan:ImageView = findViewById(R.id.btn_perempuan)
        perempuan.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_back -> {
                val back = Intent(this@pilihan1,LayoutUtama::class.java)
                startActivity(back)
            }
            R.id.btn_laki -> {
                val pindahlaki = Intent(this@pilihan1,perkenalan_lk::class.java)
                startActivity(pindahlaki)
            }
            R.id.btn_perempuan -> {
                val pindahpr = Intent(this@pilihan1, perkenalan_pr::class.java)
                startActivity(pindahpr)
            }
        }
    }
}