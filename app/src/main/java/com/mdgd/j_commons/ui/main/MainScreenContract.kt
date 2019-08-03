package com.mdgd.j_commons.ui.main

import com.mdgd.commons.contract.activity.ActivityContract


/**
 * Created by max
 * on 2/2/18.
 */

class MainScreenContract {

    interface Presenter : ActivityContract.IPresenter<MainScreenContract.View>

    interface View : ActivityContract.View
}
