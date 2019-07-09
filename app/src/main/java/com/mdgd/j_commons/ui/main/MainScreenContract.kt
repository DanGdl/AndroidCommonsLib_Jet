package com.mdgd.j_commons.ui.main

import com.mdgd.commons.contract.mvp.ViewContract


/**
 * Created by max
 * on 2/2/18.
 */

class MainScreenContract {

    interface IPresenter : ViewContract.IPresenter<MainScreenContract.IView>

    interface IView : ViewContract.IView
}
