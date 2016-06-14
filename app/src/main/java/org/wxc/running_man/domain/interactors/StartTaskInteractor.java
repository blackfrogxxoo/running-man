package org.wxc.running_man.domain.interactors;

import org.wxc.running_man.domain.interactors.base.Interactor;
import org.wxc.running_man.domain.interactors.model.TaskResult;

/**
 * Created by wxc on 2016/6/14.
 */
public interface StartTaskInteractor extends Interactor {

    interface Callback {
        void onProgress(float progress);

        void onCompleted(TaskResult result);

        void onPaused();
    }
}
