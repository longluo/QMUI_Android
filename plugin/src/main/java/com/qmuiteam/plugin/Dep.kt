package com.qmuiteam.plugin

import org.gradle.api.JavaVersion

object Dep {

    val javaVersion = JavaVersion.VERSION_11
    const val kotlinJvmTarget = "11"
    const val compileSdk = 31
    const val minSdk = 21
    const val targetSdk = 31


    object QMUI {
        const val group = "com.qmuiteam"
        const val qmuiVer = "2.0.1"
        const val archVer = "2.0.1"
        const val typeVer = "0.0.14"
        const val composeVer = "0.0.1"
    }

    object AndroidX {
        val appcompat = "androidx.appcompat:appcompat:1.4.0"
        val annotation = "androidx.annotation:annotation:1.3.0"
        val coreKtx = "androidx.core:core-ktx:1.7.0"
        val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.2"
        val swiperefreshlayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"
        val fragment = "androidx.fragment:fragment:1.4.0"
    }

    object Compose {
        val version = "1.1.0-rc01"
        val animation = "androidx.compose.animation:animation:$version"
        val ui = "androidx.compose.ui:ui:$version"
        val material = "androidx.compose.material:material:$version"
        val compiler = "androidx.compose.compiler:compiler:$version"
    }

    object Flipper {
        private const val version = "0.96.1"
        const val soLoader = "com.facebook.soloader:soloader:0.10.1"
        const val flipper = "com.facebook.flipper:flipper:$version"
    }

    object MaterialDesign {
        const val material = "com.google.android.material:material:1.4.0"
    }

    object CodeGen {
        const val javapoet = "com.squareup:javapoet:1.13.0"
        const val autoService = "com.google.auto.service:auto-service:1.0-rc2"
    }

    object ButterKnife {
        private const val ver = "10.1.0"
        const val butterknife = "com.jakewharton:butterknife:$ver"
        const val compiler = "com.jakewharton:butterknife-compiler:$ver"
    }
}