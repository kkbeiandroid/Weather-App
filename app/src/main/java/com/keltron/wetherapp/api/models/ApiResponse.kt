package com.keltron.wetherapp.api.models

data class ApiResponse(
    val current: Current,
    val location: Location
)