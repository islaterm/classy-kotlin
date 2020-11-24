plugins {
  java
  kotlin("jvm") version "1.4.10"
}

group = "cl.ravenhill"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  implementation(kotlin("stdlib"))
  testImplementation(group = "org.junit.jupiter", name = "junit-jupiter-api", version = "5.7.0")
}
