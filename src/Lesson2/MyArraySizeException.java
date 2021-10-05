package Lesson2;

public class MyArraySizeException extends Exception{  // вызываемый метод//
    //конструктор
    public MyArraySizeException (String mes){ //  сюда передали информацию в этом случае типа стринг,
        // мы их должны сохранить в область памяти message( можно писать любое имя переменной вместо message)
        super(mes); // вызываем конструктор родительского класса Exception
    }

}
