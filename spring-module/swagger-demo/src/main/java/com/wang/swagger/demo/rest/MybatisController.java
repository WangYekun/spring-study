package com.wang.swagger.demo.rest;

import com.wang.swagger.demo.entity.Student;
import com.wang.swagger.demo.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Mark
 * @version 1.0
 * @date 2020/4/22 9:04
 * @description 学生控制类
 */
@Api(value = "Mybatis操作类", tags = "Mybatis操作类")
@RestController
@RequestMapping(value = "/mybatis")
public class MybatisController {

    private final StudentService studentService;

    public MybatisController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(value = "/save")
    @ApiOperation(value = "新增学生")
    public int save(@RequestBody Student student) {
        return studentService.insert(student);
    }

    @GetMapping(value = "/getStudentById/{id}")
    @ApiOperation(value = "根据学生id查询学生")
    public Student selectByPrimaryKey(@PathVariable Integer id) {
        return studentService.selectByPrimaryKey(id);
    }

    @PostMapping(value = "/updateByPrimaryKey")
    @ApiOperation(value = "更新学生信息")
    public int updateByPrimaryKey(@RequestBody Student student) {
        return studentService.updateByPrimaryKey(student);
    }

    @GetMapping(value = "/getStudentList")
    @ApiOperation(value = "查询全部学生")
    public List<Student> getStudentList() {
        return studentService.getStudentList();
    }

    @GetMapping(value = "/deleteByPrimaryKey/{id}")
    @ApiOperation(value = "删除学生根据id")
    public int deleteByPrimaryKey(@PathVariable Integer id) {
        return studentService.deleteByPrimaryKey(id);
    }

    @PostMapping(value = "/updateByPrimaryKeySelective")
    @ApiOperation(value = "更新学生")
    public int deleteByPrimaryKey(@RequestBody Student student) {
        return studentService.updateByPrimaryKeySelective(student);
    }

}

