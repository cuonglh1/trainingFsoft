package OOP_Bai4;

import java.util.List;

public class Family {
    int numberPerson;
    String address;
    List<Person> personList;

    public Family(int numberPerson, String address, List<Person> personList) {
        this.numberPerson = numberPerson;
        this.address = address;
        this.personList = personList;
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(int numberPerson) {
        this.numberPerson = numberPerson;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "Family{" +
                "numberPerson=" + numberPerson +
                ", address='" + address + '\'' +
                ", personList=" + personList +
                '}';
    }
}
