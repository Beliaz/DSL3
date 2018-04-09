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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'new'", "'{'", "'start'", "'='", "';'", "'final'", "'}'", "'level'", "'goal'", "'next'", "'description'", "'type'", "'response'", "'position'", "'action'", "'Leave'", "'Pick'", "'Use'", "'Talk'"
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
    // InternalGame.g:72:1: ruleGame returns [EObject current=null] : ( (lv_scenes_0_0= ruleScene ) )* ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        EObject lv_scenes_0_0 = null;



        	enterRule();

        try {
            // InternalGame.g:78:2: ( ( (lv_scenes_0_0= ruleScene ) )* )
            // InternalGame.g:79:2: ( (lv_scenes_0_0= ruleScene ) )*
            {
            // InternalGame.g:79:2: ( (lv_scenes_0_0= ruleScene ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGame.g:80:3: (lv_scenes_0_0= ruleScene )
            	    {
            	    // InternalGame.g:80:3: (lv_scenes_0_0= ruleScene )
            	    // InternalGame.g:81:4: lv_scenes_0_0= ruleScene
            	    {

            	    				newCompositeNode(grammarAccess.getGameAccess().getScenesSceneParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_scenes_0_0=ruleScene();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getGameRule());
            	    				}
            	    				add(
            	    					current,
            	    					"scenes",
            	    					lv_scenes_0_0,
            	    					"uibk.ac.at.qe.dsl.Game.Scene");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleScene"
    // InternalGame.g:101:1: entryRuleScene returns [EObject current=null] : iv_ruleScene= ruleScene EOF ;
    public final EObject entryRuleScene() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScene = null;


        try {
            // InternalGame.g:101:46: (iv_ruleScene= ruleScene EOF )
            // InternalGame.g:102:2: iv_ruleScene= ruleScene EOF
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
    // InternalGame.g:108:1: ruleScene returns [EObject current=null] : (otherlv_0= 'new' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declartions_3_0= ruleLevelDeclaration ) )* ( (lv_definitions_4_0= ruleLevelDefinition ) )* otherlv_5= 'start' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' otherlv_9= 'final' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= ';' otherlv_13= '}' ) ;
    public final EObject ruleScene() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_declartions_3_0 = null;

        EObject lv_definitions_4_0 = null;



        	enterRule();

        try {
            // InternalGame.g:114:2: ( (otherlv_0= 'new' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declartions_3_0= ruleLevelDeclaration ) )* ( (lv_definitions_4_0= ruleLevelDefinition ) )* otherlv_5= 'start' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' otherlv_9= 'final' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= ';' otherlv_13= '}' ) )
            // InternalGame.g:115:2: (otherlv_0= 'new' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declartions_3_0= ruleLevelDeclaration ) )* ( (lv_definitions_4_0= ruleLevelDefinition ) )* otherlv_5= 'start' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' otherlv_9= 'final' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= ';' otherlv_13= '}' )
            {
            // InternalGame.g:115:2: (otherlv_0= 'new' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declartions_3_0= ruleLevelDeclaration ) )* ( (lv_definitions_4_0= ruleLevelDefinition ) )* otherlv_5= 'start' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' otherlv_9= 'final' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= ';' otherlv_13= '}' )
            // InternalGame.g:116:3: otherlv_0= 'new' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declartions_3_0= ruleLevelDeclaration ) )* ( (lv_definitions_4_0= ruleLevelDefinition ) )* otherlv_5= 'start' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' otherlv_9= 'final' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= ';' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSceneAccess().getNewKeyword_0());
            		
            // InternalGame.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSceneAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSceneAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:142:3: ( (lv_declartions_3_0= ruleLevelDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGame.g:143:4: (lv_declartions_3_0= ruleLevelDeclaration )
            	    {
            	    // InternalGame.g:143:4: (lv_declartions_3_0= ruleLevelDeclaration )
            	    // InternalGame.g:144:5: lv_declartions_3_0= ruleLevelDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getSceneAccess().getDeclartionsLevelDeclarationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_declartions_3_0=ruleLevelDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSceneRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declartions",
            	    						lv_declartions_3_0,
            	    						"uibk.ac.at.qe.dsl.Game.LevelDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalGame.g:161:3: ( (lv_definitions_4_0= ruleLevelDefinition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGame.g:162:4: (lv_definitions_4_0= ruleLevelDefinition )
            	    {
            	    // InternalGame.g:162:4: (lv_definitions_4_0= ruleLevelDefinition )
            	    // InternalGame.g:163:5: lv_definitions_4_0= ruleLevelDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getSceneAccess().getDefinitionsLevelDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_definitions_4_0=ruleLevelDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSceneRule());
            	    					}
            	    					add(
            	    						current,
            	    						"definitions",
            	    						lv_definitions_4_0,
            	    						"uibk.ac.at.qe.dsl.Game.LevelDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getSceneAccess().getStartKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getSceneAccess().getEqualsSignKeyword_6());
            		
            // InternalGame.g:188:3: ( (otherlv_7= RULE_ID ) )
            // InternalGame.g:189:4: (otherlv_7= RULE_ID )
            {
            // InternalGame.g:189:4: (otherlv_7= RULE_ID )
            // InternalGame.g:190:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_7, grammarAccess.getSceneAccess().getStartLevelLevelDeclarationCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getSceneAccess().getSemicolonKeyword_8());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getSceneAccess().getFinalKeyword_9());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getSceneAccess().getEqualsSignKeyword_10());
            		
            // InternalGame.g:213:3: ( (otherlv_11= RULE_ID ) )
            // InternalGame.g:214:4: (otherlv_11= RULE_ID )
            {
            // InternalGame.g:214:4: (otherlv_11= RULE_ID )
            // InternalGame.g:215:5: otherlv_11= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneRule());
            					}
            				
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_11, grammarAccess.getSceneAccess().getFinalLevelLevelDeclarationCrossReference_11_0());
            				

            }


            }

            otherlv_12=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_12, grammarAccess.getSceneAccess().getSemicolonKeyword_12());
            		
            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getSceneAccess().getRightCurlyBracketKeyword_13());
            		

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
    // InternalGame.g:238:1: entryRuleLevelDeclaration returns [EObject current=null] : iv_ruleLevelDeclaration= ruleLevelDeclaration EOF ;
    public final EObject entryRuleLevelDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevelDeclaration = null;


        try {
            // InternalGame.g:238:57: (iv_ruleLevelDeclaration= ruleLevelDeclaration EOF )
            // InternalGame.g:239:2: iv_ruleLevelDeclaration= ruleLevelDeclaration EOF
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
    // InternalGame.g:245:1: ruleLevelDeclaration returns [EObject current=null] : (otherlv_0= 'level' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleLevelDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGame.g:251:2: ( (otherlv_0= 'level' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalGame.g:252:2: (otherlv_0= 'level' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalGame.g:252:2: (otherlv_0= 'level' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalGame.g:253:3: otherlv_0= 'level' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLevelDeclarationAccess().getLevelKeyword_0());
            		
            // InternalGame.g:257:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGame.g:258:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGame.g:258:4: (lv_name_1_0= RULE_ID )
            // InternalGame.g:259:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

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
    // InternalGame.g:283:1: entryRuleLevelDefinition returns [EObject current=null] : iv_ruleLevelDefinition= ruleLevelDefinition EOF ;
    public final EObject entryRuleLevelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLevelDefinition = null;


        try {
            // InternalGame.g:283:56: (iv_ruleLevelDefinition= ruleLevelDefinition EOF )
            // InternalGame.g:284:2: iv_ruleLevelDefinition= ruleLevelDefinition EOF
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
    // InternalGame.g:290:1: ruleLevelDefinition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_persons_4_0= rulePerson ) )* ( (lv_objects_5_0= ruleObject ) )* ( (lv_actions_6_0= ruleAction_GLOBAL ) )* otherlv_7= 'goal' otherlv_8= '=' ( (lv_goal_9_0= RULE_ID ) ) otherlv_10= ';' (otherlv_11= 'next' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' )? otherlv_15= '}' ) ;
    public final EObject ruleLevelDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_goal_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_description_3_0 = null;

        EObject lv_persons_4_0 = null;

        EObject lv_objects_5_0 = null;

        Enumerator lv_actions_6_0 = null;



        	enterRule();

        try {
            // InternalGame.g:296:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_persons_4_0= rulePerson ) )* ( (lv_objects_5_0= ruleObject ) )* ( (lv_actions_6_0= ruleAction_GLOBAL ) )* otherlv_7= 'goal' otherlv_8= '=' ( (lv_goal_9_0= RULE_ID ) ) otherlv_10= ';' (otherlv_11= 'next' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' )? otherlv_15= '}' ) )
            // InternalGame.g:297:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_persons_4_0= rulePerson ) )* ( (lv_objects_5_0= ruleObject ) )* ( (lv_actions_6_0= ruleAction_GLOBAL ) )* otherlv_7= 'goal' otherlv_8= '=' ( (lv_goal_9_0= RULE_ID ) ) otherlv_10= ';' (otherlv_11= 'next' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' )? otherlv_15= '}' )
            {
            // InternalGame.g:297:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_persons_4_0= rulePerson ) )* ( (lv_objects_5_0= ruleObject ) )* ( (lv_actions_6_0= ruleAction_GLOBAL ) )* otherlv_7= 'goal' otherlv_8= '=' ( (lv_goal_9_0= RULE_ID ) ) otherlv_10= ';' (otherlv_11= 'next' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' )? otherlv_15= '}' )
            // InternalGame.g:298:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_persons_4_0= rulePerson ) )* ( (lv_objects_5_0= ruleObject ) )* ( (lv_actions_6_0= ruleAction_GLOBAL ) )* otherlv_7= 'goal' otherlv_8= '=' ( (lv_goal_9_0= RULE_ID ) ) otherlv_10= ';' (otherlv_11= 'next' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' )? otherlv_15= '}'
            {
            // InternalGame.g:298:3: ( (otherlv_0= RULE_ID ) )
            // InternalGame.g:299:4: (otherlv_0= RULE_ID )
            {
            // InternalGame.g:299:4: (otherlv_0= RULE_ID )
            // InternalGame.g:300:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLevelDefinitionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getLevelDefinitionAccess().getNameLevelDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLevelDefinitionAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getLevelDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:319:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalGame.g:320:4: (lv_description_3_0= ruleDescription )
            {
            // InternalGame.g:320:4: (lv_description_3_0= ruleDescription )
            // InternalGame.g:321:5: lv_description_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getLevelDefinitionAccess().getDescriptionDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_description_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLevelDefinitionRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"uibk.ac.at.qe.dsl.Game.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGame.g:338:3: ( (lv_persons_4_0= rulePerson ) )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:339:4: (lv_persons_4_0= rulePerson )
            	    {
            	    // InternalGame.g:339:4: (lv_persons_4_0= rulePerson )
            	    // InternalGame.g:340:5: lv_persons_4_0= rulePerson
            	    {

            	    					newCompositeNode(grammarAccess.getLevelDefinitionAccess().getPersonsPersonParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_persons_4_0=rulePerson();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLevelDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"persons",
            	    						lv_persons_4_0,
            	    						"uibk.ac.at.qe.dsl.Game.Person");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalGame.g:357:3: ( (lv_objects_5_0= ruleObject ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGame.g:358:4: (lv_objects_5_0= ruleObject )
            	    {
            	    // InternalGame.g:358:4: (lv_objects_5_0= ruleObject )
            	    // InternalGame.g:359:5: lv_objects_5_0= ruleObject
            	    {

            	    					newCompositeNode(grammarAccess.getLevelDefinitionAccess().getObjectsObjectParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_objects_5_0=ruleObject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLevelDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"objects",
            	    						lv_objects_5_0,
            	    						"uibk.ac.at.qe.dsl.Game.Object");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalGame.g:376:3: ( (lv_actions_6_0= ruleAction_GLOBAL ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGame.g:377:4: (lv_actions_6_0= ruleAction_GLOBAL )
            	    {
            	    // InternalGame.g:377:4: (lv_actions_6_0= ruleAction_GLOBAL )
            	    // InternalGame.g:378:5: lv_actions_6_0= ruleAction_GLOBAL
            	    {

            	    					newCompositeNode(grammarAccess.getLevelDefinitionAccess().getActionsAction_GLOBALEnumRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_actions_6_0=ruleAction_GLOBAL();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLevelDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_6_0,
            	    						"uibk.ac.at.qe.dsl.Game.Action_GLOBAL");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getLevelDefinitionAccess().getGoalKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getLevelDefinitionAccess().getEqualsSignKeyword_8());
            		
            // InternalGame.g:403:3: ( (lv_goal_9_0= RULE_ID ) )
            // InternalGame.g:404:4: (lv_goal_9_0= RULE_ID )
            {
            // InternalGame.g:404:4: (lv_goal_9_0= RULE_ID )
            // InternalGame.g:405:5: lv_goal_9_0= RULE_ID
            {
            lv_goal_9_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_goal_9_0, grammarAccess.getLevelDefinitionAccess().getGoalIDTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLevelDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"goal",
            						lv_goal_9_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getLevelDefinitionAccess().getSemicolonKeyword_10());
            		
            // InternalGame.g:425:3: (otherlv_11= 'next' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGame.g:426:4: otherlv_11= 'next' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getLevelDefinitionAccess().getNextKeyword_11_0());
                    			
                    otherlv_12=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getLevelDefinitionAccess().getEqualsSignKeyword_11_1());
                    			
                    // InternalGame.g:434:4: ( (otherlv_13= RULE_ID ) )
                    // InternalGame.g:435:5: (otherlv_13= RULE_ID )
                    {
                    // InternalGame.g:435:5: (otherlv_13= RULE_ID )
                    // InternalGame.g:436:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLevelDefinitionRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_13, grammarAccess.getLevelDefinitionAccess().getNextLevelDeclarationCrossReference_11_2_0());
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getLevelDefinitionAccess().getSemicolonKeyword_11_3());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getLevelDefinitionAccess().getRightCurlyBracketKeyword_12());
            		

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


    // $ANTLR start "entryRuleDescription"
    // InternalGame.g:460:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalGame.g:460:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalGame.g:461:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalGame.g:467:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'description' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGame.g:473:2: ( (otherlv_0= 'description' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalGame.g:474:2: (otherlv_0= 'description' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalGame.g:474:2: (otherlv_0= 'description' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalGame.g:475:3: otherlv_0= 'description' otherlv_1= '=' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDescriptionAccess().getEqualsSignKeyword_1());
            		
            // InternalGame.g:483:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalGame.g:484:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalGame.g:484:4: (lv_name_2_0= RULE_STRING )
            // InternalGame.g:485:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDescriptionAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDescriptionAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRulePerson"
    // InternalGame.g:509:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalGame.g:509:47: (iv_rulePerson= rulePerson EOF )
            // InternalGame.g:510:2: iv_rulePerson= rulePerson EOF
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
    // InternalGame.g:516:1: rulePerson returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'response' otherlv_8= '=' ( (lv_response_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'position' otherlv_12= '=' ( (lv_position_13_0= RULE_STRING ) ) otherlv_14= ';' otherlv_15= 'action' otherlv_16= '=' ( (lv_action_17_0= ruleAction_P ) ) otherlv_18= ';' otherlv_19= '}' ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_response_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_position_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Enumerator lv_action_17_0 = null;



        	enterRule();

        try {
            // InternalGame.g:522:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'response' otherlv_8= '=' ( (lv_response_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'position' otherlv_12= '=' ( (lv_position_13_0= RULE_STRING ) ) otherlv_14= ';' otherlv_15= 'action' otherlv_16= '=' ( (lv_action_17_0= ruleAction_P ) ) otherlv_18= ';' otherlv_19= '}' ) )
            // InternalGame.g:523:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'response' otherlv_8= '=' ( (lv_response_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'position' otherlv_12= '=' ( (lv_position_13_0= RULE_STRING ) ) otherlv_14= ';' otherlv_15= 'action' otherlv_16= '=' ( (lv_action_17_0= ruleAction_P ) ) otherlv_18= ';' otherlv_19= '}' )
            {
            // InternalGame.g:523:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'response' otherlv_8= '=' ( (lv_response_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'position' otherlv_12= '=' ( (lv_position_13_0= RULE_STRING ) ) otherlv_14= ';' otherlv_15= 'action' otherlv_16= '=' ( (lv_action_17_0= ruleAction_P ) ) otherlv_18= ';' otherlv_19= '}' )
            // InternalGame.g:524:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'response' otherlv_8= '=' ( (lv_response_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'position' otherlv_12= '=' ( (lv_position_13_0= RULE_STRING ) ) otherlv_14= ';' otherlv_15= 'action' otherlv_16= '=' ( (lv_action_17_0= ruleAction_P ) ) otherlv_18= ';' otherlv_19= '}'
            {
            // InternalGame.g:524:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:525:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:525:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:526:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getEqualsSignKeyword_4());
            		
            // InternalGame.g:558:3: ( (lv_type_5_0= RULE_ID ) )
            // InternalGame.g:559:4: (lv_type_5_0= RULE_ID )
            {
            // InternalGame.g:559:4: (lv_type_5_0= RULE_ID )
            // InternalGame.g:560:5: lv_type_5_0= RULE_ID
            {
            lv_type_5_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_type_5_0, grammarAccess.getPersonAccess().getTypeIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getPersonAccess().getResponseKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getPersonAccess().getEqualsSignKeyword_8());
            		
            // InternalGame.g:588:3: ( (lv_response_9_0= RULE_STRING ) )
            // InternalGame.g:589:4: (lv_response_9_0= RULE_STRING )
            {
            // InternalGame.g:589:4: (lv_response_9_0= RULE_STRING )
            // InternalGame.g:590:5: lv_response_9_0= RULE_STRING
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

            otherlv_10=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_10, grammarAccess.getPersonAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getPersonAccess().getPositionKeyword_11());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_12, grammarAccess.getPersonAccess().getEqualsSignKeyword_12());
            		
            // InternalGame.g:618:3: ( (lv_position_13_0= RULE_STRING ) )
            // InternalGame.g:619:4: (lv_position_13_0= RULE_STRING )
            {
            // InternalGame.g:619:4: (lv_position_13_0= RULE_STRING )
            // InternalGame.g:620:5: lv_position_13_0= RULE_STRING
            {
            lv_position_13_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_position_13_0, grammarAccess.getPersonAccess().getPositionSTRINGTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"position",
            						lv_position_13_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_14=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_14, grammarAccess.getPersonAccess().getSemicolonKeyword_14());
            		
            otherlv_15=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getPersonAccess().getActionKeyword_15());
            		
            otherlv_16=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_16, grammarAccess.getPersonAccess().getEqualsSignKeyword_16());
            		
            // InternalGame.g:648:3: ( (lv_action_17_0= ruleAction_P ) )
            // InternalGame.g:649:4: (lv_action_17_0= ruleAction_P )
            {
            // InternalGame.g:649:4: (lv_action_17_0= ruleAction_P )
            // InternalGame.g:650:5: lv_action_17_0= ruleAction_P
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getActionAction_PEnumRuleCall_17_0());
            				
            pushFollow(FOLLOW_9);
            lv_action_17_0=ruleAction_P();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_17_0,
            						"uibk.ac.at.qe.dsl.Game.Action_P");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_18, grammarAccess.getPersonAccess().getSemicolonKeyword_18());
            		
            otherlv_19=(Token)match(input,17,FOLLOW_2); 

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
    // InternalGame.g:679:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalGame.g:679:47: (iv_ruleObject= ruleObject EOF )
            // InternalGame.g:680:2: iv_ruleObject= ruleObject EOF
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
    // InternalGame.g:686:1: ruleObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'position' otherlv_8= '=' ( (lv_position_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'action' otherlv_12= '=' ( (lv_action_13_0= ruleAction_O ) ) otherlv_14= ';' otherlv_15= '}' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_type_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_position_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Enumerator lv_action_13_0 = null;



        	enterRule();

        try {
            // InternalGame.g:692:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'position' otherlv_8= '=' ( (lv_position_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'action' otherlv_12= '=' ( (lv_action_13_0= ruleAction_O ) ) otherlv_14= ';' otherlv_15= '}' ) )
            // InternalGame.g:693:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'position' otherlv_8= '=' ( (lv_position_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'action' otherlv_12= '=' ( (lv_action_13_0= ruleAction_O ) ) otherlv_14= ';' otherlv_15= '}' )
            {
            // InternalGame.g:693:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'position' otherlv_8= '=' ( (lv_position_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'action' otherlv_12= '=' ( (lv_action_13_0= ruleAction_O ) ) otherlv_14= ';' otherlv_15= '}' )
            // InternalGame.g:694:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= RULE_ID ) ) otherlv_6= ';' otherlv_7= 'position' otherlv_8= '=' ( (lv_position_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'action' otherlv_12= '=' ( (lv_action_13_0= ruleAction_O ) ) otherlv_14= ';' otherlv_15= '}'
            {
            // InternalGame.g:694:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGame.g:695:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGame.g:695:4: (lv_name_0_0= RULE_ID )
            // InternalGame.g:696:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getObjectAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getObjectAccess().getEqualsSignKeyword_4());
            		
            // InternalGame.g:728:3: ( (lv_type_5_0= RULE_ID ) )
            // InternalGame.g:729:4: (lv_type_5_0= RULE_ID )
            {
            // InternalGame.g:729:4: (lv_type_5_0= RULE_ID )
            // InternalGame.g:730:5: lv_type_5_0= RULE_ID
            {
            lv_type_5_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_type_5_0, grammarAccess.getObjectAccess().getTypeIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getObjectAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getObjectAccess().getPositionKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getObjectAccess().getEqualsSignKeyword_8());
            		
            // InternalGame.g:758:3: ( (lv_position_9_0= RULE_STRING ) )
            // InternalGame.g:759:4: (lv_position_9_0= RULE_STRING )
            {
            // InternalGame.g:759:4: (lv_position_9_0= RULE_STRING )
            // InternalGame.g:760:5: lv_position_9_0= RULE_STRING
            {
            lv_position_9_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_position_9_0, grammarAccess.getObjectAccess().getPositionSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"position",
            						lv_position_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_10, grammarAccess.getObjectAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getObjectAccess().getActionKeyword_11());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_22); 

            			newLeafNode(otherlv_12, grammarAccess.getObjectAccess().getEqualsSignKeyword_12());
            		
            // InternalGame.g:788:3: ( (lv_action_13_0= ruleAction_O ) )
            // InternalGame.g:789:4: (lv_action_13_0= ruleAction_O )
            {
            // InternalGame.g:789:4: (lv_action_13_0= ruleAction_O )
            // InternalGame.g:790:5: lv_action_13_0= ruleAction_O
            {

            					newCompositeNode(grammarAccess.getObjectAccess().getActionAction_OEnumRuleCall_13_0());
            				
            pushFollow(FOLLOW_9);
            lv_action_13_0=ruleAction_O();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_13_0,
            						"uibk.ac.at.qe.dsl.Game.Action_O");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getObjectAccess().getSemicolonKeyword_14());
            		
            otherlv_15=(Token)match(input,17,FOLLOW_2); 

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


    // $ANTLR start "ruleAction_GLOBAL"
    // InternalGame.g:819:1: ruleAction_GLOBAL returns [Enumerator current=null] : (enumLiteral_0= 'Leave' ) ;
    public final Enumerator ruleAction_GLOBAL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalGame.g:825:2: ( (enumLiteral_0= 'Leave' ) )
            // InternalGame.g:826:2: (enumLiteral_0= 'Leave' )
            {
            // InternalGame.g:826:2: (enumLiteral_0= 'Leave' )
            // InternalGame.g:827:3: enumLiteral_0= 'Leave'
            {
            enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

            			current = grammarAccess.getAction_GLOBALAccess().getLEAVEEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getAction_GLOBALAccess().getLEAVEEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleAction_GLOBAL"


    // $ANTLR start "ruleAction_O"
    // InternalGame.g:836:1: ruleAction_O returns [Enumerator current=null] : ( (enumLiteral_0= 'Pick' ) | (enumLiteral_1= 'Use' ) ) ;
    public final Enumerator ruleAction_O() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGame.g:842:2: ( ( (enumLiteral_0= 'Pick' ) | (enumLiteral_1= 'Use' ) ) )
            // InternalGame.g:843:2: ( (enumLiteral_0= 'Pick' ) | (enumLiteral_1= 'Use' ) )
            {
            // InternalGame.g:843:2: ( (enumLiteral_0= 'Pick' ) | (enumLiteral_1= 'Use' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            else if ( (LA8_0==28) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGame.g:844:3: (enumLiteral_0= 'Pick' )
                    {
                    // InternalGame.g:844:3: (enumLiteral_0= 'Pick' )
                    // InternalGame.g:845:4: enumLiteral_0= 'Pick'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getAction_OAccess().getPICKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAction_OAccess().getPICKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:852:3: (enumLiteral_1= 'Use' )
                    {
                    // InternalGame.g:852:3: (enumLiteral_1= 'Use' )
                    // InternalGame.g:853:4: enumLiteral_1= 'Use'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getAction_OAccess().getUSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAction_OAccess().getUSEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleAction_O"


    // $ANTLR start "ruleAction_P"
    // InternalGame.g:863:1: ruleAction_P returns [Enumerator current=null] : (enumLiteral_0= 'Talk' ) ;
    public final Enumerator ruleAction_P() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalGame.g:869:2: ( (enumLiteral_0= 'Talk' ) )
            // InternalGame.g:870:2: (enumLiteral_0= 'Talk' )
            {
            // InternalGame.g:870:2: (enumLiteral_0= 'Talk' )
            // InternalGame.g:871:3: enumLiteral_0= 'Talk'
            {
            enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

            			current = grammarAccess.getAction_PAccess().getTALKEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getAction_PAccess().getTALKEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleAction_P"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\1\16\1\uffff\1\14\1\26\1\16\1\4\1\17\1\27\1\uffff";
    static final String dfa_3s = "\1\32\1\16\1\uffff\1\14\1\26\1\16\1\4\1\17\1\30\1\uffff";
    static final String dfa_4s = "\2\uffff\1\2\6\uffff\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\16\uffff\1\2\6\uffff\1\2",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 338:3: ( (lv_persons_4_0= rulePerson ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000042010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004080010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018000000L});

}