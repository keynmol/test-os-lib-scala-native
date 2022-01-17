scalaVersion := "2.13.8"

// Set to false or remove if you want to show stubs as linking errors
nativeLinkStubs := true

enablePlugins(ScalaNativePlugin)

libraryDependencies += "com.lihaoyi" %%% "os-lib" % "0.8.0"

name := "test-os-lib-on-native"
