package com.ai.assistance.operit.ui.floating.ui.window.models

// Define edge types
enum class ResizeEdge {
    NONE,
    LEFT,
    RIGHT,
    TOP,
    BOTTOM,
    TOP_LEFT,
    TOP_RIGHT,
    BOTTOM_LEFT,
    BOTTOM_RIGHT
}

// Custom linear interpolation function
fun lerp(start: Float, end: Float, fraction: Float): Float {
    return start + (end - start) * fraction.coerceIn(0f, 1f)
}
