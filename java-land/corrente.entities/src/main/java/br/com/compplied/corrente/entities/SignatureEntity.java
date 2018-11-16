package br.com.compplied.corrente.entities;

public class SignatureEntity {
	
	private PersonEntity personEntity;
	private byte signature;
	

	public byte getSignature() {
		return signature;
	}
	public void setSignature(byte signature) {
		this.signature = signature;
	}
	public PersonEntity getPersonEntity() {
		return personEntity;
	}
	public void setPersonEntity(PersonEntity personEntity) {
		this.personEntity = personEntity;
	}

	
	
}
