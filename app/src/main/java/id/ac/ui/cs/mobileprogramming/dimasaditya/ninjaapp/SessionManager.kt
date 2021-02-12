package id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp

import android.content.Context
import android.content.SharedPreferences

class SessionManager {

    private val KEY_FLAG = "FLAG"
    private val KEY_TIME = "TIME"

    protected fun retrieveSharedPreferences(context: Context): SharedPreferences{
        return context.getSharedPreferences("SESSION_MANAGER_V1", Context.MODE_PRIVATE)
    }

    protected fun retrieveSharedPreferencesEditor(context: Context): SharedPreferences.Editor{
        return retrieveSharedPreferences(context).edit()
    }

    //simpan data flag
    fun setflag(context: Context, flag: Boolean){
        val editor = retrieveSharedPreferencesEditor(context)
        editor.putBoolean(KEY_FLAG, flag)

        editor.commit()
    }

    fun getflag(context: Context) : Boolean{
        return retrieveSharedPreferences(context).getBoolean(KEY_FLAG, false)
    }

    fun setCurrentTime(context: Context, currentTime : String){
        val editor = retrieveSharedPreferencesEditor(context)
        editor.putString(KEY_TIME, currentTime)

        editor.commit()
    }

    //ambil waktu terhitung
    fun getCurrentTime(context: Context): String? {
        return retrieveSharedPreferences(context).getString(KEY_TIME, "")
    }

}