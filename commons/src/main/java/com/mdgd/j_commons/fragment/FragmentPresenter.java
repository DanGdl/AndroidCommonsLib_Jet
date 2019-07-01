package com.mdgd.j_commons.fragment;

import com.mdgd.commons.contract.fragment.FragmentContract;

/**
 * Created by Max
 * on 08/10/2017.
 */

public abstract class FragmentPresenter<T extends FragmentContract.IView> implements FragmentContract.IPresenter<T> {
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
