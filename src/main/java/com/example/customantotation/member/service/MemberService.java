package com.example.customantotation.member.service;

import com.example.customantotation.custom.EssentialServiceLayer;
import com.example.customantotation.member.dto.MemberDTO;
import com.example.customantotation.member.repo.MemberRepository;
import lombok.RequiredArgsConstructor;

@EssentialServiceLayer
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository memberRepository;

	public void memberCreateService(MemberDTO memberDTO){
		memberRepository.save(memberDTO.toEntity());
	}
}
