package net.tjtorrico.tipcalc;

import android.app.Application;

/**
 * Created by TJT on 08/06/2016.
 */
public class TipCalcApp extends Application {
    private static final String ABOUT_URL = "https://about.me/adriancatalan";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
