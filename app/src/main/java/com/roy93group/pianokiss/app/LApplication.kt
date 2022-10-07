package com.roy93group.pianokiss.app

import com.loitpcore.annotation.LogTag
import com.loitpcore.core.base.BaseApplication
import com.loitpcore.core.common.Constants
import com.loitpcore.core.utilities.LUIUtil
import com.loitpcore.data.ActivityData

//TODO keystore

//done
//ic_launcher

@LogTag("LApplication")
class LApplication : BaseApplication() {

    override fun onCreate() {
        super.onCreate()

        setupApp()
    }

    private fun setupApp() {
        ActivityData.instance.type = Constants.TYPE_ACTIVITY_TRANSITION_SLIDE_LEFT
        LUIUtil.fontForAll = Constants.FONT_PATH
    }
}