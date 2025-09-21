package SpringBoot6.RestAPI.FinalProject.Service;

import SpringBoot6.RestAPI.FinalProject.Entity.Task;
import SpringBoot6.RestAPI.FinalProject.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks(String status) {
        if((status != null) && !status.isEmpty()){
            try{
                Task.Status enumStatus = Task.Status.valueOf(status.toUpperCase());
                return taskRepository.findByStatus(enumStatus);
            }
            catch (IllegalArgumentException e){
                return taskRepository.findAll();
            }
        }
        return taskRepository.findAll();
    }



}
