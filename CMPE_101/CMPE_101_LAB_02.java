public class Main {

    private String type;
    private String brand;
    private int mileage;

    public Main(String t, String b, int m) {
        type = t;
        brand = b;
        mileage = m;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public int getMileage() {
        return mileage;
    }

    public void setType(String t) {
        type = t;
    }

    public void setBrand(String b) {
        brand = b;
    }

    public void setMileage(int m) {
        mileage = m;
    }

    public String getCondition() {
        if (mileage < 10000)
            return "New";
        else if (mileage <= 50000)
            return "Lightly Used";
        else if (mileage <= 100000)
            return "Moderately Used";
        else if (mileage <= 200000)
            return "Heavily Used";
        else
            return "Very Old";
    }

    public static double calculator(double a, double b, char op) {
        if (op == '+')
            return a + b;
        else if (op == '-')
            return a - b;
        else if (op == '*')
            return a * b;
        else if (op == '/')
            return a / b;
        else
            return 0;
    }

    public static int countDigit(int n) {
        int count = 0;

        if (n == 0)
            return 1;

        while (n != 0) {
            n = n / 10;
            count++;
        }

        return count;
    }

    public static int sumDigit(int n) {
        int sum = 0;

        while (n != 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }

        return sum;
    }

    public static int sumSqrOfDivByM(int n, int m) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sum = sum + (i * i);
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Main v = new Main("Car", "Toyota", 30000);

        System.out.println("Type: " + v.getType());
        System.out.println("Brand: " + v.getBrand());
        System.out.println("Mileage: " + v.getMileage());
        System.out.println("Condition: " + v.getCondition());

        System.out.println("-----");

        System.out.println("Calculator + : " + calculator(5, 3, '+'));
        System.out.println("Calculator - : " + calculator(5, 3, '-'));
        System.out.println("Calculator * : " + calculator(5, 3, '*'));
        System.out.println("Calculator / : " + calculator(5, 3, '/'));

        System.out.println("-----");

        System.out.println("Digit count: " + countDigit(12345));
        System.out.println("Digit sum: " + sumDigit(12345));

        System.out.println("-----");

        System.out.println("Sum of squares: " + sumSqrOfDivByM(10, 2));
    }
}