package org.example.semi1.member.domain;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class MemberDTO {

    private String userid;
    private String passwd;
    private String name;
    private String email;

}
