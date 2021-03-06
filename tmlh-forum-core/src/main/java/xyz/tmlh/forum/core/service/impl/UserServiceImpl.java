package xyz.tmlh.forum.core.service.impl;

import xyz.tmlh.forum.core.mapper.UserMapper;
import xyz.tmlh.forum.core.model.UserModel;
import xyz.tmlh.forum.core.service.UserService;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author TianXin
 * @since 2019-04-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserModel> implements UserService {

}
