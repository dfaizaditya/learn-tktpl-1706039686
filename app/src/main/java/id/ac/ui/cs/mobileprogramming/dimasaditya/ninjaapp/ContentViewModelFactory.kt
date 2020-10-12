package id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp.data.ContentRepository

class ContentViewModelFactory(private val contentRepository: ContentRepository)
    : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ContentViewModel(contentRepository) as T
    }
}