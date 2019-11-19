package magongwa.jeremia.teacher.controller;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import magongwa.jeremia.teacher.model.Teacher;
import magongwa.jeremia.teacher.service.TeacherService;

@CrossOrigin(origins = {"http://localhost:4200"},maxAge = 4800, allowedHeaders = "*",allowCredentials = "false")
@RestController
@RequestMapping(path = "Api/Teacher")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	
	
	@GetMapping
    public ResponseEntity<List<Teacher>> findAll() {
        return ResponseEntity.ok(teacherService.findAll());
    }

    @PostMapping
    public ResponseEntity create(@Valid @RequestBody Teacher product) {
        return ResponseEntity.ok(teacherService.save(product));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Teacher> findById(@PathVariable String id) {
        Optional<Teacher> product = teacherService.findById(id);
        if (!product.isPresent()) {
         
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(product.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Teacher> update(@PathVariable String id, @Valid @RequestBody Teacher product) {
        if (!teacherService.findById(id).isPresent()) {
          
            ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(teacherService.save(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id) {
        if (!teacherService.findById(id).isPresent()) {
           
            ResponseEntity.badRequest().build();
        }

        teacherService.deleteById(id);

        return ResponseEntity.ok().build();
    }
	
}
