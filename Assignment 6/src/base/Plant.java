package base;
public class Plant{
    boolean needsWatering;
    String plantFamily;
    String name;
    String wateringInstructions="water every day";
    String sunlightRequirements="make sure it's sunny!";

    public Plant(String plantFamily,String name) {
        System.out.println("Plant constructor ran");
        this.needsWatering = true;
        this.name=name;
        this.plantFamily = plantFamily;

    }

        public void wateringInstructions(){
            System.out.println(wateringInstructions);
            }

        public void sunlightRequirements(){
            System.out.println(sunlightRequirements);

        }


    public void getInfo(){
        System.out.println(this.needsWatering);
        System.out.println(this.plantFamily);
        System.out.println(this.name);
        System.out.println(wateringInstructions);
        System.out.println(sunlightRequirements);
    }
    public void speak(){System.out.println("Hi! I'm a plant!");}
}

