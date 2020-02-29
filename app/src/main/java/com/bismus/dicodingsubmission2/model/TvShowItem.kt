package com.bismus.dicodingsubmission2.model

import android.os.Parcel
import android.os.Parcelable

data class TvShowItem(val title:String, val rating:Double, val desc:String, val air_date:String, val eps:Int, val imgResId:Int):Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readDouble(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(title)
        dest?.writeDouble(rating)
        dest?.writeString(desc)
        dest?.writeString(air_date)
        dest?.writeInt(eps)
        dest?.writeInt(imgResId)

    }
    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TvShowItem> {
        override fun createFromParcel(parcel: Parcel): TvShowItem {
            return TvShowItem(parcel)
        }

        override fun newArray(size: Int): Array<TvShowItem?> {
            return arrayOfNulls(size)
        }
    }

}
