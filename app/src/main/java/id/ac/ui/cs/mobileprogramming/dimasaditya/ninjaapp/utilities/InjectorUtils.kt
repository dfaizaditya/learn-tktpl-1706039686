package id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp.utilities

import id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp.data.FakeDatabase
import id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp.data.ContentRepository
import id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp.ContentViewModelFactory

object InjectorUtils {
    fun provideContentViewModelFactory(): ContentViewModelFactory {
        val f_database = FakeDatabase.getInstance().content
        val groceryRepository = ContentRepository.getInstance(f_database)
        return ContentViewModelFactory(groceryRepository)
    }
}