public class Task_3 implements Task_3_base {
    @Override
    public int subtask_1_for(int n1, int n2, int a, int b) {
        // подсчитать, сколько чисел, кратных a, но не кратных b,
        // находится между числами n1 и n2 включительно
        int count = 0;
        if(n1 < n2){
            for(; n1 <= n2; n1++){
                if(n1%a == 0 && n1%b !=0)
                    count++;
            }
        } else {
            for(; n2 <= n1; n2++){
                if(n2%a == 0 && n2%b !=0)
                    count++;
            }
        }
        return count;
    }

    @Override
    public int subtask_2_for(int num) {
        // Последовательность чисел строится следующим образом:
        // сначала идет одна единица,
        // потом две двойки,
        // потом три тройки,
        // ...
        // потом n раз число n
        // ...
        // Найти, какое число будет находиться в этой последовательности
        // на позиции num
        int a=0;
        int b=0;
        int c=1;
        while (b<num){
            b=b+c;
            a=c;
            c=c+1;
        }
        return a;
    }

    @Override
    public int subtask_3_for(int num, int d, int cnt) {
        // Дана последовательность
        // a(0) = num
        // a(n) = a(n - 1) * d + 1
        // Найти сумму первых cnt элементов последовательности
        int a = num;
        int b = 0;
        for (int o = 0; o < cnt; o++){
            b = b + a;
            a = a*d + 1;
        }
        return b;
    }

    @Override
    public int subtask_4_for(int n) {
        // Вычислить сумму
        // S(n) = 1 + 1 * 2 + 1 * 2 * 3 + ... + n!
        // для заданного n
        // (n! - это n-факториал. Кто не знает - гуглите)
        int a = 1;
        int summ = 0;
        for(int i = 1; i <= n; i++) {
            a = a * i;
            summ = summ + a;
        }
        return summ;
    }
}
