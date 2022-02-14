public class Stage04 {
    public static void main(String[] args) {
        System.out.println("Результаты логических операций с двумя boolean переменными:\\n=====================");
        for (int i = 1; i <= 30; i++){
            System.out.print(i + "-\t" + i%10 + "\t  ");
            if (i % 10 == 0){System.out.println();}
        }

    }
}
