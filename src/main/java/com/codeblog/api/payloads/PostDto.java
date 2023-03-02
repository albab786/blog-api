package com.codeblog.api.payloads;

import java.util.Date;

import com.codeblog.api.entities.Category;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class PostDto {

	private String title;
	private String content;
	private String imageName;
	private Date AddedDate;
	private CategoryDto category;
	private UserDto user;
	

}
