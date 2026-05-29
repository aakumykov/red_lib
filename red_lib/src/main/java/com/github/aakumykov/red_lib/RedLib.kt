package com.github.aakumykov.red_lib

import android.util.Log

class RedLib {
    fun work() {
        Log.d(TAG, "work(v0.0.1)")
    }
    companion object {
        val TAG: String = RedLib::class.java.simpleName
    }
}