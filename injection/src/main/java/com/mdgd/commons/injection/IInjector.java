package com.mdgd.commons.injection;

/**
 * Created by Owner
 * on 13/05/2019.
 */
public interface IInjector<P, V> {

    P createPresenter(V view);
}