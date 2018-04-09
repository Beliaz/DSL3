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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'type_A'", "'male'", "'female'", "'{'", "'}'", "'new'", "'start'", "'='", "';'", "'final'", "'level'", "'goal'", "'from'", "'to'", "'type'", "'response'", "'position'", "'pos_x'", "'pos_y'"
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


    // $ANTLR start "entryRulePosition"
    // InternalGame.g:253:1: entryRulePosition : rulePosition EOF ;
    public final void entryRulePosition() throws RecognitionException {
        try {
            // InternalGame.g:254:1: ( rulePosition EOF )
            // InternalGame.g:255:1: rulePosition EOF
            {
             before(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getPositionRule()); 
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
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalGame.g:262:1: rulePosition : ( ( rule__Position__Group__0 ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:266:2: ( ( ( rule__Position__Group__0 ) ) )
            // InternalGame.g:267:2: ( ( rule__Position__Group__0 ) )
            {
            // InternalGame.g:267:2: ( ( rule__Position__Group__0 ) )
            // InternalGame.g:268:3: ( rule__Position__Group__0 )
            {
             before(grammarAccess.getPositionAccess().getGroup()); 
            // InternalGame.g:269:3: ( rule__Position__Group__0 )
            // InternalGame.g:269:4: rule__Position__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "rulePERSON_T"
    // InternalGame.g:278:1: rulePERSON_T : ( ( rule__PERSON_T__Alternatives ) ) ;
    public final void rulePERSON_T() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:282:1: ( ( ( rule__PERSON_T__Alternatives ) ) )
            // InternalGame.g:283:2: ( ( rule__PERSON_T__Alternatives ) )
            {
            // InternalGame.g:283:2: ( ( rule__PERSON_T__Alternatives ) )
            // InternalGame.g:284:3: ( rule__PERSON_T__Alternatives )
            {
             before(grammarAccess.getPERSON_TAccess().getAlternatives()); 
            // InternalGame.g:285:3: ( rule__PERSON_T__Alternatives )
            // InternalGame.g:285:4: rule__PERSON_T__Alternatives
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
    // InternalGame.g:294:1: ruleOBJECT_T : ( ( 'type_A' ) ) ;
    public final void ruleOBJECT_T() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:298:1: ( ( ( 'type_A' ) ) )
            // InternalGame.g:299:2: ( ( 'type_A' ) )
            {
            // InternalGame.g:299:2: ( ( 'type_A' ) )
            // InternalGame.g:300:3: ( 'type_A' )
            {
             before(grammarAccess.getOBJECT_TAccess().getAEnumLiteralDeclaration()); 
            // InternalGame.g:301:3: ( 'type_A' )
            // InternalGame.g:301:4: 'type_A'
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


    // $ANTLR start "rule__PERSON_T__Alternatives"
    // InternalGame.g:309:1: rule__PERSON_T__Alternatives : ( ( ( 'male' ) ) | ( ( 'female' ) ) );
    public final void rule__PERSON_T__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:313:1: ( ( ( 'male' ) ) | ( ( 'female' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGame.g:314:2: ( ( 'male' ) )
                    {
                    // InternalGame.g:314:2: ( ( 'male' ) )
                    // InternalGame.g:315:3: ( 'male' )
                    {
                     before(grammarAccess.getPERSON_TAccess().getMALEEnumLiteralDeclaration_0()); 
                    // InternalGame.g:316:3: ( 'male' )
                    // InternalGame.g:316:4: 'male'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getPERSON_TAccess().getMALEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:320:2: ( ( 'female' ) )
                    {
                    // InternalGame.g:320:2: ( ( 'female' ) )
                    // InternalGame.g:321:3: ( 'female' )
                    {
                     before(grammarAccess.getPERSON_TAccess().getFEMALEEnumLiteralDeclaration_1()); 
                    // InternalGame.g:322:3: ( 'female' )
                    // InternalGame.g:322:4: 'female'
                    {
                    match(input,13,FOLLOW_2); 

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


    // $ANTLR start "rule__Game__Group__0"
    // InternalGame.g:330:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:334:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalGame.g:335:2: rule__Game__Group__0__Impl rule__Game__Group__1
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
    // InternalGame.g:342:1: rule__Game__Group__0__Impl : ( ( rule__Game__DefinitionAssignment_0 ) ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:346:1: ( ( ( rule__Game__DefinitionAssignment_0 ) ) )
            // InternalGame.g:347:1: ( ( rule__Game__DefinitionAssignment_0 ) )
            {
            // InternalGame.g:347:1: ( ( rule__Game__DefinitionAssignment_0 ) )
            // InternalGame.g:348:2: ( rule__Game__DefinitionAssignment_0 )
            {
             before(grammarAccess.getGameAccess().getDefinitionAssignment_0()); 
            // InternalGame.g:349:2: ( rule__Game__DefinitionAssignment_0 )
            // InternalGame.g:349:3: rule__Game__DefinitionAssignment_0
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
    // InternalGame.g:357:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:361:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalGame.g:362:2: rule__Game__Group__1__Impl rule__Game__Group__2
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
    // InternalGame.g:369:1: rule__Game__Group__1__Impl : ( '{' ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:373:1: ( ( '{' ) )
            // InternalGame.g:374:1: ( '{' )
            {
            // InternalGame.g:374:1: ( '{' )
            // InternalGame.g:375:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGame.g:384:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:388:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalGame.g:389:2: rule__Game__Group__2__Impl rule__Game__Group__3
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
    // InternalGame.g:396:1: rule__Game__Group__2__Impl : ( ( rule__Game__ScenesAssignment_2 )* ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:400:1: ( ( ( rule__Game__ScenesAssignment_2 )* ) )
            // InternalGame.g:401:1: ( ( rule__Game__ScenesAssignment_2 )* )
            {
            // InternalGame.g:401:1: ( ( rule__Game__ScenesAssignment_2 )* )
            // InternalGame.g:402:2: ( rule__Game__ScenesAssignment_2 )*
            {
             before(grammarAccess.getGameAccess().getScenesAssignment_2()); 
            // InternalGame.g:403:2: ( rule__Game__ScenesAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==17||LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGame.g:403:3: rule__Game__ScenesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Game__ScenesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalGame.g:411:1: rule__Game__Group__3 : rule__Game__Group__3__Impl ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:415:1: ( rule__Game__Group__3__Impl )
            // InternalGame.g:416:2: rule__Game__Group__3__Impl
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
    // InternalGame.g:422:1: rule__Game__Group__3__Impl : ( '}' ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:426:1: ( ( '}' ) )
            // InternalGame.g:427:1: ( '}' )
            {
            // InternalGame.g:427:1: ( '}' )
            // InternalGame.g:428:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
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
    // InternalGame.g:438:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:442:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // InternalGame.g:443:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
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
    // InternalGame.g:450:1: rule__Definition__Group__0__Impl : ( 'new' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:454:1: ( ( 'new' ) )
            // InternalGame.g:455:1: ( 'new' )
            {
            // InternalGame.g:455:1: ( 'new' )
            // InternalGame.g:456:2: 'new'
            {
             before(grammarAccess.getDefinitionAccess().getNewKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalGame.g:465:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:469:1: ( rule__Definition__Group__1__Impl )
            // InternalGame.g:470:2: rule__Definition__Group__1__Impl
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
    // InternalGame.g:476:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__NameAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:480:1: ( ( ( rule__Definition__NameAssignment_1 ) ) )
            // InternalGame.g:481:1: ( ( rule__Definition__NameAssignment_1 ) )
            {
            // InternalGame.g:481:1: ( ( rule__Definition__NameAssignment_1 ) )
            // InternalGame.g:482:2: ( rule__Definition__NameAssignment_1 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_1()); 
            // InternalGame.g:483:2: ( rule__Definition__NameAssignment_1 )
            // InternalGame.g:483:3: rule__Definition__NameAssignment_1
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
    // InternalGame.g:492:1: rule__Scene__Group__0 : rule__Scene__Group__0__Impl rule__Scene__Group__1 ;
    public final void rule__Scene__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:496:1: ( rule__Scene__Group__0__Impl rule__Scene__Group__1 )
            // InternalGame.g:497:2: rule__Scene__Group__0__Impl rule__Scene__Group__1
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
    // InternalGame.g:504:1: rule__Scene__Group__0__Impl : ( ( rule__Scene__DeclartionsAssignment_0 )* ) ;
    public final void rule__Scene__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:508:1: ( ( ( rule__Scene__DeclartionsAssignment_0 )* ) )
            // InternalGame.g:509:1: ( ( rule__Scene__DeclartionsAssignment_0 )* )
            {
            // InternalGame.g:509:1: ( ( rule__Scene__DeclartionsAssignment_0 )* )
            // InternalGame.g:510:2: ( rule__Scene__DeclartionsAssignment_0 )*
            {
             before(grammarAccess.getSceneAccess().getDeclartionsAssignment_0()); 
            // InternalGame.g:511:2: ( rule__Scene__DeclartionsAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGame.g:511:3: rule__Scene__DeclartionsAssignment_0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Scene__DeclartionsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalGame.g:519:1: rule__Scene__Group__1 : rule__Scene__Group__1__Impl rule__Scene__Group__2 ;
    public final void rule__Scene__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:523:1: ( rule__Scene__Group__1__Impl rule__Scene__Group__2 )
            // InternalGame.g:524:2: rule__Scene__Group__1__Impl rule__Scene__Group__2
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
    // InternalGame.g:531:1: rule__Scene__Group__1__Impl : ( ( rule__Scene__DefinitionsAssignment_1 )* ) ;
    public final void rule__Scene__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:535:1: ( ( ( rule__Scene__DefinitionsAssignment_1 )* ) )
            // InternalGame.g:536:1: ( ( rule__Scene__DefinitionsAssignment_1 )* )
            {
            // InternalGame.g:536:1: ( ( rule__Scene__DefinitionsAssignment_1 )* )
            // InternalGame.g:537:2: ( rule__Scene__DefinitionsAssignment_1 )*
            {
             before(grammarAccess.getSceneAccess().getDefinitionsAssignment_1()); 
            // InternalGame.g:538:2: ( rule__Scene__DefinitionsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:538:3: rule__Scene__DefinitionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Scene__DefinitionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalGame.g:546:1: rule__Scene__Group__2 : rule__Scene__Group__2__Impl rule__Scene__Group__3 ;
    public final void rule__Scene__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:550:1: ( rule__Scene__Group__2__Impl rule__Scene__Group__3 )
            // InternalGame.g:551:2: rule__Scene__Group__2__Impl rule__Scene__Group__3
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
    // InternalGame.g:558:1: rule__Scene__Group__2__Impl : ( 'start' ) ;
    public final void rule__Scene__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:562:1: ( ( 'start' ) )
            // InternalGame.g:563:1: ( 'start' )
            {
            // InternalGame.g:563:1: ( 'start' )
            // InternalGame.g:564:2: 'start'
            {
             before(grammarAccess.getSceneAccess().getStartKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalGame.g:573:1: rule__Scene__Group__3 : rule__Scene__Group__3__Impl rule__Scene__Group__4 ;
    public final void rule__Scene__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:577:1: ( rule__Scene__Group__3__Impl rule__Scene__Group__4 )
            // InternalGame.g:578:2: rule__Scene__Group__3__Impl rule__Scene__Group__4
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
    // InternalGame.g:585:1: rule__Scene__Group__3__Impl : ( '=' ) ;
    public final void rule__Scene__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:589:1: ( ( '=' ) )
            // InternalGame.g:590:1: ( '=' )
            {
            // InternalGame.g:590:1: ( '=' )
            // InternalGame.g:591:2: '='
            {
             before(grammarAccess.getSceneAccess().getEqualsSignKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:600:1: rule__Scene__Group__4 : rule__Scene__Group__4__Impl rule__Scene__Group__5 ;
    public final void rule__Scene__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:604:1: ( rule__Scene__Group__4__Impl rule__Scene__Group__5 )
            // InternalGame.g:605:2: rule__Scene__Group__4__Impl rule__Scene__Group__5
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
    // InternalGame.g:612:1: rule__Scene__Group__4__Impl : ( ( rule__Scene__StartLevelAssignment_4 ) ) ;
    public final void rule__Scene__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:616:1: ( ( ( rule__Scene__StartLevelAssignment_4 ) ) )
            // InternalGame.g:617:1: ( ( rule__Scene__StartLevelAssignment_4 ) )
            {
            // InternalGame.g:617:1: ( ( rule__Scene__StartLevelAssignment_4 ) )
            // InternalGame.g:618:2: ( rule__Scene__StartLevelAssignment_4 )
            {
             before(grammarAccess.getSceneAccess().getStartLevelAssignment_4()); 
            // InternalGame.g:619:2: ( rule__Scene__StartLevelAssignment_4 )
            // InternalGame.g:619:3: rule__Scene__StartLevelAssignment_4
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
    // InternalGame.g:627:1: rule__Scene__Group__5 : rule__Scene__Group__5__Impl rule__Scene__Group__6 ;
    public final void rule__Scene__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:631:1: ( rule__Scene__Group__5__Impl rule__Scene__Group__6 )
            // InternalGame.g:632:2: rule__Scene__Group__5__Impl rule__Scene__Group__6
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
    // InternalGame.g:639:1: rule__Scene__Group__5__Impl : ( ';' ) ;
    public final void rule__Scene__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:643:1: ( ( ';' ) )
            // InternalGame.g:644:1: ( ';' )
            {
            // InternalGame.g:644:1: ( ';' )
            // InternalGame.g:645:2: ';'
            {
             before(grammarAccess.getSceneAccess().getSemicolonKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:654:1: rule__Scene__Group__6 : rule__Scene__Group__6__Impl rule__Scene__Group__7 ;
    public final void rule__Scene__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:658:1: ( rule__Scene__Group__6__Impl rule__Scene__Group__7 )
            // InternalGame.g:659:2: rule__Scene__Group__6__Impl rule__Scene__Group__7
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
    // InternalGame.g:666:1: rule__Scene__Group__6__Impl : ( 'final' ) ;
    public final void rule__Scene__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:670:1: ( ( 'final' ) )
            // InternalGame.g:671:1: ( 'final' )
            {
            // InternalGame.g:671:1: ( 'final' )
            // InternalGame.g:672:2: 'final'
            {
             before(grammarAccess.getSceneAccess().getFinalKeyword_6()); 
            match(input,20,FOLLOW_2); 
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
    // InternalGame.g:681:1: rule__Scene__Group__7 : rule__Scene__Group__7__Impl rule__Scene__Group__8 ;
    public final void rule__Scene__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:685:1: ( rule__Scene__Group__7__Impl rule__Scene__Group__8 )
            // InternalGame.g:686:2: rule__Scene__Group__7__Impl rule__Scene__Group__8
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
    // InternalGame.g:693:1: rule__Scene__Group__7__Impl : ( '=' ) ;
    public final void rule__Scene__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:697:1: ( ( '=' ) )
            // InternalGame.g:698:1: ( '=' )
            {
            // InternalGame.g:698:1: ( '=' )
            // InternalGame.g:699:2: '='
            {
             before(grammarAccess.getSceneAccess().getEqualsSignKeyword_7()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:708:1: rule__Scene__Group__8 : rule__Scene__Group__8__Impl rule__Scene__Group__9 ;
    public final void rule__Scene__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:712:1: ( rule__Scene__Group__8__Impl rule__Scene__Group__9 )
            // InternalGame.g:713:2: rule__Scene__Group__8__Impl rule__Scene__Group__9
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
    // InternalGame.g:720:1: rule__Scene__Group__8__Impl : ( ( rule__Scene__FinalLevelAssignment_8 ) ) ;
    public final void rule__Scene__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:724:1: ( ( ( rule__Scene__FinalLevelAssignment_8 ) ) )
            // InternalGame.g:725:1: ( ( rule__Scene__FinalLevelAssignment_8 ) )
            {
            // InternalGame.g:725:1: ( ( rule__Scene__FinalLevelAssignment_8 ) )
            // InternalGame.g:726:2: ( rule__Scene__FinalLevelAssignment_8 )
            {
             before(grammarAccess.getSceneAccess().getFinalLevelAssignment_8()); 
            // InternalGame.g:727:2: ( rule__Scene__FinalLevelAssignment_8 )
            // InternalGame.g:727:3: rule__Scene__FinalLevelAssignment_8
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
    // InternalGame.g:735:1: rule__Scene__Group__9 : rule__Scene__Group__9__Impl rule__Scene__Group__10 ;
    public final void rule__Scene__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:739:1: ( rule__Scene__Group__9__Impl rule__Scene__Group__10 )
            // InternalGame.g:740:2: rule__Scene__Group__9__Impl rule__Scene__Group__10
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
    // InternalGame.g:747:1: rule__Scene__Group__9__Impl : ( ';' ) ;
    public final void rule__Scene__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:751:1: ( ( ';' ) )
            // InternalGame.g:752:1: ( ';' )
            {
            // InternalGame.g:752:1: ( ';' )
            // InternalGame.g:753:2: ';'
            {
             before(grammarAccess.getSceneAccess().getSemicolonKeyword_9()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:762:1: rule__Scene__Group__10 : rule__Scene__Group__10__Impl ;
    public final void rule__Scene__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:766:1: ( rule__Scene__Group__10__Impl )
            // InternalGame.g:767:2: rule__Scene__Group__10__Impl
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
    // InternalGame.g:773:1: rule__Scene__Group__10__Impl : ( ( rule__Scene__TransitionsAssignment_10 )* ) ;
    public final void rule__Scene__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:777:1: ( ( ( rule__Scene__TransitionsAssignment_10 )* ) )
            // InternalGame.g:778:1: ( ( rule__Scene__TransitionsAssignment_10 )* )
            {
            // InternalGame.g:778:1: ( ( rule__Scene__TransitionsAssignment_10 )* )
            // InternalGame.g:779:2: ( rule__Scene__TransitionsAssignment_10 )*
            {
             before(grammarAccess.getSceneAccess().getTransitionsAssignment_10()); 
            // InternalGame.g:780:2: ( rule__Scene__TransitionsAssignment_10 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGame.g:780:3: rule__Scene__TransitionsAssignment_10
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Scene__TransitionsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalGame.g:789:1: rule__LevelDeclaration__Group__0 : rule__LevelDeclaration__Group__0__Impl rule__LevelDeclaration__Group__1 ;
    public final void rule__LevelDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:793:1: ( rule__LevelDeclaration__Group__0__Impl rule__LevelDeclaration__Group__1 )
            // InternalGame.g:794:2: rule__LevelDeclaration__Group__0__Impl rule__LevelDeclaration__Group__1
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
    // InternalGame.g:801:1: rule__LevelDeclaration__Group__0__Impl : ( 'level' ) ;
    public final void rule__LevelDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:805:1: ( ( 'level' ) )
            // InternalGame.g:806:1: ( 'level' )
            {
            // InternalGame.g:806:1: ( 'level' )
            // InternalGame.g:807:2: 'level'
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
    // InternalGame.g:816:1: rule__LevelDeclaration__Group__1 : rule__LevelDeclaration__Group__1__Impl rule__LevelDeclaration__Group__2 ;
    public final void rule__LevelDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:820:1: ( rule__LevelDeclaration__Group__1__Impl rule__LevelDeclaration__Group__2 )
            // InternalGame.g:821:2: rule__LevelDeclaration__Group__1__Impl rule__LevelDeclaration__Group__2
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
    // InternalGame.g:828:1: rule__LevelDeclaration__Group__1__Impl : ( ( rule__LevelDeclaration__NameAssignment_1 ) ) ;
    public final void rule__LevelDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:832:1: ( ( ( rule__LevelDeclaration__NameAssignment_1 ) ) )
            // InternalGame.g:833:1: ( ( rule__LevelDeclaration__NameAssignment_1 ) )
            {
            // InternalGame.g:833:1: ( ( rule__LevelDeclaration__NameAssignment_1 ) )
            // InternalGame.g:834:2: ( rule__LevelDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getLevelDeclarationAccess().getNameAssignment_1()); 
            // InternalGame.g:835:2: ( rule__LevelDeclaration__NameAssignment_1 )
            // InternalGame.g:835:3: rule__LevelDeclaration__NameAssignment_1
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
    // InternalGame.g:843:1: rule__LevelDeclaration__Group__2 : rule__LevelDeclaration__Group__2__Impl ;
    public final void rule__LevelDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:847:1: ( rule__LevelDeclaration__Group__2__Impl )
            // InternalGame.g:848:2: rule__LevelDeclaration__Group__2__Impl
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
    // InternalGame.g:854:1: rule__LevelDeclaration__Group__2__Impl : ( ';' ) ;
    public final void rule__LevelDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:858:1: ( ( ';' ) )
            // InternalGame.g:859:1: ( ';' )
            {
            // InternalGame.g:859:1: ( ';' )
            // InternalGame.g:860:2: ';'
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
    // InternalGame.g:870:1: rule__LevelDefinition__Group__0 : rule__LevelDefinition__Group__0__Impl rule__LevelDefinition__Group__1 ;
    public final void rule__LevelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:874:1: ( rule__LevelDefinition__Group__0__Impl rule__LevelDefinition__Group__1 )
            // InternalGame.g:875:2: rule__LevelDefinition__Group__0__Impl rule__LevelDefinition__Group__1
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
    // InternalGame.g:882:1: rule__LevelDefinition__Group__0__Impl : ( ( rule__LevelDefinition__NameAssignment_0 ) ) ;
    public final void rule__LevelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:886:1: ( ( ( rule__LevelDefinition__NameAssignment_0 ) ) )
            // InternalGame.g:887:1: ( ( rule__LevelDefinition__NameAssignment_0 ) )
            {
            // InternalGame.g:887:1: ( ( rule__LevelDefinition__NameAssignment_0 ) )
            // InternalGame.g:888:2: ( rule__LevelDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getLevelDefinitionAccess().getNameAssignment_0()); 
            // InternalGame.g:889:2: ( rule__LevelDefinition__NameAssignment_0 )
            // InternalGame.g:889:3: rule__LevelDefinition__NameAssignment_0
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
    // InternalGame.g:897:1: rule__LevelDefinition__Group__1 : rule__LevelDefinition__Group__1__Impl rule__LevelDefinition__Group__2 ;
    public final void rule__LevelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:901:1: ( rule__LevelDefinition__Group__1__Impl rule__LevelDefinition__Group__2 )
            // InternalGame.g:902:2: rule__LevelDefinition__Group__1__Impl rule__LevelDefinition__Group__2
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
    // InternalGame.g:909:1: rule__LevelDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__LevelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:913:1: ( ( '=' ) )
            // InternalGame.g:914:1: ( '=' )
            {
            // InternalGame.g:914:1: ( '=' )
            // InternalGame.g:915:2: '='
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
    // InternalGame.g:924:1: rule__LevelDefinition__Group__2 : rule__LevelDefinition__Group__2__Impl rule__LevelDefinition__Group__3 ;
    public final void rule__LevelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:928:1: ( rule__LevelDefinition__Group__2__Impl rule__LevelDefinition__Group__3 )
            // InternalGame.g:929:2: rule__LevelDefinition__Group__2__Impl rule__LevelDefinition__Group__3
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
    // InternalGame.g:936:1: rule__LevelDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__LevelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:940:1: ( ( '{' ) )
            // InternalGame.g:941:1: ( '{' )
            {
            // InternalGame.g:941:1: ( '{' )
            // InternalGame.g:942:2: '{'
            {
             before(grammarAccess.getLevelDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGame.g:951:1: rule__LevelDefinition__Group__3 : rule__LevelDefinition__Group__3__Impl rule__LevelDefinition__Group__4 ;
    public final void rule__LevelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:955:1: ( rule__LevelDefinition__Group__3__Impl rule__LevelDefinition__Group__4 )
            // InternalGame.g:956:2: rule__LevelDefinition__Group__3__Impl rule__LevelDefinition__Group__4
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
    // InternalGame.g:963:1: rule__LevelDefinition__Group__3__Impl : ( ( rule__LevelDefinition__PersonsAssignment_3 )* ) ;
    public final void rule__LevelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:967:1: ( ( ( rule__LevelDefinition__PersonsAssignment_3 )* ) )
            // InternalGame.g:968:1: ( ( rule__LevelDefinition__PersonsAssignment_3 )* )
            {
            // InternalGame.g:968:1: ( ( rule__LevelDefinition__PersonsAssignment_3 )* )
            // InternalGame.g:969:2: ( rule__LevelDefinition__PersonsAssignment_3 )*
            {
             before(grammarAccess.getLevelDefinitionAccess().getPersonsAssignment_3()); 
            // InternalGame.g:970:2: ( rule__LevelDefinition__PersonsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==18) ) {
                        int LA6_3 = input.LA(3);

                        if ( (LA6_3==14) ) {
                            int LA6_4 = input.LA(4);

                            if ( (LA6_4==25) ) {
                                int LA6_5 = input.LA(5);

                                if ( (LA6_5==18) ) {
                                    int LA6_6 = input.LA(6);

                                    if ( ((LA6_6>=12 && LA6_6<=13)) ) {
                                        alt6=1;
                                    }


                                }


                            }


                        }


                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalGame.g:970:3: rule__LevelDefinition__PersonsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__LevelDefinition__PersonsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalGame.g:978:1: rule__LevelDefinition__Group__4 : rule__LevelDefinition__Group__4__Impl rule__LevelDefinition__Group__5 ;
    public final void rule__LevelDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:982:1: ( rule__LevelDefinition__Group__4__Impl rule__LevelDefinition__Group__5 )
            // InternalGame.g:983:2: rule__LevelDefinition__Group__4__Impl rule__LevelDefinition__Group__5
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
    // InternalGame.g:990:1: rule__LevelDefinition__Group__4__Impl : ( ( rule__LevelDefinition__ObjectsAssignment_4 )* ) ;
    public final void rule__LevelDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:994:1: ( ( ( rule__LevelDefinition__ObjectsAssignment_4 )* ) )
            // InternalGame.g:995:1: ( ( rule__LevelDefinition__ObjectsAssignment_4 )* )
            {
            // InternalGame.g:995:1: ( ( rule__LevelDefinition__ObjectsAssignment_4 )* )
            // InternalGame.g:996:2: ( rule__LevelDefinition__ObjectsAssignment_4 )*
            {
             before(grammarAccess.getLevelDefinitionAccess().getObjectsAssignment_4()); 
            // InternalGame.g:997:2: ( rule__LevelDefinition__ObjectsAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGame.g:997:3: rule__LevelDefinition__ObjectsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__LevelDefinition__ObjectsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalGame.g:1005:1: rule__LevelDefinition__Group__5 : rule__LevelDefinition__Group__5__Impl rule__LevelDefinition__Group__6 ;
    public final void rule__LevelDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1009:1: ( rule__LevelDefinition__Group__5__Impl rule__LevelDefinition__Group__6 )
            // InternalGame.g:1010:2: rule__LevelDefinition__Group__5__Impl rule__LevelDefinition__Group__6
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
    // InternalGame.g:1017:1: rule__LevelDefinition__Group__5__Impl : ( 'goal' ) ;
    public final void rule__LevelDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1021:1: ( ( 'goal' ) )
            // InternalGame.g:1022:1: ( 'goal' )
            {
            // InternalGame.g:1022:1: ( 'goal' )
            // InternalGame.g:1023:2: 'goal'
            {
             before(grammarAccess.getLevelDefinitionAccess().getGoalKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalGame.g:1032:1: rule__LevelDefinition__Group__6 : rule__LevelDefinition__Group__6__Impl rule__LevelDefinition__Group__7 ;
    public final void rule__LevelDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1036:1: ( rule__LevelDefinition__Group__6__Impl rule__LevelDefinition__Group__7 )
            // InternalGame.g:1037:2: rule__LevelDefinition__Group__6__Impl rule__LevelDefinition__Group__7
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
    // InternalGame.g:1044:1: rule__LevelDefinition__Group__6__Impl : ( '=' ) ;
    public final void rule__LevelDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1048:1: ( ( '=' ) )
            // InternalGame.g:1049:1: ( '=' )
            {
            // InternalGame.g:1049:1: ( '=' )
            // InternalGame.g:1050:2: '='
            {
             before(grammarAccess.getLevelDefinitionAccess().getEqualsSignKeyword_6()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:1059:1: rule__LevelDefinition__Group__7 : rule__LevelDefinition__Group__7__Impl rule__LevelDefinition__Group__8 ;
    public final void rule__LevelDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1063:1: ( rule__LevelDefinition__Group__7__Impl rule__LevelDefinition__Group__8 )
            // InternalGame.g:1064:2: rule__LevelDefinition__Group__7__Impl rule__LevelDefinition__Group__8
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
    // InternalGame.g:1071:1: rule__LevelDefinition__Group__7__Impl : ( ( rule__LevelDefinition__GoalIdAssignment_7 ) ) ;
    public final void rule__LevelDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1075:1: ( ( ( rule__LevelDefinition__GoalIdAssignment_7 ) ) )
            // InternalGame.g:1076:1: ( ( rule__LevelDefinition__GoalIdAssignment_7 ) )
            {
            // InternalGame.g:1076:1: ( ( rule__LevelDefinition__GoalIdAssignment_7 ) )
            // InternalGame.g:1077:2: ( rule__LevelDefinition__GoalIdAssignment_7 )
            {
             before(grammarAccess.getLevelDefinitionAccess().getGoalIdAssignment_7()); 
            // InternalGame.g:1078:2: ( rule__LevelDefinition__GoalIdAssignment_7 )
            // InternalGame.g:1078:3: rule__LevelDefinition__GoalIdAssignment_7
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
    // InternalGame.g:1086:1: rule__LevelDefinition__Group__8 : rule__LevelDefinition__Group__8__Impl rule__LevelDefinition__Group__9 ;
    public final void rule__LevelDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1090:1: ( rule__LevelDefinition__Group__8__Impl rule__LevelDefinition__Group__9 )
            // InternalGame.g:1091:2: rule__LevelDefinition__Group__8__Impl rule__LevelDefinition__Group__9
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
    // InternalGame.g:1098:1: rule__LevelDefinition__Group__8__Impl : ( ';' ) ;
    public final void rule__LevelDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1102:1: ( ( ';' ) )
            // InternalGame.g:1103:1: ( ';' )
            {
            // InternalGame.g:1103:1: ( ';' )
            // InternalGame.g:1104:2: ';'
            {
             before(grammarAccess.getLevelDefinitionAccess().getSemicolonKeyword_8()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:1113:1: rule__LevelDefinition__Group__9 : rule__LevelDefinition__Group__9__Impl ;
    public final void rule__LevelDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1117:1: ( rule__LevelDefinition__Group__9__Impl )
            // InternalGame.g:1118:2: rule__LevelDefinition__Group__9__Impl
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
    // InternalGame.g:1124:1: rule__LevelDefinition__Group__9__Impl : ( '}' ) ;
    public final void rule__LevelDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1128:1: ( ( '}' ) )
            // InternalGame.g:1129:1: ( '}' )
            {
            // InternalGame.g:1129:1: ( '}' )
            // InternalGame.g:1130:2: '}'
            {
             before(grammarAccess.getLevelDefinitionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_2); 
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
    // InternalGame.g:1140:1: rule__LevelTransition__Group__0 : rule__LevelTransition__Group__0__Impl rule__LevelTransition__Group__1 ;
    public final void rule__LevelTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1144:1: ( rule__LevelTransition__Group__0__Impl rule__LevelTransition__Group__1 )
            // InternalGame.g:1145:2: rule__LevelTransition__Group__0__Impl rule__LevelTransition__Group__1
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
    // InternalGame.g:1152:1: rule__LevelTransition__Group__0__Impl : ( 'from' ) ;
    public final void rule__LevelTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1156:1: ( ( 'from' ) )
            // InternalGame.g:1157:1: ( 'from' )
            {
            // InternalGame.g:1157:1: ( 'from' )
            // InternalGame.g:1158:2: 'from'
            {
             before(grammarAccess.getLevelTransitionAccess().getFromKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalGame.g:1167:1: rule__LevelTransition__Group__1 : rule__LevelTransition__Group__1__Impl rule__LevelTransition__Group__2 ;
    public final void rule__LevelTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1171:1: ( rule__LevelTransition__Group__1__Impl rule__LevelTransition__Group__2 )
            // InternalGame.g:1172:2: rule__LevelTransition__Group__1__Impl rule__LevelTransition__Group__2
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
    // InternalGame.g:1179:1: rule__LevelTransition__Group__1__Impl : ( ( rule__LevelTransition__LevelFromAssignment_1 ) ) ;
    public final void rule__LevelTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1183:1: ( ( ( rule__LevelTransition__LevelFromAssignment_1 ) ) )
            // InternalGame.g:1184:1: ( ( rule__LevelTransition__LevelFromAssignment_1 ) )
            {
            // InternalGame.g:1184:1: ( ( rule__LevelTransition__LevelFromAssignment_1 ) )
            // InternalGame.g:1185:2: ( rule__LevelTransition__LevelFromAssignment_1 )
            {
             before(grammarAccess.getLevelTransitionAccess().getLevelFromAssignment_1()); 
            // InternalGame.g:1186:2: ( rule__LevelTransition__LevelFromAssignment_1 )
            // InternalGame.g:1186:3: rule__LevelTransition__LevelFromAssignment_1
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
    // InternalGame.g:1194:1: rule__LevelTransition__Group__2 : rule__LevelTransition__Group__2__Impl rule__LevelTransition__Group__3 ;
    public final void rule__LevelTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1198:1: ( rule__LevelTransition__Group__2__Impl rule__LevelTransition__Group__3 )
            // InternalGame.g:1199:2: rule__LevelTransition__Group__2__Impl rule__LevelTransition__Group__3
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
    // InternalGame.g:1206:1: rule__LevelTransition__Group__2__Impl : ( 'to' ) ;
    public final void rule__LevelTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1210:1: ( ( 'to' ) )
            // InternalGame.g:1211:1: ( 'to' )
            {
            // InternalGame.g:1211:1: ( 'to' )
            // InternalGame.g:1212:2: 'to'
            {
             before(grammarAccess.getLevelTransitionAccess().getToKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalGame.g:1221:1: rule__LevelTransition__Group__3 : rule__LevelTransition__Group__3__Impl rule__LevelTransition__Group__4 ;
    public final void rule__LevelTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1225:1: ( rule__LevelTransition__Group__3__Impl rule__LevelTransition__Group__4 )
            // InternalGame.g:1226:2: rule__LevelTransition__Group__3__Impl rule__LevelTransition__Group__4
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
    // InternalGame.g:1233:1: rule__LevelTransition__Group__3__Impl : ( ( rule__LevelTransition__LevelToAssignment_3 ) ) ;
    public final void rule__LevelTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1237:1: ( ( ( rule__LevelTransition__LevelToAssignment_3 ) ) )
            // InternalGame.g:1238:1: ( ( rule__LevelTransition__LevelToAssignment_3 ) )
            {
            // InternalGame.g:1238:1: ( ( rule__LevelTransition__LevelToAssignment_3 ) )
            // InternalGame.g:1239:2: ( rule__LevelTransition__LevelToAssignment_3 )
            {
             before(grammarAccess.getLevelTransitionAccess().getLevelToAssignment_3()); 
            // InternalGame.g:1240:2: ( rule__LevelTransition__LevelToAssignment_3 )
            // InternalGame.g:1240:3: rule__LevelTransition__LevelToAssignment_3
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
    // InternalGame.g:1248:1: rule__LevelTransition__Group__4 : rule__LevelTransition__Group__4__Impl ;
    public final void rule__LevelTransition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1252:1: ( rule__LevelTransition__Group__4__Impl )
            // InternalGame.g:1253:2: rule__LevelTransition__Group__4__Impl
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
    // InternalGame.g:1259:1: rule__LevelTransition__Group__4__Impl : ( ';' ) ;
    public final void rule__LevelTransition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1263:1: ( ( ';' ) )
            // InternalGame.g:1264:1: ( ';' )
            {
            // InternalGame.g:1264:1: ( ';' )
            // InternalGame.g:1265:2: ';'
            {
             before(grammarAccess.getLevelTransitionAccess().getSemicolonKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:1275:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1279:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalGame.g:1280:2: rule__Person__Group__0__Impl rule__Person__Group__1
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
    // InternalGame.g:1287:1: rule__Person__Group__0__Impl : ( ( rule__Person__NameAssignment_0 ) ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1291:1: ( ( ( rule__Person__NameAssignment_0 ) ) )
            // InternalGame.g:1292:1: ( ( rule__Person__NameAssignment_0 ) )
            {
            // InternalGame.g:1292:1: ( ( rule__Person__NameAssignment_0 ) )
            // InternalGame.g:1293:2: ( rule__Person__NameAssignment_0 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_0()); 
            // InternalGame.g:1294:2: ( rule__Person__NameAssignment_0 )
            // InternalGame.g:1294:3: rule__Person__NameAssignment_0
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
    // InternalGame.g:1302:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1306:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalGame.g:1307:2: rule__Person__Group__1__Impl rule__Person__Group__2
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
    // InternalGame.g:1314:1: rule__Person__Group__1__Impl : ( '=' ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1318:1: ( ( '=' ) )
            // InternalGame.g:1319:1: ( '=' )
            {
            // InternalGame.g:1319:1: ( '=' )
            // InternalGame.g:1320:2: '='
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
    // InternalGame.g:1329:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1333:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalGame.g:1334:2: rule__Person__Group__2__Impl rule__Person__Group__3
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
    // InternalGame.g:1341:1: rule__Person__Group__2__Impl : ( '{' ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1345:1: ( ( '{' ) )
            // InternalGame.g:1346:1: ( '{' )
            {
            // InternalGame.g:1346:1: ( '{' )
            // InternalGame.g:1347:2: '{'
            {
             before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGame.g:1356:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1360:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalGame.g:1361:2: rule__Person__Group__3__Impl rule__Person__Group__4
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
    // InternalGame.g:1368:1: rule__Person__Group__3__Impl : ( 'type' ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1372:1: ( ( 'type' ) )
            // InternalGame.g:1373:1: ( 'type' )
            {
            // InternalGame.g:1373:1: ( 'type' )
            // InternalGame.g:1374:2: 'type'
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
    // InternalGame.g:1383:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1387:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // InternalGame.g:1388:2: rule__Person__Group__4__Impl rule__Person__Group__5
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
    // InternalGame.g:1395:1: rule__Person__Group__4__Impl : ( '=' ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1399:1: ( ( '=' ) )
            // InternalGame.g:1400:1: ( '=' )
            {
            // InternalGame.g:1400:1: ( '=' )
            // InternalGame.g:1401:2: '='
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
    // InternalGame.g:1410:1: rule__Person__Group__5 : rule__Person__Group__5__Impl rule__Person__Group__6 ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1414:1: ( rule__Person__Group__5__Impl rule__Person__Group__6 )
            // InternalGame.g:1415:2: rule__Person__Group__5__Impl rule__Person__Group__6
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
    // InternalGame.g:1422:1: rule__Person__Group__5__Impl : ( ( rule__Person__TypeAssignment_5 ) ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1426:1: ( ( ( rule__Person__TypeAssignment_5 ) ) )
            // InternalGame.g:1427:1: ( ( rule__Person__TypeAssignment_5 ) )
            {
            // InternalGame.g:1427:1: ( ( rule__Person__TypeAssignment_5 ) )
            // InternalGame.g:1428:2: ( rule__Person__TypeAssignment_5 )
            {
             before(grammarAccess.getPersonAccess().getTypeAssignment_5()); 
            // InternalGame.g:1429:2: ( rule__Person__TypeAssignment_5 )
            // InternalGame.g:1429:3: rule__Person__TypeAssignment_5
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
    // InternalGame.g:1437:1: rule__Person__Group__6 : rule__Person__Group__6__Impl rule__Person__Group__7 ;
    public final void rule__Person__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1441:1: ( rule__Person__Group__6__Impl rule__Person__Group__7 )
            // InternalGame.g:1442:2: rule__Person__Group__6__Impl rule__Person__Group__7
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
    // InternalGame.g:1449:1: rule__Person__Group__6__Impl : ( ';' ) ;
    public final void rule__Person__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1453:1: ( ( ';' ) )
            // InternalGame.g:1454:1: ( ';' )
            {
            // InternalGame.g:1454:1: ( ';' )
            // InternalGame.g:1455:2: ';'
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
    // InternalGame.g:1464:1: rule__Person__Group__7 : rule__Person__Group__7__Impl rule__Person__Group__8 ;
    public final void rule__Person__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1468:1: ( rule__Person__Group__7__Impl rule__Person__Group__8 )
            // InternalGame.g:1469:2: rule__Person__Group__7__Impl rule__Person__Group__8
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
    // InternalGame.g:1476:1: rule__Person__Group__7__Impl : ( 'response' ) ;
    public final void rule__Person__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1480:1: ( ( 'response' ) )
            // InternalGame.g:1481:1: ( 'response' )
            {
            // InternalGame.g:1481:1: ( 'response' )
            // InternalGame.g:1482:2: 'response'
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
    // InternalGame.g:1491:1: rule__Person__Group__8 : rule__Person__Group__8__Impl rule__Person__Group__9 ;
    public final void rule__Person__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1495:1: ( rule__Person__Group__8__Impl rule__Person__Group__9 )
            // InternalGame.g:1496:2: rule__Person__Group__8__Impl rule__Person__Group__9
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
    // InternalGame.g:1503:1: rule__Person__Group__8__Impl : ( '=' ) ;
    public final void rule__Person__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1507:1: ( ( '=' ) )
            // InternalGame.g:1508:1: ( '=' )
            {
            // InternalGame.g:1508:1: ( '=' )
            // InternalGame.g:1509:2: '='
            {
             before(grammarAccess.getPersonAccess().getEqualsSignKeyword_8()); 
            match(input,18,FOLLOW_2); 
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
    // InternalGame.g:1518:1: rule__Person__Group__9 : rule__Person__Group__9__Impl rule__Person__Group__10 ;
    public final void rule__Person__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1522:1: ( rule__Person__Group__9__Impl rule__Person__Group__10 )
            // InternalGame.g:1523:2: rule__Person__Group__9__Impl rule__Person__Group__10
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
    // InternalGame.g:1530:1: rule__Person__Group__9__Impl : ( ( rule__Person__ResponseAssignment_9 ) ) ;
    public final void rule__Person__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1534:1: ( ( ( rule__Person__ResponseAssignment_9 ) ) )
            // InternalGame.g:1535:1: ( ( rule__Person__ResponseAssignment_9 ) )
            {
            // InternalGame.g:1535:1: ( ( rule__Person__ResponseAssignment_9 ) )
            // InternalGame.g:1536:2: ( rule__Person__ResponseAssignment_9 )
            {
             before(grammarAccess.getPersonAccess().getResponseAssignment_9()); 
            // InternalGame.g:1537:2: ( rule__Person__ResponseAssignment_9 )
            // InternalGame.g:1537:3: rule__Person__ResponseAssignment_9
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
    // InternalGame.g:1545:1: rule__Person__Group__10 : rule__Person__Group__10__Impl rule__Person__Group__11 ;
    public final void rule__Person__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1549:1: ( rule__Person__Group__10__Impl rule__Person__Group__11 )
            // InternalGame.g:1550:2: rule__Person__Group__10__Impl rule__Person__Group__11
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
    // InternalGame.g:1557:1: rule__Person__Group__10__Impl : ( ';' ) ;
    public final void rule__Person__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1561:1: ( ( ';' ) )
            // InternalGame.g:1562:1: ( ';' )
            {
            // InternalGame.g:1562:1: ( ';' )
            // InternalGame.g:1563:2: ';'
            {
             before(grammarAccess.getPersonAccess().getSemicolonKeyword_10()); 
            match(input,19,FOLLOW_2); 
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
    // InternalGame.g:1572:1: rule__Person__Group__11 : rule__Person__Group__11__Impl rule__Person__Group__12 ;
    public final void rule__Person__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1576:1: ( rule__Person__Group__11__Impl rule__Person__Group__12 )
            // InternalGame.g:1577:2: rule__Person__Group__11__Impl rule__Person__Group__12
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
    // InternalGame.g:1584:1: rule__Person__Group__11__Impl : ( 'position' ) ;
    public final void rule__Person__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1588:1: ( ( 'position' ) )
            // InternalGame.g:1589:1: ( 'position' )
            {
            // InternalGame.g:1589:1: ( 'position' )
            // InternalGame.g:1590:2: 'position'
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
    // InternalGame.g:1599:1: rule__Person__Group__12 : rule__Person__Group__12__Impl rule__Person__Group__13 ;
    public final void rule__Person__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1603:1: ( rule__Person__Group__12__Impl rule__Person__Group__13 )
            // InternalGame.g:1604:2: rule__Person__Group__12__Impl rule__Person__Group__13
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:1611:1: rule__Person__Group__12__Impl : ( '=' ) ;
    public final void rule__Person__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1615:1: ( ( '=' ) )
            // InternalGame.g:1616:1: ( '=' )
            {
            // InternalGame.g:1616:1: ( '=' )
            // InternalGame.g:1617:2: '='
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
    // InternalGame.g:1626:1: rule__Person__Group__13 : rule__Person__Group__13__Impl rule__Person__Group__14 ;
    public final void rule__Person__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1630:1: ( rule__Person__Group__13__Impl rule__Person__Group__14 )
            // InternalGame.g:1631:2: rule__Person__Group__13__Impl rule__Person__Group__14
            {
            pushFollow(FOLLOW_23);
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
    // InternalGame.g:1638:1: rule__Person__Group__13__Impl : ( '{' ) ;
    public final void rule__Person__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1642:1: ( ( '{' ) )
            // InternalGame.g:1643:1: ( '{' )
            {
            // InternalGame.g:1643:1: ( '{' )
            // InternalGame.g:1644:2: '{'
            {
             before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_13()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_13()); 

            }


            }

        }
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
    // InternalGame.g:1653:1: rule__Person__Group__14 : rule__Person__Group__14__Impl rule__Person__Group__15 ;
    public final void rule__Person__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1657:1: ( rule__Person__Group__14__Impl rule__Person__Group__15 )
            // InternalGame.g:1658:2: rule__Person__Group__14__Impl rule__Person__Group__15
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1665:1: rule__Person__Group__14__Impl : ( ( rule__Person__PositionAssignment_14 ) ) ;
    public final void rule__Person__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1669:1: ( ( ( rule__Person__PositionAssignment_14 ) ) )
            // InternalGame.g:1670:1: ( ( rule__Person__PositionAssignment_14 ) )
            {
            // InternalGame.g:1670:1: ( ( rule__Person__PositionAssignment_14 ) )
            // InternalGame.g:1671:2: ( rule__Person__PositionAssignment_14 )
            {
             before(grammarAccess.getPersonAccess().getPositionAssignment_14()); 
            // InternalGame.g:1672:2: ( rule__Person__PositionAssignment_14 )
            // InternalGame.g:1672:3: rule__Person__PositionAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Person__PositionAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getPositionAssignment_14()); 

            }


            }

        }
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
    // InternalGame.g:1680:1: rule__Person__Group__15 : rule__Person__Group__15__Impl rule__Person__Group__16 ;
    public final void rule__Person__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1684:1: ( rule__Person__Group__15__Impl rule__Person__Group__16 )
            // InternalGame.g:1685:2: rule__Person__Group__15__Impl rule__Person__Group__16
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:1692:1: rule__Person__Group__15__Impl : ( '}' ) ;
    public final void rule__Person__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1696:1: ( ( '}' ) )
            // InternalGame.g:1697:1: ( '}' )
            {
            // InternalGame.g:1697:1: ( '}' )
            // InternalGame.g:1698:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_15()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
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
    // InternalGame.g:1707:1: rule__Person__Group__16 : rule__Person__Group__16__Impl ;
    public final void rule__Person__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1711:1: ( rule__Person__Group__16__Impl )
            // InternalGame.g:1712:2: rule__Person__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__16__Impl();

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
    // InternalGame.g:1718:1: rule__Person__Group__16__Impl : ( '}' ) ;
    public final void rule__Person__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1722:1: ( ( '}' ) )
            // InternalGame.g:1723:1: ( '}' )
            {
            // InternalGame.g:1723:1: ( '}' )
            // InternalGame.g:1724:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_16()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
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


    // $ANTLR start "rule__Object__Group__0"
    // InternalGame.g:1734:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1738:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalGame.g:1739:2: rule__Object__Group__0__Impl rule__Object__Group__1
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
    // InternalGame.g:1746:1: rule__Object__Group__0__Impl : ( ( rule__Object__NameAssignment_0 ) ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1750:1: ( ( ( rule__Object__NameAssignment_0 ) ) )
            // InternalGame.g:1751:1: ( ( rule__Object__NameAssignment_0 ) )
            {
            // InternalGame.g:1751:1: ( ( rule__Object__NameAssignment_0 ) )
            // InternalGame.g:1752:2: ( rule__Object__NameAssignment_0 )
            {
             before(grammarAccess.getObjectAccess().getNameAssignment_0()); 
            // InternalGame.g:1753:2: ( rule__Object__NameAssignment_0 )
            // InternalGame.g:1753:3: rule__Object__NameAssignment_0
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
    // InternalGame.g:1761:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1765:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalGame.g:1766:2: rule__Object__Group__1__Impl rule__Object__Group__2
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
    // InternalGame.g:1773:1: rule__Object__Group__1__Impl : ( '=' ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1777:1: ( ( '=' ) )
            // InternalGame.g:1778:1: ( '=' )
            {
            // InternalGame.g:1778:1: ( '=' )
            // InternalGame.g:1779:2: '='
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
    // InternalGame.g:1788:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1792:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalGame.g:1793:2: rule__Object__Group__2__Impl rule__Object__Group__3
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
    // InternalGame.g:1800:1: rule__Object__Group__2__Impl : ( '{' ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1804:1: ( ( '{' ) )
            // InternalGame.g:1805:1: ( '{' )
            {
            // InternalGame.g:1805:1: ( '{' )
            // InternalGame.g:1806:2: '{'
            {
             before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalGame.g:1815:1: rule__Object__Group__3 : rule__Object__Group__3__Impl rule__Object__Group__4 ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1819:1: ( rule__Object__Group__3__Impl rule__Object__Group__4 )
            // InternalGame.g:1820:2: rule__Object__Group__3__Impl rule__Object__Group__4
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
    // InternalGame.g:1827:1: rule__Object__Group__3__Impl : ( 'type' ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1831:1: ( ( 'type' ) )
            // InternalGame.g:1832:1: ( 'type' )
            {
            // InternalGame.g:1832:1: ( 'type' )
            // InternalGame.g:1833:2: 'type'
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
    // InternalGame.g:1842:1: rule__Object__Group__4 : rule__Object__Group__4__Impl rule__Object__Group__5 ;
    public final void rule__Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1846:1: ( rule__Object__Group__4__Impl rule__Object__Group__5 )
            // InternalGame.g:1847:2: rule__Object__Group__4__Impl rule__Object__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalGame.g:1854:1: rule__Object__Group__4__Impl : ( '=' ) ;
    public final void rule__Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1858:1: ( ( '=' ) )
            // InternalGame.g:1859:1: ( '=' )
            {
            // InternalGame.g:1859:1: ( '=' )
            // InternalGame.g:1860:2: '='
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
    // InternalGame.g:1869:1: rule__Object__Group__5 : rule__Object__Group__5__Impl rule__Object__Group__6 ;
    public final void rule__Object__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1873:1: ( rule__Object__Group__5__Impl rule__Object__Group__6 )
            // InternalGame.g:1874:2: rule__Object__Group__5__Impl rule__Object__Group__6
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
    // InternalGame.g:1881:1: rule__Object__Group__5__Impl : ( ( rule__Object__TypeAssignment_5 ) ) ;
    public final void rule__Object__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1885:1: ( ( ( rule__Object__TypeAssignment_5 ) ) )
            // InternalGame.g:1886:1: ( ( rule__Object__TypeAssignment_5 ) )
            {
            // InternalGame.g:1886:1: ( ( rule__Object__TypeAssignment_5 ) )
            // InternalGame.g:1887:2: ( rule__Object__TypeAssignment_5 )
            {
             before(grammarAccess.getObjectAccess().getTypeAssignment_5()); 
            // InternalGame.g:1888:2: ( rule__Object__TypeAssignment_5 )
            // InternalGame.g:1888:3: rule__Object__TypeAssignment_5
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
    // InternalGame.g:1896:1: rule__Object__Group__6 : rule__Object__Group__6__Impl rule__Object__Group__7 ;
    public final void rule__Object__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1900:1: ( rule__Object__Group__6__Impl rule__Object__Group__7 )
            // InternalGame.g:1901:2: rule__Object__Group__6__Impl rule__Object__Group__7
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
    // InternalGame.g:1908:1: rule__Object__Group__6__Impl : ( ';' ) ;
    public final void rule__Object__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1912:1: ( ( ';' ) )
            // InternalGame.g:1913:1: ( ';' )
            {
            // InternalGame.g:1913:1: ( ';' )
            // InternalGame.g:1914:2: ';'
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
    // InternalGame.g:1923:1: rule__Object__Group__7 : rule__Object__Group__7__Impl rule__Object__Group__8 ;
    public final void rule__Object__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1927:1: ( rule__Object__Group__7__Impl rule__Object__Group__8 )
            // InternalGame.g:1928:2: rule__Object__Group__7__Impl rule__Object__Group__8
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
    // InternalGame.g:1935:1: rule__Object__Group__7__Impl : ( 'position' ) ;
    public final void rule__Object__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1939:1: ( ( 'position' ) )
            // InternalGame.g:1940:1: ( 'position' )
            {
            // InternalGame.g:1940:1: ( 'position' )
            // InternalGame.g:1941:2: 'position'
            {
             before(grammarAccess.getObjectAccess().getPositionKeyword_7()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGame.g:1950:1: rule__Object__Group__8 : rule__Object__Group__8__Impl rule__Object__Group__9 ;
    public final void rule__Object__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1954:1: ( rule__Object__Group__8__Impl rule__Object__Group__9 )
            // InternalGame.g:1955:2: rule__Object__Group__8__Impl rule__Object__Group__9
            {
            pushFollow(FOLLOW_3);
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
    // InternalGame.g:1962:1: rule__Object__Group__8__Impl : ( '=' ) ;
    public final void rule__Object__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1966:1: ( ( '=' ) )
            // InternalGame.g:1967:1: ( '=' )
            {
            // InternalGame.g:1967:1: ( '=' )
            // InternalGame.g:1968:2: '='
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
    // InternalGame.g:1977:1: rule__Object__Group__9 : rule__Object__Group__9__Impl rule__Object__Group__10 ;
    public final void rule__Object__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1981:1: ( rule__Object__Group__9__Impl rule__Object__Group__10 )
            // InternalGame.g:1982:2: rule__Object__Group__9__Impl rule__Object__Group__10
            {
            pushFollow(FOLLOW_23);
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
    // InternalGame.g:1989:1: rule__Object__Group__9__Impl : ( '{' ) ;
    public final void rule__Object__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1993:1: ( ( '{' ) )
            // InternalGame.g:1994:1: ( '{' )
            {
            // InternalGame.g:1994:1: ( '{' )
            // InternalGame.g:1995:2: '{'
            {
             before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
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
    // InternalGame.g:2004:1: rule__Object__Group__10 : rule__Object__Group__10__Impl rule__Object__Group__11 ;
    public final void rule__Object__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2008:1: ( rule__Object__Group__10__Impl rule__Object__Group__11 )
            // InternalGame.g:2009:2: rule__Object__Group__10__Impl rule__Object__Group__11
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:2016:1: rule__Object__Group__10__Impl : ( ( rule__Object__PositionAssignment_10 ) ) ;
    public final void rule__Object__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2020:1: ( ( ( rule__Object__PositionAssignment_10 ) ) )
            // InternalGame.g:2021:1: ( ( rule__Object__PositionAssignment_10 ) )
            {
            // InternalGame.g:2021:1: ( ( rule__Object__PositionAssignment_10 ) )
            // InternalGame.g:2022:2: ( rule__Object__PositionAssignment_10 )
            {
             before(grammarAccess.getObjectAccess().getPositionAssignment_10()); 
            // InternalGame.g:2023:2: ( rule__Object__PositionAssignment_10 )
            // InternalGame.g:2023:3: rule__Object__PositionAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Object__PositionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getPositionAssignment_10()); 

            }


            }

        }
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
    // InternalGame.g:2031:1: rule__Object__Group__11 : rule__Object__Group__11__Impl rule__Object__Group__12 ;
    public final void rule__Object__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2035:1: ( rule__Object__Group__11__Impl rule__Object__Group__12 )
            // InternalGame.g:2036:2: rule__Object__Group__11__Impl rule__Object__Group__12
            {
            pushFollow(FOLLOW_16);
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
    // InternalGame.g:2043:1: rule__Object__Group__11__Impl : ( '}' ) ;
    public final void rule__Object__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2047:1: ( ( '}' ) )
            // InternalGame.g:2048:1: ( '}' )
            {
            // InternalGame.g:2048:1: ( '}' )
            // InternalGame.g:2049:2: '}'
            {
             before(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_11()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
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
    // InternalGame.g:2058:1: rule__Object__Group__12 : rule__Object__Group__12__Impl ;
    public final void rule__Object__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2062:1: ( rule__Object__Group__12__Impl )
            // InternalGame.g:2063:2: rule__Object__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__12__Impl();

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
    // InternalGame.g:2069:1: rule__Object__Group__12__Impl : ( '}' ) ;
    public final void rule__Object__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2073:1: ( ( '}' ) )
            // InternalGame.g:2074:1: ( '}' )
            {
            // InternalGame.g:2074:1: ( '}' )
            // InternalGame.g:2075:2: '}'
            {
             before(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_12()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
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


    // $ANTLR start "rule__Position__Group__0"
    // InternalGame.g:2085:1: rule__Position__Group__0 : rule__Position__Group__0__Impl rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2089:1: ( rule__Position__Group__0__Impl rule__Position__Group__1 )
            // InternalGame.g:2090:2: rule__Position__Group__0__Impl rule__Position__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Position__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__1();

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
    // $ANTLR end "rule__Position__Group__0"


    // $ANTLR start "rule__Position__Group__0__Impl"
    // InternalGame.g:2097:1: rule__Position__Group__0__Impl : ( 'pos_x' ) ;
    public final void rule__Position__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2101:1: ( ( 'pos_x' ) )
            // InternalGame.g:2102:1: ( 'pos_x' )
            {
            // InternalGame.g:2102:1: ( 'pos_x' )
            // InternalGame.g:2103:2: 'pos_x'
            {
             before(grammarAccess.getPositionAccess().getPos_xKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getPos_xKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__0__Impl"


    // $ANTLR start "rule__Position__Group__1"
    // InternalGame.g:2112:1: rule__Position__Group__1 : rule__Position__Group__1__Impl rule__Position__Group__2 ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2116:1: ( rule__Position__Group__1__Impl rule__Position__Group__2 )
            // InternalGame.g:2117:2: rule__Position__Group__1__Impl rule__Position__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Position__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__2();

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
    // $ANTLR end "rule__Position__Group__1"


    // $ANTLR start "rule__Position__Group__1__Impl"
    // InternalGame.g:2124:1: rule__Position__Group__1__Impl : ( '=' ) ;
    public final void rule__Position__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2128:1: ( ( '=' ) )
            // InternalGame.g:2129:1: ( '=' )
            {
            // InternalGame.g:2129:1: ( '=' )
            // InternalGame.g:2130:2: '='
            {
             before(grammarAccess.getPositionAccess().getEqualsSignKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__1__Impl"


    // $ANTLR start "rule__Position__Group__2"
    // InternalGame.g:2139:1: rule__Position__Group__2 : rule__Position__Group__2__Impl rule__Position__Group__3 ;
    public final void rule__Position__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2143:1: ( rule__Position__Group__2__Impl rule__Position__Group__3 )
            // InternalGame.g:2144:2: rule__Position__Group__2__Impl rule__Position__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Position__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__3();

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
    // $ANTLR end "rule__Position__Group__2"


    // $ANTLR start "rule__Position__Group__2__Impl"
    // InternalGame.g:2151:1: rule__Position__Group__2__Impl : ( ( rule__Position__PosXAssignment_2 ) ) ;
    public final void rule__Position__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2155:1: ( ( ( rule__Position__PosXAssignment_2 ) ) )
            // InternalGame.g:2156:1: ( ( rule__Position__PosXAssignment_2 ) )
            {
            // InternalGame.g:2156:1: ( ( rule__Position__PosXAssignment_2 ) )
            // InternalGame.g:2157:2: ( rule__Position__PosXAssignment_2 )
            {
             before(grammarAccess.getPositionAccess().getPosXAssignment_2()); 
            // InternalGame.g:2158:2: ( rule__Position__PosXAssignment_2 )
            // InternalGame.g:2158:3: rule__Position__PosXAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Position__PosXAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getPosXAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__2__Impl"


    // $ANTLR start "rule__Position__Group__3"
    // InternalGame.g:2166:1: rule__Position__Group__3 : rule__Position__Group__3__Impl rule__Position__Group__4 ;
    public final void rule__Position__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2170:1: ( rule__Position__Group__3__Impl rule__Position__Group__4 )
            // InternalGame.g:2171:2: rule__Position__Group__3__Impl rule__Position__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Position__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__4();

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
    // $ANTLR end "rule__Position__Group__3"


    // $ANTLR start "rule__Position__Group__3__Impl"
    // InternalGame.g:2178:1: rule__Position__Group__3__Impl : ( ';' ) ;
    public final void rule__Position__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2182:1: ( ( ';' ) )
            // InternalGame.g:2183:1: ( ';' )
            {
            // InternalGame.g:2183:1: ( ';' )
            // InternalGame.g:2184:2: ';'
            {
             before(grammarAccess.getPositionAccess().getSemicolonKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__3__Impl"


    // $ANTLR start "rule__Position__Group__4"
    // InternalGame.g:2193:1: rule__Position__Group__4 : rule__Position__Group__4__Impl rule__Position__Group__5 ;
    public final void rule__Position__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2197:1: ( rule__Position__Group__4__Impl rule__Position__Group__5 )
            // InternalGame.g:2198:2: rule__Position__Group__4__Impl rule__Position__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Position__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__5();

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
    // $ANTLR end "rule__Position__Group__4"


    // $ANTLR start "rule__Position__Group__4__Impl"
    // InternalGame.g:2205:1: rule__Position__Group__4__Impl : ( 'pos_y' ) ;
    public final void rule__Position__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2209:1: ( ( 'pos_y' ) )
            // InternalGame.g:2210:1: ( 'pos_y' )
            {
            // InternalGame.g:2210:1: ( 'pos_y' )
            // InternalGame.g:2211:2: 'pos_y'
            {
             before(grammarAccess.getPositionAccess().getPos_yKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getPos_yKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__4__Impl"


    // $ANTLR start "rule__Position__Group__5"
    // InternalGame.g:2220:1: rule__Position__Group__5 : rule__Position__Group__5__Impl rule__Position__Group__6 ;
    public final void rule__Position__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2224:1: ( rule__Position__Group__5__Impl rule__Position__Group__6 )
            // InternalGame.g:2225:2: rule__Position__Group__5__Impl rule__Position__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__Position__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__6();

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
    // $ANTLR end "rule__Position__Group__5"


    // $ANTLR start "rule__Position__Group__5__Impl"
    // InternalGame.g:2232:1: rule__Position__Group__5__Impl : ( '=' ) ;
    public final void rule__Position__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2236:1: ( ( '=' ) )
            // InternalGame.g:2237:1: ( '=' )
            {
            // InternalGame.g:2237:1: ( '=' )
            // InternalGame.g:2238:2: '='
            {
             before(grammarAccess.getPositionAccess().getEqualsSignKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getEqualsSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__5__Impl"


    // $ANTLR start "rule__Position__Group__6"
    // InternalGame.g:2247:1: rule__Position__Group__6 : rule__Position__Group__6__Impl rule__Position__Group__7 ;
    public final void rule__Position__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2251:1: ( rule__Position__Group__6__Impl rule__Position__Group__7 )
            // InternalGame.g:2252:2: rule__Position__Group__6__Impl rule__Position__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Position__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__7();

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
    // $ANTLR end "rule__Position__Group__6"


    // $ANTLR start "rule__Position__Group__6__Impl"
    // InternalGame.g:2259:1: rule__Position__Group__6__Impl : ( ( rule__Position__PosYAssignment_6 ) ) ;
    public final void rule__Position__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2263:1: ( ( ( rule__Position__PosYAssignment_6 ) ) )
            // InternalGame.g:2264:1: ( ( rule__Position__PosYAssignment_6 ) )
            {
            // InternalGame.g:2264:1: ( ( rule__Position__PosYAssignment_6 ) )
            // InternalGame.g:2265:2: ( rule__Position__PosYAssignment_6 )
            {
             before(grammarAccess.getPositionAccess().getPosYAssignment_6()); 
            // InternalGame.g:2266:2: ( rule__Position__PosYAssignment_6 )
            // InternalGame.g:2266:3: rule__Position__PosYAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Position__PosYAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getPosYAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__6__Impl"


    // $ANTLR start "rule__Position__Group__7"
    // InternalGame.g:2274:1: rule__Position__Group__7 : rule__Position__Group__7__Impl ;
    public final void rule__Position__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2278:1: ( rule__Position__Group__7__Impl )
            // InternalGame.g:2279:2: rule__Position__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group__7__Impl();

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
    // $ANTLR end "rule__Position__Group__7"


    // $ANTLR start "rule__Position__Group__7__Impl"
    // InternalGame.g:2285:1: rule__Position__Group__7__Impl : ( ';' ) ;
    public final void rule__Position__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2289:1: ( ( ';' ) )
            // InternalGame.g:2290:1: ( ';' )
            {
            // InternalGame.g:2290:1: ( ';' )
            // InternalGame.g:2291:2: ';'
            {
             before(grammarAccess.getPositionAccess().getSemicolonKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__7__Impl"


    // $ANTLR start "rule__Game__DefinitionAssignment_0"
    // InternalGame.g:2301:1: rule__Game__DefinitionAssignment_0 : ( ruleDefinition ) ;
    public final void rule__Game__DefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2305:1: ( ( ruleDefinition ) )
            // InternalGame.g:2306:2: ( ruleDefinition )
            {
            // InternalGame.g:2306:2: ( ruleDefinition )
            // InternalGame.g:2307:3: ruleDefinition
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
    // InternalGame.g:2316:1: rule__Game__ScenesAssignment_2 : ( ruleScene ) ;
    public final void rule__Game__ScenesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2320:1: ( ( ruleScene ) )
            // InternalGame.g:2321:2: ( ruleScene )
            {
            // InternalGame.g:2321:2: ( ruleScene )
            // InternalGame.g:2322:3: ruleScene
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
    // InternalGame.g:2331:1: rule__Definition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2335:1: ( ( RULE_ID ) )
            // InternalGame.g:2336:2: ( RULE_ID )
            {
            // InternalGame.g:2336:2: ( RULE_ID )
            // InternalGame.g:2337:3: RULE_ID
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
    // InternalGame.g:2346:1: rule__Scene__DeclartionsAssignment_0 : ( ruleLevelDeclaration ) ;
    public final void rule__Scene__DeclartionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2350:1: ( ( ruleLevelDeclaration ) )
            // InternalGame.g:2351:2: ( ruleLevelDeclaration )
            {
            // InternalGame.g:2351:2: ( ruleLevelDeclaration )
            // InternalGame.g:2352:3: ruleLevelDeclaration
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
    // InternalGame.g:2361:1: rule__Scene__DefinitionsAssignment_1 : ( ruleLevelDefinition ) ;
    public final void rule__Scene__DefinitionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2365:1: ( ( ruleLevelDefinition ) )
            // InternalGame.g:2366:2: ( ruleLevelDefinition )
            {
            // InternalGame.g:2366:2: ( ruleLevelDefinition )
            // InternalGame.g:2367:3: ruleLevelDefinition
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
    // InternalGame.g:2376:1: rule__Scene__StartLevelAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Scene__StartLevelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2380:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2381:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2381:2: ( ( RULE_ID ) )
            // InternalGame.g:2382:3: ( RULE_ID )
            {
             before(grammarAccess.getSceneAccess().getStartLevelLevelDeclarationCrossReference_4_0()); 
            // InternalGame.g:2383:3: ( RULE_ID )
            // InternalGame.g:2384:4: RULE_ID
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
    // InternalGame.g:2395:1: rule__Scene__FinalLevelAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Scene__FinalLevelAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2399:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2400:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2400:2: ( ( RULE_ID ) )
            // InternalGame.g:2401:3: ( RULE_ID )
            {
             before(grammarAccess.getSceneAccess().getFinalLevelLevelDeclarationCrossReference_8_0()); 
            // InternalGame.g:2402:3: ( RULE_ID )
            // InternalGame.g:2403:4: RULE_ID
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
    // InternalGame.g:2414:1: rule__Scene__TransitionsAssignment_10 : ( ruleLevelTransition ) ;
    public final void rule__Scene__TransitionsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2418:1: ( ( ruleLevelTransition ) )
            // InternalGame.g:2419:2: ( ruleLevelTransition )
            {
            // InternalGame.g:2419:2: ( ruleLevelTransition )
            // InternalGame.g:2420:3: ruleLevelTransition
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
    // InternalGame.g:2429:1: rule__LevelDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LevelDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2433:1: ( ( RULE_ID ) )
            // InternalGame.g:2434:2: ( RULE_ID )
            {
            // InternalGame.g:2434:2: ( RULE_ID )
            // InternalGame.g:2435:3: RULE_ID
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
    // InternalGame.g:2444:1: rule__LevelDefinition__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__LevelDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2448:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2449:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2449:2: ( ( RULE_ID ) )
            // InternalGame.g:2450:3: ( RULE_ID )
            {
             before(grammarAccess.getLevelDefinitionAccess().getNameLevelDeclarationCrossReference_0_0()); 
            // InternalGame.g:2451:3: ( RULE_ID )
            // InternalGame.g:2452:4: RULE_ID
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
    // InternalGame.g:2463:1: rule__LevelDefinition__PersonsAssignment_3 : ( rulePerson ) ;
    public final void rule__LevelDefinition__PersonsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2467:1: ( ( rulePerson ) )
            // InternalGame.g:2468:2: ( rulePerson )
            {
            // InternalGame.g:2468:2: ( rulePerson )
            // InternalGame.g:2469:3: rulePerson
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
    // InternalGame.g:2478:1: rule__LevelDefinition__ObjectsAssignment_4 : ( ruleObject ) ;
    public final void rule__LevelDefinition__ObjectsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2482:1: ( ( ruleObject ) )
            // InternalGame.g:2483:2: ( ruleObject )
            {
            // InternalGame.g:2483:2: ( ruleObject )
            // InternalGame.g:2484:3: ruleObject
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
    // InternalGame.g:2493:1: rule__LevelDefinition__GoalIdAssignment_7 : ( RULE_ID ) ;
    public final void rule__LevelDefinition__GoalIdAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2497:1: ( ( RULE_ID ) )
            // InternalGame.g:2498:2: ( RULE_ID )
            {
            // InternalGame.g:2498:2: ( RULE_ID )
            // InternalGame.g:2499:3: RULE_ID
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
    // InternalGame.g:2508:1: rule__LevelTransition__LevelFromAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__LevelTransition__LevelFromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2512:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2513:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2513:2: ( ( RULE_ID ) )
            // InternalGame.g:2514:3: ( RULE_ID )
            {
             before(grammarAccess.getLevelTransitionAccess().getLevelFromLevelDeclarationCrossReference_1_0()); 
            // InternalGame.g:2515:3: ( RULE_ID )
            // InternalGame.g:2516:4: RULE_ID
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
    // InternalGame.g:2527:1: rule__LevelTransition__LevelToAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__LevelTransition__LevelToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2531:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2532:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2532:2: ( ( RULE_ID ) )
            // InternalGame.g:2533:3: ( RULE_ID )
            {
             before(grammarAccess.getLevelTransitionAccess().getLevelToLevelDeclarationCrossReference_3_0()); 
            // InternalGame.g:2534:3: ( RULE_ID )
            // InternalGame.g:2535:4: RULE_ID
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
    // InternalGame.g:2546:1: rule__Person__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Person__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2550:1: ( ( RULE_ID ) )
            // InternalGame.g:2551:2: ( RULE_ID )
            {
            // InternalGame.g:2551:2: ( RULE_ID )
            // InternalGame.g:2552:3: RULE_ID
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
    // InternalGame.g:2561:1: rule__Person__TypeAssignment_5 : ( rulePERSON_T ) ;
    public final void rule__Person__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2565:1: ( ( rulePERSON_T ) )
            // InternalGame.g:2566:2: ( rulePERSON_T )
            {
            // InternalGame.g:2566:2: ( rulePERSON_T )
            // InternalGame.g:2567:3: rulePERSON_T
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
    // InternalGame.g:2576:1: rule__Person__ResponseAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Person__ResponseAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2580:1: ( ( RULE_STRING ) )
            // InternalGame.g:2581:2: ( RULE_STRING )
            {
            // InternalGame.g:2581:2: ( RULE_STRING )
            // InternalGame.g:2582:3: RULE_STRING
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


    // $ANTLR start "rule__Person__PositionAssignment_14"
    // InternalGame.g:2591:1: rule__Person__PositionAssignment_14 : ( rulePosition ) ;
    public final void rule__Person__PositionAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2595:1: ( ( rulePosition ) )
            // InternalGame.g:2596:2: ( rulePosition )
            {
            // InternalGame.g:2596:2: ( rulePosition )
            // InternalGame.g:2597:3: rulePosition
            {
             before(grammarAccess.getPersonAccess().getPositionPositionParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getPositionPositionParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__PositionAssignment_14"


    // $ANTLR start "rule__Object__NameAssignment_0"
    // InternalGame.g:2606:1: rule__Object__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Object__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2610:1: ( ( RULE_ID ) )
            // InternalGame.g:2611:2: ( RULE_ID )
            {
            // InternalGame.g:2611:2: ( RULE_ID )
            // InternalGame.g:2612:3: RULE_ID
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
    // InternalGame.g:2621:1: rule__Object__TypeAssignment_5 : ( ruleOBJECT_T ) ;
    public final void rule__Object__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2625:1: ( ( ruleOBJECT_T ) )
            // InternalGame.g:2626:2: ( ruleOBJECT_T )
            {
            // InternalGame.g:2626:2: ( ruleOBJECT_T )
            // InternalGame.g:2627:3: ruleOBJECT_T
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


    // $ANTLR start "rule__Object__PositionAssignment_10"
    // InternalGame.g:2636:1: rule__Object__PositionAssignment_10 : ( rulePosition ) ;
    public final void rule__Object__PositionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2640:1: ( ( rulePosition ) )
            // InternalGame.g:2641:2: ( rulePosition )
            {
            // InternalGame.g:2641:2: ( rulePosition )
            // InternalGame.g:2642:3: rulePosition
            {
             before(grammarAccess.getObjectAccess().getPositionPositionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getPositionPositionParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__PositionAssignment_10"


    // $ANTLR start "rule__Position__PosXAssignment_2"
    // InternalGame.g:2651:1: rule__Position__PosXAssignment_2 : ( RULE_INT ) ;
    public final void rule__Position__PosXAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2655:1: ( ( RULE_INT ) )
            // InternalGame.g:2656:2: ( RULE_INT )
            {
            // InternalGame.g:2656:2: ( RULE_INT )
            // InternalGame.g:2657:3: RULE_INT
            {
             before(grammarAccess.getPositionAccess().getPosXINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getPosXINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__PosXAssignment_2"


    // $ANTLR start "rule__Position__PosYAssignment_6"
    // InternalGame.g:2666:1: rule__Position__PosYAssignment_6 : ( RULE_INT ) ;
    public final void rule__Position__PosYAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2670:1: ( ( RULE_INT ) )
            // InternalGame.g:2671:2: ( RULE_INT )
            {
            // InternalGame.g:2671:2: ( RULE_INT )
            // InternalGame.g:2672:3: RULE_INT
            {
             before(grammarAccess.getPositionAccess().getPosYINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getPosYINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__PosYAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000228010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000220012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000220010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});

}