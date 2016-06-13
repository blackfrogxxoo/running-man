package org.wxc.running_man.presentation.ui;

/**
 * Created by wxc on 2016/6/14.
 */
public interface BaseView {

    void showProgress();

    void hideProgress();

    void showError(String message);
}
