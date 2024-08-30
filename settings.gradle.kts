rootProject.name = "BaseProjectSetUp"

include(":app")
include(":data:home-data")
include(":domain:home-domain")
include(":base:ui-kit")
include(":base:kotlin-utils")
include(":feature:home-feature")
include(":core:navigation-core")
include(":core:database-core")
include(":core:network-core")
include(":core:preferences-core")
include(":common:navigation-common")

pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}
