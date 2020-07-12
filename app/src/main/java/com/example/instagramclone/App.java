package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("cyh3MJN8rheYko2Pj0NFfGyJwafrcoMVaI8ntawL")
                // if defined
                .clientKey("0N8vVaUvIzmDCM4gkJo9LrEagUVe4tnXN4mzKCZv")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }


}
