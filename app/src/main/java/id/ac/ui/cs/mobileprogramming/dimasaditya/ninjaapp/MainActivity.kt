package id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // display Toast here...
        Toast.makeText(this,"Hello world",Toast.LENGTH_SHORT).show()

    }
}
