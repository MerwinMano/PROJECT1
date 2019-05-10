package mer.mano.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mer.mano.dao.CartItemDao;
import mer.mano.model.Cart;
import mer.mano.model.CartItem;
import mer.mano.model.CustomerOrder;

@Service
public class CartItemServiceImpl implements CartItemService {

	@Autowired
	private CartItemDao cartItemDao;
	public void saveOrUpdateCartItem(CartItem cartItem) {
		cartItemDao.SaveOrUpdateCartItem(cartItem);
		
		
	}
	public void removeCartItem(int cartItemId) {
		cartItemDao.removeCartItem(cartItemId);
		
	}
	public Cart getCart(int cartId) {
		return cartItemDao.getCart(cartId);
	}
	public CustomerOrder createOrder(Cart cart) {
		
		return cartItemDao.createOrder(cart);
	}

}
