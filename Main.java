import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main 
{
  //TESTING
 public static void main(String[] args)
 {
   //ArrayList<Integer> al = new ArrayList();
   //al.add(2);
   //al.add(1);
   //al.add(3);
   
   //ArrayList<Double> al = new ArrayList();
   //al.add(2);
   //al.add(1);
   //al.add(3);

   //ArrayList<String> al = new ArrayList();
   //al.add("at");
   //al.add("the");
   //al.add("to");
   
   //TO CLONE AN ARRAY LIST:
   // ArrayList<Integer> b = new ArrayList();
   // for(int i=0; i < al.size(); i++)
   //{
     //b.add(al.get(i));
   //}
   

   //System.out.println(al);
   
   //removeEvenLength(al);
   
   //System.out.println(al);
   
   //int result = indexOfInt(al, 2);
   //System.out.println(result);
 }
  
  
  //
  //
  /*
  public static double findLargest(ArrayList<Double>  a)
  {
    double[] sorted = ArrayList.copyOf(a, a.length);
    
    ArrayList.sort(sorted);
    
    return sorted[a.length-ArrayList];
  }
  */
  //
  //
  
  
  //
  //
  /*
  public static int indexOfLargest(ArrayList<Double>  a)
  {
    double newList = ArrayList.copy(a, ArrayList);

    Collections.sort(a);

    for(int i = a.size-1; i >= 0; i--)
    {
       return newList;
    }
   }
   */
  //
  //
  
  
  /*
  //indexOfInt Works!
  public static int indexOfInt(ArrayList<Integer>  a, int target)
  {
    return a.indexOf(target);
  }
  */
  
  
  
  /*
  //hasSameElements Works!
  public static boolean hasSameElements(ArrayList<Integer>  a, ArrayList<Integer>  b)
  {
    //Sort them
    Collections.sort(a);
    Collections.sort(b);

    //Compare them
    for(int i = 0; i < a.size(); i++)
    {
      if(a.get(i) != b.get(i))
      {
        return false;
      }
    }
    return true;
  }
  */


  /*
  //removeEvenLength Works!
  public static void removeEvenLength(ArrayList<String>  a)
  {
    //Look at each string 
    Iterator<String> iter = a.iterator();

    while (iter.hasNext()){
      String str = iter.next();
      //Remove the even ones
      if(str.length() % 2 == 0)
      {
        iter.remove();
      }
    }
  }
  */


  /*
  //removeDuplicates Works!
  public static void removeDuplicates(ArrayList<Integer>  a) //Could also use while(i < a.size()) OR a for loop
  {
    int i = 0;
    while(i < a.size() - 1) //Loop only runs if there are 2 or more things in list
    {
      if(a.get(i) == a.get(i+1))
      {
        a.remove(i + 1);
        //Stay where you are since i+1 is now a NEW element
      }
      else
      {
        i++;
      }
    }
  }
  */
  
  
  /*
  //swapPairs Works!
  public static void swapPairs(ArrayList<String>  a)
  {
    int adjustedSize = a.size();
    if(a.size()%2 == 1) //if odd
    {
      adjustedSize = adjustedSize - 1; //leave the last guy alone
    }
    
    for(int i = 0; i < adjustedSize; i=i+2)
    {
      String item = a.remove(i+1);
      a.add(i, item);
    }

    
    //String itemOne = a.remove(1);
    //a.add(0, itemOne);
    
    //String itemThree = a.remove(3);
    //a.add(2, itemThree);
    
    //String itemFive = a.remove(3);
    //a.add(4, itemFive);
  }
  */


  //
  //
  /*
  public static void doubleList(ArrayList<String>  a)
  {
    //double[] twoList = ArrayList(a, ArrayList.length);
    //for(int i = 0; i < a.size(); i++)
    //{
      //System.out.println(" ");
    //}
    for(int i = 0; i < a.size(); i++)
    {
      //get the first word
      int adjustedSize = a.size();
      //insert a copy of it at the position of that word
      String item = a.add(i++);
      a.add(i, item);
      //move to next word,
    }
  }
  */
  //
  //


  /*
  //removeShorterStrings Works!
  public static void removeShorterStrings(ArrayList<String>  a)
  {
    int adjustedSize = a.size();
    if(a.size()%2 == 1) //if odd
    {
      adjustedSize = adjustedSize - 1; //leave the last guy alone
    }
    
    for(int i = 0; i < adjustedSize; i=i+2)
    {
      //Compare string i and i+1
      if(a.get(i).length() <= a.get(i+1).length())
      {
        //Remove first string
        a.remove(i);
      }
      else
      {
        a.remove(i+1);
      }
    }

  }
  */
  
  
  /*
  //Censor Works!
  //Replace all occurances of character c with * in the string
  //For example, if s="happy birthday" and c = 'h'
  //Would return "*appy birt*day"
  public static String censor(String s, char c)
  {
    //Option #1
    //return s.replace(c, '*');
    
    //Option #2
    String str = "";
    for(int i = 0; i < s.length(); i++)
    {
      if(s.charAt(i) == c)
      {
        str = str + "*";
      }
      else 
      {
        str = str + s.charAt(i);
      }
    }
    return str;
  }
  */
  
  
}