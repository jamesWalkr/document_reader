package com.example.demo.Controller;

import com.example.demo.dtos.PaymentInfoDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/v1")
public class PaymentController {

    @PostMapping("/payment")
    public ResponseEntity<String> submitPaymentInfo( @Valid @RequestBody PaymentInfoDto payment){
        return ResponseEntity.ok("Payment was successful");
    }
}
