package kostrse.KnockoutJS

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import org.scalajs.dom

@JSName("ko")
object Knockout extends js.Object {

  def observable[T](value: T): KnockoutObservable[T] = js.native
  def computed[T](fn: js.Function0[T]): KnockoutComputed[T] = js.native

  def applyBindings(viewModelOrBindingContext: Object): Unit = js.native
  def applyBindings(viewModelOrBindingContext: Object, rootNode: dom.Element): Unit = js.native
}
