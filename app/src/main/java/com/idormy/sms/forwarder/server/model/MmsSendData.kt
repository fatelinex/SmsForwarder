package com.idormy.sms.forwarder.server.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * 数据类 MmsSendData，用于表示发送彩信所需的数据。
 * 
 * @param subId 发送卡的subId，传入 -1 则 SmsManager.getDefault()
 * @param phoneNumbers 接收方的电话号码列表，用分号隔开
 * @param subject 彩信的主题
 * @param msgContent 彩信的文本内容
 * @param imageUrl 彩信的多媒体内容的 URL
 */
data class MmsSendData(
    @SerializedName("sim_slot")
    var simSlot: Int,
    @SerializedName("phone_numbers")
    var phoneNumbers: String,
    @SerializedName("image_url")
    var imageUrl: String
) : Serializable
