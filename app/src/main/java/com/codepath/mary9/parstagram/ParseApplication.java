package com.codepath.mary9.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("cbdSZeNVUE6PIObMC3h6WCRGtW3DYZBqnSotdjo2")
                .clientKey("lyshX7U2vWgNFFPwNB5pgcCvTPo2lHNXYHBerKxc")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
