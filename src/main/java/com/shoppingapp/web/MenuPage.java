package com.shoppingapp.web;

import com.google.sitebricks.At;
import com.google.sitebricks.Show;

/**
 * The home page that our users will see at the top level URI "/".
 * <p>
 * This page is created once per request and has "no scope" in Guice
 * terminology. See the <a href="http://code.google.com/p/google-guice">Guice wiki</a>
 * for details.
 *
 * @author dhanji@gmail.com (Dhanji R. Prasanna)
 */
@At("/Menu")
@Show("Menu.html")
public class MenuPage implements Page{

}
