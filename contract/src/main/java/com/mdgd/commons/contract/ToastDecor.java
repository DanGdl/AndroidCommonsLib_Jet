package com.mdgd.commons.contract;

/**
 * Created by Max
 * on 23/07/2018.
 */
public interface ToastDecor {

    void showToast(int msgRes);

    void showToast(int msgRes, Object... args);
}
