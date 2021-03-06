package com.akexorcist.screenchecker

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Resolution(
    var x: Int,
    var y: Int
) : Parcelable
