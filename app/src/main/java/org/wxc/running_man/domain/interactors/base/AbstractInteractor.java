package org.wxc.running_man.domain.interactors.base;

import org.wxc.running_man.domain.executor.Executor;
import org.wxc.running_man.domain.executor.MainThread;

/**
 * Created by wxc on 2016/6/13.
 */
public abstract class AbstractInteractor implements Interactor {

    protected Executor     mExecutor;
    protected MainThread   mMainThread;

    protected volatile boolean mIsCanceled;
    protected volatile boolean mIsRunning;

    public AbstractInteractor(Executor executor,
                              MainThread mainThread) {
        this.mExecutor = executor;
        this.mMainThread = mainThread;
    }

    public abstract void run();

    public void cancel() {
        mIsCanceled = true;
        mIsRunning = false;
    }

    public boolean isRunning() {
        return mIsRunning;
    }

    public void onFinished() {
        mIsRunning = false;
        mIsCanceled = false;
    }

    public void execute() {

        this.mIsRunning = true;

        mExecutor.execute(this);
    }
}
