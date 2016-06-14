package org.wxc.running_man.domain.interactors;

import org.wxc.running_man.domain.interactors.base.Interactor;
import org.wxc.running_man.domain.interactors.model.Award;

import java.util.List;

/**
 * Created by wxc on 2016/6/14.
 */
public interface ShowAwardsInteractor extends Interactor {

    interface Callback {
        void onAwardsShowed(List<Award> awards);

        void onNoAward();
    }
}
