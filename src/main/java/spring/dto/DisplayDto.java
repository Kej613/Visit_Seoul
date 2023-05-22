package spring.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class DisplayDto {
    private Long id;
    private String displayNm;
    private Integer price;
    private String displayDetail;
    private String displayStatus;
    private LocalDateTime regTime;
    private LocalDateTime updateTime;

}
