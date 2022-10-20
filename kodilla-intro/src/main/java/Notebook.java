public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {

        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        }
        if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        }
        if (this.price > 1000) {
            System.out.println("This notebook is expensive");
        }

    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("this laptop is light");
        }
        if (this.weight >= 1000 && this.weight <= 1500) {
            System.out.println("This laptop is not heavy");
        }
        if (this.weight > 1500) {
            System.out.println("This laptop is very heavy");
        }
    }

    public void checkYear() {
        if (this.year > 2014 && this.year <= 2017 && this.price > 999 && this.price < 1500) {
            System.out.println("This comp is not old and have good price");
        }
        else if (this.year >= 2017 && this.price >= 1500) {
            System.out.println("This comp is modern and expensive");
        } else if (this.year <= 2014 && this.price <= 999) {
            System.out.println("This comp is very old and price is very low");
        }
    }
}






