package com.mdgd.j_commons.ui.main.fr.quake

import com.mdgd.commons.injection.IInjector
import com.mdgd.j_commons.QuakesApp
import com.mdgd.j_commons.core.IComponentProvider

/**
 * Created by Owner
 * on 13/05/2019.
 */
class QuakeInjector : IInjector<QuakeFragmentContract.IPresenter, QuakeFragmentContract.IView> {

    private val provider: IComponentProvider = QuakesApp.instance!!.provider

    override fun createPresenter(view: QuakeFragmentContract.IView): QuakeFragmentContract.IPresenter {
        return QuakeFragmentPresenter(provider.getRepo())
    }
}
