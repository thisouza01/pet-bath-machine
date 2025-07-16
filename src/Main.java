import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args){
        var option = -1;

        do {
            System.out.println("~~~ Escolha uma das opções ~~~");
            System.out.println("1- Dar baho no pet");
            System.out.println("2- Abastecer maquina com água");
            System.out.println("3- Abastecer maquina com shampoo");
            System.out.println("4- Verificar água");
            System.out.println("5- Verificar shampoo");
            System.out.println("6- Verificar se tem pet no banho");
            System.out.println("7- Colocar pet na máquina");
            System.out.println("8- Retirar pet da máquina");
            System.out.println("9- Limpar máquina");
            System.out.println("0- Sair do menu");

            option = scanner.nextInt();

            switch (option){
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePetFromMachine();
                case 9 -> petMachine.washMachine();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida!");
            }
        } while (option != 0);
    }

    public static void setPetInPetMachine(){
        System.out.println("Informe o nome do pet.");
        String name = scanner.next();
        var pet = new Pet(name);
        petMachine.putPetInTheMachine(pet);
    }

    public static void checkIfHasPetInMachine(){
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    public static void verifyShampoo(){
        var amount = petMachine.shampooLevel();
        System.out.println("A máquina está no momento com " + amount + " litro(s) de shampoo!");
    }

    public static void setShampoo(){
        System.out.println("Tentando colocar shampoo na máquina!");
        petMachine.addShampoo();
    }

    public static void verifyWater(){
        var amount = petMachine.waterLevel();
        System.out.println("A máquina está no momento com " + amount + " litro(s) de água!");
    }

    public static void setWater(){
        System.out.println("Tentando colocar água na máquina!");
        petMachine.addWater();
    }

}
