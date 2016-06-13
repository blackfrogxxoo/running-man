package org.wxc.running_man.domain.executor;

/**
 * Created by wxc on 2016/6/14.
 */
public interface MainThread {
    void post(final Runnable runnable);
}
