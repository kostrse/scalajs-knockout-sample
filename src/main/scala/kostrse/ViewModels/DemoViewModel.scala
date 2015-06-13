package kostrse.ViewModels

import scala.scalajs.js.annotation.JSExportAll

import kostrse.KnockoutJS._

@JSExportAll
class DemoViewModel {

  val firstName: KnockoutObservable[String] = Knockout.observable("Bert")

  val lastName: KnockoutObservable[String] = Knockout.observable("Bertington")

  val fullName: KnockoutComputed[String] = Knockout.computed(() => this.firstName() + " " + this.lastName())
}
