package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soldTickets = 0;
        int totalIncome = 0;
        int income = 0;

        System.out.println("\n");
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsInRaw = scanner.nextInt();
        final int seats = rows * seatsInRaw;
        String [][] cinema = new String[rows + 1][seatsInRaw + 1];
        createCinema(cinema);
        totalIncome = calculateTotalIncome(seats, rows, seatsInRaw);

        while (true) {
            showMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printSeats(cinema);
                    break;
                case 2:
                    while (true) {
                        System.out.println("\n");
                        System.out.println("Enter a row number:");
                        int myRow = scanner.nextInt();
                        System.out.println("Enter a seat number in that row:");
                        int mySeat = scanner.nextInt();
                        if (isInvalidSeat(myRow, mySeat, rows, seatsInRaw)) {
                            System.out.println("Wrong input!");
                            continue;
                        }
                        if (isSold(myRow, mySeat, cinema)) {
                            System.out.println("That ticket has already been purchased!");
                            continue;
                        }
                        income += calculatePrice(myRow, rows, seats);
                        soldTickets++;
                        System.out.println();
                        markSoldSeatInCinema(cinema, myRow, mySeat);
                        break;
                    }
                    break;
                case 3:
                    statistics(soldTickets, income, totalIncome, seats);
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }

    }

    static boolean isSold(int myRow, int mySeat, String[][] cinema) {
        if (cinema[myRow][mySeat].equals(" B")) {
            return true;
        }
        return false;
    }

    static boolean isInvalidSeat(int myRow, int mySeat, int rows, int seatsInRaw) {
        if ((myRow < 0 || myRow > rows) || (mySeat < 0 || mySeat > seatsInRaw)) {
            return true;
        }
        return false;
    }

    static String[][] createCinema(String[][] cinema) {
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                if (i == 0 && j == 0) {
                    cinema[i][j] = " ";
                } else if (i == 0 && j > 0) {
                    cinema[i][j] = " " + j;
                } else if (i > 0 && j == 0) {
                    cinema[i][j] = "\n" + i;
                } else {
                    cinema[i][j] = " S";
                }
            }
        }
        return cinema;
    }

    static int calculatePrice(int myRow, int rows, int seats) {
        if (seats < 60) {
            System.out.println("Ticket price: $10");
            return 10;
        } else if (myRow <= rows / 2) {
            System.out.println("Ticket price: $10");
            return 10;
        } else {
            System.out.println("Ticket price: $8");
            return 8;
        }
    }

    static String[][] markSoldSeatInCinema(String[][] cinema, int myRow, int mySeat) {
        cinema[myRow][mySeat] = " B";
        return cinema;
    }

    static void printSeats(String[][] cinema) {
        System.out.println();
        System.out.println("Cinema:");
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                if (j <= cinema[i].length) {
                    System.out.print(cinema[i][j]);
                } else {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }

    static void showMenu() {
        System.out.println();
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
    }

    static void statistics(int soldTickets, int income, int totalIncome, int seats) {
        double percentage = (double)soldTickets / seats * 100;
        System.out.println();
        System.out.printf("Number of purchased tickets: %d\n", soldTickets);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.printf("Current income: $%d\n", income);
        System.out.printf("Total income: $%d\n", totalIncome);
    }

    static int calculateTotalIncome(int seats, int rows, int seatsInRaw) {
        if (seats < 60) {
            return seats * 10;
        } else {
            return rows / 2 * seatsInRaw * 10 + (rows - rows / 2) * seatsInRaw * 8;
        }
    }
}