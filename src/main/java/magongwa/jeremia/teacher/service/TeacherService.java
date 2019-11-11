package magongwa.jeremia.teacher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import magongwa.jeremia.teacher.model.Teacher;
import magongwa.jeremia.teacher.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	private TeacherRepository teacherRepository;
	
	public Teacher create(String teacher_No, String firstName, String lastName)
	{
		return teacherRepository.save(new Teacher(teacher_No,firstName,lastName));
	}
	
	public List<Teacher> getAll()
	{
		return teacherRepository.findAll();
	}
	
	public Teacher getByFirstName(String firstName)
	{
		return teacherRepository.findByFirstName(firstName);
	}
	
	public Teacher update(String firstName, String lastName)
	{
		Teacher teacher = teacherRepository.findByFirstName(firstName);
		teacher.setLastName(lastName);
	
		
		return teacherRepository.save(teacher);
	}
	public void deleteAll()
	{
		teacherRepository.deleteAll();
	}
	public void delete(String firstName)
	{
		Teacher teacher  = teacherRepository.findByFirstName(firstName);
		teacherRepository.delete(teacher);
	}
}
