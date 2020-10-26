package com.uc.katalog.util;

import androidx.annotation.StringDef;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

public class Constants {
    public static final String BASE_URL = "https://api.themoviedb.org/3/";
    public static final String BASE_IMAGE_URL = "https://image.tmdb.org/t/p/original";
    public static final String API_KEY = "f5c73358f894d04b779524b58631b7d9";

    @Retention(SOURCE)
    @StringDef
    public @interface Type {
        String MOVIES = "movie";
        String TVSHOWS = "tv";
    }
}
