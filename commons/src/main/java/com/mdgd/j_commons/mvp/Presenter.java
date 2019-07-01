package com.mdgd.j_commons.mvp;

import com.mdgd.commons.contract.mvp.ViewContract;

/**
 * Created by Max
 * on 08/10/2017.
 */

public abstract class Presenter<T extends ViewContract.IView> implements ViewContract.IPresenter<T> {
    protected T view;

    @Override
    public void onAttach(T view) {
        this.view = view;
    }

    @Override
    public void onDetach() {
        view = null;
    }
}
