plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.ticmas_project_android"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.ticmas_project_android"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }



}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    //ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    //LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
    //Activity
    implementation("androidx.activity:activity-ktx:1.7.2")
    //Fragment
    implementation("androidx.fragment:fragment-ktx:1.6.1")
    implementation("androidx.test.ext:junit-ktx:1.1.5")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation ("junit:junit:4.13")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation ("androidx.test.espresso:espresso-contrib:3.4.0")
    androidTestImplementation ("androidx.test.espresso:espresso-intents:3.4.0")
    androidTestImplementation ("androidx.test.espresso:espresso-web:3.4.0")
    androidTestImplementation ("androidx.test:core:1.4.0")

    testImplementation("org.mockito:mockito-core:3.12.4")
    testImplementation("androidx.arch.core:core-testing:2.1.0")
    testImplementation("org.robolectric:robolectric:4.6")
}