// import model class
// import myRepo
// have to create a enum class for CurrentStatus of user   { successfully added to system, fail ,already exists}
public class Controller{


         @postMapping("user/registration")
         public CurrentStatus registerUser( @RequestBody Model newUser) {
             List<Model> users = MyRepository.findAll();
             System.out.println("New user: " + newUser.toString());
             for (Model user : users) {
                 System.out.println("Registered user: " + newUser.toString());
                 if (user.equals(newUser)) {
                     System.out.println("User Already exists!");
                     return CurrentStatus.ALREADY_EXISTS;
                 }
             }
             userRepository.save(newUser);
             return CurrentStatus.SUCCESS;
         }

    @PostMapping("/users/login")
    public Status loginUser( @RequestBody Model user) {
        List<Modelr> users = MyRepository.findAll();
        for (Model other : users) {
            if (other.equals(user)) {
                user.setLoggedIn(true);
                MyRepository.save(user);
                return Status.SUCCESS;
            }
        }
        return Status.FAILURE;
    }

    @PostMapping("/users/logout")
    public Status logoutUser( @RequestBody Model user) {
        List<Modelr> users = MyRepository.findAll();
        for (Model other : users) {
            if (other.equals(user)) {
                user.setLoggedIn(false);
                MyRepository.save(user);
                return Status.SUCCESS;
            }
        }
        return Status.FAILURE;
    }

    //

         }


}



