package com.ai.assistance.operit.ui.features.chat.webview.workspace.editor

import android.content.Context

/**
 * Dimension conversion utility
 */
object DpiUtils {
    /**
     * Convert dp to pixels
     */
    fun dip2px(context: Context, dpValue: Float): Int {
        val scale = context.resources.displayMetrics.density
        return (dpValue * scale + 0.5f).toInt()
    }

    /**
     * Convert pixels to dp
     */
    fun px2dip(context: Context, pxValue: Float): Int {
        val scale = context.resources.displayMetrics.density
        return (pxValue / scale + 0.5f).toInt()
    }
} 
