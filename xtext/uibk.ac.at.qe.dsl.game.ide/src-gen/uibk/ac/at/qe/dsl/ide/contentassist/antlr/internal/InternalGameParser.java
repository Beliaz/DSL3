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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'type_A'", "'On table'", "'male'", "'female'", "'Talk'", "'Pick'", "'use'", "'{'", "'}'", "'new'", "'start'", "'='", "';'", "'final'", "'level'", "'goal'", "'from'", "'to'", "'type'", "'response'", "'position'", "'action'"
    };
    public static final int RULE_STRING=5;
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
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
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
    // InternalGame.g:62:1: ruleGame : ( ( rule__Game__Group__0 ) ) ;
    public final void ruleGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:66:2: ( ( ( rule__Game__Group__0 ) ) )
            // InternalGame.g:67:2: ( ( rule__Game__Group__0 ) )
            {
            // InternalGame.g:67:2: ( ( rule__Game__Group__0 ) )
            // InternalGame.g:68:3: ( rule__Game__Group__0 )
            {
             before(grammarAccess.getGameAccess().getGroup()); 
            // InternalGame.g:69:3: ( rule__Game__Group__0 )
            // InternalGame.g:69:4: rule__Game__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGroup()); 

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


    // $ANTLR start "entryRuleDefinition"
    // InternalGame.g:78:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalGame.g:79:1: ( ruleDefinition EOF )
            // InternalGame.g:80:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalGame.g:87:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:91:2: ( ( ( rule__Definition__Group__0 ) ) )
            // InternalGame.g:92:2: ( ( rule__Definition__Group__0 ) )
            {
            // InternalGame.g:92:2: ( ( rule__Definition__Group__0 ) )
            // InternalGame.g:93:3: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // InternalGame.g:94:3: ( rule__Definition__Group__0 )
            // InternalGame.g:94:4: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleScene"
    // InternalGame.g:103:1: entryRuleScene : ruleScene EOF ;
    public final void entryRuleScene() throws RecognitionException {
        try {
            // InternalGame.g:104:1: ( ruleScene EOF )
            // InternalGame.g:105:1: ruleScene EOF
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
    // InternalGame.g:112:1: ruleScene : ( ( rule__Scene__Group__0 ) ) ;
    public final void ruleScene() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:116:2: ( ( ( rule__Scene__Group__0 ) ) )
            // InternalGame.g:117:2: ( ( rule__Scene__Group__0 ) )
            {
            // InternalGame.g:117:2: ( ( rule__Scene__Group__0 ) )
            // InternalGame.g:118:3: ( rule__Scene__Group__0 )
            {
             before(grammarAccess.getSceneAccess().getGroup()); 
            // InternalGame.g:119:3: ( rule__Scene__Group__0 )
            // InternalGame.g:119:4: rule__Scene__Group__0
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
    // InternalGame.g:128:1: entryRuleLevelDeclaration : ruleLevelDeclaration EOF ;
    public final void entryRuleLevelDeclaration() throws RecognitionException {
        try {
            // InternalGame.g:129:1: ( ruleLevelDeclaration EOF )
            // InternalGame.g:130:1: ruleLevelDeclaration EOF
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
    // InternalGame.g:137:1: ruleLevelDeclaration : ( ( rule__LevelDeclaration__Group__0 ) ) ;
    public final void ruleLevelDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:141:2: ( ( ( rule__LevelDeclaration__Group__0 ) ) )
            // InternalGame.g:142:2: ( ( rule__LevelDeclaration__Group__0 ) )
            {
            // InternalGame.g:142:2: ( ( rule__LevelDeclaration__Group__0 ) )
            // InternalGame.g:143:3: ( rule__LevelDeclaration__Group__0 )
            {
             before(grammarAccess.getLevelDeclarationAccess().getGroup()); 
            // InternalGame.g:144:3: ( rule__LevelDeclaration__Group__0 )
            // InternalGame.g:144:4: rule__LevelDeclaration__Group__0
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
    // InternalGame.g:153:1: entryRuleLevelDefinition : ruleLevelDefinition EOF ;
    public final void entryRuleLevelDefinition() throws RecognitionException {
        try {
            // InternalGame.g:154:1: ( ruleLevelDefinition EOF )
            // InternalGame.g:155:1: ruleLevelDefinition EOF
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
    // InternalGame.g:162:1: ruleLevelDefinition : ( ( rule__LevelDefinition__Group__0 ) ) ;
    public final void ruleLevelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:166:2: ( ( ( rule__LevelDefinition__Group__0 ) ) )
            // InternalGame.g:167:2: ( ( rule__LevelDefinition__Group__0 ) )
            {
            // InternalGame.g:167:2: ( ( rule__LevelDefinition__Group__0 ) )
            // InternalGame.g:168:3: ( rule__LevelDefinition__Group__0 )
            {
             before(grammarAccess.getLevelDefinitionAccess().getGroup()); 
            // InternalGame.g:169:3: ( rule__LevelDefinition__Group__0 )
            // InternalGame.g:169:4: rule__LevelDefinition__Group__0
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


    // $ANTLR start "entryRuleLevelTransition"
    // InternalGame.g:178:1: entryRuleLevelTransition : ruleLevelTransition EOF ;
    public final void entryRuleLevelTransition() throws RecognitionException {
        try {
            // InternalGame.g:179:1: ( ruleLevelTransition EOF )
            // InternalGame.g:180:1: ruleLevelTransition EOF
            {
             before(grammarAccess.getLevelTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleLevelTransition();

            state._fsp--;

             after(grammarAccess.getLevelTransitionRule()); 
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
    // $ANTLR end "entryRuleLevelTransition"


    // $ANTLR start "ruleLevelTransition"
    // InternalGame.g:187:1: ruleLevelTransition : ( ( rule__LevelTransition__Group__0 ) ) ;
    public final void ruleLevelTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:191:2: ( ( ( rule__LevelTransition__Group__0 ) ) )
            // InternalGame.g:192:2: ( ( rule__LevelTransition__Group__0 ) )
            {
            // InternalGame.g:192:2: ( ( rule__LevelTransition__Group__0 ) )
            // InternalGame.g:193:3: ( rule__LevelTransition__Group__0 )
            {
             before(grammarAccess.getLevelTransitionAccess().getGroup()); 
            // InternalGame.g:194:3: ( rule__LevelTransition__Group__0 )
            // InternalGame.g:194:4: rule__LevelTransition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LevelTransition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLevelTransitionAccess().getGroup()); 

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
    // $ANTLR end "ruleLevelTransition"


    // $ANTLR start "entryRulePerson"
    // InternalGame.g:203:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalGame.g:204:1: ( rulePerson EOF )
            // InternalGame.g:205:1: rulePerson EOF
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
    // InternalGame.g:212:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:216:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalGame.g:217:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalGame.g:217:2: ( ( rule__Person__Group__0 ) )
            // InternalGame.g:218:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalGame.g:219:3: ( rule__Person__Group__0 )
            // InternalGame.g:219:4: rule__Person__Group__0
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


    // $ANTLR start "entryRuleObject"
    // InternalGame.g:228:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalGame.g:229:1: ( ruleObject EOF )
            // InternalGame.g:230:1: ruleObject EOF
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
    // InternalGame.g:237:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:241:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalGame.g:242:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalGame.g:242:2: ( ( rule__Object__Group__0 ) )
            // InternalGame.g:243:3: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // InternalGame.g:244:3: ( rule__Object__Group__0 )
            // InternalGame.g:244:4: rule__Object__Group__0
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


    // $ANTLR start "rulePERSON_T"
    // InternalGame.g:253:1: rulePERSON_T : ( ( rule__PERSON_T__Alternatives ) ) ;
    public final void rulePERSON_T() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:257:1: ( ( ( rule__PERSON_T__Alternatives ) ) )
            // InternalGame.g:258:2: ( ( rule__PERSON_T__Alternatives ) )
            {
            // InternalGame.g:258:2: ( ( rule__PERSON_T__Alternatives ) )
            // InternalGame.g:259:3: ( rule__PERSON_T__Alternatives )
            {
             before(grammarAccess.getPERSON_TAccess().getAlternatives()); 
            // InternalGame.g:260:3: ( rule__PERSON_T__Alternatives )
            // InternalGame.g:260:4: rule__PERSON_T__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PERSON_T__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPERSON_TAccess().getAlternatives()); 

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
    // $ANTLR end "rulePERSON_T"


    // $ANTLR start "ruleOBJECT_T"
    // InternalGame.g:269:1: ruleOBJECT_T : ( ( 'type_A' ) ) ;
    public final void ruleOBJECT_T() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:273:1: ( ( ( 'type_A' ) ) )
            // InternalGame.g:274:2: ( ( 'type_A' ) )
            {
            // InternalGame.g:274:2: ( ( 'type_A' ) )
            // InternalGame.g:275:3: ( 'type_A' )
            {
             before(grammarAccess.getOBJECT_TAccess().getAEnumLiteralDeclaration()); 
            // InternalGame.g:276:3: ( 'type_A' )
            // InternalGame.g:276:4: 'type_A'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getOBJECT_TAccess().getAEnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleOBJECT_T"


    // $ANTLR start "rulePosition_E"
    // InternalGame.g:285:1: rulePosition_E : ( ( 'On table' ) ) ;
    public final void rulePosition_E() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:289:1: ( ( ( 'On table' ) ) )
            // InternalGame.g:290:2: ( ( 'On table' ) )
            {
            // InternalGame.g:290:2: ( ( 'On table' ) )
            // InternalGame.g:291:3: ( 'On table' )
            {
             before(grammarAccess.getPosition_EAccess().getTABLEEnumLiteralDeclaration()); 
            // InternalGame.g:292:3: ( 'On table' )
            // InternalGame.g:292:4: 'On table'
            {
            match(input,12,FOLLOW_2); 

            }

             after(grammarAccess.getPosition_EAccess().getTABLEEnumLiteralDeclaration()); 

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
    // $ANTLR end "rulePosition_E"


    // $ANTLR start "ruleAction"
    // InternalGame.g:301:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:305:1: ( ( ( rule__Action__Alternatives ) ) )
            // InternalGame.g:306:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalGame.g:306:2: ( ( rule__Action__Alternatives ) )
            // InternalGame.g:307:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalGame.g:308:3: ( rule__Action__Alternatives )
            // InternalGame.g:308:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "rule__PERSON_T__Alternatives"
    // InternalGame.g:316:1: rule__PERSON_T__Alternatives : ( ( ( 'male' ) ) | ( ( 'female' ) ) );
    public final void rule__PERSON_T__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:320:1: ( ( ( 'male' ) ) | ( ( 'female' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGame.g:321:2: ( ( 'male' ) )
                    {
                    // InternalGame.g:321:2: ( ( 'male' ) )
                    // InternalGame.g:322:3: ( 'male' )
                    {
                     before(grammarAccess.getPERSON_TAccess().getMALEEnumLiteralDeclaration_0()); 
                    // InternalGame.g:323:3: ( 'male' )
                    // InternalGame.g:323:4: 'male'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getPERSON_TAccess().getMALEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:327:2: ( ( 'female' ) )
                    {
                    // InternalGame.g:327:2: ( ( 'female' ) )
                    // InternalGame.g:328:3: ( 'female' )
                    {
                     before(grammarAccess.getPERSON_TAccess().getFEMALEEnumLiteralDeclaration_1()); 
                    // InternalGame.g:329:3: ( 'female' )
                    // InternalGame.g:329:4: 'female'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPERSON_TAccess().getFEMALEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__PERSON_T__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalGame.g:337:1: rule__Action__Alternatives : ( ( ( 'Talk' ) ) | ( ( 'Pick' ) ) | ( ( 'use' ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:341:1: ( ( ( 'Talk' ) ) | ( ( 'Pick' ) ) | ( ( 'use' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGame.g:342:2: ( ( 'Talk' ) )
                    {
                    // InternalGame.g:342:2: ( ( 'Talk' ) )
                    // InternalGame.g:343:3: ( 'Talk' )
                    {
                     before(grammarAccess.getActionAccess().getTALKEnumLiteralDeclaration_0()); 
                    // InternalGame.g:344:3: ( 'Talk' )
                    // InternalGame.g:344:4: 'Talk'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getTALKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:348:2: ( ( 'Pick' ) )
                    {
                    // InternalGame.g:348:2: ( ( 'Pick' ) )
                    // InternalGame.g:349:3: ( 'Pick' )
                    {
                     before(grammarAccess.getActionAccess().getPICKEnumLiteralDeclaration_1()); 
                    // InternalGame.g:350:3: ( 'Pick' )
                    // InternalGame.g:350:4: 'Pick'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getPICKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:354:2: ( ( 'use' ) )
                    {
                    // InternalGame.g:354:2: ( ( 'use' ) )
                    // InternalGame.g:355:3: ( 'use' )
                    {
                     before(grammarAccess.getActionAccess().getUSEEnumLiteralDeclaration_2()); 
                    // InternalGame.g:356:3: ( 'use' )
                    // InternalGame.g:356:4: 'use'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionAccess().getUSEEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__Game__Group__0"
    // InternalGame.g:364:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:368:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalGame.g:369:2: rule__Game__Group__0__Impl rule__Game__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__1();

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
    // $ANTLR end "rule__Game__Group__0"


    // $ANTLR start "rule__Game__Group__0__Impl"
    // InternalGame.g:376:1: rule__Game__Group__0__Impl : ( ( rule__Game__DefinitionAssignment_0 ) ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:380:1: ( ( ( rule__Game__DefinitionAssignment_0 ) ) )
            // InternalGame.g:381:1: ( ( rule__Game__DefinitionAssignment_0 ) )
            {
            // InternalGame.g:381:1: ( ( rule__Game__DefinitionAssignment_0 ) )
            // InternalGame.g:382:2: ( rule__Game__DefinitionAssignment_0 )
            {
             before(grammarAccess.getGameAccess().getDefinitionAssignment_0()); 
            // InternalGame.g:383:2: ( rule__Game__DefinitionAssignment_0 )
            // InternalGame.g:383:3: rule__Game__DefinitionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Game__DefinitionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getDefinitionAssignment_0()); 

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
    // $ANTLR end "rule__Game__Group__0__Impl"


    // $ANTLR start "rule__Game__Group__1"
    // InternalGame.g:391:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:395:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalGame.g:396:2: rule__Game__Group__1__Impl rule__Game__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__2();

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
    // $ANTLR end "rule__Game__Group__1"


    // $ANTLR start "rule__Game__Group__1__Impl"
    // InternalGame.g:403:1: rule__Game__Group__1__Impl : ( '{' ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:407:1: ( ( '{' ) )
            // InternalGame.g:408:1: ( '{' )
            {
            // InternalGame.g:408:1: ( '{' )
            // InternalGame.g:409:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Game__Group__1__Impl"


    // $ANTLR start "rule__Game__Group__2"
    // InternalGame.g:418:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:422:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalGame.g:423:2: rule__Game__Group__2__Impl rule__Game__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__3();

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
    // $ANTLR end "rule__Game__Group__2"


    // $ANTLR start "rule__Game__Group__2__Impl"
    // InternalGame.g:430:1: rule__Game__Group__2__Impl : ( ( rule__Game__ScenesAssignment_2 )* ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:434:1: ( ( ( rule__Game__ScenesAssignment_2 )* ) )
            // InternalGame.g:435:1: ( ( rule__Game__ScenesAssignment_2 )* )
            {
            // InternalGame.g:435:1: ( ( rule__Game__ScenesAssignment_2 )* )
            // InternalGame.g:436:2: ( rule__Game__ScenesAssignment_2 )*
            {
             before(grammarAccess.getGameAccess().getScenesAssignment_2()); 
            // InternalGame.g:437:2: ( rule__Game__ScenesAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==21||LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGame.g:437:3: rule__Game__ScenesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Game__ScenesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getScenesAssignment_2()); 

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
    // $ANTLR end "rule__Game__Group__2__Impl"


    // $ANTLR start "rule__Game__Group__3"
    // InternalGame.g:445:1: rule__Game__Group__3 : rule__Game__Group__3__Impl ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:449:1: ( rule__Game__Group__3__Impl )
            // InternalGame.g:450:2: rule__Game__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__3__Impl();

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
    // $ANTLR end "rule__Game__Group__3"


    // $ANTLR start "rule__Game__Group__3__Impl"
    // InternalGame.g:456:1: rule__Game__Group__3__Impl : ( '}' ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:460:1: ( ( '}' ) )
            // InternalGame.g:461:1: ( '}' )
            {
            // InternalGame.g:461:1: ( '}' )
            // InternalGame.g:462:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Game__Group__3__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // InternalGame.g:472:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:476:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // InternalGame.g:477:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__1();

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
    // $ANTLR end "rule__Definition__Group__0"


    // $ANTLR start "rule__Definition__Group__0__Impl"
    // InternalGame.g:484:1: rule__Definition__Group__0__Impl : ( 'new' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:488:1: ( ( 'new' ) )
            // InternalGame.g:489:1: ( 'new' )
            {
            // InternalGame.g:489:1: ( 'new' )
            // InternalGame.g:490:2: 'new'
            {
             before(grammarAccess.getDefinitionAccess().getNewKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getNewKeyword_0()); 

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
    // $ANTLR end "rule__Definition__Group__0__Impl"


    // $ANTLR start "rule__Definition__Group__1"
    // InternalGame.g:499:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:503:1: ( rule__Definition__Group__1__Impl )
            // InternalGame.g:504:2: rule__Definition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group__1__Impl();

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
    // $ANTLR end "rule__Definition__Group__1"


    // $ANTLR start "rule__Definition__Group__1__Impl"
    // InternalGame.g:510:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__NameAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:514:1: ( ( ( rule__Definition__NameAssignment_1 ) ) )
            // InternalGame.g:515:1: ( ( rule__Definition__NameAssignment_1 ) )
            {
            // InternalGame.g:515:1: ( ( rule__Definition__NameAssignment_1 ) )
            // InternalGame.g:516:2: ( rule__Definition__NameAssignment_1 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_1()); 
            // InternalGame.g:517:2: ( rule__Definition__NameAssignment_1 )
            // InternalGame.g:517:3: rule__Definition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Definition__Group__1__Impl"


    // $ANTLR start "rule__Scene__Group__0"
    // InternalGame.g:526:1: rule__Scene__Group__0 : rule__Scene__Group__0__Impl rule__Scene__Group__1 ;
    public final void rule__Scene__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:530:1: ( rule__Scene__Group__0__Impl rule__Scene__Group__1 )
            // InternalGame.g:531:2: rule__Scene__Group__0__Impl rule__Scene__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalGame.g:538:1: rule__Scene__Group__0__Impl : ( ( rule__Scene__DeclartionsAssignment_0 )* ) ;
    public final void rule__Scene__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:542:1: ( ( ( rule__Scene__DeclartionsAssignment_0 )* ) )
            // InternalGame.g:543:1: ( ( rule__Scene__DeclartionsAssignment_0 )* )
            {
            // InternalGame.g:543:1: ( ( rule__Scene__DeclartionsAssignment_0 )* )
            // InternalGame.g:544:2: ( rule__Scene__DeclartionsAssignment_0 )*
            {
             before(grammarAccess.getSceneAccess().getDeclartionsAssignment_0()); 
            // InternalGame.g:545:2: ( rule__Scene__DeclartionsAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:545:3: rule__Scene__DeclartionsAssignment_0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Scene__DeclartionsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSceneAccess().getDeclartionsAssignment_0()); 

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
    // InternalGame.g:553:1: rule__Scene__Group__1 : rule__Scene__Group__1__Impl rule__Scene__Group__2 ;
    public final void rule__Scene__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:557:1: ( rule__Scene__Group__1__Impl rule__Scene__Group__2 )
            // InternalGame.g:558:2: rule__Scene__Group__1__Impl rule__Scene__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalGame.g:565:1: rule__Scene__Group__1__Impl : ( ( rule__Scene__DefinitionsAssignment_1 )* ) ;
    public final void rule__Scene__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:569:1: ( ( ( rule__Scene__DefinitionsAssignment_1 )* ) )
            // InternalGame.g:570:1: ( ( rule__Scene__DefinitionsAssignment_1 )* )
            {
            // InternalGame.g:570:1: ( ( rule__Scene__DefinitionsAssignment_1 )* )
            // InternalGame.g:571:2: ( rule__Scene__DefinitionsAssignment_1 )*
            {
             before(grammarAccess.getSceneAccess().getDefinitionsAssignment_1()); 
            // InternalGame.g:572:2: ( rule__Scene__DefinitionsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGame.g:572:3: rule__Scene__DefinitionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Scene__DefinitionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSceneAccess().getDefinitionsAssignment_1()); 

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
    // InternalGame.g:580:1: rule__Scene__Group__2 : rule__Scene__Group__2__Impl rule__Scene__Group__3 ;
    public final void rule__Scene__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:584:1: ( rule__Scene__Group__2__Impl rule__Scene__Group__3 )
            // InternalGame.g:585:2: rule__Scene__Group__2__Impl rule__Scene__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:592:1: rule__Scene__Group__2__Impl : ( 'start' ) ;
    public final void rule__Scene__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:596:1: ( ( 'start' ) )
            // InternalGame.g:597:1: ( 'start' )
            {
            // InternalGame.g:597:1: ( 'start' )
            // InternalGame.g:598:2: 'start'
            {
             before(grammarAccess.getSceneAccess().getStartKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getStartKeyword_2()); 

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
    // InternalGame.g:607:1: rule__Scene__Group__3 : rule__Scene__Group__3__Impl rule__Scene__Group__4 ;
    public final void rule__Scene__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:611:1: ( rule__Scene__Group__3__Impl rule__Scene__Group__4 )
            // InternalGame.g:612:2: rule__Scene__Group__3__Impl rule__Scene__Group__4
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
    // InternalGame.g:619:1: rule__Scene__Group__3__Impl : ( '=' ) ;
    public final void rule__Scene__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:623:1: ( ( '=' ) )
            // InternalGame.g:624:1: ( '=' )
            {
            // InternalGame.g:624:1: ( '=' )
            // InternalGame.g:625:2: '='
            {
             before(grammarAccess.getSceneAccess().getEqualsSignKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getEqualsSignKeyword_3()); 

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
    // InternalGame.g:634:1: rule__Scene__Group__4 : rule__Scene__Group__4__Impl rule__Scene__Group__5 ;
    public final void rule__Scene__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:638:1: ( rule__Scene__Group__4__Impl rule__Scene__Group__5 )
            // InternalGame.g:639:2: rule__Scene__Group__4__Impl rule__Scene__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalGame.g:646:1: rule__Scene__Group__4__Impl : ( ( rule__Scene__StartLevelAssignment_4 ) ) ;
    public final void rule__Scene__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:650:1: ( ( ( rule__Scene__StartLevelAssignment_4 ) ) )
            // InternalGame.g:651:1: ( ( rule__Scene__StartLevelAssignment_4 ) )
            {
            // InternalGame.g:651:1: ( ( rule__Scene__StartLevelAssignment_4 ) )
            // InternalGame.g:652:2: ( rule__Scene__StartLevelAssignment_4 )
            {
             before(grammarAccess.getSceneAccess().getStartLevelAssignment_4()); 
            // InternalGame.g:653:2: ( rule__Scene__StartLevelAssignment_4 )
            // InternalGame.g:653:3: rule__Scene__StartLevelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Scene__StartLevelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSceneAccess().getStartLevelAssignment_4()); 

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
    // InternalGame.g:661:1: rule__Scene__Group__5 : rule__Scene__Group__5__Impl rule__Scene__Group__6 ;
    public final void rule__Scene__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:665:1: ( rule__Scene__Group__5__Impl rule__Scene__Group__6 )
            // InternalGame.g:666:2: rule__Scene__Group__5__Impl rule__Scene__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalGame.g:673:1: rule__Scene__Group__5__Impl : ( ';' ) ;
    public final void rule__Scene__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:677:1: ( ( ';' ) )
            // InternalGame.g:678:1: ( ';' )
            {
            // InternalGame.g:678:1: ( ';' )
            // InternalGame.g:679:2: ';'
            {
             before(grammarAccess.getSceneAccess().getSemicolonKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getSemicolonKeyword_5()); 

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
    // InternalGame.g:688:1: rule__Scene__Group__6 : rule__Scene__Group__6__Impl rule__Scene__Group__7 ;
    public final void rule__Scene__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:692:1: ( rule__Scene__Group__6__Impl rule__Scene__Group__7 )
            // InternalGame.g:693:2: rule__Scene__Group__6__Impl rule__Scene__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:700:1: rule__Scene__Group__6__Impl : ( 'final' ) ;
    public final void rule__Scene__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:704:1: ( ( 'final' ) )
            // InternalGame.g:705:1: ( 'final' )
            {
            // InternalGame.g:705:1: ( 'final' )
            // InternalGame.g:706:2: 'final'
            {
             before(grammarAccess.getSceneAccess().getFinalKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getFinalKeyword_6()); 

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
    // InternalGame.g:715:1: rule__Scene__Group__7 : rule__Scene__Group__7__Impl rule__Scene__Group__8 ;
    public final void rule__Scene__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:719:1: ( rule__Scene__Group__7__Impl rule__Scene__Group__8 )
            // InternalGame.g:720:2: rule__Scene__Group__7__Impl rule__Scene__Group__8
            {
            pushFollow(FOLLOW_6);
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
    // InternalGame.g:727:1: rule__Scene__Group__7__Impl : ( '=' ) ;
    public final void rule__Scene__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:731:1: ( ( '=' ) )
            // InternalGame.g:732:1: ( '=' )
            {
            // InternalGame.g:732:1: ( '=' )
            // InternalGame.g:733:2: '='
            {
             before(grammarAccess.getSceneAccess().getEqualsSignKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getEqualsSignKeyword_7()); 

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
    // InternalGame.g:742:1: rule__Scene__Group__8 : rule__Scene__Group__8__Impl rule__Scene__Group__9 ;
    public final void rule__Scene__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:746:1: ( rule__Scene__Group__8__Impl rule__Scene__Group__9 )
            // InternalGame.g:747:2: rule__Scene__Group__8__Impl rule__Scene__Group__9
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
    // InternalGame.g:754:1: rule__Scene__Group__8__Impl : ( ( rule__Scene__FinalLevelAssignment_8 ) ) ;
    public final void rule__Scene__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:758:1: ( ( ( rule__Scene__FinalLevelAssignment_8 ) ) )
            // InternalGame.g:759:1: ( ( rule__Scene__FinalLevelAssignment_8 ) )
            {
            // InternalGame.g:759:1: ( ( rule__Scene__FinalLevelAssignment_8 ) )
            // InternalGame.g:760:2: ( rule__Scene__FinalLevelAssignment_8 )
            {
             before(grammarAccess.getSceneAccess().getFinalLevelAssignment_8()); 
            // InternalGame.g:761:2: ( rule__Scene__FinalLevelAssignment_8 )
            // InternalGame.g:761:3: rule__Scene__FinalLevelAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Scene__FinalLevelAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSceneAccess().getFinalLevelAssignment_8()); 

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
    // InternalGame.g:769:1: rule__Scene__Group__9 : rule__Scene__Group__9__Impl rule__Scene__Group__10 ;
    public final void rule__Scene__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:773:1: ( rule__Scene__Group__9__Impl rule__Scene__Group__10 )
            // InternalGame.g:774:2: rule__Scene__Group__9__Impl rule__Scene__Group__10
            {
            pushFollow(FOLLOW_13);
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
    // InternalGame.g:781:1: rule__Scene__Group__9__Impl : ( ';' ) ;
    public final void rule__Scene__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:785:1: ( ( ';' ) )
            // InternalGame.g:786:1: ( ';' )
            {
            // InternalGame.g:786:1: ( ';' )
            // InternalGame.g:787:2: ';'
            {
             before(grammarAccess.getSceneAccess().getSemicolonKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getSemicolonKeyword_9()); 

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
    // InternalGame.g:796:1: rule__Scene__Group__10 : rule__Scene__Group__10__Impl ;
    public final void rule__Scene__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:800:1: ( rule__Scene__Group__10__Impl )
            // InternalGame.g:801:2: rule__Scene__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group__10__Impl();

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
    // InternalGame.g:807:1: rule__Scene__Group__10__Impl : ( ( rule__Scene__TransitionsAssignment_10 )* ) ;
    public final void rule__Scene__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:811:1: ( ( ( rule__Scene__TransitionsAssignment_10 )* ) )
            // InternalGame.g:812:1: ( ( rule__Scene__TransitionsAssignment_10 )* )
            {
            // InternalGame.g:812:1: ( ( rule__Scene__TransitionsAssignment_10 )* )
            // InternalGame.g:813:2: ( rule__Scene__TransitionsAssignment_10 )*
            {
             before(grammarAccess.getSceneAccess().getTransitionsAssignment_10()); 
            // InternalGame.g:814:2: ( rule__Scene__TransitionsAssignment_10 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGame.g:814:3: rule__Scene__TransitionsAssignment_10
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Scene__TransitionsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSceneAccess().getTransitionsAssignment_10()); 

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


    // $ANTLR start "rule__LevelDeclaration__Group__0"
    // InternalGame.g:823:1: rule__LevelDeclaration__Group__0 : rule__LevelDeclaration__Group__0__Impl rule__LevelDeclaration__Group__1 ;
    public final void rule__LevelDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:827:1: ( rule__LevelDeclaration__Group__0__Impl rule__LevelDeclaration__Group__1 )
            // InternalGame.g:828:2: rule__LevelDeclaration__Group__0__Impl rule__LevelDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalGame.g:835:1: rule__LevelDeclaration__Group__0__Impl : ( 'level' ) ;
    public final void rule__LevelDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:839:1: ( ( 'level' ) )
            // InternalGame.g:840:1: ( 'level' )
            {
            // InternalGame.g:840:1: ( 'level' )
            // InternalGame.g:841:2: 'level'
            {
             before(grammarAccess.getLevelDeclarationAccess().getLevelKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGame.g:850:1: rule__LevelDeclaration__Group__1 : rule__LevelDeclaration__Group__1__Impl rule__LevelDeclaration__Group__2 ;
    public final void rule__LevelDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:854:1: ( rule__LevelDeclaration__Group__1__Impl rule__LevelDeclaration__Group__2 )
            // InternalGame.g:855:2: rule__LevelDeclaration__Group__1__Impl rule__LevelDeclaration__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalGame.g:862:1: rule__LevelDeclaration__Group__1__Impl : ( ( rule__LevelDeclaration__NameAssignment_1 ) ) ;
    public final void rule__LevelDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:866:1: ( ( ( rule__LevelDeclaration__NameAssignment_1 ) ) )
            // InternalGame.g:867:1: ( ( rule__LevelDeclaration__NameAssignment_1 ) )
            {
            // InternalGame.g:867:1: ( ( rule__LevelDeclaration__NameAssignment_1 ) )
            // InternalGame.g:868:2: ( rule__LevelDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getLevelDeclarationAccess().getNameAssignment_1()); 
            // InternalGame.g:869:2: ( rule__LevelDeclaration__NameAssignment_1 )
            // InternalGame.g:869:3: rule__LevelDeclaration__NameAssignment_1
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
    // InternalGame.g:877:1: rule__LevelDeclaration__Group__2 : rule__LevelDeclaration__Group__2__Impl ;
    public final void rule__LevelDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:881:1: ( rule__LevelDeclaration__Group__2__Impl )
            // InternalGame.g:882:2: rule__LevelDeclaration__Group__2__Impl
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
    // InternalGame.g:888:1: rule__LevelDeclaration__Group__2__Impl : ( ';' ) ;
    public final void rule__LevelDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:892:1: ( ( ';' ) )
            // InternalGame.g:893:1: ( ';' )
            {
            // InternalGame.g:893:1: ( ';' )
            // InternalGame.g:894:2: ';'
            {
             before(grammarAccess.getLevelDeclarationAccess().getSemicolonKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGame.g:904:1: rule__LevelDefinition__Group__0 : rule__LevelDefinition__Group__0__Impl rule__LevelDefinition__Group__1 ;
    public final void rule__LevelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:908:1: ( rule__LevelDefinition__Group__0__Impl rule__LevelDefinition__Group__1 )
            // InternalGame.g:909:2: rule__LevelDefinition__Group__0__Impl rule__LevelDefinition__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:916:1: rule__LevelDefinition__Group__0__Impl : ( ( rule__LevelDefinition__NameAssignment_0 ) ) ;
    public final void rule__LevelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:920:1: ( ( ( rule__LevelDefinition__NameAssignment_0 ) ) )
            // InternalGame.g:921:1: ( ( rule__LevelDefinition__NameAssignment_0 ) )
            {
            // InternalGame.g:921:1: ( ( rule__LevelDefinition__NameAssignment_0 ) )
            // InternalGame.g:922:2: ( rule__LevelDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getLevelDefinitionAccess().getNameAssignment_0()); 
            // InternalGame.g:923:2: ( rule__LevelDefinition__NameAssignment_0 )
            // InternalGame.g:923:3: rule__LevelDefinition__NameAssignment_0
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
    // InternalGame.g:931:1: rule__LevelDefinition__Group__1 : rule__LevelDefinition__Group__1__Impl rule__LevelDefinition__Group__2 ;
    public final void rule__LevelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:935:1: ( rule__LevelDefinition__Group__1__Impl rule__LevelDefinition__Group__2 )
            // InternalGame.g:936:2: rule__LevelDefinition__Group__1__Impl rule__LevelDefinition__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:943:1: rule__LevelDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__LevelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:947:1: ( ( '=' ) )
            // InternalGame.g:948:1: ( '=' )
            {
            // InternalGame.g:948:1: ( '=' )
            // InternalGame.g:949:2: '='
            {
             before(grammarAccess.getLevelDefinitionAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGame.g:958:1: rule__LevelDefinition__Group__2 : rule__LevelDefinition__Group__2__Impl rule__LevelDefinition__Group__3 ;
    public final void rule__LevelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:962:1: ( rule__LevelDefinition__Group__2__Impl rule__LevelDefinition__Group__3 )
            // InternalGame.g:963:2: rule__LevelDefinition__Group__2__Impl rule__LevelDefinition__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:970:1: rule__LevelDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__LevelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:974:1: ( ( '{' ) )
            // InternalGame.g:975:1: ( '{' )
            {
            // InternalGame.g:975:1: ( '{' )
            // InternalGame.g:976:2: '{'
            {
             before(grammarAccess.getLevelDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:985:1: rule__LevelDefinition__Group__3 : rule__LevelDefinition__Group__3__Impl rule__LevelDefinition__Group__4 ;
    public final void rule__LevelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:989:1: ( rule__LevelDefinition__Group__3__Impl rule__LevelDefinition__Group__4 )
            // InternalGame.g:990:2: rule__LevelDefinition__Group__3__Impl rule__LevelDefinition__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:997:1: rule__LevelDefinition__Group__3__Impl : ( ( rule__LevelDefinition__PersonsAssignment_3 )* ) ;
    public final void rule__LevelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1001:1: ( ( ( rule__LevelDefinition__PersonsAssignment_3 )* ) )
            // InternalGame.g:1002:1: ( ( rule__LevelDefinition__PersonsAssignment_3 )* )
            {
            // InternalGame.g:1002:1: ( ( rule__LevelDefinition__PersonsAssignment_3 )* )
            // InternalGame.g:1003:2: ( rule__LevelDefinition__PersonsAssignment_3 )*
            {
             before(grammarAccess.getLevelDefinitionAccess().getPersonsAssignment_3()); 
            // InternalGame.g:1004:2: ( rule__LevelDefinition__PersonsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==22) ) {
                        int LA7_3 = input.LA(3);

                        if ( (LA7_3==18) ) {
                            int LA7_4 = input.LA(4);

                            if ( (LA7_4==29) ) {
                                int LA7_5 = input.LA(5);

                                if ( (LA7_5==22) ) {
                                    int LA7_6 = input.LA(6);

                                    if ( ((LA7_6>=13 && LA7_6<=14)) ) {
                                        alt7=1;
                                    }


                                }


                            }


                        }


                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalGame.g:1004:3: rule__LevelDefinition__PersonsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__LevelDefinition__PersonsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getLevelDefinitionAccess().getPersonsAssignment_3()); 

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
    // InternalGame.g:1012:1: rule__LevelDefinition__Group__4 : rule__LevelDefinition__Group__4__Impl rule__LevelDefinition__Group__5 ;
    public final void rule__LevelDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1016:1: ( rule__LevelDefinition__Group__4__Impl rule__LevelDefinition__Group__5 )
            // InternalGame.g:1017:2: rule__LevelDefinition__Group__4__Impl rule__LevelDefinition__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalGame.g:1024:1: rule__LevelDefinition__Group__4__Impl : ( ( rule__LevelDefinition__ObjectsAssignment_4 )* ) ;
    public final void rule__LevelDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1028:1: ( ( ( rule__LevelDefinition__ObjectsAssignment_4 )* ) )
            // InternalGame.g:1029:1: ( ( rule__LevelDefinition__ObjectsAssignment_4 )* )
            {
            // InternalGame.g:1029:1: ( ( rule__LevelDefinition__ObjectsAssignment_4 )* )
            // InternalGame.g:1030:2: ( rule__LevelDefinition__ObjectsAssignment_4 )*
            {
             before(grammarAccess.getLevelDefinitionAccess().getObjectsAssignment_4()); 
            // InternalGame.g:1031:2: ( rule__LevelDefinition__ObjectsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGame.g:1031:3: rule__LevelDefinition__ObjectsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__LevelDefinition__ObjectsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getLevelDefinitionAccess().getObjectsAssignment_4()); 

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
    // InternalGame.g:1039:1: rule__LevelDefinition__Group__5 : rule__LevelDefinition__Group__5__Impl rule__LevelDefinition__Group__6 ;
    public final void rule__LevelDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1043:1: ( rule__LevelDefinition__Group__5__Impl rule__LevelDefinition__Group__6 )
            // InternalGame.g:1044:2: rule__LevelDefinition__Group__5__Impl rule__LevelDefinition__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:1051:1: rule__LevelDefinition__Group__5__Impl : ( 'goal' ) ;
    public final void rule__LevelDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1055:1: ( ( 'goal' ) )
            // InternalGame.g:1056:1: ( 'goal' )
            {
            // InternalGame.g:1056:1: ( 'goal' )
            // InternalGame.g:1057:2: 'goal'
            {
             before(grammarAccess.getLevelDefinitionAccess().getGoalKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getGoalKeyword_5()); 

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
    // InternalGame.g:1066:1: rule__LevelDefinition__Group__6 : rule__LevelDefinition__Group__6__Impl rule__LevelDefinition__Group__7 ;
    public final void rule__LevelDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1070:1: ( rule__LevelDefinition__Group__6__Impl rule__LevelDefinition__Group__7 )
            // InternalGame.g:1071:2: rule__LevelDefinition__Group__6__Impl rule__LevelDefinition__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalGame.g:1078:1: rule__LevelDefinition__Group__6__Impl : ( '=' ) ;
    public final void rule__LevelDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1082:1: ( ( '=' ) )
            // InternalGame.g:1083:1: ( '=' )
            {
            // InternalGame.g:1083:1: ( '=' )
            // InternalGame.g:1084:2: '='
            {
             before(grammarAccess.getLevelDefinitionAccess().getEqualsSignKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getEqualsSignKeyword_6()); 

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
    // InternalGame.g:1093:1: rule__LevelDefinition__Group__7 : rule__LevelDefinition__Group__7__Impl rule__LevelDefinition__Group__8 ;
    public final void rule__LevelDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1097:1: ( rule__LevelDefinition__Group__7__Impl rule__LevelDefinition__Group__8 )
            // InternalGame.g:1098:2: rule__LevelDefinition__Group__7__Impl rule__LevelDefinition__Group__8
            {
            pushFollow(FOLLOW_11);
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
    // InternalGame.g:1105:1: rule__LevelDefinition__Group__7__Impl : ( ( rule__LevelDefinition__GoalIdAssignment_7 ) ) ;
    public final void rule__LevelDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1109:1: ( ( ( rule__LevelDefinition__GoalIdAssignment_7 ) ) )
            // InternalGame.g:1110:1: ( ( rule__LevelDefinition__GoalIdAssignment_7 ) )
            {
            // InternalGame.g:1110:1: ( ( rule__LevelDefinition__GoalIdAssignment_7 ) )
            // InternalGame.g:1111:2: ( rule__LevelDefinition__GoalIdAssignment_7 )
            {
             before(grammarAccess.getLevelDefinitionAccess().getGoalIdAssignment_7()); 
            // InternalGame.g:1112:2: ( rule__LevelDefinition__GoalIdAssignment_7 )
            // InternalGame.g:1112:3: rule__LevelDefinition__GoalIdAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__LevelDefinition__GoalIdAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getLevelDefinitionAccess().getGoalIdAssignment_7()); 

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
    // InternalGame.g:1120:1: rule__LevelDefinition__Group__8 : rule__LevelDefinition__Group__8__Impl rule__LevelDefinition__Group__9 ;
    public final void rule__LevelDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1124:1: ( rule__LevelDefinition__Group__8__Impl rule__LevelDefinition__Group__9 )
            // InternalGame.g:1125:2: rule__LevelDefinition__Group__8__Impl rule__LevelDefinition__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__LevelDefinition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group__9();

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
    // InternalGame.g:1132:1: rule__LevelDefinition__Group__8__Impl : ( ';' ) ;
    public final void rule__LevelDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1136:1: ( ( ';' ) )
            // InternalGame.g:1137:1: ( ';' )
            {
            // InternalGame.g:1137:1: ( ';' )
            // InternalGame.g:1138:2: ';'
            {
             before(grammarAccess.getLevelDefinitionAccess().getSemicolonKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getSemicolonKeyword_8()); 

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


    // $ANTLR start "rule__LevelDefinition__Group__9"
    // InternalGame.g:1147:1: rule__LevelDefinition__Group__9 : rule__LevelDefinition__Group__9__Impl ;
    public final void rule__LevelDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1151:1: ( rule__LevelDefinition__Group__9__Impl )
            // InternalGame.g:1152:2: rule__LevelDefinition__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group__9__Impl();

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
    // $ANTLR end "rule__LevelDefinition__Group__9"


    // $ANTLR start "rule__LevelDefinition__Group__9__Impl"
    // InternalGame.g:1158:1: rule__LevelDefinition__Group__9__Impl : ( '}' ) ;
    public final void rule__LevelDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1162:1: ( ( '}' ) )
            // InternalGame.g:1163:1: ( '}' )
            {
            // InternalGame.g:1163:1: ( '}' )
            // InternalGame.g:1164:2: '}'
            {
             before(grammarAccess.getLevelDefinitionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__LevelDefinition__Group__9__Impl"


    // $ANTLR start "rule__LevelTransition__Group__0"
    // InternalGame.g:1174:1: rule__LevelTransition__Group__0 : rule__LevelTransition__Group__0__Impl rule__LevelTransition__Group__1 ;
    public final void rule__LevelTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1178:1: ( rule__LevelTransition__Group__0__Impl rule__LevelTransition__Group__1 )
            // InternalGame.g:1179:2: rule__LevelTransition__Group__0__Impl rule__LevelTransition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__LevelTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelTransition__Group__1();

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
    // $ANTLR end "rule__LevelTransition__Group__0"


    // $ANTLR start "rule__LevelTransition__Group__0__Impl"
    // InternalGame.g:1186:1: rule__LevelTransition__Group__0__Impl : ( 'from' ) ;
    public final void rule__LevelTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1190:1: ( ( 'from' ) )
            // InternalGame.g:1191:1: ( 'from' )
            {
            // InternalGame.g:1191:1: ( 'from' )
            // InternalGame.g:1192:2: 'from'
            {
             before(grammarAccess.getLevelTransitionAccess().getFromKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLevelTransitionAccess().getFromKeyword_0()); 

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
    // $ANTLR end "rule__LevelTransition__Group__0__Impl"


    // $ANTLR start "rule__LevelTransition__Group__1"
    // InternalGame.g:1201:1: rule__LevelTransition__Group__1 : rule__LevelTransition__Group__1__Impl rule__LevelTransition__Group__2 ;
    public final void rule__LevelTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1205:1: ( rule__LevelTransition__Group__1__Impl rule__LevelTransition__Group__2 )
            // InternalGame.g:1206:2: rule__LevelTransition__Group__1__Impl rule__LevelTransition__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__LevelTransition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelTransition__Group__2();

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
    // $ANTLR end "rule__LevelTransition__Group__1"


    // $ANTLR start "rule__LevelTransition__Group__1__Impl"
    // InternalGame.g:1213:1: rule__LevelTransition__Group__1__Impl : ( ( rule__LevelTransition__LevelFromAssignment_1 ) ) ;
    public final void rule__LevelTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1217:1: ( ( ( rule__LevelTransition__LevelFromAssignment_1 ) ) )
            // InternalGame.g:1218:1: ( ( rule__LevelTransition__LevelFromAssignment_1 ) )
            {
            // InternalGame.g:1218:1: ( ( rule__LevelTransition__LevelFromAssignment_1 ) )
            // InternalGame.g:1219:2: ( rule__LevelTransition__LevelFromAssignment_1 )
            {
             before(grammarAccess.getLevelTransitionAccess().getLevelFromAssignment_1()); 
            // InternalGame.g:1220:2: ( rule__LevelTransition__LevelFromAssignment_1 )
            // InternalGame.g:1220:3: rule__LevelTransition__LevelFromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LevelTransition__LevelFromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLevelTransitionAccess().getLevelFromAssignment_1()); 

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
    // $ANTLR end "rule__LevelTransition__Group__1__Impl"


    // $ANTLR start "rule__LevelTransition__Group__2"
    // InternalGame.g:1228:1: rule__LevelTransition__Group__2 : rule__LevelTransition__Group__2__Impl rule__LevelTransition__Group__3 ;
    public final void rule__LevelTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1232:1: ( rule__LevelTransition__Group__2__Impl rule__LevelTransition__Group__3 )
            // InternalGame.g:1233:2: rule__LevelTransition__Group__2__Impl rule__LevelTransition__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__LevelTransition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelTransition__Group__3();

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
    // $ANTLR end "rule__LevelTransition__Group__2"


    // $ANTLR start "rule__LevelTransition__Group__2__Impl"
    // InternalGame.g:1240:1: rule__LevelTransition__Group__2__Impl : ( 'to' ) ;
    public final void rule__LevelTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1244:1: ( ( 'to' ) )
            // InternalGame.g:1245:1: ( 'to' )
            {
            // InternalGame.g:1245:1: ( 'to' )
            // InternalGame.g:1246:2: 'to'
            {
             before(grammarAccess.getLevelTransitionAccess().getToKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLevelTransitionAccess().getToKeyword_2()); 

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
    // $ANTLR end "rule__LevelTransition__Group__2__Impl"


    // $ANTLR start "rule__LevelTransition__Group__3"
    // InternalGame.g:1255:1: rule__LevelTransition__Group__3 : rule__LevelTransition__Group__3__Impl rule__LevelTransition__Group__4 ;
    public final void rule__LevelTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1259:1: ( rule__LevelTransition__Group__3__Impl rule__LevelTransition__Group__4 )
            // InternalGame.g:1260:2: rule__LevelTransition__Group__3__Impl rule__LevelTransition__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__LevelTransition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelTransition__Group__4();

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
    // $ANTLR end "rule__LevelTransition__Group__3"


    // $ANTLR start "rule__LevelTransition__Group__3__Impl"
    // InternalGame.g:1267:1: rule__LevelTransition__Group__3__Impl : ( ( rule__LevelTransition__LevelToAssignment_3 ) ) ;
    public final void rule__LevelTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1271:1: ( ( ( rule__LevelTransition__LevelToAssignment_3 ) ) )
            // InternalGame.g:1272:1: ( ( rule__LevelTransition__LevelToAssignment_3 ) )
            {
            // InternalGame.g:1272:1: ( ( rule__LevelTransition__LevelToAssignment_3 ) )
            // InternalGame.g:1273:2: ( rule__LevelTransition__LevelToAssignment_3 )
            {
             before(grammarAccess.getLevelTransitionAccess().getLevelToAssignment_3()); 
            // InternalGame.g:1274:2: ( rule__LevelTransition__LevelToAssignment_3 )
            // InternalGame.g:1274:3: rule__LevelTransition__LevelToAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LevelTransition__LevelToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLevelTransitionAccess().getLevelToAssignment_3()); 

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
    // $ANTLR end "rule__LevelTransition__Group__3__Impl"


    // $ANTLR start "rule__LevelTransition__Group__4"
    // InternalGame.g:1282:1: rule__LevelTransition__Group__4 : rule__LevelTransition__Group__4__Impl ;
    public final void rule__LevelTransition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1286:1: ( rule__LevelTransition__Group__4__Impl )
            // InternalGame.g:1287:2: rule__LevelTransition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LevelTransition__Group__4__Impl();

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
    // $ANTLR end "rule__LevelTransition__Group__4"


    // $ANTLR start "rule__LevelTransition__Group__4__Impl"
    // InternalGame.g:1293:1: rule__LevelTransition__Group__4__Impl : ( ';' ) ;
    public final void rule__LevelTransition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1297:1: ( ( ';' ) )
            // InternalGame.g:1298:1: ( ';' )
            {
            // InternalGame.g:1298:1: ( ';' )
            // InternalGame.g:1299:2: ';'
            {
             before(grammarAccess.getLevelTransitionAccess().getSemicolonKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLevelTransitionAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__LevelTransition__Group__4__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalGame.g:1309:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1313:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalGame.g:1314:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:1321:1: rule__Person__Group__0__Impl : ( ( rule__Person__NameAssignment_0 ) ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1325:1: ( ( ( rule__Person__NameAssignment_0 ) ) )
            // InternalGame.g:1326:1: ( ( rule__Person__NameAssignment_0 ) )
            {
            // InternalGame.g:1326:1: ( ( rule__Person__NameAssignment_0 ) )
            // InternalGame.g:1327:2: ( rule__Person__NameAssignment_0 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_0()); 
            // InternalGame.g:1328:2: ( rule__Person__NameAssignment_0 )
            // InternalGame.g:1328:3: rule__Person__NameAssignment_0
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
    // InternalGame.g:1336:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1340:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalGame.g:1341:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:1348:1: rule__Person__Group__1__Impl : ( '=' ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1352:1: ( ( '=' ) )
            // InternalGame.g:1353:1: ( '=' )
            {
            // InternalGame.g:1353:1: ( '=' )
            // InternalGame.g:1354:2: '='
            {
             before(grammarAccess.getPersonAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGame.g:1363:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1367:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalGame.g:1368:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalGame.g:1375:1: rule__Person__Group__2__Impl : ( '{' ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1379:1: ( ( '{' ) )
            // InternalGame.g:1380:1: ( '{' )
            {
            // InternalGame.g:1380:1: ( '{' )
            // InternalGame.g:1381:2: '{'
            {
             before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:1390:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1394:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalGame.g:1395:2: rule__Person__Group__3__Impl rule__Person__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:1402:1: rule__Person__Group__3__Impl : ( 'type' ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1406:1: ( ( 'type' ) )
            // InternalGame.g:1407:1: ( 'type' )
            {
            // InternalGame.g:1407:1: ( 'type' )
            // InternalGame.g:1408:2: 'type'
            {
             before(grammarAccess.getPersonAccess().getTypeKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGame.g:1417:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1421:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // InternalGame.g:1422:2: rule__Person__Group__4__Impl rule__Person__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalGame.g:1429:1: rule__Person__Group__4__Impl : ( '=' ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1433:1: ( ( '=' ) )
            // InternalGame.g:1434:1: ( '=' )
            {
            // InternalGame.g:1434:1: ( '=' )
            // InternalGame.g:1435:2: '='
            {
             before(grammarAccess.getPersonAccess().getEqualsSignKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGame.g:1444:1: rule__Person__Group__5 : rule__Person__Group__5__Impl rule__Person__Group__6 ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1448:1: ( rule__Person__Group__5__Impl rule__Person__Group__6 )
            // InternalGame.g:1449:2: rule__Person__Group__5__Impl rule__Person__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalGame.g:1456:1: rule__Person__Group__5__Impl : ( ( rule__Person__TypeAssignment_5 ) ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1460:1: ( ( ( rule__Person__TypeAssignment_5 ) ) )
            // InternalGame.g:1461:1: ( ( rule__Person__TypeAssignment_5 ) )
            {
            // InternalGame.g:1461:1: ( ( rule__Person__TypeAssignment_5 ) )
            // InternalGame.g:1462:2: ( rule__Person__TypeAssignment_5 )
            {
             before(grammarAccess.getPersonAccess().getTypeAssignment_5()); 
            // InternalGame.g:1463:2: ( rule__Person__TypeAssignment_5 )
            // InternalGame.g:1463:3: rule__Person__TypeAssignment_5
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
    // InternalGame.g:1471:1: rule__Person__Group__6 : rule__Person__Group__6__Impl rule__Person__Group__7 ;
    public final void rule__Person__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1475:1: ( rule__Person__Group__6__Impl rule__Person__Group__7 )
            // InternalGame.g:1476:2: rule__Person__Group__6__Impl rule__Person__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalGame.g:1483:1: rule__Person__Group__6__Impl : ( ';' ) ;
    public final void rule__Person__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1487:1: ( ( ';' ) )
            // InternalGame.g:1488:1: ( ';' )
            {
            // InternalGame.g:1488:1: ( ';' )
            // InternalGame.g:1489:2: ';'
            {
             before(grammarAccess.getPersonAccess().getSemicolonKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGame.g:1498:1: rule__Person__Group__7 : rule__Person__Group__7__Impl rule__Person__Group__8 ;
    public final void rule__Person__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1502:1: ( rule__Person__Group__7__Impl rule__Person__Group__8 )
            // InternalGame.g:1503:2: rule__Person__Group__7__Impl rule__Person__Group__8
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:1510:1: rule__Person__Group__7__Impl : ( 'response' ) ;
    public final void rule__Person__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1514:1: ( ( 'response' ) )
            // InternalGame.g:1515:1: ( 'response' )
            {
            // InternalGame.g:1515:1: ( 'response' )
            // InternalGame.g:1516:2: 'response'
            {
             before(grammarAccess.getPersonAccess().getResponseKeyword_7()); 
            match(input,30,FOLLOW_2); 
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
    // InternalGame.g:1525:1: rule__Person__Group__8 : rule__Person__Group__8__Impl rule__Person__Group__9 ;
    public final void rule__Person__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1529:1: ( rule__Person__Group__8__Impl rule__Person__Group__9 )
            // InternalGame.g:1530:2: rule__Person__Group__8__Impl rule__Person__Group__9
            {
            pushFollow(FOLLOW_21);
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
    // InternalGame.g:1537:1: rule__Person__Group__8__Impl : ( '=' ) ;
    public final void rule__Person__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1541:1: ( ( '=' ) )
            // InternalGame.g:1542:1: ( '=' )
            {
            // InternalGame.g:1542:1: ( '=' )
            // InternalGame.g:1543:2: '='
            {
             before(grammarAccess.getPersonAccess().getEqualsSignKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getEqualsSignKeyword_8()); 

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
    // InternalGame.g:1552:1: rule__Person__Group__9 : rule__Person__Group__9__Impl rule__Person__Group__10 ;
    public final void rule__Person__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1556:1: ( rule__Person__Group__9__Impl rule__Person__Group__10 )
            // InternalGame.g:1557:2: rule__Person__Group__9__Impl rule__Person__Group__10
            {
            pushFollow(FOLLOW_11);
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
    // InternalGame.g:1564:1: rule__Person__Group__9__Impl : ( ( rule__Person__ResponseAssignment_9 ) ) ;
    public final void rule__Person__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1568:1: ( ( ( rule__Person__ResponseAssignment_9 ) ) )
            // InternalGame.g:1569:1: ( ( rule__Person__ResponseAssignment_9 ) )
            {
            // InternalGame.g:1569:1: ( ( rule__Person__ResponseAssignment_9 ) )
            // InternalGame.g:1570:2: ( rule__Person__ResponseAssignment_9 )
            {
             before(grammarAccess.getPersonAccess().getResponseAssignment_9()); 
            // InternalGame.g:1571:2: ( rule__Person__ResponseAssignment_9 )
            // InternalGame.g:1571:3: rule__Person__ResponseAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Person__ResponseAssignment_9();

            state._fsp--;


            }

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
    // InternalGame.g:1579:1: rule__Person__Group__10 : rule__Person__Group__10__Impl rule__Person__Group__11 ;
    public final void rule__Person__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1583:1: ( rule__Person__Group__10__Impl rule__Person__Group__11 )
            // InternalGame.g:1584:2: rule__Person__Group__10__Impl rule__Person__Group__11
            {
            pushFollow(FOLLOW_22);
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
    // InternalGame.g:1591:1: rule__Person__Group__10__Impl : ( ';' ) ;
    public final void rule__Person__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1595:1: ( ( ';' ) )
            // InternalGame.g:1596:1: ( ';' )
            {
            // InternalGame.g:1596:1: ( ';' )
            // InternalGame.g:1597:2: ';'
            {
             before(grammarAccess.getPersonAccess().getSemicolonKeyword_10()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getSemicolonKeyword_10()); 

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
    // InternalGame.g:1606:1: rule__Person__Group__11 : rule__Person__Group__11__Impl rule__Person__Group__12 ;
    public final void rule__Person__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1610:1: ( rule__Person__Group__11__Impl rule__Person__Group__12 )
            // InternalGame.g:1611:2: rule__Person__Group__11__Impl rule__Person__Group__12
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:1618:1: rule__Person__Group__11__Impl : ( 'position' ) ;
    public final void rule__Person__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1622:1: ( ( 'position' ) )
            // InternalGame.g:1623:1: ( 'position' )
            {
            // InternalGame.g:1623:1: ( 'position' )
            // InternalGame.g:1624:2: 'position'
            {
             before(grammarAccess.getPersonAccess().getPositionKeyword_11()); 
            match(input,31,FOLLOW_2); 
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
    // InternalGame.g:1633:1: rule__Person__Group__12 : rule__Person__Group__12__Impl rule__Person__Group__13 ;
    public final void rule__Person__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1637:1: ( rule__Person__Group__12__Impl rule__Person__Group__13 )
            // InternalGame.g:1638:2: rule__Person__Group__12__Impl rule__Person__Group__13
            {
            pushFollow(FOLLOW_23);
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
    // InternalGame.g:1645:1: rule__Person__Group__12__Impl : ( '=' ) ;
    public final void rule__Person__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1649:1: ( ( '=' ) )
            // InternalGame.g:1650:1: ( '=' )
            {
            // InternalGame.g:1650:1: ( '=' )
            // InternalGame.g:1651:2: '='
            {
             before(grammarAccess.getPersonAccess().getEqualsSignKeyword_12()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGame.g:1660:1: rule__Person__Group__13 : rule__Person__Group__13__Impl rule__Person__Group__14 ;
    public final void rule__Person__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1664:1: ( rule__Person__Group__13__Impl rule__Person__Group__14 )
            // InternalGame.g:1665:2: rule__Person__Group__13__Impl rule__Person__Group__14
            {
            pushFollow(FOLLOW_11);
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
    // InternalGame.g:1672:1: rule__Person__Group__13__Impl : ( ( rule__Person__PositionAssignment_13 ) ) ;
    public final void rule__Person__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1676:1: ( ( ( rule__Person__PositionAssignment_13 ) ) )
            // InternalGame.g:1677:1: ( ( rule__Person__PositionAssignment_13 ) )
            {
            // InternalGame.g:1677:1: ( ( rule__Person__PositionAssignment_13 ) )
            // InternalGame.g:1678:2: ( rule__Person__PositionAssignment_13 )
            {
             before(grammarAccess.getPersonAccess().getPositionAssignment_13()); 
            // InternalGame.g:1679:2: ( rule__Person__PositionAssignment_13 )
            // InternalGame.g:1679:3: rule__Person__PositionAssignment_13
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
    // InternalGame.g:1687:1: rule__Person__Group__14 : rule__Person__Group__14__Impl rule__Person__Group__15 ;
    public final void rule__Person__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1691:1: ( rule__Person__Group__14__Impl rule__Person__Group__15 )
            // InternalGame.g:1692:2: rule__Person__Group__14__Impl rule__Person__Group__15
            {
            pushFollow(FOLLOW_24);
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
    // InternalGame.g:1699:1: rule__Person__Group__14__Impl : ( ';' ) ;
    public final void rule__Person__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1703:1: ( ( ';' ) )
            // InternalGame.g:1704:1: ( ';' )
            {
            // InternalGame.g:1704:1: ( ';' )
            // InternalGame.g:1705:2: ';'
            {
             before(grammarAccess.getPersonAccess().getSemicolonKeyword_14()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGame.g:1714:1: rule__Person__Group__15 : rule__Person__Group__15__Impl rule__Person__Group__16 ;
    public final void rule__Person__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1718:1: ( rule__Person__Group__15__Impl rule__Person__Group__16 )
            // InternalGame.g:1719:2: rule__Person__Group__15__Impl rule__Person__Group__16
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:1726:1: rule__Person__Group__15__Impl : ( 'action' ) ;
    public final void rule__Person__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1730:1: ( ( 'action' ) )
            // InternalGame.g:1731:1: ( 'action' )
            {
            // InternalGame.g:1731:1: ( 'action' )
            // InternalGame.g:1732:2: 'action'
            {
             before(grammarAccess.getPersonAccess().getActionKeyword_15()); 
            match(input,32,FOLLOW_2); 
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
    // InternalGame.g:1741:1: rule__Person__Group__16 : rule__Person__Group__16__Impl rule__Person__Group__17 ;
    public final void rule__Person__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1745:1: ( rule__Person__Group__16__Impl rule__Person__Group__17 )
            // InternalGame.g:1746:2: rule__Person__Group__16__Impl rule__Person__Group__17
            {
            pushFollow(FOLLOW_25);
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
    // InternalGame.g:1753:1: rule__Person__Group__16__Impl : ( '=' ) ;
    public final void rule__Person__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1757:1: ( ( '=' ) )
            // InternalGame.g:1758:1: ( '=' )
            {
            // InternalGame.g:1758:1: ( '=' )
            // InternalGame.g:1759:2: '='
            {
             before(grammarAccess.getPersonAccess().getEqualsSignKeyword_16()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGame.g:1768:1: rule__Person__Group__17 : rule__Person__Group__17__Impl rule__Person__Group__18 ;
    public final void rule__Person__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1772:1: ( rule__Person__Group__17__Impl rule__Person__Group__18 )
            // InternalGame.g:1773:2: rule__Person__Group__17__Impl rule__Person__Group__18
            {
            pushFollow(FOLLOW_11);
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
    // InternalGame.g:1780:1: rule__Person__Group__17__Impl : ( ( rule__Person__ActionAssignment_17 ) ) ;
    public final void rule__Person__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1784:1: ( ( ( rule__Person__ActionAssignment_17 ) ) )
            // InternalGame.g:1785:1: ( ( rule__Person__ActionAssignment_17 ) )
            {
            // InternalGame.g:1785:1: ( ( rule__Person__ActionAssignment_17 ) )
            // InternalGame.g:1786:2: ( rule__Person__ActionAssignment_17 )
            {
             before(grammarAccess.getPersonAccess().getActionAssignment_17()); 
            // InternalGame.g:1787:2: ( rule__Person__ActionAssignment_17 )
            // InternalGame.g:1787:3: rule__Person__ActionAssignment_17
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
    // InternalGame.g:1795:1: rule__Person__Group__18 : rule__Person__Group__18__Impl rule__Person__Group__19 ;
    public final void rule__Person__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1799:1: ( rule__Person__Group__18__Impl rule__Person__Group__19 )
            // InternalGame.g:1800:2: rule__Person__Group__18__Impl rule__Person__Group__19
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1807:1: rule__Person__Group__18__Impl : ( ';' ) ;
    public final void rule__Person__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1811:1: ( ( ';' ) )
            // InternalGame.g:1812:1: ( ';' )
            {
            // InternalGame.g:1812:1: ( ';' )
            // InternalGame.g:1813:2: ';'
            {
             before(grammarAccess.getPersonAccess().getSemicolonKeyword_18()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGame.g:1822:1: rule__Person__Group__19 : rule__Person__Group__19__Impl ;
    public final void rule__Person__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1826:1: ( rule__Person__Group__19__Impl )
            // InternalGame.g:1827:2: rule__Person__Group__19__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__19__Impl();

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
    // InternalGame.g:1833:1: rule__Person__Group__19__Impl : ( '}' ) ;
    public final void rule__Person__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1837:1: ( ( '}' ) )
            // InternalGame.g:1838:1: ( '}' )
            {
            // InternalGame.g:1838:1: ( '}' )
            // InternalGame.g:1839:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_19()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_19()); 

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


    // $ANTLR start "rule__Object__Group__0"
    // InternalGame.g:1849:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1853:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalGame.g:1854:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:1861:1: rule__Object__Group__0__Impl : ( ( rule__Object__NameAssignment_0 ) ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1865:1: ( ( ( rule__Object__NameAssignment_0 ) ) )
            // InternalGame.g:1866:1: ( ( rule__Object__NameAssignment_0 ) )
            {
            // InternalGame.g:1866:1: ( ( rule__Object__NameAssignment_0 ) )
            // InternalGame.g:1867:2: ( rule__Object__NameAssignment_0 )
            {
             before(grammarAccess.getObjectAccess().getNameAssignment_0()); 
            // InternalGame.g:1868:2: ( rule__Object__NameAssignment_0 )
            // InternalGame.g:1868:3: rule__Object__NameAssignment_0
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
    // InternalGame.g:1876:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1880:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalGame.g:1881:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:1888:1: rule__Object__Group__1__Impl : ( '=' ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1892:1: ( ( '=' ) )
            // InternalGame.g:1893:1: ( '=' )
            {
            // InternalGame.g:1893:1: ( '=' )
            // InternalGame.g:1894:2: '='
            {
             before(grammarAccess.getObjectAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGame.g:1903:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1907:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalGame.g:1908:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalGame.g:1915:1: rule__Object__Group__2__Impl : ( '{' ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1919:1: ( ( '{' ) )
            // InternalGame.g:1920:1: ( '{' )
            {
            // InternalGame.g:1920:1: ( '{' )
            // InternalGame.g:1921:2: '{'
            {
             before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:1930:1: rule__Object__Group__3 : rule__Object__Group__3__Impl rule__Object__Group__4 ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1934:1: ( rule__Object__Group__3__Impl rule__Object__Group__4 )
            // InternalGame.g:1935:2: rule__Object__Group__3__Impl rule__Object__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:1942:1: rule__Object__Group__3__Impl : ( 'type' ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1946:1: ( ( 'type' ) )
            // InternalGame.g:1947:1: ( 'type' )
            {
            // InternalGame.g:1947:1: ( 'type' )
            // InternalGame.g:1948:2: 'type'
            {
             before(grammarAccess.getObjectAccess().getTypeKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGame.g:1957:1: rule__Object__Group__4 : rule__Object__Group__4__Impl rule__Object__Group__5 ;
    public final void rule__Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1961:1: ( rule__Object__Group__4__Impl rule__Object__Group__5 )
            // InternalGame.g:1962:2: rule__Object__Group__4__Impl rule__Object__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalGame.g:1969:1: rule__Object__Group__4__Impl : ( '=' ) ;
    public final void rule__Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1973:1: ( ( '=' ) )
            // InternalGame.g:1974:1: ( '=' )
            {
            // InternalGame.g:1974:1: ( '=' )
            // InternalGame.g:1975:2: '='
            {
             before(grammarAccess.getObjectAccess().getEqualsSignKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGame.g:1984:1: rule__Object__Group__5 : rule__Object__Group__5__Impl rule__Object__Group__6 ;
    public final void rule__Object__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1988:1: ( rule__Object__Group__5__Impl rule__Object__Group__6 )
            // InternalGame.g:1989:2: rule__Object__Group__5__Impl rule__Object__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalGame.g:1996:1: rule__Object__Group__5__Impl : ( ( rule__Object__TypeAssignment_5 ) ) ;
    public final void rule__Object__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2000:1: ( ( ( rule__Object__TypeAssignment_5 ) ) )
            // InternalGame.g:2001:1: ( ( rule__Object__TypeAssignment_5 ) )
            {
            // InternalGame.g:2001:1: ( ( rule__Object__TypeAssignment_5 ) )
            // InternalGame.g:2002:2: ( rule__Object__TypeAssignment_5 )
            {
             before(grammarAccess.getObjectAccess().getTypeAssignment_5()); 
            // InternalGame.g:2003:2: ( rule__Object__TypeAssignment_5 )
            // InternalGame.g:2003:3: rule__Object__TypeAssignment_5
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
    // InternalGame.g:2011:1: rule__Object__Group__6 : rule__Object__Group__6__Impl rule__Object__Group__7 ;
    public final void rule__Object__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2015:1: ( rule__Object__Group__6__Impl rule__Object__Group__7 )
            // InternalGame.g:2016:2: rule__Object__Group__6__Impl rule__Object__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalGame.g:2023:1: rule__Object__Group__6__Impl : ( ';' ) ;
    public final void rule__Object__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2027:1: ( ( ';' ) )
            // InternalGame.g:2028:1: ( ';' )
            {
            // InternalGame.g:2028:1: ( ';' )
            // InternalGame.g:2029:2: ';'
            {
             before(grammarAccess.getObjectAccess().getSemicolonKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGame.g:2038:1: rule__Object__Group__7 : rule__Object__Group__7__Impl rule__Object__Group__8 ;
    public final void rule__Object__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2042:1: ( rule__Object__Group__7__Impl rule__Object__Group__8 )
            // InternalGame.g:2043:2: rule__Object__Group__7__Impl rule__Object__Group__8
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:2050:1: rule__Object__Group__7__Impl : ( 'position' ) ;
    public final void rule__Object__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2054:1: ( ( 'position' ) )
            // InternalGame.g:2055:1: ( 'position' )
            {
            // InternalGame.g:2055:1: ( 'position' )
            // InternalGame.g:2056:2: 'position'
            {
             before(grammarAccess.getObjectAccess().getPositionKeyword_7()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getPositionKeyword_7()); 

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
    // InternalGame.g:2065:1: rule__Object__Group__8 : rule__Object__Group__8__Impl rule__Object__Group__9 ;
    public final void rule__Object__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2069:1: ( rule__Object__Group__8__Impl rule__Object__Group__9 )
            // InternalGame.g:2070:2: rule__Object__Group__8__Impl rule__Object__Group__9
            {
            pushFollow(FOLLOW_23);
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
    // InternalGame.g:2077:1: rule__Object__Group__8__Impl : ( '=' ) ;
    public final void rule__Object__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2081:1: ( ( '=' ) )
            // InternalGame.g:2082:1: ( '=' )
            {
            // InternalGame.g:2082:1: ( '=' )
            // InternalGame.g:2083:2: '='
            {
             before(grammarAccess.getObjectAccess().getEqualsSignKeyword_8()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGame.g:2092:1: rule__Object__Group__9 : rule__Object__Group__9__Impl rule__Object__Group__10 ;
    public final void rule__Object__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2096:1: ( rule__Object__Group__9__Impl rule__Object__Group__10 )
            // InternalGame.g:2097:2: rule__Object__Group__9__Impl rule__Object__Group__10
            {
            pushFollow(FOLLOW_11);
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
    // InternalGame.g:2104:1: rule__Object__Group__9__Impl : ( ( rule__Object__PositionAssignment_9 ) ) ;
    public final void rule__Object__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2108:1: ( ( ( rule__Object__PositionAssignment_9 ) ) )
            // InternalGame.g:2109:1: ( ( rule__Object__PositionAssignment_9 ) )
            {
            // InternalGame.g:2109:1: ( ( rule__Object__PositionAssignment_9 ) )
            // InternalGame.g:2110:2: ( rule__Object__PositionAssignment_9 )
            {
             before(grammarAccess.getObjectAccess().getPositionAssignment_9()); 
            // InternalGame.g:2111:2: ( rule__Object__PositionAssignment_9 )
            // InternalGame.g:2111:3: rule__Object__PositionAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Object__PositionAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getPositionAssignment_9()); 

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
    // InternalGame.g:2119:1: rule__Object__Group__10 : rule__Object__Group__10__Impl rule__Object__Group__11 ;
    public final void rule__Object__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2123:1: ( rule__Object__Group__10__Impl rule__Object__Group__11 )
            // InternalGame.g:2124:2: rule__Object__Group__10__Impl rule__Object__Group__11
            {
            pushFollow(FOLLOW_24);
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
    // InternalGame.g:2131:1: rule__Object__Group__10__Impl : ( ';' ) ;
    public final void rule__Object__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2135:1: ( ( ';' ) )
            // InternalGame.g:2136:1: ( ';' )
            {
            // InternalGame.g:2136:1: ( ';' )
            // InternalGame.g:2137:2: ';'
            {
             before(grammarAccess.getObjectAccess().getSemicolonKeyword_10()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGame.g:2146:1: rule__Object__Group__11 : rule__Object__Group__11__Impl rule__Object__Group__12 ;
    public final void rule__Object__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2150:1: ( rule__Object__Group__11__Impl rule__Object__Group__12 )
            // InternalGame.g:2151:2: rule__Object__Group__11__Impl rule__Object__Group__12
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:2158:1: rule__Object__Group__11__Impl : ( 'action' ) ;
    public final void rule__Object__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2162:1: ( ( 'action' ) )
            // InternalGame.g:2163:1: ( 'action' )
            {
            // InternalGame.g:2163:1: ( 'action' )
            // InternalGame.g:2164:2: 'action'
            {
             before(grammarAccess.getObjectAccess().getActionKeyword_11()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getActionKeyword_11()); 

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
    // InternalGame.g:2173:1: rule__Object__Group__12 : rule__Object__Group__12__Impl rule__Object__Group__13 ;
    public final void rule__Object__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2177:1: ( rule__Object__Group__12__Impl rule__Object__Group__13 )
            // InternalGame.g:2178:2: rule__Object__Group__12__Impl rule__Object__Group__13
            {
            pushFollow(FOLLOW_25);
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
    // InternalGame.g:2185:1: rule__Object__Group__12__Impl : ( '=' ) ;
    public final void rule__Object__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2189:1: ( ( '=' ) )
            // InternalGame.g:2190:1: ( '=' )
            {
            // InternalGame.g:2190:1: ( '=' )
            // InternalGame.g:2191:2: '='
            {
             before(grammarAccess.getObjectAccess().getEqualsSignKeyword_12()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGame.g:2200:1: rule__Object__Group__13 : rule__Object__Group__13__Impl rule__Object__Group__14 ;
    public final void rule__Object__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2204:1: ( rule__Object__Group__13__Impl rule__Object__Group__14 )
            // InternalGame.g:2205:2: rule__Object__Group__13__Impl rule__Object__Group__14
            {
            pushFollow(FOLLOW_11);
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
    // InternalGame.g:2212:1: rule__Object__Group__13__Impl : ( ( rule__Object__ActionAssignment_13 ) ) ;
    public final void rule__Object__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2216:1: ( ( ( rule__Object__ActionAssignment_13 ) ) )
            // InternalGame.g:2217:1: ( ( rule__Object__ActionAssignment_13 ) )
            {
            // InternalGame.g:2217:1: ( ( rule__Object__ActionAssignment_13 ) )
            // InternalGame.g:2218:2: ( rule__Object__ActionAssignment_13 )
            {
             before(grammarAccess.getObjectAccess().getActionAssignment_13()); 
            // InternalGame.g:2219:2: ( rule__Object__ActionAssignment_13 )
            // InternalGame.g:2219:3: rule__Object__ActionAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Object__ActionAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getActionAssignment_13()); 

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
    // InternalGame.g:2227:1: rule__Object__Group__14 : rule__Object__Group__14__Impl rule__Object__Group__15 ;
    public final void rule__Object__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2231:1: ( rule__Object__Group__14__Impl rule__Object__Group__15 )
            // InternalGame.g:2232:2: rule__Object__Group__14__Impl rule__Object__Group__15
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:2239:1: rule__Object__Group__14__Impl : ( ';' ) ;
    public final void rule__Object__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2243:1: ( ( ';' ) )
            // InternalGame.g:2244:1: ( ';' )
            {
            // InternalGame.g:2244:1: ( ';' )
            // InternalGame.g:2245:2: ';'
            {
             before(grammarAccess.getObjectAccess().getSemicolonKeyword_14()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGame.g:2254:1: rule__Object__Group__15 : rule__Object__Group__15__Impl ;
    public final void rule__Object__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2258:1: ( rule__Object__Group__15__Impl )
            // InternalGame.g:2259:2: rule__Object__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__15__Impl();

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
    // InternalGame.g:2265:1: rule__Object__Group__15__Impl : ( '}' ) ;
    public final void rule__Object__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2269:1: ( ( '}' ) )
            // InternalGame.g:2270:1: ( '}' )
            {
            // InternalGame.g:2270:1: ( '}' )
            // InternalGame.g:2271:2: '}'
            {
             before(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_15()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_15()); 

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


    // $ANTLR start "rule__Game__DefinitionAssignment_0"
    // InternalGame.g:2281:1: rule__Game__DefinitionAssignment_0 : ( ruleDefinition ) ;
    public final void rule__Game__DefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2285:1: ( ( ruleDefinition ) )
            // InternalGame.g:2286:2: ( ruleDefinition )
            {
            // InternalGame.g:2286:2: ( ruleDefinition )
            // InternalGame.g:2287:3: ruleDefinition
            {
             before(grammarAccess.getGameAccess().getDefinitionDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getGameAccess().getDefinitionDefinitionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Game__DefinitionAssignment_0"


    // $ANTLR start "rule__Game__ScenesAssignment_2"
    // InternalGame.g:2296:1: rule__Game__ScenesAssignment_2 : ( ruleScene ) ;
    public final void rule__Game__ScenesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2300:1: ( ( ruleScene ) )
            // InternalGame.g:2301:2: ( ruleScene )
            {
            // InternalGame.g:2301:2: ( ruleScene )
            // InternalGame.g:2302:3: ruleScene
            {
             before(grammarAccess.getGameAccess().getScenesSceneParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleScene();

            state._fsp--;

             after(grammarAccess.getGameAccess().getScenesSceneParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Game__ScenesAssignment_2"


    // $ANTLR start "rule__Definition__NameAssignment_1"
    // InternalGame.g:2311:1: rule__Definition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2315:1: ( ( RULE_ID ) )
            // InternalGame.g:2316:2: ( RULE_ID )
            {
            // InternalGame.g:2316:2: ( RULE_ID )
            // InternalGame.g:2317:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Definition__NameAssignment_1"


    // $ANTLR start "rule__Scene__DeclartionsAssignment_0"
    // InternalGame.g:2326:1: rule__Scene__DeclartionsAssignment_0 : ( ruleLevelDeclaration ) ;
    public final void rule__Scene__DeclartionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2330:1: ( ( ruleLevelDeclaration ) )
            // InternalGame.g:2331:2: ( ruleLevelDeclaration )
            {
            // InternalGame.g:2331:2: ( ruleLevelDeclaration )
            // InternalGame.g:2332:3: ruleLevelDeclaration
            {
             before(grammarAccess.getSceneAccess().getDeclartionsLevelDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLevelDeclaration();

            state._fsp--;

             after(grammarAccess.getSceneAccess().getDeclartionsLevelDeclarationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Scene__DeclartionsAssignment_0"


    // $ANTLR start "rule__Scene__DefinitionsAssignment_1"
    // InternalGame.g:2341:1: rule__Scene__DefinitionsAssignment_1 : ( ruleLevelDefinition ) ;
    public final void rule__Scene__DefinitionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2345:1: ( ( ruleLevelDefinition ) )
            // InternalGame.g:2346:2: ( ruleLevelDefinition )
            {
            // InternalGame.g:2346:2: ( ruleLevelDefinition )
            // InternalGame.g:2347:3: ruleLevelDefinition
            {
             before(grammarAccess.getSceneAccess().getDefinitionsLevelDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLevelDefinition();

            state._fsp--;

             after(grammarAccess.getSceneAccess().getDefinitionsLevelDefinitionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Scene__DefinitionsAssignment_1"


    // $ANTLR start "rule__Scene__StartLevelAssignment_4"
    // InternalGame.g:2356:1: rule__Scene__StartLevelAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Scene__StartLevelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2360:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2361:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2361:2: ( ( RULE_ID ) )
            // InternalGame.g:2362:3: ( RULE_ID )
            {
             before(grammarAccess.getSceneAccess().getStartLevelLevelDeclarationCrossReference_4_0()); 
            // InternalGame.g:2363:3: ( RULE_ID )
            // InternalGame.g:2364:4: RULE_ID
            {
             before(grammarAccess.getSceneAccess().getStartLevelLevelDeclarationIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getStartLevelLevelDeclarationIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSceneAccess().getStartLevelLevelDeclarationCrossReference_4_0()); 

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
    // $ANTLR end "rule__Scene__StartLevelAssignment_4"


    // $ANTLR start "rule__Scene__FinalLevelAssignment_8"
    // InternalGame.g:2375:1: rule__Scene__FinalLevelAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Scene__FinalLevelAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2379:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2380:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2380:2: ( ( RULE_ID ) )
            // InternalGame.g:2381:3: ( RULE_ID )
            {
             before(grammarAccess.getSceneAccess().getFinalLevelLevelDeclarationCrossReference_8_0()); 
            // InternalGame.g:2382:3: ( RULE_ID )
            // InternalGame.g:2383:4: RULE_ID
            {
             before(grammarAccess.getSceneAccess().getFinalLevelLevelDeclarationIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getFinalLevelLevelDeclarationIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getSceneAccess().getFinalLevelLevelDeclarationCrossReference_8_0()); 

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
    // $ANTLR end "rule__Scene__FinalLevelAssignment_8"


    // $ANTLR start "rule__Scene__TransitionsAssignment_10"
    // InternalGame.g:2394:1: rule__Scene__TransitionsAssignment_10 : ( ruleLevelTransition ) ;
    public final void rule__Scene__TransitionsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2398:1: ( ( ruleLevelTransition ) )
            // InternalGame.g:2399:2: ( ruleLevelTransition )
            {
            // InternalGame.g:2399:2: ( ruleLevelTransition )
            // InternalGame.g:2400:3: ruleLevelTransition
            {
             before(grammarAccess.getSceneAccess().getTransitionsLevelTransitionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleLevelTransition();

            state._fsp--;

             after(grammarAccess.getSceneAccess().getTransitionsLevelTransitionParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Scene__TransitionsAssignment_10"


    // $ANTLR start "rule__LevelDeclaration__NameAssignment_1"
    // InternalGame.g:2409:1: rule__LevelDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LevelDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2413:1: ( ( RULE_ID ) )
            // InternalGame.g:2414:2: ( RULE_ID )
            {
            // InternalGame.g:2414:2: ( RULE_ID )
            // InternalGame.g:2415:3: RULE_ID
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
    // InternalGame.g:2424:1: rule__LevelDefinition__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__LevelDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2428:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2429:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2429:2: ( ( RULE_ID ) )
            // InternalGame.g:2430:3: ( RULE_ID )
            {
             before(grammarAccess.getLevelDefinitionAccess().getNameLevelDeclarationCrossReference_0_0()); 
            // InternalGame.g:2431:3: ( RULE_ID )
            // InternalGame.g:2432:4: RULE_ID
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


    // $ANTLR start "rule__LevelDefinition__PersonsAssignment_3"
    // InternalGame.g:2443:1: rule__LevelDefinition__PersonsAssignment_3 : ( rulePerson ) ;
    public final void rule__LevelDefinition__PersonsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2447:1: ( ( rulePerson ) )
            // InternalGame.g:2448:2: ( rulePerson )
            {
            // InternalGame.g:2448:2: ( rulePerson )
            // InternalGame.g:2449:3: rulePerson
            {
             before(grammarAccess.getLevelDefinitionAccess().getPersonsPersonParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getLevelDefinitionAccess().getPersonsPersonParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__LevelDefinition__PersonsAssignment_3"


    // $ANTLR start "rule__LevelDefinition__ObjectsAssignment_4"
    // InternalGame.g:2458:1: rule__LevelDefinition__ObjectsAssignment_4 : ( ruleObject ) ;
    public final void rule__LevelDefinition__ObjectsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2462:1: ( ( ruleObject ) )
            // InternalGame.g:2463:2: ( ruleObject )
            {
            // InternalGame.g:2463:2: ( ruleObject )
            // InternalGame.g:2464:3: ruleObject
            {
             before(grammarAccess.getLevelDefinitionAccess().getObjectsObjectParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getLevelDefinitionAccess().getObjectsObjectParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__LevelDefinition__ObjectsAssignment_4"


    // $ANTLR start "rule__LevelDefinition__GoalIdAssignment_7"
    // InternalGame.g:2473:1: rule__LevelDefinition__GoalIdAssignment_7 : ( RULE_ID ) ;
    public final void rule__LevelDefinition__GoalIdAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2477:1: ( ( RULE_ID ) )
            // InternalGame.g:2478:2: ( RULE_ID )
            {
            // InternalGame.g:2478:2: ( RULE_ID )
            // InternalGame.g:2479:3: RULE_ID
            {
             before(grammarAccess.getLevelDefinitionAccess().getGoalIdIDTerminalRuleCall_7_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getGoalIdIDTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__LevelDefinition__GoalIdAssignment_7"


    // $ANTLR start "rule__LevelTransition__LevelFromAssignment_1"
    // InternalGame.g:2488:1: rule__LevelTransition__LevelFromAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__LevelTransition__LevelFromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2492:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2493:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2493:2: ( ( RULE_ID ) )
            // InternalGame.g:2494:3: ( RULE_ID )
            {
             before(grammarAccess.getLevelTransitionAccess().getLevelFromLevelDeclarationCrossReference_1_0()); 
            // InternalGame.g:2495:3: ( RULE_ID )
            // InternalGame.g:2496:4: RULE_ID
            {
             before(grammarAccess.getLevelTransitionAccess().getLevelFromLevelDeclarationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLevelTransitionAccess().getLevelFromLevelDeclarationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getLevelTransitionAccess().getLevelFromLevelDeclarationCrossReference_1_0()); 

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
    // $ANTLR end "rule__LevelTransition__LevelFromAssignment_1"


    // $ANTLR start "rule__LevelTransition__LevelToAssignment_3"
    // InternalGame.g:2507:1: rule__LevelTransition__LevelToAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__LevelTransition__LevelToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2511:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2512:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2512:2: ( ( RULE_ID ) )
            // InternalGame.g:2513:3: ( RULE_ID )
            {
             before(grammarAccess.getLevelTransitionAccess().getLevelToLevelDeclarationCrossReference_3_0()); 
            // InternalGame.g:2514:3: ( RULE_ID )
            // InternalGame.g:2515:4: RULE_ID
            {
             before(grammarAccess.getLevelTransitionAccess().getLevelToLevelDeclarationIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLevelTransitionAccess().getLevelToLevelDeclarationIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getLevelTransitionAccess().getLevelToLevelDeclarationCrossReference_3_0()); 

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
    // $ANTLR end "rule__LevelTransition__LevelToAssignment_3"


    // $ANTLR start "rule__Person__NameAssignment_0"
    // InternalGame.g:2526:1: rule__Person__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Person__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2530:1: ( ( RULE_ID ) )
            // InternalGame.g:2531:2: ( RULE_ID )
            {
            // InternalGame.g:2531:2: ( RULE_ID )
            // InternalGame.g:2532:3: RULE_ID
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
    // InternalGame.g:2541:1: rule__Person__TypeAssignment_5 : ( rulePERSON_T ) ;
    public final void rule__Person__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2545:1: ( ( rulePERSON_T ) )
            // InternalGame.g:2546:2: ( rulePERSON_T )
            {
            // InternalGame.g:2546:2: ( rulePERSON_T )
            // InternalGame.g:2547:3: rulePERSON_T
            {
             before(grammarAccess.getPersonAccess().getTypePERSON_TEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePERSON_T();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getTypePERSON_TEnumRuleCall_5_0()); 

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
    // InternalGame.g:2556:1: rule__Person__ResponseAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Person__ResponseAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2560:1: ( ( RULE_STRING ) )
            // InternalGame.g:2561:2: ( RULE_STRING )
            {
            // InternalGame.g:2561:2: ( RULE_STRING )
            // InternalGame.g:2562:3: RULE_STRING
            {
             before(grammarAccess.getPersonAccess().getResponseSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getResponseSTRINGTerminalRuleCall_9_0()); 

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
    // InternalGame.g:2571:1: rule__Person__PositionAssignment_13 : ( rulePosition_E ) ;
    public final void rule__Person__PositionAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2575:1: ( ( rulePosition_E ) )
            // InternalGame.g:2576:2: ( rulePosition_E )
            {
            // InternalGame.g:2576:2: ( rulePosition_E )
            // InternalGame.g:2577:3: rulePosition_E
            {
             before(grammarAccess.getPersonAccess().getPositionPosition_EEnumRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            rulePosition_E();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getPositionPosition_EEnumRuleCall_13_0()); 

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
    // InternalGame.g:2586:1: rule__Person__ActionAssignment_17 : ( ruleAction ) ;
    public final void rule__Person__ActionAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2590:1: ( ( ruleAction ) )
            // InternalGame.g:2591:2: ( ruleAction )
            {
            // InternalGame.g:2591:2: ( ruleAction )
            // InternalGame.g:2592:3: ruleAction
            {
             before(grammarAccess.getPersonAccess().getActionActionEnumRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getActionActionEnumRuleCall_17_0()); 

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


    // $ANTLR start "rule__Object__NameAssignment_0"
    // InternalGame.g:2601:1: rule__Object__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Object__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2605:1: ( ( RULE_ID ) )
            // InternalGame.g:2606:2: ( RULE_ID )
            {
            // InternalGame.g:2606:2: ( RULE_ID )
            // InternalGame.g:2607:3: RULE_ID
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
    // InternalGame.g:2616:1: rule__Object__TypeAssignment_5 : ( ruleOBJECT_T ) ;
    public final void rule__Object__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2620:1: ( ( ruleOBJECT_T ) )
            // InternalGame.g:2621:2: ( ruleOBJECT_T )
            {
            // InternalGame.g:2621:2: ( ruleOBJECT_T )
            // InternalGame.g:2622:3: ruleOBJECT_T
            {
             before(grammarAccess.getObjectAccess().getTypeOBJECT_TEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOBJECT_T();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getTypeOBJECT_TEnumRuleCall_5_0()); 

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


    // $ANTLR start "rule__Object__PositionAssignment_9"
    // InternalGame.g:2631:1: rule__Object__PositionAssignment_9 : ( rulePosition_E ) ;
    public final void rule__Object__PositionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2635:1: ( ( rulePosition_E ) )
            // InternalGame.g:2636:2: ( rulePosition_E )
            {
            // InternalGame.g:2636:2: ( rulePosition_E )
            // InternalGame.g:2637:3: rulePosition_E
            {
             before(grammarAccess.getObjectAccess().getPositionPosition_EEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            rulePosition_E();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getPositionPosition_EEnumRuleCall_9_0()); 

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
    // $ANTLR end "rule__Object__PositionAssignment_9"


    // $ANTLR start "rule__Object__ActionAssignment_13"
    // InternalGame.g:2646:1: rule__Object__ActionAssignment_13 : ( ruleAction ) ;
    public final void rule__Object__ActionAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2650:1: ( ( ruleAction ) )
            // InternalGame.g:2651:2: ( ruleAction )
            {
            // InternalGame.g:2651:2: ( ruleAction )
            // InternalGame.g:2652:3: ruleAction
            {
             before(grammarAccess.getObjectAccess().getActionActionEnumRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getActionActionEnumRuleCall_13_0()); 

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
    // $ANTLR end "rule__Object__ActionAssignment_13"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002280010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002200012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002200010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000800L});

}