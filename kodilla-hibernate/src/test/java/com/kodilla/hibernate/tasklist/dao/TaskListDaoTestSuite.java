package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String NAME = "Test: Something like task's name";

    @Test
    void testFindByListName() {
        //GIVEN
        TaskList taskList = new TaskList(NAME,"Something like description");
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //WHEN
        List<TaskList> readTasks = taskListDao.findByListName(name);

        //THEN
        assertEquals(1,readTasks.size());

        //CLEANUP
        taskListDao.deleteAll();

    }

}
