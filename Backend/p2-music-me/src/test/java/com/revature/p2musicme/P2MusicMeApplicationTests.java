package com.revature.p2musicme;

import com.revature.p2musicme.user.entity.User;
import com.revature.p2musicme.user.repository.UserRepo;
import com.revature.p2musicme.user.service.implementation.UserServiceImplementation;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class P2MusicMeApplicationTests {
	//private UserRepo userRepo;
	private UUID uuid;
	@Test
	public void userTest(){
		User user = new User();
		user.setUserId(this.uuid.randomUUID());
		user.setUserFN("Jah'lil");
		user.setUserLN("Allen");
		user.setUserEmail("jahlil@revature.com");
		user.setUserPW("password");


		//this.userRepo.save(user);
		System.out.println("NEW USER: " + user.getUserEmail() + "; " + "WELCOME TO MUSIC ME");
	}
}
