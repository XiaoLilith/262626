import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class vcc {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Double x;

        System.out.println("Mời bạn nhập số a: ");
        double a = scanner.nextDouble();

        System.out.println("Mời bạn nhập số b: ");
        double b = scanner.nextDouble();

        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình có vô số nghiệm");
            }else{
                System.out.println("Phương trình có vô số nghiệm");
            }
        }else
            x = -b/(Double)a;
            System.out.println("Phương trình có nghiệm x = ");
        
        }
    }