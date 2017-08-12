package com.kotlin.amatanat.myfirstkotlinapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener({
            Toasty.success(this, "Success!", Toast.LENGTH_SHORT, true).show();
        }
        )
    }
}


