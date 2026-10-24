plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "org.primeshows.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "org.primeshows.app"
        minSdk = 23
        targetSdk = 28
        versionCode = 1
        versionName = "1.0"
    }
}
