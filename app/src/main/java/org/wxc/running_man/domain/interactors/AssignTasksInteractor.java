package org.wxc.running_man.domain.interactors;

import org.wxc.running_man.domain.interactors.base.Interactor;
import org.wxc.running_man.domain.interactors.model.Project;
import org.wxc.running_man.domain.interactors.model.Task;

import java.util.List;

/**
 * Created by wxc on 2016/6/14.
 */
public interface AssignTasksInteractor extends Interactor{

    interface Callback {
        void onTasksAssigned(List<Task> tasks);
    }

    void assignByProject(Project project);
}
