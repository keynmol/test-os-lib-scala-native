scalaVersion := "2.13.4"

// Set to false or remove if you want to show stubs as linking errors
nativeLinkStubs := true

enablePlugins(ScalaNativePlugin)

libraryDependencies += "com.lihaoyi" %%% "os-lib" % "0.7.2"
