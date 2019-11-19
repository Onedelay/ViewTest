package com.onedelay.viewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            tv1_1.text = "Hello world 1-1"
            tv1_2.text = "Hello world 1-2"
            tv2.text = "Hello world 2"
        }
    }

}
