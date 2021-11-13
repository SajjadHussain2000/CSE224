package com.example.cse224

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class CSE224_Q2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cse224_q2)

        var radioGroup = findViewById<RadioGroup>(R.id.radioGrp)
        radioGroup.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener{
                group,radioId ->
            val radioBtn = findViewById<RadioButton>(radioId)
            Toast.makeText(this,"You Clicked ${radioBtn.text}",Toast.LENGTH_SHORT).show()
        })

        var Chk1 = findViewById<CheckBox>(R.id.chk1)
        var Chk2 = findViewById<CheckBox>(R.id.chk2)
        var Chk3 = findViewById<CheckBox>(R.id.chk3)
        var Chk4 = findViewById<CheckBox>(R.id.chk4)

        Chk1.setOnClickListener{
            if(Chk1.isChecked){
                Toast.makeText(this, "You Clicked ${Chk1.text} ",Toast.LENGTH_SHORT).show()
            }
        }

        Chk2.setOnClickListener{
            if(Chk2.isChecked){
                Toast.makeText(this, "You Clicked ${Chk2.text} ",Toast.LENGTH_SHORT).show()
            }
        }

        Chk3.setOnClickListener{
            if(Chk3.isChecked){
                Toast.makeText(this, "You Clicked ${Chk3.text} ",Toast.LENGTH_SHORT).show()
            }
        }

        Chk4.setOnClickListener{
            if(Chk4.isChecked){
                Toast.makeText(this, "You Clicked ${Chk4.text} ",Toast.LENGTH_SHORT).show()
            }
        }

        var Btn = findViewById<Button>(R.id.btn)
        Btn.setOnClickListener{
            Toast.makeText(this,"You Clicked Submit Button", Toast.LENGTH_SHORT).show()
        }

    }
}