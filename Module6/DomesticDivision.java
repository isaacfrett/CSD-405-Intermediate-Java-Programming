// Isaac Frett Module 6 1/30/2023
// The purpose of this code is to defime a field and constructor for Domestic Divisions

package Module6;

public class DomesticDivision extends Division {
   
    String state;

    @Override
    public void display() {
        super.display();
    }

     public DomesticDivision(String division_name, int account_number, String state) {
        super(division_name, account_number);
        this.state = state;
    }

}
