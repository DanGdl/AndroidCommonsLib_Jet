package com.mdgd.commons.contract.mvp;

public class BasicPresenter<T extends MvpContract.View> implements MvpContract.Presenter<T> {
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
