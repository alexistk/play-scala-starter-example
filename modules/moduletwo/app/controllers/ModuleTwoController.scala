package controllers

import play.api.mvc.{AbstractController, ControllerComponents}
import utils.GreetingsHelper

import javax.inject.Inject

class ModuleTwoController @Inject() (cc: ControllerComponents) extends AbstractController(cc) {
  def hello = Action {
    Ok(GreetingsHelper.greet("from module two"))
  }
}
