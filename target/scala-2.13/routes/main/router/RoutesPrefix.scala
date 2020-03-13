// @GENERATOR:play-routes-compiler
// @SOURCE:D:/mover/tictactoescala/conf/routes
// @DATE:Fri Mar 13 21:53:12 EAT 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
