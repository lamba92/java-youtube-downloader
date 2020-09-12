plugins {
    kotlin("jvm") version "1.4.10"
    `maven-publish`
}

repositories {
    jcenter()
    mavenCentral()
}

kotlin.target.compilations.all {
    kotlinOptions.jvmTarget = "1.8"
}

dependencies {
    implementation("com.alibaba", "fastjson", "1.2.62")
    testImplementation("org.junit.jupiter", "junit-jupiter-engine", "5.3.2")
    testImplementation("org.mockito", "mockito-core", "2.23.4")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
