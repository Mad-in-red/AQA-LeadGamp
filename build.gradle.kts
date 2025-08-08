plugins {
    id("java")
    id ("io.qameta.allure") version ("2.11.2")
}

allure {
    version = "2.20.0"
    adapter {
        frameworks {
            junit5 {
                adapterVersion = "2.20.0"
            }
        }
    }
}


group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation ("org.seleniumhq.selenium:selenium-java:4.0.0")
    implementation ("io.github.bonigarcia:webdrivermanager:5.3.0")

    implementation ("io.rest-assured:rest-assured:5.3.0")
    implementation ("com.fasterxml.jackson.core:jackson-databind:2.14.0")

    testImplementation ("io.qameta.allure:allure-junit5:2.20.0")
    testImplementation ("io.qameta.allure:allure-rest-assured:2.20.0")

    compileOnly ("org.projectlombok:lombok:1.18.24")
    annotationProcessor ("org.projectlombok:lombok:1.18.24")
    implementation ("org.assertj:assertj-core:3.23.1")
    implementation ("org.slf4j:slf4j-api:2.0.3")
    implementation ("ch.qos.logback:logback-classic:1.4.4")
}


tasks.test {
    useJUnitPlatform()
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}