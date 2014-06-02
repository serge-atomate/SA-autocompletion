package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import play.data.*;
import models.*;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Searches extends Controller {


	  static Form<Search> searchForm = Form.form(Search.class);


    public static Result index() {
    	try {
          System.out.println(InetAddress.getLocalHost().getHostName());
          System.out.println(InetAddress.getLocalHost().getHostAddress());
      
      } catch (UnknownHostException e) {
          e.printStackTrace();
      }

      Search search = new Search();
      Form<Search> prefilledForm = searchForm.fill(search);

        // return ok(index.render("Your new application is ready."));
		  return ok(views.html.search.render(prefilledForm));
    }


    public static Result newSearch() {
      	//return TODO;
      	Form<Search> filledForm = searchForm.bindFromRequest();
      	if(filledForm.hasErrors()) {
        	return badRequest(
            	views.html.search.render(filledForm)
        	);
      	} else {
          
          String ip = "";

          try {
            ip = InetAddress.getLocalHost().getHostAddress();
          } catch (UnknownHostException e) {
            e.printStackTrace();
          }

        	Search.create(filledForm.get(),ip);
        	return redirect(routes.Searches.index());  
      	}
    }

}
