package Bank.AboutBank;

public class BankInformation {
    private String companyName;
    private String bossBank;
    private String legalAddress;
    private String postalAddress;
    private String expenseMFR;
    private String correspondentAccount;
    private String bik;
    private String inn;


    public BankInformation(String companyName, String bossBank, String legalAddress, String postalAddress, String expenseMFR, String correspondentAccount, String bik, String inn) {
        this.companyName = companyName;
        this.bossBank = bossBank;
        this.legalAddress = legalAddress;
        this.postalAddress = postalAddress;
        this.expenseMFR = expenseMFR;
        this.correspondentAccount = correspondentAccount;
        this.bik = bik;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return String.format("Компания - %s\n" +
                "Руководитель - %s\n" +
                "Юридический адрес - %s\n" +
                "Почтовый адресс - %s\n" +
                "Счет МФР - %s\n" +
                "Корсчет - %s\n" +
                "БИК - %s\n" +
                "ИНН - %s\n", companyName, bossBank, legalAddress, postalAddress, expenseMFR, correspondentAccount, bik, inn);
    }

}
