object BuildPlugins {
    object Versions {
        const val buildToolsVersion = "4.1.1"
        const val kotlinVersion = "1.4.21"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
}

object Libraries {
    object Versions {
        const val ktx = "1.3.2"
        const val appComat = "1.2.0"
        const val material = "1.2.1"
        const val constraintLayout = "2.0.4"
    }

    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appComat}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val stdLib =
        "org.jetbrains.kotlin:kotlin-stdlib:${BuildPlugins.Versions.kotlinVersion}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
}

object TestLibraries {
    object Versions {
        const val junit = "4.13.1"
        const val ext = "1.1.2"
        const val espresso = "3.3.0"
    }

    const val jUnit = "junit:junit:${Versions.junit}"
    const val ext = "androidx.test.ext:junit:${Versions.ext}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}