package bootstrap.liftweb

import net.liftweb.util._
import net.liftweb.http._
import net.liftweb.sitemap._
import net.liftweb.sitemap.Loc._
import Helpers._
 
/**
  * A class that's instantiated early and run.  It allows the application
  * to modify lift's environment
  */
class Boot {
  def boot {
    // where to search snippet
    LiftServlet.addToPackages("com.gailo22")     

    // Build SiteMap
    val entries = Menu(Loc("Home", "/", "Home")) :: Nil 
    LiftServlet.setSiteMap(SiteMap(entries:_*))
  }
}

