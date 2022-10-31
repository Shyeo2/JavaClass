package kr.co.ezenac.utilizeInterface.userInfo.dao.mssql;

import kr.co.ezenac.utilizeInterface.userInfo.UserInfoDTO;
import kr.co.ezenac.utilizeInterface.userInfo.dao.UserInfoDAO;

public class UserInfoMssqlDAO implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into MSSQL DB userId =" + userInfoDTO.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into MSSQL DB userId =" + userInfoDTO.getUserId());// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into MSSQL DB userId =" + userInfoDTO.getUserId());// TODO Auto-generated method stub
		
	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into MSSQL DB userId =" + userInfoDTO.getUserId());// TODO Auto-generated method stub
		
	}

}
