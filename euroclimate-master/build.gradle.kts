plugins {
    java
    id("org.springframework.boot") version "3.0.3"
    id("io.spring.dependency-management") version "1.1.0"
}

group = "uz.spring"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

val openApiVersion = "1.6.11"
val immutableVersion = "2.9.2"
val jwtHandlerVersion = "4.0.0"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-r2dbc")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework.boot:spring-boot-starter-security")

    // Postgres
    runtimeOnly("org.postgresql:postgresql")
    runtimeOnly("org.postgresql:r2dbc-postgresql")

    annotationProcessor("org.immutables:value:$immutableVersion")
    compileOnly("org.immutables:builder:$immutableVersion")
    compileOnly("org.immutables:value-annotations:$immutableVersion")

    // JWT handler
    implementation("com.auth0:java-jwt:$jwtHandlerVersion")

    // Swagger Open API
    implementation("org.springdoc:springdoc-openapi-webflux-ui:$openApiVersion")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.projectreactor:reactor-test")
    testImplementation("org.springframework.security:spring-security-test")

    // Liquibase
    implementation("org.liquibase:liquibase-core")
    implementation("org.springframework:spring-jdbc")

    // MapStruct
    implementation("org.mapstruct:mapstruct:1.5.2.Final")
    annotationProcessor("org.projectlombok:lombok-mapstruct-binding:0.2.0")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.5.2.Final")


    // EUREKA CLIENT
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:4.0.0")

    // CONFIG
    // https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-config
    implementation("org.springframework.cloud:spring-cloud-starter-config:4.0.0")


}

tasks.withType<Test> {
    useJUnitPlatform()
}
