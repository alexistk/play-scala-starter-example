package controllers

import play.api.mvc.{AbstractController, ControllerComponents}
import utils.GreetingsHelper

import javax.inject.Inject

class ModuleOneController @Inject() (cc: ControllerComponents) extends AbstractController(cc) {
  def hello = Action {
    Ok(GreetingsHelper.greet("from module one"))
  }
}
