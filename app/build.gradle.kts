plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdkVersion(29)

    defaultConfig {
        applicationId = "com.example.kotlindsl"
        minSdkVersion(19)
        targetSdkVersion(29)
        versionCode(1)
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions.sourceCompatibility = JavaVersion.VERSION_1_8
    compileOptions.targetCompatibility = JavaVersion.VERSION_1_8

    android.buildFeatures.dataBinding = true

    kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
}

dependencies {
    implementation(Libraries.stdLib)
    implementation(Libraries.ktxCore)
    implementation(Libraries.appCompat)
    implementation(Libraries.material)
    implementation(Libraries.constraintLayout)

    testImplementation(TestLibraries.jUnit)
    androidTestImplementation(TestLibraries.ext)
    androidTestImplementation(TestLibraries.espresso)
}