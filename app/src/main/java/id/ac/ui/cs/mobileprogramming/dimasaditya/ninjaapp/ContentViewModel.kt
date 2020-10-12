package id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp
import androidx.lifecycle.ViewModel
import id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp.data.Content
import id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp.data.ContentRepository

class ContentViewModel(private val contentRepository: ContentRepository) : ViewModel() {

    fun getContent() = contentRepository.getCContent()
    fun addContent(content: Content) = contentRepository.addContent(content)
}