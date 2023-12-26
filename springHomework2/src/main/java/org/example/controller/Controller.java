package org.example.controller;

import org.example.dto.GroupDTO;
import org.example.dto.StudentDTO;
import org.example.service.GroupService;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
@RequestMapping("/hello")
public class Controller {
    @Autowired
    protected StudentService service;
    @Autowired
    protected GroupService groupService;

    //Intro
    @GetMapping("/intro")
    public String intro() {
        return "intro";
    }

    //  Student
    @GetMapping("/addstudent")
    public String addStudents(ModelMap modelMap) {
        modelMap.addAttribute("student", new StudentDTO());
        return "addstudent";
    }

    @PostMapping("/addstudent")
    public String createStudents(StudentDTO studentDTO) {
        service.createStudent(studentDTO);
        return "studentsuccessfully";
    }

    //  Group
    @GetMapping("/addgroup")
    public String addGroup(ModelMap modelMap) {
        modelMap.addAttribute("group", new GroupDTO());
        return "addgroup";
    }

    @PostMapping("/addgroup")
    public String createGroup(GroupDTO groupDTO) {
        groupService.createGroup(groupDTO);
        return "groupsuccessfully";
    }

    // List students
    @GetMapping("/studentsgroup")
    public String showStudents(ModelMap modelMap) {
        modelMap.addAttribute("student", new StudentDTO());
        return "studentsgroup";
    }

    @GetMapping("/showallstudentsgroup")
    public String listStudent(ModelMap modelMap, StudentDTO studentDTO) {
        modelMap.put("student", service.listStudents(studentDTO));
        return "showallstudentsgroup";
    }
}