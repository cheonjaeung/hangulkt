import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

group = "com.cheonjaeung.hangulkt"

kotlin {
    explicitApi()

    applyDefaultHierarchyTemplate()

    jvm {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_1_8
        }
    }

    iosArm64()
    iosSimulatorArm64()
    iosX64()
    macosArm64()
    macosX64()
    tvosArm64()
    tvosSimulatorArm64()
    tvosX64()
    watchosArm32()
    watchosArm64()
    watchosX64()
    watchosDeviceArm64()
    watchosSimulatorArm64()

    js {
        nodejs()
    }
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        nodejs()
    }
    @OptIn(ExperimentalWasmDsl::class)
    wasmWasi {
        nodejs()
    }

    linuxArm64()
    linuxX64()

    mingwX64()

    androidNativeArm32()
    androidNativeArm64()
    androidNativeX86()
    androidNativeX64()

    sourceSets {
        commonTest.dependencies {
            implementation(kotlin("test"))
        }
    }
}
