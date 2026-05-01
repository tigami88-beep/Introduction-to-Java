//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int eaters = 5; // сколько людей будут есть

        double water = 3000.0; // миллилитров воды
        double potatoes = 5.0; // картофелин
        double chicken = 6.0; // куриных бёдер
        double spices = 10.0; // ложек специй

        if (eaters < 0) {
            System.out.println("Число едоков должно быть больше нуля.");
            return;
        }

        double waterPerPerson = water / eaters;
        double potatoesPerPerson = potatoes / (double) eaters;
        double chickenPerPerson = chicken / (double) eaters;
        double spicesPerPerson = spices / (double) eaters;

        System.out.println("Сварили суп. На одного человека вышло:");
        System.out.printf("%.2f миллилитров(а) воды%n", waterPerPerson);
        System.out.printf("%.2f картофелин(а/ы)%n", potatoesPerPerson);
        System.out.printf("%.2f куриных(ое) бёдер(ро)%n", chickenPerPerson);
        System.out.printf("%.2f ложек(ки/ка) специй%n", spicesPerPerson);
    }
}