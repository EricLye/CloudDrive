package com.clouddrive.biz;

public interface FileManageBiz {
	// ɾ���ļ�
	public boolean delFile(String url, String path);

	// �½��ļ���
	public boolean mkdirFolder(String savePath, String fileName, String userName);

}
