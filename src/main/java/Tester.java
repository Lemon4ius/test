public class Tester {
    String name;
    String surname;
    int expirienceInYears;
    String englishLevel;
    double salary;

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", expirienceInYears=" + expirienceInYears +
                ", englishLevel='" + englishLevel + '\'' +
                ", salary=" + salary +
                '}';
    }
}
