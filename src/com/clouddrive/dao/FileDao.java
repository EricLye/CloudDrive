package com.clouddrive.dao;

import java.util.Vector;

import com.clouddrive.entity.FileMessage;

public interface FileDao {
	// ͳ���ļ�����
	public int countFiles();

	// �����ļ�
	public Vector<FileMessage> findFilesByPathAndUser(String path, String userName);

	public Vector<FileMessage> findFilesByTypeAndUser(String type, String user);

	// ����ļ�
	public int insert(FileMessage file);

	// ɾ���ļ�
	public int delFileByUuidName(String uuidName);

	// ɾ���ļ���
	public int delFolder(String path, String fileName);
}
