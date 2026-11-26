public class VirtualPet {
    private int hunger, happiness;
    private String name;

    public VirtualPet(String name) {
        this.name = name;
        hunger = 5;
        happiness = 5;
    }

    public VirtualPet(String name, int hunger, int happiness) {
        this.name = name;
        if (hunger <= 10 && hunger >= 0) {
            this.hunger = hunger;
        } else
            this.hunger = 10;
        if (happiness <= 10 && happiness >= 0) {
            this.happiness = happiness;
        } else
            this.happiness = 0;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getHunger() {
        return hunger;
    }

    public void feed() {
       if(hunger>=3){ 
        hunger -= 3;
	}else hunger = 0;
    }

    public void play() {
       if(happiness<=8){
        happiness += 2;
	} else happiness =10;
        if(hunger <=9){
        hunger++;
	} else hunger +=0;
    }

    public boolean isHappy() {
        if (happiness >= 7 && hunger <= 4) {
            return true;
        }
        return false;
    }

    public String toString() {
        return name + " (hunger " + hunger + ", happiness " + happiness + ")";
    }
}
