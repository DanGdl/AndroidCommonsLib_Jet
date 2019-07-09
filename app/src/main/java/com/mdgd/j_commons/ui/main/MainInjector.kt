package com.mdgd.j_commons.ui.main

import com.mdgd.commons.injection.IInjector
import com.mdgd.j_commons.QuakesApp
import com.mdgd.j_commons.core.IComponentProvider

/**
 * Created by Owner
 * on 13/05/2019.
 */
class MainInjector : IInjector<MainScreenContract.IPresenter, MainScreenContract.IView> {

    private val provider: IComponentProvider = QuakesApp.instance!!.provider

    override fun createPresenter(view: MainScreenContract.IView): MainScreenContract.IPresenter {
        return MainPresenter()
    }
}
