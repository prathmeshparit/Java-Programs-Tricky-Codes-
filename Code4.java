public class Code4 {
    public static void main(String args[]) {
        Integer int_data = new Integer(10);
        System.out.print(int_data.byteValue());

        System.out.print("-");

        int int_data_2 = new Integer(10);
        System.out.print(int_data_2.byteValue());
    }
}

// output :
// error: int cannot be dereferenced
// System.out.print(int_data_2.byteValue());
