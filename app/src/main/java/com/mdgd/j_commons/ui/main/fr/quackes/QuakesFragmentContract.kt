package com.mdgd.j_commons.ui.main.fr.quackes

import com.mdgd.commons.contract.fragment.FragmentContract
import com.mdgd.j_commons.dto.Quake
import com.mdgd.j_commons.dto.SearchParams
import java.util.*

/**
 * Created by max
 * on 2/2/18.
 */

class QuakesFragmentContract {

    interface IView : FragmentContract.IView {
        fun updateEarthQuakes(quakes: List<Quake>)
        fun decreasePage()
    }

    interface IHost : FragmentContract.IHost

    interface IPresenter : FragmentContract.IPresenter<QuakesFragmentContract.IView> {
        fun searchQuakes(searchParams: SearchParams?)

        fun checkNewEarthQuakes()

        fun getNextBulk(lastDate: Date)
    }
}
