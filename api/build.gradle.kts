import org.gradle.api.JavaVersion.VERSION_15
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.4.2"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.4.21"
	kotlin("plugin.spring") version "1.4.21"
	kotlin("plugin.jpa") version "1.4.21"
	id("idea")
}

group = "br.com.strn.erp"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = VERSION_15
java.targetCompatibility = VERSION_15

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
	all {
		exclude(group = "org.springframework.boot", module = "spring-boot-starter-tomcat")
		exclude(group = "org.springframework.boot", module = "spring-boot-starter-json")
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	//implementation("org.springframework.boot:spring-boot-starter-data-rest")
	//implementation("org.springframework.boot:spring-boot-starter-mail")
	//implementation("org.springframework.boot:spring-boot-starter-quartz")
	//implementation("org.springframework.boot:spring-boot-starter-security")
	//implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("com.auth0:java-jwt:3.12.0")
	implementation("com.google.code.gson:gson")
	implementation("org.mindrot:jbcrypt:0.4")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.springframework.boot:spring-boot-starter-undertow")
	//implementation("org.flywaydb:flyway-core")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	runtimeOnly("org.postgresql:postgresql")
	annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.security:spring-security-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = VERSION_15.toString()
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
