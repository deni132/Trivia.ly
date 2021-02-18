package com.responses;

import com.squareup.okhttp.OkHttpClient;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

public class RetrofitInstance {

    private static Retrofit retrofit;
    private static final String BASE_URL = "http://localhost:62067/api/";

    /**
     * Create an instance of Retrofit object
     * */
    public static Retrofit getRetrofitInstance() {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.interceptors().add(new RedirectInterceptor());
        okHttpClient.setFollowRedirects(false);
        okHttpClient.setFollowSslRedirects(false);
        
        if (retrofit == null) {
            retrofit = new retrofit.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
