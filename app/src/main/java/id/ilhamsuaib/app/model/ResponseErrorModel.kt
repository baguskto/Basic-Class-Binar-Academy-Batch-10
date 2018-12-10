package id.ilhamsuaib.app.model

import com.google.gson.annotations.SerializedName

data class ResponseErrorModel(
        @field:SerializedName("message")
        val message: String?,

        @field:SerializedName("code")
        val code: Int?
)