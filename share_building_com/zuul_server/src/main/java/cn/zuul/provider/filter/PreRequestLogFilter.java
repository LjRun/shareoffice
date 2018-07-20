package cn.zuul.provider.filter;

//import java.util.logging.Logger;

import cn.zuul.provider.util.redis.RedisKey;
import cn.zuul.provider.util.redis.StringUtil;
import cn.zuul.provider.util.redis.impl.RedisService;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.MessageFormat;


public class PreRequestLogFilter extends ZuulFilter {
    private static final Logger LOGGER = LoggerFactory.getLogger(PreRequestLogFilter.class);

  @Resource
  private RedisService redisService;
    /*
   返回过滤器的类型。有pre、route、post、error等几种取值，分别对应上文的几种过滤器。详细可以参考com.netflix.zuul.ZuulFilter.filterType() 中的注释。
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /*
   返回一个int值来指定过滤器的执行顺序，不同的过滤器允许返回相同的数字。
     */
    @Override
    public int filterOrder() {
        return 1;
    }


    /*
    返回一个boolean值来判断该过滤器是否要执行，true表示执行，false表示不执行。
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }



    /*
    过滤器的具体逻辑。本例中，我们让它打印了请求的HTTP方法以及请求的地址。
     */
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String uid=request.getHeader("uid");
        String token=request.getHeader("token");
        if(StringUtil.IsNullOrEmpty(uid)||StringUtil.IsNullOrEmpty(token))
        {
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(200);
            ctx.setResponseBody("{\"result\":null,\"des\":\"请先登入\",\"statecode\":403,\"state\":0}");// 返回错误内容
        }
        String userToken=redisService.get(MessageFormat.format(RedisKey.userTolen,uid)).toString();
        if(StringUtil.IsNullOrEmpty(userToken)||userToken!=token)
        {
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(200);
            ctx.setResponseBody("{\"result\":null,\"des\":\"请先登入\",\"statecode\":403,\"state\":0}");// 返回错误内容
        }
        return null;
    }

}
