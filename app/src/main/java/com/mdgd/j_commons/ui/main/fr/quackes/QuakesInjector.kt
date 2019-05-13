package com.mdgd.j_commons.ui.main.fr.quackes

import com.mdgd.j_commons.QuakesApp
import com.mdgd.j_commons.components.IComponentProvider
import com.mdgd.commons.injection.IInjector

/**
 * Created by Owner
 * on 13/05/2019.
 */
class QuakesInjector : IInjector<QuakesFragmentContract.IPresenter, QuakesFragmentContract.IView> {

    private val provider: IComponentProvider = QuakesApp.instance!!.provider

    override fun createPresenter(view: QuakesFragmentContract.IView): QuakesFragmentContract.IPresenter {
        return QuakesFragmentPresenter(view, provider.getRepo())
    }
}
