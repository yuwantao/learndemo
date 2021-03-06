package com.ctoedu.demo.api.service.user;

import java.util.List;

import com.ctoedu.common.vo.PageVO;
import com.ctoedu.demo.api.controller.vo.person.PersonVO;
import com.ctoedu.demo.api.controller.vo.user.OrgUserVO;

public interface OrgUserService {

	PageVO<OrgUserVO> getUser(String nickname, String username, String orgId, int number, int size, String currentUsername, List<String> currentUserRoleSn);

	PageVO<PersonVO> getPerson(String nickname, String username, String orgId, int number, int size, String currentUsername, List<String> currentUserRoleSn);
}
