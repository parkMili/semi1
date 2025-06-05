package org.example.semi1.member.domain.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class LoginDTO {

    private String userid;
    private String passwd;
    private String name;
    private String email;

}
