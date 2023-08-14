package Home_task.home_06.notebook.model.repository;

import Home_task.home_06.notebook.model.User;

import java.util.List;

public interface GBRepository {
    List<User> findAll();
    void create(User user);
    User findById(Long id);
    void update(Long userId, User update);
    void delete(int id);

}
