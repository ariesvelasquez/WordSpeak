package view;

import android.app.Application;
import timber.log.Timber;

public class WordSpeakApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());
    }
}
