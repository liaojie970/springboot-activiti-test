package com.example.demo.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.dao.LeaveInfoMapper;
import com.example.demo.entity.LeaveInfo;
import com.example.demo.service.ILeaveInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sm
 * @since 2018-04-17
 */
@Service
public class LeaveInfoServiceImpl extends ServiceImpl<LeaveInfoMapper, LeaveInfo> implements ILeaveInfoService {

}
