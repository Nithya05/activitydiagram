/*
 * generated by Xtext 2.9.1
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.input


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class XActivityDiagramInputStandaloneSetup extends XActivityDiagramInputStandaloneSetupGenerated {

	def static void doSetup() {
		new XActivityDiagramInputStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
