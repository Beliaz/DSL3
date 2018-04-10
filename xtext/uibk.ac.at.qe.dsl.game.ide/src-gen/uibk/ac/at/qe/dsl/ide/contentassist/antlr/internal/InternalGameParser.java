package uibk.ac.at.qe.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uibk.ac.at.qe.dsl.services.GameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Talk'", "'Use'", "'Inspect'", "'new'", "'{'", "'start'", "'='", "';'", "'final'", "'}'", "'level'", "'next'", "'description'", "'type'", "'response'", "'position'", "'action'", "'objects'", "','"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGameParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGameParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGameParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGame.g"; }


    	private GameGrammarAccess grammarAccess;

    	public void setGrammarAccess(GameGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGame"
    // InternalGame.g:53:1: entryRuleGame : ruleGame EOF ;
    public final void entryRuleGame() throws RecognitionException {
        try {
            // InternalGame.g:54:1: ( ruleGame EOF )
            // InternalGame.g:55:1: ruleGame EOF
            {
             before(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getGameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalGame.g:62:1: ruleGame : ( ( rule__Game__ScenesAssignment )* ) ;
    public final void ruleGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:66:2: ( ( ( rule__Game__ScenesAssignment )* ) )
            // InternalGame.g:67:2: ( ( rule__Game__ScenesAssignment )* )
            {
            // InternalGame.g:67:2: ( ( rule__Game__ScenesAssignment )* )
            // InternalGame.g:68:3: ( rule__Game__ScenesAssignment )*
            {
             before(grammarAccess.getGameAccess().getScenesAssignment()); 
            // InternalGame.g:69:3: ( rule__Game__ScenesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGame.g:69:4: rule__Game__ScenesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Game__ScenesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getScenesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleScene"
    // InternalGame.g:78:1: entryRuleScene : ruleScene EOF ;
    public final void entryRuleScene() throws RecognitionException {
        try {
            // InternalGame.g:79:1: ( ruleScene EOF )
            // InternalGame.g:80:1: ruleScene EOF
            {
             before(grammarAccess.getSceneRule()); 
            pushFollow(FOLLOW_1);
            ruleScene();

            state._fsp--;

             after(grammarAccess.getSceneRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScene"


    // $ANTLR start "ruleScene"
    // InternalGame.g:87:1: ruleScene : ( ( rule__Scene__Group__0 ) ) ;
    public final void ruleScene() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:91:2: ( ( ( rule__Scene__Group__0 ) ) )
            // InternalGame.g:92:2: ( ( rule__Scene__Group__0 ) )
            {
            // InternalGame.g:92:2: ( ( rule__Scene__Group__0 ) )
            // InternalGame.g:93:3: ( rule__Scene__Group__0 )
            {
             before(grammarAccess.getSceneAccess().getGroup()); 
            // InternalGame.g:94:3: ( rule__Scene__Group__0 )
            // InternalGame.g:94:4: rule__Scene__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSceneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScene"


    // $ANTLR start "entryRuleLevelDeclaration"
    // InternalGame.g:103:1: entryRuleLevelDeclaration : ruleLevelDeclaration EOF ;
    public final void entryRuleLevelDeclaration() throws RecognitionException {
        try {
            // InternalGame.g:104:1: ( ruleLevelDeclaration EOF )
            // InternalGame.g:105:1: ruleLevelDeclaration EOF
            {
             before(grammarAccess.getLevelDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleLevelDeclaration();

            state._fsp--;

             after(grammarAccess.getLevelDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLevelDeclaration"


    // $ANTLR start "ruleLevelDeclaration"
    // InternalGame.g:112:1: ruleLevelDeclaration : ( ( rule__LevelDeclaration__Group__0 ) ) ;
    public final void ruleLevelDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:116:2: ( ( ( rule__LevelDeclaration__Group__0 ) ) )
            // InternalGame.g:117:2: ( ( rule__LevelDeclaration__Group__0 ) )
            {
            // InternalGame.g:117:2: ( ( rule__LevelDeclaration__Group__0 ) )
            // InternalGame.g:118:3: ( rule__LevelDeclaration__Group__0 )
            {
             before(grammarAccess.getLevelDeclarationAccess().getGroup()); 
            // InternalGame.g:119:3: ( rule__LevelDeclaration__Group__0 )
            // InternalGame.g:119:4: rule__LevelDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LevelDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLevelDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLevelDeclaration"


    // $ANTLR start "entryRuleLevelDefinition"
    // InternalGame.g:128:1: entryRuleLevelDefinition : ruleLevelDefinition EOF ;
    public final void entryRuleLevelDefinition() throws RecognitionException {
        try {
            // InternalGame.g:129:1: ( ruleLevelDefinition EOF )
            // InternalGame.g:130:1: ruleLevelDefinition EOF
            {
             before(grammarAccess.getLevelDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleLevelDefinition();

            state._fsp--;

             after(grammarAccess.getLevelDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLevelDefinition"


    // $ANTLR start "ruleLevelDefinition"
    // InternalGame.g:137:1: ruleLevelDefinition : ( ( rule__LevelDefinition__Group__0 ) ) ;
    public final void ruleLevelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:141:2: ( ( ( rule__LevelDefinition__Group__0 ) ) )
            // InternalGame.g:142:2: ( ( rule__LevelDefinition__Group__0 ) )
            {
            // InternalGame.g:142:2: ( ( rule__LevelDefinition__Group__0 ) )
            // InternalGame.g:143:3: ( rule__LevelDefinition__Group__0 )
            {
             before(grammarAccess.getLevelDefinitionAccess().getGroup()); 
            // InternalGame.g:144:3: ( rule__LevelDefinition__Group__0 )
            // InternalGame.g:144:4: rule__LevelDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLevelDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLevelDefinition"


    // $ANTLR start "entryRuleDescription"
    // InternalGame.g:153:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalGame.g:154:1: ( ruleDescription EOF )
            // InternalGame.g:155:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalGame.g:162:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:166:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalGame.g:167:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalGame.g:167:2: ( ( rule__Description__Group__0 ) )
            // InternalGame.g:168:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalGame.g:169:3: ( rule__Description__Group__0 )
            // InternalGame.g:169:4: rule__Description__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRulePerson"
    // InternalGame.g:178:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalGame.g:179:1: ( rulePerson EOF )
            // InternalGame.g:180:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalGame.g:187:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:191:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalGame.g:192:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalGame.g:192:2: ( ( rule__Person__Group__0 ) )
            // InternalGame.g:193:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalGame.g:194:3: ( rule__Person__Group__0 )
            // InternalGame.g:194:4: rule__Person__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRulePerson_R"
    // InternalGame.g:203:1: entryRulePerson_R : rulePerson_R EOF ;
    public final void entryRulePerson_R() throws RecognitionException {
        try {
            // InternalGame.g:204:1: ( rulePerson_R EOF )
            // InternalGame.g:205:1: rulePerson_R EOF
            {
             before(grammarAccess.getPerson_RRule()); 
            pushFollow(FOLLOW_1);
            rulePerson_R();

            state._fsp--;

             after(grammarAccess.getPerson_RRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerson_R"


    // $ANTLR start "rulePerson_R"
    // InternalGame.g:212:1: rulePerson_R : ( ( rule__Person_R__Group__0 ) ) ;
    public final void rulePerson_R() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:216:2: ( ( ( rule__Person_R__Group__0 ) ) )
            // InternalGame.g:217:2: ( ( rule__Person_R__Group__0 ) )
            {
            // InternalGame.g:217:2: ( ( rule__Person_R__Group__0 ) )
            // InternalGame.g:218:3: ( rule__Person_R__Group__0 )
            {
             before(grammarAccess.getPerson_RAccess().getGroup()); 
            // InternalGame.g:219:3: ( rule__Person_R__Group__0 )
            // InternalGame.g:219:4: rule__Person_R__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person_R__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPerson_RAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerson_R"


    // $ANTLR start "entryRulePerson_O"
    // InternalGame.g:228:1: entryRulePerson_O : rulePerson_O EOF ;
    public final void entryRulePerson_O() throws RecognitionException {
        try {
            // InternalGame.g:229:1: ( rulePerson_O EOF )
            // InternalGame.g:230:1: rulePerson_O EOF
            {
             before(grammarAccess.getPerson_ORule()); 
            pushFollow(FOLLOW_1);
            rulePerson_O();

            state._fsp--;

             after(grammarAccess.getPerson_ORule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerson_O"


    // $ANTLR start "rulePerson_O"
    // InternalGame.g:237:1: rulePerson_O : ( ( rule__Person_O__Group__0 ) ) ;
    public final void rulePerson_O() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:241:2: ( ( ( rule__Person_O__Group__0 ) ) )
            // InternalGame.g:242:2: ( ( rule__Person_O__Group__0 ) )
            {
            // InternalGame.g:242:2: ( ( rule__Person_O__Group__0 ) )
            // InternalGame.g:243:3: ( rule__Person_O__Group__0 )
            {
             before(grammarAccess.getPerson_OAccess().getGroup()); 
            // InternalGame.g:244:3: ( rule__Person_O__Group__0 )
            // InternalGame.g:244:4: rule__Person_O__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person_O__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPerson_OAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerson_O"


    // $ANTLR start "entryRuleObject"
    // InternalGame.g:253:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalGame.g:254:1: ( ruleObject EOF )
            // InternalGame.g:255:1: ruleObject EOF
            {
             before(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalGame.g:262:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:266:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalGame.g:267:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalGame.g:267:2: ( ( rule__Object__Group__0 ) )
            // InternalGame.g:268:3: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // InternalGame.g:269:3: ( rule__Object__Group__0 )
            // InternalGame.g:269:4: rule__Object__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "ruleAction_O"
    // InternalGame.g:278:1: ruleAction_O : ( ( rule__Action_O__Alternatives ) ) ;
    public final void ruleAction_O() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:282:1: ( ( ( rule__Action_O__Alternatives ) ) )
            // InternalGame.g:283:2: ( ( rule__Action_O__Alternatives ) )
            {
            // InternalGame.g:283:2: ( ( rule__Action_O__Alternatives ) )
            // InternalGame.g:284:3: ( rule__Action_O__Alternatives )
            {
             before(grammarAccess.getAction_OAccess().getAlternatives()); 
            // InternalGame.g:285:3: ( rule__Action_O__Alternatives )
            // InternalGame.g:285:4: rule__Action_O__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action_O__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAction_OAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction_O"


    // $ANTLR start "ruleAction_P"
    // InternalGame.g:294:1: ruleAction_P : ( ( 'Talk' ) ) ;
    public final void ruleAction_P() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:298:1: ( ( ( 'Talk' ) ) )
            // InternalGame.g:299:2: ( ( 'Talk' ) )
            {
            // InternalGame.g:299:2: ( ( 'Talk' ) )
            // InternalGame.g:300:3: ( 'Talk' )
            {
             before(grammarAccess.getAction_PAccess().getTALKEnumLiteralDeclaration()); 
            // InternalGame.g:301:3: ( 'Talk' )
            // InternalGame.g:301:4: 'Talk'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getAction_PAccess().getTALKEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction_P"


    // $ANTLR start "rule__Action_O__Alternatives"
    // InternalGame.g:309:1: rule__Action_O__Alternatives : ( ( ( 'Use' ) ) | ( ( 'Inspect' ) ) );
    public final void rule__Action_O__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:313:1: ( ( ( 'Use' ) ) | ( ( 'Inspect' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGame.g:314:2: ( ( 'Use' ) )
                    {
                    // InternalGame.g:314:2: ( ( 'Use' ) )
                    // InternalGame.g:315:3: ( 'Use' )
                    {
                     before(grammarAccess.getAction_OAccess().getUSEEnumLiteralDeclaration_0()); 
                    // InternalGame.g:316:3: ( 'Use' )
                    // InternalGame.g:316:4: 'Use'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAction_OAccess().getUSEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:320:2: ( ( 'Inspect' ) )
                    {
                    // InternalGame.g:320:2: ( ( 'Inspect' ) )
                    // InternalGame.g:321:3: ( 'Inspect' )
                    {
                     before(grammarAccess.getAction_OAccess().getINSPECTEnumLiteralDeclaration_1()); 
                    // InternalGame.g:322:3: ( 'Inspect' )
                    // InternalGame.g:322:4: 'Inspect'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAction_OAccess().getINSPECTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action_O__Alternatives"


    // $ANTLR start "rule__Scene__Group__0"
    // InternalGame.g:330:1: rule__Scene__Group__0 : rule__Scene__Group__0__Impl rule__Scene__Group__1 ;
    public final void rule__Scene__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:334:1: ( rule__Scene__Group__0__Impl rule__Scene__Group__1 )
            // InternalGame.g:335:2: rule__Scene__Group__0__Impl rule__Scene__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Scene__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__0"


    // $ANTLR start "rule__Scene__Group__0__Impl"
    // InternalGame.g:342:1: rule__Scene__Group__0__Impl : ( 'new' ) ;
    public final void rule__Scene__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:346:1: ( ( 'new' ) )
            // InternalGame.g:347:1: ( 'new' )
            {
            // InternalGame.g:347:1: ( 'new' )
            // InternalGame.g:348:2: 'new'
            {
             before(grammarAccess.getSceneAccess().getNewKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getNewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__0__Impl"


    // $ANTLR start "rule__Scene__Group__1"
    // InternalGame.g:357:1: rule__Scene__Group__1 : rule__Scene__Group__1__Impl rule__Scene__Group__2 ;
    public final void rule__Scene__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:361:1: ( rule__Scene__Group__1__Impl rule__Scene__Group__2 )
            // InternalGame.g:362:2: rule__Scene__Group__1__Impl rule__Scene__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Scene__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__1"


    // $ANTLR start "rule__Scene__Group__1__Impl"
    // InternalGame.g:369:1: rule__Scene__Group__1__Impl : ( ( rule__Scene__NameAssignment_1 ) ) ;
    public final void rule__Scene__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:373:1: ( ( ( rule__Scene__NameAssignment_1 ) ) )
            // InternalGame.g:374:1: ( ( rule__Scene__NameAssignment_1 ) )
            {
            // InternalGame.g:374:1: ( ( rule__Scene__NameAssignment_1 ) )
            // InternalGame.g:375:2: ( rule__Scene__NameAssignment_1 )
            {
             before(grammarAccess.getSceneAccess().getNameAssignment_1()); 
            // InternalGame.g:376:2: ( rule__Scene__NameAssignment_1 )
            // InternalGame.g:376:3: rule__Scene__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Scene__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSceneAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__1__Impl"


    // $ANTLR start "rule__Scene__Group__2"
    // InternalGame.g:384:1: rule__Scene__Group__2 : rule__Scene__Group__2__Impl rule__Scene__Group__3 ;
    public final void rule__Scene__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:388:1: ( rule__Scene__Group__2__Impl rule__Scene__Group__3 )
            // InternalGame.g:389:2: rule__Scene__Group__2__Impl rule__Scene__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Scene__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__2"


    // $ANTLR start "rule__Scene__Group__2__Impl"
    // InternalGame.g:396:1: rule__Scene__Group__2__Impl : ( '{' ) ;
    public final void rule__Scene__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:400:1: ( ( '{' ) )
            // InternalGame.g:401:1: ( '{' )
            {
            // InternalGame.g:401:1: ( '{' )
            // InternalGame.g:402:2: '{'
            {
             before(grammarAccess.getSceneAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__2__Impl"


    // $ANTLR start "rule__Scene__Group__3"
    // InternalGame.g:411:1: rule__Scene__Group__3 : rule__Scene__Group__3__Impl rule__Scene__Group__4 ;
    public final void rule__Scene__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:415:1: ( rule__Scene__Group__3__Impl rule__Scene__Group__4 )
            // InternalGame.g:416:2: rule__Scene__Group__3__Impl rule__Scene__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Scene__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__3"


    // $ANTLR start "rule__Scene__Group__3__Impl"
    // InternalGame.g:423:1: rule__Scene__Group__3__Impl : ( ( rule__Scene__DeclartionsAssignment_3 )* ) ;
    public final void rule__Scene__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:427:1: ( ( ( rule__Scene__DeclartionsAssignment_3 )* ) )
            // InternalGame.g:428:1: ( ( rule__Scene__DeclartionsAssignment_3 )* )
            {
            // InternalGame.g:428:1: ( ( rule__Scene__DeclartionsAssignment_3 )* )
            // InternalGame.g:429:2: ( rule__Scene__DeclartionsAssignment_3 )*
            {
             before(grammarAccess.getSceneAccess().getDeclartionsAssignment_3()); 
            // InternalGame.g:430:2: ( rule__Scene__DeclartionsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGame.g:430:3: rule__Scene__DeclartionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Scene__DeclartionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSceneAccess().getDeclartionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__3__Impl"


    // $ANTLR start "rule__Scene__Group__4"
    // InternalGame.g:438:1: rule__Scene__Group__4 : rule__Scene__Group__4__Impl rule__Scene__Group__5 ;
    public final void rule__Scene__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:442:1: ( rule__Scene__Group__4__Impl rule__Scene__Group__5 )
            // InternalGame.g:443:2: rule__Scene__Group__4__Impl rule__Scene__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Scene__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__4"


    // $ANTLR start "rule__Scene__Group__4__Impl"
    // InternalGame.g:450:1: rule__Scene__Group__4__Impl : ( ( rule__Scene__DefinitionsAssignment_4 )* ) ;
    public final void rule__Scene__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:454:1: ( ( ( rule__Scene__DefinitionsAssignment_4 )* ) )
            // InternalGame.g:455:1: ( ( rule__Scene__DefinitionsAssignment_4 )* )
            {
            // InternalGame.g:455:1: ( ( rule__Scene__DefinitionsAssignment_4 )* )
            // InternalGame.g:456:2: ( rule__Scene__DefinitionsAssignment_4 )*
            {
             before(grammarAccess.getSceneAccess().getDefinitionsAssignment_4()); 
            // InternalGame.g:457:2: ( rule__Scene__DefinitionsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:457:3: rule__Scene__DefinitionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Scene__DefinitionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSceneAccess().getDefinitionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__4__Impl"


    // $ANTLR start "rule__Scene__Group__5"
    // InternalGame.g:465:1: rule__Scene__Group__5 : rule__Scene__Group__5__Impl rule__Scene__Group__6 ;
    public final void rule__Scene__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:469:1: ( rule__Scene__Group__5__Impl rule__Scene__Group__6 )
            // InternalGame.g:470:2: rule__Scene__Group__5__Impl rule__Scene__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Scene__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__5"


    // $ANTLR start "rule__Scene__Group__5__Impl"
    // InternalGame.g:477:1: rule__Scene__Group__5__Impl : ( 'start' ) ;
    public final void rule__Scene__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:481:1: ( ( 'start' ) )
            // InternalGame.g:482:1: ( 'start' )
            {
            // InternalGame.g:482:1: ( 'start' )
            // InternalGame.g:483:2: 'start'
            {
             before(grammarAccess.getSceneAccess().getStartKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getStartKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__5__Impl"


    // $ANTLR start "rule__Scene__Group__6"
    // InternalGame.g:492:1: rule__Scene__Group__6 : rule__Scene__Group__6__Impl rule__Scene__Group__7 ;
    public final void rule__Scene__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:496:1: ( rule__Scene__Group__6__Impl rule__Scene__Group__7 )
            // InternalGame.g:497:2: rule__Scene__Group__6__Impl rule__Scene__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Scene__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__6"


    // $ANTLR start "rule__Scene__Group__6__Impl"
    // InternalGame.g:504:1: rule__Scene__Group__6__Impl : ( '=' ) ;
    public final void rule__Scene__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:508:1: ( ( '=' ) )
            // InternalGame.g:509:1: ( '=' )
            {
            // InternalGame.g:509:1: ( '=' )
            // InternalGame.g:510:2: '='
            {
             before(grammarAccess.getSceneAccess().getEqualsSignKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__6__Impl"


    // $ANTLR start "rule__Scene__Group__7"
    // InternalGame.g:519:1: rule__Scene__Group__7 : rule__Scene__Group__7__Impl rule__Scene__Group__8 ;
    public final void rule__Scene__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:523:1: ( rule__Scene__Group__7__Impl rule__Scene__Group__8 )
            // InternalGame.g:524:2: rule__Scene__Group__7__Impl rule__Scene__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Scene__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__7"


    // $ANTLR start "rule__Scene__Group__7__Impl"
    // InternalGame.g:531:1: rule__Scene__Group__7__Impl : ( ( rule__Scene__StartLevelAssignment_7 ) ) ;
    public final void rule__Scene__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:535:1: ( ( ( rule__Scene__StartLevelAssignment_7 ) ) )
            // InternalGame.g:536:1: ( ( rule__Scene__StartLevelAssignment_7 ) )
            {
            // InternalGame.g:536:1: ( ( rule__Scene__StartLevelAssignment_7 ) )
            // InternalGame.g:537:2: ( rule__Scene__StartLevelAssignment_7 )
            {
             before(grammarAccess.getSceneAccess().getStartLevelAssignment_7()); 
            // InternalGame.g:538:2: ( rule__Scene__StartLevelAssignment_7 )
            // InternalGame.g:538:3: rule__Scene__StartLevelAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Scene__StartLevelAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSceneAccess().getStartLevelAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__7__Impl"


    // $ANTLR start "rule__Scene__Group__8"
    // InternalGame.g:546:1: rule__Scene__Group__8 : rule__Scene__Group__8__Impl rule__Scene__Group__9 ;
    public final void rule__Scene__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:550:1: ( rule__Scene__Group__8__Impl rule__Scene__Group__9 )
            // InternalGame.g:551:2: rule__Scene__Group__8__Impl rule__Scene__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Scene__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__8"


    // $ANTLR start "rule__Scene__Group__8__Impl"
    // InternalGame.g:558:1: rule__Scene__Group__8__Impl : ( ';' ) ;
    public final void rule__Scene__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:562:1: ( ( ';' ) )
            // InternalGame.g:563:1: ( ';' )
            {
            // InternalGame.g:563:1: ( ';' )
            // InternalGame.g:564:2: ';'
            {
             before(grammarAccess.getSceneAccess().getSemicolonKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__8__Impl"


    // $ANTLR start "rule__Scene__Group__9"
    // InternalGame.g:573:1: rule__Scene__Group__9 : rule__Scene__Group__9__Impl rule__Scene__Group__10 ;
    public final void rule__Scene__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:577:1: ( rule__Scene__Group__9__Impl rule__Scene__Group__10 )
            // InternalGame.g:578:2: rule__Scene__Group__9__Impl rule__Scene__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Scene__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__9"


    // $ANTLR start "rule__Scene__Group__9__Impl"
    // InternalGame.g:585:1: rule__Scene__Group__9__Impl : ( 'final' ) ;
    public final void rule__Scene__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:589:1: ( ( 'final' ) )
            // InternalGame.g:590:1: ( 'final' )
            {
            // InternalGame.g:590:1: ( 'final' )
            // InternalGame.g:591:2: 'final'
            {
             before(grammarAccess.getSceneAccess().getFinalKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getFinalKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__9__Impl"


    // $ANTLR start "rule__Scene__Group__10"
    // InternalGame.g:600:1: rule__Scene__Group__10 : rule__Scene__Group__10__Impl rule__Scene__Group__11 ;
    public final void rule__Scene__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:604:1: ( rule__Scene__Group__10__Impl rule__Scene__Group__11 )
            // InternalGame.g:605:2: rule__Scene__Group__10__Impl rule__Scene__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__Scene__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__10"


    // $ANTLR start "rule__Scene__Group__10__Impl"
    // InternalGame.g:612:1: rule__Scene__Group__10__Impl : ( '=' ) ;
    public final void rule__Scene__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:616:1: ( ( '=' ) )
            // InternalGame.g:617:1: ( '=' )
            {
            // InternalGame.g:617:1: ( '=' )
            // InternalGame.g:618:2: '='
            {
             before(grammarAccess.getSceneAccess().getEqualsSignKeyword_10()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getEqualsSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__10__Impl"


    // $ANTLR start "rule__Scene__Group__11"
    // InternalGame.g:627:1: rule__Scene__Group__11 : rule__Scene__Group__11__Impl rule__Scene__Group__12 ;
    public final void rule__Scene__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:631:1: ( rule__Scene__Group__11__Impl rule__Scene__Group__12 )
            // InternalGame.g:632:2: rule__Scene__Group__11__Impl rule__Scene__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__Scene__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__11"


    // $ANTLR start "rule__Scene__Group__11__Impl"
    // InternalGame.g:639:1: rule__Scene__Group__11__Impl : ( ( rule__Scene__FinalLevelAssignment_11 ) ) ;
    public final void rule__Scene__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:643:1: ( ( ( rule__Scene__FinalLevelAssignment_11 ) ) )
            // InternalGame.g:644:1: ( ( rule__Scene__FinalLevelAssignment_11 ) )
            {
            // InternalGame.g:644:1: ( ( rule__Scene__FinalLevelAssignment_11 ) )
            // InternalGame.g:645:2: ( rule__Scene__FinalLevelAssignment_11 )
            {
             before(grammarAccess.getSceneAccess().getFinalLevelAssignment_11()); 
            // InternalGame.g:646:2: ( rule__Scene__FinalLevelAssignment_11 )
            // InternalGame.g:646:3: rule__Scene__FinalLevelAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Scene__FinalLevelAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getSceneAccess().getFinalLevelAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__11__Impl"


    // $ANTLR start "rule__Scene__Group__12"
    // InternalGame.g:654:1: rule__Scene__Group__12 : rule__Scene__Group__12__Impl rule__Scene__Group__13 ;
    public final void rule__Scene__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:658:1: ( rule__Scene__Group__12__Impl rule__Scene__Group__13 )
            // InternalGame.g:659:2: rule__Scene__Group__12__Impl rule__Scene__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__Scene__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__12"


    // $ANTLR start "rule__Scene__Group__12__Impl"
    // InternalGame.g:666:1: rule__Scene__Group__12__Impl : ( ';' ) ;
    public final void rule__Scene__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:670:1: ( ( ';' ) )
            // InternalGame.g:671:1: ( ';' )
            {
            // InternalGame.g:671:1: ( ';' )
            // InternalGame.g:672:2: ';'
            {
             before(grammarAccess.getSceneAccess().getSemicolonKeyword_12()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getSemicolonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__12__Impl"


    // $ANTLR start "rule__Scene__Group__13"
    // InternalGame.g:681:1: rule__Scene__Group__13 : rule__Scene__Group__13__Impl ;
    public final void rule__Scene__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:685:1: ( rule__Scene__Group__13__Impl )
            // InternalGame.g:686:2: rule__Scene__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__13"


    // $ANTLR start "rule__Scene__Group__13__Impl"
    // InternalGame.g:692:1: rule__Scene__Group__13__Impl : ( '}' ) ;
    public final void rule__Scene__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:696:1: ( ( '}' ) )
            // InternalGame.g:697:1: ( '}' )
            {
            // InternalGame.g:697:1: ( '}' )
            // InternalGame.g:698:2: '}'
            {
             before(grammarAccess.getSceneAccess().getRightCurlyBracketKeyword_13()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__13__Impl"


    // $ANTLR start "rule__LevelDeclaration__Group__0"
    // InternalGame.g:708:1: rule__LevelDeclaration__Group__0 : rule__LevelDeclaration__Group__0__Impl rule__LevelDeclaration__Group__1 ;
    public final void rule__LevelDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:712:1: ( rule__LevelDeclaration__Group__0__Impl rule__LevelDeclaration__Group__1 )
            // InternalGame.g:713:2: rule__LevelDeclaration__Group__0__Impl rule__LevelDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LevelDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDeclaration__Group__0"


    // $ANTLR start "rule__LevelDeclaration__Group__0__Impl"
    // InternalGame.g:720:1: rule__LevelDeclaration__Group__0__Impl : ( 'level' ) ;
    public final void rule__LevelDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:724:1: ( ( 'level' ) )
            // InternalGame.g:725:1: ( 'level' )
            {
            // InternalGame.g:725:1: ( 'level' )
            // InternalGame.g:726:2: 'level'
            {
             before(grammarAccess.getLevelDeclarationAccess().getLevelKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLevelDeclarationAccess().getLevelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDeclaration__Group__0__Impl"


    // $ANTLR start "rule__LevelDeclaration__Group__1"
    // InternalGame.g:735:1: rule__LevelDeclaration__Group__1 : rule__LevelDeclaration__Group__1__Impl rule__LevelDeclaration__Group__2 ;
    public final void rule__LevelDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:739:1: ( rule__LevelDeclaration__Group__1__Impl rule__LevelDeclaration__Group__2 )
            // InternalGame.g:740:2: rule__LevelDeclaration__Group__1__Impl rule__LevelDeclaration__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__LevelDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDeclaration__Group__1"


    // $ANTLR start "rule__LevelDeclaration__Group__1__Impl"
    // InternalGame.g:747:1: rule__LevelDeclaration__Group__1__Impl : ( ( rule__LevelDeclaration__NameAssignment_1 ) ) ;
    public final void rule__LevelDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:751:1: ( ( ( rule__LevelDeclaration__NameAssignment_1 ) ) )
            // InternalGame.g:752:1: ( ( rule__LevelDeclaration__NameAssignment_1 ) )
            {
            // InternalGame.g:752:1: ( ( rule__LevelDeclaration__NameAssignment_1 ) )
            // InternalGame.g:753:2: ( rule__LevelDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getLevelDeclarationAccess().getNameAssignment_1()); 
            // InternalGame.g:754:2: ( rule__LevelDeclaration__NameAssignment_1 )
            // InternalGame.g:754:3: rule__LevelDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LevelDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLevelDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDeclaration__Group__1__Impl"


    // $ANTLR start "rule__LevelDeclaration__Group__2"
    // InternalGame.g:762:1: rule__LevelDeclaration__Group__2 : rule__LevelDeclaration__Group__2__Impl ;
    public final void rule__LevelDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:766:1: ( rule__LevelDeclaration__Group__2__Impl )
            // InternalGame.g:767:2: rule__LevelDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LevelDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDeclaration__Group__2"


    // $ANTLR start "rule__LevelDeclaration__Group__2__Impl"
    // InternalGame.g:773:1: rule__LevelDeclaration__Group__2__Impl : ( ';' ) ;
    public final void rule__LevelDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:777:1: ( ( ';' ) )
            // InternalGame.g:778:1: ( ';' )
            {
            // InternalGame.g:778:1: ( ';' )
            // InternalGame.g:779:2: ';'
            {
             before(grammarAccess.getLevelDeclarationAccess().getSemicolonKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLevelDeclarationAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDeclaration__Group__2__Impl"


    // $ANTLR start "rule__LevelDefinition__Group__0"
    // InternalGame.g:789:1: rule__LevelDefinition__Group__0 : rule__LevelDefinition__Group__0__Impl rule__LevelDefinition__Group__1 ;
    public final void rule__LevelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:793:1: ( rule__LevelDefinition__Group__0__Impl rule__LevelDefinition__Group__1 )
            // InternalGame.g:794:2: rule__LevelDefinition__Group__0__Impl rule__LevelDefinition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__LevelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__0"


    // $ANTLR start "rule__LevelDefinition__Group__0__Impl"
    // InternalGame.g:801:1: rule__LevelDefinition__Group__0__Impl : ( ( rule__LevelDefinition__NameAssignment_0 ) ) ;
    public final void rule__LevelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:805:1: ( ( ( rule__LevelDefinition__NameAssignment_0 ) ) )
            // InternalGame.g:806:1: ( ( rule__LevelDefinition__NameAssignment_0 ) )
            {
            // InternalGame.g:806:1: ( ( rule__LevelDefinition__NameAssignment_0 ) )
            // InternalGame.g:807:2: ( rule__LevelDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getLevelDefinitionAccess().getNameAssignment_0()); 
            // InternalGame.g:808:2: ( rule__LevelDefinition__NameAssignment_0 )
            // InternalGame.g:808:3: rule__LevelDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LevelDefinition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLevelDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__0__Impl"


    // $ANTLR start "rule__LevelDefinition__Group__1"
    // InternalGame.g:816:1: rule__LevelDefinition__Group__1 : rule__LevelDefinition__Group__1__Impl rule__LevelDefinition__Group__2 ;
    public final void rule__LevelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:820:1: ( rule__LevelDefinition__Group__1__Impl rule__LevelDefinition__Group__2 )
            // InternalGame.g:821:2: rule__LevelDefinition__Group__1__Impl rule__LevelDefinition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LevelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__1"


    // $ANTLR start "rule__LevelDefinition__Group__1__Impl"
    // InternalGame.g:828:1: rule__LevelDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__LevelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:832:1: ( ( '=' ) )
            // InternalGame.g:833:1: ( '=' )
            {
            // InternalGame.g:833:1: ( '=' )
            // InternalGame.g:834:2: '='
            {
             before(grammarAccess.getLevelDefinitionAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__1__Impl"


    // $ANTLR start "rule__LevelDefinition__Group__2"
    // InternalGame.g:843:1: rule__LevelDefinition__Group__2 : rule__LevelDefinition__Group__2__Impl rule__LevelDefinition__Group__3 ;
    public final void rule__LevelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:847:1: ( rule__LevelDefinition__Group__2__Impl rule__LevelDefinition__Group__3 )
            // InternalGame.g:848:2: rule__LevelDefinition__Group__2__Impl rule__LevelDefinition__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__LevelDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__2"


    // $ANTLR start "rule__LevelDefinition__Group__2__Impl"
    // InternalGame.g:855:1: rule__LevelDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__LevelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:859:1: ( ( '{' ) )
            // InternalGame.g:860:1: ( '{' )
            {
            // InternalGame.g:860:1: ( '{' )
            // InternalGame.g:861:2: '{'
            {
             before(grammarAccess.getLevelDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__2__Impl"


    // $ANTLR start "rule__LevelDefinition__Group__3"
    // InternalGame.g:870:1: rule__LevelDefinition__Group__3 : rule__LevelDefinition__Group__3__Impl rule__LevelDefinition__Group__4 ;
    public final void rule__LevelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:874:1: ( rule__LevelDefinition__Group__3__Impl rule__LevelDefinition__Group__4 )
            // InternalGame.g:875:2: rule__LevelDefinition__Group__3__Impl rule__LevelDefinition__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__LevelDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__3"


    // $ANTLR start "rule__LevelDefinition__Group__3__Impl"
    // InternalGame.g:882:1: rule__LevelDefinition__Group__3__Impl : ( ( rule__LevelDefinition__DescriptionAssignment_3 ) ) ;
    public final void rule__LevelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:886:1: ( ( ( rule__LevelDefinition__DescriptionAssignment_3 ) ) )
            // InternalGame.g:887:1: ( ( rule__LevelDefinition__DescriptionAssignment_3 ) )
            {
            // InternalGame.g:887:1: ( ( rule__LevelDefinition__DescriptionAssignment_3 ) )
            // InternalGame.g:888:2: ( rule__LevelDefinition__DescriptionAssignment_3 )
            {
             before(grammarAccess.getLevelDefinitionAccess().getDescriptionAssignment_3()); 
            // InternalGame.g:889:2: ( rule__LevelDefinition__DescriptionAssignment_3 )
            // InternalGame.g:889:3: rule__LevelDefinition__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LevelDefinition__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLevelDefinitionAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__3__Impl"


    // $ANTLR start "rule__LevelDefinition__Group__4"
    // InternalGame.g:897:1: rule__LevelDefinition__Group__4 : rule__LevelDefinition__Group__4__Impl rule__LevelDefinition__Group__5 ;
    public final void rule__LevelDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:901:1: ( rule__LevelDefinition__Group__4__Impl rule__LevelDefinition__Group__5 )
            // InternalGame.g:902:2: rule__LevelDefinition__Group__4__Impl rule__LevelDefinition__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__LevelDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__4"


    // $ANTLR start "rule__LevelDefinition__Group__4__Impl"
    // InternalGame.g:909:1: rule__LevelDefinition__Group__4__Impl : ( ( rule__LevelDefinition__PersonsAssignment_4 )* ) ;
    public final void rule__LevelDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:913:1: ( ( ( rule__LevelDefinition__PersonsAssignment_4 )* ) )
            // InternalGame.g:914:1: ( ( rule__LevelDefinition__PersonsAssignment_4 )* )
            {
            // InternalGame.g:914:1: ( ( rule__LevelDefinition__PersonsAssignment_4 )* )
            // InternalGame.g:915:2: ( rule__LevelDefinition__PersonsAssignment_4 )*
            {
             before(grammarAccess.getLevelDefinitionAccess().getPersonsAssignment_4()); 
            // InternalGame.g:916:2: ( rule__LevelDefinition__PersonsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // InternalGame.g:916:3: rule__LevelDefinition__PersonsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__LevelDefinition__PersonsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getLevelDefinitionAccess().getPersonsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__4__Impl"


    // $ANTLR start "rule__LevelDefinition__Group__5"
    // InternalGame.g:924:1: rule__LevelDefinition__Group__5 : rule__LevelDefinition__Group__5__Impl rule__LevelDefinition__Group__6 ;
    public final void rule__LevelDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:928:1: ( rule__LevelDefinition__Group__5__Impl rule__LevelDefinition__Group__6 )
            // InternalGame.g:929:2: rule__LevelDefinition__Group__5__Impl rule__LevelDefinition__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__LevelDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__5"


    // $ANTLR start "rule__LevelDefinition__Group__5__Impl"
    // InternalGame.g:936:1: rule__LevelDefinition__Group__5__Impl : ( ( rule__LevelDefinition__ObjectsAssignment_5 )* ) ;
    public final void rule__LevelDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:940:1: ( ( ( rule__LevelDefinition__ObjectsAssignment_5 )* ) )
            // InternalGame.g:941:1: ( ( rule__LevelDefinition__ObjectsAssignment_5 )* )
            {
            // InternalGame.g:941:1: ( ( rule__LevelDefinition__ObjectsAssignment_5 )* )
            // InternalGame.g:942:2: ( rule__LevelDefinition__ObjectsAssignment_5 )*
            {
             before(grammarAccess.getLevelDefinitionAccess().getObjectsAssignment_5()); 
            // InternalGame.g:943:2: ( rule__LevelDefinition__ObjectsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGame.g:943:3: rule__LevelDefinition__ObjectsAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__LevelDefinition__ObjectsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getLevelDefinitionAccess().getObjectsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__5__Impl"


    // $ANTLR start "rule__LevelDefinition__Group__6"
    // InternalGame.g:951:1: rule__LevelDefinition__Group__6 : rule__LevelDefinition__Group__6__Impl rule__LevelDefinition__Group__7 ;
    public final void rule__LevelDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:955:1: ( rule__LevelDefinition__Group__6__Impl rule__LevelDefinition__Group__7 )
            // InternalGame.g:956:2: rule__LevelDefinition__Group__6__Impl rule__LevelDefinition__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__LevelDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__6"


    // $ANTLR start "rule__LevelDefinition__Group__6__Impl"
    // InternalGame.g:963:1: rule__LevelDefinition__Group__6__Impl : ( ( rule__LevelDefinition__Group_6__0 )? ) ;
    public final void rule__LevelDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:967:1: ( ( ( rule__LevelDefinition__Group_6__0 )? ) )
            // InternalGame.g:968:1: ( ( rule__LevelDefinition__Group_6__0 )? )
            {
            // InternalGame.g:968:1: ( ( rule__LevelDefinition__Group_6__0 )? )
            // InternalGame.g:969:2: ( rule__LevelDefinition__Group_6__0 )?
            {
             before(grammarAccess.getLevelDefinitionAccess().getGroup_6()); 
            // InternalGame.g:970:2: ( rule__LevelDefinition__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGame.g:970:3: rule__LevelDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LevelDefinition__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLevelDefinitionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__6__Impl"


    // $ANTLR start "rule__LevelDefinition__Group__7"
    // InternalGame.g:978:1: rule__LevelDefinition__Group__7 : rule__LevelDefinition__Group__7__Impl ;
    public final void rule__LevelDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:982:1: ( rule__LevelDefinition__Group__7__Impl )
            // InternalGame.g:983:2: rule__LevelDefinition__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__7"


    // $ANTLR start "rule__LevelDefinition__Group__7__Impl"
    // InternalGame.g:989:1: rule__LevelDefinition__Group__7__Impl : ( '}' ) ;
    public final void rule__LevelDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:993:1: ( ( '}' ) )
            // InternalGame.g:994:1: ( '}' )
            {
            // InternalGame.g:994:1: ( '}' )
            // InternalGame.g:995:2: '}'
            {
             before(grammarAccess.getLevelDefinitionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__7__Impl"


    // $ANTLR start "rule__LevelDefinition__Group_6__0"
    // InternalGame.g:1005:1: rule__LevelDefinition__Group_6__0 : rule__LevelDefinition__Group_6__0__Impl rule__LevelDefinition__Group_6__1 ;
    public final void rule__LevelDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1009:1: ( rule__LevelDefinition__Group_6__0__Impl rule__LevelDefinition__Group_6__1 )
            // InternalGame.g:1010:2: rule__LevelDefinition__Group_6__0__Impl rule__LevelDefinition__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__LevelDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group_6__0"


    // $ANTLR start "rule__LevelDefinition__Group_6__0__Impl"
    // InternalGame.g:1017:1: rule__LevelDefinition__Group_6__0__Impl : ( 'next' ) ;
    public final void rule__LevelDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1021:1: ( ( 'next' ) )
            // InternalGame.g:1022:1: ( 'next' )
            {
            // InternalGame.g:1022:1: ( 'next' )
            // InternalGame.g:1023:2: 'next'
            {
             before(grammarAccess.getLevelDefinitionAccess().getNextKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getNextKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group_6__0__Impl"


    // $ANTLR start "rule__LevelDefinition__Group_6__1"
    // InternalGame.g:1032:1: rule__LevelDefinition__Group_6__1 : rule__LevelDefinition__Group_6__1__Impl rule__LevelDefinition__Group_6__2 ;
    public final void rule__LevelDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1036:1: ( rule__LevelDefinition__Group_6__1__Impl rule__LevelDefinition__Group_6__2 )
            // InternalGame.g:1037:2: rule__LevelDefinition__Group_6__1__Impl rule__LevelDefinition__Group_6__2
            {
            pushFollow(FOLLOW_4);
            rule__LevelDefinition__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group_6__1"


    // $ANTLR start "rule__LevelDefinition__Group_6__1__Impl"
    // InternalGame.g:1044:1: rule__LevelDefinition__Group_6__1__Impl : ( '=' ) ;
    public final void rule__LevelDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1048:1: ( ( '=' ) )
            // InternalGame.g:1049:1: ( '=' )
            {
            // InternalGame.g:1049:1: ( '=' )
            // InternalGame.g:1050:2: '='
            {
             before(grammarAccess.getLevelDefinitionAccess().getEqualsSignKeyword_6_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getEqualsSignKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group_6__1__Impl"


    // $ANTLR start "rule__LevelDefinition__Group_6__2"
    // InternalGame.g:1059:1: rule__LevelDefinition__Group_6__2 : rule__LevelDefinition__Group_6__2__Impl rule__LevelDefinition__Group_6__3 ;
    public final void rule__LevelDefinition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1063:1: ( rule__LevelDefinition__Group_6__2__Impl rule__LevelDefinition__Group_6__3 )
            // InternalGame.g:1064:2: rule__LevelDefinition__Group_6__2__Impl rule__LevelDefinition__Group_6__3
            {
            pushFollow(FOLLOW_10);
            rule__LevelDefinition__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group_6__2"


    // $ANTLR start "rule__LevelDefinition__Group_6__2__Impl"
    // InternalGame.g:1071:1: rule__LevelDefinition__Group_6__2__Impl : ( ( rule__LevelDefinition__NextAssignment_6_2 ) ) ;
    public final void rule__LevelDefinition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1075:1: ( ( ( rule__LevelDefinition__NextAssignment_6_2 ) ) )
            // InternalGame.g:1076:1: ( ( rule__LevelDefinition__NextAssignment_6_2 ) )
            {
            // InternalGame.g:1076:1: ( ( rule__LevelDefinition__NextAssignment_6_2 ) )
            // InternalGame.g:1077:2: ( rule__LevelDefinition__NextAssignment_6_2 )
            {
             before(grammarAccess.getLevelDefinitionAccess().getNextAssignment_6_2()); 
            // InternalGame.g:1078:2: ( rule__LevelDefinition__NextAssignment_6_2 )
            // InternalGame.g:1078:3: rule__LevelDefinition__NextAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__LevelDefinition__NextAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getLevelDefinitionAccess().getNextAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group_6__2__Impl"


    // $ANTLR start "rule__LevelDefinition__Group_6__3"
    // InternalGame.g:1086:1: rule__LevelDefinition__Group_6__3 : rule__LevelDefinition__Group_6__3__Impl ;
    public final void rule__LevelDefinition__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1090:1: ( rule__LevelDefinition__Group_6__3__Impl )
            // InternalGame.g:1091:2: rule__LevelDefinition__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group_6__3"


    // $ANTLR start "rule__LevelDefinition__Group_6__3__Impl"
    // InternalGame.g:1097:1: rule__LevelDefinition__Group_6__3__Impl : ( ';' ) ;
    public final void rule__LevelDefinition__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1101:1: ( ( ';' ) )
            // InternalGame.g:1102:1: ( ';' )
            {
            // InternalGame.g:1102:1: ( ';' )
            // InternalGame.g:1103:2: ';'
            {
             before(grammarAccess.getLevelDefinitionAccess().getSemicolonKeyword_6_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getSemicolonKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group_6__3__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalGame.g:1113:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1117:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalGame.g:1118:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // InternalGame.g:1125:1: rule__Description__Group__0__Impl : ( 'description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1129:1: ( ( 'description' ) )
            // InternalGame.g:1130:1: ( 'description' )
            {
            // InternalGame.g:1130:1: ( 'description' )
            // InternalGame.g:1131:2: 'description'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // InternalGame.g:1140:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1144:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // InternalGame.g:1145:2: rule__Description__Group__1__Impl rule__Description__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Description__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // InternalGame.g:1152:1: rule__Description__Group__1__Impl : ( '=' ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1156:1: ( ( '=' ) )
            // InternalGame.g:1157:1: ( '=' )
            {
            // InternalGame.g:1157:1: ( '=' )
            // InternalGame.g:1158:2: '='
            {
             before(grammarAccess.getDescriptionAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__Description__Group__2"
    // InternalGame.g:1167:1: rule__Description__Group__2 : rule__Description__Group__2__Impl rule__Description__Group__3 ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1171:1: ( rule__Description__Group__2__Impl rule__Description__Group__3 )
            // InternalGame.g:1172:2: rule__Description__Group__2__Impl rule__Description__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Description__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__2"


    // $ANTLR start "rule__Description__Group__2__Impl"
    // InternalGame.g:1179:1: rule__Description__Group__2__Impl : ( ( rule__Description__NameAssignment_2 ) ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1183:1: ( ( ( rule__Description__NameAssignment_2 ) ) )
            // InternalGame.g:1184:1: ( ( rule__Description__NameAssignment_2 ) )
            {
            // InternalGame.g:1184:1: ( ( rule__Description__NameAssignment_2 ) )
            // InternalGame.g:1185:2: ( rule__Description__NameAssignment_2 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_2()); 
            // InternalGame.g:1186:2: ( rule__Description__NameAssignment_2 )
            // InternalGame.g:1186:3: rule__Description__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Description__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__2__Impl"


    // $ANTLR start "rule__Description__Group__3"
    // InternalGame.g:1194:1: rule__Description__Group__3 : rule__Description__Group__3__Impl ;
    public final void rule__Description__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1198:1: ( rule__Description__Group__3__Impl )
            // InternalGame.g:1199:2: rule__Description__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__3"


    // $ANTLR start "rule__Description__Group__3__Impl"
    // InternalGame.g:1205:1: rule__Description__Group__3__Impl : ( ';' ) ;
    public final void rule__Description__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1209:1: ( ( ';' ) )
            // InternalGame.g:1210:1: ( ';' )
            {
            // InternalGame.g:1210:1: ( ';' )
            // InternalGame.g:1211:2: ';'
            {
             before(grammarAccess.getDescriptionAccess().getSemicolonKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__3__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalGame.g:1221:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1225:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalGame.g:1226:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // InternalGame.g:1233:1: rule__Person__Group__0__Impl : ( ( rule__Person__NameAssignment_0 ) ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1237:1: ( ( ( rule__Person__NameAssignment_0 ) ) )
            // InternalGame.g:1238:1: ( ( rule__Person__NameAssignment_0 ) )
            {
            // InternalGame.g:1238:1: ( ( rule__Person__NameAssignment_0 ) )
            // InternalGame.g:1239:2: ( rule__Person__NameAssignment_0 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_0()); 
            // InternalGame.g:1240:2: ( rule__Person__NameAssignment_0 )
            // InternalGame.g:1240:3: rule__Person__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Person__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // InternalGame.g:1248:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1252:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalGame.g:1253:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Person__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // InternalGame.g:1260:1: rule__Person__Group__1__Impl : ( '=' ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1264:1: ( ( '=' ) )
            // InternalGame.g:1265:1: ( '=' )
            {
            // InternalGame.g:1265:1: ( '=' )
            // InternalGame.g:1266:2: '='
            {
             before(grammarAccess.getPersonAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__2"
    // InternalGame.g:1275:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1279:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalGame.g:1280:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Person__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__2"


    // $ANTLR start "rule__Person__Group__2__Impl"
    // InternalGame.g:1287:1: rule__Person__Group__2__Impl : ( '{' ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1291:1: ( ( '{' ) )
            // InternalGame.g:1292:1: ( '{' )
            {
            // InternalGame.g:1292:1: ( '{' )
            // InternalGame.g:1293:2: '{'
            {
             before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__2__Impl"


    // $ANTLR start "rule__Person__Group__3"
    // InternalGame.g:1302:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1306:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalGame.g:1307:2: rule__Person__Group__3__Impl rule__Person__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Person__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__3"


    // $ANTLR start "rule__Person__Group__3__Impl"
    // InternalGame.g:1314:1: rule__Person__Group__3__Impl : ( 'type' ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1318:1: ( ( 'type' ) )
            // InternalGame.g:1319:1: ( 'type' )
            {
            // InternalGame.g:1319:1: ( 'type' )
            // InternalGame.g:1320:2: 'type'
            {
             before(grammarAccess.getPersonAccess().getTypeKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__3__Impl"


    // $ANTLR start "rule__Person__Group__4"
    // InternalGame.g:1329:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1333:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // InternalGame.g:1334:2: rule__Person__Group__4__Impl rule__Person__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Person__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__4"


    // $ANTLR start "rule__Person__Group__4__Impl"
    // InternalGame.g:1341:1: rule__Person__Group__4__Impl : ( '=' ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1345:1: ( ( '=' ) )
            // InternalGame.g:1346:1: ( '=' )
            {
            // InternalGame.g:1346:1: ( '=' )
            // InternalGame.g:1347:2: '='
            {
             before(grammarAccess.getPersonAccess().getEqualsSignKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__4__Impl"


    // $ANTLR start "rule__Person__Group__5"
    // InternalGame.g:1356:1: rule__Person__Group__5 : rule__Person__Group__5__Impl rule__Person__Group__6 ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1360:1: ( rule__Person__Group__5__Impl rule__Person__Group__6 )
            // InternalGame.g:1361:2: rule__Person__Group__5__Impl rule__Person__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Person__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__5"


    // $ANTLR start "rule__Person__Group__5__Impl"
    // InternalGame.g:1368:1: rule__Person__Group__5__Impl : ( ( rule__Person__TypeAssignment_5 ) ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1372:1: ( ( ( rule__Person__TypeAssignment_5 ) ) )
            // InternalGame.g:1373:1: ( ( rule__Person__TypeAssignment_5 ) )
            {
            // InternalGame.g:1373:1: ( ( rule__Person__TypeAssignment_5 ) )
            // InternalGame.g:1374:2: ( rule__Person__TypeAssignment_5 )
            {
             before(grammarAccess.getPersonAccess().getTypeAssignment_5()); 
            // InternalGame.g:1375:2: ( rule__Person__TypeAssignment_5 )
            // InternalGame.g:1375:3: rule__Person__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Person__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__5__Impl"


    // $ANTLR start "rule__Person__Group__6"
    // InternalGame.g:1383:1: rule__Person__Group__6 : rule__Person__Group__6__Impl rule__Person__Group__7 ;
    public final void rule__Person__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1387:1: ( rule__Person__Group__6__Impl rule__Person__Group__7 )
            // InternalGame.g:1388:2: rule__Person__Group__6__Impl rule__Person__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Person__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__6"


    // $ANTLR start "rule__Person__Group__6__Impl"
    // InternalGame.g:1395:1: rule__Person__Group__6__Impl : ( ';' ) ;
    public final void rule__Person__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1399:1: ( ( ';' ) )
            // InternalGame.g:1400:1: ( ';' )
            {
            // InternalGame.g:1400:1: ( ';' )
            // InternalGame.g:1401:2: ';'
            {
             before(grammarAccess.getPersonAccess().getSemicolonKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__6__Impl"


    // $ANTLR start "rule__Person__Group__7"
    // InternalGame.g:1410:1: rule__Person__Group__7 : rule__Person__Group__7__Impl rule__Person__Group__8 ;
    public final void rule__Person__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1414:1: ( rule__Person__Group__7__Impl rule__Person__Group__8 )
            // InternalGame.g:1415:2: rule__Person__Group__7__Impl rule__Person__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__Person__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__7"


    // $ANTLR start "rule__Person__Group__7__Impl"
    // InternalGame.g:1422:1: rule__Person__Group__7__Impl : ( 'response' ) ;
    public final void rule__Person__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1426:1: ( ( 'response' ) )
            // InternalGame.g:1427:1: ( 'response' )
            {
            // InternalGame.g:1427:1: ( 'response' )
            // InternalGame.g:1428:2: 'response'
            {
             before(grammarAccess.getPersonAccess().getResponseKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getResponseKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__7__Impl"


    // $ANTLR start "rule__Person__Group__8"
    // InternalGame.g:1437:1: rule__Person__Group__8 : rule__Person__Group__8__Impl rule__Person__Group__9 ;
    public final void rule__Person__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1441:1: ( rule__Person__Group__8__Impl rule__Person__Group__9 )
            // InternalGame.g:1442:2: rule__Person__Group__8__Impl rule__Person__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__Person__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__8"


    // $ANTLR start "rule__Person__Group__8__Impl"
    // InternalGame.g:1449:1: rule__Person__Group__8__Impl : ( '{' ) ;
    public final void rule__Person__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1453:1: ( ( '{' ) )
            // InternalGame.g:1454:1: ( '{' )
            {
            // InternalGame.g:1454:1: ( '{' )
            // InternalGame.g:1455:2: '{'
            {
             before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__8__Impl"


    // $ANTLR start "rule__Person__Group__9"
    // InternalGame.g:1464:1: rule__Person__Group__9 : rule__Person__Group__9__Impl rule__Person__Group__10 ;
    public final void rule__Person__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1468:1: ( rule__Person__Group__9__Impl rule__Person__Group__10 )
            // InternalGame.g:1469:2: rule__Person__Group__9__Impl rule__Person__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__Person__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__9"


    // $ANTLR start "rule__Person__Group__9__Impl"
    // InternalGame.g:1476:1: rule__Person__Group__9__Impl : ( ( rule__Person__ResponseAssignment_9 )* ) ;
    public final void rule__Person__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1480:1: ( ( ( rule__Person__ResponseAssignment_9 )* ) )
            // InternalGame.g:1481:1: ( ( rule__Person__ResponseAssignment_9 )* )
            {
            // InternalGame.g:1481:1: ( ( rule__Person__ResponseAssignment_9 )* )
            // InternalGame.g:1482:2: ( rule__Person__ResponseAssignment_9 )*
            {
             before(grammarAccess.getPersonAccess().getResponseAssignment_9()); 
            // InternalGame.g:1483:2: ( rule__Person__ResponseAssignment_9 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGame.g:1483:3: rule__Person__ResponseAssignment_9
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Person__ResponseAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPersonAccess().getResponseAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__9__Impl"


    // $ANTLR start "rule__Person__Group__10"
    // InternalGame.g:1491:1: rule__Person__Group__10 : rule__Person__Group__10__Impl rule__Person__Group__11 ;
    public final void rule__Person__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1495:1: ( rule__Person__Group__10__Impl rule__Person__Group__11 )
            // InternalGame.g:1496:2: rule__Person__Group__10__Impl rule__Person__Group__11
            {
            pushFollow(FOLLOW_20);
            rule__Person__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__10"


    // $ANTLR start "rule__Person__Group__10__Impl"
    // InternalGame.g:1503:1: rule__Person__Group__10__Impl : ( '}' ) ;
    public final void rule__Person__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1507:1: ( ( '}' ) )
            // InternalGame.g:1508:1: ( '}' )
            {
            // InternalGame.g:1508:1: ( '}' )
            // InternalGame.g:1509:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__10__Impl"


    // $ANTLR start "rule__Person__Group__11"
    // InternalGame.g:1518:1: rule__Person__Group__11 : rule__Person__Group__11__Impl rule__Person__Group__12 ;
    public final void rule__Person__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1522:1: ( rule__Person__Group__11__Impl rule__Person__Group__12 )
            // InternalGame.g:1523:2: rule__Person__Group__11__Impl rule__Person__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__Person__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__11"


    // $ANTLR start "rule__Person__Group__11__Impl"
    // InternalGame.g:1530:1: rule__Person__Group__11__Impl : ( 'position' ) ;
    public final void rule__Person__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1534:1: ( ( 'position' ) )
            // InternalGame.g:1535:1: ( 'position' )
            {
            // InternalGame.g:1535:1: ( 'position' )
            // InternalGame.g:1536:2: 'position'
            {
             before(grammarAccess.getPersonAccess().getPositionKeyword_11()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getPositionKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__11__Impl"


    // $ANTLR start "rule__Person__Group__12"
    // InternalGame.g:1545:1: rule__Person__Group__12 : rule__Person__Group__12__Impl rule__Person__Group__13 ;
    public final void rule__Person__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1549:1: ( rule__Person__Group__12__Impl rule__Person__Group__13 )
            // InternalGame.g:1550:2: rule__Person__Group__12__Impl rule__Person__Group__13
            {
            pushFollow(FOLLOW_15);
            rule__Person__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__12"


    // $ANTLR start "rule__Person__Group__12__Impl"
    // InternalGame.g:1557:1: rule__Person__Group__12__Impl : ( '=' ) ;
    public final void rule__Person__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1561:1: ( ( '=' ) )
            // InternalGame.g:1562:1: ( '=' )
            {
            // InternalGame.g:1562:1: ( '=' )
            // InternalGame.g:1563:2: '='
            {
             before(grammarAccess.getPersonAccess().getEqualsSignKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getEqualsSignKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__12__Impl"


    // $ANTLR start "rule__Person__Group__13"
    // InternalGame.g:1572:1: rule__Person__Group__13 : rule__Person__Group__13__Impl rule__Person__Group__14 ;
    public final void rule__Person__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1576:1: ( rule__Person__Group__13__Impl rule__Person__Group__14 )
            // InternalGame.g:1577:2: rule__Person__Group__13__Impl rule__Person__Group__14
            {
            pushFollow(FOLLOW_10);
            rule__Person__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__13"


    // $ANTLR start "rule__Person__Group__13__Impl"
    // InternalGame.g:1584:1: rule__Person__Group__13__Impl : ( ( rule__Person__PositionAssignment_13 ) ) ;
    public final void rule__Person__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1588:1: ( ( ( rule__Person__PositionAssignment_13 ) ) )
            // InternalGame.g:1589:1: ( ( rule__Person__PositionAssignment_13 ) )
            {
            // InternalGame.g:1589:1: ( ( rule__Person__PositionAssignment_13 ) )
            // InternalGame.g:1590:2: ( rule__Person__PositionAssignment_13 )
            {
             before(grammarAccess.getPersonAccess().getPositionAssignment_13()); 
            // InternalGame.g:1591:2: ( rule__Person__PositionAssignment_13 )
            // InternalGame.g:1591:3: rule__Person__PositionAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Person__PositionAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getPositionAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__13__Impl"


    // $ANTLR start "rule__Person__Group__14"
    // InternalGame.g:1599:1: rule__Person__Group__14 : rule__Person__Group__14__Impl rule__Person__Group__15 ;
    public final void rule__Person__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1603:1: ( rule__Person__Group__14__Impl rule__Person__Group__15 )
            // InternalGame.g:1604:2: rule__Person__Group__14__Impl rule__Person__Group__15
            {
            pushFollow(FOLLOW_21);
            rule__Person__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__14"


    // $ANTLR start "rule__Person__Group__14__Impl"
    // InternalGame.g:1611:1: rule__Person__Group__14__Impl : ( ';' ) ;
    public final void rule__Person__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1615:1: ( ( ';' ) )
            // InternalGame.g:1616:1: ( ';' )
            {
            // InternalGame.g:1616:1: ( ';' )
            // InternalGame.g:1617:2: ';'
            {
             before(grammarAccess.getPersonAccess().getSemicolonKeyword_14()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getSemicolonKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__14__Impl"


    // $ANTLR start "rule__Person__Group__15"
    // InternalGame.g:1626:1: rule__Person__Group__15 : rule__Person__Group__15__Impl rule__Person__Group__16 ;
    public final void rule__Person__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1630:1: ( rule__Person__Group__15__Impl rule__Person__Group__16 )
            // InternalGame.g:1631:2: rule__Person__Group__15__Impl rule__Person__Group__16
            {
            pushFollow(FOLLOW_9);
            rule__Person__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__15"


    // $ANTLR start "rule__Person__Group__15__Impl"
    // InternalGame.g:1638:1: rule__Person__Group__15__Impl : ( 'action' ) ;
    public final void rule__Person__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1642:1: ( ( 'action' ) )
            // InternalGame.g:1643:1: ( 'action' )
            {
            // InternalGame.g:1643:1: ( 'action' )
            // InternalGame.g:1644:2: 'action'
            {
             before(grammarAccess.getPersonAccess().getActionKeyword_15()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getActionKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__15__Impl"


    // $ANTLR start "rule__Person__Group__16"
    // InternalGame.g:1653:1: rule__Person__Group__16 : rule__Person__Group__16__Impl rule__Person__Group__17 ;
    public final void rule__Person__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1657:1: ( rule__Person__Group__16__Impl rule__Person__Group__17 )
            // InternalGame.g:1658:2: rule__Person__Group__16__Impl rule__Person__Group__17
            {
            pushFollow(FOLLOW_22);
            rule__Person__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__16"


    // $ANTLR start "rule__Person__Group__16__Impl"
    // InternalGame.g:1665:1: rule__Person__Group__16__Impl : ( '=' ) ;
    public final void rule__Person__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1669:1: ( ( '=' ) )
            // InternalGame.g:1670:1: ( '=' )
            {
            // InternalGame.g:1670:1: ( '=' )
            // InternalGame.g:1671:2: '='
            {
             before(grammarAccess.getPersonAccess().getEqualsSignKeyword_16()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getEqualsSignKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__16__Impl"


    // $ANTLR start "rule__Person__Group__17"
    // InternalGame.g:1680:1: rule__Person__Group__17 : rule__Person__Group__17__Impl rule__Person__Group__18 ;
    public final void rule__Person__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1684:1: ( rule__Person__Group__17__Impl rule__Person__Group__18 )
            // InternalGame.g:1685:2: rule__Person__Group__17__Impl rule__Person__Group__18
            {
            pushFollow(FOLLOW_10);
            rule__Person__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__17"


    // $ANTLR start "rule__Person__Group__17__Impl"
    // InternalGame.g:1692:1: rule__Person__Group__17__Impl : ( ( rule__Person__ActionAssignment_17 ) ) ;
    public final void rule__Person__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1696:1: ( ( ( rule__Person__ActionAssignment_17 ) ) )
            // InternalGame.g:1697:1: ( ( rule__Person__ActionAssignment_17 ) )
            {
            // InternalGame.g:1697:1: ( ( rule__Person__ActionAssignment_17 ) )
            // InternalGame.g:1698:2: ( rule__Person__ActionAssignment_17 )
            {
             before(grammarAccess.getPersonAccess().getActionAssignment_17()); 
            // InternalGame.g:1699:2: ( rule__Person__ActionAssignment_17 )
            // InternalGame.g:1699:3: rule__Person__ActionAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__Person__ActionAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getActionAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__17__Impl"


    // $ANTLR start "rule__Person__Group__18"
    // InternalGame.g:1707:1: rule__Person__Group__18 : rule__Person__Group__18__Impl rule__Person__Group__19 ;
    public final void rule__Person__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1711:1: ( rule__Person__Group__18__Impl rule__Person__Group__19 )
            // InternalGame.g:1712:2: rule__Person__Group__18__Impl rule__Person__Group__19
            {
            pushFollow(FOLLOW_23);
            rule__Person__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__18"


    // $ANTLR start "rule__Person__Group__18__Impl"
    // InternalGame.g:1719:1: rule__Person__Group__18__Impl : ( ';' ) ;
    public final void rule__Person__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1723:1: ( ( ';' ) )
            // InternalGame.g:1724:1: ( ';' )
            {
            // InternalGame.g:1724:1: ( ';' )
            // InternalGame.g:1725:2: ';'
            {
             before(grammarAccess.getPersonAccess().getSemicolonKeyword_18()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getSemicolonKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__18__Impl"


    // $ANTLR start "rule__Person__Group__19"
    // InternalGame.g:1734:1: rule__Person__Group__19 : rule__Person__Group__19__Impl rule__Person__Group__20 ;
    public final void rule__Person__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1738:1: ( rule__Person__Group__19__Impl rule__Person__Group__20 )
            // InternalGame.g:1739:2: rule__Person__Group__19__Impl rule__Person__Group__20
            {
            pushFollow(FOLLOW_5);
            rule__Person__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__19"


    // $ANTLR start "rule__Person__Group__19__Impl"
    // InternalGame.g:1746:1: rule__Person__Group__19__Impl : ( 'objects' ) ;
    public final void rule__Person__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1750:1: ( ( 'objects' ) )
            // InternalGame.g:1751:1: ( 'objects' )
            {
            // InternalGame.g:1751:1: ( 'objects' )
            // InternalGame.g:1752:2: 'objects'
            {
             before(grammarAccess.getPersonAccess().getObjectsKeyword_19()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getObjectsKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__19__Impl"


    // $ANTLR start "rule__Person__Group__20"
    // InternalGame.g:1761:1: rule__Person__Group__20 : rule__Person__Group__20__Impl rule__Person__Group__21 ;
    public final void rule__Person__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1765:1: ( rule__Person__Group__20__Impl rule__Person__Group__21 )
            // InternalGame.g:1766:2: rule__Person__Group__20__Impl rule__Person__Group__21
            {
            pushFollow(FOLLOW_4);
            rule__Person__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__20"


    // $ANTLR start "rule__Person__Group__20__Impl"
    // InternalGame.g:1773:1: rule__Person__Group__20__Impl : ( '{' ) ;
    public final void rule__Person__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1777:1: ( ( '{' ) )
            // InternalGame.g:1778:1: ( '{' )
            {
            // InternalGame.g:1778:1: ( '{' )
            // InternalGame.g:1779:2: '{'
            {
             before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_20()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__20__Impl"


    // $ANTLR start "rule__Person__Group__21"
    // InternalGame.g:1788:1: rule__Person__Group__21 : rule__Person__Group__21__Impl rule__Person__Group__22 ;
    public final void rule__Person__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1792:1: ( rule__Person__Group__21__Impl rule__Person__Group__22 )
            // InternalGame.g:1793:2: rule__Person__Group__21__Impl rule__Person__Group__22
            {
            pushFollow(FOLLOW_12);
            rule__Person__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__21"


    // $ANTLR start "rule__Person__Group__21__Impl"
    // InternalGame.g:1800:1: rule__Person__Group__21__Impl : ( ( rule__Person__ObjectsAssignment_21 ) ) ;
    public final void rule__Person__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1804:1: ( ( ( rule__Person__ObjectsAssignment_21 ) ) )
            // InternalGame.g:1805:1: ( ( rule__Person__ObjectsAssignment_21 ) )
            {
            // InternalGame.g:1805:1: ( ( rule__Person__ObjectsAssignment_21 ) )
            // InternalGame.g:1806:2: ( rule__Person__ObjectsAssignment_21 )
            {
             before(grammarAccess.getPersonAccess().getObjectsAssignment_21()); 
            // InternalGame.g:1807:2: ( rule__Person__ObjectsAssignment_21 )
            // InternalGame.g:1807:3: rule__Person__ObjectsAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__Person__ObjectsAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getObjectsAssignment_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__21__Impl"


    // $ANTLR start "rule__Person__Group__22"
    // InternalGame.g:1815:1: rule__Person__Group__22 : rule__Person__Group__22__Impl rule__Person__Group__23 ;
    public final void rule__Person__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1819:1: ( rule__Person__Group__22__Impl rule__Person__Group__23 )
            // InternalGame.g:1820:2: rule__Person__Group__22__Impl rule__Person__Group__23
            {
            pushFollow(FOLLOW_11);
            rule__Person__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__22"


    // $ANTLR start "rule__Person__Group__22__Impl"
    // InternalGame.g:1827:1: rule__Person__Group__22__Impl : ( '}' ) ;
    public final void rule__Person__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1831:1: ( ( '}' ) )
            // InternalGame.g:1832:1: ( '}' )
            {
            // InternalGame.g:1832:1: ( '}' )
            // InternalGame.g:1833:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_22()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__22__Impl"


    // $ANTLR start "rule__Person__Group__23"
    // InternalGame.g:1842:1: rule__Person__Group__23 : rule__Person__Group__23__Impl rule__Person__Group__24 ;
    public final void rule__Person__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1846:1: ( rule__Person__Group__23__Impl rule__Person__Group__24 )
            // InternalGame.g:1847:2: rule__Person__Group__23__Impl rule__Person__Group__24
            {
            pushFollow(FOLLOW_9);
            rule__Person__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__23"


    // $ANTLR start "rule__Person__Group__23__Impl"
    // InternalGame.g:1854:1: rule__Person__Group__23__Impl : ( 'final' ) ;
    public final void rule__Person__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1858:1: ( ( 'final' ) )
            // InternalGame.g:1859:1: ( 'final' )
            {
            // InternalGame.g:1859:1: ( 'final' )
            // InternalGame.g:1860:2: 'final'
            {
             before(grammarAccess.getPersonAccess().getFinalKeyword_23()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getFinalKeyword_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__23__Impl"


    // $ANTLR start "rule__Person__Group__24"
    // InternalGame.g:1869:1: rule__Person__Group__24 : rule__Person__Group__24__Impl rule__Person__Group__25 ;
    public final void rule__Person__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1873:1: ( rule__Person__Group__24__Impl rule__Person__Group__25 )
            // InternalGame.g:1874:2: rule__Person__Group__24__Impl rule__Person__Group__25
            {
            pushFollow(FOLLOW_4);
            rule__Person__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__24"


    // $ANTLR start "rule__Person__Group__24__Impl"
    // InternalGame.g:1881:1: rule__Person__Group__24__Impl : ( '=' ) ;
    public final void rule__Person__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1885:1: ( ( '=' ) )
            // InternalGame.g:1886:1: ( '=' )
            {
            // InternalGame.g:1886:1: ( '=' )
            // InternalGame.g:1887:2: '='
            {
             before(grammarAccess.getPersonAccess().getEqualsSignKeyword_24()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getEqualsSignKeyword_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__24__Impl"


    // $ANTLR start "rule__Person__Group__25"
    // InternalGame.g:1896:1: rule__Person__Group__25 : rule__Person__Group__25__Impl rule__Person__Group__26 ;
    public final void rule__Person__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1900:1: ( rule__Person__Group__25__Impl rule__Person__Group__26 )
            // InternalGame.g:1901:2: rule__Person__Group__25__Impl rule__Person__Group__26
            {
            pushFollow(FOLLOW_10);
            rule__Person__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__25"


    // $ANTLR start "rule__Person__Group__25__Impl"
    // InternalGame.g:1908:1: rule__Person__Group__25__Impl : ( ( rule__Person__FinalObjectAssignment_25 ) ) ;
    public final void rule__Person__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1912:1: ( ( ( rule__Person__FinalObjectAssignment_25 ) ) )
            // InternalGame.g:1913:1: ( ( rule__Person__FinalObjectAssignment_25 ) )
            {
            // InternalGame.g:1913:1: ( ( rule__Person__FinalObjectAssignment_25 ) )
            // InternalGame.g:1914:2: ( rule__Person__FinalObjectAssignment_25 )
            {
             before(grammarAccess.getPersonAccess().getFinalObjectAssignment_25()); 
            // InternalGame.g:1915:2: ( rule__Person__FinalObjectAssignment_25 )
            // InternalGame.g:1915:3: rule__Person__FinalObjectAssignment_25
            {
            pushFollow(FOLLOW_2);
            rule__Person__FinalObjectAssignment_25();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getFinalObjectAssignment_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__25__Impl"


    // $ANTLR start "rule__Person__Group__26"
    // InternalGame.g:1923:1: rule__Person__Group__26 : rule__Person__Group__26__Impl rule__Person__Group__27 ;
    public final void rule__Person__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1927:1: ( rule__Person__Group__26__Impl rule__Person__Group__27 )
            // InternalGame.g:1928:2: rule__Person__Group__26__Impl rule__Person__Group__27
            {
            pushFollow(FOLLOW_12);
            rule__Person__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__27();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__26"


    // $ANTLR start "rule__Person__Group__26__Impl"
    // InternalGame.g:1935:1: rule__Person__Group__26__Impl : ( ';' ) ;
    public final void rule__Person__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1939:1: ( ( ';' ) )
            // InternalGame.g:1940:1: ( ';' )
            {
            // InternalGame.g:1940:1: ( ';' )
            // InternalGame.g:1941:2: ';'
            {
             before(grammarAccess.getPersonAccess().getSemicolonKeyword_26()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getSemicolonKeyword_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__26__Impl"


    // $ANTLR start "rule__Person__Group__27"
    // InternalGame.g:1950:1: rule__Person__Group__27 : rule__Person__Group__27__Impl ;
    public final void rule__Person__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1954:1: ( rule__Person__Group__27__Impl )
            // InternalGame.g:1955:2: rule__Person__Group__27__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__27__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__27"


    // $ANTLR start "rule__Person__Group__27__Impl"
    // InternalGame.g:1961:1: rule__Person__Group__27__Impl : ( '}' ) ;
    public final void rule__Person__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1965:1: ( ( '}' ) )
            // InternalGame.g:1966:1: ( '}' )
            {
            // InternalGame.g:1966:1: ( '}' )
            // InternalGame.g:1967:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_27()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__27__Impl"


    // $ANTLR start "rule__Person_R__Group__0"
    // InternalGame.g:1977:1: rule__Person_R__Group__0 : rule__Person_R__Group__0__Impl rule__Person_R__Group__1 ;
    public final void rule__Person_R__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1981:1: ( rule__Person_R__Group__0__Impl rule__Person_R__Group__1 )
            // InternalGame.g:1982:2: rule__Person_R__Group__0__Impl rule__Person_R__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Person_R__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person_R__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person_R__Group__0"


    // $ANTLR start "rule__Person_R__Group__0__Impl"
    // InternalGame.g:1989:1: rule__Person_R__Group__0__Impl : ( RULE_STRING ) ;
    public final void rule__Person_R__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1993:1: ( ( RULE_STRING ) )
            // InternalGame.g:1994:1: ( RULE_STRING )
            {
            // InternalGame.g:1994:1: ( RULE_STRING )
            // InternalGame.g:1995:2: RULE_STRING
            {
             before(grammarAccess.getPerson_RAccess().getSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPerson_RAccess().getSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person_R__Group__0__Impl"


    // $ANTLR start "rule__Person_R__Group__1"
    // InternalGame.g:2004:1: rule__Person_R__Group__1 : rule__Person_R__Group__1__Impl ;
    public final void rule__Person_R__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2008:1: ( rule__Person_R__Group__1__Impl )
            // InternalGame.g:2009:2: rule__Person_R__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person_R__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person_R__Group__1"


    // $ANTLR start "rule__Person_R__Group__1__Impl"
    // InternalGame.g:2015:1: rule__Person_R__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__Person_R__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2019:1: ( ( ( ',' )? ) )
            // InternalGame.g:2020:1: ( ( ',' )? )
            {
            // InternalGame.g:2020:1: ( ( ',' )? )
            // InternalGame.g:2021:2: ( ',' )?
            {
             before(grammarAccess.getPerson_RAccess().getCommaKeyword_1()); 
            // InternalGame.g:2022:2: ( ',' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGame.g:2022:3: ','
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPerson_RAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person_R__Group__1__Impl"


    // $ANTLR start "rule__Person_O__Group__0"
    // InternalGame.g:2031:1: rule__Person_O__Group__0 : rule__Person_O__Group__0__Impl rule__Person_O__Group__1 ;
    public final void rule__Person_O__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2035:1: ( rule__Person_O__Group__0__Impl rule__Person_O__Group__1 )
            // InternalGame.g:2036:2: rule__Person_O__Group__0__Impl rule__Person_O__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Person_O__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person_O__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person_O__Group__0"


    // $ANTLR start "rule__Person_O__Group__0__Impl"
    // InternalGame.g:2043:1: rule__Person_O__Group__0__Impl : ( ( rule__Person_O__ItemsAssignment_0 ) ) ;
    public final void rule__Person_O__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2047:1: ( ( ( rule__Person_O__ItemsAssignment_0 ) ) )
            // InternalGame.g:2048:1: ( ( rule__Person_O__ItemsAssignment_0 ) )
            {
            // InternalGame.g:2048:1: ( ( rule__Person_O__ItemsAssignment_0 ) )
            // InternalGame.g:2049:2: ( rule__Person_O__ItemsAssignment_0 )
            {
             before(grammarAccess.getPerson_OAccess().getItemsAssignment_0()); 
            // InternalGame.g:2050:2: ( rule__Person_O__ItemsAssignment_0 )
            // InternalGame.g:2050:3: rule__Person_O__ItemsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Person_O__ItemsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPerson_OAccess().getItemsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person_O__Group__0__Impl"


    // $ANTLR start "rule__Person_O__Group__1"
    // InternalGame.g:2058:1: rule__Person_O__Group__1 : rule__Person_O__Group__1__Impl ;
    public final void rule__Person_O__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2062:1: ( rule__Person_O__Group__1__Impl )
            // InternalGame.g:2063:2: rule__Person_O__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person_O__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person_O__Group__1"


    // $ANTLR start "rule__Person_O__Group__1__Impl"
    // InternalGame.g:2069:1: rule__Person_O__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__Person_O__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2073:1: ( ( ( ',' )? ) )
            // InternalGame.g:2074:1: ( ( ',' )? )
            {
            // InternalGame.g:2074:1: ( ( ',' )? )
            // InternalGame.g:2075:2: ( ',' )?
            {
             before(grammarAccess.getPerson_OAccess().getCommaKeyword_1()); 
            // InternalGame.g:2076:2: ( ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGame.g:2076:3: ','
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPerson_OAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person_O__Group__1__Impl"


    // $ANTLR start "rule__Object__Group__0"
    // InternalGame.g:2085:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2089:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalGame.g:2090:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Object__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0"


    // $ANTLR start "rule__Object__Group__0__Impl"
    // InternalGame.g:2097:1: rule__Object__Group__0__Impl : ( ( rule__Object__NameAssignment_0 ) ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2101:1: ( ( ( rule__Object__NameAssignment_0 ) ) )
            // InternalGame.g:2102:1: ( ( rule__Object__NameAssignment_0 ) )
            {
            // InternalGame.g:2102:1: ( ( rule__Object__NameAssignment_0 ) )
            // InternalGame.g:2103:2: ( rule__Object__NameAssignment_0 )
            {
             before(grammarAccess.getObjectAccess().getNameAssignment_0()); 
            // InternalGame.g:2104:2: ( rule__Object__NameAssignment_0 )
            // InternalGame.g:2104:3: rule__Object__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Object__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0__Impl"


    // $ANTLR start "rule__Object__Group__1"
    // InternalGame.g:2112:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2116:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalGame.g:2117:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Object__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1"


    // $ANTLR start "rule__Object__Group__1__Impl"
    // InternalGame.g:2124:1: rule__Object__Group__1__Impl : ( '=' ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2128:1: ( ( '=' ) )
            // InternalGame.g:2129:1: ( '=' )
            {
            // InternalGame.g:2129:1: ( '=' )
            // InternalGame.g:2130:2: '='
            {
             before(grammarAccess.getObjectAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1__Impl"


    // $ANTLR start "rule__Object__Group__2"
    // InternalGame.g:2139:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2143:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalGame.g:2144:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Object__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2"


    // $ANTLR start "rule__Object__Group__2__Impl"
    // InternalGame.g:2151:1: rule__Object__Group__2__Impl : ( '{' ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2155:1: ( ( '{' ) )
            // InternalGame.g:2156:1: ( '{' )
            {
            // InternalGame.g:2156:1: ( '{' )
            // InternalGame.g:2157:2: '{'
            {
             before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2__Impl"


    // $ANTLR start "rule__Object__Group__3"
    // InternalGame.g:2166:1: rule__Object__Group__3 : rule__Object__Group__3__Impl rule__Object__Group__4 ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2170:1: ( rule__Object__Group__3__Impl rule__Object__Group__4 )
            // InternalGame.g:2171:2: rule__Object__Group__3__Impl rule__Object__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Object__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3"


    // $ANTLR start "rule__Object__Group__3__Impl"
    // InternalGame.g:2178:1: rule__Object__Group__3__Impl : ( 'type' ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2182:1: ( ( 'type' ) )
            // InternalGame.g:2183:1: ( 'type' )
            {
            // InternalGame.g:2183:1: ( 'type' )
            // InternalGame.g:2184:2: 'type'
            {
             before(grammarAccess.getObjectAccess().getTypeKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3__Impl"


    // $ANTLR start "rule__Object__Group__4"
    // InternalGame.g:2193:1: rule__Object__Group__4 : rule__Object__Group__4__Impl rule__Object__Group__5 ;
    public final void rule__Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2197:1: ( rule__Object__Group__4__Impl rule__Object__Group__5 )
            // InternalGame.g:2198:2: rule__Object__Group__4__Impl rule__Object__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Object__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__4"


    // $ANTLR start "rule__Object__Group__4__Impl"
    // InternalGame.g:2205:1: rule__Object__Group__4__Impl : ( '=' ) ;
    public final void rule__Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2209:1: ( ( '=' ) )
            // InternalGame.g:2210:1: ( '=' )
            {
            // InternalGame.g:2210:1: ( '=' )
            // InternalGame.g:2211:2: '='
            {
             before(grammarAccess.getObjectAccess().getEqualsSignKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__4__Impl"


    // $ANTLR start "rule__Object__Group__5"
    // InternalGame.g:2220:1: rule__Object__Group__5 : rule__Object__Group__5__Impl rule__Object__Group__6 ;
    public final void rule__Object__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2224:1: ( rule__Object__Group__5__Impl rule__Object__Group__6 )
            // InternalGame.g:2225:2: rule__Object__Group__5__Impl rule__Object__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Object__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__5"


    // $ANTLR start "rule__Object__Group__5__Impl"
    // InternalGame.g:2232:1: rule__Object__Group__5__Impl : ( ( rule__Object__TypeAssignment_5 ) ) ;
    public final void rule__Object__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2236:1: ( ( ( rule__Object__TypeAssignment_5 ) ) )
            // InternalGame.g:2237:1: ( ( rule__Object__TypeAssignment_5 ) )
            {
            // InternalGame.g:2237:1: ( ( rule__Object__TypeAssignment_5 ) )
            // InternalGame.g:2238:2: ( rule__Object__TypeAssignment_5 )
            {
             before(grammarAccess.getObjectAccess().getTypeAssignment_5()); 
            // InternalGame.g:2239:2: ( rule__Object__TypeAssignment_5 )
            // InternalGame.g:2239:3: rule__Object__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Object__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__5__Impl"


    // $ANTLR start "rule__Object__Group__6"
    // InternalGame.g:2247:1: rule__Object__Group__6 : rule__Object__Group__6__Impl rule__Object__Group__7 ;
    public final void rule__Object__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2251:1: ( rule__Object__Group__6__Impl rule__Object__Group__7 )
            // InternalGame.g:2252:2: rule__Object__Group__6__Impl rule__Object__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Object__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__6"


    // $ANTLR start "rule__Object__Group__6__Impl"
    // InternalGame.g:2259:1: rule__Object__Group__6__Impl : ( ';' ) ;
    public final void rule__Object__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2263:1: ( ( ';' ) )
            // InternalGame.g:2264:1: ( ';' )
            {
            // InternalGame.g:2264:1: ( ';' )
            // InternalGame.g:2265:2: ';'
            {
             before(grammarAccess.getObjectAccess().getSemicolonKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__6__Impl"


    // $ANTLR start "rule__Object__Group__7"
    // InternalGame.g:2274:1: rule__Object__Group__7 : rule__Object__Group__7__Impl rule__Object__Group__8 ;
    public final void rule__Object__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2278:1: ( rule__Object__Group__7__Impl rule__Object__Group__8 )
            // InternalGame.g:2279:2: rule__Object__Group__7__Impl rule__Object__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Object__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__7"


    // $ANTLR start "rule__Object__Group__7__Impl"
    // InternalGame.g:2286:1: rule__Object__Group__7__Impl : ( 'response' ) ;
    public final void rule__Object__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2290:1: ( ( 'response' ) )
            // InternalGame.g:2291:1: ( 'response' )
            {
            // InternalGame.g:2291:1: ( 'response' )
            // InternalGame.g:2292:2: 'response'
            {
             before(grammarAccess.getObjectAccess().getResponseKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getResponseKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__7__Impl"


    // $ANTLR start "rule__Object__Group__8"
    // InternalGame.g:2301:1: rule__Object__Group__8 : rule__Object__Group__8__Impl rule__Object__Group__9 ;
    public final void rule__Object__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2305:1: ( rule__Object__Group__8__Impl rule__Object__Group__9 )
            // InternalGame.g:2306:2: rule__Object__Group__8__Impl rule__Object__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Object__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__8"


    // $ANTLR start "rule__Object__Group__8__Impl"
    // InternalGame.g:2313:1: rule__Object__Group__8__Impl : ( '=' ) ;
    public final void rule__Object__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2317:1: ( ( '=' ) )
            // InternalGame.g:2318:1: ( '=' )
            {
            // InternalGame.g:2318:1: ( '=' )
            // InternalGame.g:2319:2: '='
            {
             before(grammarAccess.getObjectAccess().getEqualsSignKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getEqualsSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__8__Impl"


    // $ANTLR start "rule__Object__Group__9"
    // InternalGame.g:2328:1: rule__Object__Group__9 : rule__Object__Group__9__Impl rule__Object__Group__10 ;
    public final void rule__Object__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2332:1: ( rule__Object__Group__9__Impl rule__Object__Group__10 )
            // InternalGame.g:2333:2: rule__Object__Group__9__Impl rule__Object__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Object__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__9"


    // $ANTLR start "rule__Object__Group__9__Impl"
    // InternalGame.g:2340:1: rule__Object__Group__9__Impl : ( ( rule__Object__ResponseAssignment_9 ) ) ;
    public final void rule__Object__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2344:1: ( ( ( rule__Object__ResponseAssignment_9 ) ) )
            // InternalGame.g:2345:1: ( ( rule__Object__ResponseAssignment_9 ) )
            {
            // InternalGame.g:2345:1: ( ( rule__Object__ResponseAssignment_9 ) )
            // InternalGame.g:2346:2: ( rule__Object__ResponseAssignment_9 )
            {
             before(grammarAccess.getObjectAccess().getResponseAssignment_9()); 
            // InternalGame.g:2347:2: ( rule__Object__ResponseAssignment_9 )
            // InternalGame.g:2347:3: rule__Object__ResponseAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Object__ResponseAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getResponseAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__9__Impl"


    // $ANTLR start "rule__Object__Group__10"
    // InternalGame.g:2355:1: rule__Object__Group__10 : rule__Object__Group__10__Impl rule__Object__Group__11 ;
    public final void rule__Object__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2359:1: ( rule__Object__Group__10__Impl rule__Object__Group__11 )
            // InternalGame.g:2360:2: rule__Object__Group__10__Impl rule__Object__Group__11
            {
            pushFollow(FOLLOW_20);
            rule__Object__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__10"


    // $ANTLR start "rule__Object__Group__10__Impl"
    // InternalGame.g:2367:1: rule__Object__Group__10__Impl : ( ';' ) ;
    public final void rule__Object__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2371:1: ( ( ';' ) )
            // InternalGame.g:2372:1: ( ';' )
            {
            // InternalGame.g:2372:1: ( ';' )
            // InternalGame.g:2373:2: ';'
            {
             before(grammarAccess.getObjectAccess().getSemicolonKeyword_10()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__10__Impl"


    // $ANTLR start "rule__Object__Group__11"
    // InternalGame.g:2382:1: rule__Object__Group__11 : rule__Object__Group__11__Impl rule__Object__Group__12 ;
    public final void rule__Object__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2386:1: ( rule__Object__Group__11__Impl rule__Object__Group__12 )
            // InternalGame.g:2387:2: rule__Object__Group__11__Impl rule__Object__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__Object__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__11"


    // $ANTLR start "rule__Object__Group__11__Impl"
    // InternalGame.g:2394:1: rule__Object__Group__11__Impl : ( 'position' ) ;
    public final void rule__Object__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2398:1: ( ( 'position' ) )
            // InternalGame.g:2399:1: ( 'position' )
            {
            // InternalGame.g:2399:1: ( 'position' )
            // InternalGame.g:2400:2: 'position'
            {
             before(grammarAccess.getObjectAccess().getPositionKeyword_11()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getPositionKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__11__Impl"


    // $ANTLR start "rule__Object__Group__12"
    // InternalGame.g:2409:1: rule__Object__Group__12 : rule__Object__Group__12__Impl rule__Object__Group__13 ;
    public final void rule__Object__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2413:1: ( rule__Object__Group__12__Impl rule__Object__Group__13 )
            // InternalGame.g:2414:2: rule__Object__Group__12__Impl rule__Object__Group__13
            {
            pushFollow(FOLLOW_15);
            rule__Object__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__12"


    // $ANTLR start "rule__Object__Group__12__Impl"
    // InternalGame.g:2421:1: rule__Object__Group__12__Impl : ( '=' ) ;
    public final void rule__Object__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2425:1: ( ( '=' ) )
            // InternalGame.g:2426:1: ( '=' )
            {
            // InternalGame.g:2426:1: ( '=' )
            // InternalGame.g:2427:2: '='
            {
             before(grammarAccess.getObjectAccess().getEqualsSignKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getEqualsSignKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__12__Impl"


    // $ANTLR start "rule__Object__Group__13"
    // InternalGame.g:2436:1: rule__Object__Group__13 : rule__Object__Group__13__Impl rule__Object__Group__14 ;
    public final void rule__Object__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2440:1: ( rule__Object__Group__13__Impl rule__Object__Group__14 )
            // InternalGame.g:2441:2: rule__Object__Group__13__Impl rule__Object__Group__14
            {
            pushFollow(FOLLOW_10);
            rule__Object__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__13"


    // $ANTLR start "rule__Object__Group__13__Impl"
    // InternalGame.g:2448:1: rule__Object__Group__13__Impl : ( ( rule__Object__PositionAssignment_13 ) ) ;
    public final void rule__Object__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2452:1: ( ( ( rule__Object__PositionAssignment_13 ) ) )
            // InternalGame.g:2453:1: ( ( rule__Object__PositionAssignment_13 ) )
            {
            // InternalGame.g:2453:1: ( ( rule__Object__PositionAssignment_13 ) )
            // InternalGame.g:2454:2: ( rule__Object__PositionAssignment_13 )
            {
             before(grammarAccess.getObjectAccess().getPositionAssignment_13()); 
            // InternalGame.g:2455:2: ( rule__Object__PositionAssignment_13 )
            // InternalGame.g:2455:3: rule__Object__PositionAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Object__PositionAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getPositionAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__13__Impl"


    // $ANTLR start "rule__Object__Group__14"
    // InternalGame.g:2463:1: rule__Object__Group__14 : rule__Object__Group__14__Impl rule__Object__Group__15 ;
    public final void rule__Object__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2467:1: ( rule__Object__Group__14__Impl rule__Object__Group__15 )
            // InternalGame.g:2468:2: rule__Object__Group__14__Impl rule__Object__Group__15
            {
            pushFollow(FOLLOW_21);
            rule__Object__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__14"


    // $ANTLR start "rule__Object__Group__14__Impl"
    // InternalGame.g:2475:1: rule__Object__Group__14__Impl : ( ';' ) ;
    public final void rule__Object__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2479:1: ( ( ';' ) )
            // InternalGame.g:2480:1: ( ';' )
            {
            // InternalGame.g:2480:1: ( ';' )
            // InternalGame.g:2481:2: ';'
            {
             before(grammarAccess.getObjectAccess().getSemicolonKeyword_14()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getSemicolonKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__14__Impl"


    // $ANTLR start "rule__Object__Group__15"
    // InternalGame.g:2490:1: rule__Object__Group__15 : rule__Object__Group__15__Impl rule__Object__Group__16 ;
    public final void rule__Object__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2494:1: ( rule__Object__Group__15__Impl rule__Object__Group__16 )
            // InternalGame.g:2495:2: rule__Object__Group__15__Impl rule__Object__Group__16
            {
            pushFollow(FOLLOW_9);
            rule__Object__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__15"


    // $ANTLR start "rule__Object__Group__15__Impl"
    // InternalGame.g:2502:1: rule__Object__Group__15__Impl : ( 'action' ) ;
    public final void rule__Object__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2506:1: ( ( 'action' ) )
            // InternalGame.g:2507:1: ( 'action' )
            {
            // InternalGame.g:2507:1: ( 'action' )
            // InternalGame.g:2508:2: 'action'
            {
             before(grammarAccess.getObjectAccess().getActionKeyword_15()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getActionKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__15__Impl"


    // $ANTLR start "rule__Object__Group__16"
    // InternalGame.g:2517:1: rule__Object__Group__16 : rule__Object__Group__16__Impl rule__Object__Group__17 ;
    public final void rule__Object__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2521:1: ( rule__Object__Group__16__Impl rule__Object__Group__17 )
            // InternalGame.g:2522:2: rule__Object__Group__16__Impl rule__Object__Group__17
            {
            pushFollow(FOLLOW_25);
            rule__Object__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__16"


    // $ANTLR start "rule__Object__Group__16__Impl"
    // InternalGame.g:2529:1: rule__Object__Group__16__Impl : ( '=' ) ;
    public final void rule__Object__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2533:1: ( ( '=' ) )
            // InternalGame.g:2534:1: ( '=' )
            {
            // InternalGame.g:2534:1: ( '=' )
            // InternalGame.g:2535:2: '='
            {
             before(grammarAccess.getObjectAccess().getEqualsSignKeyword_16()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getEqualsSignKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__16__Impl"


    // $ANTLR start "rule__Object__Group__17"
    // InternalGame.g:2544:1: rule__Object__Group__17 : rule__Object__Group__17__Impl rule__Object__Group__18 ;
    public final void rule__Object__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2548:1: ( rule__Object__Group__17__Impl rule__Object__Group__18 )
            // InternalGame.g:2549:2: rule__Object__Group__17__Impl rule__Object__Group__18
            {
            pushFollow(FOLLOW_10);
            rule__Object__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__17"


    // $ANTLR start "rule__Object__Group__17__Impl"
    // InternalGame.g:2556:1: rule__Object__Group__17__Impl : ( ( rule__Object__ActionAssignment_17 ) ) ;
    public final void rule__Object__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2560:1: ( ( ( rule__Object__ActionAssignment_17 ) ) )
            // InternalGame.g:2561:1: ( ( rule__Object__ActionAssignment_17 ) )
            {
            // InternalGame.g:2561:1: ( ( rule__Object__ActionAssignment_17 ) )
            // InternalGame.g:2562:2: ( rule__Object__ActionAssignment_17 )
            {
             before(grammarAccess.getObjectAccess().getActionAssignment_17()); 
            // InternalGame.g:2563:2: ( rule__Object__ActionAssignment_17 )
            // InternalGame.g:2563:3: rule__Object__ActionAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__Object__ActionAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getActionAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__17__Impl"


    // $ANTLR start "rule__Object__Group__18"
    // InternalGame.g:2571:1: rule__Object__Group__18 : rule__Object__Group__18__Impl rule__Object__Group__19 ;
    public final void rule__Object__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2575:1: ( rule__Object__Group__18__Impl rule__Object__Group__19 )
            // InternalGame.g:2576:2: rule__Object__Group__18__Impl rule__Object__Group__19
            {
            pushFollow(FOLLOW_12);
            rule__Object__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__18"


    // $ANTLR start "rule__Object__Group__18__Impl"
    // InternalGame.g:2583:1: rule__Object__Group__18__Impl : ( ';' ) ;
    public final void rule__Object__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2587:1: ( ( ';' ) )
            // InternalGame.g:2588:1: ( ';' )
            {
            // InternalGame.g:2588:1: ( ';' )
            // InternalGame.g:2589:2: ';'
            {
             before(grammarAccess.getObjectAccess().getSemicolonKeyword_18()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getSemicolonKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__18__Impl"


    // $ANTLR start "rule__Object__Group__19"
    // InternalGame.g:2598:1: rule__Object__Group__19 : rule__Object__Group__19__Impl ;
    public final void rule__Object__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2602:1: ( rule__Object__Group__19__Impl )
            // InternalGame.g:2603:2: rule__Object__Group__19__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__19__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__19"


    // $ANTLR start "rule__Object__Group__19__Impl"
    // InternalGame.g:2609:1: rule__Object__Group__19__Impl : ( '}' ) ;
    public final void rule__Object__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2613:1: ( ( '}' ) )
            // InternalGame.g:2614:1: ( '}' )
            {
            // InternalGame.g:2614:1: ( '}' )
            // InternalGame.g:2615:2: '}'
            {
             before(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_19()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__19__Impl"


    // $ANTLR start "rule__Game__ScenesAssignment"
    // InternalGame.g:2625:1: rule__Game__ScenesAssignment : ( ruleScene ) ;
    public final void rule__Game__ScenesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2629:1: ( ( ruleScene ) )
            // InternalGame.g:2630:2: ( ruleScene )
            {
            // InternalGame.g:2630:2: ( ruleScene )
            // InternalGame.g:2631:3: ruleScene
            {
             before(grammarAccess.getGameAccess().getScenesSceneParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleScene();

            state._fsp--;

             after(grammarAccess.getGameAccess().getScenesSceneParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__ScenesAssignment"


    // $ANTLR start "rule__Scene__NameAssignment_1"
    // InternalGame.g:2640:1: rule__Scene__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Scene__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2644:1: ( ( RULE_ID ) )
            // InternalGame.g:2645:2: ( RULE_ID )
            {
            // InternalGame.g:2645:2: ( RULE_ID )
            // InternalGame.g:2646:3: RULE_ID
            {
             before(grammarAccess.getSceneAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__NameAssignment_1"


    // $ANTLR start "rule__Scene__DeclartionsAssignment_3"
    // InternalGame.g:2655:1: rule__Scene__DeclartionsAssignment_3 : ( ruleLevelDeclaration ) ;
    public final void rule__Scene__DeclartionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2659:1: ( ( ruleLevelDeclaration ) )
            // InternalGame.g:2660:2: ( ruleLevelDeclaration )
            {
            // InternalGame.g:2660:2: ( ruleLevelDeclaration )
            // InternalGame.g:2661:3: ruleLevelDeclaration
            {
             before(grammarAccess.getSceneAccess().getDeclartionsLevelDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLevelDeclaration();

            state._fsp--;

             after(grammarAccess.getSceneAccess().getDeclartionsLevelDeclarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__DeclartionsAssignment_3"


    // $ANTLR start "rule__Scene__DefinitionsAssignment_4"
    // InternalGame.g:2670:1: rule__Scene__DefinitionsAssignment_4 : ( ruleLevelDefinition ) ;
    public final void rule__Scene__DefinitionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2674:1: ( ( ruleLevelDefinition ) )
            // InternalGame.g:2675:2: ( ruleLevelDefinition )
            {
            // InternalGame.g:2675:2: ( ruleLevelDefinition )
            // InternalGame.g:2676:3: ruleLevelDefinition
            {
             before(grammarAccess.getSceneAccess().getDefinitionsLevelDefinitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLevelDefinition();

            state._fsp--;

             after(grammarAccess.getSceneAccess().getDefinitionsLevelDefinitionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__DefinitionsAssignment_4"


    // $ANTLR start "rule__Scene__StartLevelAssignment_7"
    // InternalGame.g:2685:1: rule__Scene__StartLevelAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Scene__StartLevelAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2689:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2690:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2690:2: ( ( RULE_ID ) )
            // InternalGame.g:2691:3: ( RULE_ID )
            {
             before(grammarAccess.getSceneAccess().getStartLevelLevelDeclarationCrossReference_7_0()); 
            // InternalGame.g:2692:3: ( RULE_ID )
            // InternalGame.g:2693:4: RULE_ID
            {
             before(grammarAccess.getSceneAccess().getStartLevelLevelDeclarationIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getStartLevelLevelDeclarationIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getSceneAccess().getStartLevelLevelDeclarationCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__StartLevelAssignment_7"


    // $ANTLR start "rule__Scene__FinalLevelAssignment_11"
    // InternalGame.g:2704:1: rule__Scene__FinalLevelAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__Scene__FinalLevelAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2708:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2709:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2709:2: ( ( RULE_ID ) )
            // InternalGame.g:2710:3: ( RULE_ID )
            {
             before(grammarAccess.getSceneAccess().getFinalLevelLevelDeclarationCrossReference_11_0()); 
            // InternalGame.g:2711:3: ( RULE_ID )
            // InternalGame.g:2712:4: RULE_ID
            {
             before(grammarAccess.getSceneAccess().getFinalLevelLevelDeclarationIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getFinalLevelLevelDeclarationIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getSceneAccess().getFinalLevelLevelDeclarationCrossReference_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__FinalLevelAssignment_11"


    // $ANTLR start "rule__LevelDeclaration__NameAssignment_1"
    // InternalGame.g:2723:1: rule__LevelDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LevelDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2727:1: ( ( RULE_ID ) )
            // InternalGame.g:2728:2: ( RULE_ID )
            {
            // InternalGame.g:2728:2: ( RULE_ID )
            // InternalGame.g:2729:3: RULE_ID
            {
             before(grammarAccess.getLevelDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLevelDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDeclaration__NameAssignment_1"


    // $ANTLR start "rule__LevelDefinition__NameAssignment_0"
    // InternalGame.g:2738:1: rule__LevelDefinition__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__LevelDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2742:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2743:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2743:2: ( ( RULE_ID ) )
            // InternalGame.g:2744:3: ( RULE_ID )
            {
             before(grammarAccess.getLevelDefinitionAccess().getNameLevelDeclarationCrossReference_0_0()); 
            // InternalGame.g:2745:3: ( RULE_ID )
            // InternalGame.g:2746:4: RULE_ID
            {
             before(grammarAccess.getLevelDefinitionAccess().getNameLevelDeclarationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getNameLevelDeclarationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getLevelDefinitionAccess().getNameLevelDeclarationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__NameAssignment_0"


    // $ANTLR start "rule__LevelDefinition__DescriptionAssignment_3"
    // InternalGame.g:2757:1: rule__LevelDefinition__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__LevelDefinition__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2761:1: ( ( ruleDescription ) )
            // InternalGame.g:2762:2: ( ruleDescription )
            {
            // InternalGame.g:2762:2: ( ruleDescription )
            // InternalGame.g:2763:3: ruleDescription
            {
             before(grammarAccess.getLevelDefinitionAccess().getDescriptionDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getLevelDefinitionAccess().getDescriptionDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__DescriptionAssignment_3"


    // $ANTLR start "rule__LevelDefinition__PersonsAssignment_4"
    // InternalGame.g:2772:1: rule__LevelDefinition__PersonsAssignment_4 : ( rulePerson ) ;
    public final void rule__LevelDefinition__PersonsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2776:1: ( ( rulePerson ) )
            // InternalGame.g:2777:2: ( rulePerson )
            {
            // InternalGame.g:2777:2: ( rulePerson )
            // InternalGame.g:2778:3: rulePerson
            {
             before(grammarAccess.getLevelDefinitionAccess().getPersonsPersonParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getLevelDefinitionAccess().getPersonsPersonParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__PersonsAssignment_4"


    // $ANTLR start "rule__LevelDefinition__ObjectsAssignment_5"
    // InternalGame.g:2787:1: rule__LevelDefinition__ObjectsAssignment_5 : ( ruleObject ) ;
    public final void rule__LevelDefinition__ObjectsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2791:1: ( ( ruleObject ) )
            // InternalGame.g:2792:2: ( ruleObject )
            {
            // InternalGame.g:2792:2: ( ruleObject )
            // InternalGame.g:2793:3: ruleObject
            {
             before(grammarAccess.getLevelDefinitionAccess().getObjectsObjectParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getLevelDefinitionAccess().getObjectsObjectParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__ObjectsAssignment_5"


    // $ANTLR start "rule__LevelDefinition__NextAssignment_6_2"
    // InternalGame.g:2802:1: rule__LevelDefinition__NextAssignment_6_2 : ( ( RULE_ID ) ) ;
    public final void rule__LevelDefinition__NextAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2806:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2807:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2807:2: ( ( RULE_ID ) )
            // InternalGame.g:2808:3: ( RULE_ID )
            {
             before(grammarAccess.getLevelDefinitionAccess().getNextLevelDeclarationCrossReference_6_2_0()); 
            // InternalGame.g:2809:3: ( RULE_ID )
            // InternalGame.g:2810:4: RULE_ID
            {
             before(grammarAccess.getLevelDefinitionAccess().getNextLevelDeclarationIDTerminalRuleCall_6_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getNextLevelDeclarationIDTerminalRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getLevelDefinitionAccess().getNextLevelDeclarationCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__NextAssignment_6_2"


    // $ANTLR start "rule__Description__NameAssignment_2"
    // InternalGame.g:2821:1: rule__Description__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Description__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2825:1: ( ( RULE_STRING ) )
            // InternalGame.g:2826:2: ( RULE_STRING )
            {
            // InternalGame.g:2826:2: ( RULE_STRING )
            // InternalGame.g:2827:3: RULE_STRING
            {
             before(grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__NameAssignment_2"


    // $ANTLR start "rule__Person__NameAssignment_0"
    // InternalGame.g:2836:1: rule__Person__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Person__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2840:1: ( ( RULE_ID ) )
            // InternalGame.g:2841:2: ( RULE_ID )
            {
            // InternalGame.g:2841:2: ( RULE_ID )
            // InternalGame.g:2842:3: RULE_ID
            {
             before(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__NameAssignment_0"


    // $ANTLR start "rule__Person__TypeAssignment_5"
    // InternalGame.g:2851:1: rule__Person__TypeAssignment_5 : ( RULE_ID ) ;
    public final void rule__Person__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2855:1: ( ( RULE_ID ) )
            // InternalGame.g:2856:2: ( RULE_ID )
            {
            // InternalGame.g:2856:2: ( RULE_ID )
            // InternalGame.g:2857:3: RULE_ID
            {
             before(grammarAccess.getPersonAccess().getTypeIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getTypeIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__TypeAssignment_5"


    // $ANTLR start "rule__Person__ResponseAssignment_9"
    // InternalGame.g:2866:1: rule__Person__ResponseAssignment_9 : ( rulePerson_R ) ;
    public final void rule__Person__ResponseAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2870:1: ( ( rulePerson_R ) )
            // InternalGame.g:2871:2: ( rulePerson_R )
            {
            // InternalGame.g:2871:2: ( rulePerson_R )
            // InternalGame.g:2872:3: rulePerson_R
            {
             before(grammarAccess.getPersonAccess().getResponsePerson_RParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            rulePerson_R();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getResponsePerson_RParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__ResponseAssignment_9"


    // $ANTLR start "rule__Person__PositionAssignment_13"
    // InternalGame.g:2881:1: rule__Person__PositionAssignment_13 : ( RULE_STRING ) ;
    public final void rule__Person__PositionAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2885:1: ( ( RULE_STRING ) )
            // InternalGame.g:2886:2: ( RULE_STRING )
            {
            // InternalGame.g:2886:2: ( RULE_STRING )
            // InternalGame.g:2887:3: RULE_STRING
            {
             before(grammarAccess.getPersonAccess().getPositionSTRINGTerminalRuleCall_13_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getPositionSTRINGTerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__PositionAssignment_13"


    // $ANTLR start "rule__Person__ActionAssignment_17"
    // InternalGame.g:2896:1: rule__Person__ActionAssignment_17 : ( ruleAction_P ) ;
    public final void rule__Person__ActionAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2900:1: ( ( ruleAction_P ) )
            // InternalGame.g:2901:2: ( ruleAction_P )
            {
            // InternalGame.g:2901:2: ( ruleAction_P )
            // InternalGame.g:2902:3: ruleAction_P
            {
             before(grammarAccess.getPersonAccess().getActionAction_PEnumRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleAction_P();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getActionAction_PEnumRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__ActionAssignment_17"


    // $ANTLR start "rule__Person__ObjectsAssignment_21"
    // InternalGame.g:2911:1: rule__Person__ObjectsAssignment_21 : ( rulePerson_O ) ;
    public final void rule__Person__ObjectsAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2915:1: ( ( rulePerson_O ) )
            // InternalGame.g:2916:2: ( rulePerson_O )
            {
            // InternalGame.g:2916:2: ( rulePerson_O )
            // InternalGame.g:2917:3: rulePerson_O
            {
             before(grammarAccess.getPersonAccess().getObjectsPerson_OParserRuleCall_21_0()); 
            pushFollow(FOLLOW_2);
            rulePerson_O();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getObjectsPerson_OParserRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__ObjectsAssignment_21"


    // $ANTLR start "rule__Person__FinalObjectAssignment_25"
    // InternalGame.g:2926:1: rule__Person__FinalObjectAssignment_25 : ( ( RULE_ID ) ) ;
    public final void rule__Person__FinalObjectAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2930:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2931:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2931:2: ( ( RULE_ID ) )
            // InternalGame.g:2932:3: ( RULE_ID )
            {
             before(grammarAccess.getPersonAccess().getFinalObjectObjectCrossReference_25_0()); 
            // InternalGame.g:2933:3: ( RULE_ID )
            // InternalGame.g:2934:4: RULE_ID
            {
             before(grammarAccess.getPersonAccess().getFinalObjectObjectIDTerminalRuleCall_25_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getFinalObjectObjectIDTerminalRuleCall_25_0_1()); 

            }

             after(grammarAccess.getPersonAccess().getFinalObjectObjectCrossReference_25_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__FinalObjectAssignment_25"


    // $ANTLR start "rule__Person_O__ItemsAssignment_0"
    // InternalGame.g:2945:1: rule__Person_O__ItemsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Person_O__ItemsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2949:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2950:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2950:2: ( ( RULE_ID ) )
            // InternalGame.g:2951:3: ( RULE_ID )
            {
             before(grammarAccess.getPerson_OAccess().getItemsObjectCrossReference_0_0()); 
            // InternalGame.g:2952:3: ( RULE_ID )
            // InternalGame.g:2953:4: RULE_ID
            {
             before(grammarAccess.getPerson_OAccess().getItemsObjectIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPerson_OAccess().getItemsObjectIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPerson_OAccess().getItemsObjectCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person_O__ItemsAssignment_0"


    // $ANTLR start "rule__Object__NameAssignment_0"
    // InternalGame.g:2964:1: rule__Object__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Object__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2968:1: ( ( RULE_ID ) )
            // InternalGame.g:2969:2: ( RULE_ID )
            {
            // InternalGame.g:2969:2: ( RULE_ID )
            // InternalGame.g:2970:3: RULE_ID
            {
             before(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__NameAssignment_0"


    // $ANTLR start "rule__Object__TypeAssignment_5"
    // InternalGame.g:2979:1: rule__Object__TypeAssignment_5 : ( RULE_ID ) ;
    public final void rule__Object__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2983:1: ( ( RULE_ID ) )
            // InternalGame.g:2984:2: ( RULE_ID )
            {
            // InternalGame.g:2984:2: ( RULE_ID )
            // InternalGame.g:2985:3: RULE_ID
            {
             before(grammarAccess.getObjectAccess().getTypeIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getTypeIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__TypeAssignment_5"


    // $ANTLR start "rule__Object__ResponseAssignment_9"
    // InternalGame.g:2994:1: rule__Object__ResponseAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Object__ResponseAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2998:1: ( ( RULE_STRING ) )
            // InternalGame.g:2999:2: ( RULE_STRING )
            {
            // InternalGame.g:2999:2: ( RULE_STRING )
            // InternalGame.g:3000:3: RULE_STRING
            {
             before(grammarAccess.getObjectAccess().getResponseSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getResponseSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__ResponseAssignment_9"


    // $ANTLR start "rule__Object__PositionAssignment_13"
    // InternalGame.g:3009:1: rule__Object__PositionAssignment_13 : ( RULE_STRING ) ;
    public final void rule__Object__PositionAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3013:1: ( ( RULE_STRING ) )
            // InternalGame.g:3014:2: ( RULE_STRING )
            {
            // InternalGame.g:3014:2: ( RULE_STRING )
            // InternalGame.g:3015:3: RULE_STRING
            {
             before(grammarAccess.getObjectAccess().getPositionSTRINGTerminalRuleCall_13_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getPositionSTRINGTerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__PositionAssignment_13"


    // $ANTLR start "rule__Object__ActionAssignment_17"
    // InternalGame.g:3024:1: rule__Object__ActionAssignment_17 : ( ruleAction_O ) ;
    public final void rule__Object__ActionAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3028:1: ( ( ruleAction_O ) )
            // InternalGame.g:3029:2: ( ruleAction_O )
            {
            // InternalGame.g:3029:2: ( ruleAction_O )
            // InternalGame.g:3030:3: ruleAction_O
            {
             before(grammarAccess.getObjectAccess().getActionAction_OEnumRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleAction_O();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getActionAction_OEnumRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__ActionAssignment_17"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\5\1\21\1\uffff\1\17\1\30\1\21\1\5\1\22\1\31\1\17\1\uffff";
    static final String dfa_3s = "\1\26\1\21\1\uffff\1\17\1\30\1\21\1\5\1\22\1\31\1\21\1\uffff";
    static final String dfa_4s = "\2\uffff\1\2\7\uffff\1\1";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\16\uffff\1\2\1\uffff\1\2",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12\1\uffff\1\2",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 916:2: ( rule__LevelDefinition__PersonsAssignment_4 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000210020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000500020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000003000L});

}