package com.bismus.dicodingsubmission2.model

import android.os.Parcel
import android.os.Parcelable

data class MovieItem(val title:String, val release:Int, val rate:Double, val desc:String, val imgResId:Int ):Parcelable{
    constructor(parcel:Parcel):this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readDouble(),
        parcel.readString(),
        parcel.readInt()
    )
    override fun writeToParcel(parcel: Parcel,flags:Int){
        parcel.writeString(title)
        parcel.writeInt(release)
        parcel.writeDouble(rate)
        parcel.writeString(desc)
        parcel.writeInt(imgResId)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MovieItem> {
        override fun createFromParcel(parcel: Parcel): MovieItem {
            return MovieItem(parcel)
        }

        override fun newArray(size: Int): Array<MovieItem?> {
            return arrayOfNulls(size)
        }
    }

}