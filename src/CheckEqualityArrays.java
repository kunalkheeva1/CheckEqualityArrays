import java.util.HashMap;

public class CheckEqualityArrays {

    public static boolean checkEqualityArrays(int arr1 [], int arr2[], int n){
        //map
        HashMap<Integer, Integer> map = new HashMap<>();
        //add all the elements of arr1 in map
        for(int i= 0; i<n; i++){
            map.put(arr1[i], map.getOrDefault(arr1[i],0)+1);
        }
        //if map contain any elemnent of arr2
        for(int i=0; i<n; i++){
            if(map.containsKey(arr2[i])){
                //then put
                map.put(arr2[i], map.get(arr2[i]) -1 );
                if(map.get(arr2[i])<0){
                    return false;
                }
                else{
                    return false;
                }
            }
        }return true;



    }

    public static void main(String[] args) {

    }
}
