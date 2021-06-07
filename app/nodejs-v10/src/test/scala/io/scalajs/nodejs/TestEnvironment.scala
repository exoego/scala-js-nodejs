package io.scalajs.nodejs

import io.scalajs.nodejs.buffer.Buffer
import io.scalajs.nodejs.child_process.ChildProcess

object TestEnvironment {
  private lazy val nodeMajorVersion: Int =
    ChildProcess.execSync("node -v").asInstanceOf[Buffer].toString().drop(1).takeWhile(_.isDigit).toInt

  def isWindows: Boolean = os.OS.platform().startsWith("win")

  def isExecutedInExactNode16: Boolean = nodeMajorVersion == 16
  def isExecutedInExactNode14: Boolean = nodeMajorVersion == 14
  def isExecutedInExactNode12: Boolean = nodeMajorVersion == 12
  def isExecutedInExactNode10: Boolean = nodeMajorVersion == 10

  def isExecutedInNode16OrNewer: Boolean = nodeMajorVersion >= 16
  def isExecutedInNode14OrNewer: Boolean = nodeMajorVersion >= 14
  def isExecutedInNode12OrNewer: Boolean = nodeMajorVersion >= 12
  def isExecutedInNode10OrNewer: Boolean = nodeMajorVersion >= 10
}
