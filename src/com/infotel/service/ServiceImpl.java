package com.infotel.service;

import java.util.List;

import com.infotel.dao.DaoImpl;
import com.infotel.dao.Idao;
import com.infotel.metier.Personne;

public class ServiceImpl implements Iservice {

	private Idao dao = new DaoImpl();  // pour appeler la couche dao
	
	@Override
	public String creerPersonne(Personne p) {
		String outString = dao.creerPersonne(p);
		return outString;
	}

	@Override
	public Personne modifier(Personne p) {
		return dao.modifier(p);
	}

	@Override
	public void supprimer(Personne p) {
		dao.supprimer(p);
	}

	@Override
	public List<Personne> lister() {
		return dao.lister();
	}

}
