package com.Zlamanyuk_Telyatnikova.androidstudio_lab17_18.data

data class WeatherData (
    val temperature: Int? = null,
    val humidity: Int? = null,
    val windSpeed: Int? = null,
    val weatherIndex: Int? = null,
    val isLoading: Boolean = false,
    val error: String? = null,
    val loadingProgress: String = ""
)