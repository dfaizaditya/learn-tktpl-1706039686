package id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp.data.Content
import id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp.utilities.InjectorUtils
import kotlinx.android.synthetic.main.fragment_2.*

class Content_Fragment2 : Fragment() {

    companion object {
        fun newInstance() = Content_Fragment2()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val factory = InjectorUtils.provideContentViewModelFactory()

        val viewModel = ViewModelProvider(this, factory).get(ContentViewModel::class.java)
        button_add.setOnClickListener {
            val content = Content(editText_name.text.toString())
            viewModel.addContent(content)
            editText_name.setText("")
        }
    }

}
