/*
 * generated by Xtext 2.25.0
 */
package xtext.sales.assignment3.transaction.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import xtext.sales.assignment3.transaction.parser.antlr.internal.InternalSalesTransactionParser;
import xtext.sales.assignment3.transaction.services.SalesTransactionGrammarAccess;

public class SalesTransactionParser extends AbstractAntlrParser {

	@Inject
	private SalesTransactionGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSalesTransactionParser createParser(XtextTokenStream stream) {
		return new InternalSalesTransactionParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Company";
	}

	public SalesTransactionGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SalesTransactionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
