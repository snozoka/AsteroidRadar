package com.udacity.asteroidradar

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PictureOfDay(
    val date: String,
    val explanation: String,
    @Json(name = "hdurl") val hdUrl: String,
    @Json(name = "media_type") val mediaType: String,
    val service_version: String,
    val title: String,
    val url: String
    ): Parcelable {
    val isImage
    get() = mediaType == "image"
}