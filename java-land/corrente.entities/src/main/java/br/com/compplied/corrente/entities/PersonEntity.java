package br.com.compplied.corrente.entities;

public class PersonEntity {
	
	private UuidEntity uuid;
	private byte publicKey;
	private byte privateKey;
	private int keyLength;
	private String name;
	private String description;
	private PersonEntity parent;

}
