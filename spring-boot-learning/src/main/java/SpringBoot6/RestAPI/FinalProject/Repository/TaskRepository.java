package SpringBoot6.RestAPI.FinalProject.Repository;

import SpringBoot6.RestAPI.FinalProject.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(Task.Status status);
}
