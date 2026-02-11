package com.simplecoding.simplemapper.qna.vo;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class Qna {
    private int qno;
    private String questioner;
    private String question;
    private String answer;
    private String answerer;
}
