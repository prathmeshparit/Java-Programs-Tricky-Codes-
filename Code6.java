public class Code6 {
    public static void main(String args[]) {
        String car, bus = "petrol";

        car = car + bus;

        System.out.println(car);
    }
}

// // output:error: variable car might not have been initialized
// car = car + bus;