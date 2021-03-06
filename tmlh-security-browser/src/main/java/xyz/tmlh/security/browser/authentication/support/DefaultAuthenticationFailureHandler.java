package xyz.tmlh.security.browser.authentication.support;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import xyz.tmlh.security.browser.support.ResultBean;
import xyz.tmlh.security.core.properties.TmlhSecurityProperties;
import xyz.tmlh.security.core.properties.browser.LoginType;
import xyz.tmlh.security.core.util.JsonUtils;

/**
 * 
 * <p>
 *     自定义的登陆失败处理 implements 
 *          AuthenticationFailureHandler 
 *  Override 
 *          onAuthenticationFailure()
 * </p>
 *
 * @author TianXin
 * @since 2018年12月29日下午4:57:34
 */
public class DefaultAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultAuthenticationFailureHandler.class);

    @Autowired
    private TmlhSecurityProperties tmlhSecurityProperties;

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException,
        ServletException {
        LOGGER.info("login in failure : " +  exception.getMessage());
        if (LoginType.JSON.equals(tmlhSecurityProperties.getBrowser().getLoginType())) {
            response.setContentType("application/json;charset=UTF-8");
            ResultBean result = ResultBean.fail(exception.getMessage()).putResult("exception", exception);
            response.getWriter().write(JsonUtils.objectToJson(result));
        } else {
            super.onAuthenticationFailure(request, response, exception);
        }

    }

}
