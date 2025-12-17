/*Given the following classes,
 write the code for the Book and the CD class so that the following output is printed.
 */

public class Tester6 {
  public static void main(String[] args) {
    Book book = new Book(1, "The Alchemist", 500, "97806", "HarperCollins");
    System.out.println(book.printDetail());
    System.out.println("-----------------------");

    CD cd = new CD(2, "Shotto", 300, "Warfaze", 50, "Hard Rock");
    System.out.println(cd.printDetail());
  }
}

// class starts here

class Product { // parent class
  private int id;
  private String title;
  private int price;

  public Product(int id, String title, int price) {
    this.id = id;
    this.title = title;
    this.price = price;
  }

  public String getIdTitlePrice() {
    return "ID: " + id + " Title: " + title + " Price: " + price;
  }
}

class Book extends Product { // child class
  public String isbn;
  public String writer;

  public Book(int id, String t, int p, String code, String w) {
    super(id, t, p);
    isbn = code;
    writer = w;
  }

  public String printDetail() {
    return super.getIdTitlePrice() + " ISBN: " + isbn + " Publisher: " + writer;
  }
}

class CD extends Product { // child class
  public int duration;
  public String band;
  public String genre;

  public CD(int id, String t, int p, String b, int d, String g) {
    super(id, t, p);
    duration = d;
    genre = g;
    band = b;
  }

  public String printDetail() {
    return super.getIdTitlePrice() + "\nBand: " + band + " Duration: " + duration + " minutes Genre: " + genre;
  }
}