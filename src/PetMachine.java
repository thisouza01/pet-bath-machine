public class PetMachine {
    private boolean isClean = true;
    private boolean hasPet = false;
    private int water = 0;
    private int shampoo = 0;

    private Pet pet;

    // banho do pet
    public void takeShower(){
        if (waterLevel() <= 0) {
            System.out.println("O nível de água está zerado!");
        }

        pet.setClean(true);
    }

    public boolean setClean(boolean isClean){
        return isClean;
    }

    // abastecer a agua
    public void putWater(){
        this.water += 2;
    }

    // abastecer o shampoo
    public void putShampoo(){
        this.shampoo += 2;
    }

    // verificar nivel de agua
    public int waterLevel(){
        return getWater();
    }

    // verificar nivel de shampoo
    public int shampooLevel(){
        return getShampoo();
    }
    // verificar se tem pet no banho

    // colocar pet na maquina
    public void putPetInTheMachine(){
        if (this.pet != null){
            System.out.println("Já tem um pet na máquina!");
        }
    }

    // retirar pet da maquina
    public void removePetFromMachine(){
        if (this.pet == null){
            System.out.println("Para retirar, precisa ter um pet dentro!");
            return;
        }
    }
    // limpar maquina


    // getters

    public int getWater() {
        return this.water;
    }
    public int getShampoo() {
        return shampoo;
    }
}
