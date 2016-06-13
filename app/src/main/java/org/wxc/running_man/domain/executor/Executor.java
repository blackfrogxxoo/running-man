package org.wxc.running_man.domain.executor;

import org.wxc.running_man.domain.interactors.base.AbstractInteractor;

/**
 * Created by wxc on 2016/6/13.
 */
public interface Executor {
    void execute(final AbstractInteractor interactor);
}
