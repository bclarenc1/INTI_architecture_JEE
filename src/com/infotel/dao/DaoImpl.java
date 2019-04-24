package com.infotel.dao;

import java.util.List;

import com.infotel.metier.Personne;

public class DaoImpl implements Idao {

	@Override
	public String creerPersonne(Personne p) {
		System.out.println("création de la personne");
		System.out.println(p);
		return p.getPrenom() + " " + p.getNom() + " ajoute(e) avec succes";
	}

	@Override
	public Personne modifier(Personne p) {
		System.out.println("modification de la personne");
		System.out.println(p);
		return null;
	}

	@Override
	public void supprimer(Personne p) {
		System.out.println(p);
		System.out.println("suppression de la personne");
	}

	@Override
	public List<Personne> lister() {
		System.out.println("listage des personnes");
		return null;
	}

}
