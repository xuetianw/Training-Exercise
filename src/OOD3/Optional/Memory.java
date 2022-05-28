package OOD3.Optional;

public class Memory {
    private String model;


    public Memory(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void accessData() {
        System.out.println("accessing data");
    }
}