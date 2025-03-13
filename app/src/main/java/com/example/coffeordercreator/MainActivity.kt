package com.example.coffeordercreator

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioGroup
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val radioGroupCoffee = findViewById<RadioGroup>(R.id.radio_group_coffee)
        val imageViewCoffee = findViewById<ImageView>(R.id.image_view_coffee)
        val seekBarQuantity = findViewById<SeekBar>(R.id.seek_bar_quantity)
        val textViewQuantity = findViewById<TextView>(R.id.text_view_quantity)

        radioGroupCoffee.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radio_latte -> {
                    imageViewCoffee.setImageResource(R.drawable.latte)
                }

                R.id.radio_espresso -> {
                    imageViewCoffee.setImageResource(R.drawable.espresso)
                }

                R.id.radio_cappuccino -> {
                    imageViewCoffee.setImageResource(R.drawable.capuccino)
                }
            }
        }
    }


}