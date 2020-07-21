import java.util.Scanner;

public class InpCalc {

     String  GetInputCalc() {
         int i;
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
         str = str.toUpperCase(); // переводим в верхний регистр

         str = str.trim(); // удаляем начальные и кончные пробелы
         //проверяем на допустимость ввода 0 1 2 3 4 5 6 7 8 9
         // I V X
         // * / + -
         String arab = "0123456789";
         String  latin = "IVX";
         String oper ="*/+-";

         for ( i = 0; i < str.length(); i++){
             System.out.println(str);
         }




         return str;
    }
}