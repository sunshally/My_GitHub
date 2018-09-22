#pragma once
 
#ifndef _DATABASE_H
#define _DATABASE_H
#include <sql.h>
#include<sqlext.h>
#include<sqltypes.h>
typedef struct {
	SQLHENV oraclehenv;						//�������
	SQLHDBC oraclehdbc;						//���Ӿ��
	SQLHSTMT oraclehsmt;					//�����
	SQLRETURN ret;							//�����
}DATABASE;
 
 
DATABASE getConnection();					//��ȡ����
void init(DATABASE *d);						//��ʼ��
void freeConnection(DATABASE d);			//�ͷ�������Դ
 
 
#endif // !_DATABASE_H
