package org.springframework.samples.REMOVED.web;

import java.beans.PropertyEditorSupport;

import org.springframework.samples.REMOVED.PetType;
import org.springframework.samples.REMOVED.service.ClinicService;

/**
 * @author Mark Fisher
 * @author Juergen Hoeller
 */
public class PetTypeEditor extends PropertyEditorSupport {

	private final ClinicService clinicService;


	public PetTypeEditor(ClinicService clinicService) {
		this.clinicService = clinicService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		for (PetType type : this.clinicService.getPetTypes()) {
			if (type.getName().equals(text)) {
				setValue(type);
			}
		}
	}

}
