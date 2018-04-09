package uibk.ac.at.qe.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uibk.ac.at.qe.dsl.services.GameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'new'", "'start'", "'='", "';'", "'final'", "'level'", "'goal'", "'from'", "'to'", "'type'", "'response'", "'position'", "'action'", "'male'", "'female'", "'type_A'", "'On table'", "'Talk'", "'Pick'", "'use'"
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

        public InternalGameParser(TokenStream input, GameGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Game";
       	}

       	@Override
       	protected GameGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGame"
    // InternalGame.g:65:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalGame.g:65:45: (iv_ruleGame= ruleGame EOF )
            // InternalGame.g:66:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalGame.g:72:1: ruleGame returns [EObject current=null] : ( ( (lv_definition_0_0= ruleDefinition ) ) otherlv_1= '{' ( (lv_scenes_2_0= ruleScene ) )* otherlv_3= '}' ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_definition_0_0 = null;

        EObject lv_scenes_2_0 = null;



        	enterRule();

        try {
            // InternalGame.g:78:2: ( ( ( (lv_definition_0_0= ruleDefinition ) ) otherlv_1= '{' ( (lv_scenes_2_0= ruleScene ) )* otherlv_3= '}' ) )
            // InternalGame.g:79:2: ( ( (lv_definition_0_0= ruleDefinition ) ) otherlv_1= '{' ( (lv_scenes_2_0= ruleScene ) )* otherlv_3= '}' )
            {
            // InternalGame.g:79:2: ( ( (lv_definition_0_0= ruleDefinition ) ) otherlv_1= '{' ( (lv_scenes_2_0= ruleScene ) )* otherlv_3= '}' )
            // InternalGame.g:80:3: ( (lv_definition_0_0= ruleDefinition ) ) otherlv_1= '{' ( (lv_scenes_2_0= ruleScene ) )* otherlv_3= '}'
            {
            // InternalGame.g:80:3: ( (lv_definition_0_0= ruleDefinition ) )
            // InternalGame.g:81:4: (lv_definition_0_0= ruleDefinition )
            {
            // InternalGame.g:81:4: (lv_definition_0_0= ruleDefinition )
            // InternalGame.g:82:5: lv_definition_0_0= ruleDefinition
            {

            					newCompositeNode(grammarAccess.getGameAccess().getDefinitionDefinitionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_definition_0_0=ruleDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"definition",
            						lv_definition_0_0,
            						"uibk.ac.at.qe.dsl.Game.Definition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:103:3: ( (lv_scenes_2_0= ruleScene ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==14||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGame.g:104:4: (lv_scenes_2_0= ruleScene )
            	    {
            	    // InternalGame.g:104:4: (lv_scenes_2_0= ruleScene )
            	    // InternalGame.g:105:5: lv_scenes_2_0= ruleScene
            	    {

            	    					newCompositeNode(grammarAccess.getGameAccess().getScenesSceneParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_scenes_2_0=ruleScene();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scenes",
            	    						lv_scenes_2_0,
            	    						"uibk.ac.at.qe.dsl.Game.Scene");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleDefinition"
    // InternalGame.g:130:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalGame.g:130:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalGame.g:131:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalGame.g:137:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'new' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGame.g:143:2: ( (otherlv_0= 'new' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGame.g:144:2: (otherlv_0= 'new' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGame.g:144:2: (otherlv_0= 'new' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGame.g:145:3: otherlv_0= 'new' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getNewKeyword_0());
            		
            // InternalGame.g:149:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:150:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:150:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:151:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleScene"
    // InternalGame.g:171:1: entryRuleScene returns [EObject current=null] : iv_ruleScene= ruleScene EOF ;
    public final EObject entryRuleScene() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScene = null;


        try {
            // InternalGame.g:171:46: (iv_ruleScene= ruleScene EOF )
            // InternalGame.g:172:2: iv_ruleScene= ruleScene EOF
            {
             newCompositeNode(grammarAccess.getSceneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScene=ruleScene();

            state._fsp--;

             current =iv_ruleScene; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScene"


    // $ANTLR start "ruleScene"
    // InternalGame.g:178:1: ruleScene returns [EObject current=null] : ( ( (lv_declartions_0_0= ruleLevelDeclaration ) )* ( (lv_definitions_1_0= ruleLevelDefinition ) )* otherlv_2= 'start' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'final' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';' ( (lv_transitions_10_0= ruleLevelTransition ) )* ) ;
    public final EObject ruleScene() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_declartions_0_0 = null;

        EObject lv_definitions_1_0 = null;

        EObject lv_transitions_10_0 = null;



        	enterRule();

        try {
            // InternalGame.g:184:2: ( ( ( (lv_declartions_0_0= ruleLevelDeclaration ) )* ( (lv_definitions_1_0= ruleLevelDefinition ) )* otherlv_2= 'start' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'final' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';' ( (lv_transitions_10_0= ruleLevelTransition ) )* ) )
            // InternalGame.g:185:2: ( ( (lv_declartions_0_0= ruleLevelDeclaration ) )* ( (lv_definitions_1_0= ruleLevelDefinition ) )* otherlv_2= 'start' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'final' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';' ( (lv_transitions_10_0= ruleLevelTransition ) )* )
            {
            // InternalGame.g:185:2: ( ( (lv_declartions_0_0= ruleLevelDeclaration ) )* ( (lv_definitions_1_0= ruleLevelDefinition ) )* otherlv_2= 'start' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'final' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';' ( (lv_transitions_10_0= ruleLevelTransition ) )* )
            // InternalGame.g:186:3: ( (lv_declartions_0_0= ruleLevelDeclaration ) )* ( (lv_definitions_1_0= ruleLevelDefinition ) )* otherlv_2= 'start' otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'final' otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';' ( (lv_transitions_10_0= ruleLevelTransition ) )*
            {
            // InternalGame.g:186:3: ( (lv_declartions_0_0= ruleLevelDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGame.g:187:4: (lv_declartions_0_0= ruleLevelDeclaration )
            	    {
            	    // InternalGame.g:187:4: (lv_declartions_0_0= ruleLevelDeclaration )
            	    // InternalGame.g:188:5: lv_declartions_0_0= ruleLevelDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getSceneAccess().getDeclartionsLevelDeclarationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_declartions_0_0=ruleLevelDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSceneRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declartions",
            	    						lv_declartions_0_0,
            	    						"uibk.ac.at.qe.dsl.Game.LevelDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalGame.g:205:3: ( (lv_definitions_1_0= ruleLevelDefinition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGame.g:206:4: (lv_definitions_1_0= ruleLevelDefinition )
            	    {
            	    // InternalGame.g:206:4: (lv_definitions_1_0= ruleLevelDefinition )
            	    // InternalGame.g:207:5: lv_definitions_1_0= ruleLevelDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getSceneAccess().getDefinitionsLevelDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_definitions_1_0=ruleLevelDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSceneRule());
            	    					}
            	    					add(
            	    						current,
            	    						"definitions",
            	    						lv_definitions_1_0,
            	    						"uibk.ac.at.qe.dsl.Game.LevelDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSceneAccess().getStartKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSceneAccess().getEqualsSignKeyword_3());
            		
            // InternalGame.g:232:3: ( (otherlv_4= RULE_ID ) )
            // InternalGame.g:233:4: (otherlv_4= RULE_ID )
            {
            // InternalGame.g:233:4: (otherlv_4= RULE_ID )
            // InternalGame.g:234:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_4, grammarAccess.getSceneAccess().getStartLevelLevelDeclarationCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getSceneAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getSceneAccess().getFinalKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getSceneAccess().getEqualsSignKeyword_7());
            		
            // InternalGame.g:257:3: ( (otherlv_8= RULE_ID ) )
            // InternalGame.g:258:4: (otherlv_8= RULE_ID )
            {
            // InternalGame.g:258:4: (otherlv_8= RULE_ID )
            // InternalGame.g:259:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_8, grammarAccess.getSceneAccess().getFinalLevelLevelDeclarationCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getSceneAccess().getSemicolonKeyword_9());
            		
            // InternalGame.g:274:3: ( (lv_transitions_10_0= ruleLevelTransition ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:275:4: (lv_transitions_10_0= ruleLevelTransition )
            	    {
            	    // InternalGame.g:275:4: (lv_transitions_10_0= ruleLevelTransition )
            	    // InternalGame.g:276:5: lv_transitions_10_0= ruleLevelTransition
            	    {

            	    					newCompositeNode(grammarAccess.getSceneAccess().getTransitionsLevelTransitionParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_transitions_10_0=ruleLevelTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSceneRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_10_0,
            	    						"uibk.ac.at.qe.dsl.Game.LevelTransition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScene"


    // $ANTLR start "entryRuleLevelDeclaration"
    // InternalGame.g:297:1: entryRuleLevelDeclaration returns [EObject current=null] : iv_ruleLevelDeclaration= ruleLevelDeclaration EOF ;
    public final EObject entryRuleLevelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevelDeclaration = null;


        try {
            // InternalGame.g:297:57: (iv_ruleLevelDeclaration= ruleLevelDeclaration EOF )
            // InternalGame.g:298:2: iv_ruleLevelDeclaration= ruleLevelDeclaration EOF
            {
             newCompositeNode(grammarAccess.getLevelDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLevelDeclaration=ruleLevelDeclaration();

            state._fsp--;

             current =iv_ruleLevelDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLevelDeclaration"


    // $ANTLR start "ruleLevelDeclaration"
    // InternalGame.g:304:1: ruleLevelDeclaration returns [EObject current=null] : (otherlv_0= 'level' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleLevelDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGame.g:310:2: ( (otherlv_0= 'level' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalGame.g:311:2: (otherlv_0= 'level' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalGame.g:311:2: (otherlv_0= 'level' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalGame.g:312:3: otherlv_0= 'level' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLevelDeclarationAccess().getLevelKeyword_0());
            		
            // InternalGame.g:316:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:317:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:317:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:318:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLevelDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLevelDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLevelDeclarationAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLevelDeclaration"


    // $ANTLR start "entryRuleLevelDefinition"
    // InternalGame.g:342:1: entryRuleLevelDefinition returns [EObject current=null] : iv_ruleLevelDefinition= ruleLevelDefinition EOF ;
    public final EObject entryRuleLevelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevelDefinition = null;


        try {
            // InternalGame.g:342:56: (iv_ruleLevelDefinition= ruleLevelDefinition EOF )
            // InternalGame.g:343:2: iv_ruleLevelDefinition= ruleLevelDefinition EOF
            {
             newCompositeNode(grammarAccess.getLevelDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLevelDefinition=ruleLevelDefinition();

            state._fsp--;

             current =iv_ruleLevelDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLevelDefinition"


    // $ANTLR start "ruleLevelDefinition"
    // InternalGame.g:349:1: ruleLevelDefinition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_persons_3_0= rulePerson ) )* ( (lv_objects_4_0= ruleObject ) )* otherlv_5= 'goal' otherlv_6= '=' ( (lv_goalId_7_0= RULE_ID ) ) otherlv_8= ';' otherlv_9= '}' ) ;
    public final EObject ruleLevelDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_goalId_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_persons_3_0 = null;

        EObject lv_objects_4_0 = null;



        	enterRule();

        try {
            // InternalGame.g:355:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_persons_3_0= rulePerson ) )* ( (lv_objects_4_0= ruleObject ) )* otherlv_5= 'goal' otherlv_6= '=' ( (lv_goalId_7_0= RULE_ID ) ) otherlv_8= ';' otherlv_9= '}' ) )
            // InternalGame.g:356:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_persons_3_0= rulePerson ) )* ( (lv_objects_4_0= ruleObject ) )* otherlv_5= 'goal' otherlv_6= '=' ( (lv_goalId_7_0= RULE_ID ) ) otherlv_8= ';' otherlv_9= '}' )
            {
            // InternalGame.g:356:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_persons_3_0= rulePerson ) )* ( (lv_objects_4_0= ruleObject ) )* otherlv_5= 'goal' otherlv_6= '=' ( (lv_goalId_7_0= RULE_ID ) ) otherlv_8= ';' otherlv_9= '}' )
            // InternalGame.g:357:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_persons_3_0= rulePerson ) )* ( (lv_objects_4_0= ruleObject ) )* otherlv_5= 'goal' otherlv_6= '=' ( (lv_goalId_7_0= RULE_ID ) ) otherlv_8= ';' otherlv_9= '}'
            {
            // InternalGame.g:357:3: ( (otherlv_0= RULE_ID ) )
            // InternalGame.g:358:4: (otherlv_0= RULE_ID )
            {
            // InternalGame.g:358:4: (otherlv_0= RULE_ID )
            // InternalGame.g:359:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLevelDefinitionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getLevelDefinitionAccess().getNameLevelDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLevelDefinitionAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getLevelDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:378:3: ( (lv_persons_3_0= rulePerson ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==15) ) {
                        int LA5_3 = input.LA(3);

                        if ( (LA5_3==11) ) {
                            int LA5_4 = input.LA(4);

                            if ( (LA5_4==22) ) {
                                int LA5_5 = input.LA(5);

                                if ( (LA5_5==15) ) {
                                    int LA5_6 = input.LA(6);

                                    if ( ((LA5_6>=26 && LA5_6<=27)) ) {
                                        alt5=1;
                                    }


                                }


                            }


                        }


                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalGame.g:379:4: (lv_persons_3_0= rulePerson )
            	    {
            	    // InternalGame.g:379:4: (lv_persons_3_0= rulePerson )
            	    // InternalGame.g:380:5: lv_persons_3_0= rulePerson
            	    {

            	    					newCompositeNode(grammarAccess.getLevelDefinitionAccess().getPersonsPersonParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_persons_3_0=rulePerson();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLevelDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"persons",
            	    						lv_persons_3_0,
            	    						"uibk.ac.at.qe.dsl.Game.Person");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalGame.g:397:3: ( (lv_objects_4_0= ruleObject ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGame.g:398:4: (lv_objects_4_0= ruleObject )
            	    {
            	    // InternalGame.g:398:4: (lv_objects_4_0= ruleObject )
            	    // InternalGame.g:399:5: lv_objects_4_0= ruleObject
            	    {

            	    					newCompositeNode(grammarAccess.getLevelDefinitionAccess().getObjectsObjectParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_objects_4_0=ruleObject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLevelDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"objects",
            	    						lv_objects_4_0,
            	    						"uibk.ac.at.qe.dsl.Game.Object");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getLevelDefinitionAccess().getGoalKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getLevelDefinitionAccess().getEqualsSignKeyword_6());
            		
            // InternalGame.g:424:3: ( (lv_goalId_7_0= RULE_ID ) )
            // InternalGame.g:425:4: (lv_goalId_7_0= RULE_ID )
            {
            // InternalGame.g:425:4: (lv_goalId_7_0= RULE_ID )
            // InternalGame.g:426:5: lv_goalId_7_0= RULE_ID
            {
            lv_goalId_7_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_goalId_7_0, grammarAccess.getLevelDefinitionAccess().getGoalIdIDTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLevelDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"goalId",
            						lv_goalId_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getLevelDefinitionAccess().getSemicolonKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLevelDefinitionAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLevelDefinition"


    // $ANTLR start "entryRuleLevelTransition"
    // InternalGame.g:454:1: entryRuleLevelTransition returns [EObject current=null] : iv_ruleLevelTransition= ruleLevelTransition EOF ;
    public final EObject entryRuleLevelTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevelTransition = null;


        try {
            // InternalGame.g:454:56: (iv_ruleLevelTransition= ruleLevelTransition EOF )
            // InternalGame.g:455:2: iv_ruleLevelTransition= ruleLevelTransition EOF
            {
             newCompositeNode(grammarAccess.getLevelTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLevelTransition=ruleLevelTransition();

            state._fsp--;

             current =iv_ruleLevelTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLevelTransition"


    // $ANTLR start "ruleLevelTransition"
    // InternalGame.g:461:1: ruleLevelTransition returns [EObject current=null] : (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleLevelTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGame.g:467:2: ( (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalGame.g:468:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalGame.g:468:2: (otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalGame.g:469:3: otherlv_0= 'from' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLevelTransitionAccess().getFromKeyword_0());
            		
            // InternalGame.g:473:3: ( (otherlv_1= RULE_ID ) )
            // InternalGame.g:474:4: (otherlv_1= RULE_ID )
            {
            // InternalGame.g:474:4: (otherlv_1= RULE_ID )
            // InternalGame.g:475:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLevelTransitionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getLevelTransitionAccess().getLevelFromLevelDeclarationCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLevelTransitionAccess().getToKeyword_2());
            		
            // InternalGame.g:490:3: ( (otherlv_3= RULE_ID ) )
            // InternalGame.g:491:4: (otherlv_3= RULE_ID )
            {
            // InternalGame.g:491:4: (otherlv_3= RULE_ID )
            // InternalGame.g:492:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLevelTransitionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_3, grammarAccess.getLevelTransitionAccess().getLevelToLevelDeclarationCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLevelTransitionAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLevelTransition"


    // $ANTLR start "entryRulePerson"
    // InternalGame.g:511:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalGame.g:511:47: (iv_rulePerson= rulePerson EOF )
            // InternalGame.g:512:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalGame.g:518:1: rulePerson returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= rulePERSON_T ) ) otherlv_6= ';' otherlv_7= 'response' otherlv_8= '=' ( (lv_response_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'position' otherlv_12= '=' ( (lv_position_13_0= rulePosition_E ) ) otherlv_14= ';' otherlv_15= 'action' otherlv_16= '=' ( (lv_action_17_0= ruleAction ) ) otherlv_18= ';' otherlv_19= '}' ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_response_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Enumerator lv_type_5_0 = null;

        Enumerator lv_position_13_0 = null;

        Enumerator lv_action_17_0 = null;



        	enterRule();

        try {
            // InternalGame.g:524:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= rulePERSON_T ) ) otherlv_6= ';' otherlv_7= 'response' otherlv_8= '=' ( (lv_response_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'position' otherlv_12= '=' ( (lv_position_13_0= rulePosition_E ) ) otherlv_14= ';' otherlv_15= 'action' otherlv_16= '=' ( (lv_action_17_0= ruleAction ) ) otherlv_18= ';' otherlv_19= '}' ) )
            // InternalGame.g:525:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= rulePERSON_T ) ) otherlv_6= ';' otherlv_7= 'response' otherlv_8= '=' ( (lv_response_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'position' otherlv_12= '=' ( (lv_position_13_0= rulePosition_E ) ) otherlv_14= ';' otherlv_15= 'action' otherlv_16= '=' ( (lv_action_17_0= ruleAction ) ) otherlv_18= ';' otherlv_19= '}' )
            {
            // InternalGame.g:525:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= rulePERSON_T ) ) otherlv_6= ';' otherlv_7= 'response' otherlv_8= '=' ( (lv_response_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'position' otherlv_12= '=' ( (lv_position_13_0= rulePosition_E ) ) otherlv_14= ';' otherlv_15= 'action' otherlv_16= '=' ( (lv_action_17_0= ruleAction ) ) otherlv_18= ';' otherlv_19= '}' )
            // InternalGame.g:526:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= rulePERSON_T ) ) otherlv_6= ';' otherlv_7= 'response' otherlv_8= '=' ( (lv_response_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'position' otherlv_12= '=' ( (lv_position_13_0= rulePosition_E ) ) otherlv_14= ';' otherlv_15= 'action' otherlv_16= '=' ( (lv_action_17_0= ruleAction ) ) otherlv_18= ';' otherlv_19= '}'
            {
            // InternalGame.g:526:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:527:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:527:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:528:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getEqualsSignKeyword_4());
            		
            // InternalGame.g:560:3: ( (lv_type_5_0= rulePERSON_T ) )
            // InternalGame.g:561:4: (lv_type_5_0= rulePERSON_T )
            {
            // InternalGame.g:561:4: (lv_type_5_0= rulePERSON_T )
            // InternalGame.g:562:5: lv_type_5_0= rulePERSON_T
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getTypePERSON_TEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_type_5_0=rulePERSON_T();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"uibk.ac.at.qe.dsl.Game.PERSON_T");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getPersonAccess().getResponseKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getPersonAccess().getEqualsSignKeyword_8());
            		
            // InternalGame.g:591:3: ( (lv_response_9_0= RULE_STRING ) )
            // InternalGame.g:592:4: (lv_response_9_0= RULE_STRING )
            {
            // InternalGame.g:592:4: (lv_response_9_0= RULE_STRING )
            // InternalGame.g:593:5: lv_response_9_0= RULE_STRING
            {
            lv_response_9_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_response_9_0, grammarAccess.getPersonAccess().getResponseSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"response",
            						lv_response_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_10, grammarAccess.getPersonAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getPersonAccess().getPositionKeyword_11());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_12, grammarAccess.getPersonAccess().getEqualsSignKeyword_12());
            		
            // InternalGame.g:621:3: ( (lv_position_13_0= rulePosition_E ) )
            // InternalGame.g:622:4: (lv_position_13_0= rulePosition_E )
            {
            // InternalGame.g:622:4: (lv_position_13_0= rulePosition_E )
            // InternalGame.g:623:5: lv_position_13_0= rulePosition_E
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getPositionPosition_EEnumRuleCall_13_0());
            				
            pushFollow(FOLLOW_9);
            lv_position_13_0=rulePosition_E();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					set(
            						current,
            						"position",
            						lv_position_13_0,
            						"uibk.ac.at.qe.dsl.Game.Position_E");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_14, grammarAccess.getPersonAccess().getSemicolonKeyword_14());
            		
            otherlv_15=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getPersonAccess().getActionKeyword_15());
            		
            otherlv_16=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_16, grammarAccess.getPersonAccess().getEqualsSignKeyword_16());
            		
            // InternalGame.g:652:3: ( (lv_action_17_0= ruleAction ) )
            // InternalGame.g:653:4: (lv_action_17_0= ruleAction )
            {
            // InternalGame.g:653:4: (lv_action_17_0= ruleAction )
            // InternalGame.g:654:5: lv_action_17_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getActionActionEnumRuleCall_17_0());
            				
            pushFollow(FOLLOW_9);
            lv_action_17_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_17_0,
            						"uibk.ac.at.qe.dsl.Game.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_18, grammarAccess.getPersonAccess().getSemicolonKeyword_18());
            		
            otherlv_19=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_19());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleObject"
    // InternalGame.g:683:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalGame.g:683:47: (iv_ruleObject= ruleObject EOF )
            // InternalGame.g:684:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalGame.g:690:1: ruleObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleOBJECT_T ) ) otherlv_6= ';' otherlv_7= 'position' otherlv_8= '=' ( (lv_position_9_0= rulePosition_E ) ) otherlv_10= ';' otherlv_11= 'action' otherlv_12= '=' ( (lv_action_13_0= ruleAction ) ) otherlv_14= ';' otherlv_15= '}' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Enumerator lv_type_5_0 = null;

        Enumerator lv_position_9_0 = null;

        Enumerator lv_action_13_0 = null;



        	enterRule();

        try {
            // InternalGame.g:696:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleOBJECT_T ) ) otherlv_6= ';' otherlv_7= 'position' otherlv_8= '=' ( (lv_position_9_0= rulePosition_E ) ) otherlv_10= ';' otherlv_11= 'action' otherlv_12= '=' ( (lv_action_13_0= ruleAction ) ) otherlv_14= ';' otherlv_15= '}' ) )
            // InternalGame.g:697:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleOBJECT_T ) ) otherlv_6= ';' otherlv_7= 'position' otherlv_8= '=' ( (lv_position_9_0= rulePosition_E ) ) otherlv_10= ';' otherlv_11= 'action' otherlv_12= '=' ( (lv_action_13_0= ruleAction ) ) otherlv_14= ';' otherlv_15= '}' )
            {
            // InternalGame.g:697:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleOBJECT_T ) ) otherlv_6= ';' otherlv_7= 'position' otherlv_8= '=' ( (lv_position_9_0= rulePosition_E ) ) otherlv_10= ';' otherlv_11= 'action' otherlv_12= '=' ( (lv_action_13_0= ruleAction ) ) otherlv_14= ';' otherlv_15= '}' )
            // InternalGame.g:698:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleOBJECT_T ) ) otherlv_6= ';' otherlv_7= 'position' otherlv_8= '=' ( (lv_position_9_0= rulePosition_E ) ) otherlv_10= ';' otherlv_11= 'action' otherlv_12= '=' ( (lv_action_13_0= ruleAction ) ) otherlv_14= ';' otherlv_15= '}'
            {
            // InternalGame.g:698:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:699:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:699:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:700:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getObjectAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getObjectAccess().getEqualsSignKeyword_4());
            		
            // InternalGame.g:732:3: ( (lv_type_5_0= ruleOBJECT_T ) )
            // InternalGame.g:733:4: (lv_type_5_0= ruleOBJECT_T )
            {
            // InternalGame.g:733:4: (lv_type_5_0= ruleOBJECT_T )
            // InternalGame.g:734:5: lv_type_5_0= ruleOBJECT_T
            {

            					newCompositeNode(grammarAccess.getObjectAccess().getTypeOBJECT_TEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_type_5_0=ruleOBJECT_T();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"uibk.ac.at.qe.dsl.Game.OBJECT_T");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getObjectAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getObjectAccess().getPositionKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getObjectAccess().getEqualsSignKeyword_8());
            		
            // InternalGame.g:763:3: ( (lv_position_9_0= rulePosition_E ) )
            // InternalGame.g:764:4: (lv_position_9_0= rulePosition_E )
            {
            // InternalGame.g:764:4: (lv_position_9_0= rulePosition_E )
            // InternalGame.g:765:5: lv_position_9_0= rulePosition_E
            {

            					newCompositeNode(grammarAccess.getObjectAccess().getPositionPosition_EEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_position_9_0=rulePosition_E();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectRule());
            					}
            					set(
            						current,
            						"position",
            						lv_position_9_0,
            						"uibk.ac.at.qe.dsl.Game.Position_E");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_10, grammarAccess.getObjectAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getObjectAccess().getActionKeyword_11());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_12, grammarAccess.getObjectAccess().getEqualsSignKeyword_12());
            		
            // InternalGame.g:794:3: ( (lv_action_13_0= ruleAction ) )
            // InternalGame.g:795:4: (lv_action_13_0= ruleAction )
            {
            // InternalGame.g:795:4: (lv_action_13_0= ruleAction )
            // InternalGame.g:796:5: lv_action_13_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getObjectAccess().getActionActionEnumRuleCall_13_0());
            				
            pushFollow(FOLLOW_9);
            lv_action_13_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_13_0,
            						"uibk.ac.at.qe.dsl.Game.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_14, grammarAccess.getObjectAccess().getSemicolonKeyword_14());
            		
            otherlv_15=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "rulePERSON_T"
    // InternalGame.g:825:1: rulePERSON_T returns [Enumerator current=null] : ( (enumLiteral_0= 'male' ) | (enumLiteral_1= 'female' ) ) ;
    public final Enumerator rulePERSON_T() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGame.g:831:2: ( ( (enumLiteral_0= 'male' ) | (enumLiteral_1= 'female' ) ) )
            // InternalGame.g:832:2: ( (enumLiteral_0= 'male' ) | (enumLiteral_1= 'female' ) )
            {
            // InternalGame.g:832:2: ( (enumLiteral_0= 'male' ) | (enumLiteral_1= 'female' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGame.g:833:3: (enumLiteral_0= 'male' )
                    {
                    // InternalGame.g:833:3: (enumLiteral_0= 'male' )
                    // InternalGame.g:834:4: enumLiteral_0= 'male'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getPERSON_TAccess().getMALEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPERSON_TAccess().getMALEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:841:3: (enumLiteral_1= 'female' )
                    {
                    // InternalGame.g:841:3: (enumLiteral_1= 'female' )
                    // InternalGame.g:842:4: enumLiteral_1= 'female'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getPERSON_TAccess().getFEMALEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPERSON_TAccess().getFEMALEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePERSON_T"


    // $ANTLR start "ruleOBJECT_T"
    // InternalGame.g:852:1: ruleOBJECT_T returns [Enumerator current=null] : (enumLiteral_0= 'type_A' ) ;
    public final Enumerator ruleOBJECT_T() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalGame.g:858:2: ( (enumLiteral_0= 'type_A' ) )
            // InternalGame.g:859:2: (enumLiteral_0= 'type_A' )
            {
            // InternalGame.g:859:2: (enumLiteral_0= 'type_A' )
            // InternalGame.g:860:3: enumLiteral_0= 'type_A'
            {
            enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

            			current = grammarAccess.getOBJECT_TAccess().getAEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getOBJECT_TAccess().getAEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOBJECT_T"


    // $ANTLR start "rulePosition_E"
    // InternalGame.g:869:1: rulePosition_E returns [Enumerator current=null] : (enumLiteral_0= 'On table' ) ;
    public final Enumerator rulePosition_E() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalGame.g:875:2: ( (enumLiteral_0= 'On table' ) )
            // InternalGame.g:876:2: (enumLiteral_0= 'On table' )
            {
            // InternalGame.g:876:2: (enumLiteral_0= 'On table' )
            // InternalGame.g:877:3: enumLiteral_0= 'On table'
            {
            enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

            			current = grammarAccess.getPosition_EAccess().getTABLEEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getPosition_EAccess().getTABLEEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePosition_E"


    // $ANTLR start "ruleAction"
    // InternalGame.g:886:1: ruleAction returns [Enumerator current=null] : ( (enumLiteral_0= 'Talk' ) | (enumLiteral_1= 'Pick' ) | (enumLiteral_2= 'use' ) ) ;
    public final Enumerator ruleAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGame.g:892:2: ( ( (enumLiteral_0= 'Talk' ) | (enumLiteral_1= 'Pick' ) | (enumLiteral_2= 'use' ) ) )
            // InternalGame.g:893:2: ( (enumLiteral_0= 'Talk' ) | (enumLiteral_1= 'Pick' ) | (enumLiteral_2= 'use' ) )
            {
            // InternalGame.g:893:2: ( (enumLiteral_0= 'Talk' ) | (enumLiteral_1= 'Pick' ) | (enumLiteral_2= 'use' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt8=1;
                }
                break;
            case 31:
                {
                alt8=2;
                }
                break;
            case 32:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalGame.g:894:3: (enumLiteral_0= 'Talk' )
                    {
                    // InternalGame.g:894:3: (enumLiteral_0= 'Talk' )
                    // InternalGame.g:895:4: enumLiteral_0= 'Talk'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getTALKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionAccess().getTALKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:902:3: (enumLiteral_1= 'Pick' )
                    {
                    // InternalGame.g:902:3: (enumLiteral_1= 'Pick' )
                    // InternalGame.g:903:4: enumLiteral_1= 'Pick'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getPICKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionAccess().getPICKEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGame.g:910:3: (enumLiteral_2= 'use' )
                    {
                    // InternalGame.g:910:3: (enumLiteral_2= 'use' )
                    // InternalGame.g:911:4: enumLiteral_2= 'use'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getUSEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionAccess().getUSEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000045010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000044010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});

}