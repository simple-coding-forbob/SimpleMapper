/**
 * 
 */
package com.simplecoding.simplemapper.faq.vo;

import com.simplecoding.simplemapper.common.Criteria;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Faq extends Criteria {
	private int fno;           // 번호(기본키)
	private String title;      // 제목
	private String content;    // 내용
}






