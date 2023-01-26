plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "io.github.paulgriffith"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://maven.pkg.github.com/paul-griffith/kindling")
        credentials {
            username = System.getenv("GITHUB_USER")
            password = System.getenv("GITHUB_TOKEN")
        }
    }
    maven {
        url = uri("https://nexus.inductiveautomation.com/repository/inductiveautomation-releases/")
    }
    maven {
        url = uri("https://nexus.inductiveautomation.com/repository/inductiveautomation-thirdparty/")
    }
    maven {
        url = uri("https://jitpack.io")
        content {
            includeGroup("com.github.Dansoftowner")
        }
    }
}

dependencies {
    implementation("io.github.paulgriffith.kindling", "core", "0.6.0-SNAPSHOT")
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("io.github.paulgriffith.kindling.MainPanel")
}
