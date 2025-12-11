package com.ai.assistance.operit.ui.features.toolbox.screens.filemanager.models

/** Tab item data class */
data class TabItem(
    val path: String,
    val title: String
)

/** File item data class */
data class FileItem(
    val name: String,
    val isDirectory: Boolean,
    val size: Long = 0,
    val lastModified: Long = 0,
    val fullPath: String? = null
)
