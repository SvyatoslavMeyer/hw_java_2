// Метод compareToIgnoreCase() – в Java сравнивает 
// лексически две строки, игнорируя регистр букв.

public class task4Ignore {
    public static void main(String args[]) {
        String str1 = "О-о, макси-класс твоя Сила!.. Но дело пахнет керосина.";
        String str2 = "О-о, макси-класс твоя Сила!.. Но дело пахнет керосина.";
        String str3 = "Вы многому научились, молодой Скайуокер.";
  
        int result = str1.compareToIgnoreCase(str2);
        System.out.println(result);
        
        result = str2.compareToIgnoreCase(str3);
        System.out.println(result);
       
        result = str3.compareToIgnoreCase(str1);
        System.out.println(result);
     }
}
