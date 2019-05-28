package kkk.hookobject;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.iflytek.voiceads.IFLYBannerAd;
import com.iflytek.voiceads.config.AdError;
import com.iflytek.voiceads.config.AdKeys;
import com.iflytek.voiceads.config.SDKLogger;
import com.iflytek.voiceads.dex.DexLoader;
import com.iflytek.voiceads.listener.IFLYAdListener;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "kkk";
    private final static String adUnitId = "";

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.lv_View);
        listView.setAdapter(new MyAdapter());
    }

    class MyAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return 20;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup viewGroup) {
            View view;
            if(convertView == null)
            {
                view = View.inflate(getApplicationContext(), R.layout.item_view, null);
            }
            else
            {
                view = convertView;
            }

            return view;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }
    }

    public void onClick(View view)
    {
        Log.d(TAG, "onClick: 我被点击了");
        viewlog();

        /*2*/
        //创建横幅广告：adUnitId：开发者在讯飞AI营销云平台(http://www.voiceads.cn/)申请的横幅广告位 ID
        final IFLYBannerAd bannerAd = IFLYBannerAd.createBannerAd(MainActivity.this, adUnitId);

        //设置为调试模式
        bannerAd.setParameter(AdKeys.DEBUG_MODE, true);
        //下载广告前，弹窗提示
//        bannerAd.setParameter(AdKeys.DOWNLOAD_ALERT,true);
        //设置当前APP版本号
//        bannerAd.setParameter(AdKeys.APP_VER, "1.0");
//
//        //广告容器添加bannerAd
//        LinearLayout layout_ads = (LinearLayout)findViewById(R.id.root);
//        layout_ads.removeAllViews();
//        layout_ads.addView(bannerAd);

//        IFLYAdListener mAdListener = new IFLYAdListener() {
//            /**
//             * 广告请求成功
//             */
//            @Override
//            public void onAdReceive() {
//                //展示广告
//                bannerAd.showAd();
//                Log.d("Ad_Android_Demo", "request success");
//            }
//
//            /**
//             * 获取广告失败
//             */
//            @Override
//            public void onAdFailed(AdError error) {
//                Log.d("Ad_Android_Demo", "request failed:" + error.getErrorCode() + "," + error.getErrorDescription());
//            }
//
//            /**
//             * 广告被点击
//             */
//            @Override
//            public void onAdClick() {
//                Log.d("Ad_Android_Demo", "onAdClick");
//            }
//
//            /**
//             * 广告被关闭
//             */
//            @Override
//            public void onAdClose() {
//                Log.d("Ad_Android_Demo", "onAdClose");
//            }
//
//            /**
//             * 广告曝光
//             */
//            @Override
//            public void onAdExposure() {
//                Log.d("Ad_Android_Demo", "onAdExposure");
//            }
//
//            /**
//             * 下载确认
//             */
//            @Override
//            public void onConfirm() {
//                Log.d("Ad_Android_Demo", "onConfirm");
//            }
//
//            /**
//             * 下载取消
//             */
//            @Override
//            public void onCancel() {
//                Log.d("Ad_Android_Demo", "onCancel");
//            }
//        };

        //请求广告，添加监听器
//        bannerAd.loadAd(mAdListener);

    }

    public void viewlog()
    {
        Log.d(TAG, "onClick: 我被调用了");
    }
}
