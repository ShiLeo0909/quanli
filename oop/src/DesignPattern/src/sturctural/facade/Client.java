package sturctural.facade;

public class Client {
    public static void main(String[] args) {
        sturctural.facade.ShopFacade.getInstance().buyProductByCashWithFreeShipping("phunghuuuy_t67@hus.edu.vn");
        sturctural.facade.ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("phunghuuuy_t67@hus.edu.vn", "0909020804");
    }
}
