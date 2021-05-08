package core.adapters;

import business.abstracts.AuthService;

import entities.concretes.User;

public class GoogleLoginAdapter implements AuthService {

	@Override
	public void Register(User user) {
		googleLogin.LoginService loginService = new googleLogin.LoginService();
		loginService.registerGoogle();
		
	}

	@Override
	public void Login(String email, String password) {
		googleLogin.LoginService loginService = new googleLogin.LoginService();
		loginService.loginGoogle();
		
	}

}
