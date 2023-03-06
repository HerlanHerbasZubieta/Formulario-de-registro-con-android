package com.example.formularioregristro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.formularioregristro.UserVipApplication.Companion.prefs
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
        checkUserValue()
    }
    fun checkUserValue(){
        if (prefs.getName().isNotEmpty()){
            goToDetail()
        }
    }

    fun initUI() {
        btnContinue.setOnClickListener {accessToDetail()}
    }

    fun accessToDetail() {
        if (etName.text.isNotEmpty()){
            prefs.saveName(etName.text.toString())
            prefs.saveVip(cbVip.isChecked)
            goToDetail()
        }else{

        }
    }

    //se ejecuta la otra pantalla luego de que el usuario se registra
    fun goToDetail(){
        startActivity(Intent(this, ResultActivity::class.java))
    }

}