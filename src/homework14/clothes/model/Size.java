package homework14.clothes.model;

import static homework14.clothes.model.ClothesSize.XXS;

public class Size {

    private int euroSize;
    private ClothesSize description;

    public Size(int euroSize) {
        this.euroSize = euroSize;
    }


    public Size(ClothesSize description, int euroSize) {
        this.description = ClothesSize.valueOf(String.valueOf(description));
        this.euroSize = euroSize;
    }


    public void getDescription(ClothesSize description) {
        if (euroSize == XXS.ordinal()) {
            System.out.println("Детский размер");
        } else {
            System.out.println("Взрослый размер");
        }
    }
}
