import java.util.PriorityQueue;

public class TreePackage {
    private final PriorityQueue<packageNodeClass> packageNodeClassPriorityQueue;
    public TreePackage(){
         packageNodeClassPriorityQueue = new PriorityQueue<packageNodeClass>();
    }

    public boolean search(packageNodeClass packageVal){
        if(packageNodeClassPriorityQueue.contains(packageVal)){
            System.out.println("The package is present in: " + packageVal.getCurrentLocation());
            return true;
        }
        else{
            System.out.println("ERROR: The package is not in the system.");
            return false;
        }
    }
    public void addVal(packageNodeClass packageVal){
        if(packageNodeClassPriorityQueue.contains(packageVal)){
            System.out.println("ERROR: The package is in the system.");
        }
        else{
            packageNodeClassPriorityQueue.add(packageVal);
            System.out.println("Package successfully added.");
        }

    }
    public void remove(packageNodeClass packageVal){
        if(packageNodeClassPriorityQueue.contains(packageVal)){
            packageNodeClassPriorityQueue.remove(packageVal);
            System.out.println("Package successfully removed.");
        }
        else{
            System.out.println("ERROR: The package is not in the system.");
        }

    }
}