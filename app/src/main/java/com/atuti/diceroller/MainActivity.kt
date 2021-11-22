package com.atuti.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declare and initialize variable
        val buttonToast: Button = findViewById(R.id.button_toast)
        buttonToast.setOnClickListener {showToast()}

        val buttonRoll: Button = findViewById(R.id.button_roll)
        buttonRoll.setOnClickListener { rollDice()}

        val buttonCount: Button = findViewById(R.id.button_count)
        buttonCount.setOnClickListener {showCount()}

    }
    //create methods
    //class toast class
    private fun showToast() {
        Toast.makeText(this, "ooh my", Toast.LENGTH_SHORT).show()
    }
    //class rollDice
    private fun rollDice(){
        val generatedRandom= (1..6).random()
        val textViewResult: TextView = findViewById(R.id.text_result)
        textViewResult.text= generatedRandom.toString()


    }
    //class showCount
     private fun showCount( ){
         // grab text from roll dice
         val displayResultView: TextView = findViewById(R.id.text_result)
         val displayResult= displayResultView.text.toString()

         //convert it to an int
         val count =  displayResult.toInt()

         //add by 1 value and convert it to text
        displayResultView.text = (count + 1).toString()

         }
     }
