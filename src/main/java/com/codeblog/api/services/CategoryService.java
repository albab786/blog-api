package com.codeblog.api.services;

import java.util.List;



import com.codeblog.api.payloads.CategoryDto;

public interface CategoryService {

	//create
	public CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	public CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	
	//delete
	public void deleteCategory(Integer categoryId);
	
	//get
	public CategoryDto getCategory(Integer categoryId);
	
	//getAll
	List<CategoryDto> getCategories();
	
	
}
