package com.rest;

import com.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TempController {

    @Autowired
    TempService tempService;

    @RequestMapping(value = "/square", method = RequestMethod.GET)
    public int CalSquare(@RequestParam int num) {
        int result = tempService.calSquare(num);
        return result;
    }
}
