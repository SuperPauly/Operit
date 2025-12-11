package com.ai.assistance.operit.ui.floating.ui.ball

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ai.assistance.operit.ui.floating.FloatContext
import com.ai.assistance.operit.ui.floating.FloatingMode

/**
 * Floating result display component / 显示结果的悬浮组件
 * Currently only shows a simple "Hello" bubble / 目前只显示一个简单的"你好"气泡
 */
@Composable
fun FloatingResultDisplay(floatContext: FloatContext) {
    // Get the content of the last message / 获取最后一条消息的内容
    val lastMessage = floatContext.messages.lastOrNull()
    val displayText = if (lastMessage != null && lastMessage.sender == "ai") {
        lastMessage.content
    } else {
        getDefaultGreetingCn()
    }

    Box(
        modifier = Modifier
            .background(Color.Transparent) // Transparent background / 背景透明
            .clickable { 
                // Click to switch back to ball mode / 点击切回球模式
                floatContext.onModeChange(FloatingMode.BALL) 
            },
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .background(Color.White, RoundedCornerShape(12.dp))
                .clickable { floatContext.onModeChange(FloatingMode.BALL) }
                .padding(horizontal = 16.dp, vertical = 10.dp)
        ) {
            Text(
                text = displayText,
                color = Color.Black,
                fontSize = 16.sp
            )
        }
    }
}

/** Get default greeting text in English */
fun getDefaultGreetingEn() = "Hello"

/** Get default greeting text in Chinese / 获取默认问候语（中文） */
fun getDefaultGreetingCn() = "你好"
