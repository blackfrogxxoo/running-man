package org.wxc.running_man.domain.interactors;

import org.wxc.running_man.domain.interactors.base.Interactor;
import org.wxc.running_man.domain.interactors.model.Project;

/**
 * Created by wxc on 2016/6/14.
 */
public interface AddProjectInteractor extends Interactor {

    interface Callback {
        void onProjectAdd(Project project);
    }
}
