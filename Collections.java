import java.util.TreeSet; 
import java.util.Comparator; 
 class MyComparator implements Comparator<Integer> 
 { 
 public int compare(Integer I1,Integer I2) 
 { 
 if(I1<I2) 
 { 
 return +1; 
 } 
 else if(I1>I2) 
 { 
 return -1; 
 } 
 else 
 { 
 return 0; 
 } 
 } 
 } 
 class Collections
 
 { 
 public static void main(String[] args) 
 { 
 TreeSet<Integer> l = new TreeSet<Integer>(new MyComparator()); 
 l.add(10); 
 l.add(0); 
 l.add(15); 
 l.add(5); 
 l.add(20); 
 System.out.println(l); 
 } 
 } 