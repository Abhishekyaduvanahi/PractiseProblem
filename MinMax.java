import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
   Collections.sort(arr);
        long maxCount=0;
        long minCount=0;
        // for(int i=0;i<arr.size()-1;i++){
        //     maxsum=arr.get(i)+maxsum;
        // }
        //  for(int i=1;i<arr.size();i++){
        //     minsum=arr.get(i)+minsum;
        // }
        // System.out.println(maxsum+" "+ minsum);
         for(int i=0;i<arr.size()-1;i++){
        minCount=minCount+arr.get(i);
    }
    for(int i=arr.size()-1;i>0;i--){
        maxCount=maxCount+arr.get(i);
    }
    System.out.print(minCount+" "+maxCount);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
