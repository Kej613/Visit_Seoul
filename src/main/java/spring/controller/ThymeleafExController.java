package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.dto.DisplayDto;

import java.time.LocalDateTime;

@Controller
@RequestMapping(value="/thymeleaf")
public class ThymeleafExController {

    @GetMapping(value="/ex02")
    public String thymeleafExample02(Model model) {
        DisplayDto displayDto = new DisplayDto();
        displayDto.setDisplayDetail("행사 상세 정보");
        displayDto.setDisplayNm("문화행사1");
        displayDto.setPrice(10000);
        displayDto.setRegTime(LocalDateTime.now());

        model.addAttribute("displayDto", displayDto);
        return "main";
    }
}
