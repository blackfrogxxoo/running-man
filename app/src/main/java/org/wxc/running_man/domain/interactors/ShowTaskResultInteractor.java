package org.wxc.running_man.domain.interactors;

import org.wxc.running_man.domain.interactors.base.Interactor;
import org.wxc.running_man.domain.interactors.model.TaskResult;

import java.util.List;

/**
 * Created by wxc on 2016/6/14.
 */
public interface ShowTaskResultInteractor extends Interactor {

    interface Callback {
        void onTaskResultsShowed(List<TaskResult> results);
    }
}
