package br.com.compplied.corrente.entities;

public class TrainingCertificateBodyEntity extends BodyEntity {
	
	private PersonEntity to;
	private PersonEntity[] issuers;
	private double trainingDuration;
	private String trainingDurationUnit;
	private long init;
	private long end;
}
