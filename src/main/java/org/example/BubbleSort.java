package org.example;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    private static List<Comparable> getListWithoutNull(List<Comparable> input){
        List<Comparable> output = new ArrayList<>();

        for(Comparable n : input){
            if(n != null){
                output.add(n);
            }
        }
        return output;
    }

    private static boolean hasDifferentTypesValues(List<Comparable> input){
        Class c = null;
        for(Comparable n : input){
            if(c == null){
                c = n.getClass();
            } else {
                if(!c.equals(n.getClass())){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isSwapRequire(List<Comparable> input, boolean isDifferentType, int first, int second){
        if(isDifferentType){
            if(Double.compare(((Number)input.get(first)).doubleValue(), ((Number)input.get(second)).doubleValue()) > 0){
                return true;
            }
        } else {
            if(input.get(first).compareTo(input.get(second)) > 0){
                return true;
            }
        }
        return false;
    }

    private static void swapElements(List<Comparable> input, int first, int second){
        Comparable tmp = input.get(first);
        input.set(first, input.get(second));
        input.set(second, tmp);
    }

    public static List<Comparable> sort(List<Comparable> input){
        if(input == null){
            throw new RuntimeException();
        }

        List<Comparable> myList = getListWithoutNull(input);
        boolean isDifferentType = hasDifferentTypesValues(myList);

        for(int i = 0; i < myList.size(); i++){
            int numberOfSwaps = 0;
            for(int j = 0; j < myList.size()-1; j++){
                if(isSwapRequire(myList, isDifferentType, j, j+1)){
                    swapElements(myList, j, j+1);
                    numberOfSwaps++;
                }
            }
            if (numberOfSwaps == 0) break;
        }

        return myList;
    }
}
