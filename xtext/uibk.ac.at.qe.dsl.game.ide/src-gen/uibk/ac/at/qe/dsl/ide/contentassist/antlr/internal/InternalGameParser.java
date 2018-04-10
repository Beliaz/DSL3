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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Talk'", "'Use'", "'Inspect'", "'new'", "'{'", "'start'", "'='", "';'", "'final'", "'}'", "'level'", "'next'", "'description'", "'type'", "'response'", "'position'", "'action'", "','"
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


    // $ANTLR start "entryRuleMy_Object"
    // InternalGame.g:228:1: entryRuleMy_Object : ruleMy_Object EOF ;
    public final void entryRuleMy_Object() throws RecognitionException {
        try {
            // InternalGame.g:229:1: ( ruleMy_Object EOF )
            // InternalGame.g:230:1: ruleMy_Object EOF
            {
             before(grammarAccess.getMy_ObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleMy_Object();

            state._fsp--;

             after(grammarAccess.getMy_ObjectRule()); 
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
    // $ANTLR end "entryRuleMy_Object"


    // $ANTLR start "ruleMy_Object"
    // InternalGame.g:237:1: ruleMy_Object : ( ( rule__My_Object__Group__0 ) ) ;
    public final void ruleMy_Object() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:241:2: ( ( ( rule__My_Object__Group__0 ) ) )
            // InternalGame.g:242:2: ( ( rule__My_Object__Group__0 ) )
            {
            // InternalGame.g:242:2: ( ( rule__My_Object__Group__0 ) )
            // InternalGame.g:243:3: ( rule__My_Object__Group__0 )
            {
             before(grammarAccess.getMy_ObjectAccess().getGroup()); 
            // InternalGame.g:244:3: ( rule__My_Object__Group__0 )
            // InternalGame.g:244:4: rule__My_Object__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__My_Object__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMy_ObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMy_Object"


    // $ANTLR start "ruleAction_O"
    // InternalGame.g:253:1: ruleAction_O : ( ( rule__Action_O__Alternatives ) ) ;
    public final void ruleAction_O() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:257:1: ( ( ( rule__Action_O__Alternatives ) ) )
            // InternalGame.g:258:2: ( ( rule__Action_O__Alternatives ) )
            {
            // InternalGame.g:258:2: ( ( rule__Action_O__Alternatives ) )
            // InternalGame.g:259:3: ( rule__Action_O__Alternatives )
            {
             before(grammarAccess.getAction_OAccess().getAlternatives()); 
            // InternalGame.g:260:3: ( rule__Action_O__Alternatives )
            // InternalGame.g:260:4: rule__Action_O__Alternatives
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
    // InternalGame.g:269:1: ruleAction_P : ( ( 'Talk' ) ) ;
    public final void ruleAction_P() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:273:1: ( ( ( 'Talk' ) ) )
            // InternalGame.g:274:2: ( ( 'Talk' ) )
            {
            // InternalGame.g:274:2: ( ( 'Talk' ) )
            // InternalGame.g:275:3: ( 'Talk' )
            {
             before(grammarAccess.getAction_PAccess().getTALKEnumLiteralDeclaration()); 
            // InternalGame.g:276:3: ( 'Talk' )
            // InternalGame.g:276:4: 'Talk'
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
    // InternalGame.g:284:1: rule__Action_O__Alternatives : ( ( ( 'Use' ) ) | ( ( 'Inspect' ) ) );
    public final void rule__Action_O__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:288:1: ( ( ( 'Use' ) ) | ( ( 'Inspect' ) ) )
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
                    // InternalGame.g:289:2: ( ( 'Use' ) )
                    {
                    // InternalGame.g:289:2: ( ( 'Use' ) )
                    // InternalGame.g:290:3: ( 'Use' )
                    {
                     before(grammarAccess.getAction_OAccess().getUSEEnumLiteralDeclaration_0()); 
                    // InternalGame.g:291:3: ( 'Use' )
                    // InternalGame.g:291:4: 'Use'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAction_OAccess().getUSEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:295:2: ( ( 'Inspect' ) )
                    {
                    // InternalGame.g:295:2: ( ( 'Inspect' ) )
                    // InternalGame.g:296:3: ( 'Inspect' )
                    {
                     before(grammarAccess.getAction_OAccess().getINSPECTEnumLiteralDeclaration_1()); 
                    // InternalGame.g:297:3: ( 'Inspect' )
                    // InternalGame.g:297:4: 'Inspect'
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
    // InternalGame.g:305:1: rule__Scene__Group__0 : rule__Scene__Group__0__Impl rule__Scene__Group__1 ;
    public final void rule__Scene__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:309:1: ( rule__Scene__Group__0__Impl rule__Scene__Group__1 )
            // InternalGame.g:310:2: rule__Scene__Group__0__Impl rule__Scene__Group__1
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
    // InternalGame.g:317:1: rule__Scene__Group__0__Impl : ( 'new' ) ;
    public final void rule__Scene__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:321:1: ( ( 'new' ) )
            // InternalGame.g:322:1: ( 'new' )
            {
            // InternalGame.g:322:1: ( 'new' )
            // InternalGame.g:323:2: 'new'
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
    // InternalGame.g:332:1: rule__Scene__Group__1 : rule__Scene__Group__1__Impl rule__Scene__Group__2 ;
    public final void rule__Scene__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:336:1: ( rule__Scene__Group__1__Impl rule__Scene__Group__2 )
            // InternalGame.g:337:2: rule__Scene__Group__1__Impl rule__Scene__Group__2
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
    // InternalGame.g:344:1: rule__Scene__Group__1__Impl : ( ( rule__Scene__NameAssignment_1 ) ) ;
    public final void rule__Scene__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:348:1: ( ( ( rule__Scene__NameAssignment_1 ) ) )
            // InternalGame.g:349:1: ( ( rule__Scene__NameAssignment_1 ) )
            {
            // InternalGame.g:349:1: ( ( rule__Scene__NameAssignment_1 ) )
            // InternalGame.g:350:2: ( rule__Scene__NameAssignment_1 )
            {
             before(grammarAccess.getSceneAccess().getNameAssignment_1()); 
            // InternalGame.g:351:2: ( rule__Scene__NameAssignment_1 )
            // InternalGame.g:351:3: rule__Scene__NameAssignment_1
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
    // InternalGame.g:359:1: rule__Scene__Group__2 : rule__Scene__Group__2__Impl rule__Scene__Group__3 ;
    public final void rule__Scene__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:363:1: ( rule__Scene__Group__2__Impl rule__Scene__Group__3 )
            // InternalGame.g:364:2: rule__Scene__Group__2__Impl rule__Scene__Group__3
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
    // InternalGame.g:371:1: rule__Scene__Group__2__Impl : ( '{' ) ;
    public final void rule__Scene__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:375:1: ( ( '{' ) )
            // InternalGame.g:376:1: ( '{' )
            {
            // InternalGame.g:376:1: ( '{' )
            // InternalGame.g:377:2: '{'
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
    // InternalGame.g:386:1: rule__Scene__Group__3 : rule__Scene__Group__3__Impl rule__Scene__Group__4 ;
    public final void rule__Scene__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:390:1: ( rule__Scene__Group__3__Impl rule__Scene__Group__4 )
            // InternalGame.g:391:2: rule__Scene__Group__3__Impl rule__Scene__Group__4
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
    // InternalGame.g:398:1: rule__Scene__Group__3__Impl : ( ( rule__Scene__DeclartionsAssignment_3 )* ) ;
    public final void rule__Scene__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:402:1: ( ( ( rule__Scene__DeclartionsAssignment_3 )* ) )
            // InternalGame.g:403:1: ( ( rule__Scene__DeclartionsAssignment_3 )* )
            {
            // InternalGame.g:403:1: ( ( rule__Scene__DeclartionsAssignment_3 )* )
            // InternalGame.g:404:2: ( rule__Scene__DeclartionsAssignment_3 )*
            {
             before(grammarAccess.getSceneAccess().getDeclartionsAssignment_3()); 
            // InternalGame.g:405:2: ( rule__Scene__DeclartionsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGame.g:405:3: rule__Scene__DeclartionsAssignment_3
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
    // InternalGame.g:413:1: rule__Scene__Group__4 : rule__Scene__Group__4__Impl rule__Scene__Group__5 ;
    public final void rule__Scene__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:417:1: ( rule__Scene__Group__4__Impl rule__Scene__Group__5 )
            // InternalGame.g:418:2: rule__Scene__Group__4__Impl rule__Scene__Group__5
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
    // InternalGame.g:425:1: rule__Scene__Group__4__Impl : ( ( rule__Scene__DefinitionsAssignment_4 )* ) ;
    public final void rule__Scene__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:429:1: ( ( ( rule__Scene__DefinitionsAssignment_4 )* ) )
            // InternalGame.g:430:1: ( ( rule__Scene__DefinitionsAssignment_4 )* )
            {
            // InternalGame.g:430:1: ( ( rule__Scene__DefinitionsAssignment_4 )* )
            // InternalGame.g:431:2: ( rule__Scene__DefinitionsAssignment_4 )*
            {
             before(grammarAccess.getSceneAccess().getDefinitionsAssignment_4()); 
            // InternalGame.g:432:2: ( rule__Scene__DefinitionsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:432:3: rule__Scene__DefinitionsAssignment_4
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
    // InternalGame.g:440:1: rule__Scene__Group__5 : rule__Scene__Group__5__Impl rule__Scene__Group__6 ;
    public final void rule__Scene__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:444:1: ( rule__Scene__Group__5__Impl rule__Scene__Group__6 )
            // InternalGame.g:445:2: rule__Scene__Group__5__Impl rule__Scene__Group__6
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
    // InternalGame.g:452:1: rule__Scene__Group__5__Impl : ( 'start' ) ;
    public final void rule__Scene__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:456:1: ( ( 'start' ) )
            // InternalGame.g:457:1: ( 'start' )
            {
            // InternalGame.g:457:1: ( 'start' )
            // InternalGame.g:458:2: 'start'
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
    // InternalGame.g:467:1: rule__Scene__Group__6 : rule__Scene__Group__6__Impl rule__Scene__Group__7 ;
    public final void rule__Scene__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:471:1: ( rule__Scene__Group__6__Impl rule__Scene__Group__7 )
            // InternalGame.g:472:2: rule__Scene__Group__6__Impl rule__Scene__Group__7
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
    // InternalGame.g:479:1: rule__Scene__Group__6__Impl : ( '=' ) ;
    public final void rule__Scene__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:483:1: ( ( '=' ) )
            // InternalGame.g:484:1: ( '=' )
            {
            // InternalGame.g:484:1: ( '=' )
            // InternalGame.g:485:2: '='
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
    // InternalGame.g:494:1: rule__Scene__Group__7 : rule__Scene__Group__7__Impl rule__Scene__Group__8 ;
    public final void rule__Scene__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:498:1: ( rule__Scene__Group__7__Impl rule__Scene__Group__8 )
            // InternalGame.g:499:2: rule__Scene__Group__7__Impl rule__Scene__Group__8
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
    // InternalGame.g:506:1: rule__Scene__Group__7__Impl : ( ( rule__Scene__StartLevelAssignment_7 ) ) ;
    public final void rule__Scene__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:510:1: ( ( ( rule__Scene__StartLevelAssignment_7 ) ) )
            // InternalGame.g:511:1: ( ( rule__Scene__StartLevelAssignment_7 ) )
            {
            // InternalGame.g:511:1: ( ( rule__Scene__StartLevelAssignment_7 ) )
            // InternalGame.g:512:2: ( rule__Scene__StartLevelAssignment_7 )
            {
             before(grammarAccess.getSceneAccess().getStartLevelAssignment_7()); 
            // InternalGame.g:513:2: ( rule__Scene__StartLevelAssignment_7 )
            // InternalGame.g:513:3: rule__Scene__StartLevelAssignment_7
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
    // InternalGame.g:521:1: rule__Scene__Group__8 : rule__Scene__Group__8__Impl rule__Scene__Group__9 ;
    public final void rule__Scene__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:525:1: ( rule__Scene__Group__8__Impl rule__Scene__Group__9 )
            // InternalGame.g:526:2: rule__Scene__Group__8__Impl rule__Scene__Group__9
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
    // InternalGame.g:533:1: rule__Scene__Group__8__Impl : ( ';' ) ;
    public final void rule__Scene__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:537:1: ( ( ';' ) )
            // InternalGame.g:538:1: ( ';' )
            {
            // InternalGame.g:538:1: ( ';' )
            // InternalGame.g:539:2: ';'
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
    // InternalGame.g:548:1: rule__Scene__Group__9 : rule__Scene__Group__9__Impl rule__Scene__Group__10 ;
    public final void rule__Scene__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:552:1: ( rule__Scene__Group__9__Impl rule__Scene__Group__10 )
            // InternalGame.g:553:2: rule__Scene__Group__9__Impl rule__Scene__Group__10
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
    // InternalGame.g:560:1: rule__Scene__Group__9__Impl : ( 'final' ) ;
    public final void rule__Scene__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:564:1: ( ( 'final' ) )
            // InternalGame.g:565:1: ( 'final' )
            {
            // InternalGame.g:565:1: ( 'final' )
            // InternalGame.g:566:2: 'final'
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
    // InternalGame.g:575:1: rule__Scene__Group__10 : rule__Scene__Group__10__Impl rule__Scene__Group__11 ;
    public final void rule__Scene__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:579:1: ( rule__Scene__Group__10__Impl rule__Scene__Group__11 )
            // InternalGame.g:580:2: rule__Scene__Group__10__Impl rule__Scene__Group__11
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
    // InternalGame.g:587:1: rule__Scene__Group__10__Impl : ( '=' ) ;
    public final void rule__Scene__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:591:1: ( ( '=' ) )
            // InternalGame.g:592:1: ( '=' )
            {
            // InternalGame.g:592:1: ( '=' )
            // InternalGame.g:593:2: '='
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
    // InternalGame.g:602:1: rule__Scene__Group__11 : rule__Scene__Group__11__Impl rule__Scene__Group__12 ;
    public final void rule__Scene__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:606:1: ( rule__Scene__Group__11__Impl rule__Scene__Group__12 )
            // InternalGame.g:607:2: rule__Scene__Group__11__Impl rule__Scene__Group__12
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
    // InternalGame.g:614:1: rule__Scene__Group__11__Impl : ( ( rule__Scene__FinalLevelAssignment_11 ) ) ;
    public final void rule__Scene__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:618:1: ( ( ( rule__Scene__FinalLevelAssignment_11 ) ) )
            // InternalGame.g:619:1: ( ( rule__Scene__FinalLevelAssignment_11 ) )
            {
            // InternalGame.g:619:1: ( ( rule__Scene__FinalLevelAssignment_11 ) )
            // InternalGame.g:620:2: ( rule__Scene__FinalLevelAssignment_11 )
            {
             before(grammarAccess.getSceneAccess().getFinalLevelAssignment_11()); 
            // InternalGame.g:621:2: ( rule__Scene__FinalLevelAssignment_11 )
            // InternalGame.g:621:3: rule__Scene__FinalLevelAssignment_11
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
    // InternalGame.g:629:1: rule__Scene__Group__12 : rule__Scene__Group__12__Impl rule__Scene__Group__13 ;
    public final void rule__Scene__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:633:1: ( rule__Scene__Group__12__Impl rule__Scene__Group__13 )
            // InternalGame.g:634:2: rule__Scene__Group__12__Impl rule__Scene__Group__13
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
    // InternalGame.g:641:1: rule__Scene__Group__12__Impl : ( ';' ) ;
    public final void rule__Scene__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:645:1: ( ( ';' ) )
            // InternalGame.g:646:1: ( ';' )
            {
            // InternalGame.g:646:1: ( ';' )
            // InternalGame.g:647:2: ';'
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
    // InternalGame.g:656:1: rule__Scene__Group__13 : rule__Scene__Group__13__Impl ;
    public final void rule__Scene__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:660:1: ( rule__Scene__Group__13__Impl )
            // InternalGame.g:661:2: rule__Scene__Group__13__Impl
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
    // InternalGame.g:667:1: rule__Scene__Group__13__Impl : ( '}' ) ;
    public final void rule__Scene__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:671:1: ( ( '}' ) )
            // InternalGame.g:672:1: ( '}' )
            {
            // InternalGame.g:672:1: ( '}' )
            // InternalGame.g:673:2: '}'
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
    // InternalGame.g:683:1: rule__LevelDeclaration__Group__0 : rule__LevelDeclaration__Group__0__Impl rule__LevelDeclaration__Group__1 ;
    public final void rule__LevelDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:687:1: ( rule__LevelDeclaration__Group__0__Impl rule__LevelDeclaration__Group__1 )
            // InternalGame.g:688:2: rule__LevelDeclaration__Group__0__Impl rule__LevelDeclaration__Group__1
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
    // InternalGame.g:695:1: rule__LevelDeclaration__Group__0__Impl : ( 'level' ) ;
    public final void rule__LevelDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:699:1: ( ( 'level' ) )
            // InternalGame.g:700:1: ( 'level' )
            {
            // InternalGame.g:700:1: ( 'level' )
            // InternalGame.g:701:2: 'level'
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
    // InternalGame.g:710:1: rule__LevelDeclaration__Group__1 : rule__LevelDeclaration__Group__1__Impl rule__LevelDeclaration__Group__2 ;
    public final void rule__LevelDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:714:1: ( rule__LevelDeclaration__Group__1__Impl rule__LevelDeclaration__Group__2 )
            // InternalGame.g:715:2: rule__LevelDeclaration__Group__1__Impl rule__LevelDeclaration__Group__2
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
    // InternalGame.g:722:1: rule__LevelDeclaration__Group__1__Impl : ( ( rule__LevelDeclaration__NameAssignment_1 ) ) ;
    public final void rule__LevelDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:726:1: ( ( ( rule__LevelDeclaration__NameAssignment_1 ) ) )
            // InternalGame.g:727:1: ( ( rule__LevelDeclaration__NameAssignment_1 ) )
            {
            // InternalGame.g:727:1: ( ( rule__LevelDeclaration__NameAssignment_1 ) )
            // InternalGame.g:728:2: ( rule__LevelDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getLevelDeclarationAccess().getNameAssignment_1()); 
            // InternalGame.g:729:2: ( rule__LevelDeclaration__NameAssignment_1 )
            // InternalGame.g:729:3: rule__LevelDeclaration__NameAssignment_1
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
    // InternalGame.g:737:1: rule__LevelDeclaration__Group__2 : rule__LevelDeclaration__Group__2__Impl ;
    public final void rule__LevelDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:741:1: ( rule__LevelDeclaration__Group__2__Impl )
            // InternalGame.g:742:2: rule__LevelDeclaration__Group__2__Impl
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
    // InternalGame.g:748:1: rule__LevelDeclaration__Group__2__Impl : ( ';' ) ;
    public final void rule__LevelDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:752:1: ( ( ';' ) )
            // InternalGame.g:753:1: ( ';' )
            {
            // InternalGame.g:753:1: ( ';' )
            // InternalGame.g:754:2: ';'
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
    // InternalGame.g:764:1: rule__LevelDefinition__Group__0 : rule__LevelDefinition__Group__0__Impl rule__LevelDefinition__Group__1 ;
    public final void rule__LevelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:768:1: ( rule__LevelDefinition__Group__0__Impl rule__LevelDefinition__Group__1 )
            // InternalGame.g:769:2: rule__LevelDefinition__Group__0__Impl rule__LevelDefinition__Group__1
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
    // InternalGame.g:776:1: rule__LevelDefinition__Group__0__Impl : ( ( rule__LevelDefinition__NameAssignment_0 ) ) ;
    public final void rule__LevelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:780:1: ( ( ( rule__LevelDefinition__NameAssignment_0 ) ) )
            // InternalGame.g:781:1: ( ( rule__LevelDefinition__NameAssignment_0 ) )
            {
            // InternalGame.g:781:1: ( ( rule__LevelDefinition__NameAssignment_0 ) )
            // InternalGame.g:782:2: ( rule__LevelDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getLevelDefinitionAccess().getNameAssignment_0()); 
            // InternalGame.g:783:2: ( rule__LevelDefinition__NameAssignment_0 )
            // InternalGame.g:783:3: rule__LevelDefinition__NameAssignment_0
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
    // InternalGame.g:791:1: rule__LevelDefinition__Group__1 : rule__LevelDefinition__Group__1__Impl rule__LevelDefinition__Group__2 ;
    public final void rule__LevelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:795:1: ( rule__LevelDefinition__Group__1__Impl rule__LevelDefinition__Group__2 )
            // InternalGame.g:796:2: rule__LevelDefinition__Group__1__Impl rule__LevelDefinition__Group__2
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
    // InternalGame.g:803:1: rule__LevelDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__LevelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:807:1: ( ( '=' ) )
            // InternalGame.g:808:1: ( '=' )
            {
            // InternalGame.g:808:1: ( '=' )
            // InternalGame.g:809:2: '='
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
    // InternalGame.g:818:1: rule__LevelDefinition__Group__2 : rule__LevelDefinition__Group__2__Impl rule__LevelDefinition__Group__3 ;
    public final void rule__LevelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:822:1: ( rule__LevelDefinition__Group__2__Impl rule__LevelDefinition__Group__3 )
            // InternalGame.g:823:2: rule__LevelDefinition__Group__2__Impl rule__LevelDefinition__Group__3
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
    // InternalGame.g:830:1: rule__LevelDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__LevelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:834:1: ( ( '{' ) )
            // InternalGame.g:835:1: ( '{' )
            {
            // InternalGame.g:835:1: ( '{' )
            // InternalGame.g:836:2: '{'
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
    // InternalGame.g:845:1: rule__LevelDefinition__Group__3 : rule__LevelDefinition__Group__3__Impl rule__LevelDefinition__Group__4 ;
    public final void rule__LevelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:849:1: ( rule__LevelDefinition__Group__3__Impl rule__LevelDefinition__Group__4 )
            // InternalGame.g:850:2: rule__LevelDefinition__Group__3__Impl rule__LevelDefinition__Group__4
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
    // InternalGame.g:857:1: rule__LevelDefinition__Group__3__Impl : ( ( rule__LevelDefinition__DescriptionAssignment_3 ) ) ;
    public final void rule__LevelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:861:1: ( ( ( rule__LevelDefinition__DescriptionAssignment_3 ) ) )
            // InternalGame.g:862:1: ( ( rule__LevelDefinition__DescriptionAssignment_3 ) )
            {
            // InternalGame.g:862:1: ( ( rule__LevelDefinition__DescriptionAssignment_3 ) )
            // InternalGame.g:863:2: ( rule__LevelDefinition__DescriptionAssignment_3 )
            {
             before(grammarAccess.getLevelDefinitionAccess().getDescriptionAssignment_3()); 
            // InternalGame.g:864:2: ( rule__LevelDefinition__DescriptionAssignment_3 )
            // InternalGame.g:864:3: rule__LevelDefinition__DescriptionAssignment_3
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
    // InternalGame.g:872:1: rule__LevelDefinition__Group__4 : rule__LevelDefinition__Group__4__Impl rule__LevelDefinition__Group__5 ;
    public final void rule__LevelDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:876:1: ( rule__LevelDefinition__Group__4__Impl rule__LevelDefinition__Group__5 )
            // InternalGame.g:877:2: rule__LevelDefinition__Group__4__Impl rule__LevelDefinition__Group__5
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
    // InternalGame.g:884:1: rule__LevelDefinition__Group__4__Impl : ( ( rule__LevelDefinition__PersonsAssignment_4 )* ) ;
    public final void rule__LevelDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:888:1: ( ( ( rule__LevelDefinition__PersonsAssignment_4 )* ) )
            // InternalGame.g:889:1: ( ( rule__LevelDefinition__PersonsAssignment_4 )* )
            {
            // InternalGame.g:889:1: ( ( rule__LevelDefinition__PersonsAssignment_4 )* )
            // InternalGame.g:890:2: ( rule__LevelDefinition__PersonsAssignment_4 )*
            {
             before(grammarAccess.getLevelDefinitionAccess().getPersonsAssignment_4()); 
            // InternalGame.g:891:2: ( rule__LevelDefinition__PersonsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // InternalGame.g:891:3: rule__LevelDefinition__PersonsAssignment_4
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
    // InternalGame.g:899:1: rule__LevelDefinition__Group__5 : rule__LevelDefinition__Group__5__Impl rule__LevelDefinition__Group__6 ;
    public final void rule__LevelDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:903:1: ( rule__LevelDefinition__Group__5__Impl rule__LevelDefinition__Group__6 )
            // InternalGame.g:904:2: rule__LevelDefinition__Group__5__Impl rule__LevelDefinition__Group__6
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
    // InternalGame.g:911:1: rule__LevelDefinition__Group__5__Impl : ( ( rule__LevelDefinition__ObjectsAssignment_5 )* ) ;
    public final void rule__LevelDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:915:1: ( ( ( rule__LevelDefinition__ObjectsAssignment_5 )* ) )
            // InternalGame.g:916:1: ( ( rule__LevelDefinition__ObjectsAssignment_5 )* )
            {
            // InternalGame.g:916:1: ( ( rule__LevelDefinition__ObjectsAssignment_5 )* )
            // InternalGame.g:917:2: ( rule__LevelDefinition__ObjectsAssignment_5 )*
            {
             before(grammarAccess.getLevelDefinitionAccess().getObjectsAssignment_5()); 
            // InternalGame.g:918:2: ( rule__LevelDefinition__ObjectsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGame.g:918:3: rule__LevelDefinition__ObjectsAssignment_5
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
    // InternalGame.g:926:1: rule__LevelDefinition__Group__6 : rule__LevelDefinition__Group__6__Impl rule__LevelDefinition__Group__7 ;
    public final void rule__LevelDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:930:1: ( rule__LevelDefinition__Group__6__Impl rule__LevelDefinition__Group__7 )
            // InternalGame.g:931:2: rule__LevelDefinition__Group__6__Impl rule__LevelDefinition__Group__7
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
    // InternalGame.g:938:1: rule__LevelDefinition__Group__6__Impl : ( ( rule__LevelDefinition__Group_6__0 )? ) ;
    public final void rule__LevelDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:942:1: ( ( ( rule__LevelDefinition__Group_6__0 )? ) )
            // InternalGame.g:943:1: ( ( rule__LevelDefinition__Group_6__0 )? )
            {
            // InternalGame.g:943:1: ( ( rule__LevelDefinition__Group_6__0 )? )
            // InternalGame.g:944:2: ( rule__LevelDefinition__Group_6__0 )?
            {
             before(grammarAccess.getLevelDefinitionAccess().getGroup_6()); 
            // InternalGame.g:945:2: ( rule__LevelDefinition__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGame.g:945:3: rule__LevelDefinition__Group_6__0
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
    // InternalGame.g:953:1: rule__LevelDefinition__Group__7 : rule__LevelDefinition__Group__7__Impl ;
    public final void rule__LevelDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:957:1: ( rule__LevelDefinition__Group__7__Impl )
            // InternalGame.g:958:2: rule__LevelDefinition__Group__7__Impl
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
    // InternalGame.g:964:1: rule__LevelDefinition__Group__7__Impl : ( '}' ) ;
    public final void rule__LevelDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:968:1: ( ( '}' ) )
            // InternalGame.g:969:1: ( '}' )
            {
            // InternalGame.g:969:1: ( '}' )
            // InternalGame.g:970:2: '}'
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
    // InternalGame.g:980:1: rule__LevelDefinition__Group_6__0 : rule__LevelDefinition__Group_6__0__Impl rule__LevelDefinition__Group_6__1 ;
    public final void rule__LevelDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:984:1: ( rule__LevelDefinition__Group_6__0__Impl rule__LevelDefinition__Group_6__1 )
            // InternalGame.g:985:2: rule__LevelDefinition__Group_6__0__Impl rule__LevelDefinition__Group_6__1
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
    // InternalGame.g:992:1: rule__LevelDefinition__Group_6__0__Impl : ( 'next' ) ;
    public final void rule__LevelDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:996:1: ( ( 'next' ) )
            // InternalGame.g:997:1: ( 'next' )
            {
            // InternalGame.g:997:1: ( 'next' )
            // InternalGame.g:998:2: 'next'
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
    // InternalGame.g:1007:1: rule__LevelDefinition__Group_6__1 : rule__LevelDefinition__Group_6__1__Impl rule__LevelDefinition__Group_6__2 ;
    public final void rule__LevelDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1011:1: ( rule__LevelDefinition__Group_6__1__Impl rule__LevelDefinition__Group_6__2 )
            // InternalGame.g:1012:2: rule__LevelDefinition__Group_6__1__Impl rule__LevelDefinition__Group_6__2
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
    // InternalGame.g:1019:1: rule__LevelDefinition__Group_6__1__Impl : ( '=' ) ;
    public final void rule__LevelDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1023:1: ( ( '=' ) )
            // InternalGame.g:1024:1: ( '=' )
            {
            // InternalGame.g:1024:1: ( '=' )
            // InternalGame.g:1025:2: '='
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
    // InternalGame.g:1034:1: rule__LevelDefinition__Group_6__2 : rule__LevelDefinition__Group_6__2__Impl rule__LevelDefinition__Group_6__3 ;
    public final void rule__LevelDefinition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1038:1: ( rule__LevelDefinition__Group_6__2__Impl rule__LevelDefinition__Group_6__3 )
            // InternalGame.g:1039:2: rule__LevelDefinition__Group_6__2__Impl rule__LevelDefinition__Group_6__3
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
    // InternalGame.g:1046:1: rule__LevelDefinition__Group_6__2__Impl : ( ( rule__LevelDefinition__NextAssignment_6_2 ) ) ;
    public final void rule__LevelDefinition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1050:1: ( ( ( rule__LevelDefinition__NextAssignment_6_2 ) ) )
            // InternalGame.g:1051:1: ( ( rule__LevelDefinition__NextAssignment_6_2 ) )
            {
            // InternalGame.g:1051:1: ( ( rule__LevelDefinition__NextAssignment_6_2 ) )
            // InternalGame.g:1052:2: ( rule__LevelDefinition__NextAssignment_6_2 )
            {
             before(grammarAccess.getLevelDefinitionAccess().getNextAssignment_6_2()); 
            // InternalGame.g:1053:2: ( rule__LevelDefinition__NextAssignment_6_2 )
            // InternalGame.g:1053:3: rule__LevelDefinition__NextAssignment_6_2
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
    // InternalGame.g:1061:1: rule__LevelDefinition__Group_6__3 : rule__LevelDefinition__Group_6__3__Impl ;
    public final void rule__LevelDefinition__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1065:1: ( rule__LevelDefinition__Group_6__3__Impl )
            // InternalGame.g:1066:2: rule__LevelDefinition__Group_6__3__Impl
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
    // InternalGame.g:1072:1: rule__LevelDefinition__Group_6__3__Impl : ( ';' ) ;
    public final void rule__LevelDefinition__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1076:1: ( ( ';' ) )
            // InternalGame.g:1077:1: ( ';' )
            {
            // InternalGame.g:1077:1: ( ';' )
            // InternalGame.g:1078:2: ';'
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
    // InternalGame.g:1088:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1092:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalGame.g:1093:2: rule__Description__Group__0__Impl rule__Description__Group__1
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
    // InternalGame.g:1100:1: rule__Description__Group__0__Impl : ( 'description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1104:1: ( ( 'description' ) )
            // InternalGame.g:1105:1: ( 'description' )
            {
            // InternalGame.g:1105:1: ( 'description' )
            // InternalGame.g:1106:2: 'description'
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
    // InternalGame.g:1115:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1119:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // InternalGame.g:1120:2: rule__Description__Group__1__Impl rule__Description__Group__2
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
    // InternalGame.g:1127:1: rule__Description__Group__1__Impl : ( '=' ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1131:1: ( ( '=' ) )
            // InternalGame.g:1132:1: ( '=' )
            {
            // InternalGame.g:1132:1: ( '=' )
            // InternalGame.g:1133:2: '='
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
    // InternalGame.g:1142:1: rule__Description__Group__2 : rule__Description__Group__2__Impl rule__Description__Group__3 ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1146:1: ( rule__Description__Group__2__Impl rule__Description__Group__3 )
            // InternalGame.g:1147:2: rule__Description__Group__2__Impl rule__Description__Group__3
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
    // InternalGame.g:1154:1: rule__Description__Group__2__Impl : ( ( rule__Description__NameAssignment_2 ) ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1158:1: ( ( ( rule__Description__NameAssignment_2 ) ) )
            // InternalGame.g:1159:1: ( ( rule__Description__NameAssignment_2 ) )
            {
            // InternalGame.g:1159:1: ( ( rule__Description__NameAssignment_2 ) )
            // InternalGame.g:1160:2: ( rule__Description__NameAssignment_2 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_2()); 
            // InternalGame.g:1161:2: ( rule__Description__NameAssignment_2 )
            // InternalGame.g:1161:3: rule__Description__NameAssignment_2
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
    // InternalGame.g:1169:1: rule__Description__Group__3 : rule__Description__Group__3__Impl ;
    public final void rule__Description__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1173:1: ( rule__Description__Group__3__Impl )
            // InternalGame.g:1174:2: rule__Description__Group__3__Impl
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
    // InternalGame.g:1180:1: rule__Description__Group__3__Impl : ( ';' ) ;
    public final void rule__Description__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1184:1: ( ( ';' ) )
            // InternalGame.g:1185:1: ( ';' )
            {
            // InternalGame.g:1185:1: ( ';' )
            // InternalGame.g:1186:2: ';'
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
    // InternalGame.g:1196:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1200:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalGame.g:1201:2: rule__Person__Group__0__Impl rule__Person__Group__1
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
    // InternalGame.g:1208:1: rule__Person__Group__0__Impl : ( ( rule__Person__NameAssignment_0 ) ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1212:1: ( ( ( rule__Person__NameAssignment_0 ) ) )
            // InternalGame.g:1213:1: ( ( rule__Person__NameAssignment_0 ) )
            {
            // InternalGame.g:1213:1: ( ( rule__Person__NameAssignment_0 ) )
            // InternalGame.g:1214:2: ( rule__Person__NameAssignment_0 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_0()); 
            // InternalGame.g:1215:2: ( rule__Person__NameAssignment_0 )
            // InternalGame.g:1215:3: rule__Person__NameAssignment_0
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
    // InternalGame.g:1223:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1227:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalGame.g:1228:2: rule__Person__Group__1__Impl rule__Person__Group__2
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
    // InternalGame.g:1235:1: rule__Person__Group__1__Impl : ( '=' ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1239:1: ( ( '=' ) )
            // InternalGame.g:1240:1: ( '=' )
            {
            // InternalGame.g:1240:1: ( '=' )
            // InternalGame.g:1241:2: '='
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
    // InternalGame.g:1250:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1254:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalGame.g:1255:2: rule__Person__Group__2__Impl rule__Person__Group__3
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
    // InternalGame.g:1262:1: rule__Person__Group__2__Impl : ( '{' ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1266:1: ( ( '{' ) )
            // InternalGame.g:1267:1: ( '{' )
            {
            // InternalGame.g:1267:1: ( '{' )
            // InternalGame.g:1268:2: '{'
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
    // InternalGame.g:1277:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1281:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalGame.g:1282:2: rule__Person__Group__3__Impl rule__Person__Group__4
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
    // InternalGame.g:1289:1: rule__Person__Group__3__Impl : ( 'type' ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1293:1: ( ( 'type' ) )
            // InternalGame.g:1294:1: ( 'type' )
            {
            // InternalGame.g:1294:1: ( 'type' )
            // InternalGame.g:1295:2: 'type'
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
    // InternalGame.g:1304:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1308:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // InternalGame.g:1309:2: rule__Person__Group__4__Impl rule__Person__Group__5
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
    // InternalGame.g:1316:1: rule__Person__Group__4__Impl : ( '=' ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1320:1: ( ( '=' ) )
            // InternalGame.g:1321:1: ( '=' )
            {
            // InternalGame.g:1321:1: ( '=' )
            // InternalGame.g:1322:2: '='
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
    // InternalGame.g:1331:1: rule__Person__Group__5 : rule__Person__Group__5__Impl rule__Person__Group__6 ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1335:1: ( rule__Person__Group__5__Impl rule__Person__Group__6 )
            // InternalGame.g:1336:2: rule__Person__Group__5__Impl rule__Person__Group__6
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
    // InternalGame.g:1343:1: rule__Person__Group__5__Impl : ( ( rule__Person__TypeAssignment_5 ) ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1347:1: ( ( ( rule__Person__TypeAssignment_5 ) ) )
            // InternalGame.g:1348:1: ( ( rule__Person__TypeAssignment_5 ) )
            {
            // InternalGame.g:1348:1: ( ( rule__Person__TypeAssignment_5 ) )
            // InternalGame.g:1349:2: ( rule__Person__TypeAssignment_5 )
            {
             before(grammarAccess.getPersonAccess().getTypeAssignment_5()); 
            // InternalGame.g:1350:2: ( rule__Person__TypeAssignment_5 )
            // InternalGame.g:1350:3: rule__Person__TypeAssignment_5
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
    // InternalGame.g:1358:1: rule__Person__Group__6 : rule__Person__Group__6__Impl rule__Person__Group__7 ;
    public final void rule__Person__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1362:1: ( rule__Person__Group__6__Impl rule__Person__Group__7 )
            // InternalGame.g:1363:2: rule__Person__Group__6__Impl rule__Person__Group__7
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
    // InternalGame.g:1370:1: rule__Person__Group__6__Impl : ( ';' ) ;
    public final void rule__Person__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1374:1: ( ( ';' ) )
            // InternalGame.g:1375:1: ( ';' )
            {
            // InternalGame.g:1375:1: ( ';' )
            // InternalGame.g:1376:2: ';'
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
    // InternalGame.g:1385:1: rule__Person__Group__7 : rule__Person__Group__7__Impl rule__Person__Group__8 ;
    public final void rule__Person__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1389:1: ( rule__Person__Group__7__Impl rule__Person__Group__8 )
            // InternalGame.g:1390:2: rule__Person__Group__7__Impl rule__Person__Group__8
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
    // InternalGame.g:1397:1: rule__Person__Group__7__Impl : ( 'response' ) ;
    public final void rule__Person__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1401:1: ( ( 'response' ) )
            // InternalGame.g:1402:1: ( 'response' )
            {
            // InternalGame.g:1402:1: ( 'response' )
            // InternalGame.g:1403:2: 'response'
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
    // InternalGame.g:1412:1: rule__Person__Group__8 : rule__Person__Group__8__Impl rule__Person__Group__9 ;
    public final void rule__Person__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1416:1: ( rule__Person__Group__8__Impl rule__Person__Group__9 )
            // InternalGame.g:1417:2: rule__Person__Group__8__Impl rule__Person__Group__9
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
    // InternalGame.g:1424:1: rule__Person__Group__8__Impl : ( '{' ) ;
    public final void rule__Person__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1428:1: ( ( '{' ) )
            // InternalGame.g:1429:1: ( '{' )
            {
            // InternalGame.g:1429:1: ( '{' )
            // InternalGame.g:1430:2: '{'
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
    // InternalGame.g:1439:1: rule__Person__Group__9 : rule__Person__Group__9__Impl rule__Person__Group__10 ;
    public final void rule__Person__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1443:1: ( rule__Person__Group__9__Impl rule__Person__Group__10 )
            // InternalGame.g:1444:2: rule__Person__Group__9__Impl rule__Person__Group__10
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
    // InternalGame.g:1451:1: rule__Person__Group__9__Impl : ( ( rule__Person__ResponseAssignment_9 )* ) ;
    public final void rule__Person__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1455:1: ( ( ( rule__Person__ResponseAssignment_9 )* ) )
            // InternalGame.g:1456:1: ( ( rule__Person__ResponseAssignment_9 )* )
            {
            // InternalGame.g:1456:1: ( ( rule__Person__ResponseAssignment_9 )* )
            // InternalGame.g:1457:2: ( rule__Person__ResponseAssignment_9 )*
            {
             before(grammarAccess.getPersonAccess().getResponseAssignment_9()); 
            // InternalGame.g:1458:2: ( rule__Person__ResponseAssignment_9 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGame.g:1458:3: rule__Person__ResponseAssignment_9
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
    // InternalGame.g:1466:1: rule__Person__Group__10 : rule__Person__Group__10__Impl rule__Person__Group__11 ;
    public final void rule__Person__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1470:1: ( rule__Person__Group__10__Impl rule__Person__Group__11 )
            // InternalGame.g:1471:2: rule__Person__Group__10__Impl rule__Person__Group__11
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
    // InternalGame.g:1478:1: rule__Person__Group__10__Impl : ( '}' ) ;
    public final void rule__Person__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1482:1: ( ( '}' ) )
            // InternalGame.g:1483:1: ( '}' )
            {
            // InternalGame.g:1483:1: ( '}' )
            // InternalGame.g:1484:2: '}'
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
    // InternalGame.g:1493:1: rule__Person__Group__11 : rule__Person__Group__11__Impl rule__Person__Group__12 ;
    public final void rule__Person__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1497:1: ( rule__Person__Group__11__Impl rule__Person__Group__12 )
            // InternalGame.g:1498:2: rule__Person__Group__11__Impl rule__Person__Group__12
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
    // InternalGame.g:1505:1: rule__Person__Group__11__Impl : ( 'position' ) ;
    public final void rule__Person__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1509:1: ( ( 'position' ) )
            // InternalGame.g:1510:1: ( 'position' )
            {
            // InternalGame.g:1510:1: ( 'position' )
            // InternalGame.g:1511:2: 'position'
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
    // InternalGame.g:1520:1: rule__Person__Group__12 : rule__Person__Group__12__Impl rule__Person__Group__13 ;
    public final void rule__Person__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1524:1: ( rule__Person__Group__12__Impl rule__Person__Group__13 )
            // InternalGame.g:1525:2: rule__Person__Group__12__Impl rule__Person__Group__13
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
    // InternalGame.g:1532:1: rule__Person__Group__12__Impl : ( '=' ) ;
    public final void rule__Person__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1536:1: ( ( '=' ) )
            // InternalGame.g:1537:1: ( '=' )
            {
            // InternalGame.g:1537:1: ( '=' )
            // InternalGame.g:1538:2: '='
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
    // InternalGame.g:1547:1: rule__Person__Group__13 : rule__Person__Group__13__Impl rule__Person__Group__14 ;
    public final void rule__Person__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1551:1: ( rule__Person__Group__13__Impl rule__Person__Group__14 )
            // InternalGame.g:1552:2: rule__Person__Group__13__Impl rule__Person__Group__14
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
    // InternalGame.g:1559:1: rule__Person__Group__13__Impl : ( ( rule__Person__PositionAssignment_13 ) ) ;
    public final void rule__Person__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1563:1: ( ( ( rule__Person__PositionAssignment_13 ) ) )
            // InternalGame.g:1564:1: ( ( rule__Person__PositionAssignment_13 ) )
            {
            // InternalGame.g:1564:1: ( ( rule__Person__PositionAssignment_13 ) )
            // InternalGame.g:1565:2: ( rule__Person__PositionAssignment_13 )
            {
             before(grammarAccess.getPersonAccess().getPositionAssignment_13()); 
            // InternalGame.g:1566:2: ( rule__Person__PositionAssignment_13 )
            // InternalGame.g:1566:3: rule__Person__PositionAssignment_13
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
    // InternalGame.g:1574:1: rule__Person__Group__14 : rule__Person__Group__14__Impl rule__Person__Group__15 ;
    public final void rule__Person__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1578:1: ( rule__Person__Group__14__Impl rule__Person__Group__15 )
            // InternalGame.g:1579:2: rule__Person__Group__14__Impl rule__Person__Group__15
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
    // InternalGame.g:1586:1: rule__Person__Group__14__Impl : ( ';' ) ;
    public final void rule__Person__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1590:1: ( ( ';' ) )
            // InternalGame.g:1591:1: ( ';' )
            {
            // InternalGame.g:1591:1: ( ';' )
            // InternalGame.g:1592:2: ';'
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
    // InternalGame.g:1601:1: rule__Person__Group__15 : rule__Person__Group__15__Impl rule__Person__Group__16 ;
    public final void rule__Person__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1605:1: ( rule__Person__Group__15__Impl rule__Person__Group__16 )
            // InternalGame.g:1606:2: rule__Person__Group__15__Impl rule__Person__Group__16
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
    // InternalGame.g:1613:1: rule__Person__Group__15__Impl : ( 'action' ) ;
    public final void rule__Person__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1617:1: ( ( 'action' ) )
            // InternalGame.g:1618:1: ( 'action' )
            {
            // InternalGame.g:1618:1: ( 'action' )
            // InternalGame.g:1619:2: 'action'
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
    // InternalGame.g:1628:1: rule__Person__Group__16 : rule__Person__Group__16__Impl rule__Person__Group__17 ;
    public final void rule__Person__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1632:1: ( rule__Person__Group__16__Impl rule__Person__Group__17 )
            // InternalGame.g:1633:2: rule__Person__Group__16__Impl rule__Person__Group__17
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
    // InternalGame.g:1640:1: rule__Person__Group__16__Impl : ( '=' ) ;
    public final void rule__Person__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1644:1: ( ( '=' ) )
            // InternalGame.g:1645:1: ( '=' )
            {
            // InternalGame.g:1645:1: ( '=' )
            // InternalGame.g:1646:2: '='
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
    // InternalGame.g:1655:1: rule__Person__Group__17 : rule__Person__Group__17__Impl rule__Person__Group__18 ;
    public final void rule__Person__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1659:1: ( rule__Person__Group__17__Impl rule__Person__Group__18 )
            // InternalGame.g:1660:2: rule__Person__Group__17__Impl rule__Person__Group__18
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
    // InternalGame.g:1667:1: rule__Person__Group__17__Impl : ( ( rule__Person__ActionAssignment_17 ) ) ;
    public final void rule__Person__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1671:1: ( ( ( rule__Person__ActionAssignment_17 ) ) )
            // InternalGame.g:1672:1: ( ( rule__Person__ActionAssignment_17 ) )
            {
            // InternalGame.g:1672:1: ( ( rule__Person__ActionAssignment_17 ) )
            // InternalGame.g:1673:2: ( rule__Person__ActionAssignment_17 )
            {
             before(grammarAccess.getPersonAccess().getActionAssignment_17()); 
            // InternalGame.g:1674:2: ( rule__Person__ActionAssignment_17 )
            // InternalGame.g:1674:3: rule__Person__ActionAssignment_17
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
    // InternalGame.g:1682:1: rule__Person__Group__18 : rule__Person__Group__18__Impl rule__Person__Group__19 ;
    public final void rule__Person__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1686:1: ( rule__Person__Group__18__Impl rule__Person__Group__19 )
            // InternalGame.g:1687:2: rule__Person__Group__18__Impl rule__Person__Group__19
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
    // InternalGame.g:1694:1: rule__Person__Group__18__Impl : ( ';' ) ;
    public final void rule__Person__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1698:1: ( ( ';' ) )
            // InternalGame.g:1699:1: ( ';' )
            {
            // InternalGame.g:1699:1: ( ';' )
            // InternalGame.g:1700:2: ';'
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
    // InternalGame.g:1709:1: rule__Person__Group__19 : rule__Person__Group__19__Impl rule__Person__Group__20 ;
    public final void rule__Person__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1713:1: ( rule__Person__Group__19__Impl rule__Person__Group__20 )
            // InternalGame.g:1714:2: rule__Person__Group__19__Impl rule__Person__Group__20
            {
            pushFollow(FOLLOW_23);
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
    // InternalGame.g:1721:1: rule__Person__Group__19__Impl : ( ( rule__Person__Group_19__0 )? ) ;
    public final void rule__Person__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1725:1: ( ( ( rule__Person__Group_19__0 )? ) )
            // InternalGame.g:1726:1: ( ( rule__Person__Group_19__0 )? )
            {
            // InternalGame.g:1726:1: ( ( rule__Person__Group_19__0 )? )
            // InternalGame.g:1727:2: ( rule__Person__Group_19__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_19()); 
            // InternalGame.g:1728:2: ( rule__Person__Group_19__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGame.g:1728:3: rule__Person__Group_19__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Person__Group_19__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonAccess().getGroup_19()); 

            }


            }

        }
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
    // InternalGame.g:1736:1: rule__Person__Group__20 : rule__Person__Group__20__Impl ;
    public final void rule__Person__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1740:1: ( rule__Person__Group__20__Impl )
            // InternalGame.g:1741:2: rule__Person__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__20__Impl();

            state._fsp--;


            }

        }
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
    // InternalGame.g:1747:1: rule__Person__Group__20__Impl : ( '}' ) ;
    public final void rule__Person__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1751:1: ( ( '}' ) )
            // InternalGame.g:1752:1: ( '}' )
            {
            // InternalGame.g:1752:1: ( '}' )
            // InternalGame.g:1753:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_20()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_20()); 

            }


            }

        }
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


    // $ANTLR start "rule__Person__Group_19__0"
    // InternalGame.g:1763:1: rule__Person__Group_19__0 : rule__Person__Group_19__0__Impl rule__Person__Group_19__1 ;
    public final void rule__Person__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1767:1: ( rule__Person__Group_19__0__Impl rule__Person__Group_19__1 )
            // InternalGame.g:1768:2: rule__Person__Group_19__0__Impl rule__Person__Group_19__1
            {
            pushFollow(FOLLOW_9);
            rule__Person__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_19__0"


    // $ANTLR start "rule__Person__Group_19__0__Impl"
    // InternalGame.g:1775:1: rule__Person__Group_19__0__Impl : ( 'final' ) ;
    public final void rule__Person__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1779:1: ( ( 'final' ) )
            // InternalGame.g:1780:1: ( 'final' )
            {
            // InternalGame.g:1780:1: ( 'final' )
            // InternalGame.g:1781:2: 'final'
            {
             before(grammarAccess.getPersonAccess().getFinalKeyword_19_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getFinalKeyword_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_19__0__Impl"


    // $ANTLR start "rule__Person__Group_19__1"
    // InternalGame.g:1790:1: rule__Person__Group_19__1 : rule__Person__Group_19__1__Impl rule__Person__Group_19__2 ;
    public final void rule__Person__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1794:1: ( rule__Person__Group_19__1__Impl rule__Person__Group_19__2 )
            // InternalGame.g:1795:2: rule__Person__Group_19__1__Impl rule__Person__Group_19__2
            {
            pushFollow(FOLLOW_4);
            rule__Person__Group_19__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_19__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_19__1"


    // $ANTLR start "rule__Person__Group_19__1__Impl"
    // InternalGame.g:1802:1: rule__Person__Group_19__1__Impl : ( '=' ) ;
    public final void rule__Person__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1806:1: ( ( '=' ) )
            // InternalGame.g:1807:1: ( '=' )
            {
            // InternalGame.g:1807:1: ( '=' )
            // InternalGame.g:1808:2: '='
            {
             before(grammarAccess.getPersonAccess().getEqualsSignKeyword_19_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getEqualsSignKeyword_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_19__1__Impl"


    // $ANTLR start "rule__Person__Group_19__2"
    // InternalGame.g:1817:1: rule__Person__Group_19__2 : rule__Person__Group_19__2__Impl rule__Person__Group_19__3 ;
    public final void rule__Person__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1821:1: ( rule__Person__Group_19__2__Impl rule__Person__Group_19__3 )
            // InternalGame.g:1822:2: rule__Person__Group_19__2__Impl rule__Person__Group_19__3
            {
            pushFollow(FOLLOW_10);
            rule__Person__Group_19__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_19__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_19__2"


    // $ANTLR start "rule__Person__Group_19__2__Impl"
    // InternalGame.g:1829:1: rule__Person__Group_19__2__Impl : ( ( rule__Person__FinalObjectAssignment_19_2 ) ) ;
    public final void rule__Person__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1833:1: ( ( ( rule__Person__FinalObjectAssignment_19_2 ) ) )
            // InternalGame.g:1834:1: ( ( rule__Person__FinalObjectAssignment_19_2 ) )
            {
            // InternalGame.g:1834:1: ( ( rule__Person__FinalObjectAssignment_19_2 ) )
            // InternalGame.g:1835:2: ( rule__Person__FinalObjectAssignment_19_2 )
            {
             before(grammarAccess.getPersonAccess().getFinalObjectAssignment_19_2()); 
            // InternalGame.g:1836:2: ( rule__Person__FinalObjectAssignment_19_2 )
            // InternalGame.g:1836:3: rule__Person__FinalObjectAssignment_19_2
            {
            pushFollow(FOLLOW_2);
            rule__Person__FinalObjectAssignment_19_2();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getFinalObjectAssignment_19_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_19__2__Impl"


    // $ANTLR start "rule__Person__Group_19__3"
    // InternalGame.g:1844:1: rule__Person__Group_19__3 : rule__Person__Group_19__3__Impl ;
    public final void rule__Person__Group_19__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1848:1: ( rule__Person__Group_19__3__Impl )
            // InternalGame.g:1849:2: rule__Person__Group_19__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group_19__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_19__3"


    // $ANTLR start "rule__Person__Group_19__3__Impl"
    // InternalGame.g:1855:1: rule__Person__Group_19__3__Impl : ( ';' ) ;
    public final void rule__Person__Group_19__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1859:1: ( ( ';' ) )
            // InternalGame.g:1860:1: ( ';' )
            {
            // InternalGame.g:1860:1: ( ';' )
            // InternalGame.g:1861:2: ';'
            {
             before(grammarAccess.getPersonAccess().getSemicolonKeyword_19_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getSemicolonKeyword_19_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_19__3__Impl"


    // $ANTLR start "rule__Person_R__Group__0"
    // InternalGame.g:1871:1: rule__Person_R__Group__0 : rule__Person_R__Group__0__Impl rule__Person_R__Group__1 ;
    public final void rule__Person_R__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1875:1: ( rule__Person_R__Group__0__Impl rule__Person_R__Group__1 )
            // InternalGame.g:1876:2: rule__Person_R__Group__0__Impl rule__Person_R__Group__1
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
    // InternalGame.g:1883:1: rule__Person_R__Group__0__Impl : ( ( rule__Person_R__ItemAssignment_0 ) ) ;
    public final void rule__Person_R__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1887:1: ( ( ( rule__Person_R__ItemAssignment_0 ) ) )
            // InternalGame.g:1888:1: ( ( rule__Person_R__ItemAssignment_0 ) )
            {
            // InternalGame.g:1888:1: ( ( rule__Person_R__ItemAssignment_0 ) )
            // InternalGame.g:1889:2: ( rule__Person_R__ItemAssignment_0 )
            {
             before(grammarAccess.getPerson_RAccess().getItemAssignment_0()); 
            // InternalGame.g:1890:2: ( rule__Person_R__ItemAssignment_0 )
            // InternalGame.g:1890:3: rule__Person_R__ItemAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Person_R__ItemAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPerson_RAccess().getItemAssignment_0()); 

            }


            }

        }
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
    // InternalGame.g:1898:1: rule__Person_R__Group__1 : rule__Person_R__Group__1__Impl ;
    public final void rule__Person_R__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1902:1: ( rule__Person_R__Group__1__Impl )
            // InternalGame.g:1903:2: rule__Person_R__Group__1__Impl
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
    // InternalGame.g:1909:1: rule__Person_R__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__Person_R__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1913:1: ( ( ( ',' )? ) )
            // InternalGame.g:1914:1: ( ( ',' )? )
            {
            // InternalGame.g:1914:1: ( ( ',' )? )
            // InternalGame.g:1915:2: ( ',' )?
            {
             before(grammarAccess.getPerson_RAccess().getCommaKeyword_1()); 
            // InternalGame.g:1916:2: ( ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGame.g:1916:3: ','
                    {
                    match(input,28,FOLLOW_2); 

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


    // $ANTLR start "rule__My_Object__Group__0"
    // InternalGame.g:1925:1: rule__My_Object__Group__0 : rule__My_Object__Group__0__Impl rule__My_Object__Group__1 ;
    public final void rule__My_Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1929:1: ( rule__My_Object__Group__0__Impl rule__My_Object__Group__1 )
            // InternalGame.g:1930:2: rule__My_Object__Group__0__Impl rule__My_Object__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__My_Object__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__My_Object__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__0"


    // $ANTLR start "rule__My_Object__Group__0__Impl"
    // InternalGame.g:1937:1: rule__My_Object__Group__0__Impl : ( ( rule__My_Object__NameAssignment_0 ) ) ;
    public final void rule__My_Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1941:1: ( ( ( rule__My_Object__NameAssignment_0 ) ) )
            // InternalGame.g:1942:1: ( ( rule__My_Object__NameAssignment_0 ) )
            {
            // InternalGame.g:1942:1: ( ( rule__My_Object__NameAssignment_0 ) )
            // InternalGame.g:1943:2: ( rule__My_Object__NameAssignment_0 )
            {
             before(grammarAccess.getMy_ObjectAccess().getNameAssignment_0()); 
            // InternalGame.g:1944:2: ( rule__My_Object__NameAssignment_0 )
            // InternalGame.g:1944:3: rule__My_Object__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__My_Object__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMy_ObjectAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__0__Impl"


    // $ANTLR start "rule__My_Object__Group__1"
    // InternalGame.g:1952:1: rule__My_Object__Group__1 : rule__My_Object__Group__1__Impl rule__My_Object__Group__2 ;
    public final void rule__My_Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1956:1: ( rule__My_Object__Group__1__Impl rule__My_Object__Group__2 )
            // InternalGame.g:1957:2: rule__My_Object__Group__1__Impl rule__My_Object__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__My_Object__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__My_Object__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__1"


    // $ANTLR start "rule__My_Object__Group__1__Impl"
    // InternalGame.g:1964:1: rule__My_Object__Group__1__Impl : ( '=' ) ;
    public final void rule__My_Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1968:1: ( ( '=' ) )
            // InternalGame.g:1969:1: ( '=' )
            {
            // InternalGame.g:1969:1: ( '=' )
            // InternalGame.g:1970:2: '='
            {
             before(grammarAccess.getMy_ObjectAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMy_ObjectAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__1__Impl"


    // $ANTLR start "rule__My_Object__Group__2"
    // InternalGame.g:1979:1: rule__My_Object__Group__2 : rule__My_Object__Group__2__Impl rule__My_Object__Group__3 ;
    public final void rule__My_Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1983:1: ( rule__My_Object__Group__2__Impl rule__My_Object__Group__3 )
            // InternalGame.g:1984:2: rule__My_Object__Group__2__Impl rule__My_Object__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__My_Object__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__My_Object__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__2"


    // $ANTLR start "rule__My_Object__Group__2__Impl"
    // InternalGame.g:1991:1: rule__My_Object__Group__2__Impl : ( '{' ) ;
    public final void rule__My_Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:1995:1: ( ( '{' ) )
            // InternalGame.g:1996:1: ( '{' )
            {
            // InternalGame.g:1996:1: ( '{' )
            // InternalGame.g:1997:2: '{'
            {
             before(grammarAccess.getMy_ObjectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMy_ObjectAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__2__Impl"


    // $ANTLR start "rule__My_Object__Group__3"
    // InternalGame.g:2006:1: rule__My_Object__Group__3 : rule__My_Object__Group__3__Impl rule__My_Object__Group__4 ;
    public final void rule__My_Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2010:1: ( rule__My_Object__Group__3__Impl rule__My_Object__Group__4 )
            // InternalGame.g:2011:2: rule__My_Object__Group__3__Impl rule__My_Object__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__My_Object__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__My_Object__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__3"


    // $ANTLR start "rule__My_Object__Group__3__Impl"
    // InternalGame.g:2018:1: rule__My_Object__Group__3__Impl : ( 'type' ) ;
    public final void rule__My_Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2022:1: ( ( 'type' ) )
            // InternalGame.g:2023:1: ( 'type' )
            {
            // InternalGame.g:2023:1: ( 'type' )
            // InternalGame.g:2024:2: 'type'
            {
             before(grammarAccess.getMy_ObjectAccess().getTypeKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMy_ObjectAccess().getTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__3__Impl"


    // $ANTLR start "rule__My_Object__Group__4"
    // InternalGame.g:2033:1: rule__My_Object__Group__4 : rule__My_Object__Group__4__Impl rule__My_Object__Group__5 ;
    public final void rule__My_Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2037:1: ( rule__My_Object__Group__4__Impl rule__My_Object__Group__5 )
            // InternalGame.g:2038:2: rule__My_Object__Group__4__Impl rule__My_Object__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__My_Object__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__My_Object__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__4"


    // $ANTLR start "rule__My_Object__Group__4__Impl"
    // InternalGame.g:2045:1: rule__My_Object__Group__4__Impl : ( '=' ) ;
    public final void rule__My_Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2049:1: ( ( '=' ) )
            // InternalGame.g:2050:1: ( '=' )
            {
            // InternalGame.g:2050:1: ( '=' )
            // InternalGame.g:2051:2: '='
            {
             before(grammarAccess.getMy_ObjectAccess().getEqualsSignKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMy_ObjectAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__4__Impl"


    // $ANTLR start "rule__My_Object__Group__5"
    // InternalGame.g:2060:1: rule__My_Object__Group__5 : rule__My_Object__Group__5__Impl rule__My_Object__Group__6 ;
    public final void rule__My_Object__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2064:1: ( rule__My_Object__Group__5__Impl rule__My_Object__Group__6 )
            // InternalGame.g:2065:2: rule__My_Object__Group__5__Impl rule__My_Object__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__My_Object__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__My_Object__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__5"


    // $ANTLR start "rule__My_Object__Group__5__Impl"
    // InternalGame.g:2072:1: rule__My_Object__Group__5__Impl : ( ( rule__My_Object__TypeAssignment_5 ) ) ;
    public final void rule__My_Object__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2076:1: ( ( ( rule__My_Object__TypeAssignment_5 ) ) )
            // InternalGame.g:2077:1: ( ( rule__My_Object__TypeAssignment_5 ) )
            {
            // InternalGame.g:2077:1: ( ( rule__My_Object__TypeAssignment_5 ) )
            // InternalGame.g:2078:2: ( rule__My_Object__TypeAssignment_5 )
            {
             before(grammarAccess.getMy_ObjectAccess().getTypeAssignment_5()); 
            // InternalGame.g:2079:2: ( rule__My_Object__TypeAssignment_5 )
            // InternalGame.g:2079:3: rule__My_Object__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__My_Object__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMy_ObjectAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__5__Impl"


    // $ANTLR start "rule__My_Object__Group__6"
    // InternalGame.g:2087:1: rule__My_Object__Group__6 : rule__My_Object__Group__6__Impl rule__My_Object__Group__7 ;
    public final void rule__My_Object__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2091:1: ( rule__My_Object__Group__6__Impl rule__My_Object__Group__7 )
            // InternalGame.g:2092:2: rule__My_Object__Group__6__Impl rule__My_Object__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__My_Object__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__My_Object__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__6"


    // $ANTLR start "rule__My_Object__Group__6__Impl"
    // InternalGame.g:2099:1: rule__My_Object__Group__6__Impl : ( ';' ) ;
    public final void rule__My_Object__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2103:1: ( ( ';' ) )
            // InternalGame.g:2104:1: ( ';' )
            {
            // InternalGame.g:2104:1: ( ';' )
            // InternalGame.g:2105:2: ';'
            {
             before(grammarAccess.getMy_ObjectAccess().getSemicolonKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMy_ObjectAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__6__Impl"


    // $ANTLR start "rule__My_Object__Group__7"
    // InternalGame.g:2114:1: rule__My_Object__Group__7 : rule__My_Object__Group__7__Impl rule__My_Object__Group__8 ;
    public final void rule__My_Object__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2118:1: ( rule__My_Object__Group__7__Impl rule__My_Object__Group__8 )
            // InternalGame.g:2119:2: rule__My_Object__Group__7__Impl rule__My_Object__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__My_Object__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__My_Object__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__7"


    // $ANTLR start "rule__My_Object__Group__7__Impl"
    // InternalGame.g:2126:1: rule__My_Object__Group__7__Impl : ( 'response' ) ;
    public final void rule__My_Object__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2130:1: ( ( 'response' ) )
            // InternalGame.g:2131:1: ( 'response' )
            {
            // InternalGame.g:2131:1: ( 'response' )
            // InternalGame.g:2132:2: 'response'
            {
             before(grammarAccess.getMy_ObjectAccess().getResponseKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMy_ObjectAccess().getResponseKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__7__Impl"


    // $ANTLR start "rule__My_Object__Group__8"
    // InternalGame.g:2141:1: rule__My_Object__Group__8 : rule__My_Object__Group__8__Impl rule__My_Object__Group__9 ;
    public final void rule__My_Object__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2145:1: ( rule__My_Object__Group__8__Impl rule__My_Object__Group__9 )
            // InternalGame.g:2146:2: rule__My_Object__Group__8__Impl rule__My_Object__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__My_Object__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__My_Object__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__8"


    // $ANTLR start "rule__My_Object__Group__8__Impl"
    // InternalGame.g:2153:1: rule__My_Object__Group__8__Impl : ( '=' ) ;
    public final void rule__My_Object__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2157:1: ( ( '=' ) )
            // InternalGame.g:2158:1: ( '=' )
            {
            // InternalGame.g:2158:1: ( '=' )
            // InternalGame.g:2159:2: '='
            {
             before(grammarAccess.getMy_ObjectAccess().getEqualsSignKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMy_ObjectAccess().getEqualsSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__8__Impl"


    // $ANTLR start "rule__My_Object__Group__9"
    // InternalGame.g:2168:1: rule__My_Object__Group__9 : rule__My_Object__Group__9__Impl rule__My_Object__Group__10 ;
    public final void rule__My_Object__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2172:1: ( rule__My_Object__Group__9__Impl rule__My_Object__Group__10 )
            // InternalGame.g:2173:2: rule__My_Object__Group__9__Impl rule__My_Object__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__My_Object__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__My_Object__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__9"


    // $ANTLR start "rule__My_Object__Group__9__Impl"
    // InternalGame.g:2180:1: rule__My_Object__Group__9__Impl : ( ( rule__My_Object__ResponseAssignment_9 ) ) ;
    public final void rule__My_Object__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2184:1: ( ( ( rule__My_Object__ResponseAssignment_9 ) ) )
            // InternalGame.g:2185:1: ( ( rule__My_Object__ResponseAssignment_9 ) )
            {
            // InternalGame.g:2185:1: ( ( rule__My_Object__ResponseAssignment_9 ) )
            // InternalGame.g:2186:2: ( rule__My_Object__ResponseAssignment_9 )
            {
             before(grammarAccess.getMy_ObjectAccess().getResponseAssignment_9()); 
            // InternalGame.g:2187:2: ( rule__My_Object__ResponseAssignment_9 )
            // InternalGame.g:2187:3: rule__My_Object__ResponseAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__My_Object__ResponseAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getMy_ObjectAccess().getResponseAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__9__Impl"


    // $ANTLR start "rule__My_Object__Group__10"
    // InternalGame.g:2195:1: rule__My_Object__Group__10 : rule__My_Object__Group__10__Impl rule__My_Object__Group__11 ;
    public final void rule__My_Object__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2199:1: ( rule__My_Object__Group__10__Impl rule__My_Object__Group__11 )
            // InternalGame.g:2200:2: rule__My_Object__Group__10__Impl rule__My_Object__Group__11
            {
            pushFollow(FOLLOW_20);
            rule__My_Object__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__My_Object__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__10"


    // $ANTLR start "rule__My_Object__Group__10__Impl"
    // InternalGame.g:2207:1: rule__My_Object__Group__10__Impl : ( ';' ) ;
    public final void rule__My_Object__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2211:1: ( ( ';' ) )
            // InternalGame.g:2212:1: ( ';' )
            {
            // InternalGame.g:2212:1: ( ';' )
            // InternalGame.g:2213:2: ';'
            {
             before(grammarAccess.getMy_ObjectAccess().getSemicolonKeyword_10()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMy_ObjectAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__10__Impl"


    // $ANTLR start "rule__My_Object__Group__11"
    // InternalGame.g:2222:1: rule__My_Object__Group__11 : rule__My_Object__Group__11__Impl rule__My_Object__Group__12 ;
    public final void rule__My_Object__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2226:1: ( rule__My_Object__Group__11__Impl rule__My_Object__Group__12 )
            // InternalGame.g:2227:2: rule__My_Object__Group__11__Impl rule__My_Object__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__My_Object__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__My_Object__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__11"


    // $ANTLR start "rule__My_Object__Group__11__Impl"
    // InternalGame.g:2234:1: rule__My_Object__Group__11__Impl : ( 'position' ) ;
    public final void rule__My_Object__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2238:1: ( ( 'position' ) )
            // InternalGame.g:2239:1: ( 'position' )
            {
            // InternalGame.g:2239:1: ( 'position' )
            // InternalGame.g:2240:2: 'position'
            {
             before(grammarAccess.getMy_ObjectAccess().getPositionKeyword_11()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMy_ObjectAccess().getPositionKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__11__Impl"


    // $ANTLR start "rule__My_Object__Group__12"
    // InternalGame.g:2249:1: rule__My_Object__Group__12 : rule__My_Object__Group__12__Impl rule__My_Object__Group__13 ;
    public final void rule__My_Object__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2253:1: ( rule__My_Object__Group__12__Impl rule__My_Object__Group__13 )
            // InternalGame.g:2254:2: rule__My_Object__Group__12__Impl rule__My_Object__Group__13
            {
            pushFollow(FOLLOW_15);
            rule__My_Object__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__My_Object__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__12"


    // $ANTLR start "rule__My_Object__Group__12__Impl"
    // InternalGame.g:2261:1: rule__My_Object__Group__12__Impl : ( '=' ) ;
    public final void rule__My_Object__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2265:1: ( ( '=' ) )
            // InternalGame.g:2266:1: ( '=' )
            {
            // InternalGame.g:2266:1: ( '=' )
            // InternalGame.g:2267:2: '='
            {
             before(grammarAccess.getMy_ObjectAccess().getEqualsSignKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMy_ObjectAccess().getEqualsSignKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__12__Impl"


    // $ANTLR start "rule__My_Object__Group__13"
    // InternalGame.g:2276:1: rule__My_Object__Group__13 : rule__My_Object__Group__13__Impl rule__My_Object__Group__14 ;
    public final void rule__My_Object__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2280:1: ( rule__My_Object__Group__13__Impl rule__My_Object__Group__14 )
            // InternalGame.g:2281:2: rule__My_Object__Group__13__Impl rule__My_Object__Group__14
            {
            pushFollow(FOLLOW_10);
            rule__My_Object__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__My_Object__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__13"


    // $ANTLR start "rule__My_Object__Group__13__Impl"
    // InternalGame.g:2288:1: rule__My_Object__Group__13__Impl : ( ( rule__My_Object__PositionAssignment_13 ) ) ;
    public final void rule__My_Object__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2292:1: ( ( ( rule__My_Object__PositionAssignment_13 ) ) )
            // InternalGame.g:2293:1: ( ( rule__My_Object__PositionAssignment_13 ) )
            {
            // InternalGame.g:2293:1: ( ( rule__My_Object__PositionAssignment_13 ) )
            // InternalGame.g:2294:2: ( rule__My_Object__PositionAssignment_13 )
            {
             before(grammarAccess.getMy_ObjectAccess().getPositionAssignment_13()); 
            // InternalGame.g:2295:2: ( rule__My_Object__PositionAssignment_13 )
            // InternalGame.g:2295:3: rule__My_Object__PositionAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__My_Object__PositionAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getMy_ObjectAccess().getPositionAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__13__Impl"


    // $ANTLR start "rule__My_Object__Group__14"
    // InternalGame.g:2303:1: rule__My_Object__Group__14 : rule__My_Object__Group__14__Impl rule__My_Object__Group__15 ;
    public final void rule__My_Object__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2307:1: ( rule__My_Object__Group__14__Impl rule__My_Object__Group__15 )
            // InternalGame.g:2308:2: rule__My_Object__Group__14__Impl rule__My_Object__Group__15
            {
            pushFollow(FOLLOW_21);
            rule__My_Object__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__My_Object__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__14"


    // $ANTLR start "rule__My_Object__Group__14__Impl"
    // InternalGame.g:2315:1: rule__My_Object__Group__14__Impl : ( ';' ) ;
    public final void rule__My_Object__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2319:1: ( ( ';' ) )
            // InternalGame.g:2320:1: ( ';' )
            {
            // InternalGame.g:2320:1: ( ';' )
            // InternalGame.g:2321:2: ';'
            {
             before(grammarAccess.getMy_ObjectAccess().getSemicolonKeyword_14()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMy_ObjectAccess().getSemicolonKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__14__Impl"


    // $ANTLR start "rule__My_Object__Group__15"
    // InternalGame.g:2330:1: rule__My_Object__Group__15 : rule__My_Object__Group__15__Impl rule__My_Object__Group__16 ;
    public final void rule__My_Object__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2334:1: ( rule__My_Object__Group__15__Impl rule__My_Object__Group__16 )
            // InternalGame.g:2335:2: rule__My_Object__Group__15__Impl rule__My_Object__Group__16
            {
            pushFollow(FOLLOW_9);
            rule__My_Object__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__My_Object__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__15"


    // $ANTLR start "rule__My_Object__Group__15__Impl"
    // InternalGame.g:2342:1: rule__My_Object__Group__15__Impl : ( 'action' ) ;
    public final void rule__My_Object__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2346:1: ( ( 'action' ) )
            // InternalGame.g:2347:1: ( 'action' )
            {
            // InternalGame.g:2347:1: ( 'action' )
            // InternalGame.g:2348:2: 'action'
            {
             before(grammarAccess.getMy_ObjectAccess().getActionKeyword_15()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMy_ObjectAccess().getActionKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__15__Impl"


    // $ANTLR start "rule__My_Object__Group__16"
    // InternalGame.g:2357:1: rule__My_Object__Group__16 : rule__My_Object__Group__16__Impl rule__My_Object__Group__17 ;
    public final void rule__My_Object__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2361:1: ( rule__My_Object__Group__16__Impl rule__My_Object__Group__17 )
            // InternalGame.g:2362:2: rule__My_Object__Group__16__Impl rule__My_Object__Group__17
            {
            pushFollow(FOLLOW_25);
            rule__My_Object__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__My_Object__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__16"


    // $ANTLR start "rule__My_Object__Group__16__Impl"
    // InternalGame.g:2369:1: rule__My_Object__Group__16__Impl : ( '=' ) ;
    public final void rule__My_Object__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2373:1: ( ( '=' ) )
            // InternalGame.g:2374:1: ( '=' )
            {
            // InternalGame.g:2374:1: ( '=' )
            // InternalGame.g:2375:2: '='
            {
             before(grammarAccess.getMy_ObjectAccess().getEqualsSignKeyword_16()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMy_ObjectAccess().getEqualsSignKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__16__Impl"


    // $ANTLR start "rule__My_Object__Group__17"
    // InternalGame.g:2384:1: rule__My_Object__Group__17 : rule__My_Object__Group__17__Impl rule__My_Object__Group__18 ;
    public final void rule__My_Object__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2388:1: ( rule__My_Object__Group__17__Impl rule__My_Object__Group__18 )
            // InternalGame.g:2389:2: rule__My_Object__Group__17__Impl rule__My_Object__Group__18
            {
            pushFollow(FOLLOW_10);
            rule__My_Object__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__My_Object__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__17"


    // $ANTLR start "rule__My_Object__Group__17__Impl"
    // InternalGame.g:2396:1: rule__My_Object__Group__17__Impl : ( ( rule__My_Object__ActionAssignment_17 ) ) ;
    public final void rule__My_Object__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2400:1: ( ( ( rule__My_Object__ActionAssignment_17 ) ) )
            // InternalGame.g:2401:1: ( ( rule__My_Object__ActionAssignment_17 ) )
            {
            // InternalGame.g:2401:1: ( ( rule__My_Object__ActionAssignment_17 ) )
            // InternalGame.g:2402:2: ( rule__My_Object__ActionAssignment_17 )
            {
             before(grammarAccess.getMy_ObjectAccess().getActionAssignment_17()); 
            // InternalGame.g:2403:2: ( rule__My_Object__ActionAssignment_17 )
            // InternalGame.g:2403:3: rule__My_Object__ActionAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__My_Object__ActionAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getMy_ObjectAccess().getActionAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__17__Impl"


    // $ANTLR start "rule__My_Object__Group__18"
    // InternalGame.g:2411:1: rule__My_Object__Group__18 : rule__My_Object__Group__18__Impl rule__My_Object__Group__19 ;
    public final void rule__My_Object__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2415:1: ( rule__My_Object__Group__18__Impl rule__My_Object__Group__19 )
            // InternalGame.g:2416:2: rule__My_Object__Group__18__Impl rule__My_Object__Group__19
            {
            pushFollow(FOLLOW_12);
            rule__My_Object__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__My_Object__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__18"


    // $ANTLR start "rule__My_Object__Group__18__Impl"
    // InternalGame.g:2423:1: rule__My_Object__Group__18__Impl : ( ';' ) ;
    public final void rule__My_Object__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2427:1: ( ( ';' ) )
            // InternalGame.g:2428:1: ( ';' )
            {
            // InternalGame.g:2428:1: ( ';' )
            // InternalGame.g:2429:2: ';'
            {
             before(grammarAccess.getMy_ObjectAccess().getSemicolonKeyword_18()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMy_ObjectAccess().getSemicolonKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__18__Impl"


    // $ANTLR start "rule__My_Object__Group__19"
    // InternalGame.g:2438:1: rule__My_Object__Group__19 : rule__My_Object__Group__19__Impl ;
    public final void rule__My_Object__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2442:1: ( rule__My_Object__Group__19__Impl )
            // InternalGame.g:2443:2: rule__My_Object__Group__19__Impl
            {
            pushFollow(FOLLOW_2);
            rule__My_Object__Group__19__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__19"


    // $ANTLR start "rule__My_Object__Group__19__Impl"
    // InternalGame.g:2449:1: rule__My_Object__Group__19__Impl : ( '}' ) ;
    public final void rule__My_Object__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2453:1: ( ( '}' ) )
            // InternalGame.g:2454:1: ( '}' )
            {
            // InternalGame.g:2454:1: ( '}' )
            // InternalGame.g:2455:2: '}'
            {
             before(grammarAccess.getMy_ObjectAccess().getRightCurlyBracketKeyword_19()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMy_ObjectAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__Group__19__Impl"


    // $ANTLR start "rule__Game__ScenesAssignment"
    // InternalGame.g:2465:1: rule__Game__ScenesAssignment : ( ruleScene ) ;
    public final void rule__Game__ScenesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2469:1: ( ( ruleScene ) )
            // InternalGame.g:2470:2: ( ruleScene )
            {
            // InternalGame.g:2470:2: ( ruleScene )
            // InternalGame.g:2471:3: ruleScene
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
    // InternalGame.g:2480:1: rule__Scene__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Scene__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2484:1: ( ( RULE_ID ) )
            // InternalGame.g:2485:2: ( RULE_ID )
            {
            // InternalGame.g:2485:2: ( RULE_ID )
            // InternalGame.g:2486:3: RULE_ID
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
    // InternalGame.g:2495:1: rule__Scene__DeclartionsAssignment_3 : ( ruleLevelDeclaration ) ;
    public final void rule__Scene__DeclartionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2499:1: ( ( ruleLevelDeclaration ) )
            // InternalGame.g:2500:2: ( ruleLevelDeclaration )
            {
            // InternalGame.g:2500:2: ( ruleLevelDeclaration )
            // InternalGame.g:2501:3: ruleLevelDeclaration
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
    // InternalGame.g:2510:1: rule__Scene__DefinitionsAssignment_4 : ( ruleLevelDefinition ) ;
    public final void rule__Scene__DefinitionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2514:1: ( ( ruleLevelDefinition ) )
            // InternalGame.g:2515:2: ( ruleLevelDefinition )
            {
            // InternalGame.g:2515:2: ( ruleLevelDefinition )
            // InternalGame.g:2516:3: ruleLevelDefinition
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
    // InternalGame.g:2525:1: rule__Scene__StartLevelAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Scene__StartLevelAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2529:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2530:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2530:2: ( ( RULE_ID ) )
            // InternalGame.g:2531:3: ( RULE_ID )
            {
             before(grammarAccess.getSceneAccess().getStartLevelLevelDeclarationCrossReference_7_0()); 
            // InternalGame.g:2532:3: ( RULE_ID )
            // InternalGame.g:2533:4: RULE_ID
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
    // InternalGame.g:2544:1: rule__Scene__FinalLevelAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__Scene__FinalLevelAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2548:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2549:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2549:2: ( ( RULE_ID ) )
            // InternalGame.g:2550:3: ( RULE_ID )
            {
             before(grammarAccess.getSceneAccess().getFinalLevelLevelDeclarationCrossReference_11_0()); 
            // InternalGame.g:2551:3: ( RULE_ID )
            // InternalGame.g:2552:4: RULE_ID
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
    // InternalGame.g:2563:1: rule__LevelDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LevelDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2567:1: ( ( RULE_ID ) )
            // InternalGame.g:2568:2: ( RULE_ID )
            {
            // InternalGame.g:2568:2: ( RULE_ID )
            // InternalGame.g:2569:3: RULE_ID
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
    // InternalGame.g:2578:1: rule__LevelDefinition__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__LevelDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2582:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2583:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2583:2: ( ( RULE_ID ) )
            // InternalGame.g:2584:3: ( RULE_ID )
            {
             before(grammarAccess.getLevelDefinitionAccess().getNameLevelDeclarationCrossReference_0_0()); 
            // InternalGame.g:2585:3: ( RULE_ID )
            // InternalGame.g:2586:4: RULE_ID
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
    // InternalGame.g:2597:1: rule__LevelDefinition__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__LevelDefinition__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2601:1: ( ( ruleDescription ) )
            // InternalGame.g:2602:2: ( ruleDescription )
            {
            // InternalGame.g:2602:2: ( ruleDescription )
            // InternalGame.g:2603:3: ruleDescription
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
    // InternalGame.g:2612:1: rule__LevelDefinition__PersonsAssignment_4 : ( rulePerson ) ;
    public final void rule__LevelDefinition__PersonsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2616:1: ( ( rulePerson ) )
            // InternalGame.g:2617:2: ( rulePerson )
            {
            // InternalGame.g:2617:2: ( rulePerson )
            // InternalGame.g:2618:3: rulePerson
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
    // InternalGame.g:2627:1: rule__LevelDefinition__ObjectsAssignment_5 : ( ruleMy_Object ) ;
    public final void rule__LevelDefinition__ObjectsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2631:1: ( ( ruleMy_Object ) )
            // InternalGame.g:2632:2: ( ruleMy_Object )
            {
            // InternalGame.g:2632:2: ( ruleMy_Object )
            // InternalGame.g:2633:3: ruleMy_Object
            {
             before(grammarAccess.getLevelDefinitionAccess().getObjectsMy_ObjectParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMy_Object();

            state._fsp--;

             after(grammarAccess.getLevelDefinitionAccess().getObjectsMy_ObjectParserRuleCall_5_0()); 

            }


            }

        }
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
    // InternalGame.g:2642:1: rule__LevelDefinition__NextAssignment_6_2 : ( ( RULE_ID ) ) ;
    public final void rule__LevelDefinition__NextAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2646:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2647:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2647:2: ( ( RULE_ID ) )
            // InternalGame.g:2648:3: ( RULE_ID )
            {
             before(grammarAccess.getLevelDefinitionAccess().getNextLevelDeclarationCrossReference_6_2_0()); 
            // InternalGame.g:2649:3: ( RULE_ID )
            // InternalGame.g:2650:4: RULE_ID
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
    // InternalGame.g:2661:1: rule__Description__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Description__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2665:1: ( ( RULE_STRING ) )
            // InternalGame.g:2666:2: ( RULE_STRING )
            {
            // InternalGame.g:2666:2: ( RULE_STRING )
            // InternalGame.g:2667:3: RULE_STRING
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
    // InternalGame.g:2676:1: rule__Person__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Person__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2680:1: ( ( RULE_ID ) )
            // InternalGame.g:2681:2: ( RULE_ID )
            {
            // InternalGame.g:2681:2: ( RULE_ID )
            // InternalGame.g:2682:3: RULE_ID
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
    // InternalGame.g:2691:1: rule__Person__TypeAssignment_5 : ( RULE_ID ) ;
    public final void rule__Person__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2695:1: ( ( RULE_ID ) )
            // InternalGame.g:2696:2: ( RULE_ID )
            {
            // InternalGame.g:2696:2: ( RULE_ID )
            // InternalGame.g:2697:3: RULE_ID
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
    // InternalGame.g:2706:1: rule__Person__ResponseAssignment_9 : ( rulePerson_R ) ;
    public final void rule__Person__ResponseAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2710:1: ( ( rulePerson_R ) )
            // InternalGame.g:2711:2: ( rulePerson_R )
            {
            // InternalGame.g:2711:2: ( rulePerson_R )
            // InternalGame.g:2712:3: rulePerson_R
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
    // InternalGame.g:2721:1: rule__Person__PositionAssignment_13 : ( RULE_STRING ) ;
    public final void rule__Person__PositionAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2725:1: ( ( RULE_STRING ) )
            // InternalGame.g:2726:2: ( RULE_STRING )
            {
            // InternalGame.g:2726:2: ( RULE_STRING )
            // InternalGame.g:2727:3: RULE_STRING
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
    // InternalGame.g:2736:1: rule__Person__ActionAssignment_17 : ( ruleAction_P ) ;
    public final void rule__Person__ActionAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2740:1: ( ( ruleAction_P ) )
            // InternalGame.g:2741:2: ( ruleAction_P )
            {
            // InternalGame.g:2741:2: ( ruleAction_P )
            // InternalGame.g:2742:3: ruleAction_P
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


    // $ANTLR start "rule__Person__FinalObjectAssignment_19_2"
    // InternalGame.g:2751:1: rule__Person__FinalObjectAssignment_19_2 : ( ( RULE_ID ) ) ;
    public final void rule__Person__FinalObjectAssignment_19_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2755:1: ( ( ( RULE_ID ) ) )
            // InternalGame.g:2756:2: ( ( RULE_ID ) )
            {
            // InternalGame.g:2756:2: ( ( RULE_ID ) )
            // InternalGame.g:2757:3: ( RULE_ID )
            {
             before(grammarAccess.getPersonAccess().getFinalObjectMy_ObjectCrossReference_19_2_0()); 
            // InternalGame.g:2758:3: ( RULE_ID )
            // InternalGame.g:2759:4: RULE_ID
            {
             before(grammarAccess.getPersonAccess().getFinalObjectMy_ObjectIDTerminalRuleCall_19_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getFinalObjectMy_ObjectIDTerminalRuleCall_19_2_0_1()); 

            }

             after(grammarAccess.getPersonAccess().getFinalObjectMy_ObjectCrossReference_19_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__FinalObjectAssignment_19_2"


    // $ANTLR start "rule__Person_R__ItemAssignment_0"
    // InternalGame.g:2770:1: rule__Person_R__ItemAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Person_R__ItemAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2774:1: ( ( RULE_STRING ) )
            // InternalGame.g:2775:2: ( RULE_STRING )
            {
            // InternalGame.g:2775:2: ( RULE_STRING )
            // InternalGame.g:2776:3: RULE_STRING
            {
             before(grammarAccess.getPerson_RAccess().getItemSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPerson_RAccess().getItemSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person_R__ItemAssignment_0"


    // $ANTLR start "rule__My_Object__NameAssignment_0"
    // InternalGame.g:2785:1: rule__My_Object__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__My_Object__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2789:1: ( ( RULE_ID ) )
            // InternalGame.g:2790:2: ( RULE_ID )
            {
            // InternalGame.g:2790:2: ( RULE_ID )
            // InternalGame.g:2791:3: RULE_ID
            {
             before(grammarAccess.getMy_ObjectAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMy_ObjectAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__NameAssignment_0"


    // $ANTLR start "rule__My_Object__TypeAssignment_5"
    // InternalGame.g:2800:1: rule__My_Object__TypeAssignment_5 : ( RULE_ID ) ;
    public final void rule__My_Object__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2804:1: ( ( RULE_ID ) )
            // InternalGame.g:2805:2: ( RULE_ID )
            {
            // InternalGame.g:2805:2: ( RULE_ID )
            // InternalGame.g:2806:3: RULE_ID
            {
             before(grammarAccess.getMy_ObjectAccess().getTypeIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMy_ObjectAccess().getTypeIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__TypeAssignment_5"


    // $ANTLR start "rule__My_Object__ResponseAssignment_9"
    // InternalGame.g:2815:1: rule__My_Object__ResponseAssignment_9 : ( RULE_STRING ) ;
    public final void rule__My_Object__ResponseAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2819:1: ( ( RULE_STRING ) )
            // InternalGame.g:2820:2: ( RULE_STRING )
            {
            // InternalGame.g:2820:2: ( RULE_STRING )
            // InternalGame.g:2821:3: RULE_STRING
            {
             before(grammarAccess.getMy_ObjectAccess().getResponseSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMy_ObjectAccess().getResponseSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__ResponseAssignment_9"


    // $ANTLR start "rule__My_Object__PositionAssignment_13"
    // InternalGame.g:2830:1: rule__My_Object__PositionAssignment_13 : ( RULE_STRING ) ;
    public final void rule__My_Object__PositionAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2834:1: ( ( RULE_STRING ) )
            // InternalGame.g:2835:2: ( RULE_STRING )
            {
            // InternalGame.g:2835:2: ( RULE_STRING )
            // InternalGame.g:2836:3: RULE_STRING
            {
             before(grammarAccess.getMy_ObjectAccess().getPositionSTRINGTerminalRuleCall_13_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMy_ObjectAccess().getPositionSTRINGTerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__PositionAssignment_13"


    // $ANTLR start "rule__My_Object__ActionAssignment_17"
    // InternalGame.g:2845:1: rule__My_Object__ActionAssignment_17 : ( ruleAction_O ) ;
    public final void rule__My_Object__ActionAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGame.g:2849:1: ( ( ruleAction_O ) )
            // InternalGame.g:2850:2: ( ruleAction_O )
            {
            // InternalGame.g:2850:2: ( ruleAction_O )
            // InternalGame.g:2851:3: ruleAction_O
            {
             before(grammarAccess.getMy_ObjectAccess().getActionAction_OEnumRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleAction_O();

            state._fsp--;

             after(grammarAccess.getMy_ObjectAccess().getActionAction_OEnumRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__My_Object__ActionAssignment_17"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\4\1\21\1\uffff\1\17\1\30\1\21\1\4\1\22\1\31\1\17\1\uffff";
    static final String dfa_3s = "\1\26\1\21\1\uffff\1\17\1\30\1\21\1\4\1\22\1\31\1\21\1\uffff";
    static final String dfa_4s = "\2\uffff\1\2\7\uffff\1\1";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\17\uffff\1\2\1\uffff\1\2",
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
            return "()* loopback of 891:2: ( rule__LevelDefinition__PersonsAssignment_4 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000210010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000500010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000003000L});

}