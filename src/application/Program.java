package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		System.out.println("=== Test 1: seller findById ===");
		SellerDao sellerDao = DaoFactory.CreateSellerDao();
		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

	}

}
