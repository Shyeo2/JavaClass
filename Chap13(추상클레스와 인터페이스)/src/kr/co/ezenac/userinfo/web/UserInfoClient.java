package kr.co.ezenac.userinfo.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import kr.co.ezenac.utilizeInterface.userInfo.UserInfoDTO;
import kr.co.ezenac.utilizeInterface.userInfo.dao.UserInfoDAO;
import kr.co.ezenac.utilizeInterface.userInfo.dao.mssql.UserInfoMssqlDAO;
import kr.co.ezenac.utilizeInterface.userInfo.dao.mysql.UserInfoMySqlDAO;
import kr.co.ezenac.utilizeInterface.userInfo.dao.oracle.UserInfoOracleDAO;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("db.properties");

		Properties prop = new Properties();
		prop.load(fis);
		String dbType = prop.getProperty("DBTYPE");

		UserInfoDTO userInfo = new UserInfoDTO();
		userInfo.setUserId("ezen");
		userInfo.setPasswd("0111");
		userInfo.setUserName("이젠");

		UserInfoDAO userInfoDAO = null;
		if (dbType.equals("ORACLE")) {
			userInfoDAO = new UserInfoOracleDAO();
		} else if (dbType.equals("MYSQL")) {
			userInfoDAO = new UserInfoMySqlDAO();
		} else if (dbType.equals("MSSQL")) {
			userInfoDAO = new UserInfoMssqlDAO();
		}
		else {
			System.out.println("db support error");
			return;
		}
		userInfoDAO.insertUserInfo(userInfo);
		userInfoDAO.updateUserInfo(userInfo);
		userInfoDAO.deleteUserInfo(userInfo);
		userInfoDAO.selectUserInfo(userInfo);
	}

}
