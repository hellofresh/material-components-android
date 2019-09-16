package com.google.android.material.tabs

interface WeeklyNavAdapter {

    fun getTabView(position: Int): Pair<Int, TitleIds>

    fun getCustomViewBackgroundId(position: Int): Int

    fun getSelectionColor(position: Int): Int

    fun getTitle(position: Int): Title

    data class Title(
        val weekDay: String,
        val monthDay: String,
        val month: String
    )

    data class TitleIds(
        val weekDay: Int,
        val monthDay: Int,
        val month: Int
    )
}
