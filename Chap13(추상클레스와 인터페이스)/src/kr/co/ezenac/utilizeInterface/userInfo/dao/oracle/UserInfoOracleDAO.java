package kr.co.ezenac.utilizeInterface.userInfo.dao.oracle;

import kr.co.ezenac.utilizeInterface.userInfo.UserInfoDTO;
import kr.co.ezenac.utilizeInterface.userInfo.dao.UserInfoDAO;

public class UserInfoOracleDAO implements UserInfoDAO{

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into ORACLE DB userId =" + userInfoDTO.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into ORACLE DB userId =" + userInfoDTO.getUserId());// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into ORACLE DB userId =" + userInfoDTO.getUserId());// TODO Auto-generated method stub
		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into ORACLE DB userId =" + userInfoDTO.getUserId());// TODO Auto-generated method stub
		
	}

}
