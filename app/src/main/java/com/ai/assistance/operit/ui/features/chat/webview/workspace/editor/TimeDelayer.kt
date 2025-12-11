package com.ai.assistance.operit.ui.features.chat.webview.workspace.editor

/**
 * Time delay utility
 */
class TimeDelayer(private val delayTime: Long) {
    private var lastTime: Long = 0

    /**
     * Update the last timestamp
     */
    fun updateLastTime() {
        lastTime = System.currentTimeMillis()
    }

    /**
     * Determine whether the delay time has elapsed
     */
    fun isExceed(): Boolean {
        val currentTime = System.currentTimeMillis()
        if (currentTime - lastTime > delayTime) {
            lastTime = currentTime
            return true
        }
        return false
    }
} 
