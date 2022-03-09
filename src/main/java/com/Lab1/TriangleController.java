package com.Lab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TriangleController {

    private Float firstSide = 0f;
    private Float secondSide = 0f;
    private Float thirdSide = 0f;
    private Float area = 0f;
    private Float perimeter = 0f;

    @GetMapping("/triangleJson")
    @ResponseBody
    public Triangle triangleJson(@RequestParam(value = "side1") Float side1, @RequestParam(value = "side2") Float side2, @RequestParam(value = "side3") Float side3) {
        perimeter = side1 + side2 + side3;
        Float hp = perimeter/2;
        area = (float)Math.sqrt(hp*(hp-side1)*(hp-side2)*(hp-side3));
        return new Triangle(side1, side2, side3, perimeter, area);
    }

    @RequestMapping("/triangle")
    public String triangle(Model model, @RequestParam(name = "firstSide", required = false) Float side1, @RequestParam(name = "secondSide", required = false) Float side2, @RequestParam(name = "thirdSide", required = false) Float side3, @RequestParam(name = "perimeterFlag", required = false, defaultValue = "false") Boolean flag1, @RequestParam(name = "areaFlag", required = false, defaultValue = "false") Boolean flag2) {
        firstSide = side1;
        secondSide = side2;
        thirdSide = side3;
        if ( flag1 == Boolean.TRUE) {
            perimeter = firstSide + secondSide + thirdSide;
        }
        if ( flag2 == Boolean.TRUE) {
            Float hp = (firstSide + secondSide + thirdSide)/2;
            area = (float)Math.sqrt(hp*(hp-firstSide)*(hp-secondSide)*(hp-thirdSide));
        }
        model.addAttribute("firstSide", firstSide);
        model.addAttribute("secondSide", secondSide);
        model.addAttribute("thirdSide", thirdSide);
        model.addAttribute("perimeter", perimeter);
        model.addAttribute("area", area);
        return "Home";
    }
}
