package com.mdgd.j_commons.ui.main

import com.mdgd.commons.contract.mvp.ViewContract


/**
 * Created by max
 * on 2/2/18.
 */

class SplashScreenContract {

    interface IPresenter : ViewContract.IPresenter<SplashScreenContract.IView>

    interface IView : ViewContract.IView
}
