interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("UPI payment: " + amount);
    }
}

class Cash implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Cash payment: " + amount);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new Cash();

        p1.pay(500);
        p2.pay(300);
    }
}
