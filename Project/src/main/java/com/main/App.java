package com.main;

import com.entity.Trainer;
import com.service.TrainerService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer t1 = new Trainer();
		t1.setTid(100);
		t1.setTname("Anu");
		TrainerService ts = new TrainerService();
		String result = ts.storeTrainer(t1);
		System.out.print(result);
		

	}

}
