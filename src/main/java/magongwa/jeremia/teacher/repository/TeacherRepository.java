package magongwa.jeremia.teacher.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import magongwa.jeremia.teacher.model.Teacher;

@Repository
public interface TeacherRepository  extends MongoRepository<Teacher , ObjectId >{
	
	public Teacher findByFirstName(String firstName);
	

}
