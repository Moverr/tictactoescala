package v1.controllers

trait Tictactoe {
  //todo Array size of 3,3
  def intiboard() : Array[String];
  def populateBoard() : Unit;
  def findVertical(): Unit;
  def findDiagonal():Unit;
  def returnResult():Unit;
}
