package v1.controllers

trait Tictactoe {
  def initGame() : Unit;
  def findHorizontal() : Unit;
  def findVertical(): Unit;
  def findDiagonal():Unit;
  def returnResult():Unit;
}
