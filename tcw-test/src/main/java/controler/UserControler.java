package controler;

import dto.UserInfo;
import service.UserService;

/**
 * @program: spring
 * @description:
 * @author: Tanchaowen
 * @create: 2019-06-03 14:58
 **/
public class UserControler {

	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void save(UserInfo userInfo){
		userService.save(userInfo);
	}

}
