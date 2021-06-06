package io.scalajs.nodejs
package perf_hooks

import _root_.net.exoego.scalajs.types.util.Factory
import com.thoughtworks.enableIf

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("perf_hooks", "Performance")
class Performance extends js.Object {
  def clearMarks(): Unit             = js.native
  def clearMarks(name: String): Unit = js.native

  def mark(): Unit             = js.native
  def mark(name: String): Unit = js.native

  def measure(name: String, statMark: String, endMark: String): Unit = js.native
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  def measure(name: String, statMark: String): Unit = js.native
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  def measure(name: String): Unit = js.native

  def nodeTiming: PerformanceNodeTiming = js.native

  def now(): Double = js.native

  def timeOrigin: Double = js.native

  def timerify[T <: js.Function](fn: T): T = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  def toJSON(): js.Object = js.native
}

@js.native
@JSImport("perf_hooks", "performance")
object Performance extends Performance

@Factory
trait PerformanceEntry extends js.Object {
  def duration: Double
  def name: String
  def startTime: Double
  def entryType: String
  def kind: js.UndefOr[Int]

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14)
  def flags: js.UndefOr[Int]

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs16)
  def details: js.Any
}

@Factory
trait PerformanceNodeTiming extends PerformanceEntry {
  def bootstrapComplete: Double
  def environment: Double
  def loopExit: Double
  def loopStart: Double
  def nodeStart: Double
  def v8Start: Double
}

@js.native
@JSImport("perf_hooks", "constants")
object Constants extends Constants

@js.native
trait Constants extends js.Object {
  val NODE_PERFORMANCE_GC_MAJOR: Int       = js.native
  val NODE_PERFORMANCE_GC_MINOR: Int       = js.native
  val NODE_PERFORMANCE_GC_INCREMENTAL: Int = js.native
  val NODE_PERFORMANCE_GC_WEAKCB: Int      = js.native

  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14) val NODE_PERFORMANCE_GC_FLAGS_NO: Int = js.native
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14) val NODE_PERFORMANCE_GC_FLAGS_CONSTRUCT_RETAINED
      : Int = js.native
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14) val NODE_PERFORMANCE_GC_FLAGS_FORCED: Int =
    js.native
  @enableIf(
    io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14
  ) val NODE_PERFORMANCE_GC_FLAGS_SYNCHRONOUS_PHANTOM_PROCESSING: Int = js.native
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14) val NODE_PERFORMANCE_GC_FLAGS_ALL_AVAILABLE_GARBAGE
      : Int = js.native
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14) val NODE_PERFORMANCE_GC_FLAGS_ALL_EXTERNAL_MEMORY
      : Int = js.native
  @enableIf(io.scalajs.nodejs.internal.CompilerSwitches.gteNodeJs14) val NODE_PERFORMANCE_GC_FLAGS_SCHEDULE_IDLE: Int =
    js.native
}
