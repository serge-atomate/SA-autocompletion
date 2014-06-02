package controllers;

import play.*;
import play.mvc.*;

import models.*;
import play.data.*;

import views.html.*;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Application extends Controller {

    public static Result index() {
    	try {
      		System.out.println(InetAddress.getLocalHost().getHostName());
      		System.out.println(InetAddress.getLocalHost().getHostAddress());
      
    	} catch (UnknownHostException e) {
      		e.printStackTrace();
    	}

        // return ok(index.render("Your new application is ready."));
		return ok(views.html.index.render("GoPubMed® - Transinsight's semantic search for the life sciences"));
    }

}
