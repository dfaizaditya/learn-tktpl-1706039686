package id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp.utilities.InjectorUtils
import android.content.Intent
import android.widget.Button

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragMan: FragmentManager = supportFragmentManager
        val fragTransaction: FragmentTransaction = fragMan.beginTransaction()
        val contentFragment : Content_Fragment2 = Content_Fragment2()
        fragTransaction.add(R.id.root_layout, contentFragment)
        fragTransaction.commit()
        initializeUi()

    }

    private fun initializeUi() {
        val factory = InjectorUtils.provideContentViewModelFactory()
        val viewModel = ViewModelProvider(this, factory).get(ContentViewModel::class.java)

        viewModel.getContent().observe(this, Observer { content ->
            if (content.isNotEmpty()) {
                val bundle = Bundle()
                bundle.putString("data", content.last().toString())
                val fragMan: FragmentManager = supportFragmentManager

                val listFragment : Content_Fragment = Content_Fragment()
                listFragment.arguments = bundle
                val transaction = fragMan.beginTransaction().replace(R.id.root_layout, listFragment).addToBackStack(null)
                transaction.commit()
            }
        })
    }
}