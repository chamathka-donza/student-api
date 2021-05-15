package com.example.studentapi;

import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {

    StudentRepository repository = new InMemoryStudentRepository() ;


    @PostMapping("/student")
    public void createStudent(@RequestBody Student student){

        //logic to save the student in the database

        //System.out.println("name: " + student.name) ;
        //System.out.println("age: " + student.age);
        //System.out.println("tp: " + student.tp);

        repository.save(student);

    }
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id){
        return repository.get(id);
    }

    @DeleteMapping
    public String deleteStudent(@PathVariable String id){
        repository.delete(id);
        return "student " + repository.get(id).getName() +" is deleted";
    }

}
