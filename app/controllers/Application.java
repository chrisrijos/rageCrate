package controllers;

import play.*;
import play.api.data.Form;
import play.api.libs.mailer.Email;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Subscribe"));
    }
    //not implemented yet, will render about page
    public Result about(){
        return ok(about.render());
    }

}
