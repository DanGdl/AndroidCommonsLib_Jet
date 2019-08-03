package com.mdgd.commons.contract.mvp;

import com.mdgd.commons.contract.ToastDecor;
import com.mdgd.commons.contract.progress.ProgressContainer;

public class MvpContract {

    public interface Presenter<T extends MvpContract.View> {
        void onAttach(T view);

        void onDetach();
    }

    public interface View extends ProgressContainer, ToastDecor {

    }
}
