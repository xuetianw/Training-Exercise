package OOD3.Optionals;

public class Memory {
    private String model;

    private Motherboard motherBoard;

    public Memory(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Motherboard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(Motherboard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void accessData() {
        System.out.println("accessing data");
    }
}