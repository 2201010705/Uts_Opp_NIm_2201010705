public class ZooVisitor {
    private String name;
    private int age;
    private int ticketNumber;

    public ZooVisitor(String name, int age, int ticketNumber) {
        this.name = name;
        this.age = age;
        this.ticketNumber = ticketNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
}

