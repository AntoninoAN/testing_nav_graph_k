package com.example.lowesweather.data.encrypt

import android.os.Build
import android.security.keystore.KeyGenParameterSpec
import android.security.keystore.KeyProperties
import javax.crypto.KeyGenerator

const val KEY_PROP_AES = KeyProperties.KEY_ALGORITHM_AES
const val KEY_PROP_RSA = KeyProperties.KEY_ALGORITHM_RSA
const val KEY_PROP_EC = KeyProperties.KEY_ALGORITHM_EC
const val ANDROID_KEY_STORE = "AndroidKeyStore"

object EncryptProcess {
    val keyGenerator = KeyGenerator.getInstance(
        KEY_PROP_AES,
        ANDROID_KEY_STORE
    )
    val keyGenParameterSpec =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            KeyGenParameterSpec.Builder(
                "dddd",
                KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT
            )
                .setBlockModes(KeyProperties.BLOCK_MODE_GCM)
                .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
                .build()
        } else {
            TODO("VERSION.SDK_INT < M")
        }
}

