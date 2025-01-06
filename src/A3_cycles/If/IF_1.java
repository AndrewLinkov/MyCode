package A3_cycles.If;

import java.util.Scanner;

/*
Ќапишите программу, котора€ считает строку и определит, есть ли в ней именно
слово "повторение". —лово может быть написано как с маленькой, так и с большой буквы.
√арантируетс€, что знаки препинани€ из текста были удалены. Ќа экран выведите YES/NO.
 */
public class IF_1 {
    public static void main(String[] args) {
        int counter = 0;

        System.out.println("¬ведите строку: ");
        //повторение мать учени€
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().toLowerCase().split(" ");
        for(int i = 0; i<a.length; i++){
            if (a[i].equals("повторение")){
                counter++;
            }
        }
        if(counter>0){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}
