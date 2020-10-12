package id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_1.*

class Content_Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var contents : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            contents = it.getString("data")
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_1,container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        textView.text = contents
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            Content_Fragment().apply {
                arguments = Bundle().apply {
                    putString("data", param1)
                }
            }
    }
}
