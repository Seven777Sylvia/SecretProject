package yooco.uchain.secretproject.util;

import android.widget.Toast;

import yooco.uchain.secretproject.global.ApexWalletApplication;

/**
 * @author : Seven
 * @date : 2018/11/2
 */

public class ToastUtils {
    private Toast mToast;
    private static ToastUtils mToastUtils;

    private ToastUtils() {
        mToast = Toast.makeText(ApexWalletApplication.getInstance(), "", Toast.LENGTH_SHORT);
    }

    public static ToastUtils getInstance() {
        if (null == mToastUtils) {
            synchronized (ToastUtils.class) {
                if (null == mToastUtils) {
                    mToastUtils = new ToastUtils();
                }
            }
        }

        return mToastUtils;
    }

    public void showToast(String toastMsg) {
        mToast.setText(toastMsg);
        mToast.show();
    }

}
