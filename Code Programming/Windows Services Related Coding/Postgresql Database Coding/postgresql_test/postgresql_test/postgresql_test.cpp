// postgresql_test.cpp : �������̨Ӧ�ó������ڵ㡣
//

#include "stdafx.h"
#include<stdio.h> 
#include<windows.h> 
#include<iostream>
//SQL���ͷ�ļ�
#include<sql.h> 
#include<sqlext.h> 
#include<sqltypes.h>
#include <odbcinst.h>

#pragma comment(lib,"odbc32.lib")
#pragma comment(lib,"odbccp32.lib")

using namespace std;

#define FILE_PATH "E:\\log.txt"                 //LOG�ļ��Ĵ��·��

int WriteToLog(char* str)                       //�Զ����д��־����
{
    FILE* pfile;
    fopen_s(&pfile,FILE_PATH,"a+");             //��׷�ӵķ�ʽ���ļ���fopen_s�����İ�ȫ�Ը��ߣ�
    if (pfile==NULL)     
    {
        return -1; 
    }
    fprintf_s(pfile,"%s\n",str);                 //���ļ���д���ַ���
    fclose(pfile);                              //�رմ򿪵��ļ�
    return 0;
}

int main(int argc, _TCHAR* argv[])
{
	cout << "Link the DataBase Start!" << endl;
	WriteToLog("Link the DataBase Start!");
	SQLRETURN ret; 
    SQLHENV henv;//SQL�������
    SQLHDBC hdbc;//���ݿ����Ӿ��
    SQLHSTMT hstmt;//ִ�������
    ret=SQLAllocHandle(SQL_HANDLE_ENV,NULL,&henv);//���뻷�����
	if(ret==SQL_SUCCESS || ret==SQL_SUCCESS_WITH_INFO){ 
		WriteToLog("Regist the Env_Handle Success!");
		cout << "Regist the Env_Handle Success!" << endl;
	}
	else{
		WriteToLog("Regist the Env_Handle Failed!");
		cout << "Regist the Env_Handle Failed!" << endl;
	}
    ret=SQLSetEnvAttr(henv,SQL_ATTR_ODBC_VERSION,(SQLPOINTER)SQL_OV_ODBC2,SQL_IS_INTEGER);//���û�������
	if(ret==SQL_SUCCESS || ret==SQL_SUCCESS_WITH_INFO){ 
		WriteToLog("Regist the Env_Handle Success!");
		cout << "Regist the Env_Handle Success!" << endl;
	}
	else{
		WriteToLog("Regist the Env_Handle Failed!");
		cout << "Regist the Env_Handle Failed!" << endl;
	}
    ret=SQLAllocHandle(SQL_HANDLE_DBC,henv,&hdbc);//�������ݿ����Ӿ��
	if(ret==SQL_SUCCESS || ret==SQL_SUCCESS_WITH_INFO){ 
		WriteToLog("Regist the Env_Handle Success!");
		cout << "Regist the Env_Handle Success!" << endl;
	}
	else{
		WriteToLog("Regist the Env_Handle Failed!");
		cout << "Regist the Env_Handle Failed!" << endl;
	}
    ret=SQLConnect(hdbc,(SQLCHAR*)"PostgreSQL30W",SQL_NTS,(SQLCHAR*)"postgres",SQL_NTS,(SQLCHAR*)"sungaopeng",SQL_NTS);//�������ݿ�
	cout << GetLastError() << endl;
    if(ret==SQL_SUCCESS || ret==SQL_SUCCESS_WITH_INFO){ 
		WriteToLog("Link the DataBase Success!");
		cout << "Link the DataBase Success!" << endl;
	}
	else{
		WriteToLog("Link the DataBase Failed!");
		cout << "Link the DataBase Failed!" << endl;
	}
	return 0;
}

