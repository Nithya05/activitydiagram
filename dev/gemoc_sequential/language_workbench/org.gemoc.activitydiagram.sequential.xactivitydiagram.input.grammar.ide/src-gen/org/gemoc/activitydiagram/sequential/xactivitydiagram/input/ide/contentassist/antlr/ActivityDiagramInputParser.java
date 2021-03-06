/*
 * generated by Xtext 2.9.1
 */
package org.gemoc.activitydiagram.sequential.xactivitydiagram.input.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.input.ide.contentassist.antlr.internal.InternalActivityDiagramInputParser;
import org.gemoc.activitydiagram.sequential.xactivitydiagram.input.services.ActivityDiagramInputGrammarAccess;

public class ActivityDiagramInputParser extends AbstractContentAssistParser {

	@Inject
	private ActivityDiagramInputGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalActivityDiagramInputParser createParser() {
		InternalActivityDiagramInputParser result = new InternalActivityDiagramInputParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getInputValueAccess().getGroup(), "rule__InputValue__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getInputAccess().getInputValuesAssignment(), "rule__Input__InputValuesAssignment");
					put(grammarAccess.getInputValueAccess().getVariableAssignment_0(), "rule__InputValue__VariableAssignment_0");
					put(grammarAccess.getInputValueAccess().getValueAssignment_2(), "rule__InputValue__ValueAssignment_2");
					put(grammarAccess.getBooleanValueAccess().getValueAssignment(), "rule__BooleanValue__ValueAssignment");
					put(grammarAccess.getIntegerValueAccess().getValueAssignment(), "rule__IntegerValue__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalActivityDiagramInputParser typedParser = (InternalActivityDiagramInputParser) parser;
			typedParser.entryRuleInput();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ActivityDiagramInputGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ActivityDiagramInputGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
