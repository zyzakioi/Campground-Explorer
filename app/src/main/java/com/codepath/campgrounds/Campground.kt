package com.codepath.campgrounds

import android.support.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

// TODO: Create a data class for the Data Response
@Keep@Serializable
data class CampgroundResponse(
    @SerialName("data")
    val data: List<Campground>?
):java.io.Serializable


// TODO: Implement remaining keys of the Campground data class
@Keep
@Serializable
data class Campground(
    @SerialName("name")
    val name: String?,
    @SerialName("description")
    val description: String?,
    @SerialName("latitude")
    val latitude: String?,
    @SerialName("longitude")
    val longitude: String?,
    @SerialName("images")
    val images: List<CampgroundImage>?
):java.io.Serializable{
    val imageUrl: String
        get() = images?.firstOrNull{!it.url.isNullOrEmpty()}?.url ?: ""
    val latLong: String
        get() = "lat:$latitude, lng:$longitude"
}

// TODO: Create a data class for the Image Response
@Keep
@Serializable
data class CampgroundImage(
    @SerialName("url")
    val url: String?,
    @SerialName("title")
    val title: String?
):java.io.Serializable