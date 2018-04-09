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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Leave'", "'Talk'", "'Pick'", "'Use'", "'new'", "'{'", "'start'", "'='", "';'", "'final'", "'}'", "'level'", "'goal'", "'next'", "'description'", "'type'", "'response'", "'position'", "'action'"
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


    // $ANTLR start "entryRuleObject"
    // InternalGame.g:203:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalGame.g:204:1: ( ruleObject EOF )
            // InternalGame.g:205:1: ruleObject EOF
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
    // InternalGame.g:212:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:216:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalGame.g:217:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalGame.g:217:2: ( ( rule__Object__Group__0 ) )
            // InternalGame.g:218:3: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // InternalGame.g:219:3: ( rule__Object__Group__0 )
            // InternalGame.g:219:4: rule__Object__Group__0
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
    // InternalGame.g:228:1: ruleAction_GLOBAL : ( ( 'Leave' ) ) ;
    public final void ruleAction_GLOBAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:232:1: ( ( ( 'Leave' ) ) )
            // InternalGame.g:233:2: ( ( 'Leave' ) )
            {
            // InternalGame.g:233:2: ( ( 'Leave' ) )
            // InternalGame.g:234:3: ( 'Leave' )
            {
             before(grammarAccess.getAction_GLOBALAccess().getLEAVEEnumLiteralDeclaration()); 
            // InternalGame.g:235:3: ( 'Leave' )
            // InternalGame.g:235:4: 'Leave'
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
    // InternalGame.g:244:1: ruleAction_O : ( ( rule__Action_O__Alternatives ) ) ;
    public final void ruleAction_O() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:248:1: ( ( ( rule__Action_O__Alternatives ) ) )
            // InternalGame.g:249:2: ( ( rule__Action_O__Alternatives ) )
            {
            // InternalGame.g:249:2: ( ( rule__Action_O__Alternatives ) )
            // InternalGame.g:250:3: ( rule__Action_O__Alternatives )
            {
             before(grammarAccess.getAction_OAccess().getAlternatives()); 
            // InternalGame.g:251:3: ( rule__Action_O__Alternatives )
            // InternalGame.g:251:4: rule__Action_O__Alternatives
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
    // InternalGame.g:260:1: ruleAction_P : ( ( 'Talk' ) ) ;
    public final void ruleAction_P() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:264:1: ( ( ( 'Talk' ) ) )
            // InternalGame.g:265:2: ( ( 'Talk' ) )
            {
            // InternalGame.g:265:2: ( ( 'Talk' ) )
            // InternalGame.g:266:3: ( 'Talk' )
            {
             before(grammarAccess.getAction_PAccess().getTALKEnumLiteralDeclaration()); 
            // InternalGame.g:267:3: ( 'Talk' )
            // InternalGame.g:267:4: 'Talk'
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
    // InternalGame.g:275:1: rule__Action_O__Alternatives : ( ( ( 'Pick' ) ) | ( ( 'Use' ) ) );
    public final void rule__Action_O__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:279:1: ( ( ( 'Pick' ) ) | ( ( 'Use' ) ) )
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
                    // InternalGame.g:280:2: ( ( 'Pick' ) )
                    {
                    // InternalGame.g:280:2: ( ( 'Pick' ) )
                    // InternalGame.g:281:3: ( 'Pick' )
                    {
                     before(grammarAccess.getAction_OAccess().getPICKEnumLiteralDeclaration_0()); 
                    // InternalGame.g:282:3: ( 'Pick' )
                    // InternalGame.g:282:4: 'Pick'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAction_OAccess().getPICKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:286:2: ( ( 'Use' ) )
                    {
                    // InternalGame.g:286:2: ( ( 'Use' ) )
                    // InternalGame.g:287:3: ( 'Use' )
                    {
                     before(grammarAccess.getAction_OAccess().getUSEEnumLiteralDeclaration_1()); 
                    // InternalGame.g:288:3: ( 'Use' )
                    // InternalGame.g:288:4: 'Use'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getAction_OAccess().getUSEEnumLiteralDeclaration_1()); 

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
    // InternalGame.g:296:1: rule__Scene__Group__0 : rule__Scene__Group__0__Impl rule__Scene__Group__1 ;
    public final void rule__Scene__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:300:1: ( rule__Scene__Group__0__Impl rule__Scene__Group__1 )
            // InternalGame.g:301:2: rule__Scene__Group__0__Impl rule__Scene__Group__1
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
    // InternalGame.g:308:1: rule__Scene__Group__0__Impl : ( 'new' ) ;
    public final void rule__Scene__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:312:1: ( ( 'new' ) )
            // InternalGame.g:313:1: ( 'new' )
            {
            // InternalGame.g:313:1: ( 'new' )
            // InternalGame.g:314:2: 'new'
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
    // InternalGame.g:323:1: rule__Scene__Group__1 : rule__Scene__Group__1__Impl rule__Scene__Group__2 ;
    public final void rule__Scene__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:327:1: ( rule__Scene__Group__1__Impl rule__Scene__Group__2 )
            // InternalGame.g:328:2: rule__Scene__Group__1__Impl rule__Scene__Group__2
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
    // InternalGame.g:335:1: rule__Scene__Group__1__Impl : ( ( rule__Scene__NameAssignment_1 ) ) ;
    public final void rule__Scene__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:339:1: ( ( ( rule__Scene__NameAssignment_1 ) ) )
            // InternalGame.g:340:1: ( ( rule__Scene__NameAssignment_1 ) )
            {
            // InternalGame.g:340:1: ( ( rule__Scene__NameAssignment_1 ) )
            // InternalGame.g:341:2: ( rule__Scene__NameAssignment_1 )
            {
             before(grammarAccess.getSceneAccess().getNameAssignment_1()); 
            // InternalGame.g:342:2: ( rule__Scene__NameAssignment_1 )
            // InternalGame.g:342:3: rule__Scene__NameAssignment_1
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
    // InternalGame.g:350:1: rule__Scene__Group__2 : rule__Scene__Group__2__Impl rule__Scene__Group__3 ;
    public final void rule__Scene__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:354:1: ( rule__Scene__Group__2__Impl rule__Scene__Group__3 )
            // InternalGame.g:355:2: rule__Scene__Group__2__Impl rule__Scene__Group__3
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
    // InternalGame.g:362:1: rule__Scene__Group__2__Impl : ( '{' ) ;
    public final void rule__Scene__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:366:1: ( ( '{' ) )
            // InternalGame.g:367:1: ( '{' )
            {
            // InternalGame.g:367:1: ( '{' )
            // InternalGame.g:368:2: '{'
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
    // InternalGame.g:377:1: rule__Scene__Group__3 : rule__Scene__Group__3__Impl rule__Scene__Group__4 ;
    public final void rule__Scene__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:381:1: ( rule__Scene__Group__3__Impl rule__Scene__Group__4 )
            // InternalGame.g:382:2: rule__Scene__Group__3__Impl rule__Scene__Group__4
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
    // InternalGame.g:389:1: rule__Scene__Group__3__Impl : ( ( rule__Scene__DeclartionsAssignment_3 )* ) ;
    public final void rule__Scene__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:393:1: ( ( ( rule__Scene__DeclartionsAssignment_3 )* ) )
            // InternalGame.g:394:1: ( ( rule__Scene__DeclartionsAssignment_3 )* )
            {
            // InternalGame.g:394:1: ( ( rule__Scene__DeclartionsAssignment_3 )* )
            // InternalGame.g:395:2: ( rule__Scene__DeclartionsAssignment_3 )*
            {
             before(grammarAccess.getSceneAccess().getDeclartionsAssignment_3()); 
            // InternalGame.g:396:2: ( rule__Scene__DeclartionsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGame.g:396:3: rule__Scene__DeclartionsAssignment_3
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
    // InternalGame.g:404:1: rule__Scene__Group__4 : rule__Scene__Group__4__Impl rule__Scene__Group__5 ;
    public final void rule__Scene__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:408:1: ( rule__Scene__Group__4__Impl rule__Scene__Group__5 )
            // InternalGame.g:409:2: rule__Scene__Group__4__Impl rule__Scene__Group__5
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
    // InternalGame.g:416:1: rule__Scene__Group__4__Impl : ( ( rule__Scene__DefinitionsAssignment_4 )* ) ;
    public final void rule__Scene__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:420:1: ( ( ( rule__Scene__DefinitionsAssignment_4 )* ) )
            // InternalGame.g:421:1: ( ( rule__Scene__DefinitionsAssignment_4 )* )
            {
            // InternalGame.g:421:1: ( ( rule__Scene__DefinitionsAssignment_4 )* )
            // InternalGame.g:422:2: ( rule__Scene__DefinitionsAssignment_4 )*
            {
             before(grammarAccess.getSceneAccess().getDefinitionsAssignment_4()); 
            // InternalGame.g:423:2: ( rule__Scene__DefinitionsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:423:3: rule__Scene__DefinitionsAssignment_4
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
    // InternalGame.g:431:1: rule__Scene__Group__5 : rule__Scene__Group__5__Impl rule__Scene__Group__6 ;
    public final void rule__Scene__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:435:1: ( rule__Scene__Group__5__Impl rule__Scene__Group__6 )
            // InternalGame.g:436:2: rule__Scene__Group__5__Impl rule__Scene__Group__6
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
    // InternalGame.g:443:1: rule__Scene__Group__5__Impl : ( 'start' ) ;
    public final void rule__Scene__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:447:1: ( ( 'start' ) )
            // InternalGame.g:448:1: ( 'start' )
            {
            // InternalGame.g:448:1: ( 'start' )
            // InternalGame.g:449:2: 'start'
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
    // InternalGame.g:458:1: rule__Scene__Group__6 : rule__Scene__Group__6__Impl rule__Scene__Group__7 ;
    public final void rule__Scene__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:462:1: ( rule__Scene__Group__6__Impl rule__Scene__Group__7 )
            // InternalGame.g:463:2: rule__Scene__Group__6__Impl rule__Scene__Group__7
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
    // InternalGame.g:470:1: rule__Scene__Group__6__Impl : ( '=' ) ;
    public final void rule__Scene__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:474:1: ( ( '=' ) )
            // InternalGame.g:475:1: ( '=' )
            {
            // InternalGame.g:475:1: ( '=' )
            // InternalGame.g:476:2: '='
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
    // InternalGame.g:485:1: rule__Scene__Group__7 : rule__Scene__Group__7__Impl rule__Scene__Group__8 ;
    public final void rule__Scene__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:489:1: ( rule__Scene__Group__7__Impl rule__Scene__Group__8 )
            // InternalGame.g:490:2: rule__Scene__Group__7__Impl rule__Scene__Group__8
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
    // InternalGame.g:497:1: rule__Scene__Group__7__Impl : ( ( rule__Scene__StartLevelAssignment_7 ) ) ;
    public final void rule__Scene__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:501:1: ( ( ( rule__Scene__StartLevelAssignment_7 ) ) )
            // InternalGame.g:502:1: ( ( rule__Scene__StartLevelAssignment_7 ) )
            {
            // InternalGame.g:502:1: ( ( rule__Scene__StartLevelAssignment_7 ) )
            // InternalGame.g:503:2: ( rule__Scene__StartLevelAssignment_7 )
            {
             before(grammarAccess.getSceneAccess().getStartLevelAssignment_7()); 
            // InternalGame.g:504:2: ( rule__Scene__StartLevelAssignment_7 )
            // InternalGame.g:504:3: rule__Scene__StartLevelAssignment_7
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
    // InternalGame.g:512:1: rule__Scene__Group__8 : rule__Scene__Group__8__Impl rule__Scene__Group__9 ;
    public final void rule__Scene__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:516:1: ( rule__Scene__Group__8__Impl rule__Scene__Group__9 )
            // InternalGame.g:517:2: rule__Scene__Group__8__Impl rule__Scene__Group__9
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
    // InternalGame.g:524:1: rule__Scene__Group__8__Impl : ( ';' ) ;
    public final void rule__Scene__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:528:1: ( ( ';' ) )
            // InternalGame.g:529:1: ( ';' )
            {
            // InternalGame.g:529:1: ( ';' )
            // InternalGame.g:530:2: ';'
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
    // InternalGame.g:539:1: rule__Scene__Group__9 : rule__Scene__Group__9__Impl rule__Scene__Group__10 ;
    public final void rule__Scene__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:543:1: ( rule__Scene__Group__9__Impl rule__Scene__Group__10 )
            // InternalGame.g:544:2: rule__Scene__Group__9__Impl rule__Scene__Group__10
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
    // InternalGame.g:551:1: rule__Scene__Group__9__Impl : ( 'final' ) ;
    public final void rule__Scene__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:555:1: ( ( 'final' ) )
            // InternalGame.g:556:1: ( 'final' )
            {
            // InternalGame.g:556:1: ( 'final' )
            // InternalGame.g:557:2: 'final'
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
    // InternalGame.g:566:1: rule__Scene__Group__10 : rule__Scene__Group__10__Impl rule__Scene__Group__11 ;
    public final void rule__Scene__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:570:1: ( rule__Scene__Group__10__Impl rule__Scene__Group__11 )
            // InternalGame.g:571:2: rule__Scene__Group__10__Impl rule__Scene__Group__11
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
    // InternalGame.g:578:1: rule__Scene__Group__10__Impl : ( '=' ) ;
    public final void rule__Scene__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:582:1: ( ( '=' ) )
            // InternalGame.g:583:1: ( '=' )
            {
            // InternalGame.g:583:1: ( '=' )
            // InternalGame.g:584:2: '='
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
    // InternalGame.g:593:1: rule__Scene__Group__11 : rule__Scene__Group__11__Impl rule__Scene__Group__12 ;
    public final void rule__Scene__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:597:1: ( rule__Scene__Group__11__Impl rule__Scene__Group__12 )
            // InternalGame.g:598:2: rule__Scene__Group__11__Impl rule__Scene__Group__12
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
    // InternalGame.g:605:1: rule__Scene__Group__11__Impl : ( ( rule__Scene__FinalLevelAssignment_11 ) ) ;
    public final void rule__Scene__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:609:1: ( ( ( rule__Scene__FinalLevelAssignment_11 ) ) )
            // InternalGame.g:610:1: ( ( rule__Scene__FinalLevelAssignment_11 ) )
            {
            // InternalGame.g:610:1: ( ( rule__Scene__FinalLevelAssignment_11 ) )
            // InternalGame.g:611:2: ( rule__Scene__FinalLevelAssignment_11 )
            {
             before(grammarAccess.getSceneAccess().getFinalLevelAssignment_11()); 
            // InternalGame.g:612:2: ( rule__Scene__FinalLevelAssignment_11 )
            // InternalGame.g:612:3: rule__Scene__FinalLevelAssignment_11
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
    // InternalGame.g:620:1: rule__Scene__Group__12 : rule__Scene__Group__12__Impl rule__Scene__Group__13 ;
    public final void rule__Scene__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:624:1: ( rule__Scene__Group__12__Impl rule__Scene__Group__13 )
            // InternalGame.g:625:2: rule__Scene__Group__12__Impl rule__Scene__Group__13
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
    // InternalGame.g:632:1: rule__Scene__Group__12__Impl : ( ';' ) ;
    public final void rule__Scene__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:636:1: ( ( ';' ) )
            // InternalGame.g:637:1: ( ';' )
            {
            // InternalGame.g:637:1: ( ';' )
            // InternalGame.g:638:2: ';'
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
    // InternalGame.g:647:1: rule__Scene__Group__13 : rule__Scene__Group__13__Impl ;
    public final void rule__Scene__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:651:1: ( rule__Scene__Group__13__Impl )
            // InternalGame.g:652:2: rule__Scene__Group__13__Impl
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
    // InternalGame.g:658:1: rule__Scene__Group__13__Impl : ( '}' ) ;
    public final void rule__Scene__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:662:1: ( ( '}' ) )
            // InternalGame.g:663:1: ( '}' )
            {
            // InternalGame.g:663:1: ( '}' )
            // InternalGame.g:664:2: '}'
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
    // InternalGame.g:674:1: rule__LevelDeclaration__Group__0 : rule__LevelDeclaration__Group__0__Impl rule__LevelDeclaration__Group__1 ;
    public final void rule__LevelDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:678:1: ( rule__LevelDeclaration__Group__0__Impl rule__LevelDeclaration__Group__1 )
            // InternalGame.g:679:2: rule__LevelDeclaration__Group__0__Impl rule__LevelDeclaration__Group__1
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
    // InternalGame.g:686:1: rule__LevelDeclaration__Group__0__Impl : ( 'level' ) ;
    public final void rule__LevelDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:690:1: ( ( 'level' ) )
            // InternalGame.g:691:1: ( 'level' )
            {
            // InternalGame.g:691:1: ( 'level' )
            // InternalGame.g:692:2: 'level'
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
    // InternalGame.g:701:1: rule__LevelDeclaration__Group__1 : rule__LevelDeclaration__Group__1__Impl rule__LevelDeclaration__Group__2 ;
    public final void rule__LevelDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:705:1: ( rule__LevelDeclaration__Group__1__Impl rule__LevelDeclaration__Group__2 )
            // InternalGame.g:706:2: rule__LevelDeclaration__Group__1__Impl rule__LevelDeclaration__Group__2
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
    // InternalGame.g:713:1: rule__LevelDeclaration__Group__1__Impl : ( ( rule__LevelDeclaration__NameAssignment_1 ) ) ;
    public final void rule__LevelDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:717:1: ( ( ( rule__LevelDeclaration__NameAssignment_1 ) ) )
            // InternalGame.g:718:1: ( ( rule__LevelDeclaration__NameAssignment_1 ) )
            {
            // InternalGame.g:718:1: ( ( rule__LevelDeclaration__NameAssignment_1 ) )
            // InternalGame.g:719:2: ( rule__LevelDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getLevelDeclarationAccess().getNameAssignment_1()); 
            // InternalGame.g:720:2: ( rule__LevelDeclaration__NameAssignment_1 )
            // InternalGame.g:720:3: rule__LevelDeclaration__NameAssignment_1
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
    // InternalGame.g:728:1: rule__LevelDeclaration__Group__2 : rule__LevelDeclaration__Group__2__Impl ;
    public final void rule__LevelDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:732:1: ( rule__LevelDeclaration__Group__2__Impl )
            // InternalGame.g:733:2: rule__LevelDeclaration__Group__2__Impl
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
    // InternalGame.g:739:1: rule__LevelDeclaration__Group__2__Impl : ( ';' ) ;
    public final void rule__LevelDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:743:1: ( ( ';' ) )
            // InternalGame.g:744:1: ( ';' )
            {
            // InternalGame.g:744:1: ( ';' )
            // InternalGame.g:745:2: ';'
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
    // InternalGame.g:755:1: rule__LevelDefinition__Group__0 : rule__LevelDefinition__Group__0__Impl rule__LevelDefinition__Group__1 ;
    public final void rule__LevelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:759:1: ( rule__LevelDefinition__Group__0__Impl rule__LevelDefinition__Group__1 )
            // InternalGame.g:760:2: rule__LevelDefinition__Group__0__Impl rule__LevelDefinition__Group__1
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
    // InternalGame.g:767:1: rule__LevelDefinition__Group__0__Impl : ( ( rule__LevelDefinition__NameAssignment_0 ) ) ;
    public final void rule__LevelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:771:1: ( ( ( rule__LevelDefinition__NameAssignment_0 ) ) )
            // InternalGame.g:772:1: ( ( rule__LevelDefinition__NameAssignment_0 ) )
            {
            // InternalGame.g:772:1: ( ( rule__LevelDefinition__NameAssignment_0 ) )
            // InternalGame.g:773:2: ( rule__LevelDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getLevelDefinitionAccess().getNameAssignment_0()); 
            // InternalGame.g:774:2: ( rule__LevelDefinition__NameAssignment_0 )
            // InternalGame.g:774:3: rule__LevelDefinition__NameAssignment_0
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
    // InternalGame.g:782:1: rule__LevelDefinition__Group__1 : rule__LevelDefinition__Group__1__Impl rule__LevelDefinition__Group__2 ;
    public final void rule__LevelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:786:1: ( rule__LevelDefinition__Group__1__Impl rule__LevelDefinition__Group__2 )
            // InternalGame.g:787:2: rule__LevelDefinition__Group__1__Impl rule__LevelDefinition__Group__2
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
    // InternalGame.g:794:1: rule__LevelDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__LevelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:798:1: ( ( '=' ) )
            // InternalGame.g:799:1: ( '=' )
            {
            // InternalGame.g:799:1: ( '=' )
            // InternalGame.g:800:2: '='
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
    // InternalGame.g:809:1: rule__LevelDefinition__Group__2 : rule__LevelDefinition__Group__2__Impl rule__LevelDefinition__Group__3 ;
    public final void rule__LevelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:813:1: ( rule__LevelDefinition__Group__2__Impl rule__LevelDefinition__Group__3 )
            // InternalGame.g:814:2: rule__LevelDefinition__Group__2__Impl rule__LevelDefinition__Group__3
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
    // InternalGame.g:821:1: rule__LevelDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__LevelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:825:1: ( ( '{' ) )
            // InternalGame.g:826:1: ( '{' )
            {
            // InternalGame.g:826:1: ( '{' )
            // InternalGame.g:827:2: '{'
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
    // InternalGame.g:836:1: rule__LevelDefinition__Group__3 : rule__LevelDefinition__Group__3__Impl rule__LevelDefinition__Group__4 ;
    public final void rule__LevelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:840:1: ( rule__LevelDefinition__Group__3__Impl rule__LevelDefinition__Group__4 )
            // InternalGame.g:841:2: rule__LevelDefinition__Group__3__Impl rule__LevelDefinition__Group__4
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
    // InternalGame.g:848:1: rule__LevelDefinition__Group__3__Impl : ( ( rule__LevelDefinition__DescriptionAssignment_3 ) ) ;
    public final void rule__LevelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:852:1: ( ( ( rule__LevelDefinition__DescriptionAssignment_3 ) ) )
            // InternalGame.g:853:1: ( ( rule__LevelDefinition__DescriptionAssignment_3 ) )
            {
            // InternalGame.g:853:1: ( ( rule__LevelDefinition__DescriptionAssignment_3 ) )
            // InternalGame.g:854:2: ( rule__LevelDefinition__DescriptionAssignment_3 )
            {
             before(grammarAccess.getLevelDefinitionAccess().getDescriptionAssignment_3()); 
            // InternalGame.g:855:2: ( rule__LevelDefinition__DescriptionAssignment_3 )
            // InternalGame.g:855:3: rule__LevelDefinition__DescriptionAssignment_3
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
    // InternalGame.g:863:1: rule__LevelDefinition__Group__4 : rule__LevelDefinition__Group__4__Impl rule__LevelDefinition__Group__5 ;
    public final void rule__LevelDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:867:1: ( rule__LevelDefinition__Group__4__Impl rule__LevelDefinition__Group__5 )
            // InternalGame.g:868:2: rule__LevelDefinition__Group__4__Impl rule__LevelDefinition__Group__5
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
    // InternalGame.g:875:1: rule__LevelDefinition__Group__4__Impl : ( ( rule__LevelDefinition__PersonsAssignment_4 )* ) ;
    public final void rule__LevelDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:879:1: ( ( ( rule__LevelDefinition__PersonsAssignment_4 )* ) )
            // InternalGame.g:880:1: ( ( rule__LevelDefinition__PersonsAssignment_4 )* )
            {
            // InternalGame.g:880:1: ( ( rule__LevelDefinition__PersonsAssignment_4 )* )
            // InternalGame.g:881:2: ( rule__LevelDefinition__PersonsAssignment_4 )*
            {
             before(grammarAccess.getLevelDefinitionAccess().getPersonsAssignment_4()); 
            // InternalGame.g:882:2: ( rule__LevelDefinition__PersonsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // InternalGame.g:882:3: rule__LevelDefinition__PersonsAssignment_4
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
    // InternalGame.g:890:1: rule__LevelDefinition__Group__5 : rule__LevelDefinition__Group__5__Impl rule__LevelDefinition__Group__6 ;
    public final void rule__LevelDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:894:1: ( rule__LevelDefinition__Group__5__Impl rule__LevelDefinition__Group__6 )
            // InternalGame.g:895:2: rule__LevelDefinition__Group__5__Impl rule__LevelDefinition__Group__6
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
    // InternalGame.g:902:1: rule__LevelDefinition__Group__5__Impl : ( ( rule__LevelDefinition__ObjectsAssignment_5 )* ) ;
    public final void rule__LevelDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:906:1: ( ( ( rule__LevelDefinition__ObjectsAssignment_5 )* ) )
            // InternalGame.g:907:1: ( ( rule__LevelDefinition__ObjectsAssignment_5 )* )
            {
            // InternalGame.g:907:1: ( ( rule__LevelDefinition__ObjectsAssignment_5 )* )
            // InternalGame.g:908:2: ( rule__LevelDefinition__ObjectsAssignment_5 )*
            {
             before(grammarAccess.getLevelDefinitionAccess().getObjectsAssignment_5()); 
            // InternalGame.g:909:2: ( rule__LevelDefinition__ObjectsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGame.g:909:3: rule__LevelDefinition__ObjectsAssignment_5
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
    // InternalGame.g:917:1: rule__LevelDefinition__Group__6 : rule__LevelDefinition__Group__6__Impl rule__LevelDefinition__Group__7 ;
    public final void rule__LevelDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:921:1: ( rule__LevelDefinition__Group__6__Impl rule__LevelDefinition__Group__7 )
            // InternalGame.g:922:2: rule__LevelDefinition__Group__6__Impl rule__LevelDefinition__Group__7
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
    // InternalGame.g:929:1: rule__LevelDefinition__Group__6__Impl : ( ( rule__LevelDefinition__ActionsAssignment_6 )* ) ;
    public final void rule__LevelDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:933:1: ( ( ( rule__LevelDefinition__ActionsAssignment_6 )* ) )
            // InternalGame.g:934:1: ( ( rule__LevelDefinition__ActionsAssignment_6 )* )
            {
            // InternalGame.g:934:1: ( ( rule__LevelDefinition__ActionsAssignment_6 )* )
            // InternalGame.g:935:2: ( rule__LevelDefinition__ActionsAssignment_6 )*
            {
             before(grammarAccess.getLevelDefinitionAccess().getActionsAssignment_6()); 
            // InternalGame.g:936:2: ( rule__LevelDefinition__ActionsAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==11) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGame.g:936:3: rule__LevelDefinition__ActionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__LevelDefinition__ActionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

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
    // InternalGame.g:944:1: rule__LevelDefinition__Group__7 : rule__LevelDefinition__Group__7__Impl rule__LevelDefinition__Group__8 ;
    public final void rule__LevelDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:948:1: ( rule__LevelDefinition__Group__7__Impl rule__LevelDefinition__Group__8 )
            // InternalGame.g:949:2: rule__LevelDefinition__Group__7__Impl rule__LevelDefinition__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalGame.g:956:1: rule__LevelDefinition__Group__7__Impl : ( 'goal' ) ;
    public final void rule__LevelDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:960:1: ( ( 'goal' ) )
            // InternalGame.g:961:1: ( 'goal' )
            {
            // InternalGame.g:961:1: ( 'goal' )
            // InternalGame.g:962:2: 'goal'
            {
             before(grammarAccess.getLevelDefinitionAccess().getGoalKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getGoalKeyword_7()); 

            }


            }

        }
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
    // InternalGame.g:971:1: rule__LevelDefinition__Group__8 : rule__LevelDefinition__Group__8__Impl rule__LevelDefinition__Group__9 ;
    public final void rule__LevelDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:975:1: ( rule__LevelDefinition__Group__8__Impl rule__LevelDefinition__Group__9 )
            // InternalGame.g:976:2: rule__LevelDefinition__Group__8__Impl rule__LevelDefinition__Group__9
            {
            pushFollow(FOLLOW_4);
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
    // InternalGame.g:983:1: rule__LevelDefinition__Group__8__Impl : ( '=' ) ;
    public final void rule__LevelDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:987:1: ( ( '=' ) )
            // InternalGame.g:988:1: ( '=' )
            {
            // InternalGame.g:988:1: ( '=' )
            // InternalGame.g:989:2: '='
            {
             before(grammarAccess.getLevelDefinitionAccess().getEqualsSignKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getEqualsSignKeyword_8()); 

            }


            }

        }
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
    // InternalGame.g:998:1: rule__LevelDefinition__Group__9 : rule__LevelDefinition__Group__9__Impl rule__LevelDefinition__Group__10 ;
    public final void rule__LevelDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1002:1: ( rule__LevelDefinition__Group__9__Impl rule__LevelDefinition__Group__10 )
            // InternalGame.g:1003:2: rule__LevelDefinition__Group__9__Impl rule__LevelDefinition__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__LevelDefinition__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group__10();

            state._fsp--;


            }

        }
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
    // InternalGame.g:1010:1: rule__LevelDefinition__Group__9__Impl : ( ( rule__LevelDefinition__GoalAssignment_9 ) ) ;
    public final void rule__LevelDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1014:1: ( ( ( rule__LevelDefinition__GoalAssignment_9 ) ) )
            // InternalGame.g:1015:1: ( ( rule__LevelDefinition__GoalAssignment_9 ) )
            {
            // InternalGame.g:1015:1: ( ( rule__LevelDefinition__GoalAssignment_9 ) )
            // InternalGame.g:1016:2: ( rule__LevelDefinition__GoalAssignment_9 )
            {
             before(grammarAccess.getLevelDefinitionAccess().getGoalAssignment_9()); 
            // InternalGame.g:1017:2: ( rule__LevelDefinition__GoalAssignment_9 )
            // InternalGame.g:1017:3: rule__LevelDefinition__GoalAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__LevelDefinition__GoalAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getLevelDefinitionAccess().getGoalAssignment_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__LevelDefinition__Group__10"
    // InternalGame.g:1025:1: rule__LevelDefinition__Group__10 : rule__LevelDefinition__Group__10__Impl rule__LevelDefinition__Group__11 ;
    public final void rule__LevelDefinition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1029:1: ( rule__LevelDefinition__Group__10__Impl rule__LevelDefinition__Group__11 )
            // InternalGame.g:1030:2: rule__LevelDefinition__Group__10__Impl rule__LevelDefinition__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__LevelDefinition__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__10"


    // $ANTLR start "rule__LevelDefinition__Group__10__Impl"
    // InternalGame.g:1037:1: rule__LevelDefinition__Group__10__Impl : ( ';' ) ;
    public final void rule__LevelDefinition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1041:1: ( ( ';' ) )
            // InternalGame.g:1042:1: ( ';' )
            {
            // InternalGame.g:1042:1: ( ';' )
            // InternalGame.g:1043:2: ';'
            {
             before(grammarAccess.getLevelDefinitionAccess().getSemicolonKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__10__Impl"


    // $ANTLR start "rule__LevelDefinition__Group__11"
    // InternalGame.g:1052:1: rule__LevelDefinition__Group__11 : rule__LevelDefinition__Group__11__Impl rule__LevelDefinition__Group__12 ;
    public final void rule__LevelDefinition__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1056:1: ( rule__LevelDefinition__Group__11__Impl rule__LevelDefinition__Group__12 )
            // InternalGame.g:1057:2: rule__LevelDefinition__Group__11__Impl rule__LevelDefinition__Group__12
            {
            pushFollow(FOLLOW_16);
            rule__LevelDefinition__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__11"


    // $ANTLR start "rule__LevelDefinition__Group__11__Impl"
    // InternalGame.g:1064:1: rule__LevelDefinition__Group__11__Impl : ( ( rule__LevelDefinition__Group_11__0 )? ) ;
    public final void rule__LevelDefinition__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1068:1: ( ( ( rule__LevelDefinition__Group_11__0 )? ) )
            // InternalGame.g:1069:1: ( ( rule__LevelDefinition__Group_11__0 )? )
            {
            // InternalGame.g:1069:1: ( ( rule__LevelDefinition__Group_11__0 )? )
            // InternalGame.g:1070:2: ( rule__LevelDefinition__Group_11__0 )?
            {
             before(grammarAccess.getLevelDefinitionAccess().getGroup_11()); 
            // InternalGame.g:1071:2: ( rule__LevelDefinition__Group_11__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGame.g:1071:3: rule__LevelDefinition__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LevelDefinition__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLevelDefinitionAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__11__Impl"


    // $ANTLR start "rule__LevelDefinition__Group__12"
    // InternalGame.g:1079:1: rule__LevelDefinition__Group__12 : rule__LevelDefinition__Group__12__Impl ;
    public final void rule__LevelDefinition__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1083:1: ( rule__LevelDefinition__Group__12__Impl )
            // InternalGame.g:1084:2: rule__LevelDefinition__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__12"


    // $ANTLR start "rule__LevelDefinition__Group__12__Impl"
    // InternalGame.g:1090:1: rule__LevelDefinition__Group__12__Impl : ( '}' ) ;
    public final void rule__LevelDefinition__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1094:1: ( ( '}' ) )
            // InternalGame.g:1095:1: ( '}' )
            {
            // InternalGame.g:1095:1: ( '}' )
            // InternalGame.g:1096:2: '}'
            {
             before(grammarAccess.getLevelDefinitionAccess().getRightCurlyBracketKeyword_12()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group__12__Impl"


    // $ANTLR start "rule__LevelDefinition__Group_11__0"
    // InternalGame.g:1106:1: rule__LevelDefinition__Group_11__0 : rule__LevelDefinition__Group_11__0__Impl rule__LevelDefinition__Group_11__1 ;
    public final void rule__LevelDefinition__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1110:1: ( rule__LevelDefinition__Group_11__0__Impl rule__LevelDefinition__Group_11__1 )
            // InternalGame.g:1111:2: rule__LevelDefinition__Group_11__0__Impl rule__LevelDefinition__Group_11__1
            {
            pushFollow(FOLLOW_9);
            rule__LevelDefinition__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group_11__0"


    // $ANTLR start "rule__LevelDefinition__Group_11__0__Impl"
    // InternalGame.g:1118:1: rule__LevelDefinition__Group_11__0__Impl : ( 'next' ) ;
    public final void rule__LevelDefinition__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1122:1: ( ( 'next' ) )
            // InternalGame.g:1123:1: ( 'next' )
            {
            // InternalGame.g:1123:1: ( 'next' )
            // InternalGame.g:1124:2: 'next'
            {
             before(grammarAccess.getLevelDefinitionAccess().getNextKeyword_11_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getNextKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group_11__0__Impl"


    // $ANTLR start "rule__LevelDefinition__Group_11__1"
    // InternalGame.g:1133:1: rule__LevelDefinition__Group_11__1 : rule__LevelDefinition__Group_11__1__Impl rule__LevelDefinition__Group_11__2 ;
    public final void rule__LevelDefinition__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1137:1: ( rule__LevelDefinition__Group_11__1__Impl rule__LevelDefinition__Group_11__2 )
            // InternalGame.g:1138:2: rule__LevelDefinition__Group_11__1__Impl rule__LevelDefinition__Group_11__2
            {
            pushFollow(FOLLOW_4);
            rule__LevelDefinition__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group_11__1"


    // $ANTLR start "rule__LevelDefinition__Group_11__1__Impl"
    // InternalGame.g:1145:1: rule__LevelDefinition__Group_11__1__Impl : ( '=' ) ;
    public final void rule__LevelDefinition__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1149:1: ( ( '=' ) )
            // InternalGame.g:1150:1: ( '=' )
            {
            // InternalGame.g:1150:1: ( '=' )
            // InternalGame.g:1151:2: '='
            {
             before(grammarAccess.getLevelDefinitionAccess().getEqualsSignKeyword_11_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getEqualsSignKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group_11__1__Impl"


    // $ANTLR start "rule__LevelDefinition__Group_11__2"
    // InternalGame.g:1160:1: rule__LevelDefinition__Group_11__2 : rule__LevelDefinition__Group_11__2__Impl rule__LevelDefinition__Group_11__3 ;
    public final void rule__LevelDefinition__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1164:1: ( rule__LevelDefinition__Group_11__2__Impl rule__LevelDefinition__Group_11__3 )
            // InternalGame.g:1165:2: rule__LevelDefinition__Group_11__2__Impl rule__LevelDefinition__Group_11__3
            {
            pushFollow(FOLLOW_10);
            rule__LevelDefinition__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group_11__2"


    // $ANTLR start "rule__LevelDefinition__Group_11__2__Impl"
    // InternalGame.g:1172:1: rule__LevelDefinition__Group_11__2__Impl : ( ( rule__LevelDefinition__NextAssignment_11_2 ) ) ;
    public final void rule__LevelDefinition__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1176:1: ( ( ( rule__LevelDefinition__NextAssignment_11_2 ) ) )
            // InternalGame.g:1177:1: ( ( rule__LevelDefinition__NextAssignment_11_2 ) )
            {
            // InternalGame.g:1177:1: ( ( rule__LevelDefinition__NextAssignment_11_2 ) )
            // InternalGame.g:1178:2: ( rule__LevelDefinition__NextAssignment_11_2 )
            {
             before(grammarAccess.getLevelDefinitionAccess().getNextAssignment_11_2()); 
            // InternalGame.g:1179:2: ( rule__LevelDefinition__NextAssignment_11_2 )
            // InternalGame.g:1179:3: rule__LevelDefinition__NextAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__LevelDefinition__NextAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getLevelDefinitionAccess().getNextAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group_11__2__Impl"


    // $ANTLR start "rule__LevelDefinition__Group_11__3"
    // InternalGame.g:1187:1: rule__LevelDefinition__Group_11__3 : rule__LevelDefinition__Group_11__3__Impl ;
    public final void rule__LevelDefinition__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1191:1: ( rule__LevelDefinition__Group_11__3__Impl )
            // InternalGame.g:1192:2: rule__LevelDefinition__Group_11__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LevelDefinition__Group_11__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group_11__3"


    // $ANTLR start "rule__LevelDefinition__Group_11__3__Impl"
    // InternalGame.g:1198:1: rule__LevelDefinition__Group_11__3__Impl : ( ';' ) ;
    public final void rule__LevelDefinition__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1202:1: ( ( ';' ) )
            // InternalGame.g:1203:1: ( ';' )
            {
            // InternalGame.g:1203:1: ( ';' )
            // InternalGame.g:1204:2: ';'
            {
             before(grammarAccess.getLevelDefinitionAccess().getSemicolonKeyword_11_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getSemicolonKeyword_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__Group_11__3__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalGame.g:1214:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1218:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalGame.g:1219:2: rule__Description__Group__0__Impl rule__Description__Group__1
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
    // InternalGame.g:1226:1: rule__Description__Group__0__Impl : ( 'description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1230:1: ( ( 'description' ) )
            // InternalGame.g:1231:1: ( 'description' )
            {
            // InternalGame.g:1231:1: ( 'description' )
            // InternalGame.g:1232:2: 'description'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalGame.g:1241:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1245:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // InternalGame.g:1246:2: rule__Description__Group__1__Impl rule__Description__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalGame.g:1253:1: rule__Description__Group__1__Impl : ( '=' ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1257:1: ( ( '=' ) )
            // InternalGame.g:1258:1: ( '=' )
            {
            // InternalGame.g:1258:1: ( '=' )
            // InternalGame.g:1259:2: '='
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
    // InternalGame.g:1268:1: rule__Description__Group__2 : rule__Description__Group__2__Impl rule__Description__Group__3 ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1272:1: ( rule__Description__Group__2__Impl rule__Description__Group__3 )
            // InternalGame.g:1273:2: rule__Description__Group__2__Impl rule__Description__Group__3
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
    // InternalGame.g:1280:1: rule__Description__Group__2__Impl : ( ( rule__Description__NameAssignment_2 ) ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1284:1: ( ( ( rule__Description__NameAssignment_2 ) ) )
            // InternalGame.g:1285:1: ( ( rule__Description__NameAssignment_2 ) )
            {
            // InternalGame.g:1285:1: ( ( rule__Description__NameAssignment_2 ) )
            // InternalGame.g:1286:2: ( rule__Description__NameAssignment_2 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_2()); 
            // InternalGame.g:1287:2: ( rule__Description__NameAssignment_2 )
            // InternalGame.g:1287:3: rule__Description__NameAssignment_2
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
    // InternalGame.g:1295:1: rule__Description__Group__3 : rule__Description__Group__3__Impl ;
    public final void rule__Description__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1299:1: ( rule__Description__Group__3__Impl )
            // InternalGame.g:1300:2: rule__Description__Group__3__Impl
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
    // InternalGame.g:1306:1: rule__Description__Group__3__Impl : ( ';' ) ;
    public final void rule__Description__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1310:1: ( ( ';' ) )
            // InternalGame.g:1311:1: ( ';' )
            {
            // InternalGame.g:1311:1: ( ';' )
            // InternalGame.g:1312:2: ';'
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
    // InternalGame.g:1322:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1326:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalGame.g:1327:2: rule__Person__Group__0__Impl rule__Person__Group__1
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
    // InternalGame.g:1334:1: rule__Person__Group__0__Impl : ( ( rule__Person__NameAssignment_0 ) ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1338:1: ( ( ( rule__Person__NameAssignment_0 ) ) )
            // InternalGame.g:1339:1: ( ( rule__Person__NameAssignment_0 ) )
            {
            // InternalGame.g:1339:1: ( ( rule__Person__NameAssignment_0 ) )
            // InternalGame.g:1340:2: ( rule__Person__NameAssignment_0 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_0()); 
            // InternalGame.g:1341:2: ( rule__Person__NameAssignment_0 )
            // InternalGame.g:1341:3: rule__Person__NameAssignment_0
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
    // InternalGame.g:1349:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1353:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalGame.g:1354:2: rule__Person__Group__1__Impl rule__Person__Group__2
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
    // InternalGame.g:1361:1: rule__Person__Group__1__Impl : ( '=' ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1365:1: ( ( '=' ) )
            // InternalGame.g:1366:1: ( '=' )
            {
            // InternalGame.g:1366:1: ( '=' )
            // InternalGame.g:1367:2: '='
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
    // InternalGame.g:1376:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1380:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalGame.g:1381:2: rule__Person__Group__2__Impl rule__Person__Group__3
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
    // InternalGame.g:1388:1: rule__Person__Group__2__Impl : ( '{' ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1392:1: ( ( '{' ) )
            // InternalGame.g:1393:1: ( '{' )
            {
            // InternalGame.g:1393:1: ( '{' )
            // InternalGame.g:1394:2: '{'
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
    // InternalGame.g:1403:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1407:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalGame.g:1408:2: rule__Person__Group__3__Impl rule__Person__Group__4
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
    // InternalGame.g:1415:1: rule__Person__Group__3__Impl : ( 'type' ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1419:1: ( ( 'type' ) )
            // InternalGame.g:1420:1: ( 'type' )
            {
            // InternalGame.g:1420:1: ( 'type' )
            // InternalGame.g:1421:2: 'type'
            {
             before(grammarAccess.getPersonAccess().getTypeKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGame.g:1430:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1434:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // InternalGame.g:1435:2: rule__Person__Group__4__Impl rule__Person__Group__5
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
    // InternalGame.g:1442:1: rule__Person__Group__4__Impl : ( '=' ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1446:1: ( ( '=' ) )
            // InternalGame.g:1447:1: ( '=' )
            {
            // InternalGame.g:1447:1: ( '=' )
            // InternalGame.g:1448:2: '='
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
    // InternalGame.g:1457:1: rule__Person__Group__5 : rule__Person__Group__5__Impl rule__Person__Group__6 ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1461:1: ( rule__Person__Group__5__Impl rule__Person__Group__6 )
            // InternalGame.g:1462:2: rule__Person__Group__5__Impl rule__Person__Group__6
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
    // InternalGame.g:1469:1: rule__Person__Group__5__Impl : ( ( rule__Person__TypeAssignment_5 ) ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1473:1: ( ( ( rule__Person__TypeAssignment_5 ) ) )
            // InternalGame.g:1474:1: ( ( rule__Person__TypeAssignment_5 ) )
            {
            // InternalGame.g:1474:1: ( ( rule__Person__TypeAssignment_5 ) )
            // InternalGame.g:1475:2: ( rule__Person__TypeAssignment_5 )
            {
             before(grammarAccess.getPersonAccess().getTypeAssignment_5()); 
            // InternalGame.g:1476:2: ( rule__Person__TypeAssignment_5 )
            // InternalGame.g:1476:3: rule__Person__TypeAssignment_5
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
    // InternalGame.g:1484:1: rule__Person__Group__6 : rule__Person__Group__6__Impl rule__Person__Group__7 ;
    public final void rule__Person__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1488:1: ( rule__Person__Group__6__Impl rule__Person__Group__7 )
            // InternalGame.g:1489:2: rule__Person__Group__6__Impl rule__Person__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalGame.g:1496:1: rule__Person__Group__6__Impl : ( ';' ) ;
    public final void rule__Person__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1500:1: ( ( ';' ) )
            // InternalGame.g:1501:1: ( ';' )
            {
            // InternalGame.g:1501:1: ( ';' )
            // InternalGame.g:1502:2: ';'
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
    // InternalGame.g:1511:1: rule__Person__Group__7 : rule__Person__Group__7__Impl rule__Person__Group__8 ;
    public final void rule__Person__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1515:1: ( rule__Person__Group__7__Impl rule__Person__Group__8 )
            // InternalGame.g:1516:2: rule__Person__Group__7__Impl rule__Person__Group__8
            {
            pushFollow(FOLLOW_9);
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
    // InternalGame.g:1523:1: rule__Person__Group__7__Impl : ( 'response' ) ;
    public final void rule__Person__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1527:1: ( ( 'response' ) )
            // InternalGame.g:1528:1: ( 'response' )
            {
            // InternalGame.g:1528:1: ( 'response' )
            // InternalGame.g:1529:2: 'response'
            {
             before(grammarAccess.getPersonAccess().getResponseKeyword_7()); 
            match(input,27,FOLLOW_2); 
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
    // InternalGame.g:1538:1: rule__Person__Group__8 : rule__Person__Group__8__Impl rule__Person__Group__9 ;
    public final void rule__Person__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1542:1: ( rule__Person__Group__8__Impl rule__Person__Group__9 )
            // InternalGame.g:1543:2: rule__Person__Group__8__Impl rule__Person__Group__9
            {
            pushFollow(FOLLOW_17);
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
    // InternalGame.g:1550:1: rule__Person__Group__8__Impl : ( '=' ) ;
    public final void rule__Person__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1554:1: ( ( '=' ) )
            // InternalGame.g:1555:1: ( '=' )
            {
            // InternalGame.g:1555:1: ( '=' )
            // InternalGame.g:1556:2: '='
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
    // InternalGame.g:1565:1: rule__Person__Group__9 : rule__Person__Group__9__Impl rule__Person__Group__10 ;
    public final void rule__Person__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1569:1: ( rule__Person__Group__9__Impl rule__Person__Group__10 )
            // InternalGame.g:1570:2: rule__Person__Group__9__Impl rule__Person__Group__10
            {
            pushFollow(FOLLOW_10);
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
    // InternalGame.g:1577:1: rule__Person__Group__9__Impl : ( ( rule__Person__ResponseAssignment_9 ) ) ;
    public final void rule__Person__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1581:1: ( ( ( rule__Person__ResponseAssignment_9 ) ) )
            // InternalGame.g:1582:1: ( ( rule__Person__ResponseAssignment_9 ) )
            {
            // InternalGame.g:1582:1: ( ( rule__Person__ResponseAssignment_9 ) )
            // InternalGame.g:1583:2: ( rule__Person__ResponseAssignment_9 )
            {
             before(grammarAccess.getPersonAccess().getResponseAssignment_9()); 
            // InternalGame.g:1584:2: ( rule__Person__ResponseAssignment_9 )
            // InternalGame.g:1584:3: rule__Person__ResponseAssignment_9
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
    // InternalGame.g:1592:1: rule__Person__Group__10 : rule__Person__Group__10__Impl rule__Person__Group__11 ;
    public final void rule__Person__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1596:1: ( rule__Person__Group__10__Impl rule__Person__Group__11 )
            // InternalGame.g:1597:2: rule__Person__Group__10__Impl rule__Person__Group__11
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
    // InternalGame.g:1604:1: rule__Person__Group__10__Impl : ( ';' ) ;
    public final void rule__Person__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1608:1: ( ( ';' ) )
            // InternalGame.g:1609:1: ( ';' )
            {
            // InternalGame.g:1609:1: ( ';' )
            // InternalGame.g:1610:2: ';'
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
    // InternalGame.g:1619:1: rule__Person__Group__11 : rule__Person__Group__11__Impl rule__Person__Group__12 ;
    public final void rule__Person__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1623:1: ( rule__Person__Group__11__Impl rule__Person__Group__12 )
            // InternalGame.g:1624:2: rule__Person__Group__11__Impl rule__Person__Group__12
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
    // InternalGame.g:1631:1: rule__Person__Group__11__Impl : ( 'position' ) ;
    public final void rule__Person__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1635:1: ( ( 'position' ) )
            // InternalGame.g:1636:1: ( 'position' )
            {
            // InternalGame.g:1636:1: ( 'position' )
            // InternalGame.g:1637:2: 'position'
            {
             before(grammarAccess.getPersonAccess().getPositionKeyword_11()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGame.g:1646:1: rule__Person__Group__12 : rule__Person__Group__12__Impl rule__Person__Group__13 ;
    public final void rule__Person__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1650:1: ( rule__Person__Group__12__Impl rule__Person__Group__13 )
            // InternalGame.g:1651:2: rule__Person__Group__12__Impl rule__Person__Group__13
            {
            pushFollow(FOLLOW_17);
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
    // InternalGame.g:1658:1: rule__Person__Group__12__Impl : ( '=' ) ;
    public final void rule__Person__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1662:1: ( ( '=' ) )
            // InternalGame.g:1663:1: ( '=' )
            {
            // InternalGame.g:1663:1: ( '=' )
            // InternalGame.g:1664:2: '='
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
    // InternalGame.g:1673:1: rule__Person__Group__13 : rule__Person__Group__13__Impl rule__Person__Group__14 ;
    public final void rule__Person__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1677:1: ( rule__Person__Group__13__Impl rule__Person__Group__14 )
            // InternalGame.g:1678:2: rule__Person__Group__13__Impl rule__Person__Group__14
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
    // InternalGame.g:1685:1: rule__Person__Group__13__Impl : ( ( rule__Person__PositionAssignment_13 ) ) ;
    public final void rule__Person__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1689:1: ( ( ( rule__Person__PositionAssignment_13 ) ) )
            // InternalGame.g:1690:1: ( ( rule__Person__PositionAssignment_13 ) )
            {
            // InternalGame.g:1690:1: ( ( rule__Person__PositionAssignment_13 ) )
            // InternalGame.g:1691:2: ( rule__Person__PositionAssignment_13 )
            {
             before(grammarAccess.getPersonAccess().getPositionAssignment_13()); 
            // InternalGame.g:1692:2: ( rule__Person__PositionAssignment_13 )
            // InternalGame.g:1692:3: rule__Person__PositionAssignment_13
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
    // InternalGame.g:1700:1: rule__Person__Group__14 : rule__Person__Group__14__Impl rule__Person__Group__15 ;
    public final void rule__Person__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1704:1: ( rule__Person__Group__14__Impl rule__Person__Group__15 )
            // InternalGame.g:1705:2: rule__Person__Group__14__Impl rule__Person__Group__15
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
    // InternalGame.g:1712:1: rule__Person__Group__14__Impl : ( ';' ) ;
    public final void rule__Person__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1716:1: ( ( ';' ) )
            // InternalGame.g:1717:1: ( ';' )
            {
            // InternalGame.g:1717:1: ( ';' )
            // InternalGame.g:1718:2: ';'
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
    // InternalGame.g:1727:1: rule__Person__Group__15 : rule__Person__Group__15__Impl rule__Person__Group__16 ;
    public final void rule__Person__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1731:1: ( rule__Person__Group__15__Impl rule__Person__Group__16 )
            // InternalGame.g:1732:2: rule__Person__Group__15__Impl rule__Person__Group__16
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
    // InternalGame.g:1739:1: rule__Person__Group__15__Impl : ( 'action' ) ;
    public final void rule__Person__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1743:1: ( ( 'action' ) )
            // InternalGame.g:1744:1: ( 'action' )
            {
            // InternalGame.g:1744:1: ( 'action' )
            // InternalGame.g:1745:2: 'action'
            {
             before(grammarAccess.getPersonAccess().getActionKeyword_15()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGame.g:1754:1: rule__Person__Group__16 : rule__Person__Group__16__Impl rule__Person__Group__17 ;
    public final void rule__Person__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1758:1: ( rule__Person__Group__16__Impl rule__Person__Group__17 )
            // InternalGame.g:1759:2: rule__Person__Group__16__Impl rule__Person__Group__17
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
    // InternalGame.g:1766:1: rule__Person__Group__16__Impl : ( '=' ) ;
    public final void rule__Person__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1770:1: ( ( '=' ) )
            // InternalGame.g:1771:1: ( '=' )
            {
            // InternalGame.g:1771:1: ( '=' )
            // InternalGame.g:1772:2: '='
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
    // InternalGame.g:1781:1: rule__Person__Group__17 : rule__Person__Group__17__Impl rule__Person__Group__18 ;
    public final void rule__Person__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1785:1: ( rule__Person__Group__17__Impl rule__Person__Group__18 )
            // InternalGame.g:1786:2: rule__Person__Group__17__Impl rule__Person__Group__18
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
    // InternalGame.g:1793:1: rule__Person__Group__17__Impl : ( ( rule__Person__ActionAssignment_17 ) ) ;
    public final void rule__Person__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1797:1: ( ( ( rule__Person__ActionAssignment_17 ) ) )
            // InternalGame.g:1798:1: ( ( rule__Person__ActionAssignment_17 ) )
            {
            // InternalGame.g:1798:1: ( ( rule__Person__ActionAssignment_17 ) )
            // InternalGame.g:1799:2: ( rule__Person__ActionAssignment_17 )
            {
             before(grammarAccess.getPersonAccess().getActionAssignment_17()); 
            // InternalGame.g:1800:2: ( rule__Person__ActionAssignment_17 )
            // InternalGame.g:1800:3: rule__Person__ActionAssignment_17
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
    // InternalGame.g:1808:1: rule__Person__Group__18 : rule__Person__Group__18__Impl rule__Person__Group__19 ;
    public final void rule__Person__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1812:1: ( rule__Person__Group__18__Impl rule__Person__Group__19 )
            // InternalGame.g:1813:2: rule__Person__Group__18__Impl rule__Person__Group__19
            {
            pushFollow(FOLLOW_12);
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
    // InternalGame.g:1820:1: rule__Person__Group__18__Impl : ( ';' ) ;
    public final void rule__Person__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1824:1: ( ( ';' ) )
            // InternalGame.g:1825:1: ( ';' )
            {
            // InternalGame.g:1825:1: ( ';' )
            // InternalGame.g:1826:2: ';'
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
    // InternalGame.g:1835:1: rule__Person__Group__19 : rule__Person__Group__19__Impl ;
    public final void rule__Person__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1839:1: ( rule__Person__Group__19__Impl )
            // InternalGame.g:1840:2: rule__Person__Group__19__Impl
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
    // InternalGame.g:1846:1: rule__Person__Group__19__Impl : ( '}' ) ;
    public final void rule__Person__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1850:1: ( ( '}' ) )
            // InternalGame.g:1851:1: ( '}' )
            {
            // InternalGame.g:1851:1: ( '}' )
            // InternalGame.g:1852:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_19()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGame.g:1862:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1866:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalGame.g:1867:2: rule__Object__Group__0__Impl rule__Object__Group__1
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
    // InternalGame.g:1874:1: rule__Object__Group__0__Impl : ( ( rule__Object__NameAssignment_0 ) ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1878:1: ( ( ( rule__Object__NameAssignment_0 ) ) )
            // InternalGame.g:1879:1: ( ( rule__Object__NameAssignment_0 ) )
            {
            // InternalGame.g:1879:1: ( ( rule__Object__NameAssignment_0 ) )
            // InternalGame.g:1880:2: ( rule__Object__NameAssignment_0 )
            {
             before(grammarAccess.getObjectAccess().getNameAssignment_0()); 
            // InternalGame.g:1881:2: ( rule__Object__NameAssignment_0 )
            // InternalGame.g:1881:3: rule__Object__NameAssignment_0
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
    // InternalGame.g:1889:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1893:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalGame.g:1894:2: rule__Object__Group__1__Impl rule__Object__Group__2
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
    // InternalGame.g:1901:1: rule__Object__Group__1__Impl : ( '=' ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1905:1: ( ( '=' ) )
            // InternalGame.g:1906:1: ( '=' )
            {
            // InternalGame.g:1906:1: ( '=' )
            // InternalGame.g:1907:2: '='
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
    // InternalGame.g:1916:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1920:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalGame.g:1921:2: rule__Object__Group__2__Impl rule__Object__Group__3
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
    // InternalGame.g:1928:1: rule__Object__Group__2__Impl : ( '{' ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1932:1: ( ( '{' ) )
            // InternalGame.g:1933:1: ( '{' )
            {
            // InternalGame.g:1933:1: ( '{' )
            // InternalGame.g:1934:2: '{'
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
    // InternalGame.g:1943:1: rule__Object__Group__3 : rule__Object__Group__3__Impl rule__Object__Group__4 ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1947:1: ( rule__Object__Group__3__Impl rule__Object__Group__4 )
            // InternalGame.g:1948:2: rule__Object__Group__3__Impl rule__Object__Group__4
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
    // InternalGame.g:1955:1: rule__Object__Group__3__Impl : ( 'type' ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1959:1: ( ( 'type' ) )
            // InternalGame.g:1960:1: ( 'type' )
            {
            // InternalGame.g:1960:1: ( 'type' )
            // InternalGame.g:1961:2: 'type'
            {
             before(grammarAccess.getObjectAccess().getTypeKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalGame.g:1970:1: rule__Object__Group__4 : rule__Object__Group__4__Impl rule__Object__Group__5 ;
    public final void rule__Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1974:1: ( rule__Object__Group__4__Impl rule__Object__Group__5 )
            // InternalGame.g:1975:2: rule__Object__Group__4__Impl rule__Object__Group__5
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
    // InternalGame.g:1982:1: rule__Object__Group__4__Impl : ( '=' ) ;
    public final void rule__Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1986:1: ( ( '=' ) )
            // InternalGame.g:1987:1: ( '=' )
            {
            // InternalGame.g:1987:1: ( '=' )
            // InternalGame.g:1988:2: '='
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
    // InternalGame.g:1997:1: rule__Object__Group__5 : rule__Object__Group__5__Impl rule__Object__Group__6 ;
    public final void rule__Object__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2001:1: ( rule__Object__Group__5__Impl rule__Object__Group__6 )
            // InternalGame.g:2002:2: rule__Object__Group__5__Impl rule__Object__Group__6
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
    // InternalGame.g:2009:1: rule__Object__Group__5__Impl : ( ( rule__Object__TypeAssignment_5 ) ) ;
    public final void rule__Object__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2013:1: ( ( ( rule__Object__TypeAssignment_5 ) ) )
            // InternalGame.g:2014:1: ( ( rule__Object__TypeAssignment_5 ) )
            {
            // InternalGame.g:2014:1: ( ( rule__Object__TypeAssignment_5 ) )
            // InternalGame.g:2015:2: ( rule__Object__TypeAssignment_5 )
            {
             before(grammarAccess.getObjectAccess().getTypeAssignment_5()); 
            // InternalGame.g:2016:2: ( rule__Object__TypeAssignment_5 )
            // InternalGame.g:2016:3: rule__Object__TypeAssignment_5
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
    // InternalGame.g:2024:1: rule__Object__Group__6 : rule__Object__Group__6__Impl rule__Object__Group__7 ;
    public final void rule__Object__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2028:1: ( rule__Object__Group__6__Impl rule__Object__Group__7 )
            // InternalGame.g:2029:2: rule__Object__Group__6__Impl rule__Object__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalGame.g:2036:1: rule__Object__Group__6__Impl : ( ';' ) ;
    public final void rule__Object__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2040:1: ( ( ';' ) )
            // InternalGame.g:2041:1: ( ';' )
            {
            // InternalGame.g:2041:1: ( ';' )
            // InternalGame.g:2042:2: ';'
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
    // InternalGame.g:2051:1: rule__Object__Group__7 : rule__Object__Group__7__Impl rule__Object__Group__8 ;
    public final void rule__Object__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2055:1: ( rule__Object__Group__7__Impl rule__Object__Group__8 )
            // InternalGame.g:2056:2: rule__Object__Group__7__Impl rule__Object__Group__8
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
    // InternalGame.g:2063:1: rule__Object__Group__7__Impl : ( 'position' ) ;
    public final void rule__Object__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2067:1: ( ( 'position' ) )
            // InternalGame.g:2068:1: ( 'position' )
            {
            // InternalGame.g:2068:1: ( 'position' )
            // InternalGame.g:2069:2: 'position'
            {
             before(grammarAccess.getObjectAccess().getPositionKeyword_7()); 
            match(input,28,FOLLOW_2); 
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
    // InternalGame.g:2078:1: rule__Object__Group__8 : rule__Object__Group__8__Impl rule__Object__Group__9 ;
    public final void rule__Object__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2082:1: ( rule__Object__Group__8__Impl rule__Object__Group__9 )
            // InternalGame.g:2083:2: rule__Object__Group__8__Impl rule__Object__Group__9
            {
            pushFollow(FOLLOW_17);
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
    // InternalGame.g:2090:1: rule__Object__Group__8__Impl : ( '=' ) ;
    public final void rule__Object__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2094:1: ( ( '=' ) )
            // InternalGame.g:2095:1: ( '=' )
            {
            // InternalGame.g:2095:1: ( '=' )
            // InternalGame.g:2096:2: '='
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
    // InternalGame.g:2105:1: rule__Object__Group__9 : rule__Object__Group__9__Impl rule__Object__Group__10 ;
    public final void rule__Object__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2109:1: ( rule__Object__Group__9__Impl rule__Object__Group__10 )
            // InternalGame.g:2110:2: rule__Object__Group__9__Impl rule__Object__Group__10
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
    // InternalGame.g:2117:1: rule__Object__Group__9__Impl : ( ( rule__Object__PositionAssignment_9 ) ) ;
    public final void rule__Object__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2121:1: ( ( ( rule__Object__PositionAssignment_9 ) ) )
            // InternalGame.g:2122:1: ( ( rule__Object__PositionAssignment_9 ) )
            {
            // InternalGame.g:2122:1: ( ( rule__Object__PositionAssignment_9 ) )
            // InternalGame.g:2123:2: ( rule__Object__PositionAssignment_9 )
            {
             before(grammarAccess.getObjectAccess().getPositionAssignment_9()); 
            // InternalGame.g:2124:2: ( rule__Object__PositionAssignment_9 )
            // InternalGame.g:2124:3: rule__Object__PositionAssignment_9
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
    // InternalGame.g:2132:1: rule__Object__Group__10 : rule__Object__Group__10__Impl rule__Object__Group__11 ;
    public final void rule__Object__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2136:1: ( rule__Object__Group__10__Impl rule__Object__Group__11 )
            // InternalGame.g:2137:2: rule__Object__Group__10__Impl rule__Object__Group__11
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
    // InternalGame.g:2144:1: rule__Object__Group__10__Impl : ( ';' ) ;
    public final void rule__Object__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2148:1: ( ( ';' ) )
            // InternalGame.g:2149:1: ( ';' )
            {
            // InternalGame.g:2149:1: ( ';' )
            // InternalGame.g:2150:2: ';'
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
    // InternalGame.g:2159:1: rule__Object__Group__11 : rule__Object__Group__11__Impl rule__Object__Group__12 ;
    public final void rule__Object__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2163:1: ( rule__Object__Group__11__Impl rule__Object__Group__12 )
            // InternalGame.g:2164:2: rule__Object__Group__11__Impl rule__Object__Group__12
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
    // InternalGame.g:2171:1: rule__Object__Group__11__Impl : ( 'action' ) ;
    public final void rule__Object__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2175:1: ( ( 'action' ) )
            // InternalGame.g:2176:1: ( 'action' )
            {
            // InternalGame.g:2176:1: ( 'action' )
            // InternalGame.g:2177:2: 'action'
            {
             before(grammarAccess.getObjectAccess().getActionKeyword_11()); 
            match(input,29,FOLLOW_2); 
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
    // InternalGame.g:2186:1: rule__Object__Group__12 : rule__Object__Group__12__Impl rule__Object__Group__13 ;
    public final void rule__Object__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2190:1: ( rule__Object__Group__12__Impl rule__Object__Group__13 )
            // InternalGame.g:2191:2: rule__Object__Group__12__Impl rule__Object__Group__13
            {
            pushFollow(FOLLOW_23);
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
    // InternalGame.g:2198:1: rule__Object__Group__12__Impl : ( '=' ) ;
    public final void rule__Object__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2202:1: ( ( '=' ) )
            // InternalGame.g:2203:1: ( '=' )
            {
            // InternalGame.g:2203:1: ( '=' )
            // InternalGame.g:2204:2: '='
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
    // InternalGame.g:2213:1: rule__Object__Group__13 : rule__Object__Group__13__Impl rule__Object__Group__14 ;
    public final void rule__Object__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2217:1: ( rule__Object__Group__13__Impl rule__Object__Group__14 )
            // InternalGame.g:2218:2: rule__Object__Group__13__Impl rule__Object__Group__14
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
    // InternalGame.g:2225:1: rule__Object__Group__13__Impl : ( ( rule__Object__ActionAssignment_13 ) ) ;
    public final void rule__Object__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2229:1: ( ( ( rule__Object__ActionAssignment_13 ) ) )
            // InternalGame.g:2230:1: ( ( rule__Object__ActionAssignment_13 ) )
            {
            // InternalGame.g:2230:1: ( ( rule__Object__ActionAssignment_13 ) )
            // InternalGame.g:2231:2: ( rule__Object__ActionAssignment_13 )
            {
             before(grammarAccess.getObjectAccess().getActionAssignment_13()); 
            // InternalGame.g:2232:2: ( rule__Object__ActionAssignment_13 )
            // InternalGame.g:2232:3: rule__Object__ActionAssignment_13
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
    // InternalGame.g:2240:1: rule__Object__Group__14 : rule__Object__Group__14__Impl rule__Object__Group__15 ;
    public final void rule__Object__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2244:1: ( rule__Object__Group__14__Impl rule__Object__Group__15 )
            // InternalGame.g:2245:2: rule__Object__Group__14__Impl rule__Object__Group__15
            {
            pushFollow(FOLLOW_12);
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
    // InternalGame.g:2252:1: rule__Object__Group__14__Impl : ( ';' ) ;
    public final void rule__Object__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2256:1: ( ( ';' ) )
            // InternalGame.g:2257:1: ( ';' )
            {
            // InternalGame.g:2257:1: ( ';' )
            // InternalGame.g:2258:2: ';'
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
    // InternalGame.g:2267:1: rule__Object__Group__15 : rule__Object__Group__15__Impl ;
    public final void rule__Object__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2271:1: ( rule__Object__Group__15__Impl )
            // InternalGame.g:2272:2: rule__Object__Group__15__Impl
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
    // InternalGame.g:2278:1: rule__Object__Group__15__Impl : ( '}' ) ;
    public final void rule__Object__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2282:1: ( ( '}' ) )
            // InternalGame.g:2283:1: ( '}' )
            {
            // InternalGame.g:2283:1: ( '}' )
            // InternalGame.g:2284:2: '}'
            {
             before(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_15()); 
            match(input,21,FOLLOW_2); 
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


    // $ANTLR start "rule__Game__ScenesAssignment"
    // InternalGame.g:2294:1: rule__Game__ScenesAssignment : ( ruleScene ) ;
    public final void rule__Game__ScenesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2298:1: ( ( ruleScene ) )
            // InternalGame.g:2299:2: ( ruleScene )
            {
            // InternalGame.g:2299:2: ( ruleScene )
            // InternalGame.g:2300:3: ruleScene
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
    // InternalGame.g:2309:1: rule__Scene__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Scene__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2313:1: ( ( RULE_ID ) )
            // InternalGame.g:2314:2: ( RULE_ID )
            {
            // InternalGame.g:2314:2: ( RULE_ID )
            // InternalGame.g:2315:3: RULE_ID
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
    // InternalGame.g:2324:1: rule__Scene__DeclartionsAssignment_3 : ( ruleLevelDeclaration ) ;
    public final void rule__Scene__DeclartionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2328:1: ( ( ruleLevelDeclaration ) )
            // InternalGame.g:2329:2: ( ruleLevelDeclaration )
            {
            // InternalGame.g:2329:2: ( ruleLevelDeclaration )
            // InternalGame.g:2330:3: ruleLevelDeclaration
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
    // InternalGame.g:2339:1: rule__Scene__DefinitionsAssignment_4 : ( ruleLevelDefinition ) ;
    public final void rule__Scene__DefinitionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2343:1: ( ( ruleLevelDefinition ) )
            // InternalGame.g:2344:2: ( ruleLevelDefinition )
            {
            // InternalGame.g:2344:2: ( ruleLevelDefinition )
            // InternalGame.g:2345:3: ruleLevelDefinition
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
    // InternalGame.g:2354:1: rule__Scene__StartLevelAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Scene__StartLevelAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2358:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2359:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2359:2: ( ( RULE_ID ) )
            // InternalGame.g:2360:3: ( RULE_ID )
            {
             before(grammarAccess.getSceneAccess().getStartLevelLevelDeclarationCrossReference_7_0()); 
            // InternalGame.g:2361:3: ( RULE_ID )
            // InternalGame.g:2362:4: RULE_ID
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
    // InternalGame.g:2373:1: rule__Scene__FinalLevelAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__Scene__FinalLevelAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2377:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2378:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2378:2: ( ( RULE_ID ) )
            // InternalGame.g:2379:3: ( RULE_ID )
            {
             before(grammarAccess.getSceneAccess().getFinalLevelLevelDeclarationCrossReference_11_0()); 
            // InternalGame.g:2380:3: ( RULE_ID )
            // InternalGame.g:2381:4: RULE_ID
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
    // InternalGame.g:2392:1: rule__LevelDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LevelDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2396:1: ( ( RULE_ID ) )
            // InternalGame.g:2397:2: ( RULE_ID )
            {
            // InternalGame.g:2397:2: ( RULE_ID )
            // InternalGame.g:2398:3: RULE_ID
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
    // InternalGame.g:2407:1: rule__LevelDefinition__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__LevelDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2411:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2412:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2412:2: ( ( RULE_ID ) )
            // InternalGame.g:2413:3: ( RULE_ID )
            {
             before(grammarAccess.getLevelDefinitionAccess().getNameLevelDeclarationCrossReference_0_0()); 
            // InternalGame.g:2414:3: ( RULE_ID )
            // InternalGame.g:2415:4: RULE_ID
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
    // InternalGame.g:2426:1: rule__LevelDefinition__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__LevelDefinition__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2430:1: ( ( ruleDescription ) )
            // InternalGame.g:2431:2: ( ruleDescription )
            {
            // InternalGame.g:2431:2: ( ruleDescription )
            // InternalGame.g:2432:3: ruleDescription
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
    // InternalGame.g:2441:1: rule__LevelDefinition__PersonsAssignment_4 : ( rulePerson ) ;
    public final void rule__LevelDefinition__PersonsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2445:1: ( ( rulePerson ) )
            // InternalGame.g:2446:2: ( rulePerson )
            {
            // InternalGame.g:2446:2: ( rulePerson )
            // InternalGame.g:2447:3: rulePerson
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
    // InternalGame.g:2456:1: rule__LevelDefinition__ObjectsAssignment_5 : ( ruleObject ) ;
    public final void rule__LevelDefinition__ObjectsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2460:1: ( ( ruleObject ) )
            // InternalGame.g:2461:2: ( ruleObject )
            {
            // InternalGame.g:2461:2: ( ruleObject )
            // InternalGame.g:2462:3: ruleObject
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
    // InternalGame.g:2471:1: rule__LevelDefinition__ActionsAssignment_6 : ( ruleAction_GLOBAL ) ;
    public final void rule__LevelDefinition__ActionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2475:1: ( ( ruleAction_GLOBAL ) )
            // InternalGame.g:2476:2: ( ruleAction_GLOBAL )
            {
            // InternalGame.g:2476:2: ( ruleAction_GLOBAL )
            // InternalGame.g:2477:3: ruleAction_GLOBAL
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


    // $ANTLR start "rule__LevelDefinition__GoalAssignment_9"
    // InternalGame.g:2486:1: rule__LevelDefinition__GoalAssignment_9 : ( RULE_ID ) ;
    public final void rule__LevelDefinition__GoalAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2490:1: ( ( RULE_ID ) )
            // InternalGame.g:2491:2: ( RULE_ID )
            {
            // InternalGame.g:2491:2: ( RULE_ID )
            // InternalGame.g:2492:3: RULE_ID
            {
             before(grammarAccess.getLevelDefinitionAccess().getGoalIDTerminalRuleCall_9_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getGoalIDTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__GoalAssignment_9"


    // $ANTLR start "rule__LevelDefinition__NextAssignment_11_2"
    // InternalGame.g:2501:1: rule__LevelDefinition__NextAssignment_11_2 : ( ( RULE_ID ) ) ;
    public final void rule__LevelDefinition__NextAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2505:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2506:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2506:2: ( ( RULE_ID ) )
            // InternalGame.g:2507:3: ( RULE_ID )
            {
             before(grammarAccess.getLevelDefinitionAccess().getNextLevelDeclarationCrossReference_11_2_0()); 
            // InternalGame.g:2508:3: ( RULE_ID )
            // InternalGame.g:2509:4: RULE_ID
            {
             before(grammarAccess.getLevelDefinitionAccess().getNextLevelDeclarationIDTerminalRuleCall_11_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLevelDefinitionAccess().getNextLevelDeclarationIDTerminalRuleCall_11_2_0_1()); 

            }

             after(grammarAccess.getLevelDefinitionAccess().getNextLevelDeclarationCrossReference_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LevelDefinition__NextAssignment_11_2"


    // $ANTLR start "rule__Description__NameAssignment_2"
    // InternalGame.g:2520:1: rule__Description__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Description__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2524:1: ( ( RULE_STRING ) )
            // InternalGame.g:2525:2: ( RULE_STRING )
            {
            // InternalGame.g:2525:2: ( RULE_STRING )
            // InternalGame.g:2526:3: RULE_STRING
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
    // InternalGame.g:2535:1: rule__Person__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Person__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2539:1: ( ( RULE_ID ) )
            // InternalGame.g:2540:2: ( RULE_ID )
            {
            // InternalGame.g:2540:2: ( RULE_ID )
            // InternalGame.g:2541:3: RULE_ID
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
    // InternalGame.g:2550:1: rule__Person__TypeAssignment_5 : ( RULE_ID ) ;
    public final void rule__Person__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2554:1: ( ( RULE_ID ) )
            // InternalGame.g:2555:2: ( RULE_ID )
            {
            // InternalGame.g:2555:2: ( RULE_ID )
            // InternalGame.g:2556:3: RULE_ID
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
    // InternalGame.g:2565:1: rule__Person__ResponseAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Person__ResponseAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2569:1: ( ( RULE_STRING ) )
            // InternalGame.g:2570:2: ( RULE_STRING )
            {
            // InternalGame.g:2570:2: ( RULE_STRING )
            // InternalGame.g:2571:3: RULE_STRING
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
    // InternalGame.g:2580:1: rule__Person__PositionAssignment_13 : ( RULE_STRING ) ;
    public final void rule__Person__PositionAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2584:1: ( ( RULE_STRING ) )
            // InternalGame.g:2585:2: ( RULE_STRING )
            {
            // InternalGame.g:2585:2: ( RULE_STRING )
            // InternalGame.g:2586:3: RULE_STRING
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
    // InternalGame.g:2595:1: rule__Person__ActionAssignment_17 : ( ruleAction_P ) ;
    public final void rule__Person__ActionAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2599:1: ( ( ruleAction_P ) )
            // InternalGame.g:2600:2: ( ruleAction_P )
            {
            // InternalGame.g:2600:2: ( ruleAction_P )
            // InternalGame.g:2601:3: ruleAction_P
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


    // $ANTLR start "rule__Object__NameAssignment_0"
    // InternalGame.g:2610:1: rule__Object__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Object__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2614:1: ( ( RULE_ID ) )
            // InternalGame.g:2615:2: ( RULE_ID )
            {
            // InternalGame.g:2615:2: ( RULE_ID )
            // InternalGame.g:2616:3: RULE_ID
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
    // InternalGame.g:2625:1: rule__Object__TypeAssignment_5 : ( RULE_ID ) ;
    public final void rule__Object__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2629:1: ( ( RULE_ID ) )
            // InternalGame.g:2630:2: ( RULE_ID )
            {
            // InternalGame.g:2630:2: ( RULE_ID )
            // InternalGame.g:2631:3: RULE_ID
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


    // $ANTLR start "rule__Object__PositionAssignment_9"
    // InternalGame.g:2640:1: rule__Object__PositionAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Object__PositionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2644:1: ( ( RULE_STRING ) )
            // InternalGame.g:2645:2: ( RULE_STRING )
            {
            // InternalGame.g:2645:2: ( RULE_STRING )
            // InternalGame.g:2646:3: RULE_STRING
            {
             before(grammarAccess.getObjectAccess().getPositionSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getPositionSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
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
    // InternalGame.g:2655:1: rule__Object__ActionAssignment_13 : ( ruleAction_O ) ;
    public final void rule__Object__ActionAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2659:1: ( ( ruleAction_O ) )
            // InternalGame.g:2660:2: ( ruleAction_O )
            {
            // InternalGame.g:2660:2: ( ruleAction_O )
            // InternalGame.g:2661:3: ruleAction_O
            {
             before(grammarAccess.getObjectAccess().getActionAction_OEnumRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleAction_O();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getActionAction_OEnumRuleCall_13_0()); 

            }


            }

        }
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


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\1\22\1\uffff\1\20\1\32\1\22\1\4\1\23\1\33\1\uffff";
    static final String dfa_3s = "\1\27\1\22\1\uffff\1\20\1\32\1\22\1\4\1\23\1\34\1\uffff";
    static final String dfa_4s = "\2\uffff\1\2\6\uffff\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\6\uffff\1\2\13\uffff\1\2",
            "\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11\1\2",
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
            return "()* loopback of 882:2: ( rule__LevelDefinition__PersonsAssignment_4 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000420010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800810L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000006000L});

}