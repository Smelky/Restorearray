package com.company;
import java.util.Arrays;
        public class Main {
            public static void business () {
                int[] arr = {1, 2, -1, 4, 7, 6, -2, 4};
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] < 0) {
                        if ((arr[i - 1] == arr[i + 1]) || (arr[i - 1] - arr[i + 1]) == 1) {
                            System.out.println("Bad elements in array");
                            return;
                        } else if (arr[i - 1] < arr[i + 1]) {
                            arr[i] = arr[i - 1] + 1;
                        } else if (arr[i - 1] > arr[i + 1]) {
                            arr[i] = arr[i + 1] + 1;
                        }
                    }
                }
                System.out.println(Arrays.toString(arr));
            }
            public static void main(String[] args) {
                business();
            }
        }
