public interface CRUD {
   String createProduct();
   Produkt [] getProductById(int id,Produkt[]produkts);
 void getAllProduct(Produkt[] produkts);
void updateProduct(Produkt[] produkts);
   Produkt []deletProduct(int id);
}
