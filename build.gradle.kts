// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
//    apply (from = "dependencies.gradle")
//    ext.kotlin_version = '1.3.61'
    repositories {
        google()
        jcenter()
        
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:${Config.Android.BuildVersionGradle}")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:${Config.Android.PluginKotlinVersion}")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        
    }
}

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}
