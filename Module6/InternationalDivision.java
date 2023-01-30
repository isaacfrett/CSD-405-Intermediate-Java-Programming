// Isaac Frett Module 6 1/30/2023
// The purpose of this code is define 2 fields and a constructor for International Divisions

package Module6;

public class InternationalDivision extends Division {
   

    String country;
    String language;
    
    @Override
    public void display() {
        super.display();
    }

     public InternationalDivision(String division_name, int account_number, String country, String language) {
        super(division_name, account_number);
        this.country = country;
        this.language = language;
    }

}