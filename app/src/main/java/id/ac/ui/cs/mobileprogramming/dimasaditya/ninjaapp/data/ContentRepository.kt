package id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp.data

class ContentRepository private constructor(private val contentDao: ContentDao) {

    fun addContent(content: Content) {
        contentDao.addContent(content)
    }
    fun getCContent() = contentDao.getContent()

    companion object {
        @Volatile private var instance: ContentRepository? = null

        fun getInstance(contentDao: ContentDao) =
            instance ?: synchronized(this) {
                instance ?: ContentRepository(contentDao).also { instance = it }
            }
    }
}