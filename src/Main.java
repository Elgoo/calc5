import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    InpCalc inpCalc = new InpCalc();
        System.out.println("Вводите данные:");
        String strInpCalc = inpCalc.GetInputCalc();



        System.out.println(strInpCalc);

        // удалить пробелы проверить на допустимость ввод

        //System.out.println(strInpCalc.toUpperCase());
    }
}
