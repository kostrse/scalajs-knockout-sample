package kostrse

import org.scalajs.dom

import scala.scalajs.js.annotation.JSExport

import kostrse.KnockoutJS._
import kostrse.ViewModels.DemoViewModel

@JSExport
object Application {

  @JSExport
  def init(containerElement: dom.Element): Unit = {
	  Knockout.applyBindings(new DemoViewModel(), containerElement)
  }
}
