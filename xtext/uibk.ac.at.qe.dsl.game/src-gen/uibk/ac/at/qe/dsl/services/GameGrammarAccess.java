/*
 * generated by Xtext 2.13.0
 */
package uibk.ac.at.qe.dsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class GameGrammarAccess extends AbstractGrammarElementFinder {
	
	public class GameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uibk.ac.at.qe.dsl.Game.Game");
		private final Assignment cScenesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cScenesSceneParserRuleCall_0 = (RuleCall)cScenesAssignment.eContents().get(0);
		
		///*
		// * With our language it is possible to describe a simple text based game
		// * 
		// * A game is build by different person and objects. For each of them different
		// * actions are available e.g. talk, pick, use
		// * 
		// * Also global actions are possible e.g. leave
		// * 
		// */ /* 
		// * A game is build by a scene
		// * Each scene is a sequence of different levels
		// */ Game:
		//	scenes+=Scene*;
		@Override public ParserRule getRule() { return rule; }
		
		//scenes+=Scene*
		public Assignment getScenesAssignment() { return cScenesAssignment; }
		
		//Scene
		public RuleCall getScenesSceneParserRuleCall_0() { return cScenesSceneParserRuleCall_0; }
	}
	public class SceneElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uibk.ac.at.qe.dsl.Game.Scene");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNewKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDeclartionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDeclartionsLevelDeclarationParserRuleCall_3_0 = (RuleCall)cDeclartionsAssignment_3.eContents().get(0);
		private final Assignment cDefinitionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDefinitionsLevelDefinitionParserRuleCall_4_0 = (RuleCall)cDefinitionsAssignment_4.eContents().get(0);
		private final Keyword cStartKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cEqualsSignKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cStartLevelAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cStartLevelLevelDeclarationCrossReference_7_0 = (CrossReference)cStartLevelAssignment_7.eContents().get(0);
		private final RuleCall cStartLevelLevelDeclarationIDTerminalRuleCall_7_0_1 = (RuleCall)cStartLevelLevelDeclarationCrossReference_7_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cFinalKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cEqualsSignKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cFinalLevelAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final CrossReference cFinalLevelLevelDeclarationCrossReference_11_0 = (CrossReference)cFinalLevelAssignment_11.eContents().get(0);
		private final RuleCall cFinalLevelLevelDeclarationIDTerminalRuleCall_11_0_1 = (RuleCall)cFinalLevelLevelDeclarationCrossReference_11_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cRightCurlyBracketKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		///*
		// * A scene contains multiple levels
		// * 
		// * First the levels are declared to get an overview of the levels at a level
		// * 
		// * After each level is defined
		// * 
		// * Also the start and final level are set
		// */ Scene:
		//	'new' name=ID
		//	'{'
		//	declartions+=LevelDeclaration*
		//	definitions+=LevelDefinition*
		//	'start' '=' startLevel=[LevelDeclaration] ';'
		//	'final' '=' finalLevel=[LevelDeclaration] ';'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'new' name=ID '{' declartions+=LevelDeclaration* definitions+=LevelDefinition* 'start' '=' startLevel=[LevelDeclaration]
		//';' 'final' '=' finalLevel=[LevelDeclaration] ';' '}'
		public Group getGroup() { return cGroup; }
		
		//'new'
		public Keyword getNewKeyword_0() { return cNewKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//declartions+=LevelDeclaration*
		public Assignment getDeclartionsAssignment_3() { return cDeclartionsAssignment_3; }
		
		//LevelDeclaration
		public RuleCall getDeclartionsLevelDeclarationParserRuleCall_3_0() { return cDeclartionsLevelDeclarationParserRuleCall_3_0; }
		
		//definitions+=LevelDefinition*
		public Assignment getDefinitionsAssignment_4() { return cDefinitionsAssignment_4; }
		
		//LevelDefinition
		public RuleCall getDefinitionsLevelDefinitionParserRuleCall_4_0() { return cDefinitionsLevelDefinitionParserRuleCall_4_0; }
		
		//'start'
		public Keyword getStartKeyword_5() { return cStartKeyword_5; }
		
		//'='
		public Keyword getEqualsSignKeyword_6() { return cEqualsSignKeyword_6; }
		
		//startLevel=[LevelDeclaration]
		public Assignment getStartLevelAssignment_7() { return cStartLevelAssignment_7; }
		
		//[LevelDeclaration]
		public CrossReference getStartLevelLevelDeclarationCrossReference_7_0() { return cStartLevelLevelDeclarationCrossReference_7_0; }
		
		//ID
		public RuleCall getStartLevelLevelDeclarationIDTerminalRuleCall_7_0_1() { return cStartLevelLevelDeclarationIDTerminalRuleCall_7_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_8() { return cSemicolonKeyword_8; }
		
		//'final'
		public Keyword getFinalKeyword_9() { return cFinalKeyword_9; }
		
		//'='
		public Keyword getEqualsSignKeyword_10() { return cEqualsSignKeyword_10; }
		
		//finalLevel=[LevelDeclaration]
		public Assignment getFinalLevelAssignment_11() { return cFinalLevelAssignment_11; }
		
		//[LevelDeclaration]
		public CrossReference getFinalLevelLevelDeclarationCrossReference_11_0() { return cFinalLevelLevelDeclarationCrossReference_11_0; }
		
		//ID
		public RuleCall getFinalLevelLevelDeclarationIDTerminalRuleCall_11_0_1() { return cFinalLevelLevelDeclarationIDTerminalRuleCall_11_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_12() { return cSemicolonKeyword_12; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_13() { return cRightCurlyBracketKeyword_13; }
	}
	public class LevelDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uibk.ac.at.qe.dsl.Game.LevelDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLevelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		///*
		// * declaring a level by some id
		// */ LevelDeclaration:
		//	'level' name=ID ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'level' name=ID ';'
		public Group getGroup() { return cGroup; }
		
		//'level'
		public Keyword getLevelKeyword_0() { return cLevelKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class LevelDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uibk.ac.at.qe.dsl.Game.LevelDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cNameLevelDeclarationCrossReference_0_0 = (CrossReference)cNameAssignment_0.eContents().get(0);
		private final RuleCall cNameLevelDeclarationIDTerminalRuleCall_0_0_1 = (RuleCall)cNameLevelDeclarationCrossReference_0_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDescriptionDescriptionParserRuleCall_3_0 = (RuleCall)cDescriptionAssignment_3.eContents().get(0);
		private final Assignment cPersonsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPersonsPersonParserRuleCall_4_0 = (RuleCall)cPersonsAssignment_4.eContents().get(0);
		private final Assignment cObjectsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cObjectsMy_ObjectParserRuleCall_5_0 = (RuleCall)cObjectsAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cNextKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cEqualsSignKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cNextAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final CrossReference cNextLevelDeclarationCrossReference_6_2_0 = (CrossReference)cNextAssignment_6_2.eContents().get(0);
		private final RuleCall cNextLevelDeclarationIDTerminalRuleCall_6_2_0_1 = (RuleCall)cNextLevelDeclarationCrossReference_6_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_6_3 = (Keyword)cGroup_6.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		///*
		// * A level definition contains multiple elements
		// * 
		// * A description which will be given to the user
		// * 
		// * Multiple persons
		// * 
		// * Multiple objects
		// * 
		// * Global actions
		// * 
		// * A level can contain an optional next level
		// */ LevelDefinition:
		//	name=[LevelDeclaration] '='
		//	'{'
		//	description=Description
		//	persons+=Person*
		//	objects+=My_Object* ('next' '=' next=[LevelDeclaration] ';')?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//name=[LevelDeclaration] '=' '{' description=Description persons+=Person* objects+=My_Object* ('next' '='
		//next=[LevelDeclaration] ';')? '}'
		public Group getGroup() { return cGroup; }
		
		//name=[LevelDeclaration]
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//[LevelDeclaration]
		public CrossReference getNameLevelDeclarationCrossReference_0_0() { return cNameLevelDeclarationCrossReference_0_0; }
		
		//ID
		public RuleCall getNameLevelDeclarationIDTerminalRuleCall_0_0_1() { return cNameLevelDeclarationIDTerminalRuleCall_0_0_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//description=Description
		public Assignment getDescriptionAssignment_3() { return cDescriptionAssignment_3; }
		
		//Description
		public RuleCall getDescriptionDescriptionParserRuleCall_3_0() { return cDescriptionDescriptionParserRuleCall_3_0; }
		
		//persons+=Person*
		public Assignment getPersonsAssignment_4() { return cPersonsAssignment_4; }
		
		//Person
		public RuleCall getPersonsPersonParserRuleCall_4_0() { return cPersonsPersonParserRuleCall_4_0; }
		
		//objects+=My_Object*
		public Assignment getObjectsAssignment_5() { return cObjectsAssignment_5; }
		
		//My_Object
		public RuleCall getObjectsMy_ObjectParserRuleCall_5_0() { return cObjectsMy_ObjectParserRuleCall_5_0; }
		
		//('next' '=' next=[LevelDeclaration] ';')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'next'
		public Keyword getNextKeyword_6_0() { return cNextKeyword_6_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_6_1() { return cEqualsSignKeyword_6_1; }
		
		//next=[LevelDeclaration]
		public Assignment getNextAssignment_6_2() { return cNextAssignment_6_2; }
		
		//[LevelDeclaration]
		public CrossReference getNextLevelDeclarationCrossReference_6_2_0() { return cNextLevelDeclarationCrossReference_6_2_0; }
		
		//ID
		public RuleCall getNextLevelDeclarationIDTerminalRuleCall_6_2_0_1() { return cNextLevelDeclarationIDTerminalRuleCall_6_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_6_3() { return cSemicolonKeyword_6_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class DescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uibk.ac.at.qe.dsl.Game.Description");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDescriptionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		///*
		// * Description of a level
		// */ Description:
		//	'description' '=' name=STRING ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'description' '=' name=STRING ';'
		public Group getGroup() { return cGroup; }
		
		//'description'
		public Keyword getDescriptionKeyword_0() { return cDescriptionKeyword_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class PersonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uibk.ac.at.qe.dsl.Game.Person");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cTypeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cEqualsSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTypeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTypeIDTerminalRuleCall_5_0 = (RuleCall)cTypeAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cResponseKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cLeftCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cResponseAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cResponsePerson_RParserRuleCall_9_0 = (RuleCall)cResponseAssignment_9.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cPositionKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cEqualsSignKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Assignment cPositionAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cPositionSTRINGTerminalRuleCall_13_0 = (RuleCall)cPositionAssignment_13.eContents().get(0);
		private final Keyword cSemicolonKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cActionKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cActionAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cActionAction_PEnumRuleCall_17_0 = (RuleCall)cActionAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Group cGroup_19 = (Group)cGroup.eContents().get(19);
		private final Keyword cFinalKeyword_19_0 = (Keyword)cGroup_19.eContents().get(0);
		private final Keyword cEqualsSignKeyword_19_1 = (Keyword)cGroup_19.eContents().get(1);
		private final Assignment cFinalObjectAssignment_19_2 = (Assignment)cGroup_19.eContents().get(2);
		private final CrossReference cFinalObjectMy_ObjectCrossReference_19_2_0 = (CrossReference)cFinalObjectAssignment_19_2.eContents().get(0);
		private final RuleCall cFinalObjectMy_ObjectIDTerminalRuleCall_19_2_0_1 = (RuleCall)cFinalObjectMy_ObjectCrossReference_19_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_19_3 = (Keyword)cGroup_19.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_20 = (Keyword)cGroup.eContents().get(20);
		
		///*
		// * A person is build by an Id, different responses, a position, an action, can hold different objects and 
		// * if the user has a certain object he finishes the level
		// */ Person:
		//	name=ID '='
		//	'{'
		//	'type' '=' type=ID ';'
		//	'response' '{' response+=Person_R* '}'
		//	'position' '=' position=STRING ';'
		//	'action' '=' action=Action_P ';' ('final' '=' finalObject=[My_Object] ';')?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID '=' '{' 'type' '=' type=ID ';' 'response' '{' response+=Person_R* '}' 'position' '=' position=STRING ';'
		//'action' '=' action=Action_P ';' ('final' '=' finalObject=[My_Object] ';')? '}'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'type'
		public Keyword getTypeKeyword_3() { return cTypeKeyword_3; }
		
		//'='
		public Keyword getEqualsSignKeyword_4() { return cEqualsSignKeyword_4; }
		
		//type=ID
		public Assignment getTypeAssignment_5() { return cTypeAssignment_5; }
		
		//ID
		public RuleCall getTypeIDTerminalRuleCall_5_0() { return cTypeIDTerminalRuleCall_5_0; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
		
		//'response'
		public Keyword getResponseKeyword_7() { return cResponseKeyword_7; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_8() { return cLeftCurlyBracketKeyword_8; }
		
		//response+=Person_R*
		public Assignment getResponseAssignment_9() { return cResponseAssignment_9; }
		
		//Person_R
		public RuleCall getResponsePerson_RParserRuleCall_9_0() { return cResponsePerson_RParserRuleCall_9_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
		
		//'position'
		public Keyword getPositionKeyword_11() { return cPositionKeyword_11; }
		
		//'='
		public Keyword getEqualsSignKeyword_12() { return cEqualsSignKeyword_12; }
		
		//position=STRING
		public Assignment getPositionAssignment_13() { return cPositionAssignment_13; }
		
		//STRING
		public RuleCall getPositionSTRINGTerminalRuleCall_13_0() { return cPositionSTRINGTerminalRuleCall_13_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14() { return cSemicolonKeyword_14; }
		
		//'action'
		public Keyword getActionKeyword_15() { return cActionKeyword_15; }
		
		//'='
		public Keyword getEqualsSignKeyword_16() { return cEqualsSignKeyword_16; }
		
		//action=Action_P
		public Assignment getActionAssignment_17() { return cActionAssignment_17; }
		
		//Action_P
		public RuleCall getActionAction_PEnumRuleCall_17_0() { return cActionAction_PEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//('final' '=' finalObject=[My_Object] ';')?
		public Group getGroup_19() { return cGroup_19; }
		
		//'final'
		public Keyword getFinalKeyword_19_0() { return cFinalKeyword_19_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_19_1() { return cEqualsSignKeyword_19_1; }
		
		//finalObject=[My_Object]
		public Assignment getFinalObjectAssignment_19_2() { return cFinalObjectAssignment_19_2; }
		
		//[My_Object]
		public CrossReference getFinalObjectMy_ObjectCrossReference_19_2_0() { return cFinalObjectMy_ObjectCrossReference_19_2_0; }
		
		//ID
		public RuleCall getFinalObjectMy_ObjectIDTerminalRuleCall_19_2_0_1() { return cFinalObjectMy_ObjectIDTerminalRuleCall_19_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_19_3() { return cSemicolonKeyword_19_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_20() { return cRightCurlyBracketKeyword_20; }
	}
	public class Person_RElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uibk.ac.at.qe.dsl.Game.Person_R");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cItemAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cItemSTRINGTerminalRuleCall_0_0 = (RuleCall)cItemAssignment_0.eContents().get(0);
		private final Keyword cCommaKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		///*
		// * Person responses
		// */ Person_R:
		//	item=STRING ','?;
		@Override public ParserRule getRule() { return rule; }
		
		//item=STRING ','?
		public Group getGroup() { return cGroup; }
		
		//item=STRING
		public Assignment getItemAssignment_0() { return cItemAssignment_0; }
		
		//STRING
		public RuleCall getItemSTRINGTerminalRuleCall_0_0() { return cItemSTRINGTerminalRuleCall_0_0; }
		
		//','?
		public Keyword getCommaKeyword_1() { return cCommaKeyword_1; }
	}
	public class Person_OElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uibk.ac.at.qe.dsl.Game.Person_O");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cItemsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cItemsMy_ObjectCrossReference_0_0 = (CrossReference)cItemsAssignment_0.eContents().get(0);
		private final RuleCall cItemsMy_ObjectIDTerminalRuleCall_0_0_1 = (RuleCall)cItemsMy_ObjectCrossReference_0_0.eContents().get(1);
		private final Keyword cCommaKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		///*
		// * Person objects
		// */ Person_O:
		//	items=[My_Object] ','?;
		@Override public ParserRule getRule() { return rule; }
		
		//items=[My_Object] ','?
		public Group getGroup() { return cGroup; }
		
		//items=[My_Object]
		public Assignment getItemsAssignment_0() { return cItemsAssignment_0; }
		
		//[My_Object]
		public CrossReference getItemsMy_ObjectCrossReference_0_0() { return cItemsMy_ObjectCrossReference_0_0; }
		
		//ID
		public RuleCall getItemsMy_ObjectIDTerminalRuleCall_0_0_1() { return cItemsMy_ObjectIDTerminalRuleCall_0_0_1; }
		
		//','?
		public Keyword getCommaKeyword_1() { return cCommaKeyword_1; }
	}
	public class My_ObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uibk.ac.at.qe.dsl.Game.My_Object");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cTypeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cEqualsSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTypeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTypeIDTerminalRuleCall_5_0 = (RuleCall)cTypeAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cResponseKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cEqualsSignKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cResponseAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cResponseSTRINGTerminalRuleCall_9_0 = (RuleCall)cResponseAssignment_9.eContents().get(0);
		private final Keyword cSemicolonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cPositionKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cEqualsSignKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Assignment cPositionAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cPositionSTRINGTerminalRuleCall_13_0 = (RuleCall)cPositionAssignment_13.eContents().get(0);
		private final Keyword cSemicolonKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cActionKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cEqualsSignKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cActionAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cActionAction_OEnumRuleCall_17_0 = (RuleCall)cActionAssignment_17.eContents().get(0);
		private final Keyword cSemicolonKeyword_18 = (Keyword)cGroup.eContents().get(18);
		private final Keyword cRightCurlyBracketKeyword_19 = (Keyword)cGroup.eContents().get(19);
		
		///*
		// * An object is build by an Id, a position and an action
		// */ My_Object:
		//	name=ID '='
		//	'{'
		//	'type' '=' type=ID ';'
		//	'response' '=' response=STRING ';'
		//	'position' '=' position=STRING ';'
		//	'action' '=' action=Action_O ';'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID '=' '{' 'type' '=' type=ID ';' 'response' '=' response=STRING ';' 'position' '=' position=STRING ';' 'action'
		//'=' action=Action_O ';' '}'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'type'
		public Keyword getTypeKeyword_3() { return cTypeKeyword_3; }
		
		//'='
		public Keyword getEqualsSignKeyword_4() { return cEqualsSignKeyword_4; }
		
		//type=ID
		public Assignment getTypeAssignment_5() { return cTypeAssignment_5; }
		
		//ID
		public RuleCall getTypeIDTerminalRuleCall_5_0() { return cTypeIDTerminalRuleCall_5_0; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
		
		//'response'
		public Keyword getResponseKeyword_7() { return cResponseKeyword_7; }
		
		//'='
		public Keyword getEqualsSignKeyword_8() { return cEqualsSignKeyword_8; }
		
		//response=STRING
		public Assignment getResponseAssignment_9() { return cResponseAssignment_9; }
		
		//STRING
		public RuleCall getResponseSTRINGTerminalRuleCall_9_0() { return cResponseSTRINGTerminalRuleCall_9_0; }
		
		//';'
		public Keyword getSemicolonKeyword_10() { return cSemicolonKeyword_10; }
		
		//'position'
		public Keyword getPositionKeyword_11() { return cPositionKeyword_11; }
		
		//'='
		public Keyword getEqualsSignKeyword_12() { return cEqualsSignKeyword_12; }
		
		//position=STRING
		public Assignment getPositionAssignment_13() { return cPositionAssignment_13; }
		
		//STRING
		public RuleCall getPositionSTRINGTerminalRuleCall_13_0() { return cPositionSTRINGTerminalRuleCall_13_0; }
		
		//';'
		public Keyword getSemicolonKeyword_14() { return cSemicolonKeyword_14; }
		
		//'action'
		public Keyword getActionKeyword_15() { return cActionKeyword_15; }
		
		//'='
		public Keyword getEqualsSignKeyword_16() { return cEqualsSignKeyword_16; }
		
		//action=Action_O
		public Assignment getActionAssignment_17() { return cActionAssignment_17; }
		
		//Action_O
		public RuleCall getActionAction_OEnumRuleCall_17_0() { return cActionAction_OEnumRuleCall_17_0; }
		
		//';'
		public Keyword getSemicolonKeyword_18() { return cSemicolonKeyword_18; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_19() { return cRightCurlyBracketKeyword_19; }
	}
	
	public class Action_OElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "uibk.ac.at.qe.dsl.Game.Action_O");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cUSEEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cUSEUseKeyword_0_0 = (Keyword)cUSEEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cINSPECTEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cINSPECTInspectKeyword_1_0 = (Keyword)cINSPECTEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Action_O:
		//	USE='Use' | INSPECT='Inspect';
		public EnumRule getRule() { return rule; }
		
		//USE='Use' | INSPECT='Inspect'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//USE='Use'
		public EnumLiteralDeclaration getUSEEnumLiteralDeclaration_0() { return cUSEEnumLiteralDeclaration_0; }
		
		//'Use'
		public Keyword getUSEUseKeyword_0_0() { return cUSEUseKeyword_0_0; }
		
		//INSPECT='Inspect'
		public EnumLiteralDeclaration getINSPECTEnumLiteralDeclaration_1() { return cINSPECTEnumLiteralDeclaration_1; }
		
		//'Inspect'
		public Keyword getINSPECTInspectKeyword_1_0() { return cINSPECTInspectKeyword_1_0; }
	}
	public class Action_PElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "uibk.ac.at.qe.dsl.Game.Action_P");
		private final EnumLiteralDeclaration cTALKEnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cTALKTalkKeyword_0 = (Keyword)cTALKEnumLiteralDeclaration.eContents().get(0);
		
		//enum Action_P:
		//	TALK='Talk';
		public EnumRule getRule() { return rule; }
		
		//TALK='Talk'
		public EnumLiteralDeclaration getTALKEnumLiteralDeclaration() { return cTALKEnumLiteralDeclaration; }
		
		//'Talk'
		public Keyword getTALKTalkKeyword_0() { return cTALKTalkKeyword_0; }
	}
	
	private final GameElements pGame;
	private final SceneElements pScene;
	private final LevelDeclarationElements pLevelDeclaration;
	private final LevelDefinitionElements pLevelDefinition;
	private final DescriptionElements pDescription;
	private final PersonElements pPerson;
	private final Person_RElements pPerson_R;
	private final Person_OElements pPerson_O;
	private final My_ObjectElements pMy_Object;
	private final Action_OElements eAction_O;
	private final Action_PElements eAction_P;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public GameGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGame = new GameElements();
		this.pScene = new SceneElements();
		this.pLevelDeclaration = new LevelDeclarationElements();
		this.pLevelDefinition = new LevelDefinitionElements();
		this.pDescription = new DescriptionElements();
		this.pPerson = new PersonElements();
		this.pPerson_R = new Person_RElements();
		this.pPerson_O = new Person_OElements();
		this.pMy_Object = new My_ObjectElements();
		this.eAction_O = new Action_OElements();
		this.eAction_P = new Action_PElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("uibk.ac.at.qe.dsl.Game".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	///*
	// * With our language it is possible to describe a simple text based game
	// * 
	// * A game is build by different person and objects. For each of them different
	// * actions are available e.g. talk, pick, use
	// * 
	// * Also global actions are possible e.g. leave
	// * 
	// */ /* 
	// * A game is build by a scene
	// * Each scene is a sequence of different levels
	// */ Game:
	//	scenes+=Scene*;
	public GameElements getGameAccess() {
		return pGame;
	}
	
	public ParserRule getGameRule() {
		return getGameAccess().getRule();
	}
	
	///*
	// * A scene contains multiple levels
	// * 
	// * First the levels are declared to get an overview of the levels at a level
	// * 
	// * After each level is defined
	// * 
	// * Also the start and final level are set
	// */ Scene:
	//	'new' name=ID
	//	'{'
	//	declartions+=LevelDeclaration*
	//	definitions+=LevelDefinition*
	//	'start' '=' startLevel=[LevelDeclaration] ';'
	//	'final' '=' finalLevel=[LevelDeclaration] ';'
	//	'}';
	public SceneElements getSceneAccess() {
		return pScene;
	}
	
	public ParserRule getSceneRule() {
		return getSceneAccess().getRule();
	}
	
	///*
	// * declaring a level by some id
	// */ LevelDeclaration:
	//	'level' name=ID ';';
	public LevelDeclarationElements getLevelDeclarationAccess() {
		return pLevelDeclaration;
	}
	
	public ParserRule getLevelDeclarationRule() {
		return getLevelDeclarationAccess().getRule();
	}
	
	///*
	// * A level definition contains multiple elements
	// * 
	// * A description which will be given to the user
	// * 
	// * Multiple persons
	// * 
	// * Multiple objects
	// * 
	// * Global actions
	// * 
	// * A level can contain an optional next level
	// */ LevelDefinition:
	//	name=[LevelDeclaration] '='
	//	'{'
	//	description=Description
	//	persons+=Person*
	//	objects+=My_Object* ('next' '=' next=[LevelDeclaration] ';')?
	//	'}';
	public LevelDefinitionElements getLevelDefinitionAccess() {
		return pLevelDefinition;
	}
	
	public ParserRule getLevelDefinitionRule() {
		return getLevelDefinitionAccess().getRule();
	}
	
	///*
	// * Description of a level
	// */ Description:
	//	'description' '=' name=STRING ';';
	public DescriptionElements getDescriptionAccess() {
		return pDescription;
	}
	
	public ParserRule getDescriptionRule() {
		return getDescriptionAccess().getRule();
	}
	
	///*
	// * A person is build by an Id, different responses, a position, an action, can hold different objects and 
	// * if the user has a certain object he finishes the level
	// */ Person:
	//	name=ID '='
	//	'{'
	//	'type' '=' type=ID ';'
	//	'response' '{' response+=Person_R* '}'
	//	'position' '=' position=STRING ';'
	//	'action' '=' action=Action_P ';' ('final' '=' finalObject=[My_Object] ';')?
	//	'}';
	public PersonElements getPersonAccess() {
		return pPerson;
	}
	
	public ParserRule getPersonRule() {
		return getPersonAccess().getRule();
	}
	
	///*
	// * Person responses
	// */ Person_R:
	//	item=STRING ','?;
	public Person_RElements getPerson_RAccess() {
		return pPerson_R;
	}
	
	public ParserRule getPerson_RRule() {
		return getPerson_RAccess().getRule();
	}
	
	///*
	// * Person objects
	// */ Person_O:
	//	items=[My_Object] ','?;
	public Person_OElements getPerson_OAccess() {
		return pPerson_O;
	}
	
	public ParserRule getPerson_ORule() {
		return getPerson_OAccess().getRule();
	}
	
	///*
	// * An object is build by an Id, a position and an action
	// */ My_Object:
	//	name=ID '='
	//	'{'
	//	'type' '=' type=ID ';'
	//	'response' '=' response=STRING ';'
	//	'position' '=' position=STRING ';'
	//	'action' '=' action=Action_O ';'
	//	'}';
	public My_ObjectElements getMy_ObjectAccess() {
		return pMy_Object;
	}
	
	public ParserRule getMy_ObjectRule() {
		return getMy_ObjectAccess().getRule();
	}
	
	//enum Action_O:
	//	USE='Use' | INSPECT='Inspect';
	public Action_OElements getAction_OAccess() {
		return eAction_O;
	}
	
	public EnumRule getAction_ORule() {
		return getAction_OAccess().getRule();
	}
	
	//enum Action_P:
	//	TALK='Talk';
	public Action_PElements getAction_PAccess() {
		return eAction_P;
	}
	
	public EnumRule getAction_PRule() {
		return getAction_PAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
