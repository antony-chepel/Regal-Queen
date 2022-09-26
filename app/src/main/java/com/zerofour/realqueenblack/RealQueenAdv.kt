package com.zerofour.realqueenblack

import android.content.Context
import android.util.Log
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RealQueenAdv(val context: Context) {
    private val sjajjjsahd = AdvertisingIdClient(context.applicationContext)

    suspend fun pwoqoeqoweqwed(): String =
        withContext(Dispatchers.IO) {
            sjajjjsahd.start()
            val adIdInfo = sjajjjsahd.info
            Log.d("getAdvertisingId = ",adIdInfo.id.toString())
            sjajjjsahd.finish()
            adIdInfo.id
        }

}