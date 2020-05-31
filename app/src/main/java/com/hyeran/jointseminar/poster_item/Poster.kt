package com.hyeran.jointseminar.poster_item

import android.content.Context

class Poster(
    var poster :String
) {
    fun getImageID(context: Context):Int {
        return context.resources.getIdentifier(poster,"drawable",context.packageName)
    }
}