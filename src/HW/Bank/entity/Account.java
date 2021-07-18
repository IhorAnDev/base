package HW.Bank.entity;

public class Account {

    private Person accountVladelec;
    private Bill bill;

    public Account(Person accountVladelec, Bill bill) {
        this.accountVladelec = accountVladelec;
        this.bill = bill;
    }

    public Person getAccountVladelec() {
        return accountVladelec;
    }

    public void setAccountVladelec(Person accountVladelec) {
        this.accountVladelec = accountVladelec;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
