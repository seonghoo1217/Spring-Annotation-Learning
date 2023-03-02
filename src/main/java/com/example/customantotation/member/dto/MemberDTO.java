package com.example.customantotation.member.dto;

import com.example.customantotation.member.entity.Member;
import lombok.Getter;

@Getter
public class MemberDTO {
	private String username;
	private int age;

	public Member toEntity(){
		return Member.builder()
				.username(username)
				.age(age)
				.build();
	}
}
