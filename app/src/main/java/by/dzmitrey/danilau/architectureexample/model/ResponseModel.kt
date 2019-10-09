package by.dzmitrey.danilau.architectureexample.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val firstName: String,
    @SerializedName("username")
    val secondName: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("address")
    val address: UserAddress
)

data class UserAddress(
    @SerializedName("street")
    val street: String,
    @SerializedName("suite")
    val suite: String,
    @SerializedName("city")
    val city: String
)