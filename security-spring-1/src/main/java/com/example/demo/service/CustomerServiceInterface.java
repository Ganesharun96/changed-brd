package com.example.demo.service;

import java.util.List;

import org.springframework.ui.Model;

import com.example.demo.domain.CustomerModel;

public interface CustomerServiceInterface {
	public List<CustomerModel>calc();
//	public List<CustomerModel> calc(Model model);
public void method(CustomerModel customermodel);
//public void searcher(int id,Model model);
public void search(Model model,CustomerModel customermodel);
public void delete(CustomerModel customermodel);
public void update(CustomerModel customermodel,Model model);
}
