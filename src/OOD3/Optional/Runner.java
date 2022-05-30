package OOD3.Optional;

import OOD3.Optional.CustomException.MissingMemoryException;
import OOD3.Optional.CustomException.MissingMotherboardException;

import java.util.Optional;
import java.util.OptionalInt;

public class Runner {
    public static void main(String[] args) {


        Computer computer = new Computer("HP");

        Motherboard motherboard = new Motherboard("dell");




        Optional<Motherboard> optionalMotherboard = computer.getMotherboard();
        // get()
        // optionalMotherboard.get();


        // isPresent()
        System.out.println(optionalMotherboard.isPresent());



        // ifPresent()
//        computer.getMotherboard().ifPresent(
//                optionalMotherboard -> optionalMotherboard.getMemory()
//                        .ifPresent(memory -> memory.accessData())
//        );



        // orElse()
//        ComputerStore computerStore = new ComputerStore();
//        int numberOfComputers = computerStore.getComputers()
//                .orElse(new ArrayList<Computer>())
//                .size();

        computer.getMotherboard().orElse(motherboard).getMemory().ifPresent(x-> x.accessData());
        System.out.println(computer.getMotherboard().isPresent());

        computer.getMotherboard().ifPresent(x -> System.out.println(x.getMemory()));

        //orElseThrow()
        try {
            computer.getMotherboard()
                    .orElseThrow(() ->  new MissingMotherboardException("missing motherboard"))
                    .getMemory()
                    .orElseThrow(() ->  new MissingMemoryException("missing memory"))
                    .accessData();
        } catch (MissingMotherboardException e) {
            System.out.println("missing motherboard");
        } catch (MissingMemoryException e) {
            System.out.println("missing memory");
        }

        OptionalInt optionalInt = OptionalInt.of(3);

        System.out.println(optionalInt.getAsInt());

    }
}
