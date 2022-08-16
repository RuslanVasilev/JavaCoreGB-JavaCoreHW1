package Lesson1.Lesson2;

public class ArrayFour {
    public String[][] strings;

    public void setStrings(String[][] strings) {
        try {
            checkSizeArray(strings);
            this.strings = strings;
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (NullPointerException ne) {
            System.out.println("В параметр массива передан null!");
            ne.printStackTrace();
        }
    }


    private void checkSizeArray(String[][] strings) throws MyArraySizeException {
        if (strings.length != 4 || checkLengthStrings(strings)){
            throw new MyArraySizeException("Размер массива не соответствует 4х4");
        }
    }
    private boolean checkLengthStrings(String[][] strings) {
        for (String [] str: strings){
            if (str.length!=4){return true;}
        }
        return false;
    }
    private void summArray() throws MyArrayDataException {
        int result = 0;
        for (int x = 0; x < strings.length;x++) {
            String[] str = strings[x];
            for (int y = 0; y < str.length; y++) {
                try {
                    result+=Integer.parseInt(str[y]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException("Массив содержит не только числа, суммирование не возможно. Ошибка в ячейке: " + x + ":" + y);
                }
            }
        }
        System.out.println("Сумма элементов массива: " + result);
    }
    public void summ() {
        if (strings == null) {
            System.out.println("У класса не инициализирован массив строк, суммировать нечего");
            return;
        }

        try {
            summArray();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }


}
