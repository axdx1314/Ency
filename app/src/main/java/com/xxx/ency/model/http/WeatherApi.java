package com.xxx.ency.model.http;

import com.xxx.ency.model.bean.WeatherBean;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 天气预报
 * Created by xiarh on 2017/9/25.
 */

public interface WeatherApi {

    String HOST = "https://free-api.heweather.com/";

    /**
     * 天气预报
     *
     * @param city
     * @return
     */
    @GET("v5/now")  //没有数据就填 . 或者 /
    Flowable<WeatherBean> getWeather(@Query("city") String city, @Query("key") String key);
}
