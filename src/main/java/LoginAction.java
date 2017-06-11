import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by zcy on 2017/6/4.
 */
public class LoginAction extends ActionSupport {
    //定义封装请求参数的username和password属性
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //定义处理用户请求的execute方法
//    public String execute() throws Exception{
//        //当username为wbb，password为wbb时即登录成功
//        if (getUsername().equals("wbb")&&getPassword().equals("wbb")){
//            ActionContext.getContext().getSession().put("user",getUsername());
//            return "success";
//        }else {
//            return "error";
//        }
//    }
    //Action包含的注册控制逻辑
    public String regist() throws Exception{
        System.out.println("xxxxxxxxxxxxxxxxxx");
        if (!getUsername().equals("")&&!getUsername().equals(null)) {
            ActionContext.getContext().getSession().put("user", getUsername());
            addActionMessage("恭喜您" + getUsername() + "，注册成功！");
        }
            return "successregist";
    }

    //Action包含的登陆控制逻辑
    public String login() throws Exception{
        //当username为wbb，password为wbb时即登录成功
        System.out.printf("tttttttttttttttttttttt");
        if (getUsername().equals("wbb")&&getPassword().equals("wbb")){
            ActionContext.getContext().getSession().put("user",getUsername());
            return "success";
        }else {
            return "error";
        }
    }
}
