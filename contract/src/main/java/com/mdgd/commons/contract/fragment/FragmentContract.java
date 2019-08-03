package com.mdgd.commons.contract.fragment;

import com.mdgd.commons.contract.ToastDecor;
import com.mdgd.commons.contract.mvp.MvpContract;
import com.mdgd.commons.contract.progress.ProgressContainer;

/**
 * Created by Max
 * on 05/09/2018.
 */
public class FragmentContract {

    public interface Host extends ProgressContainer, ToastDecor {

        void finish();

        void onBackPressed();

        boolean isFinishing();
    }

    public interface Presenter<V extends View> extends MvpContract.Presenter<V> {
    }

    public interface View extends MvpContract.View {
    }
}
