package Lesson2;

import java.util.Arrays;

public class HW2Core {

    public static void main(String[] args) {
        String[][] arr = {{"2", "f", "1", "5"}, {"1", "2", "3", "5"}, {"1", "2", "3", "4"}, {"1", "2", "3", "ф"}}; // создали массив
        try {
            int sum = 0;
            sum = myArraySize(arr);
            System.out.println("общая сумма элементов массива= "+ sum);
        } catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage());
        } catch (MyArrayDataException x) {
            System.out.println(x.getMessage());
        }
    }

    public static int myArraySize(String[][] arrays) throws MyArraySizeException, MyArrayDataException{
        if (arrays.length != 4) {
            throw new MyArraySizeException("ошибка в размере массива");
        }
        int sum = 0;
        int arrays1 = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.println("распечатали по одному элементы массива " + arrays[i][j]);
                try {
                    arrays1 = Integer.parseInt(arrays[i][j]);
                   }catch (NumberFormatException e) {
                throw new MyArrayDataException(" ошибка, символ вместо числа в ячейке [" + i + "] [" + j + "]");
                }
                System.out.println( "переменная: " + arrays1);
                sum = sum + arrays1;
                System.out.println("сумма элементов" + sum+" + "+ i+ " + "+ j);
                if (arrays[i].length != 4) {
                    throw new MyArraySizeException("ошибка в строке " + i);
                }

            }

        }
        return sum; //
    }

}




