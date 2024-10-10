package com.entityClassAnnotations;

import One2oneU.PersonAdharDriver;

public class PenDriver
{
public static void main(String[] args) {
	Pen p=new Pen();
	
	p.setBrand("cello");
	p.setPrice(123.56);
	
	PersonAdharDriver.et.begin();
	PersonAdharDriver.em.persist(p);
	PersonAdharDriver.et.commit();
	
	
}
}
