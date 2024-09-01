package com.esun.tmsb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.esun.tmsb.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author MAQJ
 */
@Slf4j
@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerService  customerService;
}
