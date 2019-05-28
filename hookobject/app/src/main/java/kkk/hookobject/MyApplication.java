


package kkk.hookobject;

import android.app.Application;

import com.iflytek.voiceads.config.SDKLogger;
import com.iflytek.voiceads.dex.DexLoader;

/*

    @author admin
    继承Application
*/



public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        /*1.植入广告*/
        SDKLogger.setDebug(true);
        DexLoader.initIFLYADModule(getApplicationContext());
    }
}
