package com.example.exercise3

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.buttonCalculate)

        val textView1 = findViewById<TextView>(R.id.textViewPremium)
        button1.setOnClickListener(){
            val total = calculate()
            textView1.setText(total.toString())
        }

    }
        fun calculate(): Double {
            val radioButton1 = findViewById<RadioButton>(R.id.radioButtonMale)
            val radioButton2 = findViewById<RadioButton>(R.id.radioButtonFemale)
            val checkBox = findViewById<CheckBox>(R.id.checkBoxSmoker)

            val premium: Double

            premium = when (spinnerAge.selectedItemPosition) {
                0 -> {
                    60.0
                }

                1 -> {
                    70.0 +
                            (if (radioButton1.isChecked()) 50.0 else 0.0) +
                            (if (checkBox.isChecked) 100.0 else 0.0)
                }

                2 -> {
                        90.0 +
                                (if (radioButton1.isChecked()) 100.0 else 0.0) +
                                (if (checkBox.isChecked) 150.0 else 0.0)
                    }

                3 -> {
                        120.0 +
                                (if (radioButton1.isChecked()) 150.0 else 0.0) +
                                (if (checkBox.isChecked) 200.0 else 0.0)
                }

                4 -> {
                        150.0 +
                                (if (radioButton1.isChecked()) 200.0 else 0.0) +
                                (if (checkBox.isChecked) 250.0 else 0.0)
                }

                5 -> {
                        150.0 +
                                (if (radioButton1.isChecked()) 200.0 else 0.0) +
                                (if (checkBox.isChecked) 300.0 else 0.0)
                }
                else -> 150.0


            }

            return premium
        }
}
