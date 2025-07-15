public class PetMachine {
    private boolean isClean = true;
    private boolean hasPet = false;
    private int water = 0;
    private int shampoo = 0;

    // constructor
    public PetMachine() {
        this.isClean = isClean;
        this.hasPet = hasPet;
        this.water = water;
        this.shampoo = shampoo;
    }

    // banho do pet
    public boolean petBath(){
        if (waterLevel() <= 0) {
            System.out.println("O nível de água está zerado!");
            return false;
        }
        return true;
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

    // retirar pet da maquina

    // limpar maquina


    // getters

    public int getWater() {
        return water;
    }
    public int getShampoo() {
        return shampoo;
    }
}
