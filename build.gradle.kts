// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    kotlin("jvm")
    id("com.google.devtools.ksp") version "2.0.21-1.0.25"
  //  id("com.google.devtools.ksp")

}
dependencies {
    implementation(kotlin("stdlib-jdk8"))
    ksp("com.google.dagger:dagger-compiler:2.51.1")
}

kotlin {
    jvmToolchain(8)
}