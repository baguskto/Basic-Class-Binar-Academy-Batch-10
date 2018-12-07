package id.ilhamsuaib.app.Activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import id.ilhamsuaib.app.util.Extensions.toast
import id.ilhamsuaib.app.R
import id.ilhamsuaib.app.data.PreferenceManager
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    lateinit var pref : PreferenceManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        pref = PreferenceManager(this)
        setupView()
        checkLogin()
    }

    private fun checkLogin() {

        if (pref.hasLogin) {
           goToMan()
        }
    }

    private fun setupView() {
        btnLogin.setOnClickListener {
            login()
        }
    }

    private fun login() {
        val username = edtUsername.text.toString()
        val password = edtPassword.text.toString()

        if (username.isBlank() || password.isBlank()) {
            toast("Username dan Password harus diisi")

            //munculin pesan bahwa username dan password harus diisi
            return
        }


        pref.username = username
        pref.hasLogin = true

        goToMan()
        //tampil pesan username dan password salah


        /**
         * untuk menampilkan pesan : Toast
         * untuk berpindah halaman : Intent
         * */
    }

    fun goToMan() {
        val gotoMain = Intent(this, MainActivity::class.java)
        startActivity(gotoMain)
        finish()
    }
}
