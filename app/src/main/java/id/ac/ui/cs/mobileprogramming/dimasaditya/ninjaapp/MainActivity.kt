package id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private external fun generateNumber(): Int

    companion object {
        init {
            System.loadLibrary("native-lib")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById(R.id.submit) as Button

        button.setOnClickListener {
            changeNumber()
        }

        // display Toast here...
        Toast.makeText(this,"Hello world",Toast.LENGTH_SHORT).show()

    }

    fun changeNumber() {
        var texthello = findViewById(R.id.number) as TextView
        texthello.text = generateNumber().toString()
    }
}
