package org.formacion.abstractfactory;

public class Factory_EN implements Abstract_Factory{

	@Override
	public Preguntas createPreguntas() {
		// TODO Auto-generated method stub
		return new PreguntasEn();
	}

	@Override
	public Saludos createSaludos() {
		// TODO Auto-generated method stub
		return new SaludosEn();
	}

}
