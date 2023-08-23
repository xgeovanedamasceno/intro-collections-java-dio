package list;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<ItemCart> itemsCart = new ArrayList();
    double totalPrice = 0.00;
    int itemsQuantity = 0;

    public void addItemToCart(ItemCart item) {
        itemsCart.add(item);
        this.totalPrice += item.getPrice();
        this.itemsQuantity++;
    }

    public void removeItemCart(String name) {
        itemsCart.forEach((element) -> {
            if(element.getName().equals(name)) {
                itemsCart.remove(element);
            };
        });
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getItemsQuantity() {
        return itemsQuantity;
    }

    public void showItemsCart() {
        itemsCart.forEach(element -> {
            System.out.println(element.getName() + " - $" + element.getPrice());
        });
    }
}
