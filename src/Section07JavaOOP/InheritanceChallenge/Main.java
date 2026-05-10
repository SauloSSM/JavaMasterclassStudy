package Section07JavaOOP.InheritanceChallenge;

public class Main {
    public static void main(String[] args) {

        Employee saulo = new Employee("Saulo", "04/02/2006", "20/07/2026");
        System.out.println(saulo);
        System.out.println("Idade = " + saulo.getAge());
        System.out.println("Pay = " + saulo.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990", "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension Check = $" + joe.collectPay());

        HourlyEmployee mari = new HourlyEmployee("Mari", "05/05/1970",
                "03/03/2021", 15);
        System.out.println(mari);
        System.out.println("Mari's Paycheck = $" + mari.collectPay());
        System.out.println("Mari's Holiday Paycheck = $" + mari.getDoublePay());
    }
}
