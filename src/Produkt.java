import java.time.LocalDate;

public class Produkt implements CRUD {
    private  int id;
    private String name;

    private String description;
    private Category category;
    private LocalDate expiredDate;

    public Produkt() {
    }

    public Produkt(int id, String name, String description, Category category, LocalDate expiredDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.expiredDate = expiredDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }

    @Override
    public String createProduct() {
        return null;
    }

    @Override
    public Produkt[] getProductById(int id,Produkt[]produkts) {
      return null;
    }

    @Override
    public void getAllProduct(Produkt[] produkts) {
        for (Produkt produkt : produkts) {
            System.out.println(produkt);
        }
    }

    @Override
    public void updateProduct(Produkt[] produkts ) {
        for (Produkt produkt : produkts) {
            System.out.println(produkt.getName()+ " "+ produkt.getExpiredDate());
        }
    }

    @Override
    public Produkt []deletProduct(int id) {
        return null;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", expiredDate=" + expiredDate +
                '}';
    }
}
