import org.gradle.api.JavaVersion

object AndroidConst {
    const val COMPILE_SKD = 34
    const val TARGET_SKD = 34
    const val MIN_SKD = 26

    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"

    val COMPILE_JDK_VERSION = JavaVersion.VERSION_1_8
    const val KOTLIN_JVM_TARGET = "1.8"

    const val COMPOSE_KOTLIN_COMPILER_EXTENSION_VERSION = "1.5.1"
}
