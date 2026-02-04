package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysis {

    
    static class InsuranceClaim {
        private String claimType;
        private double claimAmount;

        public InsuranceClaim(String claimType, double claimAmount) {
            this.claimType = claimType;
            this.claimAmount = claimAmount;
        }

        public String getClaimType() {
            return claimType;
        }

        public double getClaimAmount() {
            return claimAmount;
        }
    }

    public static void main(String[] args) {

        List<InsuranceClaim> claims = Arrays.asList(
                new InsuranceClaim("Health", 50000),
                new InsuranceClaim("Health", 30000),
                new InsuranceClaim("Vehicle", 20000),
                new InsuranceClaim("Vehicle", 40000),
                new InsuranceClaim("Life", 100000)
        );


        Map<String, Double> averageClaimAmount =
                claims.stream()
                      .collect(Collectors.groupingBy(
                              InsuranceClaim::getClaimType,
                              Collectors.averagingDouble(InsuranceClaim::getClaimAmount)
                      ));


        averageClaimAmount.forEach(
                (type, avg) -> System.out.println(type + " Average Claim Amount: " + avg)
        );
    }
}
