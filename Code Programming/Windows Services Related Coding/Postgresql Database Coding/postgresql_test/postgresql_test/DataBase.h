#pragma once
 
#ifndef _DATABASE_H
#define _DATABASE_H
#include <sql.h>
#include<sqlext.h>
#include<sqltypes.h>
typedef struct {
	SQLHENV oraclehenv;						//环境句柄
	SQLHDBC oraclehdbc;						//连接句柄
	SQLHSTMT oraclehsmt;					//语句句柄
	SQLRETURN ret;							//结果集
}DATABASE;
 
 
DATABASE getConnection();					//获取连接
void init(DATABASE *d);						//初始化
void freeConnection(DATABASE d);			//释放连接资源
 
 
#endif // !_DATABASE_H
