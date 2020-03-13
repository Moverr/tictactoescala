package v1.controllers

trait Tictactoe {
  //todo Array size of 3,3
  def intiBoard() : Array[String];
  def populateBoard() : Unit;
  def findHorizontalMatch(): Unit;
  def rotateThroughBoardColumns():Unit;
  def findVerticalMatch():Unit;
  def findifExistsUnmatched():Unit;
  def findLeftRigtDiagonalMatch():Unit;
  def findRightLeftDiagonalMatch():Unit;
  def validateBoardString():Unit;
  def placeHorizontalWin():Unit;
  def playLeftRigtDiagonalWin():Unit;
  def playRightLeftDiagonalWin():Unit;
  def placeHorizontalBlock():Unit;
  def placeVerticalBlock():Unit;

  def placeLeftRigtDiagonalBlock():Unit;
  def placeRightLeftDiagonalBlock():Unit;

  def playHorizontalMove():Unit;
  def playVerticalMove():Unit;
  def playLeftRigtDiagonalMove():Unit;
  def playRightLeftDiagonalMove():Unit;

  // try to use a clojure
  def shuffle():Unit;
  def playNextMove():Unit;

  def playGame():Unit;
  def initGame():Unit;
  def populateResponse():Unit;



}
