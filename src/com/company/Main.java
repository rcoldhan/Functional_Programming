package com.company;

public class Main {

    public static void main(String[] args) {
        int input = <получить число из ввода>
        массив1 = getFilledArray(10, input, лямбда);
        Вывод_в_консоль(массив1_строкой);
        массив2 = getFilledArray(10, input, лямбда);
        Вывод_в_консоль(массив2_строкой);
        ...
        массивN = getFilledArray(10, input, лямбда);
        Вывод_в_консоль(массивN_строкой);
        scanner.close()
    }

    getFilledArray(размер, модификатор, функц_интерфейс) {
        <создание и заполнение массива с использованием метода process>
        return массив;
    }
}
    }
}
