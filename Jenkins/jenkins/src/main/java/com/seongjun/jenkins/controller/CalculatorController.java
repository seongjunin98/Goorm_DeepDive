package com.seongjun.jenkins.controller;

import com.seongjun.jenkins.dto.CalculatorDTO;
import com.seongjun.jenkins.service.CalculatorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CalculatorController {

    private CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    /* Application 상태 확인용 health check 용 메서드 */
    @GetMapping("/health")
    public String health() {
        return "it's ok!!!";
    }

    /* frontend 서버에서 넘어오는 num1 , num2 를 받기 위한 메서드 */
    @GetMapping("/plus")
    public ResponseEntity<CalculatorDTO> plusTwoNumbers(CalculatorDTO calculatorDTO) {

        log.info("plus 핸들러에 전달 되는 값 확인 : "  + calculatorDTO);

        int result = calculatorService.plusTwoNumbers(calculatorDTO);

        calculatorDTO.setSum(result);

        return ResponseEntity.ok().body(calculatorDTO);
    }


}
