package com.roy93group.pianokiss.ui

import android.os.Bundle
import com.loitpcore.annotation.IsFullScreen
import com.loitpcore.annotation.LogTag
import com.loitpcore.core.base.BaseFontActivity
import com.loitpcore.core.utilities.LAppResource
import com.loitpcore.core.utilities.LScreenUtil
import com.roy93group.pianokiss.R

@LogTag("MainActivity")
@IsFullScreen(false)
class MainActivity : BaseFontActivity() {

    override fun setLayoutResourceId(): Int {
        return R.layout.activity_main
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupViews()
    }

    private fun setupViews() {
        LScreenUtil.hideNavigationBar(this)
        setCustomStatusBar(
            colorStatusBar = LAppResource.getColor(R.color.purple_200),
            colorNavigationBar = LAppResource.getColor(R.color.purple_200)
        )
    }

}