package CarTest;
public class car {
    // Private data members
    private String company;
    private String model;
    private int year;
    private String color;

    // Public member functions to set (update) the data members
    public void setCompany(String company) {
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Public member functions to get (access) the data members
    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
}
