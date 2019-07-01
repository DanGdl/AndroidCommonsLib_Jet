package com.mdgd.commons.contract.fragment;

import com.mdgd.commons.contract.IToast;
import com.mdgd.commons.contract.progress.IProgressContainer;

/**
 * Created by Max
 * on 05/09/2018.
 */
public class FragmentContract {

    public interface IHost extends IProgressContainer, IToast {

        void finish();

        void onBackPressed();

        boolean isFinishing();
    }

    public interface IPresenter<V extends FragmentContract.IView> {
        void onAttach(V view);

        void onDetach();
    }

    public interface IView extends IProgressContainer, IToast {
    }
}
