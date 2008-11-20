/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.dltk.core.tests.performance.util;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;

public class DLTKCorePerformanceMeterPlugin extends Plugin {

	private static final String PLUGIN_ID = "org.eclipse.dltk.core.tests.performance"; //$NON-NLS-1$
	private static DLTKCorePerformanceMeterPlugin DEFAULT;

	public DLTKCorePerformanceMeterPlugin() {
		DEFAULT = this;
	}

	public static DLTKCorePerformanceMeterPlugin getDefault() {
		return DEFAULT;
	}

	public static void log(IStatus status) {
		getDefault().getLog().log(status);
	}

	public static void log(Throwable e) {
		log(new Status(IStatus.ERROR, PLUGIN_ID, IStatus.ERROR,
				"Internal error", e)); //$NON-NLS-1$
	}
}
