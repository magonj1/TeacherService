package magongwa.jeremia.teacher.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import magongwa.jeremia.teacher.generator.EmployeeNoGenerator;
import magongwa.jeremia.teacher.model.Teacher;
import magongwa.jeremia.teacher.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	
	
	@RequestMapping("/create")
	public String create(@RequestParam String firstName, @RequestParam String lastName)
	{
		Random random = new Random();
		int number  = 1000000 + random.nextInt(9999999); 
	
		Teacher teacher  = teacherService.create(EmployeeNoGenerator.getEmployeeNo("3","GP",number),firstName, lastName);
		
		return teacher.toString();
	}
	
	@RequestMapping("/getAll")
	public List<Teacher> getTeachers()
	{
	  return teacherService.getAll();
		
	}
	
	@RequestMapping("/get")
	public Teacher getTeacher(@RequestParam String firstName)
	{
		return teacherService.getByFirstName(firstName);
	}
	@RequestMapping("/update")
	public String update(@RequestParam String firstName, @RequestParam String lastNam)
	{
		Teacher teacher  = teacherService.update(firstName, lastNam);
		
		return teacher.toString();
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam String firstName)
	{
      
		teacherService.delete(firstName);
        return "Deleted "+firstName;
	}
	
	@RequestMapping("/deleteAll")
	public String deleteAll()
	{
		teacherService.deleteAll();
		
		return "Deleted all the Records";
	}
	
}
