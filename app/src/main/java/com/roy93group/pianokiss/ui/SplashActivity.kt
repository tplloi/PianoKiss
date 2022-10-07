package com.roy93group.pianokiss.ui

import android.annotation.SuppressLint
import android.os.Bundle
import com.loitpcore.annotation.IsFullScreen
import com.loitpcore.annotation.LogTag
import com.loitpcore.core.base.BaseFontActivity
import com.loitpcore.core.utilities.LSocialUtil
import com.loitpcore.core.utilities.LUIUtil
import com.roy93group.pianokiss.BuildConfig
import com.roy93group.pianokiss.R
import kotlinx.android.synthetic.main.activity_splash.*

@SuppressLint("CustomSplashScreen")
@LogTag("SplashActivity")
@IsFullScreen(false)
class SplashActivity : BaseFontActivity() {
    private var isAnimDone = false

    override fun setLayoutResourceId(): Int {
        return R.layout.activity_splash
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupViews()
    }

    private fun setupViews() {
        LUIUtil.setDelay(
            mls = 2000,
            runnable = {
                isAnimDone = true
                goToHome()
            }
        )
        @SuppressLint("SetTextI18n")
        textViewVersion.text = "Version ${BuildConfig.VERSION_NAME}"
        tvPolicy.setOnClickListener {
            LSocialUtil.openBrowserPolicy(context = this)
        }
    }

    override fun onResume() {
        super.onResume()
        particleView.resume()
    }

    override fun onPause() {
        super.onPause()
        particleView.pause()
    }

    private fun goToHome() {
        if (isAnimDone) {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//            LActivityUtil.tranIn(this)
//            this.finishAfterTransition()
        }
    }

}
