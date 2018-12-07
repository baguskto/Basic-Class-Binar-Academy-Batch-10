package id.ilhamsuaib.app.data

import android.content.Context
import android.content.SharedPreferences
import android.provider.SyncStateContract
import id.ilhamsuaib.app.util.Constants

class PreferenceManager(context: Context) {

    private val sp: SharedPreferences by lazy {
        context.applicationContext.getSharedPreferences("binar_app.db", Context.MODE_PRIVATE)

    }
    private val spe: SharedPreferences.Editor by lazy {
        sp.edit()
    }

    fun logout(){
       spe.clear().apply()
    }

    var username: String?
        get() = sp.getString(Constants.SP_USERNAME, null)
        set(value) {
            spe.putString(Constants.SP_USERNAME, value)
            spe.apply()
        }

    var hasLogin: Boolean
        get() = sp.getBoolean(Constants.SP_HAS_LOGIN, false)
        set(value) = spe.putBoolean(Constants.SP_HAS_LOGIN, value).apply()

}