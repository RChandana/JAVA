// Basic java HashMap Code

import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        
        map.put(1, "Chandana");
        map.put(2, "Sreya");
        map.put(3, "XYZ");
        map.put(4, "ABC");
        
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Chandana"));
        System.out.println(map.get(3));
        System.out.println(map.keySet());
        System.out.println(map.size());
        
        for(int key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
        
        System.out.println(map.entrySet());
    }
}


// Print Duplicate values from the array

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        HashMap<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int num : arr){
            if(!map.containsKey(num)){
                map.put(num, true);
                list.add(num);
            }
        }
        System.out.println(list);
    }
}


// 
