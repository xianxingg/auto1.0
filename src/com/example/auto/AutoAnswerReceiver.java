package com.example.auto;

import java.lang.reflect.Method;

import com.android.internal.telephony.ITelephony;
import com.android.internal.telephony.ITelephony;
import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.media.AudioManager;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.provider.ContactsContract.PhoneLookup;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.KeyEvent;
import android.telephony.TelephonyManager;

public class AutoAnswerReceiver extends BroadcastReceiver {
	private static final String TELEPHONY_SERVICE = null;

	@Override
	public void onReceive(Context context, Intent intent) {
			context.startService(new Intent(context, AutoAnswerIntentService.class));
			Log.d("AutoAnswer startService","Error1");	
			
			//采用调用Service的方法接听电话
			AutoAnswerIntentService at = new AutoAnswerIntentService();
			try {
				at.answerPhoneAidl(context);
				//answerPhoneAidl(context);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Log.d("answerPhoneAidl","Error2");	
	}		
	

}

