package id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp.data

class FakeDatabase private constructor() {
    var content = ContentDao()
    private set

    companion object {
        @Volatile private var instance: FakeDatabase? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: FakeDatabase().also { instance = it }
            }
    }
}