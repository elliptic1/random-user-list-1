package com.tbse.service.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Registered(
    val age: Int?,
    val date: String?
)