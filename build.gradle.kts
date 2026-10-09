plugins {
    `java-library`
    id("com.vanniktech.maven.publish") version "0.37.0"
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnlyApi("org.jspecify:jspecify:1.0.0")
}

tasks.withType<JavaCompile>().configureEach {
    options.release = 25
    options.encoding = "UTF-8"
}

tasks.javadoc {
    (options as StandardJavadocDocletOptions).addBooleanOption("Xdoclint:none", true)
}

tasks.jar {
    from("LICENSE")
    manifest {
        attributes("Automatic-Module-Name" to "io.github.kokodio.metaljvm")
    }
}

mavenPublishing {
    publishToMavenCentral()
    if (providers.gradleProperty("signingInMemoryKey").isPresent || providers.gradleProperty("signing.keyId").isPresent) {
        signAllPublications()
    }

    coordinates(group.toString(), "metal-jvm", version.toString())

    pom {
        name = "metal-jvm"
        description = "Java bindings for Apple Metal built on the Foreign Function & Memory API"
        url = "https://github.com/kokodio/metal-jvm"
        inceptionYear = "2026"
        licenses {
            license {
                name = "MIT License"
                url = "https://opensource.org/licenses/MIT"
            }
        }
        developers {
            developer {
                id = "kokodio"
                name = "kokodio"
                url = "https://github.com/kokodio"
            }
        }
        scm {
            url = "https://github.com/kokodio/metal-jvm"
            connection = "scm:git:https://github.com/kokodio/metal-jvm.git"
            developerConnection = "scm:git:ssh://git@github.com/kokodio/metal-jvm.git"
        }
    }
}
