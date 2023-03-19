
import java.util.*;
public class DS4States {
  //List<String> stateList = new ArrayList<>();
  //String[] stateList = new String[50];
  List<List<String>> stateList = new ArrayList<List<String>>(50);
  Map<String, Integer> states = new HashMap<String, Integer>();
  public DS4States(){
   
   states.put("alabama", 0);
   states.put("arkansas", 1);
   states.put("arizona", 2);
   states.put("california", 3);
   states.put("colorado", 4);
   states.put("connecticut", 5);
   states.put("delaware", 6);
   states.put("florida", 7);
   states.put("georgia", 8);
   states.put("iowa", 9);
   states.put("idaho", 10);
   states.put("illinois", 11);
   states.put("indiana", 12);
   states.put("kansas", 13);
   states.put("kentucky", 14);
   states.put("louisiana", 15);
   states.put("massachusetts", 16);
   states.put("maryland", 17);
   states.put("maine", 18);
   states.put("michigan", 19);
   states.put("minnesota", 20);
   states.put("missouri", 21);
   states.put("mississippi", 22);
   states.put("montana", 23);
   states.put("north carolina", 24);
   states.put("north dakota", 25);
   states.put("nebraska", 26);
   states.put("new hampshire", 27);
   states.put("new jersey", 28);
   states.put("new mexico", 29);
   states.put("nevada", 30);
   states.put("new york", 31);
   states.put("ohio", 32);
   states.put("oklahoma", 33);
   states.put("oregon", 34);
   states.put("pennsylvania", 35);
   states.put("rhode island", 36);
   states.put("south carolina", 37);
   states.put("south dakota", 38);
   states.put("tennessee", 39);
   states.put("texas", 40);
   states.put("utah", 41);
   states.put("virginia", 42);
   states.put("vermont", 43);
   states.put("washington", 44);
   states.put("wisconsin", 45);
   states.put("west virginia", 46);
   states.put("wyoming", 47);

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
