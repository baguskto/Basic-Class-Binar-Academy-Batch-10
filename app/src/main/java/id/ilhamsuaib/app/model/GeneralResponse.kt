package id.ilhamsuaib.app.model

import com.google.gson.annotations.SerializedName
//T= Type

data class GeneralResponse<out T> (

        @field:SerializedName("status")
        val staus: String?,

        @field:SerializedName("data")
        val data: T?,

        @field:SerializedName("error")
        val error: ResponseErrorModel?
)
