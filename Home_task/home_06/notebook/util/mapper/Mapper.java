package Home_task.home_06.notebook.util.mapper;

import Home_task.home_06.notebook.model.User;

public interface Mapper {
    String toInput(User e);
    User toOutput(String str);
}
