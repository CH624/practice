package ch.addr.model;

import java.util.*;

public class AddrService {
	private AddrDAO dao;
	private static AddrService instance = new AddrService();//Sington Object Model 
	private AddrService() {
		dao = new AddrDAO();
	}
	public static AddrService getInstance() {
		return instance;
	}
	public ArrayList<AddrDTO> selectS(){
		return dao.select();
	}
	public void insertS(AddrDTO dto) {
		dao.insert(dto);
	}
	public void deleteS(int seq) {
		dao.delete(seq);
	}
}

