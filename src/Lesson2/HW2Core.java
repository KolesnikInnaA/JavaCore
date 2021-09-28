package Lesson2;

import java.util.Arrays;

public class HW2Core {

    public static void main(String[] args) {
        String[][] arr = {{"2", "а", "1", "5"}, {"1", "2", "3", "5"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}}; // создали массив
        try {         // try - пытаться, пытаемся обратиться к методу
            int sum = 0;       // объявляем, что сумма изначально =0
            sum = myArraySize(arr);   // сумма = тому, что вернет вызываемый метод myArraySize, на вход которому передаем двумерный массив arr
            System.out.println("общая сумма элементов массива= "+ sum);       //выводим на печать сумму
           // System.out.println(Arrays.deepToString(arr)); // проверили , что строка массива печатается нормально

            // System.out.println(args[i]); //ошибка
            // System.out.println(Arrays.toString(args[i]);  //ошибка
        } catch (MyArraySizeException ex) {   // catch - ловить, перехват ошибок.
            System.out.println(ex.getMessage());
        } catch (MyArrayDataException x) { // ловим исключения внутри блока try, обрабатываем и программа не завершает работу, а продолжает ее после обработки ошибки.
            System.out.println(x.getMessage());
        }
    }

    public static int myArraySize(String[][] arrays) throws MyArraySizeException, MyArrayDataException{ // указываем тип данных, которые хотим вернуть, сейчас инт,т.к. хотим вернуть сумму
        if (arrays.length != 4) {           // количество строк
            throw new MyArraySizeException("ошибка в размере массива");
        }
        int sum = 0;
        int arrays1 = 0;
        for (int i = 0; i < arrays.length; i++) {// цикл проходит по элементам в строке. количество элементов в строке
            for (int j = 0; j < arrays[i].length; j++) { // количество элементов в столбце
                System.out.println("распечатали по одному элементы массива " + arrays[i][j]);      // распечатали по одному элементы массива
                //try {
                    arrays1 = Integer.parseInt(arrays[i][j]); // перевели в строки в числа, в переменную arrays1 каждый раз записывается новое значение проходя по циклу.
               // }
                System.out.println( "переменная: " + arrays1);
                sum = sum + arrays1;   //  складываем сумму с последующим числом из arrays1, получаем сумму
                System.out.println("сумма элементов" + sum+" + "+ i+ " + "+ j);

                if (arrays[i].length != 4) {   // если количество элементов в строке не равно 4
                    throw new MyArraySizeException("ошибка в строке " + i); // то мы создаем ошибку класса MyArraySizeException
               // if (){   //В каком-то элементе массива преобразование не удалось
               //     throw new MyArrayDataException(" ошибка, символ вместо числа в ячейке [" +i +"] ["+j+"]");
               // }
                }

            }

        }
        return sum;   // должен лежать в возвращающем методе, но за пределами цикла
    }

}







//1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
    // При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    //2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
    // Если в каком-то элементе массива преобразование не удалось (например,
// в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException
// с детализацией, в какой именно ячейке лежат неверные данные.
    //3. В методе main() вызвать полученный метод, обработать возможные исключения
    // MyArraySizeException и MyArrayDataException и вывести результат расчета.




