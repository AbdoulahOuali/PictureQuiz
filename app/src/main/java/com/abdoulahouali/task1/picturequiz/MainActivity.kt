package com.abdoulahouali.task1.picturequiz

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnConfirm.setOnClickListener {
            checkAnswer()
        }
    }

    /**
     * Checks if the input string is correct
     */
    private fun checkAnswer() {
        val answer = etAnswer.text.toString()

        if (answer.equals(getString(R.string.giraffe), ignoreCase = true)) {
            Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
        }
    }
}
