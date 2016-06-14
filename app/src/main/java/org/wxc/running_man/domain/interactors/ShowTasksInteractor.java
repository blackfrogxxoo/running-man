package org.wxc.running_man.domain.interactors;

import org.wxc.running_man.domain.interactors.base.Interactor;
import org.wxc.running_man.domain.interactors.model.Task;

import java.util.List;

/**
 * Created by wxc on 2016/6/14.
 */
public interface ShowTasksInteractor extends Interactor {

    interface Callback {
        void onTasksShowed(int projectId, List<Task> tasks);
    }

    void getTasksByProjectId(int projectId);
}
