package id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp

import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.Button
import android.widget.Chronometer
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    val context: Context = this

    private var format = SimpleDateFormat("hh:mm:ss aa")

    private var sessionManager = SessionManager()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // access the chronometer from XML file
        val meter = findViewById<Chronometer>(R.id.c_meter)

        val currentTime = format.format(Date())
        val flag = sessionManager.getflag(context)

        // cek kondisi flag
        if (!flag) {
            // jika flag==false set currentTime
            sessionManager.setCurrentTime(context, currentTime)
            sessionManager.setflag(context,true)

            // start counting
            meter.start()
        } else{
            var sessionManagercurrentTime = sessionManager.getCurrentTime(context)
            try {
                val date1: Date = format.parse(sessionManagercurrentTime)
                val date2: Date = format.parse(currentTime)
                // hitung perbedaan waktu
                val diff: Long = date1.getTime() - date2.getTime()

                meter.base = SystemClock.elapsedRealtime() + diff
                meter.start()
            }catch (e: ParseException){
                e.printStackTrace()
            }

        }


        //access the button using id
        val btn = findViewById<Button>(R.id.bt_reset)
        btn?.setOnClickListener(object : View.OnClickListener {

            override fun onClick(v: View) {
                meter.setBase(SystemClock.elapsedRealtime());
                sessionManager.setCurrentTime(context, currentTime)
                meter.start()
            }
        })

    // display Toast here...
        Toast.makeText(this,"Hello world",Toast.LENGTH_SHORT).show()

    }


    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setMessage("Are you sure you want to exit?")
            .setPositiveButton("Yes", DialogInterface.OnClickListener { _, _ -> this@MainActivity.finish() })
            .setNegativeButton("No", null)
            .show()
    }
}
