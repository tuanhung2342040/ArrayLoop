import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Index\t" +"Value");
        int count = 0;
        int sum = 0;
        double average;
        int temp;

        Random random = new Random();
        int [] arr = new int[20];
        for(int i = 0; i<arr.length;i++){
            arr[i] = random.nextInt(6) + 1;
            System.out.println(" " + i + "\t\t" + arr[i]);
            if(arr[i]==1){
                count++;
            }
        }
        System.out.println("The number of 1 were randomly generated is " + count);
        System.out.println("-----------------------------------------------------");
        System.out.println("Index\t" +"Value");
        int [] numbers = new int[10];
        for(int i=0;i<numbers.length;i++){
            numbers[i] = random.nextInt(100) +1;
            System.out.println(" " + i +"\t\t" + numbers[i]);
            sum += numbers[i];
        }
        average = sum/numbers.length;
        System.out.println("The average of these values is " + average);
        System.out.println("----------------------------------------------");

        System.out.println("Index\t" +"Value");
        int [] array = new int[10];
        for(int i=0;i<array.length;i++){
            temp = numbers[0];
            numbers[0]=numbers[1];
            numbers[1]=temp;
            System.out.println(" " + i +"\t\t" + numbers[i]);

        }
        System.out.println("----------------------------------");


        int [] number = new int[10];
        for(int i = 9; i >= 0;i--){
            System.out.println(" " + i +"\t\t" + numbers[i]);
        }

    }
}
