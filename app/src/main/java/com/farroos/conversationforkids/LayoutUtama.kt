package com.farroos.conversationforkids

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageView

class LayoutUtama : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_utama)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        val btnkembali: ImageView = findViewById(R.id.btn_back)
        btnkembali.setOnClickListener(this)

        val btnperkenalan: ImageView = findViewById(R.id.btn_perkenalan)
        btnperkenalan.setOnClickListener(this)

        val btnwarganegara: ImageView = findViewById(R.id.btn_kewarganegaraan)
        btnwarganegara.setOnClickListener(this)
    }

    override fun onClick(v: View) {
            when(v.id){
                R.id.btn_back -> {
                    val btnKembali = Intent(this@LayoutUtama,MainActivity::class.java)
                    startActivity(btnKembali)
                }
                R.id.btn_perkenalan -> {
                    val pindahperkenalan = Intent(this@LayoutUtama,pilihan1::class.java)
                    startActivity(pindahperkenalan)
                }
                R.id.btn_kewarganegaraan -> {
                    val pindahperkenalan2 = Intent(this@LayoutUtama,pilihan2::class.java)
                    startActivity(pindahperkenalan2)
                }
            }
    }
}