package com.xiaobai.service;

import com.xiaobai.dao.StudentDao;
import com.xiaobai.model.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 余修文
 * @date 2019/4/23 16:51
 */
@Service("StudentService")
public class StudentService {

    @Resource(name = "studentDao")
    private StudentDao dao;

    public List<Student> getAllStudent() {
        return dao.findAll();
    }

}
