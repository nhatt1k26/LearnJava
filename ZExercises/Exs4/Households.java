package ZExercises.Exs4;

public class Households {
    private int numberOfMember;
    private int apartmentNumber;

    public Households(int numberOfMember, int apartmentNumber) {
        this.numberOfMember = numberOfMember;
        this.apartmentNumber = apartmentNumber;
    }

    public int getNumberOfMember() {
        return numberOfMember;
    }

    public void setNumberOfMember(int numberOfMember) {
        this.numberOfMember = numberOfMember;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
}
