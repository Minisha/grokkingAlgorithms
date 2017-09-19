package binarysearch;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BinarySerach {


    public static void main(String[] args) {
        IntStream natural = IntStream.iterate(0, i -> i + 1);
        BinarySerach d = new BinarySerach();
        IntStream limit = natural.limit(100);
        List<Integer> collect = limit.boxed().collect(Collectors.toList());

        Integer integer = binarySearch(collect, 27);
        System.out.println(integer);

    }


    public static Integer binarySearch(List<Integer> data, int guessItem) {
        float low = 0;
        float high = data.size()-1;

        while (low < high) {
            int middle = (int) Math.ceil((low+high) / 2);
            System.out.println(low +" = "+ high +" = "+middle);

            int elementToReturn = data.get(middle);
            if(elementToReturn == guessItem) {
                return elementToReturn;
            } else if(guessItem > elementToReturn) {
                low = middle;
            } else if(guessItem < elementToReturn) {
                high = middle;
            } else {
                return 0;
            }


        }
        return 0;
    }


}
