// Метод endsWith() – проверяет, 
// заканчивается ли эта строка указанным окончанием.

public class task9EndsWith {
    public static void main(String args[]){
        String Str = new String("Вы многому научились, молодой Скайуокер.");
        boolean retVal;
  
        retVal = Str.endsWith("Скайуокер.");
        System.out.println("Возвращаемое значение: " + retVal);
  
        retVal = Str.endsWith("Скайуокер");
        System.out.println("Возвращаемое значение: " + retVal);
     }
}
