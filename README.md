# Lab 09: Seating Chart

## Objectives
- Declare and create a two-dimensional array  
- Use nested loops to process rows and columns  
- Store and retrieve values from a 2D array  
- Write methods that take a 2D array as a parameter

---

## Background
A two-dimensional array can represent a grid. In this lab, you will model a classroom seating chart.

Each position in the array represents a seat.  
- Rows = rows of seats  
- Columns = seats in each row  

Each seat stores a student name or the string `"EMPTY"` if no one is sitting there.

---

## Program Description
Write a program that creates and manages a classroom seating chart.

Your program should:
1. Ask for number of rows  
2. Ask for number of seats per row  
3. Create a 2D array  
4. Fill all seats with `"EMPTY"`  
5. Assign students to seats  
6. Print the seating chart  
7. Count filled and empty seats  

---

## Specifications
Complete the implementation of the following methods

### fillEmpty
```
public static void fillEmpty(String[][] chart)
```
Fill every seat with `"EMPTY"`.

---

### assignSeat
```
public static void assignSeat(String[][] chart, int row, int col, String name)
```
Assign a student to a specific seat.

---

### printChart
```
public static void printChart(String[][] chart)
```
Display the seating chart.

---

### countFilledSeats
```
public static int countFilledSeats(String[][] chart)
```
Return the number of seats that are not `"EMPTY"`.

---

### countEmptySeats
```
public static int countEmptySeats(String[][] chart)
```
Return the number of seats that are `"EMPTY"`.

---

## Sample Output
```
Final Seating Chart:
[EMPTY] [Alex]  [Maria]
[Sam]   [EMPTY] [Noah]
[EMPTY] [EMPTY] [Priya]

Filled seats: 5
Empty seats: 4
```

---

## Starter Code
```java
import java.util.Scanner;

public class SeatingChart {

    public static void fillEmpty(String[][] chart) {
        // TODO
    }

    public static void assignSeat(String[][] chart, int row, int col, String name) {
        // TODO
    }

    public static void printChart(String[][] chart) {
        // TODO
    }

    public static int countFilledSeats(String[][] chart) {
        return 0;
    }

    public static int countEmptySeats(String[][] chart) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter rows:");
        int rows = input.nextInt();

        System.out.println("Enter columns:");
        int cols = input.nextInt();

        String[][] chart = new String[rows][cols];

        fillEmpty(chart);

        System.out.println("How many students?");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Name:");
            String name = input.nextLine();

            System.out.println("Row:");
            int r = input.nextInt();

            System.out.println("Column:");
            int c = input.nextInt();
            input.nextLine();

            assignSeat(chart, r, c, name);
        }

        printChart(chart);

        System.out.println("Filled: " + countFilledSeats(chart));
        System.out.println("Empty: " + countEmptySeats(chart));
    }
}
```
