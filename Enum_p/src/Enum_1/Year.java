package Enum_1;

public class Year {
public static void main(String[] args) {
		
Month[] months = Month.values();
for(Month month:months) {
	System.out.println(month.ordinal()+1+".");
	System.out.println(month.name());
}
}
}
