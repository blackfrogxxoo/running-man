// (c)2016 Flipboard Inc, All Rights Reserved.

package org.wxc.running_man.network;

import org.wxc.running_man.model.GankBeautyResult;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface GankApi {
    @GET("data/Android/{number}/{page}")
    Observable<GankBeautyResult> getBeauties(@Path("number") int number, @Path("page") int page);
}
