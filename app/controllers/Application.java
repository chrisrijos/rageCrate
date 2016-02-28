package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Subscribe"));
    }
    //the to do just renders a built in
    public static Result GO_SUBSCRIBE = redirect(
            //literally does nothing atm just a place holder
            //routes.Application.subscribe();
            String.valueOf(TODO)
    );
    public Result subscribe(){
        return TODO;
    }


}
