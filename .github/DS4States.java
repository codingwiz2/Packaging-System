
import java.util.*;
public class DS4States {
  //List<String> stateList = new ArrayList<>();
  //String[] stateList = new String[50];
  List<List<String>> stateList = new ArrayList<List<String>>(50);
  Map<String, Integer> states = new HashMap<String, Integer>();
  public DS4States(){
   
   states.put("alaska", 0);
   states.put("alabama", 1);
   states.put("arkansas", 2);
   states.put("arizona", 3);
   states.put("california", 4);
   states.put("colorado", 5);
   states.put("connecticut", 6);

   //Washington D.C.
   states.put("district of columbia", 7);
   states.put("dc", 7);

   states.put("delaware", 8);
   states.put("florida", 9);
   states.put("georgia", 10);
   states.put("hawaii", 11);
   states.put("iowa", 12);
   states.put("idaho", 13);
   states.put("illinois", 14);
   states.put("indiana", 15);
   states.put("kansas", 16);
   states.put("kentucky", 17);
   states.put("louisiana", 18);
   states.put("massachusetts", 19);
   states.put("maryland", 20);
   states.put("maine", 21);
   states.put("michigan", 22);
   states.put("minnesota", 23);
   states.put("missouri", 24);
   states.put("mississippi", 25);
   states.put("montana", 26);
   states.put("north carolina", 27);
   states.put("north dakota", 28);
   states.put("nebraska", 29);
   states.put("new hampshire", 30);
   states.put("new jersey", 31);
   states.put("new mexico", 32);
   states.put("nevada", 33);
   states.put("new york", 34);
   states.put("ohio", 35);
   states.put("oklahoma", 36);
   states.put("oregon", 37);
   states.put("pennsylvania", 38);
   states.put("rhode island", 39);
   states.put("south carolina", 40);
   states.put("south dakota", 41);
   states.put("tennessee", 42);
   states.put("texas", 43);
   states.put("utah", 44);
   states.put("virginia", 45);
   states.put("vermont", 46);
   states.put("washington", 47);
   states.put("wisconsin", 48);
   states.put("west virginia", 49);
   states.put("wyoming", 50);

   //add acronyms ex. AZ, VA, etc.?
   //what data type are we storing for double arrayList?
   //hasmap inside hasmap? states->cities->districts?
  }
  public void printStates(){
   for(int i = 0; i < stateList.size(); i++){
    System.out.println(stateList.get(i));
   }
  }
  
  // public void convertToArrayList(String[] stateList){

  // }

  public void printKeys(){
   for (String i : states.keySet()) {
    System.out.println(i);
  }
  }

  public int getStateCode(String stateName){
   if(states.get(stateName.toLowerCase()) == null){
    System.out.println("There is no matching States!");
    return 0;
    //throw new IllegalArgumentException("There is no matching States!");
   }
   else{
    return states.get(stateName.toLowerCase()); //this makes it not case sensitive.
   }
  }

  public static void main(String[] args) {
   DS4States state = new DS4States();
   System.out.println(state.getStateCode("alabama")); //this should give us code of 0 -> arrayList index at 0
   //System.out.println(state.getStateCode("test")); //this should throw illegal args
   System.out.println(state.getStateCode("dc"));
   state.printKeys();
  
  }
}
