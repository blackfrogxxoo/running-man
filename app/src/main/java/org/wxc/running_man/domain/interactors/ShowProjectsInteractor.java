package org.wxc.running_man.domain.interactors;

import org.wxc.running_man.domain.interactors.base.Interactor;
import org.wxc.running_man.domain.interactors.model.Project;

import java.util.List;

/**
 * Created by wxc on 2016/6/15.
 */
public interface ShowProjectsInteractor extends Interactor{

    interface Callback {
        void onProjectsShowed(List<Project> projects);
    }
}
