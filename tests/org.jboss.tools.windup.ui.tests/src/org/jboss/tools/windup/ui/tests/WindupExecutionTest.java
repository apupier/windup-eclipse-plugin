/*******************************************************************************
 * Copyright (c) 2019 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.windup.ui.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.jboss.tools.windup.windup.ConfigurationElement;
import org.junit.Test;

public class WindupExecutionTest extends WindupUiTest {

	@Test
	public void testWindupExecutionResult() {
		ConfigurationElement configuration = super.createRunConfiguration();
		runWindup(configuration);
		assertNotNull("Windup Execution Result is Null after running Windup.", 
				configuration.getWindupResult());
	}

	@Test
	public void testWindupExecutionIssues() {
		ConfigurationElement configuration = super.createRunConfiguration();
		runWindup(configuration);
		assertFalse("Expected Issues after running Windup, but none were found.", 
				configuration.getWindupResult().getIssues().isEmpty());
	}
}
