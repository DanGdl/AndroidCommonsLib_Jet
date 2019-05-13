package com.mdgd.j_commons.ui.main

import androidx.fragment.app.Fragment
import com.mdgd.commons.support.v7.fragment.HostActivity
import com.mdgd.j_commons.ui.main.fr.quackes.EarthQuakesFragment
import com.mdgd.j_commons.ui.main.fr.splash.SplashFragment

/**
 * Created by Max
 * on 01-May-17.
 */

class SplashActivity : HostActivity<SplashScreenContract.IPresenter>(), SplashScreenContract.IView {

    override fun getPresenter(): SplashScreenContract.IPresenter {
        return SplashInjector().createPresenter(this)
    }

    override fun getFirstFragment(): Fragment {
        container.postDelayed({ proceedFromSplash() }, 600L)
        return SplashFragment.newInstance()
    }

    private fun proceedFromSplash() {
        replaceFragment(EarthQuakesFragment.newInstance())
    }

    override fun onRetainCustomNonConfigurationInstance(): Any {
        return super.onRetainCustomNonConfigurationInstance()
    }

    override fun getLastNonConfigurationInstance(): Any? {
        return super.getLastNonConfigurationInstance()
    }
}
