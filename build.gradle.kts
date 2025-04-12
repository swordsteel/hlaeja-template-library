plugins {
    alias(hlaeja.plugins.kotlin.jvm)
    alias(hlaeja.plugins.ltd.hlaeja.plugin.library)
}

dependencies {
    testImplementation(hlaeja.kotlin.test.junit5)

    testRuntimeOnly(hlaeja.junit.platform.launcher)
}

group = "ltd.lulz"
