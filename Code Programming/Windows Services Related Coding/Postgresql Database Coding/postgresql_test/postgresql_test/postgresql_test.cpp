// postgresql_test.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include<stdio.h> 
#include<windows.h> 
#include<iostream>
//SQL相关头文件
#include<sql.h> 
#include<sqlext.h> 
#include<sqltypes.h>
#include <odbcinst.h>

#pragma comment(lib,"odbc32.lib")
#pragma comment(lib,"odbccp32.lib")

using namespace std;

#define FILE_PATH "E:\\log.txt"                 //LOG文件的存放路径

int WriteToLog(char* str)                       //自定义的写日志函数
{
    FILE* pfile;
    fopen_s(&pfile,FILE_PATH,"a+");             //已追加的方式打开文件；fopen_s函数的安全性更高；
    if (pfile==NULL)     
    {
        return -1; 
    }
    fprintf_s(pfile,"%s\n",str);                 //向文件中写入字符串
    fclose(pfile);                              //关闭打开的文件
    return 0;
}

int main(int argc, _TCHAR* argv[])
{
	cout << "Link the DataBase Start!" << endl;
	WriteToLog("Link the DataBase Start!");
	SQLRETURN ret; 
    SQLHENV henv;//SQL环境句柄
    SQLHDBC hdbc;//数据库连接句柄
    SQLHSTMT hstmt;//执行语句句柄
    ret=SQLAllocHandle(SQL_HANDLE_ENV,NULL,&henv);//申请环境句柄
	if(ret==SQL_SUCCESS || ret==SQL_SUCCESS_WITH_INFO){ 
		WriteToLog("Regist the Env_Handle Success!");
		cout << "Regist the Env_Handle Success!" << endl;
	}
	else{
		WriteToLog("Regist the Env_Handle Failed!");
		cout << "Regist the Env_Handle Failed!" << endl;
	}
    ret=SQLSetEnvAttr(henv,SQL_ATTR_ODBC_VERSION,(SQLPOINTER)SQL_OV_ODBC2,SQL_IS_INTEGER);//设置环境属性
	if(ret==SQL_SUCCESS || ret==SQL_SUCCESS_WITH_INFO){ 
		WriteToLog("Regist the Env_Handle Success!");
		cout << "Regist the Env_Handle Success!" << endl;
	}
	else{
		WriteToLog("Regist the Env_Handle Failed!");
		cout << "Regist the Env_Handle Failed!" << endl;
	}
    ret=SQLAllocHandle(SQL_HANDLE_DBC,henv,&hdbc);//申请数据库连接句柄
	if(ret==SQL_SUCCESS || ret==SQL_SUCCESS_WITH_INFO){ 
		WriteToLog("Regist the Env_Handle Success!");
		cout << "Regist the Env_Handle Success!" << endl;
	}
	else{
		WriteToLog("Regist the Env_Handle Failed!");
		cout << "Regist the Env_Handle Failed!" << endl;
	}
    ret=SQLConnect(hdbc,(SQLCHAR*)"PostgreSQL30W",SQL_NTS,(SQLCHAR*)"postgres",SQL_NTS,(SQLCHAR*)"sungaopeng",SQL_NTS);//连接数据库
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

