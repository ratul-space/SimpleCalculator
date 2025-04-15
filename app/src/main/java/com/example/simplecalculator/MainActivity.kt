package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(),View.OnClickListener {
    lateinit var btAdd: Button
    lateinit var btsub: Button
    lateinit var btMultiply: Button
    lateinit var btDrive: Button
    lateinit var etFirstNum: EditText
    lateinit var etSecondNum: EditText
    lateinit var txtResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btAdd = findViewById(R.id.btAdd)
        btsub = findViewById(R.id.btSubtract)
        btMultiply = findViewById(R.id.btMultiply)
        btDrive = findViewById(R.id.btDriver)
        etFirstNum = findViewById(R.id.editTextText)
        etSecondNum = findViewById(R.id.editTextText2)
        txtResult = findViewById(R.id.textView)
        //set the listener to the buttons
        btAdd.setOnClickListener(this)
        btsub.setOnClickListener(this)
        btMultiply.setOnClickListener(this)
        btDrive.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (TextUtils.isEmpty(etFirstNum.text.toString()) && TextUtils.isEmpty(etSecondNum.text.toString())){
            Toast.makeText(this,"Please fill the values",Toast.LENGTH_SHORT).show()
        }else{
            val num1 = Integer.parseInt(etFirstNum.text.toString())
            val num2 = Integer.parseInt(etSecondNum.text.toString())
            if (v != null){
                when(v.id){
                    R.id.btAdd->{
                        val ResultA = num1 + num2;
                        txtResult.text = ResultA.toString()
                    }
                    R.id.btSubtract->{
                        val ResultS = num1 - num2;
                        txtResult.text = ResultS.toString()
                    }
                    R.id.btMultiply->{
                        val ResultM = num1 * num2;
                        txtResult.text = ResultM.toString()
                    }
                    R.id.btDriver->{
                        val ResultD = num1 / num2;
                        txtResult.text = ResultD.toString()
                    }
                }
            }
        }
    }
}