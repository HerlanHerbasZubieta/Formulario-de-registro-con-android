package com.example.formularioregristro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.formularioregristro.UserVipApplication.Companion.prefs
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        iniUI()
    }

    fun iniUI(){
        btnBack.setOnClickListener{
            prefs.wipe()
            onBackPressed()
        }
        val userName = prefs.getName()
        tvName.text = "Bienvenido $userName"
        if (prefs.getVip()){
            setVipcolorBackground()
        }
    }
    fun setVipcolorBackground(){
        container.setBackgroundColor(ContextCompat.getColor(this, R.color.teal_200))
    }



}