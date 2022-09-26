package com.zerofour

import android.app.Application
import android.content.Context
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import com.zerofour.realqueenblack.REALQUEENCONST.MAIN_ID
import com.zerofour.realqueenblack.REALQUEENCONST.ONESIGNAL_APP_ID
import com.zerofour.realqueenblack.RealQueenAdv
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class AppQueenClass : Application() {
    override fun onCreate() {
        super.onCreate()
        Hawk.init(this).build()
        GlobalScope.launch(Dispatchers.IO) {
            vxffsfdwqd(context = applicationContext)
        }
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }

    private suspend fun vxffsfdwqd(context: Context) {
        val advertisingInfo = RealQueenAdv(context)
        val idInfo = advertisingInfo.pwoqoeqoweqwed()
        Hawk.put(MAIN_ID, idInfo)
    }
}