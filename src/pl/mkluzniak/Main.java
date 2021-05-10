package pl.mkluzniak;

public class Main {

    public static void main(String[] args) {
	 /* wrapper class = provides a wam to use primitive data types as reference daata types
                        reference data types contain useful methods
                        can be use with collections (ex.ArrayList)

        primitive       wrapper
        -----           -----
        boolean         Boolean
        char            Character
        int             Integer
        double          Double

        autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper class
        unboxing = the reverse autoboxing. Automatic conversion of wrapper class to primitive
	  */

        Boolean a = true;
        Character b = '$';
        Integer c = 124;
        Double d = 3.14;
        String e = "Bro";

        if(a==true){
            System.out.println("This is true");
        }


    }
}
