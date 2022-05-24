package com.fdmgroup.tdd.groupcontroller;

import java.util.Map;

public class GroupController implements GroupControllerService{
    DatabaseReader databaseReader;

    DatabaseWriter databaseWriter;

    public GroupController(DatabaseReader databaseReader, DatabaseWriter databaseWriter) {
        this.databaseReader = databaseReader;
        this.databaseWriter = databaseWriter;
    }

    @Override
    public Map<String, Trainee> getAllTrainees() {
        return databaseReader.readGroup();
    }

    @Override
    public void addTrainee(Trainee trainee) {
        databaseWriter.addTrainee(trainee);
    }

    @Override
    public void removeTraineeByUsername(String traineeUsername) {
        databaseWriter.deleteTraineeByUsername(traineeUsername);
    }
}
