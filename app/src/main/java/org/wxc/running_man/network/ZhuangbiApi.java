// (c)2016 Flipboard Inc, All Rights Reserved.

package org.wxc.running_man.network;

import org.wxc.running_man.model.ZhuangbiImage;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface ZhuangbiApi {
    @GET("search")
    Observable<List<ZhuangbiImage>> search(@Query("q") String query);

}
