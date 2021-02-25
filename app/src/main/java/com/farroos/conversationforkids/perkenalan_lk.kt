package com.farroos.conversationforkids

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_perkenalan_lk.*

class perkenalan_lk : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perkenalan_lk)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        val kembali: ImageView = findViewById(R.id.btn_back)
        kembali.setOnClickListener(this)

        val play:ImageView = findViewById(R.id.btn_play)
        play.setOnClickListener(this)

//        val pause:ImageView = findViewById(R.id.btn_pause)
//        pause.setOnClickListener(this)

    }

    override fun onClick(v : View) {
        when(v.id){
            R.id.btn_back ->{
                val back = Intent(this@perkenalan_lk,pilihan1::class.java)
                startActivity(back)
            }
            R.id.btn_play ->{
                val putaraudio = MediaPlayer.create(this,R.raw.perkenalanlk)
                putaraudio.start()
            }
//            R.id.btn_pause ->{
//
//            }
        }
    }
}