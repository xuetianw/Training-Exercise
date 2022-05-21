package OOD1.Module7;

import java.util.ArrayList;

public class ComputerStore {
    private String name;
    private ArrayList<Computer> computers;


    public ComputerStore(String name) {
        this.name = name;
        computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public ArrayList<Computer> getAllComputers() {
        return computers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ComputerStore{" +
                "name='" + name + '\'' +
                ", computers=" + computers +
                '}';
    }
}
