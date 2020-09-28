package id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText


class MainActivity : Activity() {

    private val TAG = "MainActivity"

    private lateinit var nameText: EditText

    private lateinit var emailText: EditText

    private var emailValidation = EmailValidation()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameText = findViewById(R.id.userNameInput)
        emailText = findViewById(R.id.emailInput)

        emailText.addTextChangedListener(emailValidation)

    }

    fun onSaveClick(@Suppress("UNUSED_PARAMETER") view: View) {
        if (!emailValidation.isValid) {
            emailText.error = "Invalid email"
            Log.w(TAG, "This email is invalid")
            return
        }

        val name = nameText.text.toString()
        val email = emailText.text.toString()
    }
}
