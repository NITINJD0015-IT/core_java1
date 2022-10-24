package enum1;

/**
 *
 * @author N
 */
public class HotalMenu {

    public static void main(String[] args) {
        FoodItem.IDLY.setPrice(25);
        FoodItem.DOSA.setPrice(30);
        FoodItem.PURI.setPrice(40);
        FoodItem.WADA.setPrice(45);

//        System.out.println(FoodItem.IDLY);
//        System.out.println(FoodItem.DOSA);
//        System.out.println(FoodItem.PURI);
//        System.out.println(FoodItem.WADA);
//        System.out.println();
//        
//        System.out.println(FoodItem.IDLY.ordinal()+".");
//        System.out.println(FoodItem.IDLY.name());
//        System.out.println(FoodItem.DOSA.ordinal()+".");
//        System.out.println(FoodItem.DOSA.name());
//        System.out.println(FoodItem.PURI.ordinal()+".");
//        System.out.println(FoodItem.PURI.name());
//        System.out.println(FoodItem.WADA.ordinal()+".");
//        System.out.println(FoodItem.WADA.name());
//        
        System.out.println("==============================================");

        FoodItem[] items = FoodItem.values();
        System.out.println("Sno.\tItems\tPrice");
        System.out.println("===============================================");
        for (int i = 0; i < items.length; i++) {
            FoodItem item = items[i];
            System.out.print(item.ordinal() + 1 + ".\t");
            System.out.print(item.name() + "\t");
            System.out.print(item.price);
            System.out.println();

        }

    }

}
