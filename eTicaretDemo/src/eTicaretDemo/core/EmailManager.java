package eTicaretDemo.core;

import eTicaretDemo.entities.concretes.User;

public class EmailManager implements EmailService {

	@Override
	public void sendEmail(User user) {
		System.out.println("L�tfen dogrulama i�in mailinizi kontrol ediniz.");
	}
}
