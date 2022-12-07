package org.springframework.samples.farmacia.controlhorario;

import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class TipoFormatter implements Formatter<Tipo> {
    
    private final ControlHorarioService controlHorarioService;

	@Autowired
	public TipoFormatter(ControlHorarioService controlHorarioService) {
		this.controlHorarioService = controlHorarioService;
	}

	@Override
	public String print(Tipo tipo, Locale locale) {
		return tipo.getName();
	}

	@Override
	public Tipo parse(String text, Locale locale) throws ParseException {
		Collection<Tipo> findControlHorarioTypes = this.controlHorarioService.findByControlHorarioTypes();
		for (Tipo tipo : findControlHorarioTypes) {
			if (tipo.getName().equals(text)) {
				return tipo;
			}
		}
		throw new ParseException("type not found: " + text, 0);
	}

}
