
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
   states.put("delaware", 7);
   states.put("florida", 8);
   states.put("georgia", 9);
   states.put("hawaii", 10);
   states.put("iowa", 11);
   states.put("idaho", 12);
   states.put("illinois", 13);
   states.put("indiana", 14);
   states.put("kansas", 15);
   states.put("kentucky", 16);
   states.put("louisiana", 17);
   states.put("massachusetts", 18);
   states.put("maryland", 19);
   states.put("maine", 20);
   states.put("michigan", 21);
   states.put("minnesota", 22);
   states.put("missouri", 23);
   states.put("mississippi", 24);
   states.put("montana", 25);
   states.put("north carolina", 26);
   states.put("north dakota", 27);
   states.put("nebraska", 28);
   states.put("new hampshire", 29);
   states.put("new jersey", 30);
   states.put("new mexico", 31);
   states.put("nevada", 32);
   states.put("new york", 33);
   states.put("ohio", 34);
   states.put("oklahoma", 35);
   states.put("oregon", 36);
   states.put("pennsylvania", 37);
   states.put("rhode island", 38);
   states.put("south carolina", 39);
   states.put("south dakota", 40);
   states.put("tennessee", 41);
   states.put("texas", 42);
   states.put("utah", 43);
   states.put("virginia", 44);
   states.put("vermont", 45);
   states.put("washington", 46);
   states.put("wisconsin", 47);
   states.put("west virginia", 48);
   states.put("wyoming", 49);

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
