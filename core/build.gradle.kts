import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.gradle.api.tasks.bundling.Jar
import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    id("org.springframework.boot") version "2.4.4"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.6.0"
    kotlin("plugin.spring") version "1.6.0"
    kotlin("plugin.allopen") version "1.6.0"
    kotlin("plugin.jpa") version "1.6.0"
    kotlin("kapt") version "1.6.0"
}


val jar: Jar by tasks
val bootJar: BootJar by tasks

bootJar.enabled = false
jar.enabled = true


group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

subprojects {
    repositories { mavenCentral(); mavenLocal() }
    apply(plugin = "org.jetbrains.kotlin.jvm")

    tasks {
        val java: String by project
        withType<KotlinCompile>{
            kotlinOptions { jvmTarget = java }; sourceCompatibility = java; targetCompatibility = java
        }
    }
}