package com.example.svetophor_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private var mainContainer: LinearLayout? = null
    private var redBackgroundBtn: Button? = null
    private var yellowBackgroundBtn: Button? = null
    private var greenBackgroundBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findAllView()
        initOnClickListeners()
    }
        private fun initOnClickListeners() {

            redBackgroundBtn?.setOnClickListener {
                setBackgroundColor(R.color.red)
            }

            yellowBackgroundBtn?.setOnClickListener {
                setBackgroundColor(R.color.yellow)
            }

            greenBackgroundBtn?.setOnClickListener {
                setBackgroundColor(R.color.green)
            }
        }
        private fun setBackgroundColor(colorId: Int) {
            mainContainer?.setBackgroundColor(ContextCompat.getColor(this, colorId))
        }
        private fun findAllView() {
            redBackgroundBtn = findViewById(R.id.vBtnRedChanger)
            yellowBackgroundBtn = findViewById(R.id.vBtnYellowChanger)
            greenBackgroundBtn = findViewById(R.id.vBtnGreenChanger)
            mainContainer = findViewById(R.id.vLnLtMainContainer)
        }
    }

