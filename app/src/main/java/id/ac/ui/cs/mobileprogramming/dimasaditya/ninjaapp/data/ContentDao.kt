package id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class ContentDao {
    private val contentList = mutableListOf<Content>()
    private val contents = MutableLiveData<List<Content>>()

    init {
        contents.value = contentList
    }

    fun addContent(content: Content) {
        contentList.add(content)
        contents.value = contentList
    }

    fun getContent() = contents as LiveData<List<Content>>
}