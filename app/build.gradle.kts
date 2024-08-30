plugins {
    id("app-config")
}

android {
    namespace = "com.base.project.setup"
    defaultConfig {
        applicationId = "com.base.project.setup"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

dependencies {
    //..
}