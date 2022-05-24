package com.fdmgroup.tdd.groupcontroller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class GroupControllerServiceTest {
    GroupController groupController;
    DatabaseWriter mockDatabaseWriter;
    DatabaseReader mockDatabaseReader;

    @BeforeEach
    void setUp() {
        mockDatabaseReader = mock(DatabaseReader.class);
        mockDatabaseWriter = mock(DatabaseWriter.class);
        groupController = new GroupController(mockDatabaseReader, mockDatabaseWriter);
    }

    @Test
    void test1() {
        groupController.getAllTrainees();
        verify(mockDatabaseReader, times(1)).readGroup();
    }

    @Test
    void test2() {
        Trainee trainee1 = new Trainee();
        Map<String, Trainee> map = new HashMap<>();
        map.put("trainee1", trainee1);

        when(mockDatabaseReader.readGroup()).thenReturn(map);

        Map<String, Trainee> returnedMap = groupController.getAllTrainees();

        verify(mockDatabaseReader, times(1)).readGroup();
        assertEquals(map, returnedMap);
    }

    @Test
    void test3() {
        Trainee trainee1 = new Trainee();

        groupController.addTrainee(trainee1);

        verify(mockDatabaseWriter, times(1)).addTrainee(trainee1);
    }


    @Test
    void test4() {
        String userName = "xuetian";
        Trainee trainee1 = new Trainee(userName);


        groupController.removeTraineeByUsername(userName);

        verify(mockDatabaseWriter, times(1)).deleteTraineeByUsername(userName);

    }



}
