package com.example.studentapi;

import java.util.HashMap;
import java.util.Map;

public class InMemoryStudentRepository implements StudentRepository {

    Map<String,Student> database = new HashMap<>() ;

    @Override
    public void save(Student student) {
        database.put(student.getId(),student);
    }

    @Override
    public Student get(String id) {

        return database.get(id);
    }

    @Override
    public void delete(String id) {
        database.remove(id) ;

    }



    }

