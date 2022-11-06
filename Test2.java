// import java.util.ArrayList;
 
// public class Test2 {
//   public static void main(String[] args) {
//     ArrayList<Integer> numbers = new ArrayList<Integer>();
//     numbers.add(5);
//     numbers.add(9);
//     numbers.add(8);
//     numbers.add(1);
//     numbers.forEach( (n) -> { System.out.println(n); } );
//   }
// }

// functional interface using lambda expressions 
  
class Test2 
{ 
  public static void main(String args[]) 
  { 
  
    // lambda expression to create the object 
    new Thread(()-> 
       {System.out.println("New thread created");}).start(); 
  } 
} 