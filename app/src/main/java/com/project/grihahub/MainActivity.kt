package com.project.grihahub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.project.grihahub.Ui.Landing.Landing

class MainActivity : AppCompatActivity() {
    //timer
    private val SPLASH_TIME_OUT:Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //jalankan landing setelah loding

        Handler().postDelayed({
            startActivity(Intent(this@MainActivity, Landing::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}
