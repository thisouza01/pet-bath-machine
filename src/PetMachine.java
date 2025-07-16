public class PetMachine {
    private boolean clean;
    private int water;
    private int shampoo;
    private Pet pet;

    // banho do pet
    public void takeAShower(){
        if (this.pet == null){
            System.out.println("Coloque o pet na máquina, para iniciar o banho");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo!");
    }

    // abastecer a agua
    public void addWater(){
        if (water == 30){
            System.out.println("A capacidade de água está no limite!");
            return;
        }
        water += 2;
    }

    // abastecer o shampoo
    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("A capacidade do shampoo está no limite!");
            return;
        }
        shampoo += 2;
    }

    // verificar nivel de agua
    public int waterLevel(){
        return water;
    }

    // verificar nivel de shampoo
    public int shampooLevel(){
        return shampoo;
    }

    // verificar se tem pet no banho
    public boolean hasPet(){
        return pet != null;
    }

    // colocar pet na maquina
    public void putPetInTheMachine(Pet pet){
        if (!this.clean) {
            System.out.println("A máquina está suja. Para colocar um pet, terá que limpa-la!");
            return;
        }

        if (hasPet()){
            System.out.println("Já tem um pet na máquina!");
            return;
        }

        this.pet = pet;
    }

    // retirar pet da maquina
    public void removePetFromMachine(){
        if (this.pet == null){
            System.out.println("Para retirar, precisa ter um pet dentro!");
            return;
        }

        this.clean = this.pet.isClean();

        System.out.println("o Pet " + pet.getName() + " está limpo!");
        this.pet = null;
    }

    // limpar maquina
    public void washMachine(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;

        System.out.println("A máquina está limpa!");
    }
}
