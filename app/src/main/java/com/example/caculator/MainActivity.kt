package com.example.caculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number:String?=""
    var numberOne:Float = 0.0F
    var numberTwo:Float = 0.0F
    var isAddition : Boolean = false
    var isDivide : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun operationFunction(view: View) {

        var editText : EditText? = findViewById(R.id.edit_text)
        when(view.id){
            R.id.button_one -> {
                number +="1"
                editText?.setText("1")}

            R.id.button_clear->{
                number =""
                editText?.setText("")
            }
            R.id.button_decimal->{
                number +="."
                editText?.setText(number)
            }
            R.id.button_add->{
                if (number.isNullOrBlank()){
                    editText?.setText("")
                }else{
                    numberOne = number!!.toFloat()
                    editText?.setText("")
                    isAddition = true
                    number =""
                }
            }
            R.id.button_divide->{
                if (number.isNullOrBlank()){
                    editText?.setText("")
                }else{
                    numberOne = number!!.toFloat()
                    editText?.setText("")
                    isDivide=true
                    number = ""
                }
            }
            R.id.button_equal->{
                if (isAddition == true){
                    numberTwo = number!!.toFloat()
                    editText?.setText((numberOne+numberTwo).toString())
                }else if (isDivide){}
                numberTwo = number!!.toFloat()
                editText?.setText((numberOne/numberTwo).toString())
            }
        }
    }
}
