import java.util.Arrays;

class A{
    public static void main(String[] args) {
        int [][]numbers = new int[2][3];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        System.out.println(Arrays.deepToString(numbers));
        int [][] numbers2={{1,2},{3,4}};
        System.out.println(Arrays.deepToString(numbers2));

    }
}

