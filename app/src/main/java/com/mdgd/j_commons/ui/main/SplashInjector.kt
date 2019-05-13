package com.mdgd.j_commons.ui.main

import com.mdgd.j_commons.QuakesApp
import com.mdgd.j_commons.components.IComponentProvider
import com.mdgd.commons.injection.IInjector

/**
 * Created by Owner
 * on 13/05/2019.
 */
class SplashInjector : IInjector<SplashScreenContract.IPresenter, SplashScreenContract.IView> {

    private val provider: IComponentProvider = QuakesApp.instance!!.provider

    override fun createPresenter(view: SplashScreenContract.IView): SplashScreenContract.IPresenter {
        return SplashPresenter(view)
    }
}
