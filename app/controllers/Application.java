package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Subscribe", null));
    }
    //the to do just renders the subscribe page
    public Result subscribe(){
        return ok(subscribe.render());
    }
    //not implemented yet, will render about page
    public Result about(){
        return TODO;
    }


}
