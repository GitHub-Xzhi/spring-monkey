package xyz.tmlh.forum.web.controller.admin;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.Api;

/**
 * <p>
 *    
 * </p>
 *
 * @author TianXin
 * @since 2019年4月3日下午8:53:19
 */
@Api("管理员控制器")
@PreAuthorize("hasRole('ROLE_ADMIN')")
@RequestMapping("/admin")
@Controller
public class AdminContoller {
    
  
    
    
    
    
}
