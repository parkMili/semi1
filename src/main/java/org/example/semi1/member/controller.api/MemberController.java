package org.example.semi1.member.controller.api;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
//import org.example.demo.semiproject.member.domain.Member;
import org.example.semi1.member.domain.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/join")
    public String join() {
        return "views/member/join";
    }

    @GetMapping("/login")
    public String login() {
        return "views/member/login";
    }

    @GetMapping("/myinfo")
    public String myinfo(Model model, HttpSession session) {
        String returnPage = "redirect:/member/login";
       // Member user = new Member(0,"abc123","abc123","abc123",
       //         "abc123@abc123.co.kr", LocalDateTime.now());

       // 세션 변수가 생성되ㅓㅇ 있다면 myinfo로 이동
        if(session.getAttribute("loginUser") != null) {
            model.addAttribute("loginUser", session.getAttribute("loginUser"));
            returnPage = "views/member/myinfo";
        }
        return returnPage;
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();

        return "redirect:/";
    }

}