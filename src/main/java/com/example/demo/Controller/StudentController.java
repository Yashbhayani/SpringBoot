package com.example.demo.Controller;

import com.example.demo.Service.StudentService;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;
    @GetMapping("")
    public String index(){
        return "Yash";
    }

    @GetMapping("/show")
    public List<Student> getStudent(){
        return studentService.getAllStudents();
    }


    @GetMapping("/show/{id}")
    public Student getStudent(@PathVariable Integer id ){
        return studentService.getStudentById(id);
    }

    @PostMapping("/add")
    public Student savestudent(@RequestBody Student student){
        return studentService.create(student);
    }

    @PutMapping("/update")
    public Student updatestudent(@RequestBody Student student){
        return studentService.update(student);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Integer id ){
       return studentService.deleteStudent(id);
    }
}
