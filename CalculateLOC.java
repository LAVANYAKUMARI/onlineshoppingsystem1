# onlineshoppingsystem1
import java.io.*;
import java.util.Scanner;

public class CalculateLOC {

public static void main(String argu[]) {

Scanner read = new Scanner(System.in);

System.out.println("\n\tESTIMATION OF COST AND EFFORT");

System.out.println("\nNo.of modules");
int n = read.nextInt();

int[][] values = new int[10][4];

for(int i=1; i<=n; i++) {

System.out.println("\nModule - " + i);

for(int j=1; j<=3; j++) {

if(j==1)  System.out.println("Optimistic: ");
if(j==2)  System.out.println("Most likely: ");
if(j==3)  System.out.println("Pessimistic : ");

values[i][j] = read.nextInt();
}
}

System.out.println("\n\n\tESTIMATION OF LOC\n\t------------------------------");

float totalLOC=0, LOC;

for(int i=1; i<=n; i++) {

System.out.println("\nFor module - " + i);

int sum = 0;

for(int j=1; j<=3; j++) {

if(j == 2)
values[i][j] *= 4;
sum += values[i][j];
}

LOC = (float)sum / 6;

System.out.println("\tEstimated LOC : " + LOC);

totalLOC += (float)LOC;
}


System.out.println("\n-------------------------------------------");
System.out.println("\nTotal Estimated LOC   : " + totalLOC);
System.out.println("\n-------------------------------------------\n");

System.out.println("Labour rate");
int labourRate = read.nextInt();
System.out.println("Historical data indicates");
int historicalData = read.nextInt();


System.out.println("\n\tESTIMATION OF COST\n\t----------------------");

double costPerLOC =  Math.ceil(labourRate/historicalData);

System.out.println("\nCost per LOC : " + costPerLOC);

System.out.println("\nTotal cost : " + totalLOC * costPerLOC);

System.out.println("\n\tESTIMATION OF EFFORT\n\t---------------------");

float eff = totalLOC / historicalData;
double effort = Math.ceil(eff);

System.out.println("\nEffort : " + effort + "\n\n");

}
}



