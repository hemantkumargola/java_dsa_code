import java.util.ArrayList;

public class chw_13 {
    public static void main(String[] args) {

    
        ArrayList<String> names = new ArrayList<>();

   
        names.add("Ram");
        names.add("Shyam");
        names.add("Sita");
        names.add("Gita");

    
        System.out.println("Names: " + names);

        System.out.println("First element: " + names.get(0));

   
        names.remove(2); 

     
        names.set(1, "Krishna");

      
        System.out.println("Updated Names: " + names);
    }
}
