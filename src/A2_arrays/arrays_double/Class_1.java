package A2_arrays.arrays_double;

public class Class_1 {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10, 11},
                {12, 13}
        };

        System.out.println("Длина массива 1");
        System.out.println(array[0].length);
        System.out.println("Длина массива 2");
        System.out.println(array[1].length);
        System.out.println("Длина массива 3");
        System.out.println(array[2].length);

        System.out.println();
        //Элементы считаются по принципу - строка - столбец
        // строка 0, столбец 0
        System.out.println(array[0][0]);

        //строка 1, столбец 1
        System.out.println(array[1][1]);

        //строка 2, столбец 0
        System.out.println(array[2][0]);
    }
}
