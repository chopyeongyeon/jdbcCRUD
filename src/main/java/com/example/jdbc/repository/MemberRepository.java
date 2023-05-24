package com.example.jdbc.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.jdbc.dto.MemberDto;
import com.example.jdbc.entity.Member;

@Repository
public interface MemberRepository {
	List<Member> selectAll();
	MemberDto save(MemberDto memberDto);
	MemberDto update(MemberDto memberDto);
	MemberDto delete(MemberDto memberDto);
}
