package com.example.gamegivewayapp.utils

enum class SortType(val realValue: String) {
    DATE("date"),
    VALUE("value"),
    POPULARITY("popularity")
}

enum class PlatformType(val realValue: String) {
    PC("pc"),
    PS4("ps4"),
    PS5("ps5"),
    ANDROID("android"),
    IOS("ios"),
    XBOX_360("xbox-360"),
    XBOX_ONE("xbox-one"),
    STEAM("steam")
}

enum class NewPlatformType(val realValue: String) {
    PC("pc"),
    PS4("playstation 4")
}