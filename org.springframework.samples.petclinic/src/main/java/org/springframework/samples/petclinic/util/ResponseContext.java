package org.springframework.samples.REMOVED.util;

public interface ResponseContext {

	void redirect(Object resource);

	ResponseContext forResource(Object resource);

}
