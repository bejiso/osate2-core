package org.osate.xtext.aadl2.properties.parser.antlr.internal; 

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
import org.osate.xtext.aadl2.properties.services.PropertiesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPropertiesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'property'", "'set'", "'is'", "'with'", "','", "';'", "'end'", "':'", "'type'", "'aadlboolean'", "'aadlstring'", "'enumeration'", "'('", "')'", "'units'", "'=>'", "'aadlreal'", "'aadlinteger'", "'range'", "'of'", "'classifier'", "'{'", "'}'", "'system'", "'thread'", "'group'", "'process'", "'data'", "'processor'", "'memory'", "'device'", "'bus'", "'virtual'", "'subprogram'", "'feature'", "'package'", "'parameter'", "'port'", "'calls'", "'event'", "'flow'", "'implementation'", "'mode'", "'prototype'", "'to'", "'abstract'", "'access'", "'reference'", "'record'", "'inherit'", "'applies'", "'all'", "'list'", "'constant'", "'+=>'", "'.'", "'in'", "'modes'", "'['", "']'", "'true'", "'false'", "'compute'", "'annex'", "'and'", "'or'", "'not'", "'+'", "'-'", "'..'", "'delta'", "'::'", "'*'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=7;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalPropertiesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPropertiesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPropertiesParser.tokenNames; }
    public String getGrammarFileName() { return "../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private PropertiesGrammarAccess grammarAccess;
     	
        public InternalPropertiesParser(TokenStream input, PropertiesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PModel";	
       	}
       	
       	@Override
       	protected PropertiesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePModel"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:74:1: entryRulePModel returns [EObject current=null] : iv_rulePModel= rulePModel EOF ;
    public final EObject entryRulePModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePModel = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:75:2: (iv_rulePModel= rulePModel EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:76:2: iv_rulePModel= rulePModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPModelRule()); 
            }
            pushFollow(FOLLOW_rulePModel_in_entryRulePModel81);
            iv_rulePModel=rulePModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePModel91); if (state.failed) return current;

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
    // $ANTLR end "entryRulePModel"


    // $ANTLR start "rulePModel"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:83:1: rulePModel returns [EObject current=null] : (this_PropertySet_0= rulePropertySet | this_ContainedPropertyAssociation_1= ruleContainedPropertyAssociation | this_BasicPropertyAssociation_2= ruleBasicPropertyAssociation | this_PropertyAssociation_3= rulePropertyAssociation ) ;
    public final EObject rulePModel() throws RecognitionException {
        EObject current = null;

        EObject this_PropertySet_0 = null;

        EObject this_ContainedPropertyAssociation_1 = null;

        EObject this_BasicPropertyAssociation_2 = null;

        EObject this_PropertyAssociation_3 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:86:28: ( (this_PropertySet_0= rulePropertySet | this_ContainedPropertyAssociation_1= ruleContainedPropertyAssociation | this_BasicPropertyAssociation_2= ruleBasicPropertyAssociation | this_PropertyAssociation_3= rulePropertyAssociation ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:87:1: (this_PropertySet_0= rulePropertySet | this_ContainedPropertyAssociation_1= ruleContainedPropertyAssociation | this_BasicPropertyAssociation_2= ruleBasicPropertyAssociation | this_PropertyAssociation_3= rulePropertyAssociation )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:87:1: (this_PropertySet_0= rulePropertySet | this_ContainedPropertyAssociation_1= ruleContainedPropertyAssociation | this_BasicPropertyAssociation_2= ruleBasicPropertyAssociation | this_PropertyAssociation_3= rulePropertyAssociation )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                int LA1_2 = input.LA(2);

                if ( (synpred2_InternalProperties()) ) {
                    alt1=2;
                }
                else if ( (synpred3_InternalProperties()) ) {
                    alt1=3;
                }
                else if ( (true) ) {
                    alt1=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:88:2: this_PropertySet_0= rulePropertySet
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPModelAccess().getPropertySetParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePropertySet_in_rulePModel141);
                    this_PropertySet_0=rulePropertySet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PropertySet_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:101:2: this_ContainedPropertyAssociation_1= ruleContainedPropertyAssociation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPModelAccess().getContainedPropertyAssociationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleContainedPropertyAssociation_in_rulePModel171);
                    this_ContainedPropertyAssociation_1=ruleContainedPropertyAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ContainedPropertyAssociation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:114:2: this_BasicPropertyAssociation_2= ruleBasicPropertyAssociation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPModelAccess().getBasicPropertyAssociationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBasicPropertyAssociation_in_rulePModel201);
                    this_BasicPropertyAssociation_2=ruleBasicPropertyAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BasicPropertyAssociation_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:127:2: this_PropertyAssociation_3= rulePropertyAssociation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPModelAccess().getPropertyAssociationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_rulePropertyAssociation_in_rulePModel231);
                    this_PropertyAssociation_3=rulePropertyAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PropertyAssociation_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePModel"


    // $ANTLR start "entryRulePropertySet"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:146:1: entryRulePropertySet returns [EObject current=null] : iv_rulePropertySet= rulePropertySet EOF ;
    public final EObject entryRulePropertySet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertySet = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:147:2: (iv_rulePropertySet= rulePropertySet EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:148:2: iv_rulePropertySet= rulePropertySet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertySetRule()); 
            }
            pushFollow(FOLLOW_rulePropertySet_in_entryRulePropertySet266);
            iv_rulePropertySet=rulePropertySet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertySet; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertySet276); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertySet"


    // $ANTLR start "rulePropertySet"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:155:1: rulePropertySet returns [EObject current=null] : (otherlv_0= 'property' otherlv_1= 'set' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( ( ( 'with' )=>otherlv_4= 'with' ) ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ';' )* ( ( (lv_ownedPropertyType_9_0= rulePropertyType ) ) | ( (lv_ownedProperty_10_0= rulePropertyDefinition ) ) | ( (lv_ownedPropertyConstant_11_0= rulePropertyConstant ) ) )* otherlv_12= 'end' this_ID_13= RULE_ID otherlv_14= ';' ) ;
    public final EObject rulePropertySet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        Token this_ID_13=null;
        Token otherlv_14=null;
        EObject lv_ownedPropertyType_9_0 = null;

        EObject lv_ownedProperty_10_0 = null;

        EObject lv_ownedPropertyConstant_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:158:28: ( (otherlv_0= 'property' otherlv_1= 'set' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( ( ( 'with' )=>otherlv_4= 'with' ) ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ';' )* ( ( (lv_ownedPropertyType_9_0= rulePropertyType ) ) | ( (lv_ownedProperty_10_0= rulePropertyDefinition ) ) | ( (lv_ownedPropertyConstant_11_0= rulePropertyConstant ) ) )* otherlv_12= 'end' this_ID_13= RULE_ID otherlv_14= ';' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:159:1: (otherlv_0= 'property' otherlv_1= 'set' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( ( ( 'with' )=>otherlv_4= 'with' ) ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ';' )* ( ( (lv_ownedPropertyType_9_0= rulePropertyType ) ) | ( (lv_ownedProperty_10_0= rulePropertyDefinition ) ) | ( (lv_ownedPropertyConstant_11_0= rulePropertyConstant ) ) )* otherlv_12= 'end' this_ID_13= RULE_ID otherlv_14= ';' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:159:1: (otherlv_0= 'property' otherlv_1= 'set' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( ( ( 'with' )=>otherlv_4= 'with' ) ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ';' )* ( ( (lv_ownedPropertyType_9_0= rulePropertyType ) ) | ( (lv_ownedProperty_10_0= rulePropertyDefinition ) ) | ( (lv_ownedPropertyConstant_11_0= rulePropertyConstant ) ) )* otherlv_12= 'end' this_ID_13= RULE_ID otherlv_14= ';' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:159:3: otherlv_0= 'property' otherlv_1= 'set' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is' ( ( ( 'with' )=>otherlv_4= 'with' ) ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ';' )* ( ( (lv_ownedPropertyType_9_0= rulePropertyType ) ) | ( (lv_ownedProperty_10_0= rulePropertyDefinition ) ) | ( (lv_ownedPropertyConstant_11_0= rulePropertyConstant ) ) )* otherlv_12= 'end' this_ID_13= RULE_ID otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePropertySet313); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropertySetAccess().getPropertyKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_rulePropertySet325); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertySetAccess().getSetKeyword_1());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:167:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:168:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:168:1: (lv_name_2_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:169:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertySet342); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getPropertySetAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertySetRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_rulePropertySet359); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPropertySetAccess().getIsKeyword_3());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:189:1: ( ( ( 'with' )=>otherlv_4= 'with' ) ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ';' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:189:2: ( ( 'with' )=>otherlv_4= 'with' ) ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ';'
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:189:2: ( ( 'with' )=>otherlv_4= 'with' )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:189:3: ( 'with' )=>otherlv_4= 'with'
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_rulePropertySet380); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getPropertySetAccess().getWithKeyword_4_0());
            	          
            	    }

            	    }

            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:194:2: ( (otherlv_5= RULE_ID ) )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:195:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:195:1: (otherlv_5= RULE_ID )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:196:3: otherlv_5= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getPropertySetRule());
            	      	        }
            	              
            	    }
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertySet405); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_5, grammarAccess.getPropertySetAccess().getImportedUnitPropertySetCrossReference_4_1_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:210:2: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==15) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:210:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
            	    	    {
            	    	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_rulePropertySet418); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_6, grammarAccess.getPropertySetAccess().getCommaKeyword_4_2_0());
            	    	          
            	    	    }
            	    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:214:1: ( (otherlv_7= RULE_ID ) )
            	    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:215:1: (otherlv_7= RULE_ID )
            	    	    {
            	    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:215:1: (otherlv_7= RULE_ID )
            	    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:216:3: otherlv_7= RULE_ID
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      		  /* */ 
            	    	      		
            	    	    }
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getPropertySetRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertySet442); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      		newLeafNode(otherlv_7, grammarAccess.getPropertySetAccess().getImportedUnitPropertySetCrossReference_4_2_1_0()); 
            	    	      	
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);

            	    otherlv_8=(Token)match(input,16,FOLLOW_16_in_rulePropertySet456); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getPropertySetAccess().getSemicolonKeyword_4_3());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:234:3: ( ( (lv_ownedPropertyType_9_0= rulePropertyType ) ) | ( (lv_ownedProperty_10_0= rulePropertyDefinition ) ) | ( (lv_ownedPropertyConstant_11_0= rulePropertyConstant ) ) )*
            loop4:
            do {
                int alt4=4;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==18) ) {
                        switch ( input.LA(3) ) {
                        case 19:
                            {
                            alt4=1;
                            }
                            break;
                        case 64:
                            {
                            alt4=3;
                            }
                            break;
                        case RULE_ID:
                        case 20:
                        case 21:
                        case 22:
                        case 25:
                        case 27:
                        case 28:
                        case 29:
                        case 31:
                        case 58:
                        case 59:
                        case 60:
                        case 63:
                            {
                            alt4=2;
                            }
                            break;

                        }

                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:234:4: ( (lv_ownedPropertyType_9_0= rulePropertyType ) )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:234:4: ( (lv_ownedPropertyType_9_0= rulePropertyType ) )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:235:1: (lv_ownedPropertyType_9_0= rulePropertyType )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:235:1: (lv_ownedPropertyType_9_0= rulePropertyType )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:236:3: lv_ownedPropertyType_9_0= rulePropertyType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPropertySetAccess().getOwnedPropertyTypePropertyTypeParserRuleCall_5_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyType_in_rulePropertySet480);
            	    lv_ownedPropertyType_9_0=rulePropertyType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPropertySetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedPropertyType",
            	              		lv_ownedPropertyType_9_0, 
            	              		"PropertyType");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:253:6: ( (lv_ownedProperty_10_0= rulePropertyDefinition ) )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:253:6: ( (lv_ownedProperty_10_0= rulePropertyDefinition ) )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:254:1: (lv_ownedProperty_10_0= rulePropertyDefinition )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:254:1: (lv_ownedProperty_10_0= rulePropertyDefinition )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:255:3: lv_ownedProperty_10_0= rulePropertyDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPropertySetAccess().getOwnedPropertyPropertyDefinitionParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyDefinition_in_rulePropertySet507);
            	    lv_ownedProperty_10_0=rulePropertyDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPropertySetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedProperty",
            	              		lv_ownedProperty_10_0, 
            	              		"PropertyDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:272:6: ( (lv_ownedPropertyConstant_11_0= rulePropertyConstant ) )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:272:6: ( (lv_ownedPropertyConstant_11_0= rulePropertyConstant ) )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:273:1: (lv_ownedPropertyConstant_11_0= rulePropertyConstant )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:273:1: (lv_ownedPropertyConstant_11_0= rulePropertyConstant )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:274:3: lv_ownedPropertyConstant_11_0= rulePropertyConstant
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPropertySetAccess().getOwnedPropertyConstantPropertyConstantParserRuleCall_5_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyConstant_in_rulePropertySet534);
            	    lv_ownedPropertyConstant_11_0=rulePropertyConstant();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPropertySetRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedPropertyConstant",
            	              		lv_ownedPropertyConstant_11_0, 
            	              		"PropertyConstant");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_17_in_rulePropertySet548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getPropertySetAccess().getEndKeyword_6());
                  
            }
            this_ID_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertySet559); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_13, grammarAccess.getPropertySetAccess().getIDTerminalRuleCall_7()); 
                  
            }
            otherlv_14=(Token)match(input,16,FOLLOW_16_in_rulePropertySet570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getPropertySetAccess().getSemicolonKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropertySet"


    // $ANTLR start "entryRulePropertyType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:310:1: entryRulePropertyType returns [EObject current=null] : iv_rulePropertyType= rulePropertyType EOF ;
    public final EObject entryRulePropertyType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:311:2: (iv_rulePropertyType= rulePropertyType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:312:2: iv_rulePropertyType= rulePropertyType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyTypeRule()); 
            }
            pushFollow(FOLLOW_rulePropertyType_in_entryRulePropertyType606);
            iv_rulePropertyType=rulePropertyType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyType616); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyType"


    // $ANTLR start "rulePropertyType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:319:1: rulePropertyType returns [EObject current=null] : ( (this_BooleanType_0= ruleBooleanType | this_StringType_1= ruleStringType | this_EnumerationType_2= ruleEnumerationType | this_UnitsType_3= ruleUnitsType | this_RealType_4= ruleRealType | this_IntegerType_5= ruleIntegerType | this_RangeType_6= ruleRangeType | this_ClassifierType_7= ruleClassifierType | this_ReferenceType_8= ruleReferenceType | this_RecordType_9= ruleRecordType ) otherlv_10= ';' ) ;
    public final EObject rulePropertyType() throws RecognitionException {
        EObject current = null;

        Token otherlv_10=null;
        EObject this_BooleanType_0 = null;

        EObject this_StringType_1 = null;

        EObject this_EnumerationType_2 = null;

        EObject this_UnitsType_3 = null;

        EObject this_RealType_4 = null;

        EObject this_IntegerType_5 = null;

        EObject this_RangeType_6 = null;

        EObject this_ClassifierType_7 = null;

        EObject this_ReferenceType_8 = null;

        EObject this_RecordType_9 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:322:28: ( ( (this_BooleanType_0= ruleBooleanType | this_StringType_1= ruleStringType | this_EnumerationType_2= ruleEnumerationType | this_UnitsType_3= ruleUnitsType | this_RealType_4= ruleRealType | this_IntegerType_5= ruleIntegerType | this_RangeType_6= ruleRangeType | this_ClassifierType_7= ruleClassifierType | this_ReferenceType_8= ruleReferenceType | this_RecordType_9= ruleRecordType ) otherlv_10= ';' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:323:1: ( (this_BooleanType_0= ruleBooleanType | this_StringType_1= ruleStringType | this_EnumerationType_2= ruleEnumerationType | this_UnitsType_3= ruleUnitsType | this_RealType_4= ruleRealType | this_IntegerType_5= ruleIntegerType | this_RangeType_6= ruleRangeType | this_ClassifierType_7= ruleClassifierType | this_ReferenceType_8= ruleReferenceType | this_RecordType_9= ruleRecordType ) otherlv_10= ';' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:323:1: ( (this_BooleanType_0= ruleBooleanType | this_StringType_1= ruleStringType | this_EnumerationType_2= ruleEnumerationType | this_UnitsType_3= ruleUnitsType | this_RealType_4= ruleRealType | this_IntegerType_5= ruleIntegerType | this_RangeType_6= ruleRangeType | this_ClassifierType_7= ruleClassifierType | this_ReferenceType_8= ruleReferenceType | this_RecordType_9= ruleRecordType ) otherlv_10= ';' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:323:2: (this_BooleanType_0= ruleBooleanType | this_StringType_1= ruleStringType | this_EnumerationType_2= ruleEnumerationType | this_UnitsType_3= ruleUnitsType | this_RealType_4= ruleRealType | this_IntegerType_5= ruleIntegerType | this_RangeType_6= ruleRangeType | this_ClassifierType_7= ruleClassifierType | this_ReferenceType_8= ruleReferenceType | this_RecordType_9= ruleRecordType ) otherlv_10= ';'
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:323:2: (this_BooleanType_0= ruleBooleanType | this_StringType_1= ruleStringType | this_EnumerationType_2= ruleEnumerationType | this_UnitsType_3= ruleUnitsType | this_RealType_4= ruleRealType | this_IntegerType_5= ruleIntegerType | this_RangeType_6= ruleRangeType | this_ClassifierType_7= ruleClassifierType | this_ReferenceType_8= ruleReferenceType | this_RecordType_9= ruleRecordType )
            int alt5=10;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:324:2: this_BooleanType_0= ruleBooleanType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyTypeAccess().getBooleanTypeParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanType_in_rulePropertyType667);
                    this_BooleanType_0=ruleBooleanType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:337:2: this_StringType_1= ruleStringType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyTypeAccess().getStringTypeParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringType_in_rulePropertyType697);
                    this_StringType_1=ruleStringType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:350:2: this_EnumerationType_2= ruleEnumerationType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyTypeAccess().getEnumerationTypeParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumerationType_in_rulePropertyType727);
                    this_EnumerationType_2=ruleEnumerationType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnumerationType_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:363:2: this_UnitsType_3= ruleUnitsType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyTypeAccess().getUnitsTypeParserRuleCall_0_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnitsType_in_rulePropertyType757);
                    this_UnitsType_3=ruleUnitsType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnitsType_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:376:2: this_RealType_4= ruleRealType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyTypeAccess().getRealTypeParserRuleCall_0_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealType_in_rulePropertyType787);
                    this_RealType_4=ruleRealType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RealType_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:389:2: this_IntegerType_5= ruleIntegerType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyTypeAccess().getIntegerTypeParserRuleCall_0_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerType_in_rulePropertyType817);
                    this_IntegerType_5=ruleIntegerType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerType_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:402:2: this_RangeType_6= ruleRangeType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyTypeAccess().getRangeTypeParserRuleCall_0_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRangeType_in_rulePropertyType847);
                    this_RangeType_6=ruleRangeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RangeType_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:415:2: this_ClassifierType_7= ruleClassifierType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyTypeAccess().getClassifierTypeParserRuleCall_0_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassifierType_in_rulePropertyType877);
                    this_ClassifierType_7=ruleClassifierType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClassifierType_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:428:2: this_ReferenceType_8= ruleReferenceType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyTypeAccess().getReferenceTypeParserRuleCall_0_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceType_in_rulePropertyType907);
                    this_ReferenceType_8=ruleReferenceType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceType_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:441:2: this_RecordType_9= ruleRecordType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyTypeAccess().getRecordTypeParserRuleCall_0_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRecordType_in_rulePropertyType937);
                    this_RecordType_9=ruleRecordType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RecordType_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_rulePropertyType949); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getPropertyTypeAccess().getSemicolonKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropertyType"


    // $ANTLR start "entryRuleUnnamedPropertyType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:464:1: entryRuleUnnamedPropertyType returns [EObject current=null] : iv_ruleUnnamedPropertyType= ruleUnnamedPropertyType EOF ;
    public final EObject entryRuleUnnamedPropertyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedPropertyType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:465:2: (iv_ruleUnnamedPropertyType= ruleUnnamedPropertyType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:466:2: iv_ruleUnnamedPropertyType= ruleUnnamedPropertyType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnnamedPropertyTypeRule()); 
            }
            pushFollow(FOLLOW_ruleUnnamedPropertyType_in_entryRuleUnnamedPropertyType985);
            iv_ruleUnnamedPropertyType=ruleUnnamedPropertyType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnnamedPropertyType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnnamedPropertyType995); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnnamedPropertyType"


    // $ANTLR start "ruleUnnamedPropertyType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:473:1: ruleUnnamedPropertyType returns [EObject current=null] : (this_ListType_0= ruleListType | this_UnnamedBooleanType_1= ruleUnnamedBooleanType | this_UnnamedStringType_2= ruleUnnamedStringType | this_UnnamedEnumerationType_3= ruleUnnamedEnumerationType | this_UnnamedUnitsType_4= ruleUnnamedUnitsType | this_UnnamedRealType_5= ruleUnnamedRealType | this_UnnamedIntegerType_6= ruleUnnamedIntegerType | this_UnnamedRangeType_7= ruleUnnamedRangeType | this_UnnamedClassifierType_8= ruleUnnamedClassifierType | this_UnnamedReferenceType_9= ruleUnnamedReferenceType | this_UnnamedRecordType_10= ruleUnnamedRecordType ) ;
    public final EObject ruleUnnamedPropertyType() throws RecognitionException {
        EObject current = null;

        EObject this_ListType_0 = null;

        EObject this_UnnamedBooleanType_1 = null;

        EObject this_UnnamedStringType_2 = null;

        EObject this_UnnamedEnumerationType_3 = null;

        EObject this_UnnamedUnitsType_4 = null;

        EObject this_UnnamedRealType_5 = null;

        EObject this_UnnamedIntegerType_6 = null;

        EObject this_UnnamedRangeType_7 = null;

        EObject this_UnnamedClassifierType_8 = null;

        EObject this_UnnamedReferenceType_9 = null;

        EObject this_UnnamedRecordType_10 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:476:28: ( (this_ListType_0= ruleListType | this_UnnamedBooleanType_1= ruleUnnamedBooleanType | this_UnnamedStringType_2= ruleUnnamedStringType | this_UnnamedEnumerationType_3= ruleUnnamedEnumerationType | this_UnnamedUnitsType_4= ruleUnnamedUnitsType | this_UnnamedRealType_5= ruleUnnamedRealType | this_UnnamedIntegerType_6= ruleUnnamedIntegerType | this_UnnamedRangeType_7= ruleUnnamedRangeType | this_UnnamedClassifierType_8= ruleUnnamedClassifierType | this_UnnamedReferenceType_9= ruleUnnamedReferenceType | this_UnnamedRecordType_10= ruleUnnamedRecordType ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:477:1: (this_ListType_0= ruleListType | this_UnnamedBooleanType_1= ruleUnnamedBooleanType | this_UnnamedStringType_2= ruleUnnamedStringType | this_UnnamedEnumerationType_3= ruleUnnamedEnumerationType | this_UnnamedUnitsType_4= ruleUnnamedUnitsType | this_UnnamedRealType_5= ruleUnnamedRealType | this_UnnamedIntegerType_6= ruleUnnamedIntegerType | this_UnnamedRangeType_7= ruleUnnamedRangeType | this_UnnamedClassifierType_8= ruleUnnamedClassifierType | this_UnnamedReferenceType_9= ruleUnnamedReferenceType | this_UnnamedRecordType_10= ruleUnnamedRecordType )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:477:1: (this_ListType_0= ruleListType | this_UnnamedBooleanType_1= ruleUnnamedBooleanType | this_UnnamedStringType_2= ruleUnnamedStringType | this_UnnamedEnumerationType_3= ruleUnnamedEnumerationType | this_UnnamedUnitsType_4= ruleUnnamedUnitsType | this_UnnamedRealType_5= ruleUnnamedRealType | this_UnnamedIntegerType_6= ruleUnnamedIntegerType | this_UnnamedRangeType_7= ruleUnnamedRangeType | this_UnnamedClassifierType_8= ruleUnnamedClassifierType | this_UnnamedReferenceType_9= ruleUnnamedReferenceType | this_UnnamedRecordType_10= ruleUnnamedRecordType )
            int alt6=11;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            case 25:
                {
                alt6=5;
                }
                break;
            case 27:
                {
                alt6=6;
                }
                break;
            case 28:
                {
                alt6=7;
                }
                break;
            case 29:
                {
                alt6=8;
                }
                break;
            case 31:
                {
                alt6=9;
                }
                break;
            case 58:
                {
                alt6=10;
                }
                break;
            case 59:
                {
                alt6=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:478:2: this_ListType_0= ruleListType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnnamedPropertyTypeAccess().getListTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleListType_in_ruleUnnamedPropertyType1045);
                    this_ListType_0=ruleListType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ListType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:491:2: this_UnnamedBooleanType_1= ruleUnnamedBooleanType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnnamedPropertyTypeAccess().getUnnamedBooleanTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnnamedBooleanType_in_ruleUnnamedPropertyType1075);
                    this_UnnamedBooleanType_1=ruleUnnamedBooleanType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnnamedBooleanType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:504:2: this_UnnamedStringType_2= ruleUnnamedStringType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnnamedPropertyTypeAccess().getUnnamedStringTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnnamedStringType_in_ruleUnnamedPropertyType1105);
                    this_UnnamedStringType_2=ruleUnnamedStringType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnnamedStringType_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:517:2: this_UnnamedEnumerationType_3= ruleUnnamedEnumerationType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnnamedPropertyTypeAccess().getUnnamedEnumerationTypeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnnamedEnumerationType_in_ruleUnnamedPropertyType1135);
                    this_UnnamedEnumerationType_3=ruleUnnamedEnumerationType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnnamedEnumerationType_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:530:2: this_UnnamedUnitsType_4= ruleUnnamedUnitsType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnnamedPropertyTypeAccess().getUnnamedUnitsTypeParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnnamedUnitsType_in_ruleUnnamedPropertyType1165);
                    this_UnnamedUnitsType_4=ruleUnnamedUnitsType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnnamedUnitsType_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:543:2: this_UnnamedRealType_5= ruleUnnamedRealType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnnamedPropertyTypeAccess().getUnnamedRealTypeParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnnamedRealType_in_ruleUnnamedPropertyType1195);
                    this_UnnamedRealType_5=ruleUnnamedRealType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnnamedRealType_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:556:2: this_UnnamedIntegerType_6= ruleUnnamedIntegerType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnnamedPropertyTypeAccess().getUnnamedIntegerTypeParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnnamedIntegerType_in_ruleUnnamedPropertyType1225);
                    this_UnnamedIntegerType_6=ruleUnnamedIntegerType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnnamedIntegerType_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:569:2: this_UnnamedRangeType_7= ruleUnnamedRangeType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnnamedPropertyTypeAccess().getUnnamedRangeTypeParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnnamedRangeType_in_ruleUnnamedPropertyType1255);
                    this_UnnamedRangeType_7=ruleUnnamedRangeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnnamedRangeType_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:582:2: this_UnnamedClassifierType_8= ruleUnnamedClassifierType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnnamedPropertyTypeAccess().getUnnamedClassifierTypeParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnnamedClassifierType_in_ruleUnnamedPropertyType1285);
                    this_UnnamedClassifierType_8=ruleUnnamedClassifierType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnnamedClassifierType_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:595:2: this_UnnamedReferenceType_9= ruleUnnamedReferenceType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnnamedPropertyTypeAccess().getUnnamedReferenceTypeParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnnamedReferenceType_in_ruleUnnamedPropertyType1315);
                    this_UnnamedReferenceType_9=ruleUnnamedReferenceType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnnamedReferenceType_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:608:2: this_UnnamedRecordType_10= ruleUnnamedRecordType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnnamedPropertyTypeAccess().getUnnamedRecordTypeParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnnamedRecordType_in_ruleUnnamedPropertyType1345);
                    this_UnnamedRecordType_10=ruleUnnamedRecordType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnnamedRecordType_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnnamedPropertyType"


    // $ANTLR start "entryRuleBooleanType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:627:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:628:2: (iv_ruleBooleanType= ruleBooleanType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:629:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType1380);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType1390); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:636:1: ruleBooleanType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'aadlboolean' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:639:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'aadlboolean' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:640:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'aadlboolean' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:640:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'aadlboolean' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:640:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'aadlboolean'
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:640:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:641:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:641:1: (lv_name_0_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:642:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBooleanType1432); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getBooleanTypeAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBooleanTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleBooleanType1449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBooleanTypeAccess().getColonKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleBooleanType1461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getBooleanTypeAccess().getTypeKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleBooleanType1473); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBooleanTypeAccess().getAadlbooleanKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleUnnamedBooleanType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:678:1: entryRuleUnnamedBooleanType returns [EObject current=null] : iv_ruleUnnamedBooleanType= ruleUnnamedBooleanType EOF ;
    public final EObject entryRuleUnnamedBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedBooleanType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:679:2: (iv_ruleUnnamedBooleanType= ruleUnnamedBooleanType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:680:2: iv_ruleUnnamedBooleanType= ruleUnnamedBooleanType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnnamedBooleanTypeRule()); 
            }
            pushFollow(FOLLOW_ruleUnnamedBooleanType_in_entryRuleUnnamedBooleanType1509);
            iv_ruleUnnamedBooleanType=ruleUnnamedBooleanType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnnamedBooleanType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnnamedBooleanType1519); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnnamedBooleanType"


    // $ANTLR start "ruleUnnamedBooleanType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:687:1: ruleUnnamedBooleanType returns [EObject current=null] : ( () otherlv_1= 'aadlboolean' ) ;
    public final EObject ruleUnnamedBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:690:28: ( ( () otherlv_1= 'aadlboolean' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:691:1: ( () otherlv_1= 'aadlboolean' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:691:1: ( () otherlv_1= 'aadlboolean' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:691:2: () otherlv_1= 'aadlboolean'
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:691:2: ()
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:692:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnnamedBooleanTypeAccess().getAadlBooleanAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleUnnamedBooleanType1568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnnamedBooleanTypeAccess().getAadlbooleanKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnnamedBooleanType"


    // $ANTLR start "entryRuleStringType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:712:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:713:2: (iv_ruleStringType= ruleStringType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:714:2: iv_ruleStringType= ruleStringType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringTypeRule()); 
            }
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType1604);
            iv_ruleStringType=ruleStringType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType1614); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:721:1: ruleStringType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'aadlstring' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:724:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'aadlstring' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:725:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'aadlstring' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:725:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'aadlstring' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:725:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'aadlstring'
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:725:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:726:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:726:1: (lv_name_0_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:727:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringType1656); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getStringTypeAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleStringType1673); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStringTypeAccess().getColonKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleStringType1685); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStringTypeAccess().getTypeKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleStringType1697); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStringTypeAccess().getAadlstringKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleUnnamedStringType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:763:1: entryRuleUnnamedStringType returns [EObject current=null] : iv_ruleUnnamedStringType= ruleUnnamedStringType EOF ;
    public final EObject entryRuleUnnamedStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedStringType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:764:2: (iv_ruleUnnamedStringType= ruleUnnamedStringType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:765:2: iv_ruleUnnamedStringType= ruleUnnamedStringType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnnamedStringTypeRule()); 
            }
            pushFollow(FOLLOW_ruleUnnamedStringType_in_entryRuleUnnamedStringType1733);
            iv_ruleUnnamedStringType=ruleUnnamedStringType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnnamedStringType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnnamedStringType1743); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnnamedStringType"


    // $ANTLR start "ruleUnnamedStringType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:772:1: ruleUnnamedStringType returns [EObject current=null] : ( () otherlv_1= 'aadlstring' ) ;
    public final EObject ruleUnnamedStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:775:28: ( ( () otherlv_1= 'aadlstring' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:776:1: ( () otherlv_1= 'aadlstring' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:776:1: ( () otherlv_1= 'aadlstring' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:776:2: () otherlv_1= 'aadlstring'
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:776:2: ()
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:777:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnnamedStringTypeAccess().getAadlStringAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleUnnamedStringType1792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnnamedStringTypeAccess().getAadlstringKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnnamedStringType"


    // $ANTLR start "entryRuleEnumerationType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:797:1: entryRuleEnumerationType returns [EObject current=null] : iv_ruleEnumerationType= ruleEnumerationType EOF ;
    public final EObject entryRuleEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:798:2: (iv_ruleEnumerationType= ruleEnumerationType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:799:2: iv_ruleEnumerationType= ruleEnumerationType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationTypeRule()); 
            }
            pushFollow(FOLLOW_ruleEnumerationType_in_entryRuleEnumerationType1828);
            iv_ruleEnumerationType=ruleEnumerationType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationType1838); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumerationType"


    // $ANTLR start "ruleEnumerationType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:806:1: ruleEnumerationType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'enumeration' otherlv_4= '(' ( (lv_ownedLiteral_5_0= ruleEnumerationLiteral ) ) (otherlv_6= ',' ( (lv_ownedLiteral_7_0= ruleEnumerationLiteral ) ) )* otherlv_8= ')' ) ;
    public final EObject ruleEnumerationType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_ownedLiteral_5_0 = null;

        EObject lv_ownedLiteral_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:809:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'enumeration' otherlv_4= '(' ( (lv_ownedLiteral_5_0= ruleEnumerationLiteral ) ) (otherlv_6= ',' ( (lv_ownedLiteral_7_0= ruleEnumerationLiteral ) ) )* otherlv_8= ')' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:810:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'enumeration' otherlv_4= '(' ( (lv_ownedLiteral_5_0= ruleEnumerationLiteral ) ) (otherlv_6= ',' ( (lv_ownedLiteral_7_0= ruleEnumerationLiteral ) ) )* otherlv_8= ')' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:810:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'enumeration' otherlv_4= '(' ( (lv_ownedLiteral_5_0= ruleEnumerationLiteral ) ) (otherlv_6= ',' ( (lv_ownedLiteral_7_0= ruleEnumerationLiteral ) ) )* otherlv_8= ')' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:810:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'enumeration' otherlv_4= '(' ( (lv_ownedLiteral_5_0= ruleEnumerationLiteral ) ) (otherlv_6= ',' ( (lv_ownedLiteral_7_0= ruleEnumerationLiteral ) ) )* otherlv_8= ')'
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:810:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:811:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:811:1: (lv_name_0_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:812:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationType1880); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getEnumerationTypeAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumerationTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleEnumerationType1897); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnumerationTypeAccess().getColonKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleEnumerationType1909); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnumerationTypeAccess().getTypeKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleEnumerationType1921); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEnumerationTypeAccess().getEnumerationKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleEnumerationType1933); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEnumerationTypeAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:844:1: ( (lv_ownedLiteral_5_0= ruleEnumerationLiteral ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:845:1: (lv_ownedLiteral_5_0= ruleEnumerationLiteral )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:845:1: (lv_ownedLiteral_5_0= ruleEnumerationLiteral )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:846:3: lv_ownedLiteral_5_0= ruleEnumerationLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumerationTypeAccess().getOwnedLiteralEnumerationLiteralParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleEnumerationType1954);
            lv_ownedLiteral_5_0=ruleEnumerationLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnumerationTypeRule());
              	        }
                     		add(
                     			current, 
                     			"ownedLiteral",
                      		lv_ownedLiteral_5_0, 
                      		"EnumerationLiteral");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:862:2: (otherlv_6= ',' ( (lv_ownedLiteral_7_0= ruleEnumerationLiteral ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:862:4: otherlv_6= ',' ( (lv_ownedLiteral_7_0= ruleEnumerationLiteral ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleEnumerationType1967); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getEnumerationTypeAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:866:1: ( (lv_ownedLiteral_7_0= ruleEnumerationLiteral ) )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:867:1: (lv_ownedLiteral_7_0= ruleEnumerationLiteral )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:867:1: (lv_ownedLiteral_7_0= ruleEnumerationLiteral )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:868:3: lv_ownedLiteral_7_0= ruleEnumerationLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumerationTypeAccess().getOwnedLiteralEnumerationLiteralParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleEnumerationType1988);
            	    lv_ownedLiteral_7_0=ruleEnumerationLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnumerationTypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedLiteral",
            	              		lv_ownedLiteral_7_0, 
            	              		"EnumerationLiteral");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleEnumerationType2002); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getEnumerationTypeAccess().getRightParenthesisKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEnumerationType"


    // $ANTLR start "entryRuleUnnamedEnumerationType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:896:1: entryRuleUnnamedEnumerationType returns [EObject current=null] : iv_ruleUnnamedEnumerationType= ruleUnnamedEnumerationType EOF ;
    public final EObject entryRuleUnnamedEnumerationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedEnumerationType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:897:2: (iv_ruleUnnamedEnumerationType= ruleUnnamedEnumerationType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:898:2: iv_ruleUnnamedEnumerationType= ruleUnnamedEnumerationType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnnamedEnumerationTypeRule()); 
            }
            pushFollow(FOLLOW_ruleUnnamedEnumerationType_in_entryRuleUnnamedEnumerationType2038);
            iv_ruleUnnamedEnumerationType=ruleUnnamedEnumerationType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnnamedEnumerationType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnnamedEnumerationType2048); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnnamedEnumerationType"


    // $ANTLR start "ruleUnnamedEnumerationType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:905:1: ruleUnnamedEnumerationType returns [EObject current=null] : (otherlv_0= 'enumeration' otherlv_1= '(' ( (lv_ownedLiteral_2_0= ruleEnumerationLiteral ) ) (otherlv_3= ',' ( (lv_ownedLiteral_4_0= ruleEnumerationLiteral ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleUnnamedEnumerationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedLiteral_2_0 = null;

        EObject lv_ownedLiteral_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:908:28: ( (otherlv_0= 'enumeration' otherlv_1= '(' ( (lv_ownedLiteral_2_0= ruleEnumerationLiteral ) ) (otherlv_3= ',' ( (lv_ownedLiteral_4_0= ruleEnumerationLiteral ) ) )* otherlv_5= ')' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:909:1: (otherlv_0= 'enumeration' otherlv_1= '(' ( (lv_ownedLiteral_2_0= ruleEnumerationLiteral ) ) (otherlv_3= ',' ( (lv_ownedLiteral_4_0= ruleEnumerationLiteral ) ) )* otherlv_5= ')' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:909:1: (otherlv_0= 'enumeration' otherlv_1= '(' ( (lv_ownedLiteral_2_0= ruleEnumerationLiteral ) ) (otherlv_3= ',' ( (lv_ownedLiteral_4_0= ruleEnumerationLiteral ) ) )* otherlv_5= ')' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:909:3: otherlv_0= 'enumeration' otherlv_1= '(' ( (lv_ownedLiteral_2_0= ruleEnumerationLiteral ) ) (otherlv_3= ',' ( (lv_ownedLiteral_4_0= ruleEnumerationLiteral ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleUnnamedEnumerationType2085); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUnnamedEnumerationTypeAccess().getEnumerationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleUnnamedEnumerationType2097); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnnamedEnumerationTypeAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:917:1: ( (lv_ownedLiteral_2_0= ruleEnumerationLiteral ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:918:1: (lv_ownedLiteral_2_0= ruleEnumerationLiteral )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:918:1: (lv_ownedLiteral_2_0= ruleEnumerationLiteral )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:919:3: lv_ownedLiteral_2_0= ruleEnumerationLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnnamedEnumerationTypeAccess().getOwnedLiteralEnumerationLiteralParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleUnnamedEnumerationType2118);
            lv_ownedLiteral_2_0=ruleEnumerationLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnnamedEnumerationTypeRule());
              	        }
                     		add(
                     			current, 
                     			"ownedLiteral",
                      		lv_ownedLiteral_2_0, 
                      		"EnumerationLiteral");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:935:2: (otherlv_3= ',' ( (lv_ownedLiteral_4_0= ruleEnumerationLiteral ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:935:4: otherlv_3= ',' ( (lv_ownedLiteral_4_0= ruleEnumerationLiteral ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleUnnamedEnumerationType2131); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getUnnamedEnumerationTypeAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:939:1: ( (lv_ownedLiteral_4_0= ruleEnumerationLiteral ) )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:940:1: (lv_ownedLiteral_4_0= ruleEnumerationLiteral )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:940:1: (lv_ownedLiteral_4_0= ruleEnumerationLiteral )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:941:3: lv_ownedLiteral_4_0= ruleEnumerationLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUnnamedEnumerationTypeAccess().getOwnedLiteralEnumerationLiteralParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumerationLiteral_in_ruleUnnamedEnumerationType2152);
            	    lv_ownedLiteral_4_0=ruleEnumerationLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUnnamedEnumerationTypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedLiteral",
            	              		lv_ownedLiteral_4_0, 
            	              		"EnumerationLiteral");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleUnnamedEnumerationType2166); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getUnnamedEnumerationTypeAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnnamedEnumerationType"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:969:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:970:2: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:971:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral2202);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteral2212); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:978:1: ruleEnumerationLiteral returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:981:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:982:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:982:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:983:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:983:1: (lv_name_0_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:984:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationLiteral2253); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumerationLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleUnitsType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1008:1: entryRuleUnitsType returns [EObject current=null] : iv_ruleUnitsType= ruleUnitsType EOF ;
    public final EObject entryRuleUnitsType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitsType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1009:2: (iv_ruleUnitsType= ruleUnitsType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1010:2: iv_ruleUnitsType= ruleUnitsType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitsTypeRule()); 
            }
            pushFollow(FOLLOW_ruleUnitsType_in_entryRuleUnitsType2293);
            iv_ruleUnitsType=ruleUnitsType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnitsType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnitsType2303); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnitsType"


    // $ANTLR start "ruleUnitsType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1017:1: ruleUnitsType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'units' otherlv_4= '(' ( (lv_ownedLiteral_5_0= ruleUnitLiteral ) ) (otherlv_6= ',' ( (lv_ownedLiteral_7_0= ruleUnitLiteralConversion ) ) )* otherlv_8= ')' ) ;
    public final EObject ruleUnitsType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_ownedLiteral_5_0 = null;

        EObject lv_ownedLiteral_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1020:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'units' otherlv_4= '(' ( (lv_ownedLiteral_5_0= ruleUnitLiteral ) ) (otherlv_6= ',' ( (lv_ownedLiteral_7_0= ruleUnitLiteralConversion ) ) )* otherlv_8= ')' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1021:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'units' otherlv_4= '(' ( (lv_ownedLiteral_5_0= ruleUnitLiteral ) ) (otherlv_6= ',' ( (lv_ownedLiteral_7_0= ruleUnitLiteralConversion ) ) )* otherlv_8= ')' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1021:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'units' otherlv_4= '(' ( (lv_ownedLiteral_5_0= ruleUnitLiteral ) ) (otherlv_6= ',' ( (lv_ownedLiteral_7_0= ruleUnitLiteralConversion ) ) )* otherlv_8= ')' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1021:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'units' otherlv_4= '(' ( (lv_ownedLiteral_5_0= ruleUnitLiteral ) ) (otherlv_6= ',' ( (lv_ownedLiteral_7_0= ruleUnitLiteralConversion ) ) )* otherlv_8= ')'
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1021:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1022:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1022:1: (lv_name_0_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1023:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnitsType2345); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getUnitsTypeAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getUnitsTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleUnitsType2362); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnitsTypeAccess().getColonKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleUnitsType2374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUnitsTypeAccess().getTypeKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleUnitsType2386); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUnitsTypeAccess().getUnitsKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleUnitsType2398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getUnitsTypeAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1055:1: ( (lv_ownedLiteral_5_0= ruleUnitLiteral ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1056:1: (lv_ownedLiteral_5_0= ruleUnitLiteral )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1056:1: (lv_ownedLiteral_5_0= ruleUnitLiteral )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1057:3: lv_ownedLiteral_5_0= ruleUnitLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnitsTypeAccess().getOwnedLiteralUnitLiteralParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnitLiteral_in_ruleUnitsType2419);
            lv_ownedLiteral_5_0=ruleUnitLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnitsTypeRule());
              	        }
                     		add(
                     			current, 
                     			"ownedLiteral",
                      		lv_ownedLiteral_5_0, 
                      		"UnitLiteral");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1073:2: (otherlv_6= ',' ( (lv_ownedLiteral_7_0= ruleUnitLiteralConversion ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1073:4: otherlv_6= ',' ( (lv_ownedLiteral_7_0= ruleUnitLiteralConversion ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleUnitsType2432); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getUnitsTypeAccess().getCommaKeyword_6_0());
            	          
            	    }
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1077:1: ( (lv_ownedLiteral_7_0= ruleUnitLiteralConversion ) )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1078:1: (lv_ownedLiteral_7_0= ruleUnitLiteralConversion )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1078:1: (lv_ownedLiteral_7_0= ruleUnitLiteralConversion )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1079:3: lv_ownedLiteral_7_0= ruleUnitLiteralConversion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUnitsTypeAccess().getOwnedLiteralUnitLiteralConversionParserRuleCall_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnitLiteralConversion_in_ruleUnitsType2453);
            	    lv_ownedLiteral_7_0=ruleUnitLiteralConversion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUnitsTypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedLiteral",
            	              		lv_ownedLiteral_7_0, 
            	              		"UnitLiteralConversion");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleUnitsType2467); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getUnitsTypeAccess().getRightParenthesisKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnitsType"


    // $ANTLR start "entryRuleUnnamedUnitsType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1107:1: entryRuleUnnamedUnitsType returns [EObject current=null] : iv_ruleUnnamedUnitsType= ruleUnnamedUnitsType EOF ;
    public final EObject entryRuleUnnamedUnitsType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedUnitsType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1108:2: (iv_ruleUnnamedUnitsType= ruleUnnamedUnitsType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1109:2: iv_ruleUnnamedUnitsType= ruleUnnamedUnitsType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnnamedUnitsTypeRule()); 
            }
            pushFollow(FOLLOW_ruleUnnamedUnitsType_in_entryRuleUnnamedUnitsType2503);
            iv_ruleUnnamedUnitsType=ruleUnnamedUnitsType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnnamedUnitsType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnnamedUnitsType2513); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnnamedUnitsType"


    // $ANTLR start "ruleUnnamedUnitsType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1116:1: ruleUnnamedUnitsType returns [EObject current=null] : (otherlv_0= 'units' otherlv_1= '(' ( (lv_ownedLiteral_2_0= ruleUnitLiteral ) ) (otherlv_3= ',' ( (lv_ownedLiteral_4_0= ruleUnitLiteralConversion ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleUnnamedUnitsType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedLiteral_2_0 = null;

        EObject lv_ownedLiteral_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1119:28: ( (otherlv_0= 'units' otherlv_1= '(' ( (lv_ownedLiteral_2_0= ruleUnitLiteral ) ) (otherlv_3= ',' ( (lv_ownedLiteral_4_0= ruleUnitLiteralConversion ) ) )* otherlv_5= ')' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1120:1: (otherlv_0= 'units' otherlv_1= '(' ( (lv_ownedLiteral_2_0= ruleUnitLiteral ) ) (otherlv_3= ',' ( (lv_ownedLiteral_4_0= ruleUnitLiteralConversion ) ) )* otherlv_5= ')' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1120:1: (otherlv_0= 'units' otherlv_1= '(' ( (lv_ownedLiteral_2_0= ruleUnitLiteral ) ) (otherlv_3= ',' ( (lv_ownedLiteral_4_0= ruleUnitLiteralConversion ) ) )* otherlv_5= ')' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1120:3: otherlv_0= 'units' otherlv_1= '(' ( (lv_ownedLiteral_2_0= ruleUnitLiteral ) ) (otherlv_3= ',' ( (lv_ownedLiteral_4_0= ruleUnitLiteralConversion ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleUnnamedUnitsType2550); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUnnamedUnitsTypeAccess().getUnitsKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleUnnamedUnitsType2562); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnnamedUnitsTypeAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1128:1: ( (lv_ownedLiteral_2_0= ruleUnitLiteral ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1129:1: (lv_ownedLiteral_2_0= ruleUnitLiteral )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1129:1: (lv_ownedLiteral_2_0= ruleUnitLiteral )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1130:3: lv_ownedLiteral_2_0= ruleUnitLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnnamedUnitsTypeAccess().getOwnedLiteralUnitLiteralParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnitLiteral_in_ruleUnnamedUnitsType2583);
            lv_ownedLiteral_2_0=ruleUnitLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnnamedUnitsTypeRule());
              	        }
                     		add(
                     			current, 
                     			"ownedLiteral",
                      		lv_ownedLiteral_2_0, 
                      		"UnitLiteral");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1146:2: (otherlv_3= ',' ( (lv_ownedLiteral_4_0= ruleUnitLiteralConversion ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1146:4: otherlv_3= ',' ( (lv_ownedLiteral_4_0= ruleUnitLiteralConversion ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleUnnamedUnitsType2596); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getUnnamedUnitsTypeAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1150:1: ( (lv_ownedLiteral_4_0= ruleUnitLiteralConversion ) )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1151:1: (lv_ownedLiteral_4_0= ruleUnitLiteralConversion )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1151:1: (lv_ownedLiteral_4_0= ruleUnitLiteralConversion )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1152:3: lv_ownedLiteral_4_0= ruleUnitLiteralConversion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUnnamedUnitsTypeAccess().getOwnedLiteralUnitLiteralConversionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnitLiteralConversion_in_ruleUnnamedUnitsType2617);
            	    lv_ownedLiteral_4_0=ruleUnitLiteralConversion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUnnamedUnitsTypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedLiteral",
            	              		lv_ownedLiteral_4_0, 
            	              		"UnitLiteralConversion");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleUnnamedUnitsType2631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getUnnamedUnitsTypeAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnnamedUnitsType"


    // $ANTLR start "entryRuleUnitLiteral"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1180:1: entryRuleUnitLiteral returns [EObject current=null] : iv_ruleUnitLiteral= ruleUnitLiteral EOF ;
    public final EObject entryRuleUnitLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitLiteral = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1181:2: (iv_ruleUnitLiteral= ruleUnitLiteral EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1182:2: iv_ruleUnitLiteral= ruleUnitLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleUnitLiteral_in_entryRuleUnitLiteral2667);
            iv_ruleUnitLiteral=ruleUnitLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnitLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnitLiteral2677); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnitLiteral"


    // $ANTLR start "ruleUnitLiteral"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1189:1: ruleUnitLiteral returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUnitLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1192:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1193:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1193:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1194:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1194:1: (lv_name_0_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1195:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnitLiteral2718); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getUnitLiteralAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getUnitLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnitLiteral"


    // $ANTLR start "entryRuleUnitLiteralConversion"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1219:1: entryRuleUnitLiteralConversion returns [EObject current=null] : iv_ruleUnitLiteralConversion= ruleUnitLiteralConversion EOF ;
    public final EObject entryRuleUnitLiteralConversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitLiteralConversion = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1220:2: (iv_ruleUnitLiteralConversion= ruleUnitLiteralConversion EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1221:2: iv_ruleUnitLiteralConversion= ruleUnitLiteralConversion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitLiteralConversionRule()); 
            }
            pushFollow(FOLLOW_ruleUnitLiteralConversion_in_entryRuleUnitLiteralConversion2758);
            iv_ruleUnitLiteralConversion=ruleUnitLiteralConversion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnitLiteralConversion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnitLiteralConversion2768); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnitLiteralConversion"


    // $ANTLR start "ruleUnitLiteralConversion"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1228:1: ruleUnitLiteralConversion returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ruleSTAR ( (lv_factor_4_0= ruleNumberValue ) ) ) ;
    public final EObject ruleUnitLiteralConversion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_factor_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1231:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ruleSTAR ( (lv_factor_4_0= ruleNumberValue ) ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1232:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ruleSTAR ( (lv_factor_4_0= ruleNumberValue ) ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1232:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ruleSTAR ( (lv_factor_4_0= ruleNumberValue ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1232:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ruleSTAR ( (lv_factor_4_0= ruleNumberValue ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1232:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1233:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1233:1: (lv_name_0_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1234:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnitLiteralConversion2810); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getUnitLiteralConversionAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getUnitLiteralConversionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleUnitLiteralConversion2827); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnitLiteralConversionAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1254:1: ( (otherlv_2= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1255:1: (otherlv_2= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1255:1: (otherlv_2= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1256:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUnitLiteralConversionRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnitLiteralConversion2851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getUnitLiteralConversionAccess().getBaseUnitUnitLiteralCrossReference_2_0()); 
              	
            }

            }


            }

            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnitLiteralConversionAccess().getSTARParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleSTAR_in_ruleUnitLiteralConversion2870);
            ruleSTAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1281:1: ( (lv_factor_4_0= ruleNumberValue ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1282:1: (lv_factor_4_0= ruleNumberValue )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1282:1: (lv_factor_4_0= ruleNumberValue )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1283:3: lv_factor_4_0= ruleNumberValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnitLiteralConversionAccess().getFactorNumberValueParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberValue_in_ruleUnitLiteralConversion2890);
            lv_factor_4_0=ruleNumberValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnitLiteralConversionRule());
              	        }
                     		set(
                     			current, 
                     			"factor",
                      		lv_factor_4_0, 
                      		"NumberValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnitLiteralConversion"


    // $ANTLR start "entryRuleRealType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1307:1: entryRuleRealType returns [EObject current=null] : iv_ruleRealType= ruleRealType EOF ;
    public final EObject entryRuleRealType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1308:2: (iv_ruleRealType= ruleRealType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1309:2: iv_ruleRealType= ruleRealType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealTypeRule()); 
            }
            pushFollow(FOLLOW_ruleRealType_in_entryRuleRealType2926);
            iv_ruleRealType=ruleRealType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealType2936); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRealType"


    // $ANTLR start "ruleRealType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1316:1: ruleRealType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'aadlreal' ( (lv_range_4_0= ruleRealRange ) )? ( ( (lv_ownedUnitsType_5_0= ruleUnnamedUnitsType ) ) | (otherlv_6= 'units' ( ( ruleQPREF ) ) ) )? ) ;
    public final EObject ruleRealType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_range_4_0 = null;

        EObject lv_ownedUnitsType_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1319:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'aadlreal' ( (lv_range_4_0= ruleRealRange ) )? ( ( (lv_ownedUnitsType_5_0= ruleUnnamedUnitsType ) ) | (otherlv_6= 'units' ( ( ruleQPREF ) ) ) )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1320:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'aadlreal' ( (lv_range_4_0= ruleRealRange ) )? ( ( (lv_ownedUnitsType_5_0= ruleUnnamedUnitsType ) ) | (otherlv_6= 'units' ( ( ruleQPREF ) ) ) )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1320:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'aadlreal' ( (lv_range_4_0= ruleRealRange ) )? ( ( (lv_ownedUnitsType_5_0= ruleUnnamedUnitsType ) ) | (otherlv_6= 'units' ( ( ruleQPREF ) ) ) )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1320:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'aadlreal' ( (lv_range_4_0= ruleRealRange ) )? ( ( (lv_ownedUnitsType_5_0= ruleUnnamedUnitsType ) ) | (otherlv_6= 'units' ( ( ruleQPREF ) ) ) )?
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1320:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1321:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1321:1: (lv_name_0_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1322:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRealType2978); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getRealTypeAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRealTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleRealType2995); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRealTypeAccess().getColonKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleRealType3007); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRealTypeAccess().getTypeKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleRealType3019); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRealTypeAccess().getAadlrealKeyword_3());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1350:1: ( (lv_range_4_0= ruleRealRange ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||LA11_0==RULE_INT||(LA11_0>=78 && LA11_0<=79)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1351:1: (lv_range_4_0= ruleRealRange )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1351:1: (lv_range_4_0= ruleRealRange )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1352:3: lv_range_4_0= ruleRealRange
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRealTypeAccess().getRangeRealRangeParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRealRange_in_ruleRealType3040);
                    lv_range_4_0=ruleRealRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRealTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"range",
                              		lv_range_4_0, 
                              		"RealRange");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1368:3: ( ( (lv_ownedUnitsType_5_0= ruleUnnamedUnitsType ) ) | (otherlv_6= 'units' ( ( ruleQPREF ) ) ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==23) ) {
                    alt12=1;
                }
                else if ( (LA12_1==RULE_ID) ) {
                    alt12=2;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1368:4: ( (lv_ownedUnitsType_5_0= ruleUnnamedUnitsType ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1368:4: ( (lv_ownedUnitsType_5_0= ruleUnnamedUnitsType ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1369:1: (lv_ownedUnitsType_5_0= ruleUnnamedUnitsType )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1369:1: (lv_ownedUnitsType_5_0= ruleUnnamedUnitsType )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1370:3: lv_ownedUnitsType_5_0= ruleUnnamedUnitsType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRealTypeAccess().getOwnedUnitsTypeUnnamedUnitsTypeParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnnamedUnitsType_in_ruleRealType3063);
                    lv_ownedUnitsType_5_0=ruleUnnamedUnitsType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRealTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedUnitsType",
                              		lv_ownedUnitsType_5_0, 
                              		"UnnamedUnitsType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1387:6: (otherlv_6= 'units' ( ( ruleQPREF ) ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1387:6: (otherlv_6= 'units' ( ( ruleQPREF ) ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1387:8: otherlv_6= 'units' ( ( ruleQPREF ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleRealType3082); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getRealTypeAccess().getUnitsKeyword_5_1_0());
                          
                    }
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1391:1: ( ( ruleQPREF ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1392:1: ( ruleQPREF )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1392:1: ( ruleQPREF )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1393:3: ruleQPREF
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRealTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRealTypeAccess().getUnitsTypeUnitsTypeCrossReference_5_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQPREF_in_ruleRealType3109);
                    ruleQPREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRealType"


    // $ANTLR start "entryRuleUnnamedRealType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1417:1: entryRuleUnnamedRealType returns [EObject current=null] : iv_ruleUnnamedRealType= ruleUnnamedRealType EOF ;
    public final EObject entryRuleUnnamedRealType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedRealType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1418:2: (iv_ruleUnnamedRealType= ruleUnnamedRealType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1419:2: iv_ruleUnnamedRealType= ruleUnnamedRealType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnnamedRealTypeRule()); 
            }
            pushFollow(FOLLOW_ruleUnnamedRealType_in_entryRuleUnnamedRealType3148);
            iv_ruleUnnamedRealType=ruleUnnamedRealType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnnamedRealType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnnamedRealType3158); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnnamedRealType"


    // $ANTLR start "ruleUnnamedRealType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1426:1: ruleUnnamedRealType returns [EObject current=null] : ( () otherlv_1= 'aadlreal' ( (lv_range_2_0= ruleRealRange ) )? ( ( (lv_ownedUnitsType_3_0= ruleUnnamedUnitsType ) ) | (otherlv_4= 'units' ( ( ruleQPREF ) ) ) )? ) ;
    public final EObject ruleUnnamedRealType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_range_2_0 = null;

        EObject lv_ownedUnitsType_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1429:28: ( ( () otherlv_1= 'aadlreal' ( (lv_range_2_0= ruleRealRange ) )? ( ( (lv_ownedUnitsType_3_0= ruleUnnamedUnitsType ) ) | (otherlv_4= 'units' ( ( ruleQPREF ) ) ) )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1430:1: ( () otherlv_1= 'aadlreal' ( (lv_range_2_0= ruleRealRange ) )? ( ( (lv_ownedUnitsType_3_0= ruleUnnamedUnitsType ) ) | (otherlv_4= 'units' ( ( ruleQPREF ) ) ) )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1430:1: ( () otherlv_1= 'aadlreal' ( (lv_range_2_0= ruleRealRange ) )? ( ( (lv_ownedUnitsType_3_0= ruleUnnamedUnitsType ) ) | (otherlv_4= 'units' ( ( ruleQPREF ) ) ) )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1430:2: () otherlv_1= 'aadlreal' ( (lv_range_2_0= ruleRealRange ) )? ( ( (lv_ownedUnitsType_3_0= ruleUnnamedUnitsType ) ) | (otherlv_4= 'units' ( ( ruleQPREF ) ) ) )?
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1430:2: ()
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1431:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnnamedRealTypeAccess().getAadlRealAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleUnnamedRealType3207); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnnamedRealTypeAccess().getAadlrealKeyword_1());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1443:1: ( (lv_range_2_0= ruleRealRange ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==RULE_INT||(LA13_0>=78 && LA13_0<=79)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1444:1: (lv_range_2_0= ruleRealRange )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1444:1: (lv_range_2_0= ruleRealRange )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1445:3: lv_range_2_0= ruleRealRange
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnnamedRealTypeAccess().getRangeRealRangeParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRealRange_in_ruleUnnamedRealType3228);
                    lv_range_2_0=ruleRealRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnnamedRealTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"range",
                              		lv_range_2_0, 
                              		"RealRange");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1461:3: ( ( (lv_ownedUnitsType_3_0= ruleUnnamedUnitsType ) ) | (otherlv_4= 'units' ( ( ruleQPREF ) ) ) )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_ID) ) {
                    alt14=2;
                }
                else if ( (LA14_1==23) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1461:4: ( (lv_ownedUnitsType_3_0= ruleUnnamedUnitsType ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1461:4: ( (lv_ownedUnitsType_3_0= ruleUnnamedUnitsType ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1462:1: (lv_ownedUnitsType_3_0= ruleUnnamedUnitsType )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1462:1: (lv_ownedUnitsType_3_0= ruleUnnamedUnitsType )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1463:3: lv_ownedUnitsType_3_0= ruleUnnamedUnitsType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnnamedRealTypeAccess().getOwnedUnitsTypeUnnamedUnitsTypeParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnnamedUnitsType_in_ruleUnnamedRealType3251);
                    lv_ownedUnitsType_3_0=ruleUnnamedUnitsType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnnamedRealTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedUnitsType",
                              		lv_ownedUnitsType_3_0, 
                              		"UnnamedUnitsType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1480:6: (otherlv_4= 'units' ( ( ruleQPREF ) ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1480:6: (otherlv_4= 'units' ( ( ruleQPREF ) ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1480:8: otherlv_4= 'units' ( ( ruleQPREF ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleUnnamedRealType3270); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getUnnamedRealTypeAccess().getUnitsKeyword_3_1_0());
                          
                    }
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1484:1: ( ( ruleQPREF ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1485:1: ( ruleQPREF )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1485:1: ( ruleQPREF )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1486:3: ruleQPREF
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getUnnamedRealTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnnamedRealTypeAccess().getUnitsTypeUnitsTypeCrossReference_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQPREF_in_ruleUnnamedRealType3297);
                    ruleQPREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnnamedRealType"


    // $ANTLR start "entryRuleIntegerType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1510:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1511:2: (iv_ruleIntegerType= ruleIntegerType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1512:2: iv_ruleIntegerType= ruleIntegerType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerTypeRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerType_in_entryRuleIntegerType3336);
            iv_ruleIntegerType=ruleIntegerType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerType3346); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1519:1: ruleIntegerType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'aadlinteger' ( (lv_range_4_0= ruleIntegerRange ) )? ( ( (lv_ownedUnitsType_5_0= ruleUnnamedUnitsType ) ) | (otherlv_6= 'units' ( ( ruleQPREF ) ) ) )? ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_range_4_0 = null;

        EObject lv_ownedUnitsType_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1522:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'aadlinteger' ( (lv_range_4_0= ruleIntegerRange ) )? ( ( (lv_ownedUnitsType_5_0= ruleUnnamedUnitsType ) ) | (otherlv_6= 'units' ( ( ruleQPREF ) ) ) )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1523:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'aadlinteger' ( (lv_range_4_0= ruleIntegerRange ) )? ( ( (lv_ownedUnitsType_5_0= ruleUnnamedUnitsType ) ) | (otherlv_6= 'units' ( ( ruleQPREF ) ) ) )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1523:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'aadlinteger' ( (lv_range_4_0= ruleIntegerRange ) )? ( ( (lv_ownedUnitsType_5_0= ruleUnnamedUnitsType ) ) | (otherlv_6= 'units' ( ( ruleQPREF ) ) ) )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1523:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'aadlinteger' ( (lv_range_4_0= ruleIntegerRange ) )? ( ( (lv_ownedUnitsType_5_0= ruleUnnamedUnitsType ) ) | (otherlv_6= 'units' ( ( ruleQPREF ) ) ) )?
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1523:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1524:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1524:1: (lv_name_0_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1525:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerType3388); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getIntegerTypeAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntegerTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleIntegerType3405); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIntegerTypeAccess().getColonKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleIntegerType3417); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIntegerTypeAccess().getTypeKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleIntegerType3429); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIntegerTypeAccess().getAadlintegerKeyword_3());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1553:1: ( (lv_range_4_0= ruleIntegerRange ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID||LA15_0==RULE_INT||(LA15_0>=78 && LA15_0<=79)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1554:1: (lv_range_4_0= ruleIntegerRange )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1554:1: (lv_range_4_0= ruleIntegerRange )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1555:3: lv_range_4_0= ruleIntegerRange
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntegerTypeAccess().getRangeIntegerRangeParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIntegerRange_in_ruleIntegerType3450);
                    lv_range_4_0=ruleIntegerRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntegerTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"range",
                              		lv_range_4_0, 
                              		"IntegerRange");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1571:3: ( ( (lv_ownedUnitsType_5_0= ruleUnnamedUnitsType ) ) | (otherlv_6= 'units' ( ( ruleQPREF ) ) ) )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==RULE_ID) ) {
                    alt16=2;
                }
                else if ( (LA16_1==23) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1571:4: ( (lv_ownedUnitsType_5_0= ruleUnnamedUnitsType ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1571:4: ( (lv_ownedUnitsType_5_0= ruleUnnamedUnitsType ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1572:1: (lv_ownedUnitsType_5_0= ruleUnnamedUnitsType )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1572:1: (lv_ownedUnitsType_5_0= ruleUnnamedUnitsType )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1573:3: lv_ownedUnitsType_5_0= ruleUnnamedUnitsType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntegerTypeAccess().getOwnedUnitsTypeUnnamedUnitsTypeParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnnamedUnitsType_in_ruleIntegerType3473);
                    lv_ownedUnitsType_5_0=ruleUnnamedUnitsType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntegerTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedUnitsType",
                              		lv_ownedUnitsType_5_0, 
                              		"UnnamedUnitsType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1590:6: (otherlv_6= 'units' ( ( ruleQPREF ) ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1590:6: (otherlv_6= 'units' ( ( ruleQPREF ) ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1590:8: otherlv_6= 'units' ( ( ruleQPREF ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleIntegerType3492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getIntegerTypeAccess().getUnitsKeyword_5_1_0());
                          
                    }
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1594:1: ( ( ruleQPREF ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1595:1: ( ruleQPREF )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1595:1: ( ruleQPREF )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1596:3: ruleQPREF
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getIntegerTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntegerTypeAccess().getUnitsTypeUnitsTypeCrossReference_5_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQPREF_in_ruleIntegerType3519);
                    ruleQPREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleUnnamedIntegerType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1620:1: entryRuleUnnamedIntegerType returns [EObject current=null] : iv_ruleUnnamedIntegerType= ruleUnnamedIntegerType EOF ;
    public final EObject entryRuleUnnamedIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedIntegerType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1621:2: (iv_ruleUnnamedIntegerType= ruleUnnamedIntegerType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1622:2: iv_ruleUnnamedIntegerType= ruleUnnamedIntegerType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnnamedIntegerTypeRule()); 
            }
            pushFollow(FOLLOW_ruleUnnamedIntegerType_in_entryRuleUnnamedIntegerType3558);
            iv_ruleUnnamedIntegerType=ruleUnnamedIntegerType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnnamedIntegerType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnnamedIntegerType3568); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnnamedIntegerType"


    // $ANTLR start "ruleUnnamedIntegerType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1629:1: ruleUnnamedIntegerType returns [EObject current=null] : ( () otherlv_1= 'aadlinteger' ( (lv_range_2_0= ruleIntegerRange ) )? ( ( (lv_ownedUnitsType_3_0= ruleUnnamedUnitsType ) ) | (otherlv_4= 'units' ( ( ruleQPREF ) ) ) )? ) ;
    public final EObject ruleUnnamedIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_range_2_0 = null;

        EObject lv_ownedUnitsType_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1632:28: ( ( () otherlv_1= 'aadlinteger' ( (lv_range_2_0= ruleIntegerRange ) )? ( ( (lv_ownedUnitsType_3_0= ruleUnnamedUnitsType ) ) | (otherlv_4= 'units' ( ( ruleQPREF ) ) ) )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1633:1: ( () otherlv_1= 'aadlinteger' ( (lv_range_2_0= ruleIntegerRange ) )? ( ( (lv_ownedUnitsType_3_0= ruleUnnamedUnitsType ) ) | (otherlv_4= 'units' ( ( ruleQPREF ) ) ) )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1633:1: ( () otherlv_1= 'aadlinteger' ( (lv_range_2_0= ruleIntegerRange ) )? ( ( (lv_ownedUnitsType_3_0= ruleUnnamedUnitsType ) ) | (otherlv_4= 'units' ( ( ruleQPREF ) ) ) )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1633:2: () otherlv_1= 'aadlinteger' ( (lv_range_2_0= ruleIntegerRange ) )? ( ( (lv_ownedUnitsType_3_0= ruleUnnamedUnitsType ) ) | (otherlv_4= 'units' ( ( ruleQPREF ) ) ) )?
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1633:2: ()
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1634:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnnamedIntegerTypeAccess().getAadlIntegerAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleUnnamedIntegerType3617); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnnamedIntegerTypeAccess().getAadlintegerKeyword_1());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1646:1: ( (lv_range_2_0= ruleIntegerRange ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||LA17_0==RULE_INT||(LA17_0>=78 && LA17_0<=79)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1647:1: (lv_range_2_0= ruleIntegerRange )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1647:1: (lv_range_2_0= ruleIntegerRange )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1648:3: lv_range_2_0= ruleIntegerRange
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnnamedIntegerTypeAccess().getRangeIntegerRangeParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIntegerRange_in_ruleUnnamedIntegerType3638);
                    lv_range_2_0=ruleIntegerRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnnamedIntegerTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"range",
                              		lv_range_2_0, 
                              		"IntegerRange");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1664:3: ( ( (lv_ownedUnitsType_3_0= ruleUnnamedUnitsType ) ) | (otherlv_4= 'units' ( ( ruleQPREF ) ) ) )?
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==23) ) {
                    alt18=1;
                }
                else if ( (LA18_1==RULE_ID) ) {
                    alt18=2;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1664:4: ( (lv_ownedUnitsType_3_0= ruleUnnamedUnitsType ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1664:4: ( (lv_ownedUnitsType_3_0= ruleUnnamedUnitsType ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1665:1: (lv_ownedUnitsType_3_0= ruleUnnamedUnitsType )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1665:1: (lv_ownedUnitsType_3_0= ruleUnnamedUnitsType )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1666:3: lv_ownedUnitsType_3_0= ruleUnnamedUnitsType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnnamedIntegerTypeAccess().getOwnedUnitsTypeUnnamedUnitsTypeParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnnamedUnitsType_in_ruleUnnamedIntegerType3661);
                    lv_ownedUnitsType_3_0=ruleUnnamedUnitsType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnnamedIntegerTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedUnitsType",
                              		lv_ownedUnitsType_3_0, 
                              		"UnnamedUnitsType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1683:6: (otherlv_4= 'units' ( ( ruleQPREF ) ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1683:6: (otherlv_4= 'units' ( ( ruleQPREF ) ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1683:8: otherlv_4= 'units' ( ( ruleQPREF ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleUnnamedIntegerType3680); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getUnnamedIntegerTypeAccess().getUnitsKeyword_3_1_0());
                          
                    }
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1687:1: ( ( ruleQPREF ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1688:1: ( ruleQPREF )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1688:1: ( ruleQPREF )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1689:3: ruleQPREF
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getUnnamedIntegerTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnnamedIntegerTypeAccess().getUnitsTypeUnitsTypeCrossReference_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQPREF_in_ruleUnnamedIntegerType3707);
                    ruleQPREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnnamedIntegerType"


    // $ANTLR start "entryRuleRangeType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1713:1: entryRuleRangeType returns [EObject current=null] : iv_ruleRangeType= ruleRangeType EOF ;
    public final EObject entryRuleRangeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1714:2: (iv_ruleRangeType= ruleRangeType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1715:2: iv_ruleRangeType= ruleRangeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleRangeType_in_entryRuleRangeType3746);
            iv_ruleRangeType=ruleRangeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRangeType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRangeType3756); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRangeType"


    // $ANTLR start "ruleRangeType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1722:1: ruleRangeType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'range' otherlv_4= 'of' ( ( ( (lv_ownedNumberType_5_1= ruleUnnamedIntegerType | lv_ownedNumberType_5_2= ruleUnnamedRealType ) ) ) | ( ( ruleQPREF ) ) ) ) ;
    public final EObject ruleRangeType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_ownedNumberType_5_1 = null;

        EObject lv_ownedNumberType_5_2 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1725:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'range' otherlv_4= 'of' ( ( ( (lv_ownedNumberType_5_1= ruleUnnamedIntegerType | lv_ownedNumberType_5_2= ruleUnnamedRealType ) ) ) | ( ( ruleQPREF ) ) ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1726:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'range' otherlv_4= 'of' ( ( ( (lv_ownedNumberType_5_1= ruleUnnamedIntegerType | lv_ownedNumberType_5_2= ruleUnnamedRealType ) ) ) | ( ( ruleQPREF ) ) ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1726:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'range' otherlv_4= 'of' ( ( ( (lv_ownedNumberType_5_1= ruleUnnamedIntegerType | lv_ownedNumberType_5_2= ruleUnnamedRealType ) ) ) | ( ( ruleQPREF ) ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1726:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'range' otherlv_4= 'of' ( ( ( (lv_ownedNumberType_5_1= ruleUnnamedIntegerType | lv_ownedNumberType_5_2= ruleUnnamedRealType ) ) ) | ( ( ruleQPREF ) ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1726:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1727:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1727:1: (lv_name_0_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1728:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRangeType3798); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getRangeTypeAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRangeTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleRangeType3815); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRangeTypeAccess().getColonKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleRangeType3827); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRangeTypeAccess().getTypeKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleRangeType3839); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRangeTypeAccess().getRangeKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleRangeType3851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRangeTypeAccess().getOfKeyword_4());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1760:1: ( ( ( (lv_ownedNumberType_5_1= ruleUnnamedIntegerType | lv_ownedNumberType_5_2= ruleUnnamedRealType ) ) ) | ( ( ruleQPREF ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=27 && LA20_0<=28)) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1760:2: ( ( (lv_ownedNumberType_5_1= ruleUnnamedIntegerType | lv_ownedNumberType_5_2= ruleUnnamedRealType ) ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1760:2: ( ( (lv_ownedNumberType_5_1= ruleUnnamedIntegerType | lv_ownedNumberType_5_2= ruleUnnamedRealType ) ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1761:1: ( (lv_ownedNumberType_5_1= ruleUnnamedIntegerType | lv_ownedNumberType_5_2= ruleUnnamedRealType ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1761:1: ( (lv_ownedNumberType_5_1= ruleUnnamedIntegerType | lv_ownedNumberType_5_2= ruleUnnamedRealType ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1762:1: (lv_ownedNumberType_5_1= ruleUnnamedIntegerType | lv_ownedNumberType_5_2= ruleUnnamedRealType )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1762:1: (lv_ownedNumberType_5_1= ruleUnnamedIntegerType | lv_ownedNumberType_5_2= ruleUnnamedRealType )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==28) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==27) ) {
                        alt19=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1763:3: lv_ownedNumberType_5_1= ruleUnnamedIntegerType
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRangeTypeAccess().getOwnedNumberTypeUnnamedIntegerTypeParserRuleCall_5_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleUnnamedIntegerType_in_ruleRangeType3875);
                            lv_ownedNumberType_5_1=ruleUnnamedIntegerType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getRangeTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ownedNumberType",
                                      		lv_ownedNumberType_5_1, 
                                      		"UnnamedIntegerType");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1778:8: lv_ownedNumberType_5_2= ruleUnnamedRealType
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRangeTypeAccess().getOwnedNumberTypeUnnamedRealTypeParserRuleCall_5_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleUnnamedRealType_in_ruleRangeType3894);
                            lv_ownedNumberType_5_2=ruleUnnamedRealType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getRangeTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ownedNumberType",
                                      		lv_ownedNumberType_5_2, 
                                      		"UnnamedRealType");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1797:6: ( ( ruleQPREF ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1797:6: ( ( ruleQPREF ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1798:1: ( ruleQPREF )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1798:1: ( ruleQPREF )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1799:3: ruleQPREF
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRangeTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRangeTypeAccess().getNumberTypeNumberTypeCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQPREF_in_ruleRangeType3930);
                    ruleQPREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRangeType"


    // $ANTLR start "entryRuleUnnamedRangeType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1823:1: entryRuleUnnamedRangeType returns [EObject current=null] : iv_ruleUnnamedRangeType= ruleUnnamedRangeType EOF ;
    public final EObject entryRuleUnnamedRangeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedRangeType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1824:2: (iv_ruleUnnamedRangeType= ruleUnnamedRangeType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1825:2: iv_ruleUnnamedRangeType= ruleUnnamedRangeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnnamedRangeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleUnnamedRangeType_in_entryRuleUnnamedRangeType3967);
            iv_ruleUnnamedRangeType=ruleUnnamedRangeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnnamedRangeType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnnamedRangeType3977); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnnamedRangeType"


    // $ANTLR start "ruleUnnamedRangeType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1832:1: ruleUnnamedRangeType returns [EObject current=null] : ( () otherlv_1= 'range' otherlv_2= 'of' ( ( ( (lv_ownedNumberType_3_1= ruleUnnamedIntegerType | lv_ownedNumberType_3_2= ruleUnnamedRealType ) ) ) | ( ( ruleQPREF ) ) ) ) ;
    public final EObject ruleUnnamedRangeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_ownedNumberType_3_1 = null;

        EObject lv_ownedNumberType_3_2 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1835:28: ( ( () otherlv_1= 'range' otherlv_2= 'of' ( ( ( (lv_ownedNumberType_3_1= ruleUnnamedIntegerType | lv_ownedNumberType_3_2= ruleUnnamedRealType ) ) ) | ( ( ruleQPREF ) ) ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1836:1: ( () otherlv_1= 'range' otherlv_2= 'of' ( ( ( (lv_ownedNumberType_3_1= ruleUnnamedIntegerType | lv_ownedNumberType_3_2= ruleUnnamedRealType ) ) ) | ( ( ruleQPREF ) ) ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1836:1: ( () otherlv_1= 'range' otherlv_2= 'of' ( ( ( (lv_ownedNumberType_3_1= ruleUnnamedIntegerType | lv_ownedNumberType_3_2= ruleUnnamedRealType ) ) ) | ( ( ruleQPREF ) ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1836:2: () otherlv_1= 'range' otherlv_2= 'of' ( ( ( (lv_ownedNumberType_3_1= ruleUnnamedIntegerType | lv_ownedNumberType_3_2= ruleUnnamedRealType ) ) ) | ( ( ruleQPREF ) ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1836:2: ()
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1837:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnnamedRangeTypeAccess().getRangeTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleUnnamedRangeType4026); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnnamedRangeTypeAccess().getRangeKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleUnnamedRangeType4038); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUnnamedRangeTypeAccess().getOfKeyword_2());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1853:1: ( ( ( (lv_ownedNumberType_3_1= ruleUnnamedIntegerType | lv_ownedNumberType_3_2= ruleUnnamedRealType ) ) ) | ( ( ruleQPREF ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=27 && LA22_0<=28)) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1853:2: ( ( (lv_ownedNumberType_3_1= ruleUnnamedIntegerType | lv_ownedNumberType_3_2= ruleUnnamedRealType ) ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1853:2: ( ( (lv_ownedNumberType_3_1= ruleUnnamedIntegerType | lv_ownedNumberType_3_2= ruleUnnamedRealType ) ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1854:1: ( (lv_ownedNumberType_3_1= ruleUnnamedIntegerType | lv_ownedNumberType_3_2= ruleUnnamedRealType ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1854:1: ( (lv_ownedNumberType_3_1= ruleUnnamedIntegerType | lv_ownedNumberType_3_2= ruleUnnamedRealType ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1855:1: (lv_ownedNumberType_3_1= ruleUnnamedIntegerType | lv_ownedNumberType_3_2= ruleUnnamedRealType )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1855:1: (lv_ownedNumberType_3_1= ruleUnnamedIntegerType | lv_ownedNumberType_3_2= ruleUnnamedRealType )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==28) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==27) ) {
                        alt21=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1856:3: lv_ownedNumberType_3_1= ruleUnnamedIntegerType
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getUnnamedRangeTypeAccess().getOwnedNumberTypeUnnamedIntegerTypeParserRuleCall_3_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleUnnamedIntegerType_in_ruleUnnamedRangeType4062);
                            lv_ownedNumberType_3_1=ruleUnnamedIntegerType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getUnnamedRangeTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ownedNumberType",
                                      		lv_ownedNumberType_3_1, 
                                      		"UnnamedIntegerType");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1871:8: lv_ownedNumberType_3_2= ruleUnnamedRealType
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getUnnamedRangeTypeAccess().getOwnedNumberTypeUnnamedRealTypeParserRuleCall_3_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleUnnamedRealType_in_ruleUnnamedRangeType4081);
                            lv_ownedNumberType_3_2=ruleUnnamedRealType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getUnnamedRangeTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ownedNumberType",
                                      		lv_ownedNumberType_3_2, 
                                      		"UnnamedRealType");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1890:6: ( ( ruleQPREF ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1890:6: ( ( ruleQPREF ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1891:1: ( ruleQPREF )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1891:1: ( ruleQPREF )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1892:3: ruleQPREF
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getUnnamedRangeTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnnamedRangeTypeAccess().getNumberTypeNumberTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQPREF_in_ruleUnnamedRangeType4117);
                    ruleQPREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnnamedRangeType"


    // $ANTLR start "entryRuleClassifierType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1916:1: entryRuleClassifierType returns [EObject current=null] : iv_ruleClassifierType= ruleClassifierType EOF ;
    public final EObject entryRuleClassifierType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1917:2: (iv_ruleClassifierType= ruleClassifierType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1918:2: iv_ruleClassifierType= ruleClassifierType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierTypeRule()); 
            }
            pushFollow(FOLLOW_ruleClassifierType_in_entryRuleClassifierType4154);
            iv_ruleClassifierType=ruleClassifierType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifierType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifierType4164); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassifierType"


    // $ANTLR start "ruleClassifierType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1925:1: ruleClassifierType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'classifier' (otherlv_4= '(' ( (lv_classifierReference_5_0= ruleQCReference ) ) (otherlv_6= ',' ( (lv_classifierReference_7_0= ruleQCReference ) ) )* otherlv_8= ')' )? ) ;
    public final EObject ruleClassifierType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_classifierReference_5_0 = null;

        EObject lv_classifierReference_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1928:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'classifier' (otherlv_4= '(' ( (lv_classifierReference_5_0= ruleQCReference ) ) (otherlv_6= ',' ( (lv_classifierReference_7_0= ruleQCReference ) ) )* otherlv_8= ')' )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1929:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'classifier' (otherlv_4= '(' ( (lv_classifierReference_5_0= ruleQCReference ) ) (otherlv_6= ',' ( (lv_classifierReference_7_0= ruleQCReference ) ) )* otherlv_8= ')' )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1929:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'classifier' (otherlv_4= '(' ( (lv_classifierReference_5_0= ruleQCReference ) ) (otherlv_6= ',' ( (lv_classifierReference_7_0= ruleQCReference ) ) )* otherlv_8= ')' )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1929:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'classifier' (otherlv_4= '(' ( (lv_classifierReference_5_0= ruleQCReference ) ) (otherlv_6= ',' ( (lv_classifierReference_7_0= ruleQCReference ) ) )* otherlv_8= ')' )?
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1929:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1930:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1930:1: (lv_name_0_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1931:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassifierType4206); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getClassifierTypeAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassifierTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleClassifierType4223); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassifierTypeAccess().getColonKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleClassifierType4235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getClassifierTypeAccess().getTypeKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleClassifierType4247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getClassifierTypeAccess().getClassifierKeyword_3());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1959:1: (otherlv_4= '(' ( (lv_classifierReference_5_0= ruleQCReference ) ) (otherlv_6= ',' ( (lv_classifierReference_7_0= ruleQCReference ) ) )* otherlv_8= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1959:3: otherlv_4= '(' ( (lv_classifierReference_5_0= ruleQCReference ) ) (otherlv_6= ',' ( (lv_classifierReference_7_0= ruleQCReference ) ) )* otherlv_8= ')'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleClassifierType4260); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getClassifierTypeAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1963:1: ( (lv_classifierReference_5_0= ruleQCReference ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1964:1: (lv_classifierReference_5_0= ruleQCReference )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1964:1: (lv_classifierReference_5_0= ruleQCReference )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1965:3: lv_classifierReference_5_0= ruleQCReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassifierTypeAccess().getClassifierReferenceQCReferenceParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQCReference_in_ruleClassifierType4281);
                    lv_classifierReference_5_0=ruleQCReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClassifierTypeRule());
                      	        }
                             		add(
                             			current, 
                             			"classifierReference",
                              		lv_classifierReference_5_0, 
                              		"QCReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1981:2: (otherlv_6= ',' ( (lv_classifierReference_7_0= ruleQCReference ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==15) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1981:4: otherlv_6= ',' ( (lv_classifierReference_7_0= ruleQCReference ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleClassifierType4294); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getClassifierTypeAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1985:1: ( (lv_classifierReference_7_0= ruleQCReference ) )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1986:1: (lv_classifierReference_7_0= ruleQCReference )
                    	    {
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1986:1: (lv_classifierReference_7_0= ruleQCReference )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:1987:3: lv_classifierReference_7_0= ruleQCReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassifierTypeAccess().getClassifierReferenceQCReferenceParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQCReference_in_ruleClassifierType4315);
                    	    lv_classifierReference_7_0=ruleQCReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getClassifierTypeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"classifierReference",
                    	              		lv_classifierReference_7_0, 
                    	              		"QCReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleClassifierType4329); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getClassifierTypeAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleClassifierType"


    // $ANTLR start "entryRuleUnnamedClassifierType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2015:1: entryRuleUnnamedClassifierType returns [EObject current=null] : iv_ruleUnnamedClassifierType= ruleUnnamedClassifierType EOF ;
    public final EObject entryRuleUnnamedClassifierType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedClassifierType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2016:2: (iv_ruleUnnamedClassifierType= ruleUnnamedClassifierType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2017:2: iv_ruleUnnamedClassifierType= ruleUnnamedClassifierType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnnamedClassifierTypeRule()); 
            }
            pushFollow(FOLLOW_ruleUnnamedClassifierType_in_entryRuleUnnamedClassifierType4367);
            iv_ruleUnnamedClassifierType=ruleUnnamedClassifierType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnnamedClassifierType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnnamedClassifierType4377); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnnamedClassifierType"


    // $ANTLR start "ruleUnnamedClassifierType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2024:1: ruleUnnamedClassifierType returns [EObject current=null] : ( () otherlv_1= 'classifier' (otherlv_2= '(' ( (lv_classifierReference_3_0= ruleQCReference ) ) (otherlv_4= ',' ( (lv_classifierReference_5_0= ruleQCReference ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleUnnamedClassifierType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_classifierReference_3_0 = null;

        EObject lv_classifierReference_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2027:28: ( ( () otherlv_1= 'classifier' (otherlv_2= '(' ( (lv_classifierReference_3_0= ruleQCReference ) ) (otherlv_4= ',' ( (lv_classifierReference_5_0= ruleQCReference ) ) )* otherlv_6= ')' )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2028:1: ( () otherlv_1= 'classifier' (otherlv_2= '(' ( (lv_classifierReference_3_0= ruleQCReference ) ) (otherlv_4= ',' ( (lv_classifierReference_5_0= ruleQCReference ) ) )* otherlv_6= ')' )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2028:1: ( () otherlv_1= 'classifier' (otherlv_2= '(' ( (lv_classifierReference_3_0= ruleQCReference ) ) (otherlv_4= ',' ( (lv_classifierReference_5_0= ruleQCReference ) ) )* otherlv_6= ')' )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2028:2: () otherlv_1= 'classifier' (otherlv_2= '(' ( (lv_classifierReference_3_0= ruleQCReference ) ) (otherlv_4= ',' ( (lv_classifierReference_5_0= ruleQCReference ) ) )* otherlv_6= ')' )?
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2028:2: ()
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2029:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnnamedClassifierTypeAccess().getClassifierTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleUnnamedClassifierType4426); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnnamedClassifierTypeAccess().getClassifierKeyword_1());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2041:1: (otherlv_2= '(' ( (lv_classifierReference_3_0= ruleQCReference ) ) (otherlv_4= ',' ( (lv_classifierReference_5_0= ruleQCReference ) ) )* otherlv_6= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2041:3: otherlv_2= '(' ( (lv_classifierReference_3_0= ruleQCReference ) ) (otherlv_4= ',' ( (lv_classifierReference_5_0= ruleQCReference ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleUnnamedClassifierType4439); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getUnnamedClassifierTypeAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2045:1: ( (lv_classifierReference_3_0= ruleQCReference ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2046:1: (lv_classifierReference_3_0= ruleQCReference )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2046:1: (lv_classifierReference_3_0= ruleQCReference )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2047:3: lv_classifierReference_3_0= ruleQCReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnnamedClassifierTypeAccess().getClassifierReferenceQCReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQCReference_in_ruleUnnamedClassifierType4460);
                    lv_classifierReference_3_0=ruleQCReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnnamedClassifierTypeRule());
                      	        }
                             		add(
                             			current, 
                             			"classifierReference",
                              		lv_classifierReference_3_0, 
                              		"QCReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2063:2: (otherlv_4= ',' ( (lv_classifierReference_5_0= ruleQCReference ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==15) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2063:4: otherlv_4= ',' ( (lv_classifierReference_5_0= ruleQCReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleUnnamedClassifierType4473); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getUnnamedClassifierTypeAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2067:1: ( (lv_classifierReference_5_0= ruleQCReference ) )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2068:1: (lv_classifierReference_5_0= ruleQCReference )
                    	    {
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2068:1: (lv_classifierReference_5_0= ruleQCReference )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2069:3: lv_classifierReference_5_0= ruleQCReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getUnnamedClassifierTypeAccess().getClassifierReferenceQCReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQCReference_in_ruleUnnamedClassifierType4494);
                    	    lv_classifierReference_5_0=ruleQCReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getUnnamedClassifierTypeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"classifierReference",
                    	              		lv_classifierReference_5_0, 
                    	              		"QCReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleUnnamedClassifierType4508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getUnnamedClassifierTypeAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnnamedClassifierType"


    // $ANTLR start "entryRuleQCReference"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2097:1: entryRuleQCReference returns [EObject current=null] : iv_ruleQCReference= ruleQCReference EOF ;
    public final EObject entryRuleQCReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQCReference = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2098:2: (iv_ruleQCReference= ruleQCReference EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2099:2: iv_ruleQCReference= ruleQCReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQCReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleQCReference_in_entryRuleQCReference4546);
            iv_ruleQCReference=ruleQCReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQCReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQCReference4556); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQCReference"


    // $ANTLR start "ruleQCReference"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2106:1: ruleQCReference returns [EObject current=null] : ( (otherlv_0= '{' ( (lv_annexName_1_0= RULE_ID ) ) otherlv_2= '}' ruleSTAR ruleSTAR )? ( ( (lv_metaclassName_5_1= ruleCoreKeyWord | lv_metaclassName_5_2= RULE_ID ) ) )+ ) ;
    public final EObject ruleQCReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_annexName_1_0=null;
        Token otherlv_2=null;
        Token lv_metaclassName_5_2=null;
        AntlrDatatypeRuleToken lv_metaclassName_5_1 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2109:28: ( ( (otherlv_0= '{' ( (lv_annexName_1_0= RULE_ID ) ) otherlv_2= '}' ruleSTAR ruleSTAR )? ( ( (lv_metaclassName_5_1= ruleCoreKeyWord | lv_metaclassName_5_2= RULE_ID ) ) )+ ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2110:1: ( (otherlv_0= '{' ( (lv_annexName_1_0= RULE_ID ) ) otherlv_2= '}' ruleSTAR ruleSTAR )? ( ( (lv_metaclassName_5_1= ruleCoreKeyWord | lv_metaclassName_5_2= RULE_ID ) ) )+ )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2110:1: ( (otherlv_0= '{' ( (lv_annexName_1_0= RULE_ID ) ) otherlv_2= '}' ruleSTAR ruleSTAR )? ( ( (lv_metaclassName_5_1= ruleCoreKeyWord | lv_metaclassName_5_2= RULE_ID ) ) )+ )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2110:2: (otherlv_0= '{' ( (lv_annexName_1_0= RULE_ID ) ) otherlv_2= '}' ruleSTAR ruleSTAR )? ( ( (lv_metaclassName_5_1= ruleCoreKeyWord | lv_metaclassName_5_2= RULE_ID ) ) )+
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2110:2: (otherlv_0= '{' ( (lv_annexName_1_0= RULE_ID ) ) otherlv_2= '}' ruleSTAR ruleSTAR )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2110:4: otherlv_0= '{' ( (lv_annexName_1_0= RULE_ID ) ) otherlv_2= '}' ruleSTAR ruleSTAR
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleQCReference4594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getQCReferenceAccess().getLeftCurlyBracketKeyword_0_0());
                          
                    }
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2114:1: ( (lv_annexName_1_0= RULE_ID ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2115:1: (lv_annexName_1_0= RULE_ID )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2115:1: (lv_annexName_1_0= RULE_ID )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2116:3: lv_annexName_1_0= RULE_ID
                    {
                    lv_annexName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQCReference4611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_annexName_1_0, grammarAccess.getQCReferenceAccess().getAnnexNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getQCReferenceRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"annexName",
                              		lv_annexName_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleQCReference4628); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getQCReferenceAccess().getRightCurlyBracketKeyword_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQCReferenceAccess().getSTARParserRuleCall_0_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSTAR_in_ruleQCReference4647);
                    ruleSTAR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQCReferenceAccess().getSTARParserRuleCall_0_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSTAR_in_ruleQCReference4665);
                    ruleSTAR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2158:3: ( ( (lv_metaclassName_5_1= ruleCoreKeyWord | lv_metaclassName_5_2= RULE_ID ) ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==17||LA29_0==19||LA29_0==31||(LA29_0>=34 && LA29_0<=57)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2159:1: ( (lv_metaclassName_5_1= ruleCoreKeyWord | lv_metaclassName_5_2= RULE_ID ) )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2159:1: ( (lv_metaclassName_5_1= ruleCoreKeyWord | lv_metaclassName_5_2= RULE_ID ) )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2160:1: (lv_metaclassName_5_1= ruleCoreKeyWord | lv_metaclassName_5_2= RULE_ID )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2160:1: (lv_metaclassName_5_1= ruleCoreKeyWord | lv_metaclassName_5_2= RULE_ID )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==17||LA28_0==19||LA28_0==31||(LA28_0>=34 && LA28_0<=57)) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==RULE_ID) ) {
            	        alt28=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2161:3: lv_metaclassName_5_1= ruleCoreKeyWord
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getQCReferenceAccess().getMetaclassNameCoreKeyWordParserRuleCall_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleCoreKeyWord_in_ruleQCReference4689);
            	            lv_metaclassName_5_1=ruleCoreKeyWord();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getQCReferenceRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"metaclassName",
            	                      		lv_metaclassName_5_1, 
            	                      		"CoreKeyWord");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2176:8: lv_metaclassName_5_2= RULE_ID
            	            {
            	            lv_metaclassName_5_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQCReference4704); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_metaclassName_5_2, grammarAccess.getQCReferenceAccess().getMetaclassNameIDTerminalRuleCall_1_0_1()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getQCReferenceRule());
            	              	        }
            	                     		addWithLastConsumed(
            	                     			current, 
            	                     			"metaclassName",
            	                      		lv_metaclassName_5_2, 
            	                      		"ID");
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQCReference"


    // $ANTLR start "entryRuleCoreKeyWord"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2202:1: entryRuleCoreKeyWord returns [String current=null] : iv_ruleCoreKeyWord= ruleCoreKeyWord EOF ;
    public final String entryRuleCoreKeyWord() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCoreKeyWord = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2203:2: (iv_ruleCoreKeyWord= ruleCoreKeyWord EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2204:2: iv_ruleCoreKeyWord= ruleCoreKeyWord EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoreKeyWordRule()); 
            }
            pushFollow(FOLLOW_ruleCoreKeyWord_in_entryRuleCoreKeyWord4750);
            iv_ruleCoreKeyWord=ruleCoreKeyWord();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCoreKeyWord.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoreKeyWord4761); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCoreKeyWord"


    // $ANTLR start "ruleCoreKeyWord"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2211:1: ruleCoreKeyWord returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'system' | kw= 'thread' | kw= 'group' | kw= 'process' | kw= 'data' | kw= 'processor' | kw= 'memory' | kw= 'device' | kw= 'bus' | kw= 'virtual' | kw= 'subprogram' | kw= 'feature' | kw= 'package' | kw= 'parameter' | kw= 'port' | kw= 'calls' | kw= 'event' | kw= 'flow' | kw= 'implementation' | kw= 'type' | kw= 'mode' | kw= 'prototype' | kw= 'to' | kw= 'end' | kw= 'abstract' | kw= 'access' | kw= 'classifier' ) ;
    public final AntlrDatatypeRuleToken ruleCoreKeyWord() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2214:28: ( (kw= 'system' | kw= 'thread' | kw= 'group' | kw= 'process' | kw= 'data' | kw= 'processor' | kw= 'memory' | kw= 'device' | kw= 'bus' | kw= 'virtual' | kw= 'subprogram' | kw= 'feature' | kw= 'package' | kw= 'parameter' | kw= 'port' | kw= 'calls' | kw= 'event' | kw= 'flow' | kw= 'implementation' | kw= 'type' | kw= 'mode' | kw= 'prototype' | kw= 'to' | kw= 'end' | kw= 'abstract' | kw= 'access' | kw= 'classifier' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2215:1: (kw= 'system' | kw= 'thread' | kw= 'group' | kw= 'process' | kw= 'data' | kw= 'processor' | kw= 'memory' | kw= 'device' | kw= 'bus' | kw= 'virtual' | kw= 'subprogram' | kw= 'feature' | kw= 'package' | kw= 'parameter' | kw= 'port' | kw= 'calls' | kw= 'event' | kw= 'flow' | kw= 'implementation' | kw= 'type' | kw= 'mode' | kw= 'prototype' | kw= 'to' | kw= 'end' | kw= 'abstract' | kw= 'access' | kw= 'classifier' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2215:1: (kw= 'system' | kw= 'thread' | kw= 'group' | kw= 'process' | kw= 'data' | kw= 'processor' | kw= 'memory' | kw= 'device' | kw= 'bus' | kw= 'virtual' | kw= 'subprogram' | kw= 'feature' | kw= 'package' | kw= 'parameter' | kw= 'port' | kw= 'calls' | kw= 'event' | kw= 'flow' | kw= 'implementation' | kw= 'type' | kw= 'mode' | kw= 'prototype' | kw= 'to' | kw= 'end' | kw= 'abstract' | kw= 'access' | kw= 'classifier' )
            int alt30=27;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt30=1;
                }
                break;
            case 35:
                {
                alt30=2;
                }
                break;
            case 36:
                {
                alt30=3;
                }
                break;
            case 37:
                {
                alt30=4;
                }
                break;
            case 38:
                {
                alt30=5;
                }
                break;
            case 39:
                {
                alt30=6;
                }
                break;
            case 40:
                {
                alt30=7;
                }
                break;
            case 41:
                {
                alt30=8;
                }
                break;
            case 42:
                {
                alt30=9;
                }
                break;
            case 43:
                {
                alt30=10;
                }
                break;
            case 44:
                {
                alt30=11;
                }
                break;
            case 45:
                {
                alt30=12;
                }
                break;
            case 46:
                {
                alt30=13;
                }
                break;
            case 47:
                {
                alt30=14;
                }
                break;
            case 48:
                {
                alt30=15;
                }
                break;
            case 49:
                {
                alt30=16;
                }
                break;
            case 50:
                {
                alt30=17;
                }
                break;
            case 51:
                {
                alt30=18;
                }
                break;
            case 52:
                {
                alt30=19;
                }
                break;
            case 19:
                {
                alt30=20;
                }
                break;
            case 53:
                {
                alt30=21;
                }
                break;
            case 54:
                {
                alt30=22;
                }
                break;
            case 55:
                {
                alt30=23;
                }
                break;
            case 17:
                {
                alt30=24;
                }
                break;
            case 56:
                {
                alt30=25;
                }
                break;
            case 57:
                {
                alt30=26;
                }
                break;
            case 31:
                {
                alt30=27;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2216:2: kw= 'system'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleCoreKeyWord4799); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getSystemKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2223:2: kw= 'thread'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleCoreKeyWord4818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getThreadKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2230:2: kw= 'group'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleCoreKeyWord4837); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getGroupKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2237:2: kw= 'process'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleCoreKeyWord4856); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getProcessKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2244:2: kw= 'data'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleCoreKeyWord4875); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getDataKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2251:2: kw= 'processor'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleCoreKeyWord4894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getProcessorKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2258:2: kw= 'memory'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleCoreKeyWord4913); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getMemoryKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2265:2: kw= 'device'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleCoreKeyWord4932); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getDeviceKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2272:2: kw= 'bus'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleCoreKeyWord4951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getBusKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2279:2: kw= 'virtual'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleCoreKeyWord4970); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getVirtualKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2286:2: kw= 'subprogram'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleCoreKeyWord4989); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getSubprogramKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2293:2: kw= 'feature'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleCoreKeyWord5008); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getFeatureKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2300:2: kw= 'package'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleCoreKeyWord5027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getPackageKeyword_12()); 
                          
                    }

                    }
                    break;
                case 14 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2307:2: kw= 'parameter'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleCoreKeyWord5046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getParameterKeyword_13()); 
                          
                    }

                    }
                    break;
                case 15 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2314:2: kw= 'port'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleCoreKeyWord5065); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getPortKeyword_14()); 
                          
                    }

                    }
                    break;
                case 16 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2321:2: kw= 'calls'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleCoreKeyWord5084); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getCallsKeyword_15()); 
                          
                    }

                    }
                    break;
                case 17 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2328:2: kw= 'event'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleCoreKeyWord5103); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getEventKeyword_16()); 
                          
                    }

                    }
                    break;
                case 18 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2335:2: kw= 'flow'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleCoreKeyWord5122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getFlowKeyword_17()); 
                          
                    }

                    }
                    break;
                case 19 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2342:2: kw= 'implementation'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleCoreKeyWord5141); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getImplementationKeyword_18()); 
                          
                    }

                    }
                    break;
                case 20 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2349:2: kw= 'type'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleCoreKeyWord5160); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getTypeKeyword_19()); 
                          
                    }

                    }
                    break;
                case 21 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2356:2: kw= 'mode'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleCoreKeyWord5179); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getModeKeyword_20()); 
                          
                    }

                    }
                    break;
                case 22 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2363:2: kw= 'prototype'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleCoreKeyWord5198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getPrototypeKeyword_21()); 
                          
                    }

                    }
                    break;
                case 23 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2370:2: kw= 'to'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleCoreKeyWord5217); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getToKeyword_22()); 
                          
                    }

                    }
                    break;
                case 24 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2377:2: kw= 'end'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleCoreKeyWord5236); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getEndKeyword_23()); 
                          
                    }

                    }
                    break;
                case 25 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2384:2: kw= 'abstract'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleCoreKeyWord5255); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getAbstractKeyword_24()); 
                          
                    }

                    }
                    break;
                case 26 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2391:2: kw= 'access'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleCoreKeyWord5274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getAccessKeyword_25()); 
                          
                    }

                    }
                    break;
                case 27 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2398:2: kw= 'classifier'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleCoreKeyWord5293); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCoreKeyWordAccess().getClassifierKeyword_26()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCoreKeyWord"


    // $ANTLR start "entryRuleReferenceType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2411:1: entryRuleReferenceType returns [EObject current=null] : iv_ruleReferenceType= ruleReferenceType EOF ;
    public final EObject entryRuleReferenceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2412:2: (iv_ruleReferenceType= ruleReferenceType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2413:2: iv_ruleReferenceType= ruleReferenceType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceTypeRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceType_in_entryRuleReferenceType5333);
            iv_ruleReferenceType=ruleReferenceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceType5343); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferenceType"


    // $ANTLR start "ruleReferenceType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2420:1: ruleReferenceType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'reference' (otherlv_4= '(' ( (lv_namedElementReference_5_0= ruleQCReference ) ) (otherlv_6= ',' ( (lv_namedElementReference_7_0= ruleQCReference ) ) )* otherlv_8= ')' )? ) ;
    public final EObject ruleReferenceType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_namedElementReference_5_0 = null;

        EObject lv_namedElementReference_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2423:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'reference' (otherlv_4= '(' ( (lv_namedElementReference_5_0= ruleQCReference ) ) (otherlv_6= ',' ( (lv_namedElementReference_7_0= ruleQCReference ) ) )* otherlv_8= ')' )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2424:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'reference' (otherlv_4= '(' ( (lv_namedElementReference_5_0= ruleQCReference ) ) (otherlv_6= ',' ( (lv_namedElementReference_7_0= ruleQCReference ) ) )* otherlv_8= ')' )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2424:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'reference' (otherlv_4= '(' ( (lv_namedElementReference_5_0= ruleQCReference ) ) (otherlv_6= ',' ( (lv_namedElementReference_7_0= ruleQCReference ) ) )* otherlv_8= ')' )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2424:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'reference' (otherlv_4= '(' ( (lv_namedElementReference_5_0= ruleQCReference ) ) (otherlv_6= ',' ( (lv_namedElementReference_7_0= ruleQCReference ) ) )* otherlv_8= ')' )?
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2424:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2425:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2425:1: (lv_name_0_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2426:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferenceType5385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getReferenceTypeAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleReferenceType5402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReferenceTypeAccess().getColonKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleReferenceType5414); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getReferenceTypeAccess().getTypeKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,58,FOLLOW_58_in_ruleReferenceType5426); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getReferenceTypeAccess().getReferenceKeyword_3());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2454:1: (otherlv_4= '(' ( (lv_namedElementReference_5_0= ruleQCReference ) ) (otherlv_6= ',' ( (lv_namedElementReference_7_0= ruleQCReference ) ) )* otherlv_8= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==23) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2454:3: otherlv_4= '(' ( (lv_namedElementReference_5_0= ruleQCReference ) ) (otherlv_6= ',' ( (lv_namedElementReference_7_0= ruleQCReference ) ) )* otherlv_8= ')'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleReferenceType5439); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getReferenceTypeAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2458:1: ( (lv_namedElementReference_5_0= ruleQCReference ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2459:1: (lv_namedElementReference_5_0= ruleQCReference )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2459:1: (lv_namedElementReference_5_0= ruleQCReference )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2460:3: lv_namedElementReference_5_0= ruleQCReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceTypeAccess().getNamedElementReferenceQCReferenceParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQCReference_in_ruleReferenceType5460);
                    lv_namedElementReference_5_0=ruleQCReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReferenceTypeRule());
                      	        }
                             		add(
                             			current, 
                             			"namedElementReference",
                              		lv_namedElementReference_5_0, 
                              		"QCReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2476:2: (otherlv_6= ',' ( (lv_namedElementReference_7_0= ruleQCReference ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==15) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2476:4: otherlv_6= ',' ( (lv_namedElementReference_7_0= ruleQCReference ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleReferenceType5473); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getReferenceTypeAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2480:1: ( (lv_namedElementReference_7_0= ruleQCReference ) )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2481:1: (lv_namedElementReference_7_0= ruleQCReference )
                    	    {
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2481:1: (lv_namedElementReference_7_0= ruleQCReference )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2482:3: lv_namedElementReference_7_0= ruleQCReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReferenceTypeAccess().getNamedElementReferenceQCReferenceParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQCReference_in_ruleReferenceType5494);
                    	    lv_namedElementReference_7_0=ruleQCReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getReferenceTypeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"namedElementReference",
                    	              		lv_namedElementReference_7_0, 
                    	              		"QCReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleReferenceType5508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getReferenceTypeAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleReferenceType"


    // $ANTLR start "entryRuleUnnamedReferenceType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2510:1: entryRuleUnnamedReferenceType returns [EObject current=null] : iv_ruleUnnamedReferenceType= ruleUnnamedReferenceType EOF ;
    public final EObject entryRuleUnnamedReferenceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedReferenceType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2511:2: (iv_ruleUnnamedReferenceType= ruleUnnamedReferenceType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2512:2: iv_ruleUnnamedReferenceType= ruleUnnamedReferenceType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnnamedReferenceTypeRule()); 
            }
            pushFollow(FOLLOW_ruleUnnamedReferenceType_in_entryRuleUnnamedReferenceType5546);
            iv_ruleUnnamedReferenceType=ruleUnnamedReferenceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnnamedReferenceType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnnamedReferenceType5556); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnnamedReferenceType"


    // $ANTLR start "ruleUnnamedReferenceType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2519:1: ruleUnnamedReferenceType returns [EObject current=null] : (otherlv_0= 'reference' () (otherlv_2= '(' ( (lv_namedElementReference_3_0= ruleQCReference ) ) (otherlv_4= ',' ( (lv_namedElementReference_5_0= ruleQCReference ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleUnnamedReferenceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_namedElementReference_3_0 = null;

        EObject lv_namedElementReference_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2522:28: ( (otherlv_0= 'reference' () (otherlv_2= '(' ( (lv_namedElementReference_3_0= ruleQCReference ) ) (otherlv_4= ',' ( (lv_namedElementReference_5_0= ruleQCReference ) ) )* otherlv_6= ')' )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2523:1: (otherlv_0= 'reference' () (otherlv_2= '(' ( (lv_namedElementReference_3_0= ruleQCReference ) ) (otherlv_4= ',' ( (lv_namedElementReference_5_0= ruleQCReference ) ) )* otherlv_6= ')' )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2523:1: (otherlv_0= 'reference' () (otherlv_2= '(' ( (lv_namedElementReference_3_0= ruleQCReference ) ) (otherlv_4= ',' ( (lv_namedElementReference_5_0= ruleQCReference ) ) )* otherlv_6= ')' )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2523:3: otherlv_0= 'reference' () (otherlv_2= '(' ( (lv_namedElementReference_3_0= ruleQCReference ) ) (otherlv_4= ',' ( (lv_namedElementReference_5_0= ruleQCReference ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleUnnamedReferenceType5593); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUnnamedReferenceTypeAccess().getReferenceKeyword_0());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2527:1: ()
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2528:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnnamedReferenceTypeAccess().getReferenceTypeAction_1(),
                          current);
                  
            }

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2536:2: (otherlv_2= '(' ( (lv_namedElementReference_3_0= ruleQCReference ) ) (otherlv_4= ',' ( (lv_namedElementReference_5_0= ruleQCReference ) ) )* otherlv_6= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==23) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2536:4: otherlv_2= '(' ( (lv_namedElementReference_3_0= ruleQCReference ) ) (otherlv_4= ',' ( (lv_namedElementReference_5_0= ruleQCReference ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleUnnamedReferenceType5618); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getUnnamedReferenceTypeAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2540:1: ( (lv_namedElementReference_3_0= ruleQCReference ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2541:1: (lv_namedElementReference_3_0= ruleQCReference )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2541:1: (lv_namedElementReference_3_0= ruleQCReference )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2542:3: lv_namedElementReference_3_0= ruleQCReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnnamedReferenceTypeAccess().getNamedElementReferenceQCReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQCReference_in_ruleUnnamedReferenceType5639);
                    lv_namedElementReference_3_0=ruleQCReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnnamedReferenceTypeRule());
                      	        }
                             		add(
                             			current, 
                             			"namedElementReference",
                              		lv_namedElementReference_3_0, 
                              		"QCReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2558:2: (otherlv_4= ',' ( (lv_namedElementReference_5_0= ruleQCReference ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==15) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2558:4: otherlv_4= ',' ( (lv_namedElementReference_5_0= ruleQCReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleUnnamedReferenceType5652); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getUnnamedReferenceTypeAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2562:1: ( (lv_namedElementReference_5_0= ruleQCReference ) )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2563:1: (lv_namedElementReference_5_0= ruleQCReference )
                    	    {
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2563:1: (lv_namedElementReference_5_0= ruleQCReference )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2564:3: lv_namedElementReference_5_0= ruleQCReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getUnnamedReferenceTypeAccess().getNamedElementReferenceQCReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQCReference_in_ruleUnnamedReferenceType5673);
                    	    lv_namedElementReference_5_0=ruleQCReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getUnnamedReferenceTypeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"namedElementReference",
                    	              		lv_namedElementReference_5_0, 
                    	              		"QCReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleUnnamedReferenceType5687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getUnnamedReferenceTypeAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnnamedReferenceType"


    // $ANTLR start "entryRuleRecordType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2592:1: entryRuleRecordType returns [EObject current=null] : iv_ruleRecordType= ruleRecordType EOF ;
    public final EObject entryRuleRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2593:2: (iv_ruleRecordType= ruleRecordType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2594:2: iv_ruleRecordType= ruleRecordType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordTypeRule()); 
            }
            pushFollow(FOLLOW_ruleRecordType_in_entryRuleRecordType5725);
            iv_ruleRecordType=ruleRecordType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordType5735); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRecordType"


    // $ANTLR start "ruleRecordType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2601:1: ruleRecordType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'record' otherlv_4= '(' ( (lv_ownedField_5_0= ruleRecordField ) )+ otherlv_6= ')' ) ;
    public final EObject ruleRecordType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_ownedField_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2604:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'record' otherlv_4= '(' ( (lv_ownedField_5_0= ruleRecordField ) )+ otherlv_6= ')' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2605:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'record' otherlv_4= '(' ( (lv_ownedField_5_0= ruleRecordField ) )+ otherlv_6= ')' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2605:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'record' otherlv_4= '(' ( (lv_ownedField_5_0= ruleRecordField ) )+ otherlv_6= ')' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2605:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'type' otherlv_3= 'record' otherlv_4= '(' ( (lv_ownedField_5_0= ruleRecordField ) )+ otherlv_6= ')'
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2605:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2606:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2606:1: (lv_name_0_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2607:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecordType5777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRecordTypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleRecordType5794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRecordTypeAccess().getColonKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleRecordType5806); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRecordTypeAccess().getTypeKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,59,FOLLOW_59_in_ruleRecordType5818); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRecordTypeAccess().getRecordKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleRecordType5830); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRecordTypeAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2639:1: ( (lv_ownedField_5_0= ruleRecordField ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2640:1: (lv_ownedField_5_0= ruleRecordField )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2640:1: (lv_ownedField_5_0= ruleRecordField )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2641:3: lv_ownedField_5_0= ruleRecordField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRecordTypeAccess().getOwnedFieldRecordFieldParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRecordField_in_ruleRecordType5851);
            	    lv_ownedField_5_0=ruleRecordField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedField",
            	              		lv_ownedField_5_0, 
            	              		"RecordField");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleRecordType5864); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getRecordTypeAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRecordType"


    // $ANTLR start "entryRuleUnnamedRecordType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2669:1: entryRuleUnnamedRecordType returns [EObject current=null] : iv_ruleUnnamedRecordType= ruleUnnamedRecordType EOF ;
    public final EObject entryRuleUnnamedRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnnamedRecordType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2670:2: (iv_ruleUnnamedRecordType= ruleUnnamedRecordType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2671:2: iv_ruleUnnamedRecordType= ruleUnnamedRecordType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnnamedRecordTypeRule()); 
            }
            pushFollow(FOLLOW_ruleUnnamedRecordType_in_entryRuleUnnamedRecordType5900);
            iv_ruleUnnamedRecordType=ruleUnnamedRecordType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnnamedRecordType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnnamedRecordType5910); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnnamedRecordType"


    // $ANTLR start "ruleUnnamedRecordType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2678:1: ruleUnnamedRecordType returns [EObject current=null] : (otherlv_0= 'record' otherlv_1= '(' ( (lv_ownedField_2_0= ruleRecordField ) )+ otherlv_3= ')' ) ;
    public final EObject ruleUnnamedRecordType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedField_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2681:28: ( (otherlv_0= 'record' otherlv_1= '(' ( (lv_ownedField_2_0= ruleRecordField ) )+ otherlv_3= ')' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2682:1: (otherlv_0= 'record' otherlv_1= '(' ( (lv_ownedField_2_0= ruleRecordField ) )+ otherlv_3= ')' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2682:1: (otherlv_0= 'record' otherlv_1= '(' ( (lv_ownedField_2_0= ruleRecordField ) )+ otherlv_3= ')' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2682:3: otherlv_0= 'record' otherlv_1= '(' ( (lv_ownedField_2_0= ruleRecordField ) )+ otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleUnnamedRecordType5947); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUnnamedRecordTypeAccess().getRecordKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleUnnamedRecordType5959); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnnamedRecordTypeAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2690:1: ( (lv_ownedField_2_0= ruleRecordField ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2691:1: (lv_ownedField_2_0= ruleRecordField )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2691:1: (lv_ownedField_2_0= ruleRecordField )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2692:3: lv_ownedField_2_0= ruleRecordField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUnnamedRecordTypeAccess().getOwnedFieldRecordFieldParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRecordField_in_ruleUnnamedRecordType5980);
            	    lv_ownedField_2_0=ruleRecordField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUnnamedRecordTypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedField",
            	              		lv_ownedField_2_0, 
            	              		"RecordField");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleUnnamedRecordType5993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUnnamedRecordTypeAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnnamedRecordType"


    // $ANTLR start "entryRuleRecordField"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2720:1: entryRuleRecordField returns [EObject current=null] : iv_ruleRecordField= ruleRecordField EOF ;
    public final EObject entryRuleRecordField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordField = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2721:2: (iv_ruleRecordField= ruleRecordField EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2722:2: iv_ruleRecordField= ruleRecordField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordFieldRule()); 
            }
            pushFollow(FOLLOW_ruleRecordField_in_entryRuleRecordField6029);
            iv_ruleRecordField=ruleRecordField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordField6039); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRecordField"


    // $ANTLR start "ruleRecordField"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2729:1: ruleRecordField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQPREF ) ) | ( (lv_ownedPropertyType_3_0= ruleUnnamedPropertyType ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleRecordField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_ownedPropertyType_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2732:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQPREF ) ) | ( (lv_ownedPropertyType_3_0= ruleUnnamedPropertyType ) ) ) otherlv_4= ';' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2733:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQPREF ) ) | ( (lv_ownedPropertyType_3_0= ruleUnnamedPropertyType ) ) ) otherlv_4= ';' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2733:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQPREF ) ) | ( (lv_ownedPropertyType_3_0= ruleUnnamedPropertyType ) ) ) otherlv_4= ';' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2733:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQPREF ) ) | ( (lv_ownedPropertyType_3_0= ruleUnnamedPropertyType ) ) ) otherlv_4= ';'
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2733:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2734:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2734:1: (lv_name_0_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2735:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecordField6081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getRecordFieldAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRecordFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleRecordField6098); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRecordFieldAccess().getColonKeyword_1());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2755:1: ( ( ( ruleQPREF ) ) | ( (lv_ownedPropertyType_3_0= ruleUnnamedPropertyType ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            else if ( ((LA37_0>=20 && LA37_0<=22)||LA37_0==25||(LA37_0>=27 && LA37_0<=29)||LA37_0==31||(LA37_0>=58 && LA37_0<=59)||LA37_0==63) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2755:2: ( ( ruleQPREF ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2755:2: ( ( ruleQPREF ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2756:1: ( ruleQPREF )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2756:1: ( ruleQPREF )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2757:3: ruleQPREF
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRecordFieldRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRecordFieldAccess().getPropertyTypePropertyTypeCrossReference_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQPREF_in_ruleRecordField6126);
                    ruleQPREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2774:6: ( (lv_ownedPropertyType_3_0= ruleUnnamedPropertyType ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2774:6: ( (lv_ownedPropertyType_3_0= ruleUnnamedPropertyType ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2775:1: (lv_ownedPropertyType_3_0= ruleUnnamedPropertyType )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2775:1: (lv_ownedPropertyType_3_0= ruleUnnamedPropertyType )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2776:3: lv_ownedPropertyType_3_0= ruleUnnamedPropertyType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRecordFieldAccess().getOwnedPropertyTypeUnnamedPropertyTypeParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnnamedPropertyType_in_ruleRecordField6153);
                    lv_ownedPropertyType_3_0=ruleUnnamedPropertyType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRecordFieldRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedPropertyType",
                              		lv_ownedPropertyType_3_0, 
                              		"UnnamedPropertyType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleRecordField6166); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRecordFieldAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRecordField"


    // $ANTLR start "entryRulePropertyDefinition"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2804:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2805:2: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2806:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition6202);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition6212); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2813:1: rulePropertyDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_inherit_2_0= 'inherit' ) )? ( ( ( ruleQPREF ) ) | ( (lv_ownedPropertyType_4_0= ruleUnnamedPropertyType ) ) ) (otherlv_5= '=>' ( (lv_defaultValue_6_0= rulePropertyExpression ) ) )? otherlv_7= 'applies' otherlv_8= 'to' otherlv_9= '(' ( ( ( (lv_appliesTo_10_0= rulePropertyOwner ) ) (otherlv_11= ',' ( (lv_appliesTo_12_0= rulePropertyOwner ) ) )* ) | ( (lv_appliesTo_13_0= ruleAllReference ) ) ) otherlv_14= ')' otherlv_15= ';' ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_inherit_2_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_ownedPropertyType_4_0 = null;

        EObject lv_defaultValue_6_0 = null;

        EObject lv_appliesTo_10_0 = null;

        EObject lv_appliesTo_12_0 = null;

        EObject lv_appliesTo_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2816:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_inherit_2_0= 'inherit' ) )? ( ( ( ruleQPREF ) ) | ( (lv_ownedPropertyType_4_0= ruleUnnamedPropertyType ) ) ) (otherlv_5= '=>' ( (lv_defaultValue_6_0= rulePropertyExpression ) ) )? otherlv_7= 'applies' otherlv_8= 'to' otherlv_9= '(' ( ( ( (lv_appliesTo_10_0= rulePropertyOwner ) ) (otherlv_11= ',' ( (lv_appliesTo_12_0= rulePropertyOwner ) ) )* ) | ( (lv_appliesTo_13_0= ruleAllReference ) ) ) otherlv_14= ')' otherlv_15= ';' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2817:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_inherit_2_0= 'inherit' ) )? ( ( ( ruleQPREF ) ) | ( (lv_ownedPropertyType_4_0= ruleUnnamedPropertyType ) ) ) (otherlv_5= '=>' ( (lv_defaultValue_6_0= rulePropertyExpression ) ) )? otherlv_7= 'applies' otherlv_8= 'to' otherlv_9= '(' ( ( ( (lv_appliesTo_10_0= rulePropertyOwner ) ) (otherlv_11= ',' ( (lv_appliesTo_12_0= rulePropertyOwner ) ) )* ) | ( (lv_appliesTo_13_0= ruleAllReference ) ) ) otherlv_14= ')' otherlv_15= ';' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2817:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_inherit_2_0= 'inherit' ) )? ( ( ( ruleQPREF ) ) | ( (lv_ownedPropertyType_4_0= ruleUnnamedPropertyType ) ) ) (otherlv_5= '=>' ( (lv_defaultValue_6_0= rulePropertyExpression ) ) )? otherlv_7= 'applies' otherlv_8= 'to' otherlv_9= '(' ( ( ( (lv_appliesTo_10_0= rulePropertyOwner ) ) (otherlv_11= ',' ( (lv_appliesTo_12_0= rulePropertyOwner ) ) )* ) | ( (lv_appliesTo_13_0= ruleAllReference ) ) ) otherlv_14= ')' otherlv_15= ';' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2817:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_inherit_2_0= 'inherit' ) )? ( ( ( ruleQPREF ) ) | ( (lv_ownedPropertyType_4_0= ruleUnnamedPropertyType ) ) ) (otherlv_5= '=>' ( (lv_defaultValue_6_0= rulePropertyExpression ) ) )? otherlv_7= 'applies' otherlv_8= 'to' otherlv_9= '(' ( ( ( (lv_appliesTo_10_0= rulePropertyOwner ) ) (otherlv_11= ',' ( (lv_appliesTo_12_0= rulePropertyOwner ) ) )* ) | ( (lv_appliesTo_13_0= ruleAllReference ) ) ) otherlv_14= ')' otherlv_15= ';'
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2817:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2818:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2818:1: (lv_name_0_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2819:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyDefinition6254); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getPropertyDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulePropertyDefinition6271); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyDefinitionAccess().getColonKeyword_1());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2839:1: ( (lv_inherit_2_0= 'inherit' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==60) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2840:1: (lv_inherit_2_0= 'inherit' )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2840:1: (lv_inherit_2_0= 'inherit' )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2841:3: lv_inherit_2_0= 'inherit'
                    {
                    lv_inherit_2_0=(Token)match(input,60,FOLLOW_60_in_rulePropertyDefinition6289); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_inherit_2_0, grammarAccess.getPropertyDefinitionAccess().getInheritInheritKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "inherit", true, "inherit");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2854:3: ( ( ( ruleQPREF ) ) | ( (lv_ownedPropertyType_4_0= ruleUnnamedPropertyType ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            else if ( ((LA39_0>=20 && LA39_0<=22)||LA39_0==25||(LA39_0>=27 && LA39_0<=29)||LA39_0==31||(LA39_0>=58 && LA39_0<=59)||LA39_0==63) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2854:4: ( ( ruleQPREF ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2854:4: ( ( ruleQPREF ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2855:1: ( ruleQPREF )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2855:1: ( ruleQPREF )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2856:3: ruleQPREF
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getPropertyTypePropertyTypeCrossReference_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQPREF_in_rulePropertyDefinition6331);
                    ruleQPREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2873:6: ( (lv_ownedPropertyType_4_0= ruleUnnamedPropertyType ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2873:6: ( (lv_ownedPropertyType_4_0= ruleUnnamedPropertyType ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2874:1: (lv_ownedPropertyType_4_0= ruleUnnamedPropertyType )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2874:1: (lv_ownedPropertyType_4_0= ruleUnnamedPropertyType )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2875:3: lv_ownedPropertyType_4_0= ruleUnnamedPropertyType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getOwnedPropertyTypeUnnamedPropertyTypeParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnnamedPropertyType_in_rulePropertyDefinition6358);
                    lv_ownedPropertyType_4_0=ruleUnnamedPropertyType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedPropertyType",
                              		lv_ownedPropertyType_4_0, 
                              		"UnnamedPropertyType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2891:3: (otherlv_5= '=>' ( (lv_defaultValue_6_0= rulePropertyExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==26) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2891:5: otherlv_5= '=>' ( (lv_defaultValue_6_0= rulePropertyExpression ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_rulePropertyDefinition6372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPropertyDefinitionAccess().getEqualsSignGreaterThanSignKeyword_4_0());
                          
                    }
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2895:1: ( (lv_defaultValue_6_0= rulePropertyExpression ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2896:1: (lv_defaultValue_6_0= rulePropertyExpression )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2896:1: (lv_defaultValue_6_0= rulePropertyExpression )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2897:3: lv_defaultValue_6_0= rulePropertyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getDefaultValuePropertyExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyExpression_in_rulePropertyDefinition6393);
                    lv_defaultValue_6_0=rulePropertyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"defaultValue",
                              		lv_defaultValue_6_0, 
                              		"PropertyExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,61,FOLLOW_61_in_rulePropertyDefinition6407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getPropertyDefinitionAccess().getAppliesKeyword_5());
                  
            }
            otherlv_8=(Token)match(input,55,FOLLOW_55_in_rulePropertyDefinition6419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getPropertyDefinitionAccess().getToKeyword_6());
                  
            }
            otherlv_9=(Token)match(input,23,FOLLOW_23_in_rulePropertyDefinition6431); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getPropertyDefinitionAccess().getLeftParenthesisKeyword_7());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2925:1: ( ( ( (lv_appliesTo_10_0= rulePropertyOwner ) ) (otherlv_11= ',' ( (lv_appliesTo_12_0= rulePropertyOwner ) ) )* ) | ( (lv_appliesTo_13_0= ruleAllReference ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID||LA42_0==17||LA42_0==19||(LA42_0>=31 && LA42_0<=32)||(LA42_0>=34 && LA42_0<=57)) ) {
                alt42=1;
            }
            else if ( (LA42_0==62) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2925:2: ( ( (lv_appliesTo_10_0= rulePropertyOwner ) ) (otherlv_11= ',' ( (lv_appliesTo_12_0= rulePropertyOwner ) ) )* )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2925:2: ( ( (lv_appliesTo_10_0= rulePropertyOwner ) ) (otherlv_11= ',' ( (lv_appliesTo_12_0= rulePropertyOwner ) ) )* )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2925:3: ( (lv_appliesTo_10_0= rulePropertyOwner ) ) (otherlv_11= ',' ( (lv_appliesTo_12_0= rulePropertyOwner ) ) )*
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2925:3: ( (lv_appliesTo_10_0= rulePropertyOwner ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2926:1: (lv_appliesTo_10_0= rulePropertyOwner )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2926:1: (lv_appliesTo_10_0= rulePropertyOwner )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2927:3: lv_appliesTo_10_0= rulePropertyOwner
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAppliesToPropertyOwnerParserRuleCall_8_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyOwner_in_rulePropertyDefinition6454);
                    lv_appliesTo_10_0=rulePropertyOwner();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"appliesTo",
                              		lv_appliesTo_10_0, 
                              		"PropertyOwner");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2943:2: (otherlv_11= ',' ( (lv_appliesTo_12_0= rulePropertyOwner ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==15) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2943:4: otherlv_11= ',' ( (lv_appliesTo_12_0= rulePropertyOwner ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_rulePropertyDefinition6467); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_8_0_1_0());
                    	          
                    	    }
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2947:1: ( (lv_appliesTo_12_0= rulePropertyOwner ) )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2948:1: (lv_appliesTo_12_0= rulePropertyOwner )
                    	    {
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2948:1: (lv_appliesTo_12_0= rulePropertyOwner )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2949:3: lv_appliesTo_12_0= rulePropertyOwner
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAppliesToPropertyOwnerParserRuleCall_8_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePropertyOwner_in_rulePropertyDefinition6488);
                    	    lv_appliesTo_12_0=rulePropertyOwner();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"appliesTo",
                    	              		lv_appliesTo_12_0, 
                    	              		"PropertyOwner");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2966:6: ( (lv_appliesTo_13_0= ruleAllReference ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2966:6: ( (lv_appliesTo_13_0= ruleAllReference ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2967:1: (lv_appliesTo_13_0= ruleAllReference )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2967:1: (lv_appliesTo_13_0= ruleAllReference )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:2968:3: lv_appliesTo_13_0= ruleAllReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAppliesToAllReferenceParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAllReference_in_rulePropertyDefinition6518);
                    lv_appliesTo_13_0=ruleAllReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"appliesTo",
                              		lv_appliesTo_13_0, 
                              		"AllReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,24,FOLLOW_24_in_rulePropertyDefinition6531); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getPropertyDefinitionAccess().getRightParenthesisKeyword_9());
                  
            }
            otherlv_15=(Token)match(input,16,FOLLOW_16_in_rulePropertyDefinition6543); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRuleAllReference"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3000:1: entryRuleAllReference returns [EObject current=null] : iv_ruleAllReference= ruleAllReference EOF ;
    public final EObject entryRuleAllReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllReference = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3001:2: (iv_ruleAllReference= ruleAllReference EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3002:2: iv_ruleAllReference= ruleAllReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAllReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleAllReference_in_entryRuleAllReference6579);
            iv_ruleAllReference=ruleAllReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAllReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllReference6589); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAllReference"


    // $ANTLR start "ruleAllReference"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3009:1: ruleAllReference returns [EObject current=null] : ( (lv_metaclassName_0_0= 'all' ) ) ;
    public final EObject ruleAllReference() throws RecognitionException {
        EObject current = null;

        Token lv_metaclassName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3012:28: ( ( (lv_metaclassName_0_0= 'all' ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3013:1: ( (lv_metaclassName_0_0= 'all' ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3013:1: ( (lv_metaclassName_0_0= 'all' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3014:1: (lv_metaclassName_0_0= 'all' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3014:1: (lv_metaclassName_0_0= 'all' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3015:3: lv_metaclassName_0_0= 'all'
            {
            lv_metaclassName_0_0=(Token)match(input,62,FOLLOW_62_in_ruleAllReference6631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_metaclassName_0_0, grammarAccess.getAllReferenceAccess().getMetaclassNameAllKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAllReferenceRule());
              	        }
                     		addWithLastConsumed(current, "metaclassName", lv_metaclassName_0_0, "all");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAllReference"


    // $ANTLR start "entryRuleListType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3036:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3037:2: (iv_ruleListType= ruleListType EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3038:2: iv_ruleListType= ruleListType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListTypeRule()); 
            }
            pushFollow(FOLLOW_ruleListType_in_entryRuleListType6679);
            iv_ruleListType=ruleListType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListType6689); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListType"


    // $ANTLR start "ruleListType"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3045:1: ruleListType returns [EObject current=null] : (otherlv_0= 'list' otherlv_1= 'of' ( ( ( ruleQPREF ) ) | ( (lv_ownedElementType_3_0= ruleUnnamedPropertyType ) ) ) ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_ownedElementType_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3048:28: ( (otherlv_0= 'list' otherlv_1= 'of' ( ( ( ruleQPREF ) ) | ( (lv_ownedElementType_3_0= ruleUnnamedPropertyType ) ) ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3049:1: (otherlv_0= 'list' otherlv_1= 'of' ( ( ( ruleQPREF ) ) | ( (lv_ownedElementType_3_0= ruleUnnamedPropertyType ) ) ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3049:1: (otherlv_0= 'list' otherlv_1= 'of' ( ( ( ruleQPREF ) ) | ( (lv_ownedElementType_3_0= ruleUnnamedPropertyType ) ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3049:3: otherlv_0= 'list' otherlv_1= 'of' ( ( ( ruleQPREF ) ) | ( (lv_ownedElementType_3_0= ruleUnnamedPropertyType ) ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleListType6726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getListTypeAccess().getListKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleListType6738); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getListTypeAccess().getOfKeyword_1());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3057:1: ( ( ( ruleQPREF ) ) | ( (lv_ownedElementType_3_0= ruleUnnamedPropertyType ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            else if ( ((LA43_0>=20 && LA43_0<=22)||LA43_0==25||(LA43_0>=27 && LA43_0<=29)||LA43_0==31||(LA43_0>=58 && LA43_0<=59)||LA43_0==63) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3057:2: ( ( ruleQPREF ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3057:2: ( ( ruleQPREF ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3058:1: ( ruleQPREF )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3058:1: ( ruleQPREF )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3059:3: ruleQPREF
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getListTypeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListTypeAccess().getElementTypePropertyTypeCrossReference_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQPREF_in_ruleListType6766);
                    ruleQPREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3076:6: ( (lv_ownedElementType_3_0= ruleUnnamedPropertyType ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3076:6: ( (lv_ownedElementType_3_0= ruleUnnamedPropertyType ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3077:1: (lv_ownedElementType_3_0= ruleUnnamedPropertyType )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3077:1: (lv_ownedElementType_3_0= ruleUnnamedPropertyType )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3078:3: lv_ownedElementType_3_0= ruleUnnamedPropertyType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListTypeAccess().getOwnedElementTypeUnnamedPropertyTypeParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnnamedPropertyType_in_ruleListType6793);
                    lv_ownedElementType_3_0=ruleUnnamedPropertyType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedElementType",
                              		lv_ownedElementType_3_0, 
                              		"UnnamedPropertyType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleListType"


    // $ANTLR start "entryRulePropertyOwner"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3102:1: entryRulePropertyOwner returns [EObject current=null] : iv_rulePropertyOwner= rulePropertyOwner EOF ;
    public final EObject entryRulePropertyOwner() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyOwner = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3103:2: (iv_rulePropertyOwner= rulePropertyOwner EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3104:2: iv_rulePropertyOwner= rulePropertyOwner EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyOwnerRule()); 
            }
            pushFollow(FOLLOW_rulePropertyOwner_in_entryRulePropertyOwner6830);
            iv_rulePropertyOwner=rulePropertyOwner();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyOwner; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyOwner6840); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyOwner"


    // $ANTLR start "rulePropertyOwner"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3111:1: rulePropertyOwner returns [EObject current=null] : this_QCReference_0= ruleQCReference ;
    public final EObject rulePropertyOwner() throws RecognitionException {
        EObject current = null;

        EObject this_QCReference_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3114:28: (this_QCReference_0= ruleQCReference )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3116:2: this_QCReference_0= ruleQCReference
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPropertyOwnerAccess().getQCReferenceParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleQCReference_in_rulePropertyOwner6889);
            this_QCReference_0=ruleQCReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_QCReference_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropertyOwner"


    // $ANTLR start "entryRulePropertyConstant"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3135:1: entryRulePropertyConstant returns [EObject current=null] : iv_rulePropertyConstant= rulePropertyConstant EOF ;
    public final EObject entryRulePropertyConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyConstant = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3136:2: (iv_rulePropertyConstant= rulePropertyConstant EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3137:2: iv_rulePropertyConstant= rulePropertyConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyConstantRule()); 
            }
            pushFollow(FOLLOW_rulePropertyConstant_in_entryRulePropertyConstant6923);
            iv_rulePropertyConstant=rulePropertyConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyConstant6933); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyConstant"


    // $ANTLR start "rulePropertyConstant"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3144:1: rulePropertyConstant returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'constant' ( ( ( ruleQPREF ) ) | ( (lv_ownedPropertyType_4_0= ruleUnnamedPropertyType ) ) ) otherlv_5= '=>' ( (lv_constantValue_6_0= ruleConstantPropertyExpression ) ) otherlv_7= ';' ) ;
    public final EObject rulePropertyConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedPropertyType_4_0 = null;

        EObject lv_constantValue_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3147:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'constant' ( ( ( ruleQPREF ) ) | ( (lv_ownedPropertyType_4_0= ruleUnnamedPropertyType ) ) ) otherlv_5= '=>' ( (lv_constantValue_6_0= ruleConstantPropertyExpression ) ) otherlv_7= ';' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3148:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'constant' ( ( ( ruleQPREF ) ) | ( (lv_ownedPropertyType_4_0= ruleUnnamedPropertyType ) ) ) otherlv_5= '=>' ( (lv_constantValue_6_0= ruleConstantPropertyExpression ) ) otherlv_7= ';' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3148:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'constant' ( ( ( ruleQPREF ) ) | ( (lv_ownedPropertyType_4_0= ruleUnnamedPropertyType ) ) ) otherlv_5= '=>' ( (lv_constantValue_6_0= ruleConstantPropertyExpression ) ) otherlv_7= ';' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3148:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'constant' ( ( ( ruleQPREF ) ) | ( (lv_ownedPropertyType_4_0= ruleUnnamedPropertyType ) ) ) otherlv_5= '=>' ( (lv_constantValue_6_0= ruleConstantPropertyExpression ) ) otherlv_7= ';'
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3148:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3149:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3149:1: (lv_name_0_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3150:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyConstant6975); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getPropertyConstantAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyConstantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulePropertyConstant6992); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyConstantAccess().getColonKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,64,FOLLOW_64_in_rulePropertyConstant7004); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPropertyConstantAccess().getConstantKeyword_2());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3174:1: ( ( ( ruleQPREF ) ) | ( (lv_ownedPropertyType_4_0= ruleUnnamedPropertyType ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( ((LA44_0>=20 && LA44_0<=22)||LA44_0==25||(LA44_0>=27 && LA44_0<=29)||LA44_0==31||(LA44_0>=58 && LA44_0<=59)||LA44_0==63) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3174:2: ( ( ruleQPREF ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3174:2: ( ( ruleQPREF ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3175:1: ( ruleQPREF )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3175:1: ( ruleQPREF )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3176:3: ruleQPREF
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyConstantRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyConstantAccess().getPropertyTypePropertyTypeCrossReference_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQPREF_in_rulePropertyConstant7032);
                    ruleQPREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3193:6: ( (lv_ownedPropertyType_4_0= ruleUnnamedPropertyType ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3193:6: ( (lv_ownedPropertyType_4_0= ruleUnnamedPropertyType ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3194:1: (lv_ownedPropertyType_4_0= ruleUnnamedPropertyType )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3194:1: (lv_ownedPropertyType_4_0= ruleUnnamedPropertyType )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3195:3: lv_ownedPropertyType_4_0= ruleUnnamedPropertyType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyConstantAccess().getOwnedPropertyTypeUnnamedPropertyTypeParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnnamedPropertyType_in_rulePropertyConstant7059);
                    lv_ownedPropertyType_4_0=ruleUnnamedPropertyType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyConstantRule());
                      	        }
                             		set(
                             			current, 
                             			"ownedPropertyType",
                              		lv_ownedPropertyType_4_0, 
                              		"UnnamedPropertyType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_rulePropertyConstant7072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPropertyConstantAccess().getEqualsSignGreaterThanSignKeyword_4());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3215:1: ( (lv_constantValue_6_0= ruleConstantPropertyExpression ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3216:1: (lv_constantValue_6_0= ruleConstantPropertyExpression )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3216:1: (lv_constantValue_6_0= ruleConstantPropertyExpression )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3217:3: lv_constantValue_6_0= ruleConstantPropertyExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyConstantAccess().getConstantValueConstantPropertyExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConstantPropertyExpression_in_rulePropertyConstant7093);
            lv_constantValue_6_0=ruleConstantPropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyConstantRule());
              	        }
                     		set(
                     			current, 
                     			"constantValue",
                      		lv_constantValue_6_0, 
                      		"ConstantPropertyExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_rulePropertyConstant7105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getPropertyConstantAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropertyConstant"


    // $ANTLR start "entryRuleNumberValue"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3245:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3246:2: (iv_ruleNumberValue= ruleNumberValue EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3247:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberValueRule()); 
            }
            pushFollow(FOLLOW_ruleNumberValue_in_entryRuleNumberValue7141);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValue7151); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3254:1: ruleNumberValue returns [EObject current=null] : (this_RealLit_0= ruleRealLit | this_IntegerLit_1= ruleIntegerLit ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject this_RealLit_0 = null;

        EObject this_IntegerLit_1 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3257:28: ( (this_RealLit_0= ruleRealLit | this_IntegerLit_1= ruleIntegerLit ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3258:1: (this_RealLit_0= ruleRealLit | this_IntegerLit_1= ruleIntegerLit )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3258:1: (this_RealLit_0= ruleRealLit | this_IntegerLit_1= ruleIntegerLit )
            int alt45=2;
            switch ( input.LA(1) ) {
            case 78:
                {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==RULE_INT) ) {
                    int LA45_3 = input.LA(3);

                    if ( (LA45_3==EOF||LA45_3==15||LA45_3==24) ) {
                        alt45=2;
                    }
                    else if ( (LA45_3==66) ) {
                        alt45=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
                }
                break;
            case 79:
                {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==RULE_INT) ) {
                    int LA45_3 = input.LA(3);

                    if ( (LA45_3==EOF||LA45_3==15||LA45_3==24) ) {
                        alt45=2;
                    }
                    else if ( (LA45_3==66) ) {
                        alt45=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA45_3 = input.LA(2);

                if ( (LA45_3==EOF||LA45_3==15||LA45_3==24) ) {
                    alt45=2;
                }
                else if ( (LA45_3==66) ) {
                    alt45=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3259:2: this_RealLit_0= ruleRealLit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberValueAccess().getRealLitParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLit_in_ruleNumberValue7201);
                    this_RealLit_0=ruleRealLit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RealLit_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3272:2: this_IntegerLit_1= ruleIntegerLit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberValueAccess().getIntegerLitParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerLit_in_ruleNumberValue7231);
                    this_IntegerLit_1=ruleIntegerLit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerLit_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleRealLit"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3291:1: entryRuleRealLit returns [EObject current=null] : iv_ruleRealLit= ruleRealLit EOF ;
    public final EObject entryRuleRealLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLit = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3292:2: (iv_ruleRealLit= ruleRealLit EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3293:2: iv_ruleRealLit= ruleRealLit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLitRule()); 
            }
            pushFollow(FOLLOW_ruleRealLit_in_entryRuleRealLit7266);
            iv_ruleRealLit=ruleRealLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLit7276); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRealLit"


    // $ANTLR start "ruleRealLit"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3300:1: ruleRealLit returns [EObject current=null] : ( (lv_value_0_0= ruleSignedReal ) ) ;
    public final EObject ruleRealLit() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3303:28: ( ( (lv_value_0_0= ruleSignedReal ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3304:1: ( (lv_value_0_0= ruleSignedReal ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3304:1: ( (lv_value_0_0= ruleSignedReal ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3305:1: (lv_value_0_0= ruleSignedReal )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3305:1: (lv_value_0_0= ruleSignedReal )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3306:3: lv_value_0_0= ruleSignedReal
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRealLitAccess().getValueSignedRealParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSignedReal_in_ruleRealLit7321);
            lv_value_0_0=ruleSignedReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRealLitRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"SignedReal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRealLit"


    // $ANTLR start "entryRuleIntegerLit"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3330:1: entryRuleIntegerLit returns [EObject current=null] : iv_ruleIntegerLit= ruleIntegerLit EOF ;
    public final EObject entryRuleIntegerLit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLit = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3331:2: (iv_ruleIntegerLit= ruleIntegerLit EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3332:2: iv_ruleIntegerLit= ruleIntegerLit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLitRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerLit_in_entryRuleIntegerLit7356);
            iv_ruleIntegerLit=ruleIntegerLit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLit7366); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerLit"


    // $ANTLR start "ruleIntegerLit"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3339:1: ruleIntegerLit returns [EObject current=null] : ( (lv_value_0_0= ruleSignedInt ) ) ;
    public final EObject ruleIntegerLit() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3342:28: ( ( (lv_value_0_0= ruleSignedInt ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3343:1: ( (lv_value_0_0= ruleSignedInt ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3343:1: ( (lv_value_0_0= ruleSignedInt ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3344:1: (lv_value_0_0= ruleSignedInt )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3344:1: (lv_value_0_0= ruleSignedInt )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3345:3: lv_value_0_0= ruleSignedInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerLitAccess().getValueSignedIntParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSignedInt_in_ruleIntegerLit7411);
            lv_value_0_0=ruleSignedInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerLitRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"SignedInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntegerLit"


    // $ANTLR start "entryRuleBasicPropertyAssociation"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3369:1: entryRuleBasicPropertyAssociation returns [EObject current=null] : iv_ruleBasicPropertyAssociation= ruleBasicPropertyAssociation EOF ;
    public final EObject entryRuleBasicPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicPropertyAssociation = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3370:2: (iv_ruleBasicPropertyAssociation= ruleBasicPropertyAssociation EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3371:2: iv_ruleBasicPropertyAssociation= ruleBasicPropertyAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicPropertyAssociationRule()); 
            }
            pushFollow(FOLLOW_ruleBasicPropertyAssociation_in_entryRuleBasicPropertyAssociation7446);
            iv_ruleBasicPropertyAssociation=ruleBasicPropertyAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicPropertyAssociation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicPropertyAssociation7456); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBasicPropertyAssociation"


    // $ANTLR start "ruleBasicPropertyAssociation"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3378:1: ruleBasicPropertyAssociation returns [EObject current=null] : ( ( ( ruleQPREF ) ) otherlv_1= '=>' ( (lv_ownedValue_2_0= rulePropertyValue ) ) otherlv_3= ';' ) ;
    public final EObject ruleBasicPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3381:28: ( ( ( ( ruleQPREF ) ) otherlv_1= '=>' ( (lv_ownedValue_2_0= rulePropertyValue ) ) otherlv_3= ';' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3382:1: ( ( ( ruleQPREF ) ) otherlv_1= '=>' ( (lv_ownedValue_2_0= rulePropertyValue ) ) otherlv_3= ';' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3382:1: ( ( ( ruleQPREF ) ) otherlv_1= '=>' ( (lv_ownedValue_2_0= rulePropertyValue ) ) otherlv_3= ';' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3382:2: ( ( ruleQPREF ) ) otherlv_1= '=>' ( (lv_ownedValue_2_0= rulePropertyValue ) ) otherlv_3= ';'
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3382:2: ( ( ruleQPREF ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3383:1: ( ruleQPREF )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3383:1: ( ruleQPREF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3384:3: ruleQPREF
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBasicPropertyAssociationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBasicPropertyAssociationAccess().getPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQPREF_in_ruleBasicPropertyAssociation7508);
            ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleBasicPropertyAssociation7520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBasicPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3404:1: ( (lv_ownedValue_2_0= rulePropertyValue ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3405:1: (lv_ownedValue_2_0= rulePropertyValue )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3405:1: (lv_ownedValue_2_0= rulePropertyValue )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3406:3: lv_ownedValue_2_0= rulePropertyValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBasicPropertyAssociationAccess().getOwnedValuePropertyValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyValue_in_ruleBasicPropertyAssociation7541);
            lv_ownedValue_2_0=rulePropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBasicPropertyAssociationRule());
              	        }
                     		add(
                     			current, 
                     			"ownedValue",
                      		lv_ownedValue_2_0, 
                      		"PropertyValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleBasicPropertyAssociation7553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBasicPropertyAssociationAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBasicPropertyAssociation"


    // $ANTLR start "entryRuleContainedPropertyAssociation"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3434:1: entryRuleContainedPropertyAssociation returns [EObject current=null] : iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF ;
    public final EObject entryRuleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainedPropertyAssociation = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3435:2: (iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3436:2: iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainedPropertyAssociationRule()); 
            }
            pushFollow(FOLLOW_ruleContainedPropertyAssociation_in_entryRuleContainedPropertyAssociation7589);
            iv_ruleContainedPropertyAssociation=ruleContainedPropertyAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainedPropertyAssociation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainedPropertyAssociation7599); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContainedPropertyAssociation"


    // $ANTLR start "ruleContainedPropertyAssociation"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3443:1: ruleContainedPropertyAssociation returns [EObject current=null] : ( ( ( ruleQPREF ) ) (otherlv_1= '=>' | ( (lv_append_2_0= '+=>' ) ) ) ( (lv_constant_3_0= 'constant' ) )? ( ( ( ( '(' )=>otherlv_4= '(' ) ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) (otherlv_6= ',' ( (lv_ownedValue_7_0= ruleModalPropertyValue ) ) )* otherlv_8= ')' ) | ( (lv_ownedValue_9_0= rulePropertyValue ) ) ) ( ( ( 'applies' )=>otherlv_10= 'applies' ) otherlv_11= 'to' ( (lv_appliesTo_12_0= ruleContainmentPath ) ) (otherlv_13= ',' ( (lv_appliesTo_14_0= ruleContainmentPath ) ) )* )? otherlv_15= ';' ) ;
    public final EObject ruleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_append_2_0=null;
        Token lv_constant_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_ownedValue_5_0 = null;

        EObject lv_ownedValue_7_0 = null;

        EObject lv_ownedValue_9_0 = null;

        EObject lv_appliesTo_12_0 = null;

        EObject lv_appliesTo_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3446:28: ( ( ( ( ruleQPREF ) ) (otherlv_1= '=>' | ( (lv_append_2_0= '+=>' ) ) ) ( (lv_constant_3_0= 'constant' ) )? ( ( ( ( '(' )=>otherlv_4= '(' ) ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) (otherlv_6= ',' ( (lv_ownedValue_7_0= ruleModalPropertyValue ) ) )* otherlv_8= ')' ) | ( (lv_ownedValue_9_0= rulePropertyValue ) ) ) ( ( ( 'applies' )=>otherlv_10= 'applies' ) otherlv_11= 'to' ( (lv_appliesTo_12_0= ruleContainmentPath ) ) (otherlv_13= ',' ( (lv_appliesTo_14_0= ruleContainmentPath ) ) )* )? otherlv_15= ';' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3447:1: ( ( ( ruleQPREF ) ) (otherlv_1= '=>' | ( (lv_append_2_0= '+=>' ) ) ) ( (lv_constant_3_0= 'constant' ) )? ( ( ( ( '(' )=>otherlv_4= '(' ) ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) (otherlv_6= ',' ( (lv_ownedValue_7_0= ruleModalPropertyValue ) ) )* otherlv_8= ')' ) | ( (lv_ownedValue_9_0= rulePropertyValue ) ) ) ( ( ( 'applies' )=>otherlv_10= 'applies' ) otherlv_11= 'to' ( (lv_appliesTo_12_0= ruleContainmentPath ) ) (otherlv_13= ',' ( (lv_appliesTo_14_0= ruleContainmentPath ) ) )* )? otherlv_15= ';' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3447:1: ( ( ( ruleQPREF ) ) (otherlv_1= '=>' | ( (lv_append_2_0= '+=>' ) ) ) ( (lv_constant_3_0= 'constant' ) )? ( ( ( ( '(' )=>otherlv_4= '(' ) ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) (otherlv_6= ',' ( (lv_ownedValue_7_0= ruleModalPropertyValue ) ) )* otherlv_8= ')' ) | ( (lv_ownedValue_9_0= rulePropertyValue ) ) ) ( ( ( 'applies' )=>otherlv_10= 'applies' ) otherlv_11= 'to' ( (lv_appliesTo_12_0= ruleContainmentPath ) ) (otherlv_13= ',' ( (lv_appliesTo_14_0= ruleContainmentPath ) ) )* )? otherlv_15= ';' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3447:2: ( ( ruleQPREF ) ) (otherlv_1= '=>' | ( (lv_append_2_0= '+=>' ) ) ) ( (lv_constant_3_0= 'constant' ) )? ( ( ( ( '(' )=>otherlv_4= '(' ) ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) (otherlv_6= ',' ( (lv_ownedValue_7_0= ruleModalPropertyValue ) ) )* otherlv_8= ')' ) | ( (lv_ownedValue_9_0= rulePropertyValue ) ) ) ( ( ( 'applies' )=>otherlv_10= 'applies' ) otherlv_11= 'to' ( (lv_appliesTo_12_0= ruleContainmentPath ) ) (otherlv_13= ',' ( (lv_appliesTo_14_0= ruleContainmentPath ) ) )* )? otherlv_15= ';'
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3447:2: ( ( ruleQPREF ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3448:1: ( ruleQPREF )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3448:1: ( ruleQPREF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3449:3: ruleQPREF
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQPREF_in_ruleContainedPropertyAssociation7651);
            ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3465:2: (otherlv_1= '=>' | ( (lv_append_2_0= '+=>' ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==26) ) {
                alt46=1;
            }
            else if ( (LA46_0==65) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3465:4: otherlv_1= '=>'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleContainedPropertyAssociation7664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3470:6: ( (lv_append_2_0= '+=>' ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3470:6: ( (lv_append_2_0= '+=>' ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3471:1: (lv_append_2_0= '+=>' )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3471:1: (lv_append_2_0= '+=>' )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3472:3: lv_append_2_0= '+=>'
                    {
                    lv_append_2_0=(Token)match(input,65,FOLLOW_65_in_ruleContainedPropertyAssociation7688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_append_2_0, grammarAccess.getContainedPropertyAssociationAccess().getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                      	        }
                             		setWithLastConsumed(current, "append", true, "+=>");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3485:3: ( (lv_constant_3_0= 'constant' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==64) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3486:1: (lv_constant_3_0= 'constant' )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3486:1: (lv_constant_3_0= 'constant' )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3487:3: lv_constant_3_0= 'constant'
                    {
                    lv_constant_3_0=(Token)match(input,64,FOLLOW_64_in_ruleContainedPropertyAssociation7720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_constant_3_0, grammarAccess.getContainedPropertyAssociationAccess().getConstantConstantKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                      	        }
                             		setWithLastConsumed(current, "constant", true, "constant");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3500:3: ( ( ( ( '(' )=>otherlv_4= '(' ) ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) (otherlv_6= ',' ( (lv_ownedValue_7_0= ruleModalPropertyValue ) ) )* otherlv_8= ')' ) | ( (lv_ownedValue_9_0= rulePropertyValue ) ) )
            int alt49=2;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3500:4: ( ( ( '(' )=>otherlv_4= '(' ) ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) (otherlv_6= ',' ( (lv_ownedValue_7_0= ruleModalPropertyValue ) ) )* otherlv_8= ')' )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3500:4: ( ( ( '(' )=>otherlv_4= '(' ) ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) (otherlv_6= ',' ( (lv_ownedValue_7_0= ruleModalPropertyValue ) ) )* otherlv_8= ')' )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3500:5: ( ( '(' )=>otherlv_4= '(' ) ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) (otherlv_6= ',' ( (lv_ownedValue_7_0= ruleModalPropertyValue ) ) )* otherlv_8= ')'
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3500:5: ( ( '(' )=>otherlv_4= '(' )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3500:6: ( '(' )=>otherlv_4= '('
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleContainedPropertyAssociation7756); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getContainedPropertyAssociationAccess().getLeftParenthesisKeyword_3_0_0());
                          
                    }

                    }

                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3505:2: ( (lv_ownedValue_5_0= ruleModalPropertyValue ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3506:1: (lv_ownedValue_5_0= ruleModalPropertyValue )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3506:1: (lv_ownedValue_5_0= ruleModalPropertyValue )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3507:3: lv_ownedValue_5_0= ruleModalPropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueModalPropertyValueParserRuleCall_3_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleModalPropertyValue_in_ruleContainedPropertyAssociation7778);
                    lv_ownedValue_5_0=ruleModalPropertyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedValue",
                              		lv_ownedValue_5_0, 
                              		"ModalPropertyValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3523:2: (otherlv_6= ',' ( (lv_ownedValue_7_0= ruleModalPropertyValue ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==15) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3523:4: otherlv_6= ',' ( (lv_ownedValue_7_0= ruleModalPropertyValue ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleContainedPropertyAssociation7791); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_0_2_0());
                    	          
                    	    }
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3527:1: ( (lv_ownedValue_7_0= ruleModalPropertyValue ) )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3528:1: (lv_ownedValue_7_0= ruleModalPropertyValue )
                    	    {
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3528:1: (lv_ownedValue_7_0= ruleModalPropertyValue )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3529:3: lv_ownedValue_7_0= ruleModalPropertyValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueModalPropertyValueParserRuleCall_3_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleModalPropertyValue_in_ruleContainedPropertyAssociation7812);
                    	    lv_ownedValue_7_0=ruleModalPropertyValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedValue",
                    	              		lv_ownedValue_7_0, 
                    	              		"ModalPropertyValue");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleContainedPropertyAssociation7826); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getContainedPropertyAssociationAccess().getRightParenthesisKeyword_3_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3550:6: ( (lv_ownedValue_9_0= rulePropertyValue ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3550:6: ( (lv_ownedValue_9_0= rulePropertyValue ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3551:1: (lv_ownedValue_9_0= rulePropertyValue )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3551:1: (lv_ownedValue_9_0= rulePropertyValue )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3552:3: lv_ownedValue_9_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValuePropertyValueParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_ruleContainedPropertyAssociation7854);
                    lv_ownedValue_9_0=rulePropertyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedValue",
                              		lv_ownedValue_9_0, 
                              		"PropertyValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3568:3: ( ( ( 'applies' )=>otherlv_10= 'applies' ) otherlv_11= 'to' ( (lv_appliesTo_12_0= ruleContainmentPath ) ) (otherlv_13= ',' ( (lv_appliesTo_14_0= ruleContainmentPath ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==61) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3568:4: ( ( 'applies' )=>otherlv_10= 'applies' ) otherlv_11= 'to' ( (lv_appliesTo_12_0= ruleContainmentPath ) ) (otherlv_13= ',' ( (lv_appliesTo_14_0= ruleContainmentPath ) ) )*
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3568:4: ( ( 'applies' )=>otherlv_10= 'applies' )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3568:5: ( 'applies' )=>otherlv_10= 'applies'
                    {
                    otherlv_10=(Token)match(input,61,FOLLOW_61_in_ruleContainedPropertyAssociation7876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getContainedPropertyAssociationAccess().getAppliesKeyword_4_0());
                          
                    }

                    }

                    otherlv_11=(Token)match(input,55,FOLLOW_55_in_ruleContainedPropertyAssociation7889); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getContainedPropertyAssociationAccess().getToKeyword_4_1());
                          
                    }
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3577:1: ( (lv_appliesTo_12_0= ruleContainmentPath ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3578:1: (lv_appliesTo_12_0= ruleContainmentPath )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3578:1: (lv_appliesTo_12_0= ruleContainmentPath )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3579:3: lv_appliesTo_12_0= ruleContainmentPath
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleContainmentPath_in_ruleContainedPropertyAssociation7910);
                    lv_appliesTo_12_0=ruleContainmentPath();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
                      	        }
                             		add(
                             			current, 
                             			"appliesTo",
                              		lv_appliesTo_12_0, 
                              		"ContainmentPath");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3595:2: (otherlv_13= ',' ( (lv_appliesTo_14_0= ruleContainmentPath ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==15) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3595:4: otherlv_13= ',' ( (lv_appliesTo_14_0= ruleContainmentPath ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleContainedPropertyAssociation7923); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_13, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_3_0());
                    	          
                    	    }
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3599:1: ( (lv_appliesTo_14_0= ruleContainmentPath ) )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3600:1: (lv_appliesTo_14_0= ruleContainmentPath )
                    	    {
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3600:1: (lv_appliesTo_14_0= ruleContainmentPath )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3601:3: lv_appliesTo_14_0= ruleContainmentPath
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleContainmentPath_in_ruleContainedPropertyAssociation7944);
                    	    lv_appliesTo_14_0=ruleContainmentPath();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"appliesTo",
                    	              		lv_appliesTo_14_0, 
                    	              		"ContainmentPath");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleContainedPropertyAssociation7960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getContainedPropertyAssociationAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleContainedPropertyAssociation"


    // $ANTLR start "entryRulePropertyAssociation"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3629:1: entryRulePropertyAssociation returns [EObject current=null] : iv_rulePropertyAssociation= rulePropertyAssociation EOF ;
    public final EObject entryRulePropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAssociation = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3630:2: (iv_rulePropertyAssociation= rulePropertyAssociation EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3631:2: iv_rulePropertyAssociation= rulePropertyAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyAssociationRule()); 
            }
            pushFollow(FOLLOW_rulePropertyAssociation_in_entryRulePropertyAssociation7996);
            iv_rulePropertyAssociation=rulePropertyAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyAssociation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyAssociation8006); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyAssociation"


    // $ANTLR start "rulePropertyAssociation"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3638:1: rulePropertyAssociation returns [EObject current=null] : ( ( ( ruleQPREF ) ) (otherlv_1= '=>' | ( (lv_append_2_0= '+=>' ) ) ) ( (lv_constant_3_0= 'constant' ) )? ( (otherlv_4= '(' ( ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' ) )* ( (lv_ownedValue_7_0= ruleOptionalModalPropertyValue ) ) otherlv_8= ')' ) | ( (lv_ownedValue_9_0= rulePropertyValue ) ) ) otherlv_10= ';' ) ;
    public final EObject rulePropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_append_2_0=null;
        Token lv_constant_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_ownedValue_5_0 = null;

        EObject lv_ownedValue_7_0 = null;

        EObject lv_ownedValue_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3641:28: ( ( ( ( ruleQPREF ) ) (otherlv_1= '=>' | ( (lv_append_2_0= '+=>' ) ) ) ( (lv_constant_3_0= 'constant' ) )? ( (otherlv_4= '(' ( ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' ) )* ( (lv_ownedValue_7_0= ruleOptionalModalPropertyValue ) ) otherlv_8= ')' ) | ( (lv_ownedValue_9_0= rulePropertyValue ) ) ) otherlv_10= ';' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3642:1: ( ( ( ruleQPREF ) ) (otherlv_1= '=>' | ( (lv_append_2_0= '+=>' ) ) ) ( (lv_constant_3_0= 'constant' ) )? ( (otherlv_4= '(' ( ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' ) )* ( (lv_ownedValue_7_0= ruleOptionalModalPropertyValue ) ) otherlv_8= ')' ) | ( (lv_ownedValue_9_0= rulePropertyValue ) ) ) otherlv_10= ';' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3642:1: ( ( ( ruleQPREF ) ) (otherlv_1= '=>' | ( (lv_append_2_0= '+=>' ) ) ) ( (lv_constant_3_0= 'constant' ) )? ( (otherlv_4= '(' ( ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' ) )* ( (lv_ownedValue_7_0= ruleOptionalModalPropertyValue ) ) otherlv_8= ')' ) | ( (lv_ownedValue_9_0= rulePropertyValue ) ) ) otherlv_10= ';' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3642:2: ( ( ruleQPREF ) ) (otherlv_1= '=>' | ( (lv_append_2_0= '+=>' ) ) ) ( (lv_constant_3_0= 'constant' ) )? ( (otherlv_4= '(' ( ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' ) )* ( (lv_ownedValue_7_0= ruleOptionalModalPropertyValue ) ) otherlv_8= ')' ) | ( (lv_ownedValue_9_0= rulePropertyValue ) ) ) otherlv_10= ';'
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3642:2: ( ( ruleQPREF ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3643:1: ( ruleQPREF )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3643:1: ( ruleQPREF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3644:3: ruleQPREF
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyAssociationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyAssociationAccess().getPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQPREF_in_rulePropertyAssociation8058);
            ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3660:2: (otherlv_1= '=>' | ( (lv_append_2_0= '+=>' ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==26) ) {
                alt52=1;
            }
            else if ( (LA52_0==65) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3660:4: otherlv_1= '=>'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_rulePropertyAssociation8071); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3665:6: ( (lv_append_2_0= '+=>' ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3665:6: ( (lv_append_2_0= '+=>' ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3666:1: (lv_append_2_0= '+=>' )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3666:1: (lv_append_2_0= '+=>' )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3667:3: lv_append_2_0= '+=>'
                    {
                    lv_append_2_0=(Token)match(input,65,FOLLOW_65_in_rulePropertyAssociation8095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_append_2_0, grammarAccess.getPropertyAssociationAccess().getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyAssociationRule());
                      	        }
                             		setWithLastConsumed(current, "append", true, "+=>");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3680:3: ( (lv_constant_3_0= 'constant' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==64) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3681:1: (lv_constant_3_0= 'constant' )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3681:1: (lv_constant_3_0= 'constant' )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3682:3: lv_constant_3_0= 'constant'
                    {
                    lv_constant_3_0=(Token)match(input,64,FOLLOW_64_in_rulePropertyAssociation8127); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_constant_3_0, grammarAccess.getPropertyAssociationAccess().getConstantConstantKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPropertyAssociationRule());
                      	        }
                             		setWithLastConsumed(current, "constant", true, "constant");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3695:3: ( (otherlv_4= '(' ( ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' ) )* ( (lv_ownedValue_7_0= ruleOptionalModalPropertyValue ) ) otherlv_8= ')' ) | ( (lv_ownedValue_9_0= rulePropertyValue ) ) )
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3695:4: (otherlv_4= '(' ( ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' ) )* ( (lv_ownedValue_7_0= ruleOptionalModalPropertyValue ) ) otherlv_8= ')' )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3695:4: (otherlv_4= '(' ( ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' ) )* ( (lv_ownedValue_7_0= ruleOptionalModalPropertyValue ) ) otherlv_8= ')' )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3695:6: otherlv_4= '(' ( ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' ) )* ( (lv_ownedValue_7_0= ruleOptionalModalPropertyValue ) ) otherlv_8= ')'
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_rulePropertyAssociation8155); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPropertyAssociationAccess().getLeftParenthesisKeyword_3_0_0());
                          
                    }
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3699:1: ( ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' ) )*
                    loop54:
                    do {
                        int alt54=2;
                        alt54 = dfa54.predict(input);
                        switch (alt54) {
                    	case 1 :
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3699:2: ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' )
                    	    {
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3699:2: ( (lv_ownedValue_5_0= ruleModalPropertyValue ) )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3700:1: (lv_ownedValue_5_0= ruleModalPropertyValue )
                    	    {
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3700:1: (lv_ownedValue_5_0= ruleModalPropertyValue )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3701:3: lv_ownedValue_5_0= ruleModalPropertyValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPropertyAssociationAccess().getOwnedValueModalPropertyValueParserRuleCall_3_0_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleModalPropertyValue_in_rulePropertyAssociation8177);
                    	    lv_ownedValue_5_0=ruleModalPropertyValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPropertyAssociationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ownedValue",
                    	              		lv_ownedValue_5_0, 
                    	              		"ModalPropertyValue");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3717:2: ( ( ',' )=>otherlv_6= ',' )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3717:3: ( ',' )=>otherlv_6= ','
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_rulePropertyAssociation8197); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getPropertyAssociationAccess().getCommaKeyword_3_0_1_1());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3722:4: ( (lv_ownedValue_7_0= ruleOptionalModalPropertyValue ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3723:1: (lv_ownedValue_7_0= ruleOptionalModalPropertyValue )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3723:1: (lv_ownedValue_7_0= ruleOptionalModalPropertyValue )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3724:3: lv_ownedValue_7_0= ruleOptionalModalPropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOptionalModalPropertyValue_in_rulePropertyAssociation8221);
                    lv_ownedValue_7_0=ruleOptionalModalPropertyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyAssociationRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedValue",
                              		lv_ownedValue_7_0, 
                              		"OptionalModalPropertyValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_rulePropertyAssociation8233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getPropertyAssociationAccess().getRightParenthesisKeyword_3_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3745:6: ( (lv_ownedValue_9_0= rulePropertyValue ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3745:6: ( (lv_ownedValue_9_0= rulePropertyValue ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3746:1: (lv_ownedValue_9_0= rulePropertyValue )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3746:1: (lv_ownedValue_9_0= rulePropertyValue )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3747:3: lv_ownedValue_9_0= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAssociationAccess().getOwnedValuePropertyValueParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValue_in_rulePropertyAssociation8261);
                    lv_ownedValue_9_0=rulePropertyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyAssociationRule());
                      	        }
                             		add(
                             			current, 
                             			"ownedValue",
                              		lv_ownedValue_9_0, 
                              		"PropertyValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_rulePropertyAssociation8274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getPropertyAssociationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropertyAssociation"


    // $ANTLR start "entryRuleContainmentPath"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3775:1: entryRuleContainmentPath returns [EObject current=null] : iv_ruleContainmentPath= ruleContainmentPath EOF ;
    public final EObject entryRuleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPath = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3776:2: (iv_ruleContainmentPath= ruleContainmentPath EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3777:2: iv_ruleContainmentPath= ruleContainmentPath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainmentPathRule()); 
            }
            pushFollow(FOLLOW_ruleContainmentPath_in_entryRuleContainmentPath8310);
            iv_ruleContainmentPath=ruleContainmentPath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainmentPath; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainmentPath8320); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContainmentPath"


    // $ANTLR start "ruleContainmentPath"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3784:1: ruleContainmentPath returns [EObject current=null] : ( () ( (lv_containmentPathElement_1_0= ruleContainmentPathElement ) ) (otherlv_2= '.' ( (lv_containmentPathElement_3_0= ruleContainmentPathElement ) ) )* ) ;
    public final EObject ruleContainmentPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_containmentPathElement_1_0 = null;

        EObject lv_containmentPathElement_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3787:28: ( ( () ( (lv_containmentPathElement_1_0= ruleContainmentPathElement ) ) (otherlv_2= '.' ( (lv_containmentPathElement_3_0= ruleContainmentPathElement ) ) )* ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3788:1: ( () ( (lv_containmentPathElement_1_0= ruleContainmentPathElement ) ) (otherlv_2= '.' ( (lv_containmentPathElement_3_0= ruleContainmentPathElement ) ) )* )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3788:1: ( () ( (lv_containmentPathElement_1_0= ruleContainmentPathElement ) ) (otherlv_2= '.' ( (lv_containmentPathElement_3_0= ruleContainmentPathElement ) ) )* )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3788:2: () ( (lv_containmentPathElement_1_0= ruleContainmentPathElement ) ) (otherlv_2= '.' ( (lv_containmentPathElement_3_0= ruleContainmentPathElement ) ) )*
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3788:2: ()
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3789:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getContainmentPathAccess().getContainedNamedElementAction_0(),
                          current);
                  
            }

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3797:2: ( (lv_containmentPathElement_1_0= ruleContainmentPathElement ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3798:1: (lv_containmentPathElement_1_0= ruleContainmentPathElement )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3798:1: (lv_containmentPathElement_1_0= ruleContainmentPathElement )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3799:3: lv_containmentPathElement_1_0= ruleContainmentPathElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContainmentPathAccess().getContainmentPathElementContainmentPathElementParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleContainmentPathElement_in_ruleContainmentPath8378);
            lv_containmentPathElement_1_0=ruleContainmentPathElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getContainmentPathRule());
              	        }
                     		add(
                     			current, 
                     			"containmentPathElement",
                      		lv_containmentPathElement_1_0, 
                      		"ContainmentPathElement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3815:2: (otherlv_2= '.' ( (lv_containmentPathElement_3_0= ruleContainmentPathElement ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==66) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3815:4: otherlv_2= '.' ( (lv_containmentPathElement_3_0= ruleContainmentPathElement ) )
            	    {
            	    otherlv_2=(Token)match(input,66,FOLLOW_66_in_ruleContainmentPath8391); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getContainmentPathAccess().getFullStopKeyword_2_0());
            	          
            	    }
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3819:1: ( (lv_containmentPathElement_3_0= ruleContainmentPathElement ) )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3820:1: (lv_containmentPathElement_3_0= ruleContainmentPathElement )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3820:1: (lv_containmentPathElement_3_0= ruleContainmentPathElement )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3821:3: lv_containmentPathElement_3_0= ruleContainmentPathElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContainmentPathAccess().getContainmentPathElementContainmentPathElementParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleContainmentPathElement_in_ruleContainmentPath8412);
            	    lv_containmentPathElement_3_0=ruleContainmentPathElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getContainmentPathRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"containmentPathElement",
            	              		lv_containmentPathElement_3_0, 
            	              		"ContainmentPathElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleContainmentPath"


    // $ANTLR start "entryRuleModalPropertyValue"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3845:1: entryRuleModalPropertyValue returns [EObject current=null] : iv_ruleModalPropertyValue= ruleModalPropertyValue EOF ;
    public final EObject entryRuleModalPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModalPropertyValue = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3846:2: (iv_ruleModalPropertyValue= ruleModalPropertyValue EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3847:2: iv_ruleModalPropertyValue= ruleModalPropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModalPropertyValueRule()); 
            }
            pushFollow(FOLLOW_ruleModalPropertyValue_in_entryRuleModalPropertyValue8450);
            iv_ruleModalPropertyValue=ruleModalPropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModalPropertyValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModalPropertyValue8460); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModalPropertyValue"


    // $ANTLR start "ruleModalPropertyValue"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3854:1: ruleModalPropertyValue returns [EObject current=null] : ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ( 'in' )=>otherlv_1= 'in' ) otherlv_2= 'modes' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleModalPropertyValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_ownedValue_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3857:28: ( ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ( 'in' )=>otherlv_1= 'in' ) otherlv_2= 'modes' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3858:1: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ( 'in' )=>otherlv_1= 'in' ) otherlv_2= 'modes' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3858:1: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ( 'in' )=>otherlv_1= 'in' ) otherlv_2= 'modes' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3858:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ( 'in' )=>otherlv_1= 'in' ) otherlv_2= 'modes' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')'
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3858:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3859:1: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3859:1: (lv_ownedValue_0_0= rulePropertyExpression )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3860:3: lv_ownedValue_0_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyExpression_in_ruleModalPropertyValue8506);
            lv_ownedValue_0_0=rulePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModalPropertyValueRule());
              	        }
                     		set(
                     			current, 
                     			"ownedValue",
                      		lv_ownedValue_0_0, 
                      		"PropertyExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3876:2: ( ( 'in' )=>otherlv_1= 'in' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3876:3: ( 'in' )=>otherlv_1= 'in'
            {
            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleModalPropertyValue8526); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModalPropertyValueAccess().getInKeyword_1());
                  
            }

            }

            otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleModalPropertyValue8539); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getModalPropertyValueAccess().getModesKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleModalPropertyValue8551); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getModalPropertyValueAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3889:1: ( (otherlv_4= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3890:1: (otherlv_4= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3890:1: (otherlv_4= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3891:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getModalPropertyValueRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModalPropertyValue8575); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_4, grammarAccess.getModalPropertyValueAccess().getInModeModeCrossReference_4_0()); 
              	
            }

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3905:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==15) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3905:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleModalPropertyValue8588); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getModalPropertyValueAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3909:1: ( (otherlv_6= RULE_ID ) )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3910:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3910:1: (otherlv_6= RULE_ID )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3911:3: otherlv_6= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      		  /* */ 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getModalPropertyValueRule());
            	      	        }
            	              
            	    }
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModalPropertyValue8612); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_6, grammarAccess.getModalPropertyValueAccess().getInModeModeCrossReference_5_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleModalPropertyValue8626); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getModalPropertyValueAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModalPropertyValue"


    // $ANTLR start "entryRuleOptionalModalPropertyValue"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3937:1: entryRuleOptionalModalPropertyValue returns [EObject current=null] : iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF ;
    public final EObject entryRuleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalModalPropertyValue = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3938:2: (iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3939:2: iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionalModalPropertyValueRule()); 
            }
            pushFollow(FOLLOW_ruleOptionalModalPropertyValue_in_entryRuleOptionalModalPropertyValue8662);
            iv_ruleOptionalModalPropertyValue=ruleOptionalModalPropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptionalModalPropertyValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalModalPropertyValue8672); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOptionalModalPropertyValue"


    // $ANTLR start "ruleOptionalModalPropertyValue"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3946:1: ruleOptionalModalPropertyValue returns [EObject current=null] : ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) (otherlv_1= 'in' otherlv_2= 'modes' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? ) ;
    public final EObject ruleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_ownedValue_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3949:28: ( ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) (otherlv_1= 'in' otherlv_2= 'modes' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3950:1: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) (otherlv_1= 'in' otherlv_2= 'modes' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3950:1: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) (otherlv_1= 'in' otherlv_2= 'modes' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3950:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) ) (otherlv_1= 'in' otherlv_2= 'modes' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )?
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3950:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3951:1: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3951:1: (lv_ownedValue_0_0= rulePropertyExpression )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3952:3: lv_ownedValue_0_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyExpression_in_ruleOptionalModalPropertyValue8718);
            lv_ownedValue_0_0=rulePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOptionalModalPropertyValueRule());
              	        }
                     		set(
                     			current, 
                     			"ownedValue",
                      		lv_ownedValue_0_0, 
                      		"PropertyExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3968:2: (otherlv_1= 'in' otherlv_2= 'modes' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==67) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3968:4: otherlv_1= 'in' otherlv_2= 'modes' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')'
                    {
                    otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleOptionalModalPropertyValue8731); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOptionalModalPropertyValueAccess().getInKeyword_1_0());
                          
                    }
                    otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleOptionalModalPropertyValue8743); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getOptionalModalPropertyValueAccess().getModesKeyword_1_1());
                          
                    }
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleOptionalModalPropertyValue8755); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getOptionalModalPropertyValueAccess().getLeftParenthesisKeyword_1_2());
                          
                    }
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3980:1: ( (otherlv_4= RULE_ID ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3981:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3981:1: (otherlv_4= RULE_ID )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3982:3: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                      	        }
                              
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOptionalModalPropertyValue8779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_4, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_3_0()); 
                      	
                    }

                    }


                    }

                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3996:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==15) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3996:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleOptionalModalPropertyValue8792); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_4_0());
                    	          
                    	    }
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4000:1: ( (otherlv_6= RULE_ID ) )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4001:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4001:1: (otherlv_6= RULE_ID )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4002:3: otherlv_6= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOptionalModalPropertyValue8816); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_6, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_4_1_0()); 
                    	      	
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleOptionalModalPropertyValue8830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getOptionalModalPropertyValueAccess().getRightParenthesisKeyword_1_5());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOptionalModalPropertyValue"


    // $ANTLR start "entryRulePropertyValue"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4028:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4029:2: (iv_rulePropertyValue= rulePropertyValue EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4030:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValueRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValue_in_entryRulePropertyValue8868);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValue8878); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4037:1: rulePropertyValue returns [EObject current=null] : ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedValue_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4040:28: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4041:1: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4041:1: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4042:1: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4042:1: (lv_ownedValue_0_0= rulePropertyExpression )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4043:3: lv_ownedValue_0_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyExpression_in_rulePropertyValue8923);
            lv_ownedValue_0_0=rulePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyValueRule());
              	        }
                     		set(
                     			current, 
                     			"ownedValue",
                      		lv_ownedValue_0_0, 
                      		"PropertyExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRulePropertyExpression"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4067:1: entryRulePropertyExpression returns [EObject current=null] : iv_rulePropertyExpression= rulePropertyExpression EOF ;
    public final EObject entryRulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpression = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4068:2: (iv_rulePropertyExpression= rulePropertyExpression EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4069:2: iv_rulePropertyExpression= rulePropertyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePropertyExpression_in_entryRulePropertyExpression8958);
            iv_rulePropertyExpression=rulePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyExpression8968); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyExpression"


    // $ANTLR start "rulePropertyExpression"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4076:1: rulePropertyExpression returns [EObject current=null] : (this_RecordTerm_0= ruleRecordTerm | this_NumericRangeTerm_1= ruleNumericRangeTerm | this_ReferenceTerm_2= ruleReferenceTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_RealTerm_5= ruleRealTerm | this_IntegerTerm_6= ruleIntegerTerm | this_ComponentClassifierTerm_7= ruleComponentClassifierTerm | this_ListTerm_8= ruleListTerm | this_BooleanTerm_9= ruleBooleanTerm | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) ;
    public final EObject rulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RecordTerm_0 = null;

        EObject this_NumericRangeTerm_1 = null;

        EObject this_ReferenceTerm_2 = null;

        EObject this_ComputedTerm_3 = null;

        EObject this_StringTerm_4 = null;

        EObject this_RealTerm_5 = null;

        EObject this_IntegerTerm_6 = null;

        EObject this_ComponentClassifierTerm_7 = null;

        EObject this_ListTerm_8 = null;

        EObject this_BooleanTerm_9 = null;

        EObject this_LiteralorReferenceTerm_10 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4079:28: ( (this_RecordTerm_0= ruleRecordTerm | this_NumericRangeTerm_1= ruleNumericRangeTerm | this_ReferenceTerm_2= ruleReferenceTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_RealTerm_5= ruleRealTerm | this_IntegerTerm_6= ruleIntegerTerm | this_ComponentClassifierTerm_7= ruleComponentClassifierTerm | this_ListTerm_8= ruleListTerm | this_BooleanTerm_9= ruleBooleanTerm | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4080:1: (this_RecordTerm_0= ruleRecordTerm | this_NumericRangeTerm_1= ruleNumericRangeTerm | this_ReferenceTerm_2= ruleReferenceTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_RealTerm_5= ruleRealTerm | this_IntegerTerm_6= ruleIntegerTerm | this_ComponentClassifierTerm_7= ruleComponentClassifierTerm | this_ListTerm_8= ruleListTerm | this_BooleanTerm_9= ruleBooleanTerm | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4080:1: (this_RecordTerm_0= ruleRecordTerm | this_NumericRangeTerm_1= ruleNumericRangeTerm | this_ReferenceTerm_2= ruleReferenceTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_RealTerm_5= ruleRealTerm | this_IntegerTerm_6= ruleIntegerTerm | this_ComponentClassifierTerm_7= ruleComponentClassifierTerm | this_ListTerm_8= ruleListTerm | this_BooleanTerm_9= ruleBooleanTerm | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            int alt60=11;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4081:2: this_RecordTerm_0= ruleRecordTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRecordTermParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRecordTerm_in_rulePropertyExpression9018);
                    this_RecordTerm_0=ruleRecordTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RecordTerm_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4094:2: this_NumericRangeTerm_1= ruleNumericRangeTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getNumericRangeTermParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumericRangeTerm_in_rulePropertyExpression9048);
                    this_NumericRangeTerm_1=ruleNumericRangeTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumericRangeTerm_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4107:2: this_ReferenceTerm_2= ruleReferenceTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getReferenceTermParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceTerm_in_rulePropertyExpression9078);
                    this_ReferenceTerm_2=ruleReferenceTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceTerm_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4120:2: this_ComputedTerm_3= ruleComputedTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComputedTermParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComputedTerm_in_rulePropertyExpression9108);
                    this_ComputedTerm_3=ruleComputedTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ComputedTerm_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4133:2: this_StringTerm_4= ruleStringTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getStringTermParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringTerm_in_rulePropertyExpression9138);
                    this_StringTerm_4=ruleStringTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringTerm_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4146:2: this_RealTerm_5= ruleRealTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRealTermParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealTerm_in_rulePropertyExpression9168);
                    this_RealTerm_5=ruleRealTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RealTerm_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4159:2: this_IntegerTerm_6= ruleIntegerTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getIntegerTermParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerTerm_in_rulePropertyExpression9198);
                    this_IntegerTerm_6=ruleIntegerTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerTerm_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4172:2: this_ComponentClassifierTerm_7= ruleComponentClassifierTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComponentClassifierTermParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComponentClassifierTerm_in_rulePropertyExpression9228);
                    this_ComponentClassifierTerm_7=ruleComponentClassifierTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ComponentClassifierTerm_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4185:2: this_ListTerm_8= ruleListTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getListTermParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleListTerm_in_rulePropertyExpression9258);
                    this_ListTerm_8=ruleListTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ListTerm_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4198:2: this_BooleanTerm_9= ruleBooleanTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getBooleanTermParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanTerm_in_rulePropertyExpression9288);
                    this_BooleanTerm_9=ruleBooleanTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanTerm_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4211:2: this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyExpressionAccess().getLiteralorReferenceTermParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralorReferenceTerm_in_rulePropertyExpression9318);
                    this_LiteralorReferenceTerm_10=ruleLiteralorReferenceTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralorReferenceTerm_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropertyExpression"


    // $ANTLR start "entryRuleConstantPropertyExpression"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4230:1: entryRuleConstantPropertyExpression returns [EObject current=null] : iv_ruleConstantPropertyExpression= ruleConstantPropertyExpression EOF ;
    public final EObject entryRuleConstantPropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantPropertyExpression = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4231:2: (iv_ruleConstantPropertyExpression= ruleConstantPropertyExpression EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4232:2: iv_ruleConstantPropertyExpression= ruleConstantPropertyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantPropertyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleConstantPropertyExpression_in_entryRuleConstantPropertyExpression9353);
            iv_ruleConstantPropertyExpression=ruleConstantPropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantPropertyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantPropertyExpression9363); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstantPropertyExpression"


    // $ANTLR start "ruleConstantPropertyExpression"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4239:1: ruleConstantPropertyExpression returns [EObject current=null] : (this_RecordTerm_0= ruleRecordTerm | this_NumericRangeTerm_1= ruleNumericRangeTerm | this_ComputedTerm_2= ruleComputedTerm | this_StringTerm_3= ruleStringTerm | this_RealTerm_4= ruleRealTerm | this_IntegerTerm_5= ruleIntegerTerm | this_ComponentClassifierTerm_6= ruleComponentClassifierTerm | this_ListTerm_7= ruleListTerm | this_BooleanTerm_8= ruleBooleanTerm | this_LiteralorReferenceTerm_9= ruleLiteralorReferenceTerm ) ;
    public final EObject ruleConstantPropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RecordTerm_0 = null;

        EObject this_NumericRangeTerm_1 = null;

        EObject this_ComputedTerm_2 = null;

        EObject this_StringTerm_3 = null;

        EObject this_RealTerm_4 = null;

        EObject this_IntegerTerm_5 = null;

        EObject this_ComponentClassifierTerm_6 = null;

        EObject this_ListTerm_7 = null;

        EObject this_BooleanTerm_8 = null;

        EObject this_LiteralorReferenceTerm_9 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4242:28: ( (this_RecordTerm_0= ruleRecordTerm | this_NumericRangeTerm_1= ruleNumericRangeTerm | this_ComputedTerm_2= ruleComputedTerm | this_StringTerm_3= ruleStringTerm | this_RealTerm_4= ruleRealTerm | this_IntegerTerm_5= ruleIntegerTerm | this_ComponentClassifierTerm_6= ruleComponentClassifierTerm | this_ListTerm_7= ruleListTerm | this_BooleanTerm_8= ruleBooleanTerm | this_LiteralorReferenceTerm_9= ruleLiteralorReferenceTerm ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4243:1: (this_RecordTerm_0= ruleRecordTerm | this_NumericRangeTerm_1= ruleNumericRangeTerm | this_ComputedTerm_2= ruleComputedTerm | this_StringTerm_3= ruleStringTerm | this_RealTerm_4= ruleRealTerm | this_IntegerTerm_5= ruleIntegerTerm | this_ComponentClassifierTerm_6= ruleComponentClassifierTerm | this_ListTerm_7= ruleListTerm | this_BooleanTerm_8= ruleBooleanTerm | this_LiteralorReferenceTerm_9= ruleLiteralorReferenceTerm )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4243:1: (this_RecordTerm_0= ruleRecordTerm | this_NumericRangeTerm_1= ruleNumericRangeTerm | this_ComputedTerm_2= ruleComputedTerm | this_StringTerm_3= ruleStringTerm | this_RealTerm_4= ruleRealTerm | this_IntegerTerm_5= ruleIntegerTerm | this_ComponentClassifierTerm_6= ruleComponentClassifierTerm | this_ListTerm_7= ruleListTerm | this_BooleanTerm_8= ruleBooleanTerm | this_LiteralorReferenceTerm_9= ruleLiteralorReferenceTerm )
            int alt61=10;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4244:2: this_RecordTerm_0= ruleRecordTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstantPropertyExpressionAccess().getRecordTermParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRecordTerm_in_ruleConstantPropertyExpression9413);
                    this_RecordTerm_0=ruleRecordTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RecordTerm_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4257:2: this_NumericRangeTerm_1= ruleNumericRangeTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstantPropertyExpressionAccess().getNumericRangeTermParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumericRangeTerm_in_ruleConstantPropertyExpression9443);
                    this_NumericRangeTerm_1=ruleNumericRangeTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumericRangeTerm_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4270:2: this_ComputedTerm_2= ruleComputedTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstantPropertyExpressionAccess().getComputedTermParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComputedTerm_in_ruleConstantPropertyExpression9473);
                    this_ComputedTerm_2=ruleComputedTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ComputedTerm_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4283:2: this_StringTerm_3= ruleStringTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstantPropertyExpressionAccess().getStringTermParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringTerm_in_ruleConstantPropertyExpression9503);
                    this_StringTerm_3=ruleStringTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringTerm_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4296:2: this_RealTerm_4= ruleRealTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstantPropertyExpressionAccess().getRealTermParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealTerm_in_ruleConstantPropertyExpression9533);
                    this_RealTerm_4=ruleRealTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RealTerm_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4309:2: this_IntegerTerm_5= ruleIntegerTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstantPropertyExpressionAccess().getIntegerTermParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerTerm_in_ruleConstantPropertyExpression9563);
                    this_IntegerTerm_5=ruleIntegerTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerTerm_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4322:2: this_ComponentClassifierTerm_6= ruleComponentClassifierTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstantPropertyExpressionAccess().getComponentClassifierTermParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComponentClassifierTerm_in_ruleConstantPropertyExpression9593);
                    this_ComponentClassifierTerm_6=ruleComponentClassifierTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ComponentClassifierTerm_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4335:2: this_ListTerm_7= ruleListTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstantPropertyExpressionAccess().getListTermParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleListTerm_in_ruleConstantPropertyExpression9623);
                    this_ListTerm_7=ruleListTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ListTerm_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4348:2: this_BooleanTerm_8= ruleBooleanTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstantPropertyExpressionAccess().getBooleanTermParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanTerm_in_ruleConstantPropertyExpression9653);
                    this_BooleanTerm_8=ruleBooleanTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanTerm_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4361:2: this_LiteralorReferenceTerm_9= ruleLiteralorReferenceTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConstantPropertyExpressionAccess().getLiteralorReferenceTermParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralorReferenceTerm_in_ruleConstantPropertyExpression9683);
                    this_LiteralorReferenceTerm_9=ruleLiteralorReferenceTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralorReferenceTerm_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstantPropertyExpression"


    // $ANTLR start "entryRuleLiteralorReferenceTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4380:1: entryRuleLiteralorReferenceTerm returns [EObject current=null] : iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF ;
    public final EObject entryRuleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralorReferenceTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4381:2: (iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4382:2: iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralorReferenceTermRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralorReferenceTerm_in_entryRuleLiteralorReferenceTerm9718);
            iv_ruleLiteralorReferenceTerm=ruleLiteralorReferenceTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralorReferenceTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralorReferenceTerm9728); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralorReferenceTerm"


    // $ANTLR start "ruleLiteralorReferenceTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4389:1: ruleLiteralorReferenceTerm returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4392:28: ( ( ( ruleQPREF ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4393:1: ( ( ruleQPREF ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4393:1: ( ( ruleQPREF ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4394:1: ( ruleQPREF )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4394:1: ( ruleQPREF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4395:3: ruleQPREF
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLiteralorReferenceTermRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAbstractNamedValueCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQPREF_in_ruleLiteralorReferenceTerm9779);
            ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteralorReferenceTerm"


    // $ANTLR start "entryRuleBooleanTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4419:1: entryRuleBooleanTerm returns [EObject current=null] : iv_ruleBooleanTerm= ruleBooleanTerm EOF ;
    public final EObject entryRuleBooleanTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4420:2: (iv_ruleBooleanTerm= ruleBooleanTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4421:2: iv_ruleBooleanTerm= ruleBooleanTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanTermRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanTerm_in_entryRuleBooleanTerm9814);
            iv_ruleBooleanTerm=ruleBooleanTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanTerm9824); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanTerm"


    // $ANTLR start "ruleBooleanTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4428:1: ruleBooleanTerm returns [EObject current=null] : this_OrTerm_0= ruleOrTerm ;
    public final EObject ruleBooleanTerm() throws RecognitionException {
        EObject current = null;

        EObject this_OrTerm_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4431:28: (this_OrTerm_0= ruleOrTerm )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4433:2: this_OrTerm_0= ruleOrTerm
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBooleanTermAccess().getOrTermParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOrTerm_in_ruleBooleanTerm9873);
            this_OrTerm_0=ruleOrTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrTerm_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBooleanTerm"


    // $ANTLR start "entryRuleOrTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4452:1: entryRuleOrTerm returns [EObject current=null] : iv_ruleOrTerm= ruleOrTerm EOF ;
    public final EObject entryRuleOrTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4453:2: (iv_ruleOrTerm= ruleOrTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4454:2: iv_ruleOrTerm= ruleOrTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrTermRule()); 
            }
            pushFollow(FOLLOW_ruleOrTerm_in_entryRuleOrTerm9907);
            iv_ruleOrTerm=ruleOrTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrTerm9917); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrTerm"


    // $ANTLR start "ruleOrTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4461:1: ruleOrTerm returns [EObject current=null] : (this_AndTerm_0= ruleAndTerm ( () ( (lv_op_2_0= ruleOrOp ) ) ( (lv_ownedPropertyExpression_3_0= ruleAndTerm ) ) )* ) ;
    public final EObject ruleOrTerm() throws RecognitionException {
        EObject current = null;

        EObject this_AndTerm_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_ownedPropertyExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4464:28: ( (this_AndTerm_0= ruleAndTerm ( () ( (lv_op_2_0= ruleOrOp ) ) ( (lv_ownedPropertyExpression_3_0= ruleAndTerm ) ) )* ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4465:1: (this_AndTerm_0= ruleAndTerm ( () ( (lv_op_2_0= ruleOrOp ) ) ( (lv_ownedPropertyExpression_3_0= ruleAndTerm ) ) )* )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4465:1: (this_AndTerm_0= ruleAndTerm ( () ( (lv_op_2_0= ruleOrOp ) ) ( (lv_ownedPropertyExpression_3_0= ruleAndTerm ) ) )* )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4466:2: this_AndTerm_0= ruleAndTerm ( () ( (lv_op_2_0= ruleOrOp ) ) ( (lv_ownedPropertyExpression_3_0= ruleAndTerm ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrTermAccess().getAndTermParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndTerm_in_ruleOrTerm9967);
            this_AndTerm_0=ruleAndTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndTerm_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4477:1: ( () ( (lv_op_2_0= ruleOrOp ) ) ( (lv_ownedPropertyExpression_3_0= ruleAndTerm ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==76) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4477:2: () ( (lv_op_2_0= ruleOrOp ) ) ( (lv_ownedPropertyExpression_3_0= ruleAndTerm ) )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4477:2: ()
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4478:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndAdd(
            	                  grammarAccess.getOrTermAccess().getOperationOwnedPropertyExpressionAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4486:2: ( (lv_op_2_0= ruleOrOp ) )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4487:1: (lv_op_2_0= ruleOrOp )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4487:1: (lv_op_2_0= ruleOrOp )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4488:3: lv_op_2_0= ruleOrOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrTermAccess().getOpOrOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOrOp_in_ruleOrTerm10000);
            	    lv_op_2_0=ruleOrOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrTermRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"op",
            	              		lv_op_2_0, 
            	              		"OrOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4504:2: ( (lv_ownedPropertyExpression_3_0= ruleAndTerm ) )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4505:1: (lv_ownedPropertyExpression_3_0= ruleAndTerm )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4505:1: (lv_ownedPropertyExpression_3_0= ruleAndTerm )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4506:3: lv_ownedPropertyExpression_3_0= ruleAndTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrTermAccess().getOwnedPropertyExpressionAndTermParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndTerm_in_ruleOrTerm10021);
            	    lv_ownedPropertyExpression_3_0=ruleAndTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrTermRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedPropertyExpression",
            	              		lv_ownedPropertyExpression_3_0, 
            	              		"AndTerm");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOrTerm"


    // $ANTLR start "entryRuleAndTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4530:1: entryRuleAndTerm returns [EObject current=null] : iv_ruleAndTerm= ruleAndTerm EOF ;
    public final EObject entryRuleAndTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4531:2: (iv_ruleAndTerm= ruleAndTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4532:2: iv_ruleAndTerm= ruleAndTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndTermRule()); 
            }
            pushFollow(FOLLOW_ruleAndTerm_in_entryRuleAndTerm10059);
            iv_ruleAndTerm=ruleAndTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndTerm10069); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndTerm"


    // $ANTLR start "ruleAndTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4539:1: ruleAndTerm returns [EObject current=null] : (this_BooleanAtom_0= ruleBooleanAtom ( () ( (lv_op_2_0= ruleAndOp ) ) ( (lv_ownedPropertyExpression_3_0= ruleBooleanAtom ) ) )* ) ;
    public final EObject ruleAndTerm() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanAtom_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_ownedPropertyExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4542:28: ( (this_BooleanAtom_0= ruleBooleanAtom ( () ( (lv_op_2_0= ruleAndOp ) ) ( (lv_ownedPropertyExpression_3_0= ruleBooleanAtom ) ) )* ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4543:1: (this_BooleanAtom_0= ruleBooleanAtom ( () ( (lv_op_2_0= ruleAndOp ) ) ( (lv_ownedPropertyExpression_3_0= ruleBooleanAtom ) ) )* )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4543:1: (this_BooleanAtom_0= ruleBooleanAtom ( () ( (lv_op_2_0= ruleAndOp ) ) ( (lv_ownedPropertyExpression_3_0= ruleBooleanAtom ) ) )* )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4544:2: this_BooleanAtom_0= ruleBooleanAtom ( () ( (lv_op_2_0= ruleAndOp ) ) ( (lv_ownedPropertyExpression_3_0= ruleBooleanAtom ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndTermAccess().getBooleanAtomParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBooleanAtom_in_ruleAndTerm10119);
            this_BooleanAtom_0=ruleBooleanAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BooleanAtom_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4555:1: ( () ( (lv_op_2_0= ruleAndOp ) ) ( (lv_ownedPropertyExpression_3_0= ruleBooleanAtom ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==75) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4555:2: () ( (lv_op_2_0= ruleAndOp ) ) ( (lv_ownedPropertyExpression_3_0= ruleBooleanAtom ) )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4555:2: ()
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4556:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndAdd(
            	                  grammarAccess.getAndTermAccess().getOperationOwnedPropertyExpressionAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4564:2: ( (lv_op_2_0= ruleAndOp ) )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4565:1: (lv_op_2_0= ruleAndOp )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4565:1: (lv_op_2_0= ruleAndOp )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4566:3: lv_op_2_0= ruleAndOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndTermAccess().getOpAndOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOp_in_ruleAndTerm10152);
            	    lv_op_2_0=ruleAndOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndTermRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"op",
            	              		lv_op_2_0, 
            	              		"AndOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4582:2: ( (lv_ownedPropertyExpression_3_0= ruleBooleanAtom ) )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4583:1: (lv_ownedPropertyExpression_3_0= ruleBooleanAtom )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4583:1: (lv_ownedPropertyExpression_3_0= ruleBooleanAtom )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4584:3: lv_ownedPropertyExpression_3_0= ruleBooleanAtom
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndTermAccess().getOwnedPropertyExpressionBooleanAtomParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBooleanAtom_in_ruleAndTerm10173);
            	    lv_ownedPropertyExpression_3_0=ruleBooleanAtom();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndTermRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedPropertyExpression",
            	              		lv_ownedPropertyExpression_3_0, 
            	              		"BooleanAtom");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAndTerm"


    // $ANTLR start "entryRuleNotTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4608:1: entryRuleNotTerm returns [EObject current=null] : iv_ruleNotTerm= ruleNotTerm EOF ;
    public final EObject entryRuleNotTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4609:2: (iv_ruleNotTerm= ruleNotTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4610:2: iv_ruleNotTerm= ruleNotTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotTermRule()); 
            }
            pushFollow(FOLLOW_ruleNotTerm_in_entryRuleNotTerm10211);
            iv_ruleNotTerm=ruleNotTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotTerm10221); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotTerm"


    // $ANTLR start "ruleNotTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4617:1: ruleNotTerm returns [EObject current=null] : ( ( (lv_op_0_0= ruleNotOp ) ) ( (lv_ownedPropertyExpression_1_0= ruleBooleanAtom ) ) ) ;
    public final EObject ruleNotTerm() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ownedPropertyExpression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4620:28: ( ( ( (lv_op_0_0= ruleNotOp ) ) ( (lv_ownedPropertyExpression_1_0= ruleBooleanAtom ) ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4621:1: ( ( (lv_op_0_0= ruleNotOp ) ) ( (lv_ownedPropertyExpression_1_0= ruleBooleanAtom ) ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4621:1: ( ( (lv_op_0_0= ruleNotOp ) ) ( (lv_ownedPropertyExpression_1_0= ruleBooleanAtom ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4621:2: ( (lv_op_0_0= ruleNotOp ) ) ( (lv_ownedPropertyExpression_1_0= ruleBooleanAtom ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4621:2: ( (lv_op_0_0= ruleNotOp ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4622:1: (lv_op_0_0= ruleNotOp )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4622:1: (lv_op_0_0= ruleNotOp )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4623:3: lv_op_0_0= ruleNotOp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNotTermAccess().getOpNotOpParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNotOp_in_ruleNotTerm10267);
            lv_op_0_0=ruleNotOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNotTermRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_0_0, 
                      		"NotOp");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4639:2: ( (lv_ownedPropertyExpression_1_0= ruleBooleanAtom ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4640:1: (lv_ownedPropertyExpression_1_0= ruleBooleanAtom )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4640:1: (lv_ownedPropertyExpression_1_0= ruleBooleanAtom )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4641:3: lv_ownedPropertyExpression_1_0= ruleBooleanAtom
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNotTermAccess().getOwnedPropertyExpressionBooleanAtomParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanAtom_in_ruleNotTerm10288);
            lv_ownedPropertyExpression_1_0=ruleBooleanAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNotTermRule());
              	        }
                     		add(
                     			current, 
                     			"ownedPropertyExpression",
                      		lv_ownedPropertyExpression_1_0, 
                      		"BooleanAtom");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNotTerm"


    // $ANTLR start "entryRuleBooleanAtom"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4665:1: entryRuleBooleanAtom returns [EObject current=null] : iv_ruleBooleanAtom= ruleBooleanAtom EOF ;
    public final EObject entryRuleBooleanAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanAtom = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4666:2: (iv_ruleBooleanAtom= ruleBooleanAtom EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4667:2: iv_ruleBooleanAtom= ruleBooleanAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanAtomRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanAtom_in_entryRuleBooleanAtom10324);
            iv_ruleBooleanAtom=ruleBooleanAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanAtom; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanAtom10334); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanAtom"


    // $ANTLR start "ruleBooleanAtom"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4674:1: ruleBooleanAtom returns [EObject current=null] : (this_BooleanLiteral_0= ruleBooleanLiteral | this_NotTerm_1= ruleNotTerm | (otherlv_2= '[' this_BooleanTerm_3= ruleBooleanTerm otherlv_4= ']' ) ) ;
    public final EObject ruleBooleanAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_BooleanLiteral_0 = null;

        EObject this_NotTerm_1 = null;

        EObject this_BooleanTerm_3 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4677:28: ( (this_BooleanLiteral_0= ruleBooleanLiteral | this_NotTerm_1= ruleNotTerm | (otherlv_2= '[' this_BooleanTerm_3= ruleBooleanTerm otherlv_4= ']' ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4678:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_NotTerm_1= ruleNotTerm | (otherlv_2= '[' this_BooleanTerm_3= ruleBooleanTerm otherlv_4= ']' ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4678:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_NotTerm_1= ruleNotTerm | (otherlv_2= '[' this_BooleanTerm_3= ruleBooleanTerm otherlv_4= ']' ) )
            int alt64=3;
            switch ( input.LA(1) ) {
            case 71:
            case 72:
                {
                alt64=1;
                }
                break;
            case 77:
                {
                alt64=2;
                }
                break;
            case 69:
                {
                alt64=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4679:2: this_BooleanLiteral_0= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanAtomAccess().getBooleanLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleBooleanAtom10384);
                    this_BooleanLiteral_0=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4692:2: this_NotTerm_1= ruleNotTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanAtomAccess().getNotTermParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotTerm_in_ruleBooleanAtom10414);
                    this_NotTerm_1=ruleNotTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NotTerm_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4704:6: (otherlv_2= '[' this_BooleanTerm_3= ruleBooleanTerm otherlv_4= ']' )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4704:6: (otherlv_2= '[' this_BooleanTerm_3= ruleBooleanTerm otherlv_4= ']' )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4704:8: otherlv_2= '[' this_BooleanTerm_3= ruleBooleanTerm otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleBooleanAtom10432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBooleanAtomAccess().getLeftSquareBracketKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanAtomAccess().getBooleanTermParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanTerm_in_ruleBooleanAtom10457);
                    this_BooleanTerm_3=ruleBooleanTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanTerm_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,70,FOLLOW_70_in_ruleBooleanAtom10468); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBooleanAtomAccess().getRightSquareBracketKeyword_2_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBooleanAtom"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4732:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4733:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4734:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral10505);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral10515); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4741:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4744:28: ( ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4745:1: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4745:1: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4745:2: () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4745:2: ()
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4746:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4754:2: ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==71) ) {
                alt65=1;
            }
            else if ( (LA65_0==72) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4754:3: ( (lv_value_1_0= 'true' ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4754:3: ( (lv_value_1_0= 'true' ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4755:1: (lv_value_1_0= 'true' )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4755:1: (lv_value_1_0= 'true' )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4756:3: lv_value_1_0= 'true'
                    {
                    lv_value_1_0=(Token)match(input,71,FOLLOW_71_in_ruleBooleanLiteral10571); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_value_1_0, grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "value", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4770:7: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,72,FOLLOW_72_in_ruleBooleanLiteral10602); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleConstantValue"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4782:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4783:2: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4784:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantValueRule()); 
            }
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue10639);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue10649); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstantValue"


    // $ANTLR start "ruleConstantValue"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4791:1: ruleConstantValue returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4794:28: ( ( ( ruleQPREF ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4795:1: ( ( ruleQPREF ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4795:1: ( ( ruleQPREF ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4796:1: ( ruleQPREF )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4796:1: ( ruleQPREF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4797:3: ruleQPREF
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantValueRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantValueAccess().getNamedValueAbstractNamedValueCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQPREF_in_ruleConstantValue10700);
            ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConstantValue"


    // $ANTLR start "entryRuleReferenceTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4821:1: entryRuleReferenceTerm returns [EObject current=null] : iv_ruleReferenceTerm= ruleReferenceTerm EOF ;
    public final EObject entryRuleReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4822:2: (iv_ruleReferenceTerm= ruleReferenceTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4823:2: iv_ruleReferenceTerm= ruleReferenceTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceTermRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceTerm_in_entryRuleReferenceTerm10735);
            iv_ruleReferenceTerm=ruleReferenceTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceTerm10745); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReferenceTerm"


    // $ANTLR start "ruleReferenceTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4830:1: ruleReferenceTerm returns [EObject current=null] : (otherlv_0= 'reference' otherlv_1= '(' ( (lv_containmentPathElement_2_0= ruleContainmentPathElement ) ) (otherlv_3= '.' ( (lv_containmentPathElement_4_0= ruleContainmentPathElement ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleReferenceTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_containmentPathElement_2_0 = null;

        EObject lv_containmentPathElement_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4833:28: ( (otherlv_0= 'reference' otherlv_1= '(' ( (lv_containmentPathElement_2_0= ruleContainmentPathElement ) ) (otherlv_3= '.' ( (lv_containmentPathElement_4_0= ruleContainmentPathElement ) ) )* otherlv_5= ')' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4834:1: (otherlv_0= 'reference' otherlv_1= '(' ( (lv_containmentPathElement_2_0= ruleContainmentPathElement ) ) (otherlv_3= '.' ( (lv_containmentPathElement_4_0= ruleContainmentPathElement ) ) )* otherlv_5= ')' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4834:1: (otherlv_0= 'reference' otherlv_1= '(' ( (lv_containmentPathElement_2_0= ruleContainmentPathElement ) ) (otherlv_3= '.' ( (lv_containmentPathElement_4_0= ruleContainmentPathElement ) ) )* otherlv_5= ')' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4834:3: otherlv_0= 'reference' otherlv_1= '(' ( (lv_containmentPathElement_2_0= ruleContainmentPathElement ) ) (otherlv_3= '.' ( (lv_containmentPathElement_4_0= ruleContainmentPathElement ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleReferenceTerm10782); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getReferenceTermAccess().getReferenceKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleReferenceTerm10794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4842:1: ( (lv_containmentPathElement_2_0= ruleContainmentPathElement ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4843:1: (lv_containmentPathElement_2_0= ruleContainmentPathElement )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4843:1: (lv_containmentPathElement_2_0= ruleContainmentPathElement )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4844:3: lv_containmentPathElement_2_0= ruleContainmentPathElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceTermAccess().getContainmentPathElementContainmentPathElementParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleContainmentPathElement_in_ruleReferenceTerm10815);
            lv_containmentPathElement_2_0=ruleContainmentPathElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReferenceTermRule());
              	        }
                     		add(
                     			current, 
                     			"containmentPathElement",
                      		lv_containmentPathElement_2_0, 
                      		"ContainmentPathElement");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4860:2: (otherlv_3= '.' ( (lv_containmentPathElement_4_0= ruleContainmentPathElement ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==66) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4860:4: otherlv_3= '.' ( (lv_containmentPathElement_4_0= ruleContainmentPathElement ) )
            	    {
            	    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleReferenceTerm10828); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getReferenceTermAccess().getFullStopKeyword_3_0());
            	          
            	    }
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4864:1: ( (lv_containmentPathElement_4_0= ruleContainmentPathElement ) )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4865:1: (lv_containmentPathElement_4_0= ruleContainmentPathElement )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4865:1: (lv_containmentPathElement_4_0= ruleContainmentPathElement )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4866:3: lv_containmentPathElement_4_0= ruleContainmentPathElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceTermAccess().getContainmentPathElementContainmentPathElementParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleContainmentPathElement_in_ruleReferenceTerm10849);
            	    lv_containmentPathElement_4_0=ruleContainmentPathElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceTermRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"containmentPathElement",
            	              		lv_containmentPathElement_4_0, 
            	              		"ContainmentPathElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleReferenceTerm10863); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getReferenceTermAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleReferenceTerm"


    // $ANTLR start "entryRuleRecordTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4894:1: entryRuleRecordTerm returns [EObject current=null] : iv_ruleRecordTerm= ruleRecordTerm EOF ;
    public final EObject entryRuleRecordTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4895:2: (iv_ruleRecordTerm= ruleRecordTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4896:2: iv_ruleRecordTerm= ruleRecordTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordTermRule()); 
            }
            pushFollow(FOLLOW_ruleRecordTerm_in_entryRuleRecordTerm10899);
            iv_ruleRecordTerm=ruleRecordTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordTerm10909); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRecordTerm"


    // $ANTLR start "ruleRecordTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4903:1: ruleRecordTerm returns [EObject current=null] : (otherlv_0= '(' ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= ')' ) ;
    public final EObject ruleRecordTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedFieldValue_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4906:28: ( (otherlv_0= '(' ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= ')' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4907:1: (otherlv_0= '(' ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= ')' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4907:1: (otherlv_0= '(' ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= ')' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4907:3: otherlv_0= '(' ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleRecordTerm10946); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4911:1: ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_ID) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4912:1: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4912:1: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4913:3: lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRecordTermAccess().getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFieldPropertyAssociation_in_ruleRecordTerm10967);
            	    lv_ownedFieldValue_1_0=ruleFieldPropertyAssociation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRecordTermRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedFieldValue",
            	              		lv_ownedFieldValue_1_0, 
            	              		"FieldPropertyAssociation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt67 >= 1 ) break loop67;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
            } while (true);

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleRecordTerm10980); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRecordTermAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRecordTerm"


    // $ANTLR start "entryRuleComputedTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4941:1: entryRuleComputedTerm returns [EObject current=null] : iv_ruleComputedTerm= ruleComputedTerm EOF ;
    public final EObject entryRuleComputedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputedTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4942:2: (iv_ruleComputedTerm= ruleComputedTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4943:2: iv_ruleComputedTerm= ruleComputedTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComputedTermRule()); 
            }
            pushFollow(FOLLOW_ruleComputedTerm_in_entryRuleComputedTerm11016);
            iv_ruleComputedTerm=ruleComputedTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComputedTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComputedTerm11026); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComputedTerm"


    // $ANTLR start "ruleComputedTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4950:1: ruleComputedTerm returns [EObject current=null] : (otherlv_0= 'compute' otherlv_1= '(' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleComputedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_function_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4953:28: ( (otherlv_0= 'compute' otherlv_1= '(' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= ')' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4954:1: (otherlv_0= 'compute' otherlv_1= '(' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= ')' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4954:1: (otherlv_0= 'compute' otherlv_1= '(' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= ')' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4954:3: otherlv_0= 'compute' otherlv_1= '(' ( (lv_function_2_0= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleComputedTerm11063); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getComputedTermAccess().getComputeKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleComputedTerm11075); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4962:1: ( (lv_function_2_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4963:1: (lv_function_2_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4963:1: (lv_function_2_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4964:3: lv_function_2_0= RULE_ID
            {
            lv_function_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComputedTerm11092); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_function_2_0, grammarAccess.getComputedTermAccess().getFunctionIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getComputedTermRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"function",
                      		lv_function_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleComputedTerm11109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getComputedTermAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComputedTerm"


    // $ANTLR start "entryRuleComponentClassifierTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4992:1: entryRuleComponentClassifierTerm returns [EObject current=null] : iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF ;
    public final EObject entryRuleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClassifierTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4993:2: (iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:4994:2: iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentClassifierTermRule()); 
            }
            pushFollow(FOLLOW_ruleComponentClassifierTerm_in_entryRuleComponentClassifierTerm11145);
            iv_ruleComponentClassifierTerm=ruleComponentClassifierTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponentClassifierTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponentClassifierTerm11155); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComponentClassifierTerm"


    // $ANTLR start "ruleComponentClassifierTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5001:1: ruleComponentClassifierTerm returns [EObject current=null] : (otherlv_0= 'classifier' otherlv_1= '(' ( ( ruleQCREF ) ) otherlv_3= ')' ) ;
    public final EObject ruleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5004:28: ( (otherlv_0= 'classifier' otherlv_1= '(' ( ( ruleQCREF ) ) otherlv_3= ')' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5005:1: (otherlv_0= 'classifier' otherlv_1= '(' ( ( ruleQCREF ) ) otherlv_3= ')' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5005:1: (otherlv_0= 'classifier' otherlv_1= '(' ( ( ruleQCREF ) ) otherlv_3= ')' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5005:3: otherlv_0= 'classifier' otherlv_1= '(' ( ( ruleQCREF ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleComponentClassifierTerm11192); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleComponentClassifierTerm11204); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5013:1: ( ( ruleQCREF ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5014:1: ( ruleQCREF )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5014:1: ( ruleQCREF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5015:3: ruleQCREF
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getComponentClassifierTermRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQCREF_in_ruleComponentClassifierTerm11231);
            ruleQCREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleComponentClassifierTerm11243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getComponentClassifierTermAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComponentClassifierTerm"


    // $ANTLR start "entryRuleListTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5043:1: entryRuleListTerm returns [EObject current=null] : iv_ruleListTerm= ruleListTerm EOF ;
    public final EObject entryRuleListTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5044:2: (iv_ruleListTerm= ruleListTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5045:2: iv_ruleListTerm= ruleListTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListTermRule()); 
            }
            pushFollow(FOLLOW_ruleListTerm_in_entryRuleListTerm11279);
            iv_ruleListTerm=ruleListTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListTerm11289); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListTerm"


    // $ANTLR start "ruleListTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5052:1: ruleListTerm returns [EObject current=null] : (otherlv_0= '(' ( (lv_ownedListElement_1_0= rulePropertyExpression ) ) (otherlv_2= ',' ( (lv_ownedListElement_3_0= rulePropertyExpression ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleListTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedListElement_1_0 = null;

        EObject lv_ownedListElement_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5055:28: ( (otherlv_0= '(' ( (lv_ownedListElement_1_0= rulePropertyExpression ) ) (otherlv_2= ',' ( (lv_ownedListElement_3_0= rulePropertyExpression ) ) )* otherlv_4= ')' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5056:1: (otherlv_0= '(' ( (lv_ownedListElement_1_0= rulePropertyExpression ) ) (otherlv_2= ',' ( (lv_ownedListElement_3_0= rulePropertyExpression ) ) )* otherlv_4= ')' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5056:1: (otherlv_0= '(' ( (lv_ownedListElement_1_0= rulePropertyExpression ) ) (otherlv_2= ',' ( (lv_ownedListElement_3_0= rulePropertyExpression ) ) )* otherlv_4= ')' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5056:3: otherlv_0= '(' ( (lv_ownedListElement_1_0= rulePropertyExpression ) ) (otherlv_2= ',' ( (lv_ownedListElement_3_0= rulePropertyExpression ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleListTerm11326); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getListTermAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5060:1: ( (lv_ownedListElement_1_0= rulePropertyExpression ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5061:1: (lv_ownedListElement_1_0= rulePropertyExpression )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5061:1: (lv_ownedListElement_1_0= rulePropertyExpression )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5062:3: lv_ownedListElement_1_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyExpression_in_ruleListTerm11347);
            lv_ownedListElement_1_0=rulePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getListTermRule());
              	        }
                     		add(
                     			current, 
                     			"ownedListElement",
                      		lv_ownedListElement_1_0, 
                      		"PropertyExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5078:2: (otherlv_2= ',' ( (lv_ownedListElement_3_0= rulePropertyExpression ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==15) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5078:4: otherlv_2= ',' ( (lv_ownedListElement_3_0= rulePropertyExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleListTerm11360); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getListTermAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5082:1: ( (lv_ownedListElement_3_0= rulePropertyExpression ) )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5083:1: (lv_ownedListElement_3_0= rulePropertyExpression )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5083:1: (lv_ownedListElement_3_0= rulePropertyExpression )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5084:3: lv_ownedListElement_3_0= rulePropertyExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyExpression_in_ruleListTerm11381);
            	    lv_ownedListElement_3_0=rulePropertyExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getListTermRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ownedListElement",
            	              		lv_ownedListElement_3_0, 
            	              		"PropertyExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleListTerm11395); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getListTermAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleListTerm"


    // $ANTLR start "entryRuleFieldPropertyAssociation"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5112:1: entryRuleFieldPropertyAssociation returns [EObject current=null] : iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF ;
    public final EObject entryRuleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldPropertyAssociation = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5113:2: (iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5114:2: iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldPropertyAssociationRule()); 
            }
            pushFollow(FOLLOW_ruleFieldPropertyAssociation_in_entryRuleFieldPropertyAssociation11431);
            iv_ruleFieldPropertyAssociation=ruleFieldPropertyAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldPropertyAssociation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldPropertyAssociation11441); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFieldPropertyAssociation"


    // $ANTLR start "ruleFieldPropertyAssociation"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5121:1: ruleFieldPropertyAssociation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5124:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= ';' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5125:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= ';' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5125:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= ';' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5125:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= ';'
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5125:2: ( (otherlv_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5126:1: (otherlv_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5126:1: (otherlv_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5127:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldPropertyAssociationRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldPropertyAssociation11490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleFieldPropertyAssociation11502); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5145:1: ( (lv_ownedValue_2_0= rulePropertyExpression ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5146:1: (lv_ownedValue_2_0= rulePropertyExpression )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5146:1: (lv_ownedValue_2_0= rulePropertyExpression )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5147:3: lv_ownedValue_2_0= rulePropertyExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValuePropertyExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyExpression_in_ruleFieldPropertyAssociation11523);
            lv_ownedValue_2_0=rulePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldPropertyAssociationRule());
              	        }
                     		set(
                     			current, 
                     			"ownedValue",
                      		lv_ownedValue_2_0, 
                      		"PropertyExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleFieldPropertyAssociation11535); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFieldPropertyAssociationAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFieldPropertyAssociation"


    // $ANTLR start "entryRuleContainmentPathElement"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5175:1: entryRuleContainmentPathElement returns [EObject current=null] : iv_ruleContainmentPathElement= ruleContainmentPathElement EOF ;
    public final EObject entryRuleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPathElement = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5176:2: (iv_ruleContainmentPathElement= ruleContainmentPathElement EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5177:2: iv_ruleContainmentPathElement= ruleContainmentPathElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainmentPathElementRule()); 
            }
            pushFollow(FOLLOW_ruleContainmentPathElement_in_entryRuleContainmentPathElement11571);
            iv_ruleContainmentPathElement=ruleContainmentPathElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainmentPathElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainmentPathElement11581); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContainmentPathElement"


    // $ANTLR start "ruleContainmentPathElement"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5184:1: ruleContainmentPathElement returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )? ) | (otherlv_2= 'annex' ( ( ruleANNEXREF ) ) ) ) ;
    public final EObject ruleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arrayRange_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5187:28: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )? ) | (otherlv_2= 'annex' ( ( ruleANNEXREF ) ) ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5188:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )? ) | (otherlv_2= 'annex' ( ( ruleANNEXREF ) ) ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5188:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )? ) | (otherlv_2= 'annex' ( ( ruleANNEXREF ) ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID) ) {
                alt70=1;
            }
            else if ( (LA70_0==74) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5188:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )? )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5188:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )? )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5188:3: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )?
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5188:3: ( (otherlv_0= RULE_ID ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5189:1: (otherlv_0= RULE_ID )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5189:1: (otherlv_0= RULE_ID )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5190:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getContainmentPathElementRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContainmentPathElement11631); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0_0()); 
                      	
                    }

                    }


                    }

                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5204:2: ( (lv_arrayRange_1_0= ruleArrayRange ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==69) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5205:1: (lv_arrayRange_1_0= ruleArrayRange )
                            {
                            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5205:1: (lv_arrayRange_1_0= ruleArrayRange )
                            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5206:3: lv_arrayRange_1_0= ruleArrayRange
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleArrayRange_in_ruleContainmentPathElement11652);
                            lv_arrayRange_1_0=ruleArrayRange();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getContainmentPathElementRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arrayRange",
                                      		lv_arrayRange_1_0, 
                                      		"ArrayRange");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5223:6: (otherlv_2= 'annex' ( ( ruleANNEXREF ) ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5223:6: (otherlv_2= 'annex' ( ( ruleANNEXREF ) ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5223:8: otherlv_2= 'annex' ( ( ruleANNEXREF ) )
                    {
                    otherlv_2=(Token)match(input,74,FOLLOW_74_in_ruleContainmentPathElement11673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getContainmentPathElementAccess().getAnnexKeyword_1_0());
                          
                    }
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5227:1: ( ( ruleANNEXREF ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5228:1: ( ruleANNEXREF )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5228:1: ( ruleANNEXREF )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5229:3: ruleANNEXREF
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getContainmentPathElementRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleANNEXREF_in_ruleContainmentPathElement11700);
                    ruleANNEXREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleContainmentPathElement"


    // $ANTLR start "entryRuleANNEXREF"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5253:1: entryRuleANNEXREF returns [String current=null] : iv_ruleANNEXREF= ruleANNEXREF EOF ;
    public final String entryRuleANNEXREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleANNEXREF = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5254:2: (iv_ruleANNEXREF= ruleANNEXREF EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5255:2: iv_ruleANNEXREF= ruleANNEXREF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getANNEXREFRule()); 
            }
            pushFollow(FOLLOW_ruleANNEXREF_in_entryRuleANNEXREF11738);
            iv_ruleANNEXREF=ruleANNEXREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleANNEXREF.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleANNEXREF11749); if (state.failed) return current;

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
    // $ANTLR end "entryRuleANNEXREF"


    // $ANTLR start "ruleANNEXREF"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5262:1: ruleANNEXREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '{' this_STAR_1= ruleSTAR this_STAR_2= ruleSTAR this_ID_3= RULE_ID this_STAR_4= ruleSTAR this_STAR_5= ruleSTAR kw= '}' ) ;
    public final AntlrDatatypeRuleToken ruleANNEXREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;
        AntlrDatatypeRuleToken this_STAR_1 = null;

        AntlrDatatypeRuleToken this_STAR_2 = null;

        AntlrDatatypeRuleToken this_STAR_4 = null;

        AntlrDatatypeRuleToken this_STAR_5 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5265:28: ( (kw= '{' this_STAR_1= ruleSTAR this_STAR_2= ruleSTAR this_ID_3= RULE_ID this_STAR_4= ruleSTAR this_STAR_5= ruleSTAR kw= '}' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5266:1: (kw= '{' this_STAR_1= ruleSTAR this_STAR_2= ruleSTAR this_ID_3= RULE_ID this_STAR_4= ruleSTAR this_STAR_5= ruleSTAR kw= '}' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5266:1: (kw= '{' this_STAR_1= ruleSTAR this_STAR_2= ruleSTAR this_ID_3= RULE_ID this_STAR_4= ruleSTAR this_STAR_5= ruleSTAR kw= '}' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5267:2: kw= '{' this_STAR_1= ruleSTAR this_STAR_2= ruleSTAR this_ID_3= RULE_ID this_STAR_4= ruleSTAR this_STAR_5= ruleSTAR kw= '}'
            {
            kw=(Token)match(input,32,FOLLOW_32_in_ruleANNEXREF11787); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getANNEXREFAccess().getLeftCurlyBracketKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getANNEXREFAccess().getSTARParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleSTAR_in_ruleANNEXREF11809);
            this_STAR_1=ruleSTAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STAR_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getANNEXREFAccess().getSTARParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleSTAR_in_ruleANNEXREF11836);
            this_STAR_2=ruleSTAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STAR_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleANNEXREF11856); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_3, grammarAccess.getANNEXREFAccess().getIDTerminalRuleCall_3()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getANNEXREFAccess().getSTARParserRuleCall_4()); 
                  
            }
            pushFollow(FOLLOW_ruleSTAR_in_ruleANNEXREF11883);
            this_STAR_4=ruleSTAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STAR_4);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getANNEXREFAccess().getSTARParserRuleCall_5()); 
                  
            }
            pushFollow(FOLLOW_ruleSTAR_in_ruleANNEXREF11910);
            this_STAR_5=ruleSTAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STAR_5);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,33,FOLLOW_33_in_ruleANNEXREF11928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getANNEXREFAccess().getRightCurlyBracketKeyword_6()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleANNEXREF"


    // $ANTLR start "entryRuleAndOp"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5337:1: entryRuleAndOp returns [String current=null] : iv_ruleAndOp= ruleAndOp EOF ;
    public final String entryRuleAndOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAndOp = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5338:2: (iv_ruleAndOp= ruleAndOp EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5339:2: iv_ruleAndOp= ruleAndOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndOpRule()); 
            }
            pushFollow(FOLLOW_ruleAndOp_in_entryRuleAndOp11969);
            iv_ruleAndOp=ruleAndOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOp11980); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndOp"


    // $ANTLR start "ruleAndOp"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5346:1: ruleAndOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'and' ;
    public final AntlrDatatypeRuleToken ruleAndOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5349:28: (kw= 'and' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5351:2: kw= 'and'
            {
            kw=(Token)match(input,75,FOLLOW_75_in_ruleAndOp12017); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getAndOpAccess().getAndKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAndOp"


    // $ANTLR start "entryRuleOrOp"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5364:1: entryRuleOrOp returns [String current=null] : iv_ruleOrOp= ruleOrOp EOF ;
    public final String entryRuleOrOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrOp = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5365:2: (iv_ruleOrOp= ruleOrOp EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5366:2: iv_ruleOrOp= ruleOrOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrOpRule()); 
            }
            pushFollow(FOLLOW_ruleOrOp_in_entryRuleOrOp12057);
            iv_ruleOrOp=ruleOrOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOp12068); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrOp"


    // $ANTLR start "ruleOrOp"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5373:1: ruleOrOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'or' ;
    public final AntlrDatatypeRuleToken ruleOrOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5376:28: (kw= 'or' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5378:2: kw= 'or'
            {
            kw=(Token)match(input,76,FOLLOW_76_in_ruleOrOp12105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOrOpAccess().getOrKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOrOp"


    // $ANTLR start "entryRuleNotOp"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5391:1: entryRuleNotOp returns [String current=null] : iv_ruleNotOp= ruleNotOp EOF ;
    public final String entryRuleNotOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNotOp = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5392:2: (iv_ruleNotOp= ruleNotOp EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5393:2: iv_ruleNotOp= ruleNotOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOpRule()); 
            }
            pushFollow(FOLLOW_ruleNotOp_in_entryRuleNotOp12145);
            iv_ruleNotOp=ruleNotOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOp12156); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotOp"


    // $ANTLR start "ruleNotOp"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5400:1: ruleNotOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'not' ;
    public final AntlrDatatypeRuleToken ruleNotOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5403:28: (kw= 'not' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5405:2: kw= 'not'
            {
            kw=(Token)match(input,77,FOLLOW_77_in_ruleNotOp12193); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getNotOpAccess().getNotKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNotOp"


    // $ANTLR start "entryRulePlusMinus"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5418:1: entryRulePlusMinus returns [String current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final String entryRulePlusMinus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusMinus = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5419:2: (iv_rulePlusMinus= rulePlusMinus EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5420:2: iv_rulePlusMinus= rulePlusMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusMinusRule()); 
            }
            pushFollow(FOLLOW_rulePlusMinus_in_entryRulePlusMinus12233);
            iv_rulePlusMinus=rulePlusMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusMinus.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusMinus12244); if (state.failed) return current;

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
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5427:1: rulePlusMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken rulePlusMinus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5430:28: ( (kw= '+' | kw= '-' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5431:1: (kw= '+' | kw= '-' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5431:1: (kw= '+' | kw= '-' )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==78) ) {
                alt71=1;
            }
            else if ( (LA71_0==79) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5432:2: kw= '+'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_rulePlusMinus12282); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5439:2: kw= '-'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_rulePlusMinus12301); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleStringTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5452:1: entryRuleStringTerm returns [EObject current=null] : iv_ruleStringTerm= ruleStringTerm EOF ;
    public final EObject entryRuleStringTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5453:2: (iv_ruleStringTerm= ruleStringTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5454:2: iv_ruleStringTerm= ruleStringTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringTermRule()); 
            }
            pushFollow(FOLLOW_ruleStringTerm_in_entryRuleStringTerm12341);
            iv_ruleStringTerm=ruleStringTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringTerm12351); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringTerm"


    // $ANTLR start "ruleStringTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5461:1: ruleStringTerm returns [EObject current=null] : ( (lv_value_0_0= ruleNoQuoteString ) ) ;
    public final EObject ruleStringTerm() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5464:28: ( ( (lv_value_0_0= ruleNoQuoteString ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5465:1: ( (lv_value_0_0= ruleNoQuoteString ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5465:1: ( (lv_value_0_0= ruleNoQuoteString ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5466:1: (lv_value_0_0= ruleNoQuoteString )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5466:1: (lv_value_0_0= ruleNoQuoteString )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5467:3: lv_value_0_0= ruleNoQuoteString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStringTermAccess().getValueNoQuoteStringParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNoQuoteString_in_ruleStringTerm12396);
            lv_value_0_0=ruleNoQuoteString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStringTermRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"NoQuoteString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringTerm"


    // $ANTLR start "entryRuleNoQuoteString"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5491:1: entryRuleNoQuoteString returns [String current=null] : iv_ruleNoQuoteString= ruleNoQuoteString EOF ;
    public final String entryRuleNoQuoteString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQuoteString = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5492:2: (iv_ruleNoQuoteString= ruleNoQuoteString EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5493:2: iv_ruleNoQuoteString= ruleNoQuoteString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNoQuoteStringRule()); 
            }
            pushFollow(FOLLOW_ruleNoQuoteString_in_entryRuleNoQuoteString12432);
            iv_ruleNoQuoteString=ruleNoQuoteString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNoQuoteString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoQuoteString12443); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNoQuoteString"


    // $ANTLR start "ruleNoQuoteString"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5500:1: ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNoQuoteString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5503:28: (this_STRING_0= RULE_STRING )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5504:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNoQuoteString12482); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_STRING_0, grammarAccess.getNoQuoteStringAccess().getSTRINGTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNoQuoteString"


    // $ANTLR start "entryRuleArrayRange"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5519:1: entryRuleArrayRange returns [EObject current=null] : iv_ruleArrayRange= ruleArrayRange EOF ;
    public final EObject entryRuleArrayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayRange = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5520:2: (iv_ruleArrayRange= ruleArrayRange EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5521:2: iv_ruleArrayRange= ruleArrayRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRangeRule()); 
            }
            pushFollow(FOLLOW_ruleArrayRange_in_entryRuleArrayRange12526);
            iv_ruleArrayRange=ruleArrayRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayRange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayRange12536); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayRange"


    // $ANTLR start "ruleArrayRange"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5528:1: ruleArrayRange returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_lowerBound_2_0= rulegINT ) ) (otherlv_3= '..' ( (lv_upperBound_4_0= rulegINT ) ) )? otherlv_5= ']' ) ;
    public final EObject ruleArrayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5531:28: ( ( () otherlv_1= '[' ( (lv_lowerBound_2_0= rulegINT ) ) (otherlv_3= '..' ( (lv_upperBound_4_0= rulegINT ) ) )? otherlv_5= ']' ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5532:1: ( () otherlv_1= '[' ( (lv_lowerBound_2_0= rulegINT ) ) (otherlv_3= '..' ( (lv_upperBound_4_0= rulegINT ) ) )? otherlv_5= ']' )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5532:1: ( () otherlv_1= '[' ( (lv_lowerBound_2_0= rulegINT ) ) (otherlv_3= '..' ( (lv_upperBound_4_0= rulegINT ) ) )? otherlv_5= ']' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5532:2: () otherlv_1= '[' ( (lv_lowerBound_2_0= rulegINT ) ) (otherlv_3= '..' ( (lv_upperBound_4_0= rulegINT ) ) )? otherlv_5= ']'
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5532:2: ()
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5533:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArrayRangeAccess().getArrayRangeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleArrayRange12585); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5545:1: ( (lv_lowerBound_2_0= rulegINT ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5546:1: (lv_lowerBound_2_0= rulegINT )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5546:1: (lv_lowerBound_2_0= rulegINT )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5547:3: lv_lowerBound_2_0= rulegINT
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayRangeAccess().getLowerBoundGINTParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_rulegINT_in_ruleArrayRange12606);
            lv_lowerBound_2_0=rulegINT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayRangeRule());
              	        }
                     		set(
                     			current, 
                     			"lowerBound",
                      		lv_lowerBound_2_0, 
                      		"gINT");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5563:2: (otherlv_3= '..' ( (lv_upperBound_4_0= rulegINT ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==80) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5563:4: otherlv_3= '..' ( (lv_upperBound_4_0= rulegINT ) )
                    {
                    otherlv_3=(Token)match(input,80,FOLLOW_80_in_ruleArrayRange12619); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0());
                          
                    }
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5567:1: ( (lv_upperBound_4_0= rulegINT ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5568:1: (lv_upperBound_4_0= rulegINT )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5568:1: (lv_upperBound_4_0= rulegINT )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5569:3: lv_upperBound_4_0= rulegINT
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayRangeAccess().getUpperBoundGINTParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulegINT_in_ruleArrayRange12640);
                    lv_upperBound_4_0=rulegINT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArrayRangeRule());
                      	        }
                             		set(
                             			current, 
                             			"upperBound",
                              		lv_upperBound_4_0, 
                              		"gINT");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,70,FOLLOW_70_in_ruleArrayRange12654); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getArrayRangeAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArrayRange"


    // $ANTLR start "entryRuleIntegerRange"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5597:1: entryRuleIntegerRange returns [EObject current=null] : iv_ruleIntegerRange= ruleIntegerRange EOF ;
    public final EObject entryRuleIntegerRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerRange = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5598:2: (iv_ruleIntegerRange= ruleIntegerRange EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5599:2: iv_ruleIntegerRange= ruleIntegerRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRangeRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerRange_in_entryRuleIntegerRange12690);
            iv_ruleIntegerRange=ruleIntegerRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerRange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerRange12700); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerRange"


    // $ANTLR start "ruleIntegerRange"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5606:1: ruleIntegerRange returns [EObject current=null] : ( ( ( (lv_lowerBound_0_1= ruleIntegerTerm | lv_lowerBound_0_2= ruleSignedConstant | lv_lowerBound_0_3= ruleConstantValue ) ) ) otherlv_1= '..' ( ( (lv_upperBound_2_1= ruleIntegerTerm | lv_upperBound_2_2= ruleSignedConstant | lv_upperBound_2_3= ruleConstantValue ) ) ) ) ;
    public final EObject ruleIntegerRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lowerBound_0_1 = null;

        EObject lv_lowerBound_0_2 = null;

        EObject lv_lowerBound_0_3 = null;

        EObject lv_upperBound_2_1 = null;

        EObject lv_upperBound_2_2 = null;

        EObject lv_upperBound_2_3 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5609:28: ( ( ( ( (lv_lowerBound_0_1= ruleIntegerTerm | lv_lowerBound_0_2= ruleSignedConstant | lv_lowerBound_0_3= ruleConstantValue ) ) ) otherlv_1= '..' ( ( (lv_upperBound_2_1= ruleIntegerTerm | lv_upperBound_2_2= ruleSignedConstant | lv_upperBound_2_3= ruleConstantValue ) ) ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5610:1: ( ( ( (lv_lowerBound_0_1= ruleIntegerTerm | lv_lowerBound_0_2= ruleSignedConstant | lv_lowerBound_0_3= ruleConstantValue ) ) ) otherlv_1= '..' ( ( (lv_upperBound_2_1= ruleIntegerTerm | lv_upperBound_2_2= ruleSignedConstant | lv_upperBound_2_3= ruleConstantValue ) ) ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5610:1: ( ( ( (lv_lowerBound_0_1= ruleIntegerTerm | lv_lowerBound_0_2= ruleSignedConstant | lv_lowerBound_0_3= ruleConstantValue ) ) ) otherlv_1= '..' ( ( (lv_upperBound_2_1= ruleIntegerTerm | lv_upperBound_2_2= ruleSignedConstant | lv_upperBound_2_3= ruleConstantValue ) ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5610:2: ( ( (lv_lowerBound_0_1= ruleIntegerTerm | lv_lowerBound_0_2= ruleSignedConstant | lv_lowerBound_0_3= ruleConstantValue ) ) ) otherlv_1= '..' ( ( (lv_upperBound_2_1= ruleIntegerTerm | lv_upperBound_2_2= ruleSignedConstant | lv_upperBound_2_3= ruleConstantValue ) ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5610:2: ( ( (lv_lowerBound_0_1= ruleIntegerTerm | lv_lowerBound_0_2= ruleSignedConstant | lv_lowerBound_0_3= ruleConstantValue ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5611:1: ( (lv_lowerBound_0_1= ruleIntegerTerm | lv_lowerBound_0_2= ruleSignedConstant | lv_lowerBound_0_3= ruleConstantValue ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5611:1: ( (lv_lowerBound_0_1= ruleIntegerTerm | lv_lowerBound_0_2= ruleSignedConstant | lv_lowerBound_0_3= ruleConstantValue ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5612:1: (lv_lowerBound_0_1= ruleIntegerTerm | lv_lowerBound_0_2= ruleSignedConstant | lv_lowerBound_0_3= ruleConstantValue )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5612:1: (lv_lowerBound_0_1= ruleIntegerTerm | lv_lowerBound_0_2= ruleSignedConstant | lv_lowerBound_0_3= ruleConstantValue )
            int alt73=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==RULE_INT) ) {
                    alt73=1;
                }
                else if ( (LA73_1==RULE_ID) ) {
                    alt73=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    throw nvae;
                }
                }
                break;
            case 79:
                {
                int LA73_2 = input.LA(2);

                if ( (LA73_2==RULE_INT) ) {
                    alt73=1;
                }
                else if ( (LA73_2==RULE_ID) ) {
                    alt73=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt73=1;
                }
                break;
            case RULE_ID:
                {
                alt73=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5613:3: lv_lowerBound_0_1= ruleIntegerTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntegerRangeAccess().getLowerBoundIntegerTermParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIntegerTerm_in_ruleIntegerRange12748);
                    lv_lowerBound_0_1=ruleIntegerTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntegerRangeRule());
                      	        }
                             		set(
                             			current, 
                             			"lowerBound",
                              		lv_lowerBound_0_1, 
                              		"IntegerTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5628:8: lv_lowerBound_0_2= ruleSignedConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntegerRangeAccess().getLowerBoundSignedConstantParserRuleCall_0_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedConstant_in_ruleIntegerRange12767);
                    lv_lowerBound_0_2=ruleSignedConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntegerRangeRule());
                      	        }
                             		set(
                             			current, 
                             			"lowerBound",
                              		lv_lowerBound_0_2, 
                              		"SignedConstant");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5643:8: lv_lowerBound_0_3= ruleConstantValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntegerRangeAccess().getLowerBoundConstantValueParserRuleCall_0_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstantValue_in_ruleIntegerRange12786);
                    lv_lowerBound_0_3=ruleConstantValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntegerRangeRule());
                      	        }
                             		set(
                             			current, 
                             			"lowerBound",
                              		lv_lowerBound_0_3, 
                              		"ConstantValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleIntegerRange12801); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIntegerRangeAccess().getFullStopFullStopKeyword_1());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5665:1: ( ( (lv_upperBound_2_1= ruleIntegerTerm | lv_upperBound_2_2= ruleSignedConstant | lv_upperBound_2_3= ruleConstantValue ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5666:1: ( (lv_upperBound_2_1= ruleIntegerTerm | lv_upperBound_2_2= ruleSignedConstant | lv_upperBound_2_3= ruleConstantValue ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5666:1: ( (lv_upperBound_2_1= ruleIntegerTerm | lv_upperBound_2_2= ruleSignedConstant | lv_upperBound_2_3= ruleConstantValue ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5667:1: (lv_upperBound_2_1= ruleIntegerTerm | lv_upperBound_2_2= ruleSignedConstant | lv_upperBound_2_3= ruleConstantValue )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5667:1: (lv_upperBound_2_1= ruleIntegerTerm | lv_upperBound_2_2= ruleSignedConstant | lv_upperBound_2_3= ruleConstantValue )
            int alt74=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                int LA74_1 = input.LA(2);

                if ( (LA74_1==RULE_INT) ) {
                    alt74=1;
                }
                else if ( (LA74_1==RULE_ID) ) {
                    alt74=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 1, input);

                    throw nvae;
                }
                }
                break;
            case 79:
                {
                int LA74_2 = input.LA(2);

                if ( (LA74_2==RULE_ID) ) {
                    alt74=2;
                }
                else if ( (LA74_2==RULE_INT) ) {
                    alt74=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt74=1;
                }
                break;
            case RULE_ID:
                {
                alt74=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5668:3: lv_upperBound_2_1= ruleIntegerTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntegerRangeAccess().getUpperBoundIntegerTermParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIntegerTerm_in_ruleIntegerRange12824);
                    lv_upperBound_2_1=ruleIntegerTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntegerRangeRule());
                      	        }
                             		set(
                             			current, 
                             			"upperBound",
                              		lv_upperBound_2_1, 
                              		"IntegerTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5683:8: lv_upperBound_2_2= ruleSignedConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntegerRangeAccess().getUpperBoundSignedConstantParserRuleCall_2_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedConstant_in_ruleIntegerRange12843);
                    lv_upperBound_2_2=ruleSignedConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntegerRangeRule());
                      	        }
                             		set(
                             			current, 
                             			"upperBound",
                              		lv_upperBound_2_2, 
                              		"SignedConstant");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5698:8: lv_upperBound_2_3= ruleConstantValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntegerRangeAccess().getUpperBoundConstantValueParserRuleCall_2_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstantValue_in_ruleIntegerRange12862);
                    lv_upperBound_2_3=ruleConstantValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntegerRangeRule());
                      	        }
                             		set(
                             			current, 
                             			"upperBound",
                              		lv_upperBound_2_3, 
                              		"ConstantValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntegerRange"


    // $ANTLR start "entryRuleRealRange"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5724:1: entryRuleRealRange returns [EObject current=null] : iv_ruleRealRange= ruleRealRange EOF ;
    public final EObject entryRuleRealRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealRange = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5725:2: (iv_ruleRealRange= ruleRealRange EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5726:2: iv_ruleRealRange= ruleRealRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealRangeRule()); 
            }
            pushFollow(FOLLOW_ruleRealRange_in_entryRuleRealRange12901);
            iv_ruleRealRange=ruleRealRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealRange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealRange12911); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRealRange"


    // $ANTLR start "ruleRealRange"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5733:1: ruleRealRange returns [EObject current=null] : ( ( ( (lv_lowerBound_0_1= ruleRealTerm | lv_lowerBound_0_2= ruleSignedConstant | lv_lowerBound_0_3= ruleConstantValue ) ) ) otherlv_1= '..' ( ( (lv_upperBound_2_1= ruleRealTerm | lv_upperBound_2_2= ruleSignedConstant | lv_upperBound_2_3= ruleConstantValue ) ) ) ) ;
    public final EObject ruleRealRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lowerBound_0_1 = null;

        EObject lv_lowerBound_0_2 = null;

        EObject lv_lowerBound_0_3 = null;

        EObject lv_upperBound_2_1 = null;

        EObject lv_upperBound_2_2 = null;

        EObject lv_upperBound_2_3 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5736:28: ( ( ( ( (lv_lowerBound_0_1= ruleRealTerm | lv_lowerBound_0_2= ruleSignedConstant | lv_lowerBound_0_3= ruleConstantValue ) ) ) otherlv_1= '..' ( ( (lv_upperBound_2_1= ruleRealTerm | lv_upperBound_2_2= ruleSignedConstant | lv_upperBound_2_3= ruleConstantValue ) ) ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5737:1: ( ( ( (lv_lowerBound_0_1= ruleRealTerm | lv_lowerBound_0_2= ruleSignedConstant | lv_lowerBound_0_3= ruleConstantValue ) ) ) otherlv_1= '..' ( ( (lv_upperBound_2_1= ruleRealTerm | lv_upperBound_2_2= ruleSignedConstant | lv_upperBound_2_3= ruleConstantValue ) ) ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5737:1: ( ( ( (lv_lowerBound_0_1= ruleRealTerm | lv_lowerBound_0_2= ruleSignedConstant | lv_lowerBound_0_3= ruleConstantValue ) ) ) otherlv_1= '..' ( ( (lv_upperBound_2_1= ruleRealTerm | lv_upperBound_2_2= ruleSignedConstant | lv_upperBound_2_3= ruleConstantValue ) ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5737:2: ( ( (lv_lowerBound_0_1= ruleRealTerm | lv_lowerBound_0_2= ruleSignedConstant | lv_lowerBound_0_3= ruleConstantValue ) ) ) otherlv_1= '..' ( ( (lv_upperBound_2_1= ruleRealTerm | lv_upperBound_2_2= ruleSignedConstant | lv_upperBound_2_3= ruleConstantValue ) ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5737:2: ( ( (lv_lowerBound_0_1= ruleRealTerm | lv_lowerBound_0_2= ruleSignedConstant | lv_lowerBound_0_3= ruleConstantValue ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5738:1: ( (lv_lowerBound_0_1= ruleRealTerm | lv_lowerBound_0_2= ruleSignedConstant | lv_lowerBound_0_3= ruleConstantValue ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5738:1: ( (lv_lowerBound_0_1= ruleRealTerm | lv_lowerBound_0_2= ruleSignedConstant | lv_lowerBound_0_3= ruleConstantValue ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5739:1: (lv_lowerBound_0_1= ruleRealTerm | lv_lowerBound_0_2= ruleSignedConstant | lv_lowerBound_0_3= ruleConstantValue )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5739:1: (lv_lowerBound_0_1= ruleRealTerm | lv_lowerBound_0_2= ruleSignedConstant | lv_lowerBound_0_3= ruleConstantValue )
            int alt75=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==RULE_ID) ) {
                    alt75=2;
                }
                else if ( (LA75_1==RULE_INT) ) {
                    alt75=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 1, input);

                    throw nvae;
                }
                }
                break;
            case 79:
                {
                int LA75_2 = input.LA(2);

                if ( (LA75_2==RULE_ID) ) {
                    alt75=2;
                }
                else if ( (LA75_2==RULE_INT) ) {
                    alt75=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt75=1;
                }
                break;
            case RULE_ID:
                {
                alt75=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5740:3: lv_lowerBound_0_1= ruleRealTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRealRangeAccess().getLowerBoundRealTermParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRealTerm_in_ruleRealRange12959);
                    lv_lowerBound_0_1=ruleRealTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRealRangeRule());
                      	        }
                             		set(
                             			current, 
                             			"lowerBound",
                              		lv_lowerBound_0_1, 
                              		"RealTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5755:8: lv_lowerBound_0_2= ruleSignedConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRealRangeAccess().getLowerBoundSignedConstantParserRuleCall_0_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedConstant_in_ruleRealRange12978);
                    lv_lowerBound_0_2=ruleSignedConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRealRangeRule());
                      	        }
                             		set(
                             			current, 
                             			"lowerBound",
                              		lv_lowerBound_0_2, 
                              		"SignedConstant");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5770:8: lv_lowerBound_0_3= ruleConstantValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRealRangeAccess().getLowerBoundConstantValueParserRuleCall_0_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstantValue_in_ruleRealRange12997);
                    lv_lowerBound_0_3=ruleConstantValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRealRangeRule());
                      	        }
                             		set(
                             			current, 
                             			"lowerBound",
                              		lv_lowerBound_0_3, 
                              		"ConstantValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleRealRange13012); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRealRangeAccess().getFullStopFullStopKeyword_1());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5792:1: ( ( (lv_upperBound_2_1= ruleRealTerm | lv_upperBound_2_2= ruleSignedConstant | lv_upperBound_2_3= ruleConstantValue ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5793:1: ( (lv_upperBound_2_1= ruleRealTerm | lv_upperBound_2_2= ruleSignedConstant | lv_upperBound_2_3= ruleConstantValue ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5793:1: ( (lv_upperBound_2_1= ruleRealTerm | lv_upperBound_2_2= ruleSignedConstant | lv_upperBound_2_3= ruleConstantValue ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5794:1: (lv_upperBound_2_1= ruleRealTerm | lv_upperBound_2_2= ruleSignedConstant | lv_upperBound_2_3= ruleConstantValue )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5794:1: (lv_upperBound_2_1= ruleRealTerm | lv_upperBound_2_2= ruleSignedConstant | lv_upperBound_2_3= ruleConstantValue )
            int alt76=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                int LA76_1 = input.LA(2);

                if ( (LA76_1==RULE_INT) ) {
                    alt76=1;
                }
                else if ( (LA76_1==RULE_ID) ) {
                    alt76=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 1, input);

                    throw nvae;
                }
                }
                break;
            case 79:
                {
                int LA76_2 = input.LA(2);

                if ( (LA76_2==RULE_ID) ) {
                    alt76=2;
                }
                else if ( (LA76_2==RULE_INT) ) {
                    alt76=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt76=1;
                }
                break;
            case RULE_ID:
                {
                alt76=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5795:3: lv_upperBound_2_1= ruleRealTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRealRangeAccess().getUpperBoundRealTermParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRealTerm_in_ruleRealRange13035);
                    lv_upperBound_2_1=ruleRealTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRealRangeRule());
                      	        }
                             		set(
                             			current, 
                             			"upperBound",
                              		lv_upperBound_2_1, 
                              		"RealTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5810:8: lv_upperBound_2_2= ruleSignedConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRealRangeAccess().getUpperBoundSignedConstantParserRuleCall_2_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedConstant_in_ruleRealRange13054);
                    lv_upperBound_2_2=ruleSignedConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRealRangeRule());
                      	        }
                             		set(
                             			current, 
                             			"upperBound",
                              		lv_upperBound_2_2, 
                              		"SignedConstant");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5825:8: lv_upperBound_2_3= ruleConstantValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRealRangeAccess().getUpperBoundConstantValueParserRuleCall_2_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstantValue_in_ruleRealRange13073);
                    lv_upperBound_2_3=ruleConstantValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRealRangeRule());
                      	        }
                             		set(
                             			current, 
                             			"upperBound",
                              		lv_upperBound_2_3, 
                              		"ConstantValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRealRange"


    // $ANTLR start "entryRuleSignedConstant"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5851:1: entryRuleSignedConstant returns [EObject current=null] : iv_ruleSignedConstant= ruleSignedConstant EOF ;
    public final EObject entryRuleSignedConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedConstant = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5852:2: (iv_ruleSignedConstant= ruleSignedConstant EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5853:2: iv_ruleSignedConstant= ruleSignedConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedConstantRule()); 
            }
            pushFollow(FOLLOW_ruleSignedConstant_in_entryRuleSignedConstant13112);
            iv_ruleSignedConstant=ruleSignedConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedConstant13122); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSignedConstant"


    // $ANTLR start "ruleSignedConstant"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5860:1: ruleSignedConstant returns [EObject current=null] : ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) ;
    public final EObject ruleSignedConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ownedPropertyExpression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5863:28: ( ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5864:1: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5864:1: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5864:2: ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5864:2: ( (lv_op_0_0= rulePlusMinus ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5865:1: (lv_op_0_0= rulePlusMinus )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5865:1: (lv_op_0_0= rulePlusMinus )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5866:3: lv_op_0_0= rulePlusMinus
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePlusMinus_in_ruleSignedConstant13168);
            lv_op_0_0=rulePlusMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSignedConstantRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_0_0, 
                      		"PlusMinus");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5882:2: ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5883:1: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5883:1: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5884:3: lv_ownedPropertyExpression_1_0= ruleConstantValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionConstantValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConstantValue_in_ruleSignedConstant13189);
            lv_ownedPropertyExpression_1_0=ruleConstantValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSignedConstantRule());
              	        }
                     		add(
                     			current, 
                     			"ownedPropertyExpression",
                      		lv_ownedPropertyExpression_1_0, 
                      		"ConstantValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSignedConstant"


    // $ANTLR start "entryRuleIntegerTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5908:1: entryRuleIntegerTerm returns [EObject current=null] : iv_ruleIntegerTerm= ruleIntegerTerm EOF ;
    public final EObject entryRuleIntegerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5909:2: (iv_ruleIntegerTerm= ruleIntegerTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5910:2: iv_ruleIntegerTerm= ruleIntegerTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerTermRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerTerm_in_entryRuleIntegerTerm13225);
            iv_ruleIntegerTerm=ruleIntegerTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerTerm13235); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerTerm"


    // $ANTLR start "ruleIntegerTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5917:1: ruleIntegerTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleIntegerTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5920:28: ( ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5921:1: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5921:1: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5921:2: ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5921:2: ( (lv_value_0_0= ruleSignedInt ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5922:1: (lv_value_0_0= ruleSignedInt )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5922:1: (lv_value_0_0= ruleSignedInt )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5923:3: lv_value_0_0= ruleSignedInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerTermAccess().getValueSignedIntParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSignedInt_in_ruleIntegerTerm13281);
            lv_value_0_0=ruleSignedInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerTermRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"SignedInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5939:2: ( (otherlv_1= RULE_ID ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_ID) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5940:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5940:1: (otherlv_1= RULE_ID )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5941:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getIntegerTermRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntegerTerm13305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getIntegerTermAccess().getUnitUnitLiteralCrossReference_1_0()); 
                      	
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntegerTerm"


    // $ANTLR start "entryRuleSignedInt"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5963:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5964:2: (iv_ruleSignedInt= ruleSignedInt EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5965:2: iv_ruleSignedInt= ruleSignedInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedIntRule()); 
            }
            pushFollow(FOLLOW_ruleSignedInt_in_entryRuleSignedInt13343);
            iv_ruleSignedInt=ruleSignedInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedInt.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedInt13354); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSignedInt"


    // $ANTLR start "ruleSignedInt"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5972:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5975:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5976:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5976:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5976:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5976:2: (kw= '+' | kw= '-' )?
            int alt78=3;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==78) ) {
                alt78=1;
            }
            else if ( (LA78_0==79) ) {
                alt78=2;
            }
            switch (alt78) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5977:2: kw= '+'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleSignedInt13393); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:5984:2: kw= '-'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleSignedInt13412); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSignedInt13429); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_2, grammarAccess.getSignedIntAccess().getINTTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSignedInt"


    // $ANTLR start "entryRuleRealTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6004:1: entryRuleRealTerm returns [EObject current=null] : iv_ruleRealTerm= ruleRealTerm EOF ;
    public final EObject entryRuleRealTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6005:2: (iv_ruleRealTerm= ruleRealTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6006:2: iv_ruleRealTerm= ruleRealTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealTermRule()); 
            }
            pushFollow(FOLLOW_ruleRealTerm_in_entryRuleRealTerm13474);
            iv_ruleRealTerm=ruleRealTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealTerm13484); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRealTerm"


    // $ANTLR start "ruleRealTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6013:1: ruleRealTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleRealTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6016:28: ( ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6017:1: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6017:1: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6017:2: ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6017:2: ( (lv_value_0_0= ruleSignedReal ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6018:1: (lv_value_0_0= ruleSignedReal )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6018:1: (lv_value_0_0= ruleSignedReal )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6019:3: lv_value_0_0= ruleSignedReal
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRealTermAccess().getValueSignedRealParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSignedReal_in_ruleRealTerm13530);
            lv_value_0_0=ruleSignedReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRealTermRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"SignedReal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6035:2: ( (otherlv_1= RULE_ID ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_ID) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6036:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6036:1: (otherlv_1= RULE_ID )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6037:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRealTermRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRealTerm13554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getRealTermAccess().getUnitUnitLiteralCrossReference_1_0()); 
                      	
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRealTerm"


    // $ANTLR start "entryRuleSignedReal"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6059:1: entryRuleSignedReal returns [String current=null] : iv_ruleSignedReal= ruleSignedReal EOF ;
    public final String entryRuleSignedReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedReal = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6060:2: (iv_ruleSignedReal= ruleSignedReal EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6061:2: iv_ruleSignedReal= ruleSignedReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedRealRule()); 
            }
            pushFollow(FOLLOW_ruleSignedReal_in_entryRuleSignedReal13592);
            iv_ruleSignedReal=ruleSignedReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignedReal.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignedReal13603); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSignedReal"


    // $ANTLR start "ruleSignedReal"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6068:1: ruleSignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_REAL_2= ruleREAL ) ;
    public final AntlrDatatypeRuleToken ruleSignedReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_REAL_2 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6071:28: ( ( (kw= '+' | kw= '-' )? this_REAL_2= ruleREAL ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6072:1: ( (kw= '+' | kw= '-' )? this_REAL_2= ruleREAL )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6072:1: ( (kw= '+' | kw= '-' )? this_REAL_2= ruleREAL )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6072:2: (kw= '+' | kw= '-' )? this_REAL_2= ruleREAL
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6072:2: (kw= '+' | kw= '-' )?
            int alt80=3;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==78) ) {
                alt80=1;
            }
            else if ( (LA80_0==79) ) {
                alt80=2;
            }
            switch (alt80) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6073:2: kw= '+'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleSignedReal13642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6080:2: kw= '-'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleSignedReal13661); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedRealAccess().getHyphenMinusKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSignedRealAccess().getREALParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleREAL_in_ruleSignedReal13685);
            this_REAL_2=ruleREAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_REAL_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSignedReal"


    // $ANTLR start "entryRuleNumericRangeTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6104:1: entryRuleNumericRangeTerm returns [EObject current=null] : iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF ;
    public final EObject entryRuleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericRangeTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6105:2: (iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6106:2: iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericRangeTermRule()); 
            }
            pushFollow(FOLLOW_ruleNumericRangeTerm_in_entryRuleNumericRangeTerm13730);
            iv_ruleNumericRangeTerm=ruleNumericRangeTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericRangeTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericRangeTerm13740); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumericRangeTerm"


    // $ANTLR start "ruleNumericRangeTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6113:1: ruleNumericRangeTerm returns [EObject current=null] : ( ( ( (lv_minimum_0_1= ruleRealTerm | lv_minimum_0_2= ruleIntegerTerm | lv_minimum_0_3= ruleSignedConstant | lv_minimum_0_4= ruleConstantValue ) ) ) otherlv_1= '..' ( ( (lv_maximum_2_1= ruleRealTerm | lv_maximum_2_2= ruleIntegerTerm | lv_maximum_2_3= ruleSignedConstant | lv_maximum_2_4= ruleConstantValue ) ) ) (otherlv_3= 'delta' ( ( (lv_delta_4_1= ruleRealTerm | lv_delta_4_2= ruleIntegerTerm | lv_delta_4_3= ruleSignedConstant | lv_delta_4_4= ruleConstantValue ) ) ) )? ) ;
    public final EObject ruleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_minimum_0_1 = null;

        EObject lv_minimum_0_2 = null;

        EObject lv_minimum_0_3 = null;

        EObject lv_minimum_0_4 = null;

        EObject lv_maximum_2_1 = null;

        EObject lv_maximum_2_2 = null;

        EObject lv_maximum_2_3 = null;

        EObject lv_maximum_2_4 = null;

        EObject lv_delta_4_1 = null;

        EObject lv_delta_4_2 = null;

        EObject lv_delta_4_3 = null;

        EObject lv_delta_4_4 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6116:28: ( ( ( ( (lv_minimum_0_1= ruleRealTerm | lv_minimum_0_2= ruleIntegerTerm | lv_minimum_0_3= ruleSignedConstant | lv_minimum_0_4= ruleConstantValue ) ) ) otherlv_1= '..' ( ( (lv_maximum_2_1= ruleRealTerm | lv_maximum_2_2= ruleIntegerTerm | lv_maximum_2_3= ruleSignedConstant | lv_maximum_2_4= ruleConstantValue ) ) ) (otherlv_3= 'delta' ( ( (lv_delta_4_1= ruleRealTerm | lv_delta_4_2= ruleIntegerTerm | lv_delta_4_3= ruleSignedConstant | lv_delta_4_4= ruleConstantValue ) ) ) )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6117:1: ( ( ( (lv_minimum_0_1= ruleRealTerm | lv_minimum_0_2= ruleIntegerTerm | lv_minimum_0_3= ruleSignedConstant | lv_minimum_0_4= ruleConstantValue ) ) ) otherlv_1= '..' ( ( (lv_maximum_2_1= ruleRealTerm | lv_maximum_2_2= ruleIntegerTerm | lv_maximum_2_3= ruleSignedConstant | lv_maximum_2_4= ruleConstantValue ) ) ) (otherlv_3= 'delta' ( ( (lv_delta_4_1= ruleRealTerm | lv_delta_4_2= ruleIntegerTerm | lv_delta_4_3= ruleSignedConstant | lv_delta_4_4= ruleConstantValue ) ) ) )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6117:1: ( ( ( (lv_minimum_0_1= ruleRealTerm | lv_minimum_0_2= ruleIntegerTerm | lv_minimum_0_3= ruleSignedConstant | lv_minimum_0_4= ruleConstantValue ) ) ) otherlv_1= '..' ( ( (lv_maximum_2_1= ruleRealTerm | lv_maximum_2_2= ruleIntegerTerm | lv_maximum_2_3= ruleSignedConstant | lv_maximum_2_4= ruleConstantValue ) ) ) (otherlv_3= 'delta' ( ( (lv_delta_4_1= ruleRealTerm | lv_delta_4_2= ruleIntegerTerm | lv_delta_4_3= ruleSignedConstant | lv_delta_4_4= ruleConstantValue ) ) ) )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6117:2: ( ( (lv_minimum_0_1= ruleRealTerm | lv_minimum_0_2= ruleIntegerTerm | lv_minimum_0_3= ruleSignedConstant | lv_minimum_0_4= ruleConstantValue ) ) ) otherlv_1= '..' ( ( (lv_maximum_2_1= ruleRealTerm | lv_maximum_2_2= ruleIntegerTerm | lv_maximum_2_3= ruleSignedConstant | lv_maximum_2_4= ruleConstantValue ) ) ) (otherlv_3= 'delta' ( ( (lv_delta_4_1= ruleRealTerm | lv_delta_4_2= ruleIntegerTerm | lv_delta_4_3= ruleSignedConstant | lv_delta_4_4= ruleConstantValue ) ) ) )?
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6117:2: ( ( (lv_minimum_0_1= ruleRealTerm | lv_minimum_0_2= ruleIntegerTerm | lv_minimum_0_3= ruleSignedConstant | lv_minimum_0_4= ruleConstantValue ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6118:1: ( (lv_minimum_0_1= ruleRealTerm | lv_minimum_0_2= ruleIntegerTerm | lv_minimum_0_3= ruleSignedConstant | lv_minimum_0_4= ruleConstantValue ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6118:1: ( (lv_minimum_0_1= ruleRealTerm | lv_minimum_0_2= ruleIntegerTerm | lv_minimum_0_3= ruleSignedConstant | lv_minimum_0_4= ruleConstantValue ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6119:1: (lv_minimum_0_1= ruleRealTerm | lv_minimum_0_2= ruleIntegerTerm | lv_minimum_0_3= ruleSignedConstant | lv_minimum_0_4= ruleConstantValue )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6119:1: (lv_minimum_0_1= ruleRealTerm | lv_minimum_0_2= ruleIntegerTerm | lv_minimum_0_3= ruleSignedConstant | lv_minimum_0_4= ruleConstantValue )
            int alt81=4;
            switch ( input.LA(1) ) {
            case 78:
                {
                int LA81_1 = input.LA(2);

                if ( (LA81_1==RULE_ID) ) {
                    alt81=3;
                }
                else if ( (LA81_1==RULE_INT) ) {
                    int LA81_3 = input.LA(3);

                    if ( (LA81_3==RULE_ID||LA81_3==80) ) {
                        alt81=2;
                    }
                    else if ( (LA81_3==66) ) {
                        alt81=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 1, input);

                    throw nvae;
                }
                }
                break;
            case 79:
                {
                int LA81_2 = input.LA(2);

                if ( (LA81_2==RULE_ID) ) {
                    alt81=3;
                }
                else if ( (LA81_2==RULE_INT) ) {
                    int LA81_3 = input.LA(3);

                    if ( (LA81_3==RULE_ID||LA81_3==80) ) {
                        alt81=2;
                    }
                    else if ( (LA81_3==66) ) {
                        alt81=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA81_3 = input.LA(2);

                if ( (LA81_3==RULE_ID||LA81_3==80) ) {
                    alt81=2;
                }
                else if ( (LA81_3==66) ) {
                    alt81=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt81=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6120:3: lv_minimum_0_1= ruleRealTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMinimumRealTermParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRealTerm_in_ruleNumericRangeTerm13788);
                    lv_minimum_0_1=ruleRealTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
                      	        }
                             		set(
                             			current, 
                             			"minimum",
                              		lv_minimum_0_1, 
                              		"RealTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6135:8: lv_minimum_0_2= ruleIntegerTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMinimumIntegerTermParserRuleCall_0_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIntegerTerm_in_ruleNumericRangeTerm13807);
                    lv_minimum_0_2=ruleIntegerTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
                      	        }
                             		set(
                             			current, 
                             			"minimum",
                              		lv_minimum_0_2, 
                              		"IntegerTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6150:8: lv_minimum_0_3= ruleSignedConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMinimumSignedConstantParserRuleCall_0_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedConstant_in_ruleNumericRangeTerm13826);
                    lv_minimum_0_3=ruleSignedConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
                      	        }
                             		set(
                             			current, 
                             			"minimum",
                              		lv_minimum_0_3, 
                              		"SignedConstant");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6165:8: lv_minimum_0_4= ruleConstantValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMinimumConstantValueParserRuleCall_0_0_3()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstantValue_in_ruleNumericRangeTerm13845);
                    lv_minimum_0_4=ruleConstantValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
                      	        }
                             		set(
                             			current, 
                             			"minimum",
                              		lv_minimum_0_4, 
                              		"ConstantValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleNumericRangeTerm13860); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1());
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6187:1: ( ( (lv_maximum_2_1= ruleRealTerm | lv_maximum_2_2= ruleIntegerTerm | lv_maximum_2_3= ruleSignedConstant | lv_maximum_2_4= ruleConstantValue ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6188:1: ( (lv_maximum_2_1= ruleRealTerm | lv_maximum_2_2= ruleIntegerTerm | lv_maximum_2_3= ruleSignedConstant | lv_maximum_2_4= ruleConstantValue ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6188:1: ( (lv_maximum_2_1= ruleRealTerm | lv_maximum_2_2= ruleIntegerTerm | lv_maximum_2_3= ruleSignedConstant | lv_maximum_2_4= ruleConstantValue ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6189:1: (lv_maximum_2_1= ruleRealTerm | lv_maximum_2_2= ruleIntegerTerm | lv_maximum_2_3= ruleSignedConstant | lv_maximum_2_4= ruleConstantValue )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6189:1: (lv_maximum_2_1= ruleRealTerm | lv_maximum_2_2= ruleIntegerTerm | lv_maximum_2_3= ruleSignedConstant | lv_maximum_2_4= ruleConstantValue )
            int alt82=4;
            switch ( input.LA(1) ) {
            case 78:
                {
                int LA82_1 = input.LA(2);

                if ( (LA82_1==RULE_INT) ) {
                    int LA82_3 = input.LA(3);

                    if ( (LA82_3==66) ) {
                        alt82=1;
                    }
                    else if ( (LA82_3==EOF||LA82_3==RULE_ID||(LA82_3>=15 && LA82_3<=16)||LA82_3==24||LA82_3==61||LA82_3==67||LA82_3==81) ) {
                        alt82=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA82_1==RULE_ID) ) {
                    alt82=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 1, input);

                    throw nvae;
                }
                }
                break;
            case 79:
                {
                int LA82_2 = input.LA(2);

                if ( (LA82_2==RULE_INT) ) {
                    int LA82_3 = input.LA(3);

                    if ( (LA82_3==66) ) {
                        alt82=1;
                    }
                    else if ( (LA82_3==EOF||LA82_3==RULE_ID||(LA82_3>=15 && LA82_3<=16)||LA82_3==24||LA82_3==61||LA82_3==67||LA82_3==81) ) {
                        alt82=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA82_2==RULE_ID) ) {
                    alt82=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA82_3 = input.LA(2);

                if ( (LA82_3==66) ) {
                    alt82=1;
                }
                else if ( (LA82_3==EOF||LA82_3==RULE_ID||(LA82_3>=15 && LA82_3<=16)||LA82_3==24||LA82_3==61||LA82_3==67||LA82_3==81) ) {
                    alt82=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt82=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6190:3: lv_maximum_2_1= ruleRealTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMaximumRealTermParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRealTerm_in_ruleNumericRangeTerm13883);
                    lv_maximum_2_1=ruleRealTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
                      	        }
                             		set(
                             			current, 
                             			"maximum",
                              		lv_maximum_2_1, 
                              		"RealTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6205:8: lv_maximum_2_2= ruleIntegerTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMaximumIntegerTermParserRuleCall_2_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIntegerTerm_in_ruleNumericRangeTerm13902);
                    lv_maximum_2_2=ruleIntegerTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
                      	        }
                             		set(
                             			current, 
                             			"maximum",
                              		lv_maximum_2_2, 
                              		"IntegerTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6220:8: lv_maximum_2_3= ruleSignedConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMaximumSignedConstantParserRuleCall_2_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignedConstant_in_ruleNumericRangeTerm13921);
                    lv_maximum_2_3=ruleSignedConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
                      	        }
                             		set(
                             			current, 
                             			"maximum",
                              		lv_maximum_2_3, 
                              		"SignedConstant");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6235:8: lv_maximum_2_4= ruleConstantValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMaximumConstantValueParserRuleCall_2_0_3()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConstantValue_in_ruleNumericRangeTerm13940);
                    lv_maximum_2_4=ruleConstantValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
                      	        }
                             		set(
                             			current, 
                             			"maximum",
                              		lv_maximum_2_4, 
                              		"ConstantValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6253:2: (otherlv_3= 'delta' ( ( (lv_delta_4_1= ruleRealTerm | lv_delta_4_2= ruleIntegerTerm | lv_delta_4_3= ruleSignedConstant | lv_delta_4_4= ruleConstantValue ) ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==81) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6253:4: otherlv_3= 'delta' ( ( (lv_delta_4_1= ruleRealTerm | lv_delta_4_2= ruleIntegerTerm | lv_delta_4_3= ruleSignedConstant | lv_delta_4_4= ruleConstantValue ) ) )
                    {
                    otherlv_3=(Token)match(input,81,FOLLOW_81_in_ruleNumericRangeTerm13956); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0());
                          
                    }
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6257:1: ( ( (lv_delta_4_1= ruleRealTerm | lv_delta_4_2= ruleIntegerTerm | lv_delta_4_3= ruleSignedConstant | lv_delta_4_4= ruleConstantValue ) ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6258:1: ( (lv_delta_4_1= ruleRealTerm | lv_delta_4_2= ruleIntegerTerm | lv_delta_4_3= ruleSignedConstant | lv_delta_4_4= ruleConstantValue ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6258:1: ( (lv_delta_4_1= ruleRealTerm | lv_delta_4_2= ruleIntegerTerm | lv_delta_4_3= ruleSignedConstant | lv_delta_4_4= ruleConstantValue ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6259:1: (lv_delta_4_1= ruleRealTerm | lv_delta_4_2= ruleIntegerTerm | lv_delta_4_3= ruleSignedConstant | lv_delta_4_4= ruleConstantValue )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6259:1: (lv_delta_4_1= ruleRealTerm | lv_delta_4_2= ruleIntegerTerm | lv_delta_4_3= ruleSignedConstant | lv_delta_4_4= ruleConstantValue )
                    int alt83=4;
                    switch ( input.LA(1) ) {
                    case 78:
                        {
                        int LA83_1 = input.LA(2);

                        if ( (LA83_1==RULE_INT) ) {
                            int LA83_3 = input.LA(3);

                            if ( (LA83_3==66) ) {
                                alt83=1;
                            }
                            else if ( (LA83_3==EOF||LA83_3==RULE_ID||(LA83_3>=15 && LA83_3<=16)||LA83_3==24||LA83_3==61||LA83_3==67) ) {
                                alt83=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 83, 3, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA83_1==RULE_ID) ) {
                            alt83=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 83, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 79:
                        {
                        int LA83_2 = input.LA(2);

                        if ( (LA83_2==RULE_ID) ) {
                            alt83=3;
                        }
                        else if ( (LA83_2==RULE_INT) ) {
                            int LA83_3 = input.LA(3);

                            if ( (LA83_3==66) ) {
                                alt83=1;
                            }
                            else if ( (LA83_3==EOF||LA83_3==RULE_ID||(LA83_3>=15 && LA83_3<=16)||LA83_3==24||LA83_3==61||LA83_3==67) ) {
                                alt83=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 83, 3, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 83, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_INT:
                        {
                        int LA83_3 = input.LA(2);

                        if ( (LA83_3==66) ) {
                            alt83=1;
                        }
                        else if ( (LA83_3==EOF||LA83_3==RULE_ID||(LA83_3>=15 && LA83_3<=16)||LA83_3==24||LA83_3==61||LA83_3==67) ) {
                            alt83=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 83, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        alt83=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 83, 0, input);

                        throw nvae;
                    }

                    switch (alt83) {
                        case 1 :
                            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6260:3: lv_delta_4_1= ruleRealTerm
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getDeltaRealTermParserRuleCall_3_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleRealTerm_in_ruleNumericRangeTerm13979);
                            lv_delta_4_1=ruleRealTerm();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"delta",
                                      		lv_delta_4_1, 
                                      		"RealTerm");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6275:8: lv_delta_4_2= ruleIntegerTerm
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getDeltaIntegerTermParserRuleCall_3_1_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleIntegerTerm_in_ruleNumericRangeTerm13998);
                            lv_delta_4_2=ruleIntegerTerm();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"delta",
                                      		lv_delta_4_2, 
                                      		"IntegerTerm");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6290:8: lv_delta_4_3= ruleSignedConstant
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getDeltaSignedConstantParserRuleCall_3_1_0_2()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSignedConstant_in_ruleNumericRangeTerm14017);
                            lv_delta_4_3=ruleSignedConstant();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"delta",
                                      		lv_delta_4_3, 
                                      		"SignedConstant");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6305:8: lv_delta_4_4= ruleConstantValue
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getDeltaConstantValueParserRuleCall_3_1_0_3()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleConstantValue_in_ruleNumericRangeTerm14036);
                            lv_delta_4_4=ruleConstantValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"delta",
                                      		lv_delta_4_4, 
                                      		"ConstantValue");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNumericRangeTerm"


    // $ANTLR start "entryRuleREAL"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6331:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6332:2: (iv_ruleREAL= ruleREAL EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6333:2: iv_ruleREAL= ruleREAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getREALRule()); 
            }
            pushFollow(FOLLOW_ruleREAL_in_entryRuleREAL14078);
            iv_ruleREAL=ruleREAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleREAL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleREAL14089); if (state.failed) return current;

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
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6340:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6343:28: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6344:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6344:1: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6344:6: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleREAL14129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
                  
            }
            kw=(Token)match(input,66,FOLLOW_66_in_ruleREAL14147); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1()); 
                  
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleREAL14162); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRulegINT"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6372:1: entryRulegINT returns [String current=null] : iv_rulegINT= rulegINT EOF ;
    public final String entryRulegINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulegINT = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6373:2: (iv_rulegINT= rulegINT EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6374:2: iv_rulegINT= rulegINT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGINTRule()); 
            }
            pushFollow(FOLLOW_rulegINT_in_entryRulegINT14208);
            iv_rulegINT=rulegINT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulegINT.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulegINT14219); if (state.failed) return current;

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
    // $ANTLR end "entryRulegINT"


    // $ANTLR start "rulegINT"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6381:1: rulegINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken rulegINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6384:28: (this_INT_0= RULE_INT )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6385:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulegINT14258); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getGINTAccess().getINTTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulegINT"


    // $ANTLR start "entryRuleQPREF"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6402:1: entryRuleQPREF returns [String current=null] : iv_ruleQPREF= ruleQPREF EOF ;
    public final String entryRuleQPREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQPREF = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6403:2: (iv_ruleQPREF= ruleQPREF EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6404:2: iv_ruleQPREF= ruleQPREF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQPREFRule()); 
            }
            pushFollow(FOLLOW_ruleQPREF_in_entryRuleQPREF14305);
            iv_ruleQPREF=ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQPREF.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQPREF14316); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQPREF"


    // $ANTLR start "ruleQPREF"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6411:1: ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQPREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6414:28: ( (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6415:1: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6415:1: (this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6415:6: this_ID_0= RULE_ID (kw= '::' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQPREF14356); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6422:1: (kw= '::' this_ID_2= RULE_ID )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==82) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6423:2: kw= '::' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleQPREF14375); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQPREFAccess().getColonColonKeyword_1_0()); 
                          
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQPREF14390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_2, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQPREF"


    // $ANTLR start "entryRuleQCREF"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6443:1: entryRuleQCREF returns [String current=null] : iv_ruleQCREF= ruleQCREF EOF ;
    public final String entryRuleQCREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCREF = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6444:2: (iv_ruleQCREF= ruleQCREF EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6445:2: iv_ruleQCREF= ruleQCREF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQCREFRule()); 
            }
            pushFollow(FOLLOW_ruleQCREF_in_entryRuleQCREF14438);
            iv_ruleQCREF=ruleQCREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQCREF.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQCREF14449); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQCREF"


    // $ANTLR start "ruleQCREF"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6452:1: ruleQCREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQCREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6455:28: ( ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6456:1: ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6456:1: ( (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6456:2: (this_ID_0= RULE_ID kw= '::' )* this_ID_2= RULE_ID (kw= '.' this_ID_4= RULE_ID )?
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6456:2: (this_ID_0= RULE_ID kw= '::' )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==RULE_ID) ) {
                    int LA86_1 = input.LA(2);

                    if ( (LA86_1==82) ) {
                        alt86=1;
                    }


                }


                switch (alt86) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6456:7: this_ID_0= RULE_ID kw= '::'
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQCREF14490); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0()); 
            	          
            	    }
            	    kw=(Token)match(input,82,FOLLOW_82_in_ruleQCREF14508); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQCREFAccess().getColonColonKeyword_0_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQCREF14525); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6476:1: (kw= '.' this_ID_4= RULE_ID )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==66) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6477:2: kw= '.' this_ID_4= RULE_ID
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleQCREF14544); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQCREFAccess().getFullStopKeyword_2_0()); 
                          
                    }
                    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQCREF14559); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_4, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_2_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQCREF"


    // $ANTLR start "entryRuleSTAR"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6499:1: entryRuleSTAR returns [String current=null] : iv_ruleSTAR= ruleSTAR EOF ;
    public final String entryRuleSTAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTAR = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6500:2: (iv_ruleSTAR= ruleSTAR EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6501:2: iv_ruleSTAR= ruleSTAR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSTARRule()); 
            }
            pushFollow(FOLLOW_ruleSTAR_in_entryRuleSTAR14609);
            iv_ruleSTAR=ruleSTAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSTAR.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTAR14620); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSTAR"


    // $ANTLR start "ruleSTAR"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6508:1: ruleSTAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken ruleSTAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6511:28: (kw= '*' )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:6513:2: kw= '*'
            {
            kw=(Token)match(input,83,FOLLOW_83_in_ruleSTAR14657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getSTARAccess().getAsteriskKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSTAR"

    // $ANTLR start synpred2_InternalProperties
    public final void synpred2_InternalProperties_fragment() throws RecognitionException {   
        EObject this_ContainedPropertyAssociation_1 = null;


        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:101:2: (this_ContainedPropertyAssociation_1= ruleContainedPropertyAssociation )
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:101:2: this_ContainedPropertyAssociation_1= ruleContainedPropertyAssociation
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleContainedPropertyAssociation_in_synpred2_InternalProperties171);
        this_ContainedPropertyAssociation_1=ruleContainedPropertyAssociation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalProperties

    // $ANTLR start synpred3_InternalProperties
    public final void synpred3_InternalProperties_fragment() throws RecognitionException {   
        EObject this_BasicPropertyAssociation_2 = null;


        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:114:2: (this_BasicPropertyAssociation_2= ruleBasicPropertyAssociation )
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:114:2: this_BasicPropertyAssociation_2= ruleBasicPropertyAssociation
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleBasicPropertyAssociation_in_synpred3_InternalProperties201);
        this_BasicPropertyAssociation_2=ruleBasicPropertyAssociation();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalProperties

    // $ANTLR start synpred101_InternalProperties
    public final void synpred101_InternalProperties_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_ownedValue_5_0 = null;

        EObject lv_ownedValue_7_0 = null;


        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3500:4: ( ( ( ( '(' )=>otherlv_4= '(' ) ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) (otherlv_6= ',' ( (lv_ownedValue_7_0= ruleModalPropertyValue ) ) )* otherlv_8= ')' ) )
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3500:4: ( ( ( '(' )=>otherlv_4= '(' ) ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) (otherlv_6= ',' ( (lv_ownedValue_7_0= ruleModalPropertyValue ) ) )* otherlv_8= ')' )
        {
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3500:4: ( ( ( '(' )=>otherlv_4= '(' ) ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) (otherlv_6= ',' ( (lv_ownedValue_7_0= ruleModalPropertyValue ) ) )* otherlv_8= ')' )
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3500:5: ( ( '(' )=>otherlv_4= '(' ) ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) (otherlv_6= ',' ( (lv_ownedValue_7_0= ruleModalPropertyValue ) ) )* otherlv_8= ')'
        {
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3500:5: ( ( '(' )=>otherlv_4= '(' )
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3500:6: ( '(' )=>otherlv_4= '('
        {
        otherlv_4=(Token)match(input,23,FOLLOW_23_in_synpred101_InternalProperties7756); if (state.failed) return ;

        }

        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3505:2: ( (lv_ownedValue_5_0= ruleModalPropertyValue ) )
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3506:1: (lv_ownedValue_5_0= ruleModalPropertyValue )
        {
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3506:1: (lv_ownedValue_5_0= ruleModalPropertyValue )
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3507:3: lv_ownedValue_5_0= ruleModalPropertyValue
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueModalPropertyValueParserRuleCall_3_0_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleModalPropertyValue_in_synpred101_InternalProperties7778);
        lv_ownedValue_5_0=ruleModalPropertyValue();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3523:2: (otherlv_6= ',' ( (lv_ownedValue_7_0= ruleModalPropertyValue ) ) )*
        loop97:
        do {
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==15) ) {
                alt97=1;
            }


            switch (alt97) {
        	case 1 :
        	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3523:4: otherlv_6= ',' ( (lv_ownedValue_7_0= ruleModalPropertyValue ) )
        	    {
        	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_synpred101_InternalProperties7791); if (state.failed) return ;
        	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3527:1: ( (lv_ownedValue_7_0= ruleModalPropertyValue ) )
        	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3528:1: (lv_ownedValue_7_0= ruleModalPropertyValue )
        	    {
        	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3528:1: (lv_ownedValue_7_0= ruleModalPropertyValue )
        	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3529:3: lv_ownedValue_7_0= ruleModalPropertyValue
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueModalPropertyValueParserRuleCall_3_0_2_1_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleModalPropertyValue_in_synpred101_InternalProperties7812);
        	    lv_ownedValue_7_0=ruleModalPropertyValue();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop97;
            }
        } while (true);

        otherlv_8=(Token)match(input,24,FOLLOW_24_in_synpred101_InternalProperties7826); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred101_InternalProperties

    // $ANTLR start synpred108_InternalProperties
    public final void synpred108_InternalProperties_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        EObject lv_ownedValue_5_0 = null;


        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3699:2: ( ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' ) )
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3699:2: ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' )
        {
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3699:2: ( (lv_ownedValue_5_0= ruleModalPropertyValue ) )
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3700:1: (lv_ownedValue_5_0= ruleModalPropertyValue )
        {
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3700:1: (lv_ownedValue_5_0= ruleModalPropertyValue )
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3701:3: lv_ownedValue_5_0= ruleModalPropertyValue
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPropertyAssociationAccess().getOwnedValueModalPropertyValueParserRuleCall_3_0_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleModalPropertyValue_in_synpred108_InternalProperties8177);
        lv_ownedValue_5_0=ruleModalPropertyValue();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3717:2: ( ( ',' )=>otherlv_6= ',' )
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3717:3: ( ',' )=>otherlv_6= ','
        {
        otherlv_6=(Token)match(input,15,FOLLOW_15_in_synpred108_InternalProperties8197); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred108_InternalProperties

    // $ANTLR start synpred109_InternalProperties
    public final void synpred109_InternalProperties_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_ownedValue_5_0 = null;

        EObject lv_ownedValue_7_0 = null;


        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3695:4: ( (otherlv_4= '(' ( ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' ) )* ( (lv_ownedValue_7_0= ruleOptionalModalPropertyValue ) ) otherlv_8= ')' ) )
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3695:4: (otherlv_4= '(' ( ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' ) )* ( (lv_ownedValue_7_0= ruleOptionalModalPropertyValue ) ) otherlv_8= ')' )
        {
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3695:4: (otherlv_4= '(' ( ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' ) )* ( (lv_ownedValue_7_0= ruleOptionalModalPropertyValue ) ) otherlv_8= ')' )
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3695:6: otherlv_4= '(' ( ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' ) )* ( (lv_ownedValue_7_0= ruleOptionalModalPropertyValue ) ) otherlv_8= ')'
        {
        otherlv_4=(Token)match(input,23,FOLLOW_23_in_synpred109_InternalProperties8155); if (state.failed) return ;
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3699:1: ( ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' ) )*
        loop99:
        do {
            int alt99=2;
            alt99 = dfa99.predict(input);
            switch (alt99) {
        	case 1 :
        	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3699:2: ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' )
        	    {
        	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3699:2: ( (lv_ownedValue_5_0= ruleModalPropertyValue ) )
        	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3700:1: (lv_ownedValue_5_0= ruleModalPropertyValue )
        	    {
        	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3700:1: (lv_ownedValue_5_0= ruleModalPropertyValue )
        	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3701:3: lv_ownedValue_5_0= ruleModalPropertyValue
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getPropertyAssociationAccess().getOwnedValueModalPropertyValueParserRuleCall_3_0_1_0_0()); 
        	      	    
        	    }
        	    pushFollow(FOLLOW_ruleModalPropertyValue_in_synpred109_InternalProperties8177);
        	    lv_ownedValue_5_0=ruleModalPropertyValue();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }

        	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3717:2: ( ( ',' )=>otherlv_6= ',' )
        	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3717:3: ( ',' )=>otherlv_6= ','
        	    {
        	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_synpred109_InternalProperties8197); if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop99;
            }
        } while (true);

        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3722:4: ( (lv_ownedValue_7_0= ruleOptionalModalPropertyValue ) )
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3723:1: (lv_ownedValue_7_0= ruleOptionalModalPropertyValue )
        {
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3723:1: (lv_ownedValue_7_0= ruleOptionalModalPropertyValue )
        // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalProperties.g:3724:3: lv_ownedValue_7_0= ruleOptionalModalPropertyValue
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleOptionalModalPropertyValue_in_synpred109_InternalProperties8221);
        lv_ownedValue_7_0=ruleOptionalModalPropertyValue();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_8=(Token)match(input,24,FOLLOW_24_in_synpred109_InternalProperties8233); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred109_InternalProperties

    // Delegated rules

    public final boolean synpred3_InternalProperties() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalProperties_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred109_InternalProperties() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred109_InternalProperties_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred108_InternalProperties() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_InternalProperties_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalProperties() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalProperties_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred101_InternalProperties() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_InternalProperties_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA99 dfa99 = new DFA99(this);
    static final String DFA5_eotS =
        "\16\uffff";
    static final String DFA5_eofS =
        "\16\uffff";
    static final String DFA5_minS =
        "\1\4\1\22\1\23\1\24\12\uffff";
    static final String DFA5_maxS =
        "\1\4\1\22\1\23\1\73\12\uffff";
    static final String DFA5_acceptS =
        "\4\uffff\1\6\1\11\1\4\1\12\1\10\1\2\1\7\1\1\1\5\1\3";
    static final String DFA5_specialS =
        "\16\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\13\1\11\1\15\2\uffff\1\6\1\uffff\1\14\1\4\1\12\1\uffff"+
            "\1\10\32\uffff\1\5\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "323:2: (this_BooleanType_0= ruleBooleanType | this_StringType_1= ruleStringType | this_EnumerationType_2= ruleEnumerationType | this_UnitsType_3= ruleUnitsType | this_RealType_4= ruleRealType | this_IntegerType_5= ruleIntegerType | this_RangeType_6= ruleRangeType | this_ClassifierType_7= ruleClassifierType | this_ReferenceType_8= ruleReferenceType | this_RecordType_9= ruleRecordType )";
        }
    }
    static final String DFA49_eotS =
        "\17\uffff";
    static final String DFA49_eofS =
        "\17\uffff";
    static final String DFA49_minS =
        "\1\4\1\0\15\uffff";
    static final String DFA49_maxS =
        "\1\117\1\0\15\uffff";
    static final String DFA49_acceptS =
        "\2\uffff\1\2\13\uffff\1\1";
    static final String DFA49_specialS =
        "\1\uffff\1\0\15\uffff}>";
    static final String[] DFA49_transitionS = {
            "\3\2\20\uffff\1\1\7\uffff\1\2\32\uffff\1\2\12\uffff\1\2\1\uffff"+
            "\3\2\3\uffff\3\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "3500:3: ( ( ( ( '(' )=>otherlv_4= '(' ) ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) (otherlv_6= ',' ( (lv_ownedValue_7_0= ruleModalPropertyValue ) ) )* otherlv_8= ')' ) | ( (lv_ownedValue_9_0= rulePropertyValue ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_1 = input.LA(1);

                         
                        int index49_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index49_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA55_eotS =
        "\17\uffff";
    static final String DFA55_eofS =
        "\17\uffff";
    static final String DFA55_minS =
        "\1\4\1\0\15\uffff";
    static final String DFA55_maxS =
        "\1\117\1\0\15\uffff";
    static final String DFA55_acceptS =
        "\2\uffff\1\2\13\uffff\1\1";
    static final String DFA55_specialS =
        "\1\uffff\1\0\15\uffff}>";
    static final String[] DFA55_transitionS = {
            "\3\2\20\uffff\1\1\7\uffff\1\2\32\uffff\1\2\12\uffff\1\2\1\uffff"+
            "\3\2\3\uffff\3\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "3695:3: ( (otherlv_4= '(' ( ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' ) )* ( (lv_ownedValue_7_0= ruleOptionalModalPropertyValue ) ) otherlv_8= ')' ) | ( (lv_ownedValue_9_0= rulePropertyValue ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_1 = input.LA(1);

                         
                        int index55_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index55_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA54_eotS =
        "\20\uffff";
    static final String DFA54_eofS =
        "\20\uffff";
    static final String DFA54_minS =
        "\1\4\15\0\2\uffff";
    static final String DFA54_maxS =
        "\1\117\15\0\2\uffff";
    static final String DFA54_acceptS =
        "\16\uffff\1\1\1\2";
    static final String DFA54_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\2\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\5\1\10\1\4\20\uffff\1\1\7\uffff\1\11\32\uffff\1\6\12\uffff"+
            "\1\15\1\uffff\1\12\1\13\1\7\3\uffff\1\14\1\2\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "()* loopback of 3699:1: ( ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_1 = input.LA(1);

                         
                        int index54_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index54_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_2 = input.LA(1);

                         
                        int index54_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index54_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA54_3 = input.LA(1);

                         
                        int index54_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index54_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA54_4 = input.LA(1);

                         
                        int index54_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index54_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA54_5 = input.LA(1);

                         
                        int index54_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index54_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA54_6 = input.LA(1);

                         
                        int index54_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index54_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA54_7 = input.LA(1);

                         
                        int index54_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index54_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA54_8 = input.LA(1);

                         
                        int index54_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index54_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA54_9 = input.LA(1);

                         
                        int index54_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index54_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA54_10 = input.LA(1);

                         
                        int index54_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index54_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA54_11 = input.LA(1);

                         
                        int index54_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index54_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA54_12 = input.LA(1);

                         
                        int index54_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index54_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA54_13 = input.LA(1);

                         
                        int index54_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index54_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\30\uffff";
    static final String DFA60_eofS =
        "\4\uffff\1\17\1\22\10\uffff\1\17\5\uffff\1\27\1\22\1\27\1\uffff";
    static final String DFA60_minS =
        "\5\4\1\17\5\uffff\1\17\2\uffff\1\17\1\uffff\1\6\1\4\2\uffff\1\4"+
        "\2\17\1\uffff";
    static final String DFA60_maxS =
        "\2\117\2\6\1\120\1\122\5\uffff\1\122\2\uffff\1\120\1\uffff\1\6"+
        "\1\4\2\uffff\3\120\1\uffff";
    static final String DFA60_acceptS =
        "\6\uffff\1\3\1\4\1\5\1\10\1\12\1\uffff\1\11\1\2\1\uffff\1\7\2\uffff"+
        "\1\13\1\1\3\uffff\1\6";
    static final String DFA60_specialS =
        "\30\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\5\1\10\1\4\20\uffff\1\1\7\uffff\1\11\32\uffff\1\6\12\uffff"+
            "\1\12\1\uffff\2\12\1\7\3\uffff\1\12\1\2\1\3",
            "\1\13\2\14\20\uffff\1\14\7\uffff\1\14\32\uffff\1\14\12\uffff"+
            "\1\14\1\uffff\3\14\3\uffff\3\14",
            "\1\15\1\uffff\1\4",
            "\1\15\1\uffff\1\4",
            "\1\16\12\uffff\2\17\7\uffff\1\17\44\uffff\1\17\4\uffff\1\20"+
            "\1\17\14\uffff\1\15",
            "\2\22\7\uffff\1\22\44\uffff\1\22\5\uffff\1\22\14\uffff\1\15"+
            "\1\uffff\1\21",
            "",
            "",
            "",
            "",
            "",
            "\1\14\10\uffff\1\14\1\uffff\1\23\65\uffff\1\14\1\uffff\1\14",
            "",
            "",
            "\2\17\7\uffff\1\17\44\uffff\1\17\5\uffff\1\17\14\uffff\1\15",
            "",
            "\1\24",
            "\1\25",
            "",
            "",
            "\1\26\12\uffff\2\27\7\uffff\1\27\44\uffff\1\27\5\uffff\1\27"+
            "\14\uffff\1\15",
            "\2\22\7\uffff\1\22\44\uffff\1\22\5\uffff\1\22\14\uffff\1\15",
            "\2\27\7\uffff\1\27\44\uffff\1\27\5\uffff\1\27\14\uffff\1\15",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "4080:1: (this_RecordTerm_0= ruleRecordTerm | this_NumericRangeTerm_1= ruleNumericRangeTerm | this_ReferenceTerm_2= ruleReferenceTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_RealTerm_5= ruleRealTerm | this_IntegerTerm_6= ruleIntegerTerm | this_ComponentClassifierTerm_7= ruleComponentClassifierTerm | this_ListTerm_8= ruleListTerm | this_BooleanTerm_9= ruleBooleanTerm | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )";
        }
    }
    static final String DFA61_eotS =
        "\27\uffff";
    static final String DFA61_eofS =
        "\4\uffff\1\17\1\21\10\uffff\1\17\4\uffff\1\26\1\21\1\26\1\uffff";
    static final String DFA61_minS =
        "\5\4\1\20\5\uffff\1\17\1\uffff\1\6\1\20\1\uffff\1\4\2\uffff\1\4"+
        "\2\20\1\uffff";
    static final String DFA61_maxS =
        "\2\117\2\6\1\120\1\122\5\uffff\1\122\1\uffff\1\6\1\120\1\uffff"+
        "\1\4\2\uffff\3\120\1\uffff";
    static final String DFA61_acceptS =
        "\6\uffff\1\3\1\4\1\7\1\11\1\10\1\uffff\1\2\2\uffff\1\6\1\uffff"+
        "\1\12\1\1\3\uffff\1\5";
    static final String DFA61_specialS =
        "\27\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\5\1\7\1\4\20\uffff\1\1\7\uffff\1\10\45\uffff\1\11\1\uffff"+
            "\2\11\1\6\3\uffff\1\11\1\2\1\3",
            "\1\13\2\12\20\uffff\1\12\7\uffff\1\12\32\uffff\1\12\12\uffff"+
            "\1\12\1\uffff\3\12\3\uffff\3\12",
            "\1\14\1\uffff\1\4",
            "\1\14\1\uffff\1\4",
            "\1\16\13\uffff\1\17\61\uffff\1\15\15\uffff\1\14",
            "\1\21\77\uffff\1\14\1\uffff\1\20",
            "",
            "",
            "",
            "",
            "",
            "\1\12\10\uffff\1\12\1\uffff\1\22\65\uffff\1\12\1\uffff\1\12",
            "",
            "\1\23",
            "\1\17\77\uffff\1\14",
            "",
            "\1\24",
            "",
            "",
            "\1\25\13\uffff\1\26\77\uffff\1\14",
            "\1\21\77\uffff\1\14",
            "\1\26\77\uffff\1\14",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "4243:1: (this_RecordTerm_0= ruleRecordTerm | this_NumericRangeTerm_1= ruleNumericRangeTerm | this_ComputedTerm_2= ruleComputedTerm | this_StringTerm_3= ruleStringTerm | this_RealTerm_4= ruleRealTerm | this_IntegerTerm_5= ruleIntegerTerm | this_ComponentClassifierTerm_6= ruleComponentClassifierTerm | this_ListTerm_7= ruleListTerm | this_BooleanTerm_8= ruleBooleanTerm | this_LiteralorReferenceTerm_9= ruleLiteralorReferenceTerm )";
        }
    }
    static final String DFA99_eotS =
        "\20\uffff";
    static final String DFA99_eofS =
        "\20\uffff";
    static final String DFA99_minS =
        "\1\4\15\0\2\uffff";
    static final String DFA99_maxS =
        "\1\117\15\0\2\uffff";
    static final String DFA99_acceptS =
        "\16\uffff\1\1\1\2";
    static final String DFA99_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\2\uffff}>";
    static final String[] DFA99_transitionS = {
            "\1\5\1\10\1\4\20\uffff\1\1\7\uffff\1\11\32\uffff\1\6\12\uffff"+
            "\1\15\1\uffff\1\12\1\13\1\7\3\uffff\1\14\1\2\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA99_eot = DFA.unpackEncodedString(DFA99_eotS);
    static final short[] DFA99_eof = DFA.unpackEncodedString(DFA99_eofS);
    static final char[] DFA99_min = DFA.unpackEncodedStringToUnsignedChars(DFA99_minS);
    static final char[] DFA99_max = DFA.unpackEncodedStringToUnsignedChars(DFA99_maxS);
    static final short[] DFA99_accept = DFA.unpackEncodedString(DFA99_acceptS);
    static final short[] DFA99_special = DFA.unpackEncodedString(DFA99_specialS);
    static final short[][] DFA99_transition;

    static {
        int numStates = DFA99_transitionS.length;
        DFA99_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA99_transition[i] = DFA.unpackEncodedString(DFA99_transitionS[i]);
        }
    }

    class DFA99 extends DFA {

        public DFA99(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 99;
            this.eot = DFA99_eot;
            this.eof = DFA99_eof;
            this.min = DFA99_min;
            this.max = DFA99_max;
            this.accept = DFA99_accept;
            this.special = DFA99_special;
            this.transition = DFA99_transition;
        }
        public String getDescription() {
            return "()* loopback of 3699:1: ( ( (lv_ownedValue_5_0= ruleModalPropertyValue ) ) ( ( ',' )=>otherlv_6= ',' ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA99_1 = input.LA(1);

                         
                        int index99_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index99_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA99_2 = input.LA(1);

                         
                        int index99_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index99_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA99_3 = input.LA(1);

                         
                        int index99_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index99_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA99_4 = input.LA(1);

                         
                        int index99_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index99_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA99_5 = input.LA(1);

                         
                        int index99_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index99_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA99_6 = input.LA(1);

                         
                        int index99_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index99_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA99_7 = input.LA(1);

                         
                        int index99_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index99_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA99_8 = input.LA(1);

                         
                        int index99_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index99_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA99_9 = input.LA(1);

                         
                        int index99_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index99_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA99_10 = input.LA(1);

                         
                        int index99_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index99_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA99_11 = input.LA(1);

                         
                        int index99_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index99_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA99_12 = input.LA(1);

                         
                        int index99_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index99_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA99_13 = input.LA(1);

                         
                        int index99_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalProperties()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index99_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 99, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_rulePModel_in_entryRulePModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertySet_in_rulePModel141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainedPropertyAssociation_in_rulePModel171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicPropertyAssociation_in_rulePModel201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssociation_in_rulePModel231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertySet_in_entryRulePropertySet266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertySet276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePropertySet313 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePropertySet325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertySet342 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePropertySet359 = new BitSet(new long[]{0x0000000000024010L});
    public static final BitSet FOLLOW_14_in_rulePropertySet380 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertySet405 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_rulePropertySet418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertySet442 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_rulePropertySet456 = new BitSet(new long[]{0x0000000000024010L});
    public static final BitSet FOLLOW_rulePropertyType_in_rulePropertySet480 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_rulePropertySet507 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rulePropertyConstant_in_rulePropertySet534 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_rulePropertySet548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertySet559 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePropertySet570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyType_in_entryRulePropertyType606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyType616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rulePropertyType667 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleStringType_in_rulePropertyType697 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleEnumerationType_in_rulePropertyType727 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleUnitsType_in_rulePropertyType757 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleRealType_in_rulePropertyType787 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleIntegerType_in_rulePropertyType817 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleRangeType_in_rulePropertyType847 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleClassifierType_in_rulePropertyType877 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleReferenceType_in_rulePropertyType907 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleRecordType_in_rulePropertyType937 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePropertyType949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedPropertyType_in_entryRuleUnnamedPropertyType985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnnamedPropertyType995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListType_in_ruleUnnamedPropertyType1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedBooleanType_in_ruleUnnamedPropertyType1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedStringType_in_ruleUnnamedPropertyType1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedEnumerationType_in_ruleUnnamedPropertyType1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedUnitsType_in_ruleUnnamedPropertyType1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedRealType_in_ruleUnnamedPropertyType1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedIntegerType_in_ruleUnnamedPropertyType1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedRangeType_in_ruleUnnamedPropertyType1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedClassifierType_in_ruleUnnamedPropertyType1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedReferenceType_in_ruleUnnamedPropertyType1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedRecordType_in_ruleUnnamedPropertyType1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBooleanType1432 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBooleanType1449 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBooleanType1461 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBooleanType1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedBooleanType_in_entryRuleUnnamedBooleanType1509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnnamedBooleanType1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleUnnamedBooleanType1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType1604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringType1656 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStringType1673 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStringType1685 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStringType1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedStringType_in_entryRuleUnnamedStringType1733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnnamedStringType1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleUnnamedStringType1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationType_in_entryRuleEnumerationType1828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationType1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationType1880 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEnumerationType1897 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEnumerationType1909 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEnumerationType1921 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEnumerationType1933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumerationType1954 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_15_in_ruleEnumerationType1967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleEnumerationType1988 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_ruleEnumerationType2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedEnumerationType_in_entryRuleUnnamedEnumerationType2038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnnamedEnumerationType2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleUnnamedEnumerationType2085 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleUnnamedEnumerationType2097 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleUnnamedEnumerationType2118 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_15_in_ruleUnnamedEnumerationType2131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_ruleUnnamedEnumerationType2152 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_ruleUnnamedEnumerationType2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteral_in_entryRuleEnumerationLiteral2202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteral2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteral2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitsType_in_entryRuleUnitsType2293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnitsType2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnitsType2345 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleUnitsType2362 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUnitsType2374 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleUnitsType2386 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleUnitsType2398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUnitLiteral_in_ruleUnitsType2419 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_15_in_ruleUnitsType2432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUnitLiteralConversion_in_ruleUnitsType2453 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_ruleUnitsType2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedUnitsType_in_entryRuleUnnamedUnitsType2503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnnamedUnitsType2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleUnnamedUnitsType2550 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleUnnamedUnitsType2562 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUnitLiteral_in_ruleUnnamedUnitsType2583 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_15_in_ruleUnnamedUnitsType2596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUnitLiteralConversion_in_ruleUnnamedUnitsType2617 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_ruleUnnamedUnitsType2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitLiteral_in_entryRuleUnitLiteral2667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnitLiteral2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnitLiteral2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitLiteralConversion_in_entryRuleUnitLiteralConversion2758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnitLiteralConversion2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnitLiteralConversion2810 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleUnitLiteralConversion2827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnitLiteralConversion2851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleSTAR_in_ruleUnitLiteralConversion2870 = new BitSet(new long[]{0x0000000000000040L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleNumberValue_in_ruleUnitLiteralConversion2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealType_in_entryRuleRealType2926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealType2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRealType2978 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRealType2995 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRealType3007 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRealType3019 = new BitSet(new long[]{0x0000000002000052L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleRealRange_in_ruleRealType3040 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleUnnamedUnitsType_in_ruleRealType3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRealType3082 = new BitSet(new long[]{0x0000000000000050L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleQPREF_in_ruleRealType3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedRealType_in_entryRuleUnnamedRealType3148 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnnamedRealType3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleUnnamedRealType3207 = new BitSet(new long[]{0x0000000002000052L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleRealRange_in_ruleUnnamedRealType3228 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleUnnamedUnitsType_in_ruleUnnamedRealType3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleUnnamedRealType3270 = new BitSet(new long[]{0x0000000000000050L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleQPREF_in_ruleUnnamedRealType3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_entryRuleIntegerType3336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerType3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerType3388 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIntegerType3405 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIntegerType3417 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleIntegerType3429 = new BitSet(new long[]{0x0000000002000052L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleIntegerRange_in_ruleIntegerType3450 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleUnnamedUnitsType_in_ruleIntegerType3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleIntegerType3492 = new BitSet(new long[]{0x0000000000000050L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleQPREF_in_ruleIntegerType3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedIntegerType_in_entryRuleUnnamedIntegerType3558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnnamedIntegerType3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleUnnamedIntegerType3617 = new BitSet(new long[]{0x0000000002000052L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleIntegerRange_in_ruleUnnamedIntegerType3638 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleUnnamedUnitsType_in_ruleUnnamedIntegerType3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleUnnamedIntegerType3680 = new BitSet(new long[]{0x0000000000000050L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleQPREF_in_ruleUnnamedIntegerType3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeType_in_entryRuleRangeType3746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeType3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRangeType3798 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRangeType3815 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRangeType3827 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRangeType3839 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleRangeType3851 = new BitSet(new long[]{0x0000000018000050L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleUnnamedIntegerType_in_ruleRangeType3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedRealType_in_ruleRangeType3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQPREF_in_ruleRangeType3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedRangeType_in_entryRuleUnnamedRangeType3967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnnamedRangeType3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleUnnamedRangeType4026 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleUnnamedRangeType4038 = new BitSet(new long[]{0x0000000018000050L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleUnnamedIntegerType_in_ruleUnnamedRangeType4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedRealType_in_ruleUnnamedRangeType4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQPREF_in_ruleUnnamedRangeType4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifierType_in_entryRuleClassifierType4154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifierType4164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassifierType4206 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleClassifierType4223 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleClassifierType4235 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleClassifierType4247 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleClassifierType4260 = new BitSet(new long[]{0x03FFFFFD800A0010L});
    public static final BitSet FOLLOW_ruleQCReference_in_ruleClassifierType4281 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_15_in_ruleClassifierType4294 = new BitSet(new long[]{0x03FFFFFD800A0010L});
    public static final BitSet FOLLOW_ruleQCReference_in_ruleClassifierType4315 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_ruleClassifierType4329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedClassifierType_in_entryRuleUnnamedClassifierType4367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnnamedClassifierType4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleUnnamedClassifierType4426 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleUnnamedClassifierType4439 = new BitSet(new long[]{0x03FFFFFD800A0010L});
    public static final BitSet FOLLOW_ruleQCReference_in_ruleUnnamedClassifierType4460 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_15_in_ruleUnnamedClassifierType4473 = new BitSet(new long[]{0x03FFFFFD800A0010L});
    public static final BitSet FOLLOW_ruleQCReference_in_ruleUnnamedClassifierType4494 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_ruleUnnamedClassifierType4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQCReference_in_entryRuleQCReference4546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQCReference4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleQCReference4594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQCReference4611 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleQCReference4628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleSTAR_in_ruleQCReference4647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleSTAR_in_ruleQCReference4665 = new BitSet(new long[]{0x03FFFFFC800A0010L});
    public static final BitSet FOLLOW_ruleCoreKeyWord_in_ruleQCReference4689 = new BitSet(new long[]{0x03FFFFFC800A0012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQCReference4704 = new BitSet(new long[]{0x03FFFFFC800A0012L});
    public static final BitSet FOLLOW_ruleCoreKeyWord_in_entryRuleCoreKeyWord4750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoreKeyWord4761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCoreKeyWord4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCoreKeyWord4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCoreKeyWord4837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleCoreKeyWord4856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCoreKeyWord4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleCoreKeyWord4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCoreKeyWord4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCoreKeyWord4932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCoreKeyWord4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCoreKeyWord4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCoreKeyWord4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCoreKeyWord5008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleCoreKeyWord5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleCoreKeyWord5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleCoreKeyWord5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleCoreKeyWord5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCoreKeyWord5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleCoreKeyWord5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleCoreKeyWord5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCoreKeyWord5160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleCoreKeyWord5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleCoreKeyWord5198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleCoreKeyWord5217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleCoreKeyWord5236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleCoreKeyWord5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleCoreKeyWord5274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCoreKeyWord5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceType_in_entryRuleReferenceType5333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceType5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceType5385 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleReferenceType5402 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleReferenceType5414 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleReferenceType5426 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleReferenceType5439 = new BitSet(new long[]{0x03FFFFFD800A0010L});
    public static final BitSet FOLLOW_ruleQCReference_in_ruleReferenceType5460 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_15_in_ruleReferenceType5473 = new BitSet(new long[]{0x03FFFFFD800A0010L});
    public static final BitSet FOLLOW_ruleQCReference_in_ruleReferenceType5494 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_ruleReferenceType5508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedReferenceType_in_entryRuleUnnamedReferenceType5546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnnamedReferenceType5556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleUnnamedReferenceType5593 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleUnnamedReferenceType5618 = new BitSet(new long[]{0x03FFFFFD800A0010L});
    public static final BitSet FOLLOW_ruleQCReference_in_ruleUnnamedReferenceType5639 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_15_in_ruleUnnamedReferenceType5652 = new BitSet(new long[]{0x03FFFFFD800A0010L});
    public static final BitSet FOLLOW_ruleQCReference_in_ruleUnnamedReferenceType5673 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_ruleUnnamedReferenceType5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordType_in_entryRuleRecordType5725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordType5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecordType5777 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRecordType5794 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRecordType5806 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleRecordType5818 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRecordType5830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRecordField_in_ruleRecordType5851 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleRecordType5864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedRecordType_in_entryRuleUnnamedRecordType5900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnnamedRecordType5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleUnnamedRecordType5947 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleUnnamedRecordType5959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRecordField_in_ruleUnnamedRecordType5980 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleUnnamedRecordType5993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordField_in_entryRuleRecordField6029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordField6039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecordField6081 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRecordField6098 = new BitSet(new long[]{0x8C000000BA700050L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleQPREF_in_ruleRecordField6126 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleUnnamedPropertyType_in_ruleRecordField6153 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRecordField6166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition6202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition6212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyDefinition6254 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePropertyDefinition6271 = new BitSet(new long[]{0x9C000000BA700050L,0x000000000000C000L});
    public static final BitSet FOLLOW_60_in_rulePropertyDefinition6289 = new BitSet(new long[]{0x8C000000BA700050L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleQPREF_in_rulePropertyDefinition6331 = new BitSet(new long[]{0x2000000004000000L});
    public static final BitSet FOLLOW_ruleUnnamedPropertyType_in_rulePropertyDefinition6358 = new BitSet(new long[]{0x2000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePropertyDefinition6372 = new BitSet(new long[]{0x0400000080800070L,0x000000000000E3A0L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_rulePropertyDefinition6393 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_rulePropertyDefinition6407 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_rulePropertyDefinition6419 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePropertyDefinition6431 = new BitSet(new long[]{0x43FFFFFD800A0010L});
    public static final BitSet FOLLOW_rulePropertyOwner_in_rulePropertyDefinition6454 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_15_in_rulePropertyDefinition6467 = new BitSet(new long[]{0x03FFFFFD800A0010L});
    public static final BitSet FOLLOW_rulePropertyOwner_in_rulePropertyDefinition6488 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_ruleAllReference_in_rulePropertyDefinition6518 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePropertyDefinition6531 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePropertyDefinition6543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllReference_in_entryRuleAllReference6579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllReference6589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleAllReference6631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListType_in_entryRuleListType6679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListType6689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleListType6726 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleListType6738 = new BitSet(new long[]{0x8C000000BA700050L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleQPREF_in_ruleListType6766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnnamedPropertyType_in_ruleListType6793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyOwner_in_entryRulePropertyOwner6830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyOwner6840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQCReference_in_rulePropertyOwner6889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyConstant_in_entryRulePropertyConstant6923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyConstant6933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyConstant6975 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePropertyConstant6992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_rulePropertyConstant7004 = new BitSet(new long[]{0x8C000000BA700050L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleQPREF_in_rulePropertyConstant7032 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleUnnamedPropertyType_in_rulePropertyConstant7059 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePropertyConstant7072 = new BitSet(new long[]{0x0400000080800070L,0x000000000000E3A0L});
    public static final BitSet FOLLOW_ruleConstantPropertyExpression_in_rulePropertyConstant7093 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePropertyConstant7105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_entryRuleNumberValue7141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValue7151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLit_in_ruleNumberValue7201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLit_in_ruleNumberValue7231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLit_in_entryRuleRealLit7266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLit7276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedReal_in_ruleRealLit7321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLit_in_entryRuleIntegerLit7356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLit7366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInt_in_ruleIntegerLit7411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicPropertyAssociation_in_entryRuleBasicPropertyAssociation7446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicPropertyAssociation7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQPREF_in_ruleBasicPropertyAssociation7508 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleBasicPropertyAssociation7520 = new BitSet(new long[]{0x0400000080800070L,0x000000000000E3A0L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleBasicPropertyAssociation7541 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBasicPropertyAssociation7553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainedPropertyAssociation_in_entryRuleContainedPropertyAssociation7589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainedPropertyAssociation7599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQPREF_in_ruleContainedPropertyAssociation7651 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleContainedPropertyAssociation7664 = new BitSet(new long[]{0x0400000080800070L,0x000000000000E3A1L});
    public static final BitSet FOLLOW_65_in_ruleContainedPropertyAssociation7688 = new BitSet(new long[]{0x0400000080800070L,0x000000000000E3A1L});
    public static final BitSet FOLLOW_64_in_ruleContainedPropertyAssociation7720 = new BitSet(new long[]{0x0400000080800070L,0x000000000000E3A0L});
    public static final BitSet FOLLOW_23_in_ruleContainedPropertyAssociation7756 = new BitSet(new long[]{0x0400000080800070L,0x000000000000E3A0L});
    public static final BitSet FOLLOW_ruleModalPropertyValue_in_ruleContainedPropertyAssociation7778 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_15_in_ruleContainedPropertyAssociation7791 = new BitSet(new long[]{0x0400000080800070L,0x000000000000E3A0L});
    public static final BitSet FOLLOW_ruleModalPropertyValue_in_ruleContainedPropertyAssociation7812 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_ruleContainedPropertyAssociation7826 = new BitSet(new long[]{0x2000000000010000L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleContainedPropertyAssociation7854 = new BitSet(new long[]{0x2000000000010000L});
    public static final BitSet FOLLOW_61_in_ruleContainedPropertyAssociation7876 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleContainedPropertyAssociation7889 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleContainmentPath_in_ruleContainedPropertyAssociation7910 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleContainedPropertyAssociation7923 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleContainmentPath_in_ruleContainedPropertyAssociation7944 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleContainedPropertyAssociation7960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssociation_in_entryRulePropertyAssociation7996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyAssociation8006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQPREF_in_rulePropertyAssociation8058 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePropertyAssociation8071 = new BitSet(new long[]{0x0400000080800070L,0x000000000000E3A1L});
    public static final BitSet FOLLOW_65_in_rulePropertyAssociation8095 = new BitSet(new long[]{0x0400000080800070L,0x000000000000E3A1L});
    public static final BitSet FOLLOW_64_in_rulePropertyAssociation8127 = new BitSet(new long[]{0x0400000080800070L,0x000000000000E3A0L});
    public static final BitSet FOLLOW_23_in_rulePropertyAssociation8155 = new BitSet(new long[]{0x0400000080800070L,0x000000000000E3A0L});
    public static final BitSet FOLLOW_ruleModalPropertyValue_in_rulePropertyAssociation8177 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePropertyAssociation8197 = new BitSet(new long[]{0x0400000080800070L,0x000000000000E3A0L});
    public static final BitSet FOLLOW_ruleOptionalModalPropertyValue_in_rulePropertyAssociation8221 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePropertyAssociation8233 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rulePropertyValue_in_rulePropertyAssociation8261 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePropertyAssociation8274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainmentPath_in_entryRuleContainmentPath8310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainmentPath8320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainmentPathElement_in_ruleContainmentPath8378 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleContainmentPath8391 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleContainmentPathElement_in_ruleContainmentPath8412 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleModalPropertyValue_in_entryRuleModalPropertyValue8450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModalPropertyValue8460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_ruleModalPropertyValue8506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleModalPropertyValue8526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleModalPropertyValue8539 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleModalPropertyValue8551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModalPropertyValue8575 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_15_in_ruleModalPropertyValue8588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModalPropertyValue8612 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_ruleModalPropertyValue8626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalModalPropertyValue_in_entryRuleOptionalModalPropertyValue8662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalModalPropertyValue8672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_ruleOptionalModalPropertyValue8718 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleOptionalModalPropertyValue8731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleOptionalModalPropertyValue8743 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOptionalModalPropertyValue8755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOptionalModalPropertyValue8779 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_15_in_ruleOptionalModalPropertyValue8792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOptionalModalPropertyValue8816 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_ruleOptionalModalPropertyValue8830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValue_in_entryRulePropertyValue8868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValue8878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_rulePropertyValue8923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_entryRulePropertyExpression8958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyExpression8968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_rulePropertyExpression9018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericRangeTerm_in_rulePropertyExpression9048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceTerm_in_rulePropertyExpression9078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComputedTerm_in_rulePropertyExpression9108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringTerm_in_rulePropertyExpression9138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealTerm_in_rulePropertyExpression9168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerTerm_in_rulePropertyExpression9198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentClassifierTerm_in_rulePropertyExpression9228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListTerm_in_rulePropertyExpression9258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanTerm_in_rulePropertyExpression9288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralorReferenceTerm_in_rulePropertyExpression9318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantPropertyExpression_in_entryRuleConstantPropertyExpression9353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantPropertyExpression9363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_ruleConstantPropertyExpression9413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericRangeTerm_in_ruleConstantPropertyExpression9443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComputedTerm_in_ruleConstantPropertyExpression9473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringTerm_in_ruleConstantPropertyExpression9503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealTerm_in_ruleConstantPropertyExpression9533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerTerm_in_ruleConstantPropertyExpression9563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentClassifierTerm_in_ruleConstantPropertyExpression9593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListTerm_in_ruleConstantPropertyExpression9623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanTerm_in_ruleConstantPropertyExpression9653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralorReferenceTerm_in_ruleConstantPropertyExpression9683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralorReferenceTerm_in_entryRuleLiteralorReferenceTerm9718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralorReferenceTerm9728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQPREF_in_ruleLiteralorReferenceTerm9779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanTerm_in_entryRuleBooleanTerm9814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanTerm9824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrTerm_in_ruleBooleanTerm9873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrTerm_in_entryRuleOrTerm9907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrTerm9917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndTerm_in_ruleOrTerm9967 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleOrOp_in_ruleOrTerm10000 = new BitSet(new long[]{0x0000000000000000L,0x00000000000021A0L});
    public static final BitSet FOLLOW_ruleAndTerm_in_ruleOrTerm10021 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAndTerm_in_entryRuleAndTerm10059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndTerm10069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAtom_in_ruleAndTerm10119 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleAndOp_in_ruleAndTerm10152 = new BitSet(new long[]{0x0000000000000000L,0x00000000000021A0L});
    public static final BitSet FOLLOW_ruleBooleanAtom_in_ruleAndTerm10173 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_ruleNotTerm_in_entryRuleNotTerm10211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotTerm10221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOp_in_ruleNotTerm10267 = new BitSet(new long[]{0x0000000000000000L,0x00000000000021A0L});
    public static final BitSet FOLLOW_ruleBooleanAtom_in_ruleNotTerm10288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanAtom_in_entryRuleBooleanAtom10324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanAtom10334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleBooleanAtom10384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotTerm_in_ruleBooleanAtom10414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleBooleanAtom10432 = new BitSet(new long[]{0x0000000000000000L,0x00000000000021A0L});
    public static final BitSet FOLLOW_ruleBooleanTerm_in_ruleBooleanAtom10457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleBooleanAtom10468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral10505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral10515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleBooleanLiteral10571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleBooleanLiteral10602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue10639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue10649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQPREF_in_ruleConstantValue10700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceTerm_in_entryRuleReferenceTerm10735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceTerm10745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleReferenceTerm10782 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleReferenceTerm10794 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleContainmentPathElement_in_ruleReferenceTerm10815 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleReferenceTerm10828 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleContainmentPathElement_in_ruleReferenceTerm10849 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_24_in_ruleReferenceTerm10863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_entryRuleRecordTerm10899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordTerm10909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleRecordTerm10946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFieldPropertyAssociation_in_ruleRecordTerm10967 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_ruleRecordTerm10980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComputedTerm_in_entryRuleComputedTerm11016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComputedTerm11026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleComputedTerm11063 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleComputedTerm11075 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComputedTerm11092 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleComputedTerm11109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponentClassifierTerm_in_entryRuleComponentClassifierTerm11145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponentClassifierTerm11155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleComponentClassifierTerm11192 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleComponentClassifierTerm11204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQCREF_in_ruleComponentClassifierTerm11231 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleComponentClassifierTerm11243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListTerm_in_entryRuleListTerm11279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListTerm11289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleListTerm11326 = new BitSet(new long[]{0x0400000080800070L,0x000000000000E3A0L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_ruleListTerm11347 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_15_in_ruleListTerm11360 = new BitSet(new long[]{0x0400000080800070L,0x000000000000E3A0L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_ruleListTerm11381 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_ruleListTerm11395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldPropertyAssociation_in_entryRuleFieldPropertyAssociation11431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldPropertyAssociation11441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldPropertyAssociation11490 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFieldPropertyAssociation11502 = new BitSet(new long[]{0x0400000080800070L,0x000000000000E3A0L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_ruleFieldPropertyAssociation11523 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFieldPropertyAssociation11535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainmentPathElement_in_entryRuleContainmentPathElement11571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainmentPathElement11581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContainmentPathElement11631 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleArrayRange_in_ruleContainmentPathElement11652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleContainmentPathElement11673 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleANNEXREF_in_ruleContainmentPathElement11700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANNEXREF_in_entryRuleANNEXREF11738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleANNEXREF11749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleANNEXREF11787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleSTAR_in_ruleANNEXREF11809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleSTAR_in_ruleANNEXREF11836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleANNEXREF11856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleSTAR_in_ruleANNEXREF11883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleSTAR_in_ruleANNEXREF11910 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleANNEXREF11928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOp_in_entryRuleAndOp11969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOp11980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleAndOp12017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOp_in_entryRuleOrOp12057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOp12068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleOrOp12105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOp_in_entryRuleNotOp12145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOp12156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleNotOp12193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusMinus_in_entryRulePlusMinus12233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusMinus12244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rulePlusMinus12282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rulePlusMinus12301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringTerm_in_entryRuleStringTerm12341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringTerm12351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoQuoteString_in_ruleStringTerm12396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoQuoteString_in_entryRuleNoQuoteString12432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoQuoteString12443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNoQuoteString12482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayRange_in_entryRuleArrayRange12526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayRange12536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleArrayRange12585 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rulegINT_in_ruleArrayRange12606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010040L});
    public static final BitSet FOLLOW_80_in_ruleArrayRange12619 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rulegINT_in_ruleArrayRange12640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleArrayRange12654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerRange_in_entryRuleIntegerRange12690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerRange12700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerTerm_in_ruleIntegerRange12748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSignedConstant_in_ruleIntegerRange12767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleIntegerRange12786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleIntegerRange12801 = new BitSet(new long[]{0x0000000000000050L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleIntegerTerm_in_ruleIntegerRange12824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedConstant_in_ruleIntegerRange12843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleIntegerRange12862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealRange_in_entryRuleRealRange12901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealRange12911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealTerm_in_ruleRealRange12959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSignedConstant_in_ruleRealRange12978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleRealRange12997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleRealRange13012 = new BitSet(new long[]{0x0000000000000050L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleRealTerm_in_ruleRealRange13035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedConstant_in_ruleRealRange13054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleRealRange13073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedConstant_in_entryRuleSignedConstant13112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedConstant13122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusMinus_in_ruleSignedConstant13168 = new BitSet(new long[]{0x0000000000000050L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleSignedConstant13189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerTerm_in_entryRuleIntegerTerm13225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerTerm13235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInt_in_ruleIntegerTerm13281 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerTerm13305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedInt_in_entryRuleSignedInt13343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedInt13354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleSignedInt13393 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_79_in_ruleSignedInt13412 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSignedInt13429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealTerm_in_entryRuleRealTerm13474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealTerm13484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedReal_in_ruleRealTerm13530 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRealTerm13554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedReal_in_entryRuleSignedReal13592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignedReal13603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleSignedReal13642 = new BitSet(new long[]{0x0000000000000040L,0x000000000000C000L});
    public static final BitSet FOLLOW_79_in_ruleSignedReal13661 = new BitSet(new long[]{0x0000000000000040L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleREAL_in_ruleSignedReal13685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericRangeTerm_in_entryRuleNumericRangeTerm13730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericRangeTerm13740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealTerm_in_ruleNumericRangeTerm13788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleIntegerTerm_in_ruleNumericRangeTerm13807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSignedConstant_in_ruleNumericRangeTerm13826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleNumericRangeTerm13845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleNumericRangeTerm13860 = new BitSet(new long[]{0x0000000000000050L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleRealTerm_in_ruleNumericRangeTerm13883 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleIntegerTerm_in_ruleNumericRangeTerm13902 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleSignedConstant_in_ruleNumericRangeTerm13921 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleNumericRangeTerm13940 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleNumericRangeTerm13956 = new BitSet(new long[]{0x0000000000000050L,0x000000000000C000L});
    public static final BitSet FOLLOW_ruleRealTerm_in_ruleNumericRangeTerm13979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerTerm_in_ruleNumericRangeTerm13998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignedConstant_in_ruleNumericRangeTerm14017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleNumericRangeTerm14036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleREAL_in_entryRuleREAL14078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleREAL14089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleREAL14129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleREAL14147 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleREAL14162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegINT_in_entryRulegINT14208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegINT14219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulegINT14258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQPREF_in_entryRuleQPREF14305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQPREF14316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQPREF14356 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleQPREF14375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQPREF14390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQCREF_in_entryRuleQCREF14438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQCREF14449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQCREF14490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleQCREF14508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQCREF14525 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleQCREF14544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQCREF14559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTAR_in_entryRuleSTAR14609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTAR14620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleSTAR14657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainedPropertyAssociation_in_synpred2_InternalProperties171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicPropertyAssociation_in_synpred3_InternalProperties201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred101_InternalProperties7756 = new BitSet(new long[]{0x0400000080800070L,0x000000000000E3A0L});
    public static final BitSet FOLLOW_ruleModalPropertyValue_in_synpred101_InternalProperties7778 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_15_in_synpred101_InternalProperties7791 = new BitSet(new long[]{0x0400000080800070L,0x000000000000E3A0L});
    public static final BitSet FOLLOW_ruleModalPropertyValue_in_synpred101_InternalProperties7812 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_24_in_synpred101_InternalProperties7826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModalPropertyValue_in_synpred108_InternalProperties8177 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_synpred108_InternalProperties8197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred109_InternalProperties8155 = new BitSet(new long[]{0x0400000080800070L,0x000000000000E3A0L});
    public static final BitSet FOLLOW_ruleModalPropertyValue_in_synpred109_InternalProperties8177 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_synpred109_InternalProperties8197 = new BitSet(new long[]{0x0400000080800070L,0x000000000000E3A0L});
    public static final BitSet FOLLOW_ruleOptionalModalPropertyValue_in_synpred109_InternalProperties8221 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_synpred109_InternalProperties8233 = new BitSet(new long[]{0x0000000000000002L});

}