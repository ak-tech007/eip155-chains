plugins {
    id("com.google.devtools.ksp").version("1.8.0-1.0.8")
    id("maven-publish")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            version = "1.2"

            from(components["java"])
        }
    }
}

dependencies {
    ksp("com.squareup.moshi:moshi-kotlin-codegen:1.14.0")
    implementation("com.squareup.moshi:moshi:1.14.0")
}