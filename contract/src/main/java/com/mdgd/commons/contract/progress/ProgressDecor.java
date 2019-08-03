package com.mdgd.commons.contract.progress;

/**
 * Created by Max
 * on 05/09/2018.
 */
public interface ProgressDecor {

    void show();

    boolean isShowing();

    void dismiss();
}
