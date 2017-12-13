package Bank;

import Bank.AboutBank.BankInformation;

public class Main {
    public static void main(String[] args) {
        BankInformation bankInformation = new BankInformation(
                "Глав Банк-НН",
                "Саня Михеев",
                "Нижний Новгород, пр.Ильича 32 оф.230",
                "Нижний Новгород ул.Рождественская 13 оф 1",
                "30301 810 8 0000 6003800 в Глав Банке-НН",
                "Российской Федерации по Приволжскому Федеральному округу",
                "044525225",
                "7707083893");
        System.out.println(bankInformation.toString());
    }
}
