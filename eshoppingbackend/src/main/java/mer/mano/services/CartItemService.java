package mer.mano.services;

import mer.mano.model.Cart;
import mer.mano.model.CartItem;
import mer.mano.model.CustomerOrder;

public interface CartItemService {

	void saveOrUpdateCartItem(CartItem cartItem);
	
	void removeCartItem(int cartItemId);
	
	Cart getCart(int cartId);
	
	CustomerOrder createOrder(Cart cart);
}


