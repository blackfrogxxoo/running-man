package org.wxc.running_man.presentation.presenter.base;

/**
 * Created by wxc on 2016/6/14.
 */
public interface BasePresenter {

    void resume();

    void pause();

    void stop();

    void destroy();

    void onError(String message);
}
