public class RandomObject{
    private String name;
    private int number;
    private boolean obs;

    public RandomObject(String name, int number, boolean obs){
        this.name = name;
        this.number = number;
        this.obs = obs;
    }

    public String getName(){
        return this.name;
    }
    public int getNumber(){
        return this.number;
    }
    public boolean getObs(){
        return this.obs;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void setObs(boolean obs){
        this.obs = obs;
    }

    public String toString(){
        return name+','+number+','+obs;
    }

    public static void main(String[] args){
        RandomObject myRandObj = new RandomObject("Marcos", 26, true);
        System.out.println(myRandObj);
    }
}