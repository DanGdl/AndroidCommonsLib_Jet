package com.mdgd.j_commons.ui.main

import com.mdgd.j_commons.mvp.Presenter

/**
 * Created by max
 * on 04/10/17.
 */

class SplashPresenter(view: SplashScreenContract.IView) : Presenter<SplashScreenContract.IView>(view),
        SplashScreenContract.IPresenter
