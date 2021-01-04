package io.fulchr3356;

import java.util.ArrayList;
import java.util.List;

public class FindLongestSub {

    static public List<Integer> findLongestSub(List<Integer> list){
        int max = 0;
        int curr = 0;
        int begIndex = 0;
        int endIndex = 0;
        List<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < list.size()-1; i++){
            if(list.get(i+1) > list.get(i)) {
                curr++;
                endIndex = i+1;
                if (curr > max ){
                    max = curr;
                    tempList = list.subList(begIndex+1,endIndex+1);
                }
            }
            else{
                curr = 0;
                begIndex = i;
                endIndex = i;
            }


        }
        return tempList;
    }
}
