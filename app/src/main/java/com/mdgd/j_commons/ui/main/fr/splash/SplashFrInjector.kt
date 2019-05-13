package com.mdgd.j_commons.ui.main.fr.splash

import com.mdgd.j_commons.QuakesApp
import com.mdgd.j_commons.components.IComponentProvider
import com.mdgd.commons.injection.IInjector

/**
 * Created by Owner
 * on 13/05/2019.
 */
class SplashFrInjector : IInjector<SplashFragmentContract.IPresenter, SplashFragmentContract.IView> {

    private val provider: IComponentProvider = QuakesApp.instance!!.provider

    override fun createPresenter(view: SplashFragmentContract.IView): SplashFragmentContract.IPresenter {
        return SplashFragmentPresenter(view)
    }
}
