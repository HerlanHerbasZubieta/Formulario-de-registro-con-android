package com.example.formularioregristro

import android.app.Application

//esta clase se ejecute siempre que se abre, la logica va aqui
class UserVipApplication: Application()  {
    companion object {
        lateinit var prefs: Prefs
    }
    override fun onCreate() {
        super.onCreate()
        prefs = Prefs(applicationContext)
    }

}