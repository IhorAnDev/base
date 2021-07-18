package HW.Bank;

import HW.Bank.entity.Account;
import HW.Bank.entity.Bill;
import HW.Bank.entity.Person;

public class Main {
    public static void main(String[] args) {

        Person mirialPerson = new Person("Mirial", "Tarasov", "0973111147");
        Bill schetMirial = new Bill(11200);

        Person bongoPerson = new Person("Bongo", "Petrov", "0934567891");
        Bill schetBongo = new Bill(10000);


        Account accountLori = new Account(mirialPerson, schetMirial);
        Account accountBongo = new Account(bongoPerson, schetBongo);


    }
}
