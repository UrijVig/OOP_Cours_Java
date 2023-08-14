package Home_task.home_06.homework;

public class UserSaver implements ConsoleSaver<User>{

    @Override
    public void consoleUserSave(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
