package v1.controllers

import javax.inject._
import play.api.mvc.{AbstractController, ControllerComponents}

class TicTacToeController @Inject()(cc:ControllerComponents) extends  AbstractController (cc) {

  def index = Action {  implicit request =>
    Ok(" Interesting movers ");
  }

}
