package com.github.skosmalla.bean.validation.services;

import javax.validation.Valid;

import com.github.skosmalla.bean.validation.entities.EntityA;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;


@Service
@Validated
public class AService {

	public void serviceMethodA(@Valid EntityA entityA) {
		String propertyA = entityA.getPropertyA();
		System.out.println("Property A: " + propertyA);

		String propertyB = entityA.getPropertyB();
		System.out.println("Property B: " + propertyB);
	}
}
