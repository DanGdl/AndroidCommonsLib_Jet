package com.mdgd.commons.contract.activity;

import com.mdgd.commons.contract.mvp.MvpContract;

/**
 * Created by Max
 * on 05/09/2018.
 */
public class ActivityContract {

    public interface IPresenter<T extends View> extends MvpContract.Presenter<T> {
    }

    public interface View extends MvpContract.View {

        String getString(int id);

        String getString(int id, Object... args);

        boolean isFinishing();

        String getPackageName();

        void finish();

        void onBackPressed();
    }
}
