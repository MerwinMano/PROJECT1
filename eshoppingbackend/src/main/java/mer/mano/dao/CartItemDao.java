package mer.mano.dao;

import mer.mano.model.Cart;
import mer.mano.model.CartItem;
import mer.mano.model.CustomerOrder;

public interface CartItemDao {
	
	void SaveOrUpdateCartItem(CartItem cartItem);
	
	void removeCartItem(int cartItemId);
	
	Cart getCart(int cartId);
	
	CustomerOrder createOrder(Cart cart);

}
