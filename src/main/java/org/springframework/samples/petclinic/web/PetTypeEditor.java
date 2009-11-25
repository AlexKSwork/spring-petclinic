package org.springframework.samples.REMOVED.web;

import java.beans.PropertyEditorSupport;

import org.springframework.samples.REMOVED.Clinic;
import org.springframework.samples.REMOVED.PetType;

/**
 * @author Mark Fisher
 * @author Juergen Hoeller
 */
public class PetTypeEditor extends PropertyEditorSupport {

	private final Clinic clinic;


	public PetTypeEditor(Clinic clinic) {
		this.clinic = clinic;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		for (PetType type : this.clinic.getPetTypes()) {
			if (type.getName().equals(text)) {
				setValue(type);
			}
		}
	}

}
