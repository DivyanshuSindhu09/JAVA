public class Loop {
    //! jab pta na ho ki loop kitni baar run krega toh while loop use kro
    //! jab pta ho ki kitni baar loop run krna hai toh for loop use kro
    public static void main(String[] args) {
        //? while loop
        int count = 1;
        while (count != 5) {
            System.out.println(count); // 1 2 3 4
            count++;
        }

        //? for loop 
        for(int integer = 1; integer <= 5; integer++){
            System.out.println(integer); //1 2 3 4 5
        }
    }
}