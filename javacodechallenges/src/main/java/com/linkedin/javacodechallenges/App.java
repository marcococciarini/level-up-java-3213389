package com.linkedin.javacodechallenges;

import java.util.List;
import java.util.Optional;

public class App {
    public static double calculateAverageChangeInvested(List<Double> purchases) {
        //return 0;

        //Optional<Double> result = purchases.stream().reduce(Double::sum);
        //Double result = purchases.stream().reduce(0.0,
        //        (a, b) -> a + (Math.ceil(b) - b));

        Double result = purchases.stream().mapToDouble(x -> (Math.ceil(x) - x)).average().orElse(0);

        /* 
        if (result.isPresent()){
            return result.get();
        } else{
            return 0;
        }
        */
        return result;
    }

    public static void main(String[] args) {
        List<Double> purchases = List.of(12.38, 38.29, 5.27, 3.21);
        System.out.println(calculateAverageChangeInvested(purchases));
    }
}
