package kr.co.ezenac.utilizeInterface.userInfo.dao;

import kr.co.ezenac.utilizeInterface.userInfo.UserInfoDTO;

public interface UserInfoDAO {

	void insertUserInfo(UserInfoDTO userInfoDTO);
	void updateUserInfo(UserInfoDTO userInfoDTO);
	void deleteUserInfo(UserInfoDTO userInfoDTO);
	void selectUserInfo(UserInfoDTO userInfoDTO);
}