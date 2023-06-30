package com.example.montionlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cambiarActivity()
        cambiarColorPantalla()

    }
    private fun cambiarActivity(){
        val handler=Handler().postDelayed({
            val intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        },2000)

    }
    private  fun cambiarColorPantalla(){
        val window=this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor=getColor(R.color.white)
    }
}