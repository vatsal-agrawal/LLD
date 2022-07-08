package lld.ATM;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class ATM {

    int atmId;
    Address location;
    CashDispenser cashDispenser;
    Screen screen;
    CardReader cardReader;
    Keypad keypad;
    CashDeposit cashDeposit;
    ChequeDeposit chequeDeposit;
    BankService bankService;
}

class Address {
    int pinCode; //ZipCode
    String street;
    String city;
    String state;
    String country;
}

class CashDispenser {
    Map<CashType, List<Cash>> cashAvailable;
    public void dispenseCash(int amount){};

}

enum CashType {
    FIFTY, HUNDRED, FIVEHUNDRED;
}

class Cash {
        CashType cashType;
        String serialNumber;
    }

class Screen {
    public void display(String message){};
}

class CardReader {
    public CardInfo fetchCardDetails(){return null;};
}

class CardInfo {
    CardType cardType;
    Bank bank;
    String cardNumber;
    Date expiryDate;
    int cvv;
    float withdrawLimit;

}

enum CardType {
    DEBIT,CREDIT;
}

class Keypad {
    public String getInput(){return "";};
}


class Bank {
    String name;
    Address location;
    List<ATM> atmList;
}

interface BankService {
    // we will not store customer related information inside atm,
    // atm will interact with bank and get customer information
    public Boolean isValidUser(String pin, CardInfo cardInfo);
    public Customer getCustomerDetails(CardInfo cardInfo);
    public TransactionDetail executeTransaction(Transaction transactionInfo, Customer customer);

}

class BankA implements BankService {

    public Boolean isValidUser(String pin, CardInfo cardInfo){return null;};
    public Customer getCustomerDetails(CardInfo cardInfo){return null;};
    public TransactionDetail executeTransaction(Transaction transactionInfo, Customer customer){return null;};

}

class BankB implements BankService {

    public Boolean isValidUser(String pin, CardInfo cardInfo){return null;};;
    public Customer getCustomerDetails(CardInfo cardInfo){return null;};;
    public TransactionDetail executeTransaction(Transaction transactionInfo, Customer customer){return null;};

}

class BankServiceFactory {

    //It will return BankA / BankB object so that for transacting we can use that.
    public BankService getBankServiceObject(CardInfo cardInfo){return null;};

}

class Customer {

    String firstName;
    String lastName;
    String accountNumber;
    CardInfo cardInfo;
    Account account;

    BankService bankServiceObj;

    CustomerStatus customerStatus;

}

//We can divide this into further sub classes depending on requirements!
//into savings and current accounts.
class Account {

    String accountNumber;
    Float availableBalance;

}

enum CustomerStatus {

    BLOCKED, ACTIVE, CLOSED;
}

class Transaction {

    Integer transactionId;
    String sourceAccount;
    Date transactionDate;

}

class Deposit extends Transaction {

    float amount;

}

class ChequeDeposit extends Deposit {

    public Cheque getCheque(){return null;};

}

class CashDeposit extends Deposit {

    public List<Cash> getCash(){return null;};

}

class Withdraw extends Transaction {

    float amount;

}

class Transfer extends Transaction {

    String destinationAccount;
    float amount;

}

class TransactionDetail {

    TransactionStatus transactionStatus;
    String sourceAccountNumber;
    Date transactionDate;
    TransactionType transactionType;

    int transactionId;
}

enum TransactionStatus {

    PENDING, CANCELLED, SUCCESS, ERROR;
}

enum TransactionType {

    WITHDRAW, DEPOSIT, TRANSFER;
}