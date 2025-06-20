package FinancialForcecasting;

public class RecursiveForecast {

	    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
	        if (years == 0) {
	            return presentValue;
	        }
	       
	        return calculateFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
	    }

	    public static void main(String[] args) {
	        double presentValue = 2233; 
	        double growthRate = 0.8;    
	        int years = 10;

	        double futureValue = calculateFutureValue(presentValue, growthRate, years);
	        System.out.printf("Predicted Future Value after %d years: ₹%.2f\n", years, futureValue);
	    }
	}


