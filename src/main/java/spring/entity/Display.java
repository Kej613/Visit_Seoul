package spring.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import spring.constant.DisplayStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="display")
@Getter
@Setter
@ToString
public class Display {

    @Id
    @Column(name="display_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;  // 행사 코드

    @Column(nullable= false, length=50)
    private String DisplayNm;  // 행사이름
    @Column(name="price", nullable= false)
    private int price;   //비용
    @Lob
    @Column(nullable= false)
    private int DisplayDetail;  //상세정보
    @Enumerated(EnumType.STRING)
    private DisplayStatus displayStatus; //행사 현황
    private LocalDateTime regTime;  //등록 시간
    private LocalDateTime updateTime;   //수정 시간


}
