package com.example.customantotation.member.api;

import com.example.customantotation.member.dto.MemberDTO;
import com.example.customantotation.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberAPI {

	private final MemberService memberService;

	@PostMapping("/api/v1/memberCreate")
	public void createMemberInfo(@RequestBody MemberDTO memberDTO){
		memberService.memberCreateService(memberDTO);
	}
}
