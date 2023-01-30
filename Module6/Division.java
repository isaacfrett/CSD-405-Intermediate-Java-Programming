// Isaac Frett Module 6 1/30/2023
// The purpose of this code is create a super calls with 2 fields and a constructor for all Divisions

package Module6;

public abstract class Division {
    String division_name;
    int account_number;

    public void display() {}

    public Division(String division_name, int account_number) {
        this.division_name = division_name;
        this.account_number = account_number;
    }
}
