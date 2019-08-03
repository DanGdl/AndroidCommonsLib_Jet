package com.mdgd.j_commons.ui.main.fr.quackes

import com.mdgd.commons.contract.fragment.FragmentContract
import com.mdgd.j_commons.dto.Quake
import com.mdgd.j_commons.dto.SearchParams
import java.util.*
import kotlin.collections.ArrayList

/**
 * Created by max
 * on 2/2/18.
 */

class QuakesFragmentContract {

    interface View : FragmentContract.View {
        fun setState(state: State)
    }

    interface Host : FragmentContract.Host

    interface Presenter : FragmentContract.Presenter<View> {
        fun searchQuakes(searchParams: SearchParams?)

        fun checkNewEarthQuakes()

        fun getNextBulk(lastDate: Date)
    }

    class State(val showProgress: Boolean, val showError: Boolean, val errorMessage: String?, val isFirstPage: Boolean, val updateData: Boolean, val data: List<Quake>) {
        companion object {

            fun showProgressState(showProgress: Boolean): State {
                return State(showProgress, false, "", false, false, ArrayList(0))
            }

            fun showErrorState(showError: Boolean, errorMessage: String?): State {
                return State(false, showError, errorMessage, false, false, ArrayList(0))
            }

            fun newDataState(page: Int, data: List<Quake>): State {
                return State(false, false, "", 1 == page, true, data)
            }
        }
    }
}
