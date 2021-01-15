package com.hrms.testcases;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,Double> hashMap = new HashMap<>();
        hashMap.put("Eggs",12.99);
        hashMap.put("Milk",10.0);
        hashMap.put("Cake",20.0);
        hashMap.entrySet().removeIf(itElement -> itElement.getValue() > 10); //Lambda expression
//        while (itMap.hasNext()){
//            Map.Entry<String, Double> itElement =itMap.next();
//            if(itElement.getValue()>10){
//                itMap.remove();
//            }
//        }

//       Iterator<Map.Entry<String,Double>> itMap= hashMap.entrySet().iterator();
//       while (itMap.hasNext()){
//           Map.Entry<String, Double> itElement =itMap.next();
//           if(itElement.getValue()>10){
//               itMap.remove();
//           }
//       }
    }
}
