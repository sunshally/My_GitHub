#include "stdafx.h"
#include <iostream>  
#include <windows.h>  
#include "sqlext.h"  

using namespace std;

/*��ODBC API�������ݿ�:�������ݿ�*/

int main(){

    SQLHENV henv;  //�������   
    SQLHDBC hdbc;  //���Ӿ��   
    SQLHSTMT hstmt;  //�����  
    SQLRETURN retcode; //����ֵ    
    /*���价�����*/     
    retcode = SQLAllocHandle(SQL_HANDLE_ENV,SQL_NULL_HANDLE,&henv);     
    if(retcode == SQL_SUCCESS || retcode == SQL_SUCCESS_WITH_INFO){  
    /*����ODBC��������*/  
        retcode = SQLSetEnvAttr(henv,SQL_ATTR_ODBC_VERSION,(void*)SQL_OV_ODBC3,0); 
        if(retcode == SQL_SUCCESS || retcode == SQL_SUCCESS_WITH_INFO){ 
				/*�������Ӿ��*/  
				retcode = SQLAllocHandle(SQL_HANDLE_DBC,henv,&hdbc);  
				if(retcode == SQL_SUCCESS || retcode == SQL_SUCCESS_WITH_INFO){   
						/*���ӵ�����Դ*/   
						retcode = SQLConnect (hdbc, (SQLCHAR*)"HGDB", //DSN
											SQL_NTS,(SQLCHAR*)"highgo",//User
											SQL_NTS,  (SQLCHAR*)"highgo123",//Password
											SQL_NTS);
						retcode=SQLAllocHandle(SQL_HANDLE_STMT,hdbc,&hstmt);//����SQL�����
						cout << "InputCommand��" << endl;
					//	SQLCHAR Command[]="CREATE TABLE tabletest(aaa int,bbb int,ccc int)"; 
						char Command[100];
						gets(Command);
						retcode=SQLExecDirect(hstmt,(SQLCHAR*)Command,SQL_NTS);//ֱ��ִ��SQL��� 

								 if(retcode == SQL_SUCCESS || retcode == SQL_SUCCESS_WITH_INFO){  
									/*���������*/     
										retcode = SQLAllocHandle(SQL_HANDLE_STMT,hdbc,&hstmt);       
										if(retcode == SQL_SUCCESS || retcode == SQL_SUCCESS_WITH_INFO){       
											  cout << "Done!" << endl;
											  SQLFreeHandle(SQL_HANDLE_STMT,hstmt); 
										  }
										SQLDisconnect(hdbc);         
								  }
								 else
									 cout << "Error!" << endl;
						  SQLFreeHandle(SQL_HANDLE_DBC,hdbc);         
				  } 
        }
     }     
     return 0;
}