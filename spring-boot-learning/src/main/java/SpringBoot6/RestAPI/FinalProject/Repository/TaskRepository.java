package SpringBoot6.RestAPI.FinalProject.Repository;

import SpringBoot6.RestAPI.FinalProject.Entity.Task;
import SpringBoot6.RestAPI.FinalProject.Entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(TaskStatus status);
}
