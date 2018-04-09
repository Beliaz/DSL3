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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Leave'", "'Talk'", "'Use'", "'Inspect'", "'new'", "'{'", "'start'", "'='", "';'", "'final'", "'}'", "'level'", "'next'", "'description'", "'type'", "'response'", "'position'", "'action'", "'objects'", "','"
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
    public static final int T__30=30;
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

                if ( (LA1_0==15) ) {
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


    // $ANTLR start "ruleAction_GLOBAL"
    // InternalGame.g:278:1: ruleAction_GLOBAL : ( ( 'Leave' ) ) ;
    public final void ruleAction_GLOBAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:282:1: ( ( ( 'Leave' ) ) )
            // InternalGame.g:283:2: ( ( 'Leave' ) )
            {
            // InternalGame.g:283:2: ( ( 'Leave' ) )
            // InternalGame.g:284:3: ( 'Leave' )
            {
             before(grammarAccess.getAction_GLOBALAccess().getLEAVEEnumLiteralDeclaration()); 
            // InternalGame.g:285:3: ( 'Leave' )
            // InternalGame.g:285:4: 'Leave'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getAction_GLOBALAccess().getLEAVEEnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleAction_GLOBAL"


    // $ANTLR start "ruleAction_O"
    // InternalGame.g:294:1: ruleAction_O : ( ( rule__Action_O__Alternatives ) ) ;
    public final void ruleAction_O() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:298:1: ( ( ( rule__Action_O__Alternatives ) ) )
            // InternalGame.g:299:2: ( ( rule__Action_O__Alternatives ) )
            {
            // InternalGame.g:299:2: ( ( rule__Action_O__Alternatives ) )
            // InternalGame.g:300:3: ( rule__Action_O__Alternatives )
            {
             before(grammarAccess.getAction_OAccess().getAlternatives()); 
            // InternalGame.g:301:3: ( rule__Action_O__Alternatives )
            // InternalGame.g:301:4: rule__Action_O__Alternatives
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
    // InternalGame.g:310:1: ruleAction_P : ( ( 'Talk' ) ) ;
    public final void ruleAction_P() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:314:1: ( ( ( 'Talk' ) ) )
            // InternalGame.g:315:2: ( ( 'Talk' ) )
            {
            // InternalGame.g:315:2: ( ( 'Talk' ) )
            // InternalGame.g:316:3: ( 'Talk' )
            {
             before(grammarAccess.getAction_PAccess().getTALKEnumLiteralDeclaration()); 
            // InternalGame.g:317:3: ( 'Talk' )
            // InternalGame.g:317:4: 'Talk'
            {
            match(input,12,FOLLOW_2); 

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
    // InternalGame.g:325:1: rule__Action_O__Alternatives : ( ( ( 'Use' ) ) | ( ( 'Inspect' ) ) );
    public final void rule__Action_O__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:329:1: ( ( ( 'Use' ) ) | ( ( 'Inspect' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGame.g:330:2: ( ( 'Use' ) )
                    {
                    // InternalGame.g:330:2: ( ( 'Use' ) )
                    // InternalGame.g:331:3: ( 'Use' )
                    {
                     before(grammarAccess.getAction_OAccess().getUSEEnumLiteralDeclaration_0()); 
                    // InternalGame.g:332:3: ( 'Use' )
                    // InternalGame.g:332:4: 'Use'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAction_OAccess().getUSEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:336:2: ( ( 'Inspect' ) )
                    {
                    // InternalGame.g:336:2: ( ( 'Inspect' ) )
                    // InternalGame.g:337:3: ( 'Inspect' )
                    {
                     before(grammarAccess.getAction_OAccess().getINSPECTEnumLiteralDeclaration_1()); 
                    // InternalGame.g:338:3: ( 'Inspect' )
                    // InternalGame.g:338:4: 'Inspect'
                    {
                    match(input,14,FOLLOW_2); 

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
    // InternalGame.g:346:1: rule__Scene__Group__0 : rule__Scene__Group__0__Impl rule__Scene__Group__1 ;
    public final void rule__Scene__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:350:1: ( rule__Scene__Group__0__Impl rule__Scene__Group__1 )
            // InternalGame.g:351:2: rule__Scene__Group__0__Impl rule__Scene__Group__1
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
    // InternalGame.g:358:1: rule__Scene__Group__0__Impl : ( 'new' ) ;
    public final void rule__Scene__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:362:1: ( ( 'new' ) )
            // InternalGame.g:363:1: ( 'new' )
            {
            // InternalGame.g:363:1: ( 'new' )
            // InternalGame.g:364:2: 'new'
            {
             before(grammarAccess.getSceneAccess().getNewKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalGame.g:373:1: rule__Scene__Group__1 : rule__Scene__Group__1__Impl rule__Scene__Group__2 ;
    public final void rule__Scene__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:377:1: ( rule__Scene__Group__1__Impl rule__Scene__Group__2 )
            // InternalGame.g:378:2: rule__Scene__Group__1__Impl rule__Scene__Group__2
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
    // InternalGame.g:385:1: rule__Scene__Group__1__Impl : ( ( rule__Scene__NameAssignment_1 ) ) ;
    public final void rule__Scene__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:389:1: ( ( ( rule__Scene__NameAssignment_1 ) ) )
            // InternalGame.g:390:1: ( ( rule__Scene__NameAssignment_1 ) )
            {
            // InternalGame.g:390:1: ( ( rule__Scene__NameAssignment_1 ) )
            // InternalGame.g:391:2: ( rule__Scene__NameAssignment_1 )
            {
             before(grammarAccess.getSceneAccess().getNameAssignment_1()); 
            // InternalGame.g:392:2: ( rule__Scene__NameAssignment_1 )
            // InternalGame.g:392:3: rule__Scene__NameAssignment_1
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
    // InternalGame.g:400:1: rule__Scene__Group__2 : rule__Scene__Group__2__Impl rule__Scene__Group__3 ;
    public final void rule__Scene__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:404:1: ( rule__Scene__Group__2__Impl rule__Scene__Group__3 )
            // InternalGame.g:405:2: rule__Scene__Group__2__Impl rule__Scene__Group__3
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
    // InternalGame.g:412:1: rule__Scene__Group__2__Impl : ( '{' ) ;
    public final void rule__Scene__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:416:1: ( ( '{' ) )
            // InternalGame.g:417:1: ( '{' )
            {
            // InternalGame.g:417:1: ( '{' )
            // InternalGame.g:418:2: '{'
            {
             before(grammarAccess.getSceneAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGame.g:427:1: rule__Scene__Group__3 : rule__Scene__Group__3__Impl rule__Scene__Group__4 ;
    public final void rule__Scene__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:431:1: ( rule__Scene__Group__3__Impl rule__Scene__Group__4 )
            // InternalGame.g:432:2: rule__Scene__Group__3__Impl rule__Scene__Group__4
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
    // InternalGame.g:439:1: rule__Scene__Group__3__Impl : ( ( rule__Scene__DeclartionsAssignment_3 )* ) ;
    public final void rule__Scene__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:443:1: ( ( ( rule__Scene__DeclartionsAssignment_3 )* ) )
            // InternalGame.g:444:1: ( ( rule__Scene__DeclartionsAssignment_3 )* )
            {
            // InternalGame.g:444:1: ( ( rule__Scene__DeclartionsAssignment_3 )* )
            // InternalGame.g:445:2: ( rule__Scene__DeclartionsAssignment_3 )*
            {
             before(grammarAccess.getSceneAccess().getDeclartionsAssignment_3()); 
            // InternalGame.g:446:2: ( rule__Scene__DeclartionsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGame.g:446:3: rule__Scene__DeclartionsAssignment_3
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
    // InternalGame.g:454:1: rule__Scene__Group__4 : rule__Scene__Group__4__Impl rule__Scene__Group__5 ;
    public final void rule__Scene__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:458:1: ( rule__Scene__Group__4__Impl rule__Scene__Group__5 )
            // InternalGame.g:459:2: rule__Scene__Group__4__Impl rule__Scene__Group__5
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
    // InternalGame.g:466:1: rule__Scene__Group__4__Impl : ( ( rule__Scene__DefinitionsAssignment_4 )* ) ;
    public final void rule__Scene__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:470:1: ( ( ( rule__Scene__DefinitionsAssignment_4 )* ) )
            // InternalGame.g:471:1: ( ( rule__Scene__DefinitionsAssignment_4 )* )
            {
            // InternalGame.g:471:1: ( ( rule__Scene__DefinitionsAssignment_4 )* )
            // InternalGame.g:472:2: ( rule__Scene__DefinitionsAssignment_4 )*
            {
             before(grammarAccess.getSceneAccess().getDefinitionsAssignment_4()); 
            // InternalGame.g:473:2: ( rule__Scene__DefinitionsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:473:3: rule__Scene__DefinitionsAssignment_4
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
    // InternalGame.g:481:1: rule__Scene__Group__5 : rule__Scene__Group__5__Impl rule__Scene__Group__6 ;
    public final void rule__Scene__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:485:1: ( rule__Scene__Group__5__Impl rule__Scene__Group__6 )
            // InternalGame.g:486:2: rule__Scene__Group__5__Impl rule__Scene__Group__6
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
    // InternalGame.g:493:1: rule__Scene__Group__5__Impl : ( 'start' ) ;
    public final void rule__Scene__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:497:1: ( ( 'start' ) )
            // InternalGame.g:498:1: ( 'start' )
            {
            // InternalGame.g:498:1: ( 'start' )
            // InternalGame.g:499:2: 'start'
            {
             before(grammarAccess.getSceneAccess().getStartKeyword_5()); 
            match(input,17,FOLLOW_2); 
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
    // InternalGame.g:508:1: rule__Scene__Group__6 : rule__Scene__Group__6__Impl rule__Scene__Group__7 ;
    public final void rule__Scene__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:512:1: ( rule__Scene__Group__6__Impl rule__Scene__Group__7 )
            // InternalGame.g:513:2: rule__Scene__Group__6__Impl rule__Scene__Group__7
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
    // InternalGame.g:520:1: rule__Scene__Group__6__Impl : ( '=' ) ;
    public final void rule__Scene__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:524:1: ( ( '=' ) )
            // InternalGame.g:525:1: ( '=' )
            {
            // InternalGame.g:525:1: ( '=' )
            // InternalGame.g:526:2: '='
            {
             before(grammarAccess.getSceneAccess().getEqualsSignKeyword_6()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:535:1: rule__Scene__Group__7 : rule__Scene__Group__7__Impl rule__Scene__Group__8 ;
    public final void rule__Scene__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:539:1: ( rule__Scene__Group__7__Impl rule__Scene__Group__8 )
            // InternalGame.g:540:2: rule__Scene__Group__7__Impl rule__Scene__Group__8
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
    // InternalGame.g:547:1: rule__Scene__Group__7__Impl : ( ( rule__Scene__StartLevelAssignment_7 ) ) ;
    public final void rule__Scene__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:551:1: ( ( ( rule__Scene__StartLevelAssignment_7 ) ) )
            // InternalGame.g:552:1: ( ( rule__Scene__StartLevelAssignment_7 ) )
            {
            // InternalGame.g:552:1: ( ( rule__Scene__StartLevelAssignment_7 ) )
            // InternalGame.g:553:2: ( rule__Scene__StartLevelAssignment_7 )
            {
             before(grammarAccess.getSceneAccess().getStartLevelAssignment_7()); 
            // InternalGame.g:554:2: ( rule__Scene__StartLevelAssignment_7 )
            // InternalGame.g:554:3: rule__Scene__StartLevelAssignment_7
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
    // InternalGame.g:562:1: rule__Scene__Group__8 : rule__Scene__Group__8__Impl rule__Scene__Group__9 ;
    public final void rule__Scene__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:566:1: ( rule__Scene__Group__8__Impl rule__Scene__Group__9 )
            // InternalGame.g:567:2: rule__Scene__Group__8__Impl rule__Scene__Group__9
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
    // InternalGame.g:574:1: rule__Scene__Group__8__Impl : ( ';' ) ;
    public final void rule__Scene__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:578:1: ( ( ';' ) )
            // InternalGame.g:579:1: ( ';' )
            {
            // InternalGame.g:579:1: ( ';' )
            // InternalGame.g:580:2: ';'
            {
             before(grammarAccess.getSceneAccess().getSemicolonKeyword_8()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:589:1: rule__Scene__Group__9 : rule__Scene__Group__9__Impl rule__Scene__Group__10 ;
    public final void rule__Scene__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:593:1: ( rule__Scene__Group__9__Impl rule__Scene__Group__10 )
            // InternalGame.g:594:2: rule__Scene__Group__9__Impl rule__Scene__Group__10
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
    // InternalGame.g:601:1: rule__Scene__Group__9__Impl : ( 'final' ) ;
    public final void rule__Scene__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:605:1: ( ( 'final' ) )
            // InternalGame.g:606:1: ( 'final' )
            {
            // InternalGame.g:606:1: ( 'final' )
            // InternalGame.g:607:2: 'final'
            {
             before(grammarAccess.getSceneAccess().getFinalKeyword_9()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGame.g:616:1: rule__Scene__Group__10 : rule__Scene__Group__10__Impl rule__Scene__Group__11 ;
    public final void rule__Scene__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:620:1: ( rule__Scene__Group__10__Impl rule__Scene__Group__11 )
            // InternalGame.g:621:2: rule__Scene__Group__10__Impl rule__Scene__Group__11
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
    // InternalGame.g:628:1: rule__Scene__Group__10__Impl : ( '=' ) ;
    public final void rule__Scene__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:632:1: ( ( '=' ) )
            // InternalGame.g:633:1: ( '=' )
            {
            // InternalGame.g:633:1: ( '=' )
            // InternalGame.g:634:2: '='
            {
             before(grammarAccess.getSceneAccess().getEqualsSignKeyword_10()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:643:1: rule__Scene__Group__11 : rule__Scene__Group__11__Impl rule__Scene__Group__12 ;
    public final void rule__Scene__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:647:1: ( rule__Scene__Group__11__Impl rule__Scene__Group__12 )
            // InternalGame.g:648:2: rule__Scene__Group__11__Impl rule__Scene__Group__12
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
    // InternalGame.g:655:1: rule__Scene__Group__11__Impl : ( ( rule__Scene__FinalLevelAssignment_11 ) ) ;
    public final void rule__Scene__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:659:1: ( ( ( rule__Scene__FinalLevelAssignment_11 ) ) )
            // InternalGame.g:660:1: ( ( rule__Scene__FinalLevelAssignment_11 ) )
            {
            // InternalGame.g:660:1: ( ( rule__Scene__FinalLevelAssignment_11 ) )
            // InternalGame.g:661:2: ( rule__Scene__FinalLevelAssignment_11 )
            {
             before(grammarAccess.getSceneAccess().getFinalLevelAssignment_11()); 
            // InternalGame.g:662:2: ( rule__Scene__FinalLevelAssignment_11 )
            // InternalGame.g:662:3: rule__Scene__FinalLevelAssignment_11
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
    // InternalGame.g:670:1: rule__Scene__Group__12 : rule__Scene__Group__12__Impl rule__Scene__Group__13 ;
    public final void rule__Scene__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:674:1: ( rule__Scene__Group__12__Impl rule__Scene__Group__13 )
            // InternalGame.g:675:2: rule__Scene__Group__12__Impl rule__Scene__Group__13
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
    // InternalGame.g:682:1: rule__Scene__Group__12__Impl : ( ';' ) ;
    public final void rule__Scene__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:686:1: ( ( ';' ) )
            // InternalGame.g:687:1: ( ';' )
            {
            // InternalGame.g:687:1: ( ';' )
            // InternalGame.g:688:2: ';'
            {
             before(grammarAccess.getSceneAccess().getSemicolonKeyword_12()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:697:1: rule__Scene__Group__13 : rule__Scene__Group__13__Impl ;
    public final void rule__Scene__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:701:1: ( rule__Scene__Group__13__Impl )
            // InternalGame.g:702:2: rule__Scene__Group__13__Impl
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
    // InternalGame.g:708:1: rule__Scene__Group__13__Impl : ( '}' ) ;
    public final void rule__Scene__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:712:1: ( ( '}' ) )
            // InternalGame.g:713:1: ( '}' )
            {
            // InternalGame.g:713:1: ( '}' )
            // InternalGame.g:714:2: '}'
            {
             before(grammarAccess.getSceneAccess().getRightCurlyBracketKeyword_13()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGame.g:724:1: rule__LevelDeclaration__Group__0 : rule__LevelDeclaration__Group__0__Impl rule__LevelDeclaration__Group__1 ;
    public final void rule__LevelDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:728:1: ( rule__LevelDeclaration__Group__0__Impl rule__LevelDeclaration__Group__1 )
            // InternalGame.g:729:2: rule__LevelDeclaration__Group__0__Impl rule__LevelDeclaration__Group__1
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
    // InternalGame.g:736:1: rule__LevelDeclaration__Group__0__Impl : ( 'level' ) ;
    public final void rule__LevelDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:740:1: ( ( 'level' ) )
            // InternalGame.g:741:1: ( 'level' )
            {
            // InternalGame.g:741:1: ( 'level' )
            // InternalGame.g:742:2: 'level'
            {
             before(grammarAccess.getLevelDeclarationAccess().getLevelKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGame.g:751:1: rule__LevelDeclaration__Group__1 : rule__LevelDeclaration__Group__1__Impl rule__LevelDeclaration__Group__2 ;
    public final void rule__LevelDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:755:1: ( rule__LevelDeclaration__Group__1__Impl rule__LevelDeclaration__Group__2 )
            // InternalGame.g:756:2: rule__LevelDeclaration__Group__1__Impl rule__LevelDeclaration__Group__2
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
    // InternalGame.g:763:1: rule__LevelDeclaration__Group__1__Impl : ( ( rule__LevelDeclaration__NameAssignment_1 ) ) ;
    public final void rule__LevelDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:767:1: ( ( ( rule__LevelDeclaration__NameAssignment_1 ) ) )
            // InternalGame.g:768:1: ( ( rule__LevelDeclaration__NameAssignment_1 ) )
            {
            // InternalGame.g:768:1: ( ( rule__LevelDeclaration__NameAssignment_1 ) )
            // InternalGame.g:769:2: ( rule__LevelDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getLevelDeclarationAccess().getNameAssignment_1()); 
            // InternalGame.g:770:2: ( rule__LevelDeclaration__NameAssignment_1 )
            // InternalGame.g:770:3: rule__LevelDeclaration__NameAssignment_1
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
    // InternalGame.g:778:1: rule__LevelDeclaration__Group__2 : rule__LevelDeclaration__Group__2__Impl ;
    public final void rule__LevelDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:782:1: ( rule__LevelDeclaration__Group__2__Impl )
            // InternalGame.g:783:2: rule__LevelDeclaration__Group__2__Impl
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
    // InternalGame.g:789:1: rule__LevelDeclaration__Group__2__Impl : ( ';' ) ;
    public final void rule__LevelDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:793:1: ( ( ';' ) )
            // InternalGame.g:794:1: ( ';' )
            {
            // InternalGame.g:794:1: ( ';' )
            // InternalGame.g:795:2: ';'
            {
             before(grammarAccess.getLevelDeclarationAccess().getSemicolonKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:805:1: rule__LevelDefinition__Group__0 : rule__LevelDefinition__Group__0__Impl rule__LevelDefinition__Group__1 ;
    public final void rule__LevelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:809:1: ( rule__LevelDefinition__Group__0__Impl rule__LevelDefinition__Group__1 )
            // InternalGame.g:810:2: rule__LevelDefinition__Group__0__Impl rule__LevelDefinition__Group__1
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
    // InternalGame.g:817:1: rule__LevelDefinition__Group__0__Impl : ( ( rule__LevelDefinition__NameAssignment_0 ) ) ;
    public final void rule__LevelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:821:1: ( ( ( rule__LevelDefinition__NameAssignment_0 ) ) )
            // InternalGame.g:822:1: ( ( rule__LevelDefinition__NameAssignment_0 ) )
            {
            // InternalGame.g:822:1: ( ( rule__LevelDefinition__NameAssignment_0 ) )
            // InternalGame.g:823:2: ( rule__LevelDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getLevelDefinitionAccess().getNameAssignment_0()); 
            // InternalGame.g:824:2: ( rule__LevelDefinition__NameAssignment_0 )
            // InternalGame.g:824:3: rule__LevelDefinition__NameAssignment_0
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
    // InternalGame.g:832:1: rule__LevelDefinition__Group__1 : rule__LevelDefinition__Group__1__Impl rule__LevelDefinition__Group__2 ;
    public final void rule__LevelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:836:1: ( rule__LevelDefinition__Group__1__Impl rule__LevelDefinition__Group__2 )
            // InternalGame.g:837:2: rule__LevelDefinition__Group__1__Impl rule__LevelDefinition__Group__2
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
    // InternalGame.g:844:1: rule__LevelDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__LevelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:848:1: ( ( '=' ) )
            // InternalGame.g:849:1: ( '=' )
            {
            // InternalGame.g:849:1: ( '=' )
            // InternalGame.g:850:2: '='
            {
             before(grammarAccess.getLevelDefinitionAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:859:1: rule__LevelDefinition__Group__2 : rule__LevelDefinition__Group__2__Impl rule__LevelDefinition__Group__3 ;
    public final void rule__LevelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:863:1: ( rule__LevelDefinition__Group__2__Impl rule__LevelDefinition__Group__3 )
            // InternalGame.g:864:2: rule__LevelDefinition__Group__2__Impl rule__LevelDefinition__Group__3
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
    // InternalGame.g:871:1: rule__LevelDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__LevelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:875:1: ( ( '{' ) )
            // InternalGame.g:876:1: ( '{' )
            {
            // InternalGame.g:876:1: ( '{' )
            // InternalGame.g:877:2: '{'
            {
             before(grammarAccess.getLevelDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGame.g:886:1: rule__LevelDefinition__Group__3 : rule__LevelDefinition__Group__3__Impl rule__LevelDefinition__Group__4 ;
    public final void rule__LevelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:890:1: ( rule__LevelDefinition__Group__3__Impl rule__LevelDefinition__Group__4 )
            // InternalGame.g:891:2: rule__LevelDefinition__Group__3__Impl rule__LevelDefinition__Group__4
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
    // InternalGame.g:898:1: rule__LevelDefinition__Group__3__Impl : ( ( rule__LevelDefinition__DescriptionAssignment_3 ) ) ;
    public final void rule__LevelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:902:1: ( ( ( rule__LevelDefinition__DescriptionAssignment_3 ) ) )
            // InternalGame.g:903:1: ( ( rule__LevelDefinition__DescriptionAssignment_3 ) )
            {
            // InternalGame.g:903:1: ( ( rule__LevelDefinition__DescriptionAssignment_3 ) )
            // InternalGame.g:904:2: ( rule__LevelDefinition__DescriptionAssignment_3 )
            {
             before(grammarAccess.getLevelDefinitionAccess().getDescriptionAssignment_3()); 
            // InternalGame.g:905:2: ( rule__LevelDefinition__DescriptionAssignment_3 )
            // InternalGame.g:905:3: rule__LevelDefinition__DescriptionAssignment_3
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
    // InternalGame.g:913:1: rule__LevelDefinition__Group__4 : rule__LevelDefinition__Group__4__Impl rule__LevelDefinition__Group__5 ;
    public final void rule__LevelDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:917:1: ( rule__LevelDefinition__Group__4__Impl rule__LevelDefinition__Group__5 )
            // InternalGame.g:918:2: rule__LevelDefinition__Group__4__Impl rule__LevelDefinition__Group__5
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
    // InternalGame.g:925:1: rule__LevelDefinition__Group__4__Impl : ( ( rule__LevelDefinition__PersonsAssignment_4 )* ) ;
    public final void rule__LevelDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:929:1: ( ( ( rule__LevelDefinition__PersonsAssignment_4 )* ) )
            // InternalGame.g:930:1: ( ( rule__LevelDefinition__PersonsAssignment_4 )* )
            {
            // InternalGame.g:930:1: ( ( rule__LevelDefinition__PersonsAssignment_4 )* )
            // InternalGame.g:931:2: ( rule__LevelDefinition__PersonsAssignment_4 )*
            {
             before(grammarAccess.getLevelDefinitionAccess().getPersonsAssignment_4()); 
            // InternalGame.g:932:2: ( rule__LevelDefinition__PersonsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // InternalGame.g:932:3: rule__LevelDefinition__PersonsAssignment_4
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
    // InternalGame.g:940:1: rule__LevelDefinition__Group__5 : rule__LevelDefinition__Group__5__Impl rule__LevelDefinition__Group__6 ;
    public final void rule__LevelDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:944:1: ( rule__LevelDefinition__Group__5__Impl rule__LevelDefinition__Group__6 )
            // InternalGame.g:945:2: rule__LevelDefinition__Group__5__Impl rule__LevelDefinition__Group__6
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
    // InternalGame.g:952:1: rule__LevelDefinition__Group__5__Impl : ( ( rule__LevelDefinition__ObjectsAssignment_5 )* ) ;
    public final void rule__LevelDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:956:1: ( ( ( rule__LevelDefinition__ObjectsAssignment_5 )* ) )
            // InternalGame.g:957:1: ( ( rule__LevelDefinition__ObjectsAssignment_5 )* )
            {
            // InternalGame.g:957:1: ( ( rule__LevelDefinition__ObjectsAssignment_5 )* )
            // InternalGame.g:958:2: ( rule__LevelDefinition__ObjectsAssignment_5 )*
            {
             before(grammarAccess.getLevelDefinitionAccess().getObjectsAssignment_5()); 
            // InternalGame.g:959:2: ( rule__LevelDefinition__ObjectsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGame.g:959:3: rule__LevelDefinition__ObjectsAssignment_5
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
    // InternalGame.g:967:1: rule__LevelDefinition__Group__6 : rule__LevelDefinition__Group__6__Impl rule__LevelDefinition__Group__7 ;
    public final void rule__LevelDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:971:1: ( rule__LevelDefinition__Group__6__Impl rule__LevelDefinition__Group__7 )
            // InternalGame.g:972:2: rule__LevelDefinition__Group__6__Impl rule__LevelDefinition__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:979:1: rule__LevelDefinition__Group__6__Impl : ( ( rule__LevelDefinition__ActionsAssignment_6 ) ) ;
    public final void rule__LevelDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:983:1: ( ( ( rule__LevelDefinition__ActionsAssignment_6 ) ) )
            // InternalGame.g:984:1: ( ( rule__LevelDefinition__ActionsAssignment_6 ) )
            {
            // InternalGame.g:984:1: ( ( rule__LevelDefinition__ActionsAssignment_6 ) )
            // InternalGame.g:985:2: ( rule__LevelDefinition__ActionsAssignment_6 )
            {
             before(grammarAccess.getLevelDefinitionAccess().getActionsAssignment_6()); 
            // InternalGame.g:986:2: ( rule__LevelDefinition__ActionsAssignment_6 )
            // InternalGame.g:986:3: rule__LevelDefinition__ActionsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__LevelDefinition__ActionsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLevelDefinitionAccess().getActionsAssignment_6()); 

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
    // InternalGame.g:994:1: rule__LevelDefinition__Group__7 : rule__LevelDefinition__Group__7__Impl rule__LevelDefinition__Group__8 ;
    public final void rule__LevelDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:998:1: ( rule__LevelDefinition__Group__7__Impl rule__LevelDefinition__Group__8 )
            // InternalGame.g:999:2: rule__LevelDefinition__Group__7__Impl rule__LevelDefinition__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__LevelDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group__8();

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
    // InternalGame.g:1006:1: rule__LevelDefinition__Group__7__Impl : ( ( rule__LevelDefinition__Group_7__0 )? ) ;
    public final void rule__LevelDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1010:1: ( ( ( rule__LevelDefinition__Group_7__0 )? ) )
            // InternalGame.g:1011:1: ( ( rule__LevelDefinition__Group_7__0 )? )
            {
            // InternalGame.g:1011:1: ( ( rule__LevelDefinition__Group_7__0 )? )
            // InternalGame.g:1012:2: ( rule__LevelDefinition__Group_7__0 )?
            {
             before(grammarAccess.getLevelDefinitionAccess().getGroup_7()); 
            // InternalGame.g:1013:2: ( rule__LevelDefinition__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGame.g:1013:3: rule__LevelDefinition__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LevelDefinition__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLevelDefinitionAccess().getGroup_7()); 

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


    // $ANTLR start "rule__LevelDefinition__Group__8"
    // InternalGame.g:1021:1: rule__LevelDefinition__Group__8 : rule__LevelDefinition__Group__8__Impl ;
    public final void rule__LevelDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1025:1: ( rule__LevelDefinition__Group__8__Impl )
            // InternalGame.g:1026:2: rule__LevelDefinition__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group__8__Impl();

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
    // $ANTLR end "rule__LevelDefinition__Group__8"


    // $ANTLR start "rule__LevelDefinition__Group__8__Impl"
    // InternalGame.g:1032:1: rule__LevelDefinition__Group__8__Impl : ( '}' ) ;
    public final void rule__LevelDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1036:1: ( ( '}' ) )
            // InternalGame.g:1037:1: ( '}' )
            {
            // InternalGame.g:1037:1: ( '}' )
            // InternalGame.g:1038:2: '}'
            {
             before(grammarAccess.getLevelDefinitionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__LevelDefinition__Group__8__Impl"


    // $ANTLR start "rule__LevelDefinition__Group_7__0"
    // InternalGame.g:1048:1: rule__LevelDefinition__Group_7__0 : rule__LevelDefinition__Group_7__0__Impl rule__LevelDefinition__Group_7__1 ;
    public final void rule__LevelDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1052:1: ( rule__LevelDefinition__Group_7__0__Impl rule__LevelDefinition__Group_7__1 )
            // InternalGame.g:1053:2: rule__LevelDefinition__Group_7__0__Impl rule__LevelDefinition__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__LevelDefinition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group_7__1();

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
    // $ANTLR end "rule__LevelDefinition__Group_7__0"


    // $ANTLR start "rule__LevelDefinition__Group_7__0__Impl"
    // InternalGame.g:1060:1: rule__LevelDefinition__Group_7__0__Impl : ( 'next' ) ;
    public final void rule__LevelDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1064:1: ( ( 'next' ) )
            // InternalGame.g:1065:1: ( 'next' )
            {
            // InternalGame.g:1065:1: ( 'next' )
            // InternalGame.g:1066:2: 'next'
            {
             before(grammarAccess.getLevelDefinitionAccess().getNextKeyword_7_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getNextKeyword_7_0()); 

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
    // $ANTLR end "rule__LevelDefinition__Group_7__0__Impl"


    // $ANTLR start "rule__LevelDefinition__Group_7__1"
    // InternalGame.g:1075:1: rule__LevelDefinition__Group_7__1 : rule__LevelDefinition__Group_7__1__Impl rule__LevelDefinition__Group_7__2 ;
    public final void rule__LevelDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1079:1: ( rule__LevelDefinition__Group_7__1__Impl rule__LevelDefinition__Group_7__2 )
            // InternalGame.g:1080:2: rule__LevelDefinition__Group_7__1__Impl rule__LevelDefinition__Group_7__2
            {
            pushFollow(FOLLOW_4);
            rule__LevelDefinition__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group_7__2();

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
    // $ANTLR end "rule__LevelDefinition__Group_7__1"


    // $ANTLR start "rule__LevelDefinition__Group_7__1__Impl"
    // InternalGame.g:1087:1: rule__LevelDefinition__Group_7__1__Impl : ( '=' ) ;
    public final void rule__LevelDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1091:1: ( ( '=' ) )
            // InternalGame.g:1092:1: ( '=' )
            {
            // InternalGame.g:1092:1: ( '=' )
            // InternalGame.g:1093:2: '='
            {
             before(grammarAccess.getLevelDefinitionAccess().getEqualsSignKeyword_7_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getEqualsSignKeyword_7_1()); 

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
    // $ANTLR end "rule__LevelDefinition__Group_7__1__Impl"


    // $ANTLR start "rule__LevelDefinition__Group_7__2"
    // InternalGame.g:1102:1: rule__LevelDefinition__Group_7__2 : rule__LevelDefinition__Group_7__2__Impl rule__LevelDefinition__Group_7__3 ;
    public final void rule__LevelDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1106:1: ( rule__LevelDefinition__Group_7__2__Impl rule__LevelDefinition__Group_7__3 )
            // InternalGame.g:1107:2: rule__LevelDefinition__Group_7__2__Impl rule__LevelDefinition__Group_7__3
            {
            pushFollow(FOLLOW_10);
            rule__LevelDefinition__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group_7__3();

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
    // $ANTLR end "rule__LevelDefinition__Group_7__2"


    // $ANTLR start "rule__LevelDefinition__Group_7__2__Impl"
    // InternalGame.g:1114:1: rule__LevelDefinition__Group_7__2__Impl : ( ( rule__LevelDefinition__NextAssignment_7_2 ) ) ;
    public final void rule__LevelDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1118:1: ( ( ( rule__LevelDefinition__NextAssignment_7_2 ) ) )
            // InternalGame.g:1119:1: ( ( rule__LevelDefinition__NextAssignment_7_2 ) )
            {
            // InternalGame.g:1119:1: ( ( rule__LevelDefinition__NextAssignment_7_2 ) )
            // InternalGame.g:1120:2: ( rule__LevelDefinition__NextAssignment_7_2 )
            {
             before(grammarAccess.getLevelDefinitionAccess().getNextAssignment_7_2()); 
            // InternalGame.g:1121:2: ( rule__LevelDefinition__NextAssignment_7_2 )
            // InternalGame.g:1121:3: rule__LevelDefinition__NextAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__LevelDefinition__NextAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getLevelDefinitionAccess().getNextAssignment_7_2()); 

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
    // $ANTLR end "rule__LevelDefinition__Group_7__2__Impl"


    // $ANTLR start "rule__LevelDefinition__Group_7__3"
    // InternalGame.g:1129:1: rule__LevelDefinition__Group_7__3 : rule__LevelDefinition__Group_7__3__Impl ;
    public final void rule__LevelDefinition__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1133:1: ( rule__LevelDefinition__Group_7__3__Impl )
            // InternalGame.g:1134:2: rule__LevelDefinition__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group_7__3__Impl();

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
    // $ANTLR end "rule__LevelDefinition__Group_7__3"


    // $ANTLR start "rule__LevelDefinition__Group_7__3__Impl"
    // InternalGame.g:1140:1: rule__LevelDefinition__Group_7__3__Impl : ( ';' ) ;
    public final void rule__LevelDefinition__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1144:1: ( ( ';' ) )
            // InternalGame.g:1145:1: ( ';' )
            {
            // InternalGame.g:1145:1: ( ';' )
            // InternalGame.g:1146:2: ';'
            {
             before(grammarAccess.getLevelDefinitionAccess().getSemicolonKeyword_7_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getSemicolonKeyword_7_3()); 

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
    // $ANTLR end "rule__LevelDefinition__Group_7__3__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalGame.g:1156:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1160:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalGame.g:1161:2: rule__Description__Group__0__Impl rule__Description__Group__1
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
    // InternalGame.g:1168:1: rule__Description__Group__0__Impl : ( 'description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1172:1: ( ( 'description' ) )
            // InternalGame.g:1173:1: ( 'description' )
            {
            // InternalGame.g:1173:1: ( 'description' )
            // InternalGame.g:1174:2: 'description'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGame.g:1183:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1187:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // InternalGame.g:1188:2: rule__Description__Group__1__Impl rule__Description__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1195:1: rule__Description__Group__1__Impl : ( '=' ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1199:1: ( ( '=' ) )
            // InternalGame.g:1200:1: ( '=' )
            {
            // InternalGame.g:1200:1: ( '=' )
            // InternalGame.g:1201:2: '='
            {
             before(grammarAccess.getDescriptionAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:1210:1: rule__Description__Group__2 : rule__Description__Group__2__Impl rule__Description__Group__3 ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1214:1: ( rule__Description__Group__2__Impl rule__Description__Group__3 )
            // InternalGame.g:1215:2: rule__Description__Group__2__Impl rule__Description__Group__3
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
    // InternalGame.g:1222:1: rule__Description__Group__2__Impl : ( ( rule__Description__NameAssignment_2 ) ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1226:1: ( ( ( rule__Description__NameAssignment_2 ) ) )
            // InternalGame.g:1227:1: ( ( rule__Description__NameAssignment_2 ) )
            {
            // InternalGame.g:1227:1: ( ( rule__Description__NameAssignment_2 ) )
            // InternalGame.g:1228:2: ( rule__Description__NameAssignment_2 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_2()); 
            // InternalGame.g:1229:2: ( rule__Description__NameAssignment_2 )
            // InternalGame.g:1229:3: rule__Description__NameAssignment_2
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
    // InternalGame.g:1237:1: rule__Description__Group__3 : rule__Description__Group__3__Impl ;
    public final void rule__Description__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1241:1: ( rule__Description__Group__3__Impl )
            // InternalGame.g:1242:2: rule__Description__Group__3__Impl
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
    // InternalGame.g:1248:1: rule__Description__Group__3__Impl : ( ';' ) ;
    public final void rule__Description__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1252:1: ( ( ';' ) )
            // InternalGame.g:1253:1: ( ';' )
            {
            // InternalGame.g:1253:1: ( ';' )
            // InternalGame.g:1254:2: ';'
            {
             before(grammarAccess.getDescriptionAccess().getSemicolonKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:1264:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1268:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalGame.g:1269:2: rule__Person__Group__0__Impl rule__Person__Group__1
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
    // InternalGame.g:1276:1: rule__Person__Group__0__Impl : ( ( rule__Person__NameAssignment_0 ) ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1280:1: ( ( ( rule__Person__NameAssignment_0 ) ) )
            // InternalGame.g:1281:1: ( ( rule__Person__NameAssignment_0 ) )
            {
            // InternalGame.g:1281:1: ( ( rule__Person__NameAssignment_0 ) )
            // InternalGame.g:1282:2: ( rule__Person__NameAssignment_0 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_0()); 
            // InternalGame.g:1283:2: ( rule__Person__NameAssignment_0 )
            // InternalGame.g:1283:3: rule__Person__NameAssignment_0
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
    // InternalGame.g:1291:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1295:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalGame.g:1296:2: rule__Person__Group__1__Impl rule__Person__Group__2
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
    // InternalGame.g:1303:1: rule__Person__Group__1__Impl : ( '=' ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1307:1: ( ( '=' ) )
            // InternalGame.g:1308:1: ( '=' )
            {
            // InternalGame.g:1308:1: ( '=' )
            // InternalGame.g:1309:2: '='
            {
             before(grammarAccess.getPersonAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:1318:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1322:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalGame.g:1323:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalGame.g:1330:1: rule__Person__Group__2__Impl : ( '{' ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1334:1: ( ( '{' ) )
            // InternalGame.g:1335:1: ( '{' )
            {
            // InternalGame.g:1335:1: ( '{' )
            // InternalGame.g:1336:2: '{'
            {
             before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGame.g:1345:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1349:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalGame.g:1350:2: rule__Person__Group__3__Impl rule__Person__Group__4
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
    // InternalGame.g:1357:1: rule__Person__Group__3__Impl : ( 'type' ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1361:1: ( ( 'type' ) )
            // InternalGame.g:1362:1: ( 'type' )
            {
            // InternalGame.g:1362:1: ( 'type' )
            // InternalGame.g:1363:2: 'type'
            {
             before(grammarAccess.getPersonAccess().getTypeKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGame.g:1372:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1376:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // InternalGame.g:1377:2: rule__Person__Group__4__Impl rule__Person__Group__5
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
    // InternalGame.g:1384:1: rule__Person__Group__4__Impl : ( '=' ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1388:1: ( ( '=' ) )
            // InternalGame.g:1389:1: ( '=' )
            {
            // InternalGame.g:1389:1: ( '=' )
            // InternalGame.g:1390:2: '='
            {
             before(grammarAccess.getPersonAccess().getEqualsSignKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:1399:1: rule__Person__Group__5 : rule__Person__Group__5__Impl rule__Person__Group__6 ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1403:1: ( rule__Person__Group__5__Impl rule__Person__Group__6 )
            // InternalGame.g:1404:2: rule__Person__Group__5__Impl rule__Person__Group__6
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
    // InternalGame.g:1411:1: rule__Person__Group__5__Impl : ( ( rule__Person__TypeAssignment_5 ) ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1415:1: ( ( ( rule__Person__TypeAssignment_5 ) ) )
            // InternalGame.g:1416:1: ( ( rule__Person__TypeAssignment_5 ) )
            {
            // InternalGame.g:1416:1: ( ( rule__Person__TypeAssignment_5 ) )
            // InternalGame.g:1417:2: ( rule__Person__TypeAssignment_5 )
            {
             before(grammarAccess.getPersonAccess().getTypeAssignment_5()); 
            // InternalGame.g:1418:2: ( rule__Person__TypeAssignment_5 )
            // InternalGame.g:1418:3: rule__Person__TypeAssignment_5
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
    // InternalGame.g:1426:1: rule__Person__Group__6 : rule__Person__Group__6__Impl rule__Person__Group__7 ;
    public final void rule__Person__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1430:1: ( rule__Person__Group__6__Impl rule__Person__Group__7 )
            // InternalGame.g:1431:2: rule__Person__Group__6__Impl rule__Person__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalGame.g:1438:1: rule__Person__Group__6__Impl : ( ';' ) ;
    public final void rule__Person__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1442:1: ( ( ';' ) )
            // InternalGame.g:1443:1: ( ';' )
            {
            // InternalGame.g:1443:1: ( ';' )
            // InternalGame.g:1444:2: ';'
            {
             before(grammarAccess.getPersonAccess().getSemicolonKeyword_6()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:1453:1: rule__Person__Group__7 : rule__Person__Group__7__Impl rule__Person__Group__8 ;
    public final void rule__Person__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1457:1: ( rule__Person__Group__7__Impl rule__Person__Group__8 )
            // InternalGame.g:1458:2: rule__Person__Group__7__Impl rule__Person__Group__8
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
    // InternalGame.g:1465:1: rule__Person__Group__7__Impl : ( 'response' ) ;
    public final void rule__Person__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1469:1: ( ( 'response' ) )
            // InternalGame.g:1470:1: ( 'response' )
            {
            // InternalGame.g:1470:1: ( 'response' )
            // InternalGame.g:1471:2: 'response'
            {
             before(grammarAccess.getPersonAccess().getResponseKeyword_7()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGame.g:1480:1: rule__Person__Group__8 : rule__Person__Group__8__Impl rule__Person__Group__9 ;
    public final void rule__Person__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1484:1: ( rule__Person__Group__8__Impl rule__Person__Group__9 )
            // InternalGame.g:1485:2: rule__Person__Group__8__Impl rule__Person__Group__9
            {
            pushFollow(FOLLOW_19);
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
    // InternalGame.g:1492:1: rule__Person__Group__8__Impl : ( '{' ) ;
    public final void rule__Person__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1496:1: ( ( '{' ) )
            // InternalGame.g:1497:1: ( '{' )
            {
            // InternalGame.g:1497:1: ( '{' )
            // InternalGame.g:1498:2: '{'
            {
             before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGame.g:1507:1: rule__Person__Group__9 : rule__Person__Group__9__Impl rule__Person__Group__10 ;
    public final void rule__Person__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1511:1: ( rule__Person__Group__9__Impl rule__Person__Group__10 )
            // InternalGame.g:1512:2: rule__Person__Group__9__Impl rule__Person__Group__10
            {
            pushFollow(FOLLOW_19);
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
    // InternalGame.g:1519:1: rule__Person__Group__9__Impl : ( ( rule__Person__ResponseAssignment_9 )* ) ;
    public final void rule__Person__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1523:1: ( ( ( rule__Person__ResponseAssignment_9 )* ) )
            // InternalGame.g:1524:1: ( ( rule__Person__ResponseAssignment_9 )* )
            {
            // InternalGame.g:1524:1: ( ( rule__Person__ResponseAssignment_9 )* )
            // InternalGame.g:1525:2: ( rule__Person__ResponseAssignment_9 )*
            {
             before(grammarAccess.getPersonAccess().getResponseAssignment_9()); 
            // InternalGame.g:1526:2: ( rule__Person__ResponseAssignment_9 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGame.g:1526:3: rule__Person__ResponseAssignment_9
            	    {
            	    pushFollow(FOLLOW_20);
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
    // InternalGame.g:1534:1: rule__Person__Group__10 : rule__Person__Group__10__Impl rule__Person__Group__11 ;
    public final void rule__Person__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1538:1: ( rule__Person__Group__10__Impl rule__Person__Group__11 )
            // InternalGame.g:1539:2: rule__Person__Group__10__Impl rule__Person__Group__11
            {
            pushFollow(FOLLOW_21);
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
    // InternalGame.g:1546:1: rule__Person__Group__10__Impl : ( '}' ) ;
    public final void rule__Person__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1550:1: ( ( '}' ) )
            // InternalGame.g:1551:1: ( '}' )
            {
            // InternalGame.g:1551:1: ( '}' )
            // InternalGame.g:1552:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_10()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGame.g:1561:1: rule__Person__Group__11 : rule__Person__Group__11__Impl rule__Person__Group__12 ;
    public final void rule__Person__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1565:1: ( rule__Person__Group__11__Impl rule__Person__Group__12 )
            // InternalGame.g:1566:2: rule__Person__Group__11__Impl rule__Person__Group__12
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
    // InternalGame.g:1573:1: rule__Person__Group__11__Impl : ( 'position' ) ;
    public final void rule__Person__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1577:1: ( ( 'position' ) )
            // InternalGame.g:1578:1: ( 'position' )
            {
            // InternalGame.g:1578:1: ( 'position' )
            // InternalGame.g:1579:2: 'position'
            {
             before(grammarAccess.getPersonAccess().getPositionKeyword_11()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGame.g:1588:1: rule__Person__Group__12 : rule__Person__Group__12__Impl rule__Person__Group__13 ;
    public final void rule__Person__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1592:1: ( rule__Person__Group__12__Impl rule__Person__Group__13 )
            // InternalGame.g:1593:2: rule__Person__Group__12__Impl rule__Person__Group__13
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1600:1: rule__Person__Group__12__Impl : ( '=' ) ;
    public final void rule__Person__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1604:1: ( ( '=' ) )
            // InternalGame.g:1605:1: ( '=' )
            {
            // InternalGame.g:1605:1: ( '=' )
            // InternalGame.g:1606:2: '='
            {
             before(grammarAccess.getPersonAccess().getEqualsSignKeyword_12()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:1615:1: rule__Person__Group__13 : rule__Person__Group__13__Impl rule__Person__Group__14 ;
    public final void rule__Person__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1619:1: ( rule__Person__Group__13__Impl rule__Person__Group__14 )
            // InternalGame.g:1620:2: rule__Person__Group__13__Impl rule__Person__Group__14
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
    // InternalGame.g:1627:1: rule__Person__Group__13__Impl : ( ( rule__Person__PositionAssignment_13 ) ) ;
    public final void rule__Person__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1631:1: ( ( ( rule__Person__PositionAssignment_13 ) ) )
            // InternalGame.g:1632:1: ( ( rule__Person__PositionAssignment_13 ) )
            {
            // InternalGame.g:1632:1: ( ( rule__Person__PositionAssignment_13 ) )
            // InternalGame.g:1633:2: ( rule__Person__PositionAssignment_13 )
            {
             before(grammarAccess.getPersonAccess().getPositionAssignment_13()); 
            // InternalGame.g:1634:2: ( rule__Person__PositionAssignment_13 )
            // InternalGame.g:1634:3: rule__Person__PositionAssignment_13
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
    // InternalGame.g:1642:1: rule__Person__Group__14 : rule__Person__Group__14__Impl rule__Person__Group__15 ;
    public final void rule__Person__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1646:1: ( rule__Person__Group__14__Impl rule__Person__Group__15 )
            // InternalGame.g:1647:2: rule__Person__Group__14__Impl rule__Person__Group__15
            {
            pushFollow(FOLLOW_22);
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
    // InternalGame.g:1654:1: rule__Person__Group__14__Impl : ( ';' ) ;
    public final void rule__Person__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1658:1: ( ( ';' ) )
            // InternalGame.g:1659:1: ( ';' )
            {
            // InternalGame.g:1659:1: ( ';' )
            // InternalGame.g:1660:2: ';'
            {
             before(grammarAccess.getPersonAccess().getSemicolonKeyword_14()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:1669:1: rule__Person__Group__15 : rule__Person__Group__15__Impl rule__Person__Group__16 ;
    public final void rule__Person__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1673:1: ( rule__Person__Group__15__Impl rule__Person__Group__16 )
            // InternalGame.g:1674:2: rule__Person__Group__15__Impl rule__Person__Group__16
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
    // InternalGame.g:1681:1: rule__Person__Group__15__Impl : ( 'action' ) ;
    public final void rule__Person__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1685:1: ( ( 'action' ) )
            // InternalGame.g:1686:1: ( 'action' )
            {
            // InternalGame.g:1686:1: ( 'action' )
            // InternalGame.g:1687:2: 'action'
            {
             before(grammarAccess.getPersonAccess().getActionKeyword_15()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGame.g:1696:1: rule__Person__Group__16 : rule__Person__Group__16__Impl rule__Person__Group__17 ;
    public final void rule__Person__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1700:1: ( rule__Person__Group__16__Impl rule__Person__Group__17 )
            // InternalGame.g:1701:2: rule__Person__Group__16__Impl rule__Person__Group__17
            {
            pushFollow(FOLLOW_23);
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
    // InternalGame.g:1708:1: rule__Person__Group__16__Impl : ( '=' ) ;
    public final void rule__Person__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1712:1: ( ( '=' ) )
            // InternalGame.g:1713:1: ( '=' )
            {
            // InternalGame.g:1713:1: ( '=' )
            // InternalGame.g:1714:2: '='
            {
             before(grammarAccess.getPersonAccess().getEqualsSignKeyword_16()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:1723:1: rule__Person__Group__17 : rule__Person__Group__17__Impl rule__Person__Group__18 ;
    public final void rule__Person__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1727:1: ( rule__Person__Group__17__Impl rule__Person__Group__18 )
            // InternalGame.g:1728:2: rule__Person__Group__17__Impl rule__Person__Group__18
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
    // InternalGame.g:1735:1: rule__Person__Group__17__Impl : ( ( rule__Person__ActionAssignment_17 ) ) ;
    public final void rule__Person__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1739:1: ( ( ( rule__Person__ActionAssignment_17 ) ) )
            // InternalGame.g:1740:1: ( ( rule__Person__ActionAssignment_17 ) )
            {
            // InternalGame.g:1740:1: ( ( rule__Person__ActionAssignment_17 ) )
            // InternalGame.g:1741:2: ( rule__Person__ActionAssignment_17 )
            {
             before(grammarAccess.getPersonAccess().getActionAssignment_17()); 
            // InternalGame.g:1742:2: ( rule__Person__ActionAssignment_17 )
            // InternalGame.g:1742:3: rule__Person__ActionAssignment_17
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
    // InternalGame.g:1750:1: rule__Person__Group__18 : rule__Person__Group__18__Impl rule__Person__Group__19 ;
    public final void rule__Person__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1754:1: ( rule__Person__Group__18__Impl rule__Person__Group__19 )
            // InternalGame.g:1755:2: rule__Person__Group__18__Impl rule__Person__Group__19
            {
            pushFollow(FOLLOW_24);
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
    // InternalGame.g:1762:1: rule__Person__Group__18__Impl : ( ';' ) ;
    public final void rule__Person__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1766:1: ( ( ';' ) )
            // InternalGame.g:1767:1: ( ';' )
            {
            // InternalGame.g:1767:1: ( ';' )
            // InternalGame.g:1768:2: ';'
            {
             before(grammarAccess.getPersonAccess().getSemicolonKeyword_18()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:1777:1: rule__Person__Group__19 : rule__Person__Group__19__Impl rule__Person__Group__20 ;
    public final void rule__Person__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1781:1: ( rule__Person__Group__19__Impl rule__Person__Group__20 )
            // InternalGame.g:1782:2: rule__Person__Group__19__Impl rule__Person__Group__20
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
    // InternalGame.g:1789:1: rule__Person__Group__19__Impl : ( 'objects' ) ;
    public final void rule__Person__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1793:1: ( ( 'objects' ) )
            // InternalGame.g:1794:1: ( 'objects' )
            {
            // InternalGame.g:1794:1: ( 'objects' )
            // InternalGame.g:1795:2: 'objects'
            {
             before(grammarAccess.getPersonAccess().getObjectsKeyword_19()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGame.g:1804:1: rule__Person__Group__20 : rule__Person__Group__20__Impl rule__Person__Group__21 ;
    public final void rule__Person__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1808:1: ( rule__Person__Group__20__Impl rule__Person__Group__21 )
            // InternalGame.g:1809:2: rule__Person__Group__20__Impl rule__Person__Group__21
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
    // InternalGame.g:1816:1: rule__Person__Group__20__Impl : ( '{' ) ;
    public final void rule__Person__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1820:1: ( ( '{' ) )
            // InternalGame.g:1821:1: ( '{' )
            {
            // InternalGame.g:1821:1: ( '{' )
            // InternalGame.g:1822:2: '{'
            {
             before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_20()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGame.g:1831:1: rule__Person__Group__21 : rule__Person__Group__21__Impl rule__Person__Group__22 ;
    public final void rule__Person__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1835:1: ( rule__Person__Group__21__Impl rule__Person__Group__22 )
            // InternalGame.g:1836:2: rule__Person__Group__21__Impl rule__Person__Group__22
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
    // InternalGame.g:1843:1: rule__Person__Group__21__Impl : ( ( rule__Person__ObjectsAssignment_21 ) ) ;
    public final void rule__Person__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1847:1: ( ( ( rule__Person__ObjectsAssignment_21 ) ) )
            // InternalGame.g:1848:1: ( ( rule__Person__ObjectsAssignment_21 ) )
            {
            // InternalGame.g:1848:1: ( ( rule__Person__ObjectsAssignment_21 ) )
            // InternalGame.g:1849:2: ( rule__Person__ObjectsAssignment_21 )
            {
             before(grammarAccess.getPersonAccess().getObjectsAssignment_21()); 
            // InternalGame.g:1850:2: ( rule__Person__ObjectsAssignment_21 )
            // InternalGame.g:1850:3: rule__Person__ObjectsAssignment_21
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
    // InternalGame.g:1858:1: rule__Person__Group__22 : rule__Person__Group__22__Impl rule__Person__Group__23 ;
    public final void rule__Person__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1862:1: ( rule__Person__Group__22__Impl rule__Person__Group__23 )
            // InternalGame.g:1863:2: rule__Person__Group__22__Impl rule__Person__Group__23
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
    // InternalGame.g:1870:1: rule__Person__Group__22__Impl : ( '}' ) ;
    public final void rule__Person__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1874:1: ( ( '}' ) )
            // InternalGame.g:1875:1: ( '}' )
            {
            // InternalGame.g:1875:1: ( '}' )
            // InternalGame.g:1876:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_22()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGame.g:1885:1: rule__Person__Group__23 : rule__Person__Group__23__Impl rule__Person__Group__24 ;
    public final void rule__Person__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1889:1: ( rule__Person__Group__23__Impl rule__Person__Group__24 )
            // InternalGame.g:1890:2: rule__Person__Group__23__Impl rule__Person__Group__24
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
    // InternalGame.g:1897:1: rule__Person__Group__23__Impl : ( 'final' ) ;
    public final void rule__Person__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1901:1: ( ( 'final' ) )
            // InternalGame.g:1902:1: ( 'final' )
            {
            // InternalGame.g:1902:1: ( 'final' )
            // InternalGame.g:1903:2: 'final'
            {
             before(grammarAccess.getPersonAccess().getFinalKeyword_23()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGame.g:1912:1: rule__Person__Group__24 : rule__Person__Group__24__Impl rule__Person__Group__25 ;
    public final void rule__Person__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1916:1: ( rule__Person__Group__24__Impl rule__Person__Group__25 )
            // InternalGame.g:1917:2: rule__Person__Group__24__Impl rule__Person__Group__25
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
    // InternalGame.g:1924:1: rule__Person__Group__24__Impl : ( '=' ) ;
    public final void rule__Person__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1928:1: ( ( '=' ) )
            // InternalGame.g:1929:1: ( '=' )
            {
            // InternalGame.g:1929:1: ( '=' )
            // InternalGame.g:1930:2: '='
            {
             before(grammarAccess.getPersonAccess().getEqualsSignKeyword_24()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:1939:1: rule__Person__Group__25 : rule__Person__Group__25__Impl rule__Person__Group__26 ;
    public final void rule__Person__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1943:1: ( rule__Person__Group__25__Impl rule__Person__Group__26 )
            // InternalGame.g:1944:2: rule__Person__Group__25__Impl rule__Person__Group__26
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
    // InternalGame.g:1951:1: rule__Person__Group__25__Impl : ( ( rule__Person__FinalObjectAssignment_25 ) ) ;
    public final void rule__Person__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1955:1: ( ( ( rule__Person__FinalObjectAssignment_25 ) ) )
            // InternalGame.g:1956:1: ( ( rule__Person__FinalObjectAssignment_25 ) )
            {
            // InternalGame.g:1956:1: ( ( rule__Person__FinalObjectAssignment_25 ) )
            // InternalGame.g:1957:2: ( rule__Person__FinalObjectAssignment_25 )
            {
             before(grammarAccess.getPersonAccess().getFinalObjectAssignment_25()); 
            // InternalGame.g:1958:2: ( rule__Person__FinalObjectAssignment_25 )
            // InternalGame.g:1958:3: rule__Person__FinalObjectAssignment_25
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
    // InternalGame.g:1966:1: rule__Person__Group__26 : rule__Person__Group__26__Impl rule__Person__Group__27 ;
    public final void rule__Person__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1970:1: ( rule__Person__Group__26__Impl rule__Person__Group__27 )
            // InternalGame.g:1971:2: rule__Person__Group__26__Impl rule__Person__Group__27
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
    // InternalGame.g:1978:1: rule__Person__Group__26__Impl : ( ';' ) ;
    public final void rule__Person__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1982:1: ( ( ';' ) )
            // InternalGame.g:1983:1: ( ';' )
            {
            // InternalGame.g:1983:1: ( ';' )
            // InternalGame.g:1984:2: ';'
            {
             before(grammarAccess.getPersonAccess().getSemicolonKeyword_26()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:1993:1: rule__Person__Group__27 : rule__Person__Group__27__Impl ;
    public final void rule__Person__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1997:1: ( rule__Person__Group__27__Impl )
            // InternalGame.g:1998:2: rule__Person__Group__27__Impl
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
    // InternalGame.g:2004:1: rule__Person__Group__27__Impl : ( '}' ) ;
    public final void rule__Person__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2008:1: ( ( '}' ) )
            // InternalGame.g:2009:1: ( '}' )
            {
            // InternalGame.g:2009:1: ( '}' )
            // InternalGame.g:2010:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_27()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGame.g:2020:1: rule__Person_R__Group__0 : rule__Person_R__Group__0__Impl rule__Person_R__Group__1 ;
    public final void rule__Person_R__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2024:1: ( rule__Person_R__Group__0__Impl rule__Person_R__Group__1 )
            // InternalGame.g:2025:2: rule__Person_R__Group__0__Impl rule__Person_R__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalGame.g:2032:1: rule__Person_R__Group__0__Impl : ( RULE_STRING ) ;
    public final void rule__Person_R__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2036:1: ( ( RULE_STRING ) )
            // InternalGame.g:2037:1: ( RULE_STRING )
            {
            // InternalGame.g:2037:1: ( RULE_STRING )
            // InternalGame.g:2038:2: RULE_STRING
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
    // InternalGame.g:2047:1: rule__Person_R__Group__1 : rule__Person_R__Group__1__Impl ;
    public final void rule__Person_R__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2051:1: ( rule__Person_R__Group__1__Impl )
            // InternalGame.g:2052:2: rule__Person_R__Group__1__Impl
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
    // InternalGame.g:2058:1: rule__Person_R__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__Person_R__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2062:1: ( ( ( ',' )? ) )
            // InternalGame.g:2063:1: ( ( ',' )? )
            {
            // InternalGame.g:2063:1: ( ( ',' )? )
            // InternalGame.g:2064:2: ( ',' )?
            {
             before(grammarAccess.getPerson_RAccess().getCommaKeyword_1()); 
            // InternalGame.g:2065:2: ( ',' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGame.g:2065:3: ','
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalGame.g:2074:1: rule__Person_O__Group__0 : rule__Person_O__Group__0__Impl rule__Person_O__Group__1 ;
    public final void rule__Person_O__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2078:1: ( rule__Person_O__Group__0__Impl rule__Person_O__Group__1 )
            // InternalGame.g:2079:2: rule__Person_O__Group__0__Impl rule__Person_O__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalGame.g:2086:1: rule__Person_O__Group__0__Impl : ( ( rule__Person_O__ItemsAssignment_0 ) ) ;
    public final void rule__Person_O__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2090:1: ( ( ( rule__Person_O__ItemsAssignment_0 ) ) )
            // InternalGame.g:2091:1: ( ( rule__Person_O__ItemsAssignment_0 ) )
            {
            // InternalGame.g:2091:1: ( ( rule__Person_O__ItemsAssignment_0 ) )
            // InternalGame.g:2092:2: ( rule__Person_O__ItemsAssignment_0 )
            {
             before(grammarAccess.getPerson_OAccess().getItemsAssignment_0()); 
            // InternalGame.g:2093:2: ( rule__Person_O__ItemsAssignment_0 )
            // InternalGame.g:2093:3: rule__Person_O__ItemsAssignment_0
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
    // InternalGame.g:2101:1: rule__Person_O__Group__1 : rule__Person_O__Group__1__Impl ;
    public final void rule__Person_O__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2105:1: ( rule__Person_O__Group__1__Impl )
            // InternalGame.g:2106:2: rule__Person_O__Group__1__Impl
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
    // InternalGame.g:2112:1: rule__Person_O__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__Person_O__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2116:1: ( ( ( ',' )? ) )
            // InternalGame.g:2117:1: ( ( ',' )? )
            {
            // InternalGame.g:2117:1: ( ( ',' )? )
            // InternalGame.g:2118:2: ( ',' )?
            {
             before(grammarAccess.getPerson_OAccess().getCommaKeyword_1()); 
            // InternalGame.g:2119:2: ( ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGame.g:2119:3: ','
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalGame.g:2128:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2132:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalGame.g:2133:2: rule__Object__Group__0__Impl rule__Object__Group__1
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
    // InternalGame.g:2140:1: rule__Object__Group__0__Impl : ( ( rule__Object__NameAssignment_0 ) ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2144:1: ( ( ( rule__Object__NameAssignment_0 ) ) )
            // InternalGame.g:2145:1: ( ( rule__Object__NameAssignment_0 ) )
            {
            // InternalGame.g:2145:1: ( ( rule__Object__NameAssignment_0 ) )
            // InternalGame.g:2146:2: ( rule__Object__NameAssignment_0 )
            {
             before(grammarAccess.getObjectAccess().getNameAssignment_0()); 
            // InternalGame.g:2147:2: ( rule__Object__NameAssignment_0 )
            // InternalGame.g:2147:3: rule__Object__NameAssignment_0
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
    // InternalGame.g:2155:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2159:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalGame.g:2160:2: rule__Object__Group__1__Impl rule__Object__Group__2
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
    // InternalGame.g:2167:1: rule__Object__Group__1__Impl : ( '=' ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2171:1: ( ( '=' ) )
            // InternalGame.g:2172:1: ( '=' )
            {
            // InternalGame.g:2172:1: ( '=' )
            // InternalGame.g:2173:2: '='
            {
             before(grammarAccess.getObjectAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:2182:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2186:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalGame.g:2187:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalGame.g:2194:1: rule__Object__Group__2__Impl : ( '{' ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2198:1: ( ( '{' ) )
            // InternalGame.g:2199:1: ( '{' )
            {
            // InternalGame.g:2199:1: ( '{' )
            // InternalGame.g:2200:2: '{'
            {
             before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGame.g:2209:1: rule__Object__Group__3 : rule__Object__Group__3__Impl rule__Object__Group__4 ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2213:1: ( rule__Object__Group__3__Impl rule__Object__Group__4 )
            // InternalGame.g:2214:2: rule__Object__Group__3__Impl rule__Object__Group__4
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
    // InternalGame.g:2221:1: rule__Object__Group__3__Impl : ( 'type' ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2225:1: ( ( 'type' ) )
            // InternalGame.g:2226:1: ( 'type' )
            {
            // InternalGame.g:2226:1: ( 'type' )
            // InternalGame.g:2227:2: 'type'
            {
             before(grammarAccess.getObjectAccess().getTypeKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGame.g:2236:1: rule__Object__Group__4 : rule__Object__Group__4__Impl rule__Object__Group__5 ;
    public final void rule__Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2240:1: ( rule__Object__Group__4__Impl rule__Object__Group__5 )
            // InternalGame.g:2241:2: rule__Object__Group__4__Impl rule__Object__Group__5
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
    // InternalGame.g:2248:1: rule__Object__Group__4__Impl : ( '=' ) ;
    public final void rule__Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2252:1: ( ( '=' ) )
            // InternalGame.g:2253:1: ( '=' )
            {
            // InternalGame.g:2253:1: ( '=' )
            // InternalGame.g:2254:2: '='
            {
             before(grammarAccess.getObjectAccess().getEqualsSignKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:2263:1: rule__Object__Group__5 : rule__Object__Group__5__Impl rule__Object__Group__6 ;
    public final void rule__Object__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2267:1: ( rule__Object__Group__5__Impl rule__Object__Group__6 )
            // InternalGame.g:2268:2: rule__Object__Group__5__Impl rule__Object__Group__6
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
    // InternalGame.g:2275:1: rule__Object__Group__5__Impl : ( ( rule__Object__TypeAssignment_5 ) ) ;
    public final void rule__Object__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2279:1: ( ( ( rule__Object__TypeAssignment_5 ) ) )
            // InternalGame.g:2280:1: ( ( rule__Object__TypeAssignment_5 ) )
            {
            // InternalGame.g:2280:1: ( ( rule__Object__TypeAssignment_5 ) )
            // InternalGame.g:2281:2: ( rule__Object__TypeAssignment_5 )
            {
             before(grammarAccess.getObjectAccess().getTypeAssignment_5()); 
            // InternalGame.g:2282:2: ( rule__Object__TypeAssignment_5 )
            // InternalGame.g:2282:3: rule__Object__TypeAssignment_5
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
    // InternalGame.g:2290:1: rule__Object__Group__6 : rule__Object__Group__6__Impl rule__Object__Group__7 ;
    public final void rule__Object__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2294:1: ( rule__Object__Group__6__Impl rule__Object__Group__7 )
            // InternalGame.g:2295:2: rule__Object__Group__6__Impl rule__Object__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalGame.g:2302:1: rule__Object__Group__6__Impl : ( ';' ) ;
    public final void rule__Object__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2306:1: ( ( ';' ) )
            // InternalGame.g:2307:1: ( ';' )
            {
            // InternalGame.g:2307:1: ( ';' )
            // InternalGame.g:2308:2: ';'
            {
             before(grammarAccess.getObjectAccess().getSemicolonKeyword_6()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:2317:1: rule__Object__Group__7 : rule__Object__Group__7__Impl rule__Object__Group__8 ;
    public final void rule__Object__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2321:1: ( rule__Object__Group__7__Impl rule__Object__Group__8 )
            // InternalGame.g:2322:2: rule__Object__Group__7__Impl rule__Object__Group__8
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
    // InternalGame.g:2329:1: rule__Object__Group__7__Impl : ( 'response' ) ;
    public final void rule__Object__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2333:1: ( ( 'response' ) )
            // InternalGame.g:2334:1: ( 'response' )
            {
            // InternalGame.g:2334:1: ( 'response' )
            // InternalGame.g:2335:2: 'response'
            {
             before(grammarAccess.getObjectAccess().getResponseKeyword_7()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGame.g:2344:1: rule__Object__Group__8 : rule__Object__Group__8__Impl rule__Object__Group__9 ;
    public final void rule__Object__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2348:1: ( rule__Object__Group__8__Impl rule__Object__Group__9 )
            // InternalGame.g:2349:2: rule__Object__Group__8__Impl rule__Object__Group__9
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:2356:1: rule__Object__Group__8__Impl : ( '=' ) ;
    public final void rule__Object__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2360:1: ( ( '=' ) )
            // InternalGame.g:2361:1: ( '=' )
            {
            // InternalGame.g:2361:1: ( '=' )
            // InternalGame.g:2362:2: '='
            {
             before(grammarAccess.getObjectAccess().getEqualsSignKeyword_8()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:2371:1: rule__Object__Group__9 : rule__Object__Group__9__Impl rule__Object__Group__10 ;
    public final void rule__Object__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2375:1: ( rule__Object__Group__9__Impl rule__Object__Group__10 )
            // InternalGame.g:2376:2: rule__Object__Group__9__Impl rule__Object__Group__10
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
    // InternalGame.g:2383:1: rule__Object__Group__9__Impl : ( ( rule__Object__ResponseAssignment_9 ) ) ;
    public final void rule__Object__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2387:1: ( ( ( rule__Object__ResponseAssignment_9 ) ) )
            // InternalGame.g:2388:1: ( ( rule__Object__ResponseAssignment_9 ) )
            {
            // InternalGame.g:2388:1: ( ( rule__Object__ResponseAssignment_9 ) )
            // InternalGame.g:2389:2: ( rule__Object__ResponseAssignment_9 )
            {
             before(grammarAccess.getObjectAccess().getResponseAssignment_9()); 
            // InternalGame.g:2390:2: ( rule__Object__ResponseAssignment_9 )
            // InternalGame.g:2390:3: rule__Object__ResponseAssignment_9
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
    // InternalGame.g:2398:1: rule__Object__Group__10 : rule__Object__Group__10__Impl rule__Object__Group__11 ;
    public final void rule__Object__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2402:1: ( rule__Object__Group__10__Impl rule__Object__Group__11 )
            // InternalGame.g:2403:2: rule__Object__Group__10__Impl rule__Object__Group__11
            {
            pushFollow(FOLLOW_21);
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
    // InternalGame.g:2410:1: rule__Object__Group__10__Impl : ( ';' ) ;
    public final void rule__Object__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2414:1: ( ( ';' ) )
            // InternalGame.g:2415:1: ( ';' )
            {
            // InternalGame.g:2415:1: ( ';' )
            // InternalGame.g:2416:2: ';'
            {
             before(grammarAccess.getObjectAccess().getSemicolonKeyword_10()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:2425:1: rule__Object__Group__11 : rule__Object__Group__11__Impl rule__Object__Group__12 ;
    public final void rule__Object__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2429:1: ( rule__Object__Group__11__Impl rule__Object__Group__12 )
            // InternalGame.g:2430:2: rule__Object__Group__11__Impl rule__Object__Group__12
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
    // InternalGame.g:2437:1: rule__Object__Group__11__Impl : ( 'position' ) ;
    public final void rule__Object__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2441:1: ( ( 'position' ) )
            // InternalGame.g:2442:1: ( 'position' )
            {
            // InternalGame.g:2442:1: ( 'position' )
            // InternalGame.g:2443:2: 'position'
            {
             before(grammarAccess.getObjectAccess().getPositionKeyword_11()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGame.g:2452:1: rule__Object__Group__12 : rule__Object__Group__12__Impl rule__Object__Group__13 ;
    public final void rule__Object__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2456:1: ( rule__Object__Group__12__Impl rule__Object__Group__13 )
            // InternalGame.g:2457:2: rule__Object__Group__12__Impl rule__Object__Group__13
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:2464:1: rule__Object__Group__12__Impl : ( '=' ) ;
    public final void rule__Object__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2468:1: ( ( '=' ) )
            // InternalGame.g:2469:1: ( '=' )
            {
            // InternalGame.g:2469:1: ( '=' )
            // InternalGame.g:2470:2: '='
            {
             before(grammarAccess.getObjectAccess().getEqualsSignKeyword_12()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:2479:1: rule__Object__Group__13 : rule__Object__Group__13__Impl rule__Object__Group__14 ;
    public final void rule__Object__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2483:1: ( rule__Object__Group__13__Impl rule__Object__Group__14 )
            // InternalGame.g:2484:2: rule__Object__Group__13__Impl rule__Object__Group__14
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
    // InternalGame.g:2491:1: rule__Object__Group__13__Impl : ( ( rule__Object__PositionAssignment_13 ) ) ;
    public final void rule__Object__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2495:1: ( ( ( rule__Object__PositionAssignment_13 ) ) )
            // InternalGame.g:2496:1: ( ( rule__Object__PositionAssignment_13 ) )
            {
            // InternalGame.g:2496:1: ( ( rule__Object__PositionAssignment_13 ) )
            // InternalGame.g:2497:2: ( rule__Object__PositionAssignment_13 )
            {
             before(grammarAccess.getObjectAccess().getPositionAssignment_13()); 
            // InternalGame.g:2498:2: ( rule__Object__PositionAssignment_13 )
            // InternalGame.g:2498:3: rule__Object__PositionAssignment_13
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
    // InternalGame.g:2506:1: rule__Object__Group__14 : rule__Object__Group__14__Impl rule__Object__Group__15 ;
    public final void rule__Object__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2510:1: ( rule__Object__Group__14__Impl rule__Object__Group__15 )
            // InternalGame.g:2511:2: rule__Object__Group__14__Impl rule__Object__Group__15
            {
            pushFollow(FOLLOW_22);
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
    // InternalGame.g:2518:1: rule__Object__Group__14__Impl : ( ';' ) ;
    public final void rule__Object__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2522:1: ( ( ';' ) )
            // InternalGame.g:2523:1: ( ';' )
            {
            // InternalGame.g:2523:1: ( ';' )
            // InternalGame.g:2524:2: ';'
            {
             before(grammarAccess.getObjectAccess().getSemicolonKeyword_14()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:2533:1: rule__Object__Group__15 : rule__Object__Group__15__Impl rule__Object__Group__16 ;
    public final void rule__Object__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2537:1: ( rule__Object__Group__15__Impl rule__Object__Group__16 )
            // InternalGame.g:2538:2: rule__Object__Group__15__Impl rule__Object__Group__16
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
    // InternalGame.g:2545:1: rule__Object__Group__15__Impl : ( 'action' ) ;
    public final void rule__Object__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2549:1: ( ( 'action' ) )
            // InternalGame.g:2550:1: ( 'action' )
            {
            // InternalGame.g:2550:1: ( 'action' )
            // InternalGame.g:2551:2: 'action'
            {
             before(grammarAccess.getObjectAccess().getActionKeyword_15()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGame.g:2560:1: rule__Object__Group__16 : rule__Object__Group__16__Impl rule__Object__Group__17 ;
    public final void rule__Object__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2564:1: ( rule__Object__Group__16__Impl rule__Object__Group__17 )
            // InternalGame.g:2565:2: rule__Object__Group__16__Impl rule__Object__Group__17
            {
            pushFollow(FOLLOW_26);
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
    // InternalGame.g:2572:1: rule__Object__Group__16__Impl : ( '=' ) ;
    public final void rule__Object__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2576:1: ( ( '=' ) )
            // InternalGame.g:2577:1: ( '=' )
            {
            // InternalGame.g:2577:1: ( '=' )
            // InternalGame.g:2578:2: '='
            {
             before(grammarAccess.getObjectAccess().getEqualsSignKeyword_16()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:2587:1: rule__Object__Group__17 : rule__Object__Group__17__Impl rule__Object__Group__18 ;
    public final void rule__Object__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2591:1: ( rule__Object__Group__17__Impl rule__Object__Group__18 )
            // InternalGame.g:2592:2: rule__Object__Group__17__Impl rule__Object__Group__18
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
    // InternalGame.g:2599:1: rule__Object__Group__17__Impl : ( ( rule__Object__ActionAssignment_17 ) ) ;
    public final void rule__Object__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2603:1: ( ( ( rule__Object__ActionAssignment_17 ) ) )
            // InternalGame.g:2604:1: ( ( rule__Object__ActionAssignment_17 ) )
            {
            // InternalGame.g:2604:1: ( ( rule__Object__ActionAssignment_17 ) )
            // InternalGame.g:2605:2: ( rule__Object__ActionAssignment_17 )
            {
             before(grammarAccess.getObjectAccess().getActionAssignment_17()); 
            // InternalGame.g:2606:2: ( rule__Object__ActionAssignment_17 )
            // InternalGame.g:2606:3: rule__Object__ActionAssignment_17
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
    // InternalGame.g:2614:1: rule__Object__Group__18 : rule__Object__Group__18__Impl rule__Object__Group__19 ;
    public final void rule__Object__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2618:1: ( rule__Object__Group__18__Impl rule__Object__Group__19 )
            // InternalGame.g:2619:2: rule__Object__Group__18__Impl rule__Object__Group__19
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
    // InternalGame.g:2626:1: rule__Object__Group__18__Impl : ( ';' ) ;
    public final void rule__Object__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2630:1: ( ( ';' ) )
            // InternalGame.g:2631:1: ( ';' )
            {
            // InternalGame.g:2631:1: ( ';' )
            // InternalGame.g:2632:2: ';'
            {
             before(grammarAccess.getObjectAccess().getSemicolonKeyword_18()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:2641:1: rule__Object__Group__19 : rule__Object__Group__19__Impl ;
    public final void rule__Object__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2645:1: ( rule__Object__Group__19__Impl )
            // InternalGame.g:2646:2: rule__Object__Group__19__Impl
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
    // InternalGame.g:2652:1: rule__Object__Group__19__Impl : ( '}' ) ;
    public final void rule__Object__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2656:1: ( ( '}' ) )
            // InternalGame.g:2657:1: ( '}' )
            {
            // InternalGame.g:2657:1: ( '}' )
            // InternalGame.g:2658:2: '}'
            {
             before(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_19()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGame.g:2668:1: rule__Game__ScenesAssignment : ( ruleScene ) ;
    public final void rule__Game__ScenesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2672:1: ( ( ruleScene ) )
            // InternalGame.g:2673:2: ( ruleScene )
            {
            // InternalGame.g:2673:2: ( ruleScene )
            // InternalGame.g:2674:3: ruleScene
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
    // InternalGame.g:2683:1: rule__Scene__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Scene__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2687:1: ( ( RULE_ID ) )
            // InternalGame.g:2688:2: ( RULE_ID )
            {
            // InternalGame.g:2688:2: ( RULE_ID )
            // InternalGame.g:2689:3: RULE_ID
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
    // InternalGame.g:2698:1: rule__Scene__DeclartionsAssignment_3 : ( ruleLevelDeclaration ) ;
    public final void rule__Scene__DeclartionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2702:1: ( ( ruleLevelDeclaration ) )
            // InternalGame.g:2703:2: ( ruleLevelDeclaration )
            {
            // InternalGame.g:2703:2: ( ruleLevelDeclaration )
            // InternalGame.g:2704:3: ruleLevelDeclaration
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
    // InternalGame.g:2713:1: rule__Scene__DefinitionsAssignment_4 : ( ruleLevelDefinition ) ;
    public final void rule__Scene__DefinitionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2717:1: ( ( ruleLevelDefinition ) )
            // InternalGame.g:2718:2: ( ruleLevelDefinition )
            {
            // InternalGame.g:2718:2: ( ruleLevelDefinition )
            // InternalGame.g:2719:3: ruleLevelDefinition
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
    // InternalGame.g:2728:1: rule__Scene__StartLevelAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Scene__StartLevelAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2732:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2733:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2733:2: ( ( RULE_ID ) )
            // InternalGame.g:2734:3: ( RULE_ID )
            {
             before(grammarAccess.getSceneAccess().getStartLevelLevelDeclarationCrossReference_7_0()); 
            // InternalGame.g:2735:3: ( RULE_ID )
            // InternalGame.g:2736:4: RULE_ID
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
    // InternalGame.g:2747:1: rule__Scene__FinalLevelAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__Scene__FinalLevelAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2751:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2752:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2752:2: ( ( RULE_ID ) )
            // InternalGame.g:2753:3: ( RULE_ID )
            {
             before(grammarAccess.getSceneAccess().getFinalLevelLevelDeclarationCrossReference_11_0()); 
            // InternalGame.g:2754:3: ( RULE_ID )
            // InternalGame.g:2755:4: RULE_ID
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
    // InternalGame.g:2766:1: rule__LevelDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LevelDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2770:1: ( ( RULE_ID ) )
            // InternalGame.g:2771:2: ( RULE_ID )
            {
            // InternalGame.g:2771:2: ( RULE_ID )
            // InternalGame.g:2772:3: RULE_ID
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
    // InternalGame.g:2781:1: rule__LevelDefinition__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__LevelDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2785:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2786:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2786:2: ( ( RULE_ID ) )
            // InternalGame.g:2787:3: ( RULE_ID )
            {
             before(grammarAccess.getLevelDefinitionAccess().getNameLevelDeclarationCrossReference_0_0()); 
            // InternalGame.g:2788:3: ( RULE_ID )
            // InternalGame.g:2789:4: RULE_ID
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
    // InternalGame.g:2800:1: rule__LevelDefinition__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__LevelDefinition__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2804:1: ( ( ruleDescription ) )
            // InternalGame.g:2805:2: ( ruleDescription )
            {
            // InternalGame.g:2805:2: ( ruleDescription )
            // InternalGame.g:2806:3: ruleDescription
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
    // InternalGame.g:2815:1: rule__LevelDefinition__PersonsAssignment_4 : ( rulePerson ) ;
    public final void rule__LevelDefinition__PersonsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2819:1: ( ( rulePerson ) )
            // InternalGame.g:2820:2: ( rulePerson )
            {
            // InternalGame.g:2820:2: ( rulePerson )
            // InternalGame.g:2821:3: rulePerson
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
    // InternalGame.g:2830:1: rule__LevelDefinition__ObjectsAssignment_5 : ( ruleObject ) ;
    public final void rule__LevelDefinition__ObjectsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2834:1: ( ( ruleObject ) )
            // InternalGame.g:2835:2: ( ruleObject )
            {
            // InternalGame.g:2835:2: ( ruleObject )
            // InternalGame.g:2836:3: ruleObject
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


    // $ANTLR start "rule__LevelDefinition__ActionsAssignment_6"
    // InternalGame.g:2845:1: rule__LevelDefinition__ActionsAssignment_6 : ( ruleAction_GLOBAL ) ;
    public final void rule__LevelDefinition__ActionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2849:1: ( ( ruleAction_GLOBAL ) )
            // InternalGame.g:2850:2: ( ruleAction_GLOBAL )
            {
            // InternalGame.g:2850:2: ( ruleAction_GLOBAL )
            // InternalGame.g:2851:3: ruleAction_GLOBAL
            {
             before(grammarAccess.getLevelDefinitionAccess().getActionsAction_GLOBALEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAction_GLOBAL();

            state._fsp--;

             after(grammarAccess.getLevelDefinitionAccess().getActionsAction_GLOBALEnumRuleCall_6_0()); 

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
    // $ANTLR end "rule__LevelDefinition__ActionsAssignment_6"


    // $ANTLR start "rule__LevelDefinition__NextAssignment_7_2"
    // InternalGame.g:2860:1: rule__LevelDefinition__NextAssignment_7_2 : ( ( RULE_ID ) ) ;
    public final void rule__LevelDefinition__NextAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2864:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2865:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2865:2: ( ( RULE_ID ) )
            // InternalGame.g:2866:3: ( RULE_ID )
            {
             before(grammarAccess.getLevelDefinitionAccess().getNextLevelDeclarationCrossReference_7_2_0()); 
            // InternalGame.g:2867:3: ( RULE_ID )
            // InternalGame.g:2868:4: RULE_ID
            {
             before(grammarAccess.getLevelDefinitionAccess().getNextLevelDeclarationIDTerminalRuleCall_7_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getNextLevelDeclarationIDTerminalRuleCall_7_2_0_1()); 

            }

             after(grammarAccess.getLevelDefinitionAccess().getNextLevelDeclarationCrossReference_7_2_0()); 

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
    // $ANTLR end "rule__LevelDefinition__NextAssignment_7_2"


    // $ANTLR start "rule__Description__NameAssignment_2"
    // InternalGame.g:2879:1: rule__Description__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Description__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2883:1: ( ( RULE_STRING ) )
            // InternalGame.g:2884:2: ( RULE_STRING )
            {
            // InternalGame.g:2884:2: ( RULE_STRING )
            // InternalGame.g:2885:3: RULE_STRING
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
    // InternalGame.g:2894:1: rule__Person__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Person__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2898:1: ( ( RULE_ID ) )
            // InternalGame.g:2899:2: ( RULE_ID )
            {
            // InternalGame.g:2899:2: ( RULE_ID )
            // InternalGame.g:2900:3: RULE_ID
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
    // InternalGame.g:2909:1: rule__Person__TypeAssignment_5 : ( RULE_ID ) ;
    public final void rule__Person__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2913:1: ( ( RULE_ID ) )
            // InternalGame.g:2914:2: ( RULE_ID )
            {
            // InternalGame.g:2914:2: ( RULE_ID )
            // InternalGame.g:2915:3: RULE_ID
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
    // InternalGame.g:2924:1: rule__Person__ResponseAssignment_9 : ( rulePerson_R ) ;
    public final void rule__Person__ResponseAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2928:1: ( ( rulePerson_R ) )
            // InternalGame.g:2929:2: ( rulePerson_R )
            {
            // InternalGame.g:2929:2: ( rulePerson_R )
            // InternalGame.g:2930:3: rulePerson_R
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
    // InternalGame.g:2939:1: rule__Person__PositionAssignment_13 : ( RULE_STRING ) ;
    public final void rule__Person__PositionAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2943:1: ( ( RULE_STRING ) )
            // InternalGame.g:2944:2: ( RULE_STRING )
            {
            // InternalGame.g:2944:2: ( RULE_STRING )
            // InternalGame.g:2945:3: RULE_STRING
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
    // InternalGame.g:2954:1: rule__Person__ActionAssignment_17 : ( ruleAction_P ) ;
    public final void rule__Person__ActionAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2958:1: ( ( ruleAction_P ) )
            // InternalGame.g:2959:2: ( ruleAction_P )
            {
            // InternalGame.g:2959:2: ( ruleAction_P )
            // InternalGame.g:2960:3: ruleAction_P
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
    // InternalGame.g:2969:1: rule__Person__ObjectsAssignment_21 : ( rulePerson_O ) ;
    public final void rule__Person__ObjectsAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2973:1: ( ( rulePerson_O ) )
            // InternalGame.g:2974:2: ( rulePerson_O )
            {
            // InternalGame.g:2974:2: ( rulePerson_O )
            // InternalGame.g:2975:3: rulePerson_O
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
    // InternalGame.g:2984:1: rule__Person__FinalObjectAssignment_25 : ( ( RULE_ID ) ) ;
    public final void rule__Person__FinalObjectAssignment_25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2988:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2989:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2989:2: ( ( RULE_ID ) )
            // InternalGame.g:2990:3: ( RULE_ID )
            {
             before(grammarAccess.getPersonAccess().getFinalObjectObjectCrossReference_25_0()); 
            // InternalGame.g:2991:3: ( RULE_ID )
            // InternalGame.g:2992:4: RULE_ID
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
    // InternalGame.g:3003:1: rule__Person_O__ItemsAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Person_O__ItemsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3007:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:3008:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:3008:2: ( ( RULE_ID ) )
            // InternalGame.g:3009:3: ( RULE_ID )
            {
             before(grammarAccess.getPerson_OAccess().getItemsObjectCrossReference_0_0()); 
            // InternalGame.g:3010:3: ( RULE_ID )
            // InternalGame.g:3011:4: RULE_ID
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
    // InternalGame.g:3022:1: rule__Object__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Object__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3026:1: ( ( RULE_ID ) )
            // InternalGame.g:3027:2: ( RULE_ID )
            {
            // InternalGame.g:3027:2: ( RULE_ID )
            // InternalGame.g:3028:3: RULE_ID
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
    // InternalGame.g:3037:1: rule__Object__TypeAssignment_5 : ( RULE_ID ) ;
    public final void rule__Object__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3041:1: ( ( RULE_ID ) )
            // InternalGame.g:3042:2: ( RULE_ID )
            {
            // InternalGame.g:3042:2: ( RULE_ID )
            // InternalGame.g:3043:3: RULE_ID
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
    // InternalGame.g:3052:1: rule__Object__ResponseAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Object__ResponseAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3056:1: ( ( RULE_STRING ) )
            // InternalGame.g:3057:2: ( RULE_STRING )
            {
            // InternalGame.g:3057:2: ( RULE_STRING )
            // InternalGame.g:3058:3: RULE_STRING
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
    // InternalGame.g:3067:1: rule__Object__PositionAssignment_13 : ( RULE_STRING ) ;
    public final void rule__Object__PositionAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3071:1: ( ( RULE_STRING ) )
            // InternalGame.g:3072:2: ( RULE_STRING )
            {
            // InternalGame.g:3072:2: ( RULE_STRING )
            // InternalGame.g:3073:3: RULE_STRING
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
    // InternalGame.g:3082:1: rule__Object__ActionAssignment_17 : ( ruleAction_O ) ;
    public final void rule__Object__ActionAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:3086:1: ( ( ruleAction_O ) )
            // InternalGame.g:3087:2: ( ruleAction_O )
            {
            // InternalGame.g:3087:2: ( ruleAction_O )
            // InternalGame.g:3088:3: ruleAction_O
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
    static final String dfa_2s = "\1\5\1\22\1\uffff\1\20\1\31\1\22\1\5\1\23\1\32\1\20\1\uffff";
    static final String dfa_3s = "\1\13\1\22\1\uffff\1\20\1\31\1\22\1\5\1\23\1\32\1\22\1\uffff";
    static final String dfa_4s = "\2\uffff\1\2\7\uffff\1\1";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\5\uffff\1\2",
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
            return "()* loopback of 932:2: ( rule__LevelDefinition__PersonsAssignment_4 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000420020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000006000L});

}