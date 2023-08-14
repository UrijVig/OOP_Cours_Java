package Home_task.home_06.notebook;

import Home_task.home_06.notebook.controller.UserController;
import Home_task.home_06.notebook.model.repository.GBRepository;
import Home_task.home_06.notebook.model.repository.impl.UserRepository;
import Home_task.home_06.notebook.view.UserView;

import static Home_task.home_06.notebook.util.DBConnector.DB_PATH;
import static Home_task.home_06.notebook.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        GBRepository repository = new UserRepository(DB_PATH);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();

    }
}
