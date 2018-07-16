package controllers;
import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.user;
import javax.inject.Inject;


public class UserController extends Controller {

    @Inject
    FormFactory formFactory;

    public Result create(){
        Form<User> userForm = formFactory.form(User.class);
        return ok(user.render(userForm));
    }

    //save user
    public Result save(){
        Form<User> userForm = formFactory.form(User.class).bindFromRequest();
        if (userForm.hasErrors()){
            return badRequest(user.render(userForm));
        }
        User user = userForm.get();
        user.save();
        return redirect(routes.UserController.create());
    }

}
