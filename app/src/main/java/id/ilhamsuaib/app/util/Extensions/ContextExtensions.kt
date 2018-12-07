package id.ilhamsuaib.app.util.Extensions

import android.content.Context
import android.widget.Toast

fun Context.toast(massage:String){
    Toast.makeText(this,massage,Toast.LENGTH_LONG).show()
}