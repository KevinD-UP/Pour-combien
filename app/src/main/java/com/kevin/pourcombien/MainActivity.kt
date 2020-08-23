package com.kevin.pourcombien

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.ResultsTextView)
        val resultsTextView1 = findViewById<TextView>(R.id.ResultsTextView1)
        val resultsTextView2 = findViewById<TextView>(R.id.ResultsTextView2)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        rollButton.setOnClickListener{
            val rand = Random().nextInt(seekBar.progress) + 1
            resultsTextView1.text = ""
            resultsTextView2.text = ""

            resultsTextView.text = rand.toString()
        }

        rollButton2.setOnClickListener{
            val rand1 = Random().nextInt(seekBar.progress) + 1
            val rand2 = Random().nextInt(seekBar.progress) + 1

            resultsTextView.text = ""

            resultsTextView1.text = rand1.toString()
            resultsTextView2.text = rand2.toString()


        }

    }
}