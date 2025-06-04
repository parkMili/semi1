package org.example.semi1.member.service;

import org.example.semi1.member.domain.MemberDTO;
import org.example.semi1.member.domain.dto.Member;

public interface MemberService {

    boolean newMember(MemberDTO member);
    Member loginMember(MemberDTO member);


}
