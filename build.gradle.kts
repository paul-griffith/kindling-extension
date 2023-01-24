plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "io.github.paulgriffith"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(fileTree("libs"))
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("io.github.paulgriffith.kindling.MainPanel")
}
