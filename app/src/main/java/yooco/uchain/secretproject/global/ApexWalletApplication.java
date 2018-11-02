package yooco.uchain.secretproject.global;

import android.app.Application;
import android.content.res.Configuration;

import yooco.uchain.secretproject.util.CpLog;
import yooco.uchain.secretproject.util.PhoneUtils;

/**
 * @author : Seven
 * @date : 2018/11/2
 */

public class ApexWalletApplication extends Application {

    private static final String TAG = ApexWalletApplication.class.getSimpleName();

    private static ApexWalletApplication sApexWalletApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        CpLog.i(TAG, "ApexWalletApplication start!");
        sApexWalletApplication = this;
       /* TaskController.getInstance().doInit();
        ApexListeners.getInstance().doInit();
        ApexGlobalTask.getInstance().doInit();*/
        PhoneUtils.setLanguage();
    }

    public static ApexWalletApplication getInstance() {
        return sApexWalletApplication;
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        PhoneUtils.setLanguage();
    }
}