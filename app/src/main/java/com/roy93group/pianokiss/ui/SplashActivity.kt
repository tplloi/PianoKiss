package com.roy93group.pianokiss.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import com.loitpcore.annotation.IsFullScreen
import com.loitpcore.annotation.LogTag
import com.loitpcore.core.base.BaseFontActivity
import com.loitpcore.core.utilities.LActivityUtil
import com.loitpcore.core.utilities.LScreenUtil
import com.loitpcore.core.utilities.LSocialUtil
import com.loitpcore.core.utilities.LUIUtil
import com.roy93group.pianokiss.BuildConfig
import com.roy93group.pianokiss.R
import kotlinx.android.synthetic.main.activity_splash.*

@SuppressLint("CustomSplashScreen")
@LogTag("SplashActivity")
@IsFullScreen(true)
class SplashActivity : BaseFontActivity() {

    override fun setLayoutResourceId(): Int {
        return R.layout.activity_splash
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupViews()
    }

    private fun setupViews() {
        LScreenUtil.hideNavigationBar(this)
        @SuppressLint("SetTextI18n")
        tvVs.text =
            "${getString(com.loitpcore.R.string.copyright)} - Ver: ${BuildConfig.VERSION_NAME}"

        LUIUtil.setOnClickListenerElastic(
            view = btStart,
            runnable = {
                start()
            }
        )
        LUIUtil.setOnClickListenerElastic(
            view = btPolicy,
            runnable = {
                LSocialUtil.openBrowserPolicy(context = this)
            }
        )
    }

    override fun onResume() {
        super.onResume()
        particleView.resume()
    }

    override fun onPause() {
        super.onPause()
        particleView.pause()
    }

    private fun start() {
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
        LActivityUtil.tranIn(this)
        this.finishAfterTransition()
    }

}
