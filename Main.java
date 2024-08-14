import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Альтернативное тестовое задание ");
        System.out.println("Выведите выражение : ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char a1;
        String[] data;


        if (str.contains(" + ")) {
            data = str.split(" \\+ ");
            a1 = '+';
        } else if (str.contains(" - ")) {
            data = str.split(" - ");
            a1 = '-';
        } else if (str.contains(" * ")) {
            data = str.split(" \\* ");
            a1 = '*';
        } else if (str.contains(" / ")) {
            data = str.split(" / ");
            a1 = '/';
        } else {
            throw new Exception("Вы ввели некоректный знак ");
        }


        if (a1 == '*' || a1 == '/') {
            if (data[1].contains("\"")) throw new Exception("Делить и умножать только на числа ");
        }
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i].replace("\"", "");
        }
        if(data[0].length()>10) throw new Exception("Длина строки не должна быть больше 10");


        if (a1 == '+') {
            res1(data[0] + data[1]);
        } else if (a1 == '-') {
                res1(data[0].replaceAll(data[1],"" ));

        } else if (a1 == '*') {
            StringBuilder res = new StringBuilder();
            int i = Integer.parseInt(data[1]);
               if (i< 1 || i > 10){throw new Exception("в программе должны приниматься числа от 1 до 10 включительно");
                                  }
            for (int j = 0; j < i; j++) {
                res.append(data[0]);
            }
            res1(res.toString());
        } else {
            int newLen = data[0].length() / Integer.parseInt(data[1]);
            String result = data[0].substring(0, newLen);
            res1(result);

        }
    }

    public static void res1(String dv) {
        if (dv.length()>40){
            System.out.println("\""+dv.substring(0,40)+"..."+"\"");}
        else
            System.out.println("\"" + dv + "\"");
    }
}
