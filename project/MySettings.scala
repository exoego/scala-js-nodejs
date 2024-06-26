import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt._
import sbt.Keys._
import sbtrelease.ReleasePlugin.autoImport._
import sbtrelease.ReleaseStateTransformations._

object MySettings {
  private val lintSettings = Def.setting({
    val isScala212 = scalaVersion.value.startsWith("2.12")
    val lints = (Seq(
      "adapted-args",
      "nullary-unit",
      "inaccessible",
      "infer-any",
      "missing-interpolator",
      "doc-detached",
      "private-shadow",
      "type-parameter-shadow",
      "poly-implicit-overload",
      "option-implicit",
      "delayedinit-select",
      "package-object-classes",
      "stars-align",
      "constant"
    ) ++ Seq(
      "nonlocal-return",
      "implicit-not-found",
      "serial",
      "valpattern",
      "eta-zero",
      "eta-sam",
      "deprecation"
    ).filter(_ => !isScala212)).map(s => s"-Xlint:${s}")
    // no privates to allow private constructor
    val unused = Seq("implicits", "locals", "patvars").filter(_ => !isScala212).map(s => s"-Wunused:${s}")
    lints ++ unused
  })

  lazy val commonSettings = Seq(
    autoCompilerPlugins := true,
    scalacOptions ++= Seq(
      "-deprecation",
      "-unchecked",
      "-feature",
      "-language:implicitConversions"
    ) ++ lintSettings.value,
    Compile / compile / scalacOptions ++= Seq(
      "-Xfatal-warnings"
    ),
    Compile / doc / scalacOptions ++= Seq(
      "-Xfatal-warnings",
      "-no-link-warnings"
    ),
    autoAPIMappings := true
  )

  lazy val commonScalaJsSettings = Seq(
    scalaJSLinkerConfig ~= {
      _.withModuleKind(ModuleKind.CommonJSModule)
    },
    Test / logBuffered := true
  )

  lazy val commonMacroParadiseSetting = Seq(
    Compile / scalacOptions ++= {
      CrossVersion.partialVersion(scalaVersion.value) match {
        case Some((2, n)) if n >= 13 => "-Ymacro-annotations" :: Nil
        case _                       => Nil
      }
    },
    libraryDependencies ++= {
      CrossVersion.partialVersion(scalaVersion.value) match {
        case Some((2, n)) if n >= 13 => Nil
        case _ => compilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full) :: Nil
      }
    }
  )

  lazy val nonPublishingSetting = Seq(
    publish / skip  := true,
    publishArtifact := false,
    publish         := {},
    publishLocal    := {}
  )

  lazy val publishingSettings = Seq(
    Test / publishArtifact                 := false,
    Compile / packageDoc / publishArtifact := true,
    Compile / packageSrc / publishArtifact := true,
    pomIncludeRepository := { _ =>
      false
    }
  )
}
