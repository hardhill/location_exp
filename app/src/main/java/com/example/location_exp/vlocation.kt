package com.example.location_exp

data class vlocation(val latitude: Double, val longitude: Double) {
    var text = "${latitude} ${longitude}"
}