package com.example.demo.controller;


import com.example.demo.entity.LeaveInfo;
import com.example.demo.service.ILeaveInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author sm
 * @since 2018-04-17
 */
@RestController
@RequestMapping("/sys/leaveInfo")
public class LeaveInfoController {

    @Autowired
    private ILeaveInfoService leaveInfoService;

    @GetMapping
    public List<LeaveInfo> list() {
        return leaveInfoService.selectList(null);
    }
}

