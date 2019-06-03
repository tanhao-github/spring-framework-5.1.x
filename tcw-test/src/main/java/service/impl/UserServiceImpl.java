package service.impl;

import dto.UserInfo;
import service.UserService;

/**
 * @program: spring
 * @description:
 * @author: Tanchaowen
 * @create: 2019-06-03 14:42
 **/
public class UserServiceImpl implements UserService {

	@Override
	public void save(UserInfo userInfo) {
		System.out.println("保存成功："+userInfo.toString());
	}
}
