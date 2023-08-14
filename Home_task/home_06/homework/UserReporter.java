package Home_task.home_06.homework;

public class UserReporter implements ConsoleReporter<User>{

    @Override
    public void consoleReporter(User us){
        System.out.println("Report for user: " + us.getName());
    }
}
