public class Main
{
       public static void main (String[] args)
       {
            String text = "hello";
            
            // länge des string
            
            int leange = text.length();
            System.out.print(leange);
            System.out.println();
            
            //uchstabe at position
            
            char c = text.charAt(1);
            System.out.println(c);
            
            //buchstaben von bis
            
            text = "hamster";
            String part = text.substring(2,5);
            System.out.println(part);

            //if contains check

            boolean check = text.contains("ll");
            System.out.println(check);
            
            //check if exist and position
            
            text = "fuck the planet";
            System.out.println(text.indexOf("test"));
            
            //replace
            
            String replaceStr = text.replace("ck", "kkkkk");
            System.out.println(replaceStr);
            
            //formatierung
            
            double preis = 12423.24342342;
            String preisStr = String.format("%.2f", preis);
            System.out.println(preisStr);
            
            // double to string
            
            preisStr = String.valueOf(preis);
            System.out.println(preisStr);
       }
}
