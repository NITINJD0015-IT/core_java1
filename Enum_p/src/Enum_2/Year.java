package Enum_2;

public class Year {
public static void main(String[] args) {
		
Month[] menuItems = Month.values();
for(Month month:menueItems) {
	System.out.print(menuItems.getNum()+".");
	System.out.println(menuItems.name());
}
}
}
