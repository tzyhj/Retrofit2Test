package com.qc.retrofit2test;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceManager {

    @GET("index.php")
    Call<ResponseBody> getInfo();

}
