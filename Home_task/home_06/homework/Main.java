package Home_task.home_06.homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        UserReporter userReporter = new UserReporter();
        UserSaver userSaver = new UserSaver();
        userSaver.consoleUserSave(user);
        userReporter.consoleReporter(user);

    }
}