package SpringBoot6.RestAPI.FinalProject.Service;

import SpringBoot6.RestAPI.FinalProject.Entity.Task;
import SpringBoot6.RestAPI.FinalProject.Entity.TaskStatus;
import SpringBoot6.RestAPI.FinalProject.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasksBy(String status) {
        if((status != null) && !status.isEmpty()){
            try{
                TaskStatus enumStatus = TaskStatus.valueOf(status.toUpperCase());
                return taskRepository.findByStatus(enumStatus);
            }
            catch (IllegalArgumentException e){
                return taskRepository.findAll();
            }
        }
        return taskRepository.findAll();
    }


    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public Task createTask(Task task) {
        task.setStatus(TaskStatus.NEW);
        return taskRepository.save(task);
    }

    public Task updateTask(Task taskDetails, Long id) {
        Task task = taskRepository.findById(id).orElse(null);

        if (task != null) {
            task.setTitle(taskDetails.getTitle());
        }

        task.setDescription(taskDetails.getDescription());
        task.setStatus(taskDetails.getStatus());

        return taskRepository.save(task);

    }

    public boolean deleteTaskById(Long id) {
        if(taskRepository.existsById(id)){
            taskRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
