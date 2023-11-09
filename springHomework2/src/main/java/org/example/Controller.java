package org.example;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/hello")
public class Controller {
    @GetMapping("/add")
    public String addStudent(ModelMap modelMap) {
        modelMap.put("student", new StudentDTO());
        return "addStudent";
    }

    @PostMapping("/add")
    public String showStudentList(Student student, Grooup grooup, StudentDTO studentDTO) {
        grooup.setNumberGroup(studentDTO.getGrooup());
        student.setName(studentDTO.getName());
        student.setSurname(studentDTO.getSurname());
        student.setAge(studentDTO.getAge());
        System.out.println(grooup);
        System.out.println(student);
        return "showStudentList";
    }
}