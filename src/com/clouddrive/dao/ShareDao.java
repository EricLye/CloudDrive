package com.clouddrive.dao;

import java.util.Vector;

import com.clouddrive.entity.Share;

public interface ShareDao {
	// ���ҷ���
	public int countShare();

	public int countShareByKey(String key);

	public int countShareByUuidName(String uuidName);

	public Share findShareByKey(String key);

	public Vector<Share> findShareByUser(String name);

	public Vector<Share> getHotShare();

	// ��ӷ���
	public int insert(Share share);

	// ���·���
	public int updateDownloadByKey(String key);

	// ɾ������
	public int delShareByKey(String key);

	public int delShareByUuidName(String uuidName);

	public String findKeyByUuidName(String uuidName);

	// ͳ����������
	public int countDownloads();
}
