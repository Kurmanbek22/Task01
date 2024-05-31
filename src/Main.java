import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Produkt[] produkts={
                new Produkt(01,"Alma","zzzz",Category.FOOD_PRODUKTS, LocalDate.of(2024,06,05)),
                new Produkt(02,"Banan","zzzz",Category.FOOD_PRODUKTS, LocalDate.of(2024,06,07)),
                new Produkt(03,"Zaryadnik","zzzz",Category.ELEKTRONICS, LocalDate.of(2026,03,05)),
                new Produkt(04,"Naushniki","orginal",Category.ELEKTRONICS, LocalDate.of(2025,11,05)),
                new Produkt(05,"Brelok","zzzz",Category.ACSESORIES, LocalDate.of(2030,06,05)),
                new Produkt(06,"Chexol ","zzzz",Category.ACSESORIES, LocalDate.of(2024,06,05)),
        };
//        produkts[0].getAllProduct(produkts);
        produkts[0].updateProduct(produkts);



    }
}