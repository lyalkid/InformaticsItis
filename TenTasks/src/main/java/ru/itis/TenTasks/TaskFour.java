package ru.itis.TenTasks;


import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение: ");
        int n = in.nextInt();
        if (n>5) {
            int b=1;

            while (b < n*2) {
                if (b < n - 1) {
                    b = b + 1;
                    System.out.print("*");
                }
                if (b == n) {
                    b = b + 1;
                    System.out.print("00");
                } else {
                    b = b + 1;
                    System.out.print("*");
                }
            }
            System.out.println();

            for (int i = 4; i <= n; ++i) {
                for (int I = i; I < n; ++I) {
                    System.out.print("*");
                }
                if (i==n) {
                    int d = 1;
                    while (d <= n*2) {
                        if (d == 1) {
                            d = d + 1;
                            System.out.print("*");
                        }
                        if ((d > 1) && (d < n*2 ) ) {
                            d = d + 1;
                            System.out.print("0");
                        } else {
                            d = d + 1;
                            System.out.print("*");
                        }
                    }
                    System.out.println();

                    d = 1;
                    while (d <= n*2) {
                        if (d == 1) {
                            d = d + 1;
                            System.out.print("*");
                        }
                        if ((d > 1) && (d < n*2 ) ) {
                            d = d + 1;
                            System.out.print("0");
                        } else {
                            d = d + 1;
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    d=0;
                    while (d < n*2) {
                        if (d < n - n*2) {
                            d = d + 1;
                            System.out.print("*");
                        }
                        if ((d >= n - n*2) && (d <= n + n*2)) {
                            d = d + 1;
                            System.out.print("0");
                        } else {
                            d = d + 1;
                            System.out.print("*");
                        }
                    }
                }

                else{
                    for (int s = 1; s < 2 * i + 1; ++s) {
                        System.out.print("0");
                    }
                }

                for (int r = 0; r < n - i; ++r) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = n-1; i >= 4; --i) {

                        if (i==n-1){
                    int d = 0;
                    while (d < n*2) {
                        if (d < n - n*2) {
                            d = d + 1;
                            System.out.print("*");
                        }
                        if ((d >= n - n*2) && (d <= n + n*2)) {
                            d = d + 1;
                            System.out.print("0");
                        } else {
                            d = d + 1;
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    d = 1;
                    while (d <= n*2) {
                        if (d == 1) {
                            d = d + 1;
                            System.out.print("*");
                        }
                        if ((d > 1) && (d < n*2 ) ) {
                            d = d + 1;
                            System.out.print("0");
                        } else {
                            d = d + 1;
                            System.out.print("*");
                        }
                    }
                    System.out.println();

                    d = 1;
                    while (d <= n*2) {
                        if (d == 1) {
                            d = d + 1;
                            System.out.print("*");
                        }
                        if ((d > 1) && (d < n*2 ) ) {
                            d = d + 1;
                            System.out.print("0");
                        } else {
                            d = d + 1;
                            System.out.print("*");
                        }
                    }
                    System.out.println();

                }
                for (int I = n; I > i; --I) {
                    System.out.print("*");
                }

                for (int s = 1; s < 2 * i + 1; ++s) {
                    System.out.print("0");
                }

                for (int r = n; r > i; --r) {
                    System.out.print("*");
                }
                System.out.println();
            }
            b=1;
            while (b < n*2) {
                if (b < n - 1) {
                    b = b + 1;
                    System.out.print("*");
                }
                if (b == n) {
                    b = b + 1;
                    System.out.print("00");
                } else {
                    b = b + 1;
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        if (n==2){
            int x = 1;
            int s = n*2;
            while (x < s) {
                if (x < n - 1) {
                    x = x + 1;
                    System.out.print("*");
                }
                if (x == n) {
                    x = x + 1;
                    System.out.print("00");
                } else {
                    x = x + 1;
                    System.out.print("*");
                }
            }
            System.out.println();
            x = x - x;
            while (x < s) {
                if (x < n - s) {
                    x = x + 1;
                    System.out.print("*");
                }
                if ((x >= n - s) && (x <= n + s)) {
                    x = x + 1;
                    System.out.print("0");
                } else {
                    x = x + 1;
                    System.out.print("*");
                }
            }
            x=0;
            System.out.println();
            while (x < s) {
                if (x < n - s) {
                    x = x + 1;
                    System.out.print("*");
                }
                if ((x >= n - s) && (x <= n + s)) {
                    x = x + 1;
                    System.out.print("0");
                } else {
                    x = x + 1;
                    System.out.print("*");
                }
            }
            System.out.println();
            x = 1;
            while (x < s ) {
                if (x < n - 1) {
                    x = x + 1;
                    System.out.print("*");
                }
                if (x == n) {
                    x = x + 1;
                    System.out.print("00");
                }
                else {
                    x = x + 1;
                    System.out.print("*");
                }
            }
        }



    }
}
