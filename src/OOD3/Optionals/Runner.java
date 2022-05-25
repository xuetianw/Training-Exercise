package OOD3.Optionals;

import java.util.Optional;
import java.util.function.Consumer;

public class Runner {
    public static void main(String[] args) {


        Computer computer = new Computer("HP");

//        Optional<Motherboard> optionalMotherboard = computer.getMotherboard();
//
//        if (optionalMotherboard.isPresent()){
//            Motherboard motherboard = optionalMotherboard.get();
//        }

//        Consumer<Motherboard> printMotherboardModel =
//                motherboard -> System.out.println(motherboard.getModel());
//
//        computer.getMotherboard()
//                .ifPresent(printMotherboardModel);

        computer.getMotherboard()
                .ifPresent(motherboard -> motherboard.getMemory()
                        .ifPresent(memoryChip -> memoryChip.accessData()));


//        Motherboard motherboard = optionalMotherboard.get();
//
//        Motherboard motherboard = new Motherboard("Gigabyte");
//
//        computer.setMotherboard(motherboard);

//        System.out.println(computer.getMotherboard().getModel());
//
//        computer.getMotherboard().getMemory().accessData();
    }
}
