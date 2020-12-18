package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dice:Dice=Dice(6)
        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val num:Int=dice.rollDice()
            val toast : Toast = Toast.makeText(this, "Output: ${num}", Toast.LENGTH_SHORT)
            val image: ImageView =findViewById(R.id.imageView)
            when(num)
            {
                1->(image.setImageResource(R.drawable.dice_1))
                2->(image.setImageResource(R.drawable.dice_2))
                3->(image.setImageResource(R.drawable.dice_3))
                4->(image.setImageResource(R.drawable.dice_4))
                5->(image.setImageResource(R.drawable.dice_5))
                6->(image.setImageResource(R.drawable.dice_6))
            }
            toast.show()

        }
    }

    class Dice(private val sides:Int)
    {
        fun rollDice():Int{
            return (1..sides).random()
        }
    }
}