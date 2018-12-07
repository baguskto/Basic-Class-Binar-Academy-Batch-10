package id.ilhamsuaib.app.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.ilhamsuaib.app.R
import kotlinx.android.synthetic.main.fragment_profile.view.*
import id.ilhamsuaib.app.data.PreferenceManager

class ProfileFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView(view)
    }

    private fun setupView(view: View) {
        val pref = PreferenceManager(view.context)
        view.tvUsername.text = pref.username
    }

}