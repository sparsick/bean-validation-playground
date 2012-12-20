package com.github.skosmalla.bean.validation.services;

import static org.junit.Assert.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import com.github.skosmalla.bean.validation.entities.EntityA;
import org.hibernate.validator.method.MethodConstraintViolationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring/bean-validation-context.xml")
public class AServiceTest {

	@Autowired
	private AService service;


	@Autowired
	private Validator validator;

	@Test(expected=MethodConstraintViolationException.class)
	public void testMethodA(){

		EntityA entityA = new EntityA();
		entityA.setPropertyA(null);
		entityA.setPropertyB("");

		service.serviceMethodA(entityA);
	}

	@Test
	public void testValidator(){

		EntityA entityA = new EntityA();
		entityA.setPropertyA(null);
		entityA.setPropertyB("");


		Set<ConstraintViolation<EntityA>> validate = validator.validate(entityA);

		assertEquals(2, validate.size());
	}
}
