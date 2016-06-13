package org.wxc.running_man.presentation.presenter.base;

import org.wxc.running_man.domain.executor.Executor;
import org.wxc.running_man.domain.executor.MainThread;

/**
 * Created by wxc on 2016/6/14.
 */
public abstract class AbstractPresenter implements BasePresenter {

    protected Executor     mExecutor;
    protected MainThread   mMainThread;

    public AbstractPresenter(Executor executor,
                             MainThread mainThread) {
        this.mExecutor = executor;
        this.mMainThread = mainThread;
    }
}
