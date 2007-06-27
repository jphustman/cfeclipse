// $ANTLR 3.0 ./CFScript.g 2007-06-27 18:21:16

package org.cfeclipse.cfml.core.parser.antlr;

/*
Copyright (c) 2007 Mark Mandel, Mark Drew

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.	
*/	


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class CFScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FUNCTION_CALL", "FUNCTION_DECLARATION", "STRUCT_KEY", "ELSEIF", "STRING_CFML", "STRING", "SEMI_COLON", "VAR", "EQUALS", "OPEN_PAREN", "CLOSE_PAREN", "RETURN", "OPERATOR", "NOT", "NUMBER", "HASH", "DOT", "DOUBLE_QUOTE", "ESCAPE_DOUBLE_QUOTE", "SINGLE_QUOTE", "ESCAPE_SINGLE_QUOTE", "IDENTIFIER", "OPEN_SQUARE", "CLOSE_SQUARE", "COMMA", "FUNCTION", "IF", "ELSE", "TRY", "CATCH", "FOR", "IN", "WHILE", "DO", "OPEN_CURLY", "CLOSE_CURLY", "SWITCH", "CASE", "COLON", "DEFAULT", "BREAK", "MATH_OPERATOR", "STRING_OPERATOR", "CONDITION_OPERATOR", "BOOLEAN_OPERATOR", "DIGIT", "LETTER", "UNDERSCORE", "WS", "COMMENT", "LINE_COMMENT"
    };
    public static final int FUNCTION=29;
    public static final int WHILE=36;
    public static final int LETTER=50;
    public static final int DOUBLE_QUOTE=21;
    public static final int CLOSE_CURLY=39;
    public static final int CASE=41;
    public static final int FOR=34;
    public static final int DO=37;
    public static final int CONDITION_OPERATOR=47;
    public static final int EQUALS=12;
    public static final int NOT=17;
    public static final int EOF=-1;
    public static final int BREAK=44;
    public static final int IF=30;
    public static final int SINGLE_QUOTE=23;
    public static final int IN=35;
    public static final int COMMA=28;
    public static final int IDENTIFIER=25;
    public static final int RETURN=15;
    public static final int OPEN_SQUARE=26;
    public static final int ESCAPE_DOUBLE_QUOTE=22;
    public static final int VAR=11;
    public static final int MATH_OPERATOR=45;
    public static final int CLOSE_PAREN=14;
    public static final int DIGIT=49;
    public static final int COMMENT=53;
    public static final int DOT=20;
    public static final int CLOSE_SQUARE=27;
    public static final int STRUCT_KEY=6;
    public static final int LINE_COMMENT=54;
    public static final int STRING_CFML=8;
    public static final int OPERATOR=16;
    public static final int SWITCH=40;
    public static final int ELSE=31;
    public static final int DEFAULT=43;
    public static final int NUMBER=18;
    public static final int HASH=19;
    public static final int OPEN_PAREN=13;
    public static final int UNDERSCORE=51;
    public static final int SEMI_COLON=10;
    public static final int OPEN_CURLY=38;
    public static final int TRY=32;
    public static final int ESCAPE_SINGLE_QUOTE=24;
    public static final int ELSEIF=7;
    public static final int COLON=42;
    public static final int WS=52;
    public static final int BOOLEAN_OPERATOR=48;
    public static final int FUNCTION_DECLARATION=5;
    public static final int CATCH=33;
    public static final int FUNCTION_CALL=4;
    public static final int STRING_OPERATOR=46;
    public static final int STRING=9;

        public CFScriptParser(TokenStream input) {
            super(input);
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "./CFScript.g"; }


    public static class script_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start script
    // ./CFScript.g:117:1: script : ( ( nonBlockStatement | ifStatement | tryStatement | forStatement | whileStatement | doWhileStatement | switchStatement | functionDeclaration ) )* ;
    public final script_return script() throws RecognitionException {
    traceIn("script", 1);
        script_return retval = new script_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        nonBlockStatement_return nonBlockStatement1 = null;

        ifStatement_return ifStatement2 = null;

        tryStatement_return tryStatement3 = null;

        forStatement_return forStatement4 = null;

        whileStatement_return whileStatement5 = null;

        doWhileStatement_return doWhileStatement6 = null;

        switchStatement_return switchStatement7 = null;

        functionDeclaration_return functionDeclaration8 = null;



        try {
            // ./CFScript.g:119:2: ( ( ( nonBlockStatement | ifStatement | tryStatement | forStatement | whileStatement | doWhileStatement | switchStatement | functionDeclaration ) )* )
            // ./CFScript.g:119:2: ( ( nonBlockStatement | ifStatement | tryStatement | forStatement | whileStatement | doWhileStatement | switchStatement | functionDeclaration ) )*
            {
            root_0 = (Object)adaptor.nil();

            // ./CFScript.g:119:2: ( ( nonBlockStatement | ifStatement | tryStatement | forStatement | whileStatement | doWhileStatement | switchStatement | functionDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==VAR||LA2_0==OPEN_PAREN||LA2_0==RETURN||(LA2_0>=NOT && LA2_0<=HASH)||LA2_0==DOUBLE_QUOTE||LA2_0==SINGLE_QUOTE||LA2_0==IDENTIFIER||(LA2_0>=FUNCTION && LA2_0<=IF)||LA2_0==TRY||LA2_0==FOR||(LA2_0>=WHILE && LA2_0<=DO)||LA2_0==SWITCH||LA2_0==BREAK) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ./CFScript.g:120:3: ( nonBlockStatement | ifStatement | tryStatement | forStatement | whileStatement | doWhileStatement | switchStatement | functionDeclaration )
            	    {
            	    // ./CFScript.g:120:3: ( nonBlockStatement | ifStatement | tryStatement | forStatement | whileStatement | doWhileStatement | switchStatement | functionDeclaration )
            	    int alt1=8;
            	    switch ( input.LA(1) ) {
            	    case VAR:
            	    case OPEN_PAREN:
            	    case RETURN:
            	    case NOT:
            	    case NUMBER:
            	    case HASH:
            	    case DOUBLE_QUOTE:
            	    case SINGLE_QUOTE:
            	    case IDENTIFIER:
            	    case BREAK:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case IF:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case TRY:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    case FOR:
            	        {
            	        alt1=4;
            	        }
            	        break;
            	    case WHILE:
            	        {
            	        alt1=5;
            	        }
            	        break;
            	    case DO:
            	        {
            	        alt1=6;
            	        }
            	        break;
            	    case SWITCH:
            	        {
            	        alt1=7;
            	        }
            	        break;
            	    case FUNCTION:
            	        {
            	        alt1=8;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("120:3: ( nonBlockStatement | ifStatement | tryStatement | forStatement | whileStatement | doWhileStatement | switchStatement | functionDeclaration )", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // ./CFScript.g:121:4: nonBlockStatement
            	            {
            	            pushFollow(FOLLOW_nonBlockStatement_in_script96);
            	            nonBlockStatement1=nonBlockStatement();
            	            _fsp--;

            	            adaptor.addChild(root_0, nonBlockStatement1.getTree());

            	            }
            	            break;
            	        case 2 :
            	            // ./CFScript.g:123:4: ifStatement
            	            {
            	            pushFollow(FOLLOW_ifStatement_in_script107);
            	            ifStatement2=ifStatement();
            	            _fsp--;

            	            adaptor.addChild(root_0, ifStatement2.getTree());

            	            }
            	            break;
            	        case 3 :
            	            // ./CFScript.g:125:4: tryStatement
            	            {
            	            pushFollow(FOLLOW_tryStatement_in_script117);
            	            tryStatement3=tryStatement();
            	            _fsp--;

            	            adaptor.addChild(root_0, tryStatement3.getTree());

            	            }
            	            break;
            	        case 4 :
            	            // ./CFScript.g:127:4: forStatement
            	            {
            	            pushFollow(FOLLOW_forStatement_in_script127);
            	            forStatement4=forStatement();
            	            _fsp--;

            	            adaptor.addChild(root_0, forStatement4.getTree());

            	            }
            	            break;
            	        case 5 :
            	            // ./CFScript.g:129:4: whileStatement
            	            {
            	            pushFollow(FOLLOW_whileStatement_in_script137);
            	            whileStatement5=whileStatement();
            	            _fsp--;

            	            adaptor.addChild(root_0, whileStatement5.getTree());

            	            }
            	            break;
            	        case 6 :
            	            // ./CFScript.g:131:4: doWhileStatement
            	            {
            	            pushFollow(FOLLOW_doWhileStatement_in_script147);
            	            doWhileStatement6=doWhileStatement();
            	            _fsp--;

            	            adaptor.addChild(root_0, doWhileStatement6.getTree());

            	            }
            	            break;
            	        case 7 :
            	            // ./CFScript.g:133:4: switchStatement
            	            {
            	            pushFollow(FOLLOW_switchStatement_in_script157);
            	            switchStatement7=switchStatement();
            	            _fsp--;

            	            adaptor.addChild(root_0, switchStatement7.getTree());

            	            }
            	            break;
            	        case 8 :
            	            // ./CFScript.g:135:4: functionDeclaration
            	            {
            	            pushFollow(FOLLOW_functionDeclaration_in_script167);
            	            functionDeclaration8=functionDeclaration();
            	            _fsp--;

            	            adaptor.addChild(root_0, functionDeclaration8.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("script", 1);
        }
        return retval;
    }
    // $ANTLR end script

    public static class nonBlockStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start nonBlockStatement
    // ./CFScript.g:140:1: nonBlockStatement : ( setStatement | returnStatement | breakStatement ) SEMI_COLON ;
    public final nonBlockStatement_return nonBlockStatement() throws RecognitionException {
    traceIn("nonBlockStatement", 2);
        nonBlockStatement_return retval = new nonBlockStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI_COLON12=null;
        setStatement_return setStatement9 = null;

        returnStatement_return returnStatement10 = null;

        breakStatement_return breakStatement11 = null;


        Object SEMI_COLON12_tree=null;

        try {
            // ./CFScript.g:142:2: ( ( setStatement | returnStatement | breakStatement ) SEMI_COLON )
            // ./CFScript.g:142:2: ( setStatement | returnStatement | breakStatement ) SEMI_COLON
            {
            root_0 = (Object)adaptor.nil();

            // ./CFScript.g:142:2: ( setStatement | returnStatement | breakStatement )
            int alt3=3;
            switch ( input.LA(1) ) {
            case VAR:
            case OPEN_PAREN:
            case NOT:
            case NUMBER:
            case HASH:
            case DOUBLE_QUOTE:
            case SINGLE_QUOTE:
            case IDENTIFIER:
                {
                alt3=1;
                }
                break;
            case RETURN:
                {
                alt3=2;
                }
                break;
            case BREAK:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("142:2: ( setStatement | returnStatement | breakStatement )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ./CFScript.g:143:3: setStatement
                    {
                    pushFollow(FOLLOW_setStatement_in_nonBlockStatement192);
                    setStatement9=setStatement();
                    _fsp--;

                    adaptor.addChild(root_0, setStatement9.getTree());

                    }
                    break;
                case 2 :
                    // ./CFScript.g:145:3: returnStatement
                    {
                    pushFollow(FOLLOW_returnStatement_in_nonBlockStatement200);
                    returnStatement10=returnStatement();
                    _fsp--;

                    adaptor.addChild(root_0, returnStatement10.getTree());

                    }
                    break;
                case 3 :
                    // ./CFScript.g:147:3: breakStatement
                    {
                    pushFollow(FOLLOW_breakStatement_in_nonBlockStatement208);
                    breakStatement11=breakStatement();
                    _fsp--;

                    adaptor.addChild(root_0, breakStatement11.getTree());

                    }
                    break;

            }

            SEMI_COLON12=(Token)input.LT(1);
            match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_nonBlockStatement215); 
            SEMI_COLON12_tree = (Object)adaptor.create(SEMI_COLON12);
            adaptor.addChild(root_0, SEMI_COLON12_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("nonBlockStatement", 2);
        }
        return retval;
    }
    // $ANTLR end nonBlockStatement

    public static class setStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start setStatement
    // ./CFScript.g:152:1: setStatement : ( VAR )? codeStatement ( EQUALS codeStatement )? ;
    public final setStatement_return setStatement() throws RecognitionException {
    traceIn("setStatement", 3);
        setStatement_return retval = new setStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR13=null;
        Token EQUALS15=null;
        codeStatement_return codeStatement14 = null;

        codeStatement_return codeStatement16 = null;


        Object VAR13_tree=null;
        Object EQUALS15_tree=null;

        try {
            // ./CFScript.g:162:2: ( ( VAR )? codeStatement ( EQUALS codeStatement )? )
            // ./CFScript.g:162:2: ( VAR )? codeStatement ( EQUALS codeStatement )?
            {
            root_0 = (Object)adaptor.nil();

            // ./CFScript.g:162:2: ( VAR )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==VAR) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ./CFScript.g:162:3: VAR
                    {
                    VAR13=(Token)input.LT(1);
                    match(input,VAR,FOLLOW_VAR_in_setStatement232); 
                    VAR13_tree = (Object)adaptor.create(VAR13);
                    adaptor.addChild(root_0, VAR13_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_codeStatement_in_setStatement236);
            codeStatement14=codeStatement();
            _fsp--;

            adaptor.addChild(root_0, codeStatement14.getTree());
            // ./CFScript.g:162:23: ( EQUALS codeStatement )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EQUALS) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ./CFScript.g:162:24: EQUALS codeStatement
                    {
                    EQUALS15=(Token)input.LT(1);
                    match(input,EQUALS,FOLLOW_EQUALS_in_setStatement239); 
                    EQUALS15_tree = (Object)adaptor.create(EQUALS15);
                    adaptor.addChild(root_0, EQUALS15_tree);

                    pushFollow(FOLLOW_codeStatement_in_setStatement241);
                    codeStatement16=codeStatement();
                    _fsp--;

                    adaptor.addChild(root_0, codeStatement16.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("setStatement", 3);
        }
        return retval;
    }
    // $ANTLR end setStatement

    public static class codeStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start codeStatement
    // ./CFScript.g:165:1: codeStatement : ( OPEN_PAREN codeStatement CLOSE_PAREN | cfmlBasicStatement ) ;
    public final codeStatement_return codeStatement() throws RecognitionException {
    traceIn("codeStatement", 4);
        codeStatement_return retval = new codeStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN_PAREN17=null;
        Token CLOSE_PAREN19=null;
        codeStatement_return codeStatement18 = null;

        cfmlBasicStatement_return cfmlBasicStatement20 = null;


        Object OPEN_PAREN17_tree=null;
        Object CLOSE_PAREN19_tree=null;

        try {
            // ./CFScript.g:167:2: ( ( OPEN_PAREN codeStatement CLOSE_PAREN | cfmlBasicStatement ) )
            // ./CFScript.g:167:2: ( OPEN_PAREN codeStatement CLOSE_PAREN | cfmlBasicStatement )
            {
            root_0 = (Object)adaptor.nil();

            // ./CFScript.g:167:2: ( OPEN_PAREN codeStatement CLOSE_PAREN | cfmlBasicStatement )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==OPEN_PAREN) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=NOT && LA6_0<=HASH)||LA6_0==DOUBLE_QUOTE||LA6_0==SINGLE_QUOTE||LA6_0==IDENTIFIER) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("167:2: ( OPEN_PAREN codeStatement CLOSE_PAREN | cfmlBasicStatement )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ./CFScript.g:168:3: OPEN_PAREN codeStatement CLOSE_PAREN
                    {
                    OPEN_PAREN17=(Token)input.LT(1);
                    match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_codeStatement259); 
                    OPEN_PAREN17_tree = (Object)adaptor.create(OPEN_PAREN17);
                    adaptor.addChild(root_0, OPEN_PAREN17_tree);

                    pushFollow(FOLLOW_codeStatement_in_codeStatement261);
                    codeStatement18=codeStatement();
                    _fsp--;

                    adaptor.addChild(root_0, codeStatement18.getTree());
                    CLOSE_PAREN19=(Token)input.LT(1);
                    match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_codeStatement263); 
                    CLOSE_PAREN19_tree = (Object)adaptor.create(CLOSE_PAREN19);
                    adaptor.addChild(root_0, CLOSE_PAREN19_tree);


                    }
                    break;
                case 2 :
                    // ./CFScript.g:170:3: cfmlBasicStatement
                    {
                    pushFollow(FOLLOW_cfmlBasicStatement_in_codeStatement271);
                    cfmlBasicStatement20=cfmlBasicStatement();
                    _fsp--;

                    adaptor.addChild(root_0, cfmlBasicStatement20.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("codeStatement", 4);
        }
        return retval;
    }
    // $ANTLR end codeStatement

    public static class returnStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start returnStatement
    // ./CFScript.g:174:1: returnStatement : RETURN ( codeStatement )? ;
    public final returnStatement_return returnStatement() throws RecognitionException {
    traceIn("returnStatement", 5);
        returnStatement_return retval = new returnStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RETURN21=null;
        codeStatement_return codeStatement22 = null;


        Object RETURN21_tree=null;

        try {
            // ./CFScript.g:176:2: ( RETURN ( codeStatement )? )
            // ./CFScript.g:176:2: RETURN ( codeStatement )?
            {
            root_0 = (Object)adaptor.nil();

            RETURN21=(Token)input.LT(1);
            match(input,RETURN,FOLLOW_RETURN_in_returnStatement287); 
            RETURN21_tree = (Object)adaptor.create(RETURN21);
            root_0 = (Object)adaptor.becomeRoot(RETURN21_tree, root_0);

            // ./CFScript.g:176:10: ( codeStatement )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==OPEN_PAREN||(LA7_0>=NOT && LA7_0<=HASH)||LA7_0==DOUBLE_QUOTE||LA7_0==SINGLE_QUOTE||LA7_0==IDENTIFIER) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ./CFScript.g:176:11: codeStatement
                    {
                    pushFollow(FOLLOW_codeStatement_in_returnStatement291);
                    codeStatement22=codeStatement();
                    _fsp--;

                    adaptor.addChild(root_0, codeStatement22.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("returnStatement", 5);
        }
        return retval;
    }
    // $ANTLR end returnStatement

    public static class cfmlBasicStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start cfmlBasicStatement
    // ./CFScript.g:179:1: cfmlBasicStatement : cfmlValueStatement ( OPERATOR codeStatement )? ;
    public final cfmlBasicStatement_return cfmlBasicStatement() throws RecognitionException {
    traceIn("cfmlBasicStatement", 6);
        cfmlBasicStatement_return retval = new cfmlBasicStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPERATOR24=null;
        cfmlValueStatement_return cfmlValueStatement23 = null;

        codeStatement_return codeStatement25 = null;


        Object OPERATOR24_tree=null;

        try {
            // ./CFScript.g:181:2: ( cfmlValueStatement ( OPERATOR codeStatement )? )
            // ./CFScript.g:181:2: cfmlValueStatement ( OPERATOR codeStatement )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_cfmlValueStatement_in_cfmlBasicStatement305);
            cfmlValueStatement23=cfmlValueStatement();
            _fsp--;

            adaptor.addChild(root_0, cfmlValueStatement23.getTree());
            // ./CFScript.g:181:21: ( OPERATOR codeStatement )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==OPERATOR) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ./CFScript.g:181:22: OPERATOR codeStatement
                    {
                    OPERATOR24=(Token)input.LT(1);
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_cfmlBasicStatement308); 
                    OPERATOR24_tree = (Object)adaptor.create(OPERATOR24);
                    adaptor.addChild(root_0, OPERATOR24_tree);

                    pushFollow(FOLLOW_codeStatement_in_cfmlBasicStatement310);
                    codeStatement25=codeStatement();
                    _fsp--;

                    adaptor.addChild(root_0, codeStatement25.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("cfmlBasicStatement", 6);
        }
        return retval;
    }
    // $ANTLR end cfmlBasicStatement

    public static class cfmlValueStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start cfmlValueStatement
    // ./CFScript.g:185:1: cfmlValueStatement : ( NOT )? cfmlValue ;
    public final cfmlValueStatement_return cfmlValueStatement() throws RecognitionException {
    traceIn("cfmlValueStatement", 7);
        cfmlValueStatement_return retval = new cfmlValueStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT26=null;
        cfmlValue_return cfmlValue27 = null;


        Object NOT26_tree=null;

        try {
            // ./CFScript.g:187:2: ( ( NOT )? cfmlValue )
            // ./CFScript.g:187:2: ( NOT )? cfmlValue
            {
            root_0 = (Object)adaptor.nil();

            // ./CFScript.g:187:2: ( NOT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==NOT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ./CFScript.g:187:3: NOT
                    {
                    NOT26=(Token)input.LT(1);
                    match(input,NOT,FOLLOW_NOT_in_cfmlValueStatement326); 
                    NOT26_tree = (Object)adaptor.create(NOT26);
                    adaptor.addChild(root_0, NOT26_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_cfmlValue_in_cfmlValueStatement330);
            cfmlValue27=cfmlValue();
            _fsp--;

            adaptor.addChild(root_0, cfmlValue27.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("cfmlValueStatement", 7);
        }
        return retval;
    }
    // $ANTLR end cfmlValueStatement

    public static class cfmlValue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start cfmlValue
    // ./CFScript.g:190:1: cfmlValue : ( NUMBER | stringLiteral | cfmlLinking ) ;
    public final cfmlValue_return cfmlValue() throws RecognitionException {
    traceIn("cfmlValue", 8);
        cfmlValue_return retval = new cfmlValue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER28=null;
        stringLiteral_return stringLiteral29 = null;

        cfmlLinking_return cfmlLinking30 = null;


        Object NUMBER28_tree=null;

        try {
            // ./CFScript.g:192:2: ( ( NUMBER | stringLiteral | cfmlLinking ) )
            // ./CFScript.g:192:2: ( NUMBER | stringLiteral | cfmlLinking )
            {
            root_0 = (Object)adaptor.nil();

            // ./CFScript.g:192:2: ( NUMBER | stringLiteral | cfmlLinking )
            int alt10=3;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt10=1;
                }
                break;
            case DOUBLE_QUOTE:
            case SINGLE_QUOTE:
                {
                alt10=2;
                }
                break;
            case HASH:
            case IDENTIFIER:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("192:2: ( NUMBER | stringLiteral | cfmlLinking )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ./CFScript.g:192:3: NUMBER
                    {
                    NUMBER28=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_cfmlValue343); 
                    NUMBER28_tree = (Object)adaptor.create(NUMBER28);
                    adaptor.addChild(root_0, NUMBER28_tree);


                    }
                    break;
                case 2 :
                    // ./CFScript.g:192:12: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_cfmlValue347);
                    stringLiteral29=stringLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, stringLiteral29.getTree());

                    }
                    break;
                case 3 :
                    // ./CFScript.g:192:28: cfmlLinking
                    {
                    pushFollow(FOLLOW_cfmlLinking_in_cfmlValue351);
                    cfmlLinking30=cfmlLinking();
                    _fsp--;

                    adaptor.addChild(root_0, cfmlLinking30.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("cfmlValue", 8);
        }
        return retval;
    }
    // $ANTLR end cfmlValue

    public static class cfmlLinking_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start cfmlLinking
    // ./CFScript.g:195:1: cfmlLinking : ( hashCfmlLinking | cfmlBasicLinking );
    public final cfmlLinking_return cfmlLinking() throws RecognitionException {
    traceIn("cfmlLinking", 9);
        cfmlLinking_return retval = new cfmlLinking_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        hashCfmlLinking_return hashCfmlLinking31 = null;

        cfmlBasicLinking_return cfmlBasicLinking32 = null;



        try {
            // ./CFScript.g:197:2: ( hashCfmlLinking | cfmlBasicLinking )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==HASH) ) {
                alt11=1;
            }
            else if ( (LA11_0==IDENTIFIER) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("195:1: cfmlLinking : ( hashCfmlLinking | cfmlBasicLinking );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ./CFScript.g:197:2: hashCfmlLinking
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_hashCfmlLinking_in_cfmlLinking364);
                    hashCfmlLinking31=hashCfmlLinking();
                    _fsp--;

                    adaptor.addChild(root_0, hashCfmlLinking31.getTree());

                    }
                    break;
                case 2 :
                    // ./CFScript.g:199:2: cfmlBasicLinking
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_cfmlBasicLinking_in_cfmlLinking370);
                    cfmlBasicLinking32=cfmlBasicLinking();
                    _fsp--;

                    adaptor.addChild(root_0, cfmlBasicLinking32.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("cfmlLinking", 9);
        }
        return retval;
    }
    // $ANTLR end cfmlLinking

    public static class hashCfmlLinking_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start hashCfmlLinking
    // ./CFScript.g:202:1: hashCfmlLinking : HASH cfmlBasicLinking HASH ;
    public final hashCfmlLinking_return hashCfmlLinking() throws RecognitionException {
    traceIn("hashCfmlLinking", 10);
        hashCfmlLinking_return retval = new hashCfmlLinking_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token HASH33=null;
        Token HASH35=null;
        cfmlBasicLinking_return cfmlBasicLinking34 = null;


        Object HASH33_tree=null;
        Object HASH35_tree=null;

        try {
            // ./CFScript.g:204:2: ( HASH cfmlBasicLinking HASH )
            // ./CFScript.g:204:2: HASH cfmlBasicLinking HASH
            {
            root_0 = (Object)adaptor.nil();

            HASH33=(Token)input.LT(1);
            match(input,HASH,FOLLOW_HASH_in_hashCfmlLinking383); 
            HASH33_tree = (Object)adaptor.create(HASH33);
            adaptor.addChild(root_0, HASH33_tree);

            pushFollow(FOLLOW_cfmlBasicLinking_in_hashCfmlLinking385);
            cfmlBasicLinking34=cfmlBasicLinking();
            _fsp--;

            adaptor.addChild(root_0, cfmlBasicLinking34.getTree());
            HASH35=(Token)input.LT(1);
            match(input,HASH,FOLLOW_HASH_in_hashCfmlLinking387); 
            HASH35_tree = (Object)adaptor.create(HASH35);
            adaptor.addChild(root_0, HASH35_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("hashCfmlLinking", 10);
        }
        return retval;
    }
    // $ANTLR end hashCfmlLinking

    public static class cfmlBasicLinking_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start cfmlBasicLinking
    // ./CFScript.g:207:1: cfmlBasicLinking : cfmlBasic ( DOT cfmlBasic )* ;
    public final cfmlBasicLinking_return cfmlBasicLinking() throws RecognitionException {
    traceIn("cfmlBasicLinking", 11);
        cfmlBasicLinking_return retval = new cfmlBasicLinking_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT37=null;
        cfmlBasic_return cfmlBasic36 = null;

        cfmlBasic_return cfmlBasic38 = null;


        Object DOT37_tree=null;

        try {
            // ./CFScript.g:209:2: ( cfmlBasic ( DOT cfmlBasic )* )
            // ./CFScript.g:209:2: cfmlBasic ( DOT cfmlBasic )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_cfmlBasic_in_cfmlBasicLinking399);
            cfmlBasic36=cfmlBasic();
            _fsp--;

            adaptor.addChild(root_0, cfmlBasic36.getTree());
            // ./CFScript.g:209:12: ( DOT cfmlBasic )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==DOT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ./CFScript.g:209:13: DOT cfmlBasic
            	    {
            	    DOT37=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_cfmlBasicLinking402); 
            	    DOT37_tree = (Object)adaptor.create(DOT37);
            	    adaptor.addChild(root_0, DOT37_tree);

            	    pushFollow(FOLLOW_cfmlBasic_in_cfmlBasicLinking404);
            	    cfmlBasic38=cfmlBasic();
            	    _fsp--;

            	    adaptor.addChild(root_0, cfmlBasic38.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("cfmlBasicLinking", 11);
        }
        return retval;
    }
    // $ANTLR end cfmlBasicLinking

    public static class cfmlBasic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start cfmlBasic
    // ./CFScript.g:212:1: cfmlBasic : ( identifier | function );
    public final cfmlBasic_return cfmlBasic() throws RecognitionException {
    traceIn("cfmlBasic", 12);
        cfmlBasic_return retval = new cfmlBasic_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        identifier_return identifier39 = null;

        function_return function40 = null;



        try {
            // ./CFScript.g:214:2: ( identifier | function )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IDENTIFIER) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==OPEN_PAREN) ) {
                    alt13=2;
                }
                else if ( (LA13_1==SEMI_COLON||LA13_1==EQUALS||LA13_1==CLOSE_PAREN||LA13_1==OPERATOR||(LA13_1>=HASH && LA13_1<=DOT)||(LA13_1>=OPEN_SQUARE && LA13_1<=COMMA)) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("212:1: cfmlBasic : ( identifier | function );", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("212:1: cfmlBasic : ( identifier | function );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ./CFScript.g:214:2: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_cfmlBasic418);
                    identifier39=identifier();
                    _fsp--;

                    adaptor.addChild(root_0, identifier39.getTree());

                    }
                    break;
                case 2 :
                    // ./CFScript.g:214:15: function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_in_cfmlBasic422);
                    function40=function();
                    _fsp--;

                    adaptor.addChild(root_0, function40.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("cfmlBasic", 12);
        }
        return retval;
    }
    // $ANTLR end cfmlBasic

    public static class innerStringCFML_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start innerStringCFML
    // ./CFScript.g:217:1: innerStringCFML : hashCfmlLinking ;
    public final innerStringCFML_return innerStringCFML() throws RecognitionException {
    traceIn("innerStringCFML", 13);
        innerStringCFML_return retval = new innerStringCFML_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        hashCfmlLinking_return hashCfmlLinking41 = null;



        try {
            // ./CFScript.g:219:2: ( hashCfmlLinking )
            // ./CFScript.g:219:2: hashCfmlLinking
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_hashCfmlLinking_in_innerStringCFML434);
            hashCfmlLinking41=hashCfmlLinking();
            _fsp--;

            adaptor.addChild(root_0, hashCfmlLinking41.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("innerStringCFML", 13);
        }
        return retval;
    }
    // $ANTLR end innerStringCFML

    public static class stringLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start stringLiteral
    // ./CFScript.g:222:1: stringLiteral : ( ( DOUBLE_QUOTE ( ESCAPE_DOUBLE_QUOTE | innerStringCFML | ~ ( DOUBLE_QUOTE | ESCAPE_DOUBLE_QUOTE | HASH ) )* DOUBLE_QUOTE ) | ( SINGLE_QUOTE ( ESCAPE_SINGLE_QUOTE | innerStringCFML | ~ ( SINGLE_QUOTE | ESCAPE_SINGLE_QUOTE | HASH ) )* SINGLE_QUOTE ) );
    public final stringLiteral_return stringLiteral() throws RecognitionException {
    traceIn("stringLiteral", 14);
        stringLiteral_return retval = new stringLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_QUOTE42=null;
        Token ESCAPE_DOUBLE_QUOTE43=null;
        Token set45=null;
        Token DOUBLE_QUOTE46=null;
        Token SINGLE_QUOTE47=null;
        Token ESCAPE_SINGLE_QUOTE48=null;
        Token set50=null;
        Token SINGLE_QUOTE51=null;
        innerStringCFML_return innerStringCFML44 = null;

        innerStringCFML_return innerStringCFML49 = null;


        Object DOUBLE_QUOTE42_tree=null;
        Object ESCAPE_DOUBLE_QUOTE43_tree=null;
        Object set45_tree=null;
        Object DOUBLE_QUOTE46_tree=null;
        Object SINGLE_QUOTE47_tree=null;
        Object ESCAPE_SINGLE_QUOTE48_tree=null;
        Object set50_tree=null;
        Object SINGLE_QUOTE51_tree=null;

        try {
            // ./CFScript.g:224:2: ( ( DOUBLE_QUOTE ( ESCAPE_DOUBLE_QUOTE | innerStringCFML | ~ ( DOUBLE_QUOTE | ESCAPE_DOUBLE_QUOTE | HASH ) )* DOUBLE_QUOTE ) | ( SINGLE_QUOTE ( ESCAPE_SINGLE_QUOTE | innerStringCFML | ~ ( SINGLE_QUOTE | ESCAPE_SINGLE_QUOTE | HASH ) )* SINGLE_QUOTE ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==DOUBLE_QUOTE) ) {
                alt16=1;
            }
            else if ( (LA16_0==SINGLE_QUOTE) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("222:1: stringLiteral : ( ( DOUBLE_QUOTE ( ESCAPE_DOUBLE_QUOTE | innerStringCFML | ~ ( DOUBLE_QUOTE | ESCAPE_DOUBLE_QUOTE | HASH ) )* DOUBLE_QUOTE ) | ( SINGLE_QUOTE ( ESCAPE_SINGLE_QUOTE | innerStringCFML | ~ ( SINGLE_QUOTE | ESCAPE_SINGLE_QUOTE | HASH ) )* SINGLE_QUOTE ) );", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ./CFScript.g:224:2: ( DOUBLE_QUOTE ( ESCAPE_DOUBLE_QUOTE | innerStringCFML | ~ ( DOUBLE_QUOTE | ESCAPE_DOUBLE_QUOTE | HASH ) )* DOUBLE_QUOTE )
                    {
                    root_0 = (Object)adaptor.nil();

                    // ./CFScript.g:224:2: ( DOUBLE_QUOTE ( ESCAPE_DOUBLE_QUOTE | innerStringCFML | ~ ( DOUBLE_QUOTE | ESCAPE_DOUBLE_QUOTE | HASH ) )* DOUBLE_QUOTE )
                    // ./CFScript.g:225:3: DOUBLE_QUOTE ( ESCAPE_DOUBLE_QUOTE | innerStringCFML | ~ ( DOUBLE_QUOTE | ESCAPE_DOUBLE_QUOTE | HASH ) )* DOUBLE_QUOTE
                    {
                    DOUBLE_QUOTE42=(Token)input.LT(1);
                    match(input,DOUBLE_QUOTE,FOLLOW_DOUBLE_QUOTE_in_stringLiteral450); 
                    DOUBLE_QUOTE42_tree = (Object)adaptor.create(DOUBLE_QUOTE42);
                    root_0 = (Object)adaptor.becomeRoot(DOUBLE_QUOTE42_tree, root_0);

                    // ./CFScript.g:225:17: ( ESCAPE_DOUBLE_QUOTE | innerStringCFML | ~ ( DOUBLE_QUOTE | ESCAPE_DOUBLE_QUOTE | HASH ) )*
                    loop14:
                    do {
                        int alt14=4;
                        switch ( input.LA(1) ) {
                        case ESCAPE_DOUBLE_QUOTE:
                            {
                            alt14=1;
                            }
                            break;
                        case HASH:
                            {
                            alt14=2;
                            }
                            break;
                        case FUNCTION_CALL:
                        case FUNCTION_DECLARATION:
                        case STRUCT_KEY:
                        case ELSEIF:
                        case STRING_CFML:
                        case STRING:
                        case SEMI_COLON:
                        case VAR:
                        case EQUALS:
                        case OPEN_PAREN:
                        case CLOSE_PAREN:
                        case RETURN:
                        case OPERATOR:
                        case NOT:
                        case NUMBER:
                        case DOT:
                        case SINGLE_QUOTE:
                        case ESCAPE_SINGLE_QUOTE:
                        case IDENTIFIER:
                        case OPEN_SQUARE:
                        case CLOSE_SQUARE:
                        case COMMA:
                        case FUNCTION:
                        case IF:
                        case ELSE:
                        case TRY:
                        case CATCH:
                        case FOR:
                        case IN:
                        case WHILE:
                        case DO:
                        case OPEN_CURLY:
                        case CLOSE_CURLY:
                        case SWITCH:
                        case CASE:
                        case COLON:
                        case DEFAULT:
                        case BREAK:
                        case MATH_OPERATOR:
                        case STRING_OPERATOR:
                        case CONDITION_OPERATOR:
                        case BOOLEAN_OPERATOR:
                        case DIGIT:
                        case LETTER:
                        case UNDERSCORE:
                        case WS:
                        case COMMENT:
                        case LINE_COMMENT:
                            {
                            alt14=3;
                            }
                            break;

                        }

                        switch (alt14) {
                    	case 1 :
                    	    // ./CFScript.g:225:19: ESCAPE_DOUBLE_QUOTE
                    	    {
                    	    ESCAPE_DOUBLE_QUOTE43=(Token)input.LT(1);
                    	    match(input,ESCAPE_DOUBLE_QUOTE,FOLLOW_ESCAPE_DOUBLE_QUOTE_in_stringLiteral455); 
                    	    ESCAPE_DOUBLE_QUOTE43_tree = (Object)adaptor.create(ESCAPE_DOUBLE_QUOTE43);
                    	    adaptor.addChild(root_0, ESCAPE_DOUBLE_QUOTE43_tree);


                    	    }
                    	    break;
                    	case 2 :
                    	    // ./CFScript.g:225:41: innerStringCFML
                    	    {
                    	    pushFollow(FOLLOW_innerStringCFML_in_stringLiteral459);
                    	    innerStringCFML44=innerStringCFML();
                    	    _fsp--;

                    	    adaptor.addChild(root_0, innerStringCFML44.getTree());

                    	    }
                    	    break;
                    	case 3 :
                    	    // ./CFScript.g:225:59: ~ ( DOUBLE_QUOTE | ESCAPE_DOUBLE_QUOTE | HASH )
                    	    {
                    	    set45=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=FUNCTION_CALL && input.LA(1)<=NUMBER)||input.LA(1)==DOT||(input.LA(1)>=SINGLE_QUOTE && input.LA(1)<=LINE_COMMENT) ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, adaptor.create(set45));
                    	        errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_stringLiteral463);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    DOUBLE_QUOTE46=(Token)input.LT(1);
                    match(input,DOUBLE_QUOTE,FOLLOW_DOUBLE_QUOTE_in_stringLiteral479); 
                    DOUBLE_QUOTE46_tree = (Object)adaptor.create(DOUBLE_QUOTE46);
                    adaptor.addChild(root_0, DOUBLE_QUOTE46_tree);


                    }


                    }
                    break;
                case 2 :
                    // ./CFScript.g:228:2: ( SINGLE_QUOTE ( ESCAPE_SINGLE_QUOTE | innerStringCFML | ~ ( SINGLE_QUOTE | ESCAPE_SINGLE_QUOTE | HASH ) )* SINGLE_QUOTE )
                    {
                    root_0 = (Object)adaptor.nil();

                    // ./CFScript.g:228:2: ( SINGLE_QUOTE ( ESCAPE_SINGLE_QUOTE | innerStringCFML | ~ ( SINGLE_QUOTE | ESCAPE_SINGLE_QUOTE | HASH ) )* SINGLE_QUOTE )
                    // ./CFScript.g:229:3: SINGLE_QUOTE ( ESCAPE_SINGLE_QUOTE | innerStringCFML | ~ ( SINGLE_QUOTE | ESCAPE_SINGLE_QUOTE | HASH ) )* SINGLE_QUOTE
                    {
                    SINGLE_QUOTE47=(Token)input.LT(1);
                    match(input,SINGLE_QUOTE,FOLLOW_SINGLE_QUOTE_in_stringLiteral492); 
                    SINGLE_QUOTE47_tree = (Object)adaptor.create(SINGLE_QUOTE47);
                    root_0 = (Object)adaptor.becomeRoot(SINGLE_QUOTE47_tree, root_0);

                    // ./CFScript.g:229:17: ( ESCAPE_SINGLE_QUOTE | innerStringCFML | ~ ( SINGLE_QUOTE | ESCAPE_SINGLE_QUOTE | HASH ) )*
                    loop15:
                    do {
                        int alt15=4;
                        switch ( input.LA(1) ) {
                        case ESCAPE_SINGLE_QUOTE:
                            {
                            alt15=1;
                            }
                            break;
                        case HASH:
                            {
                            alt15=2;
                            }
                            break;
                        case FUNCTION_CALL:
                        case FUNCTION_DECLARATION:
                        case STRUCT_KEY:
                        case ELSEIF:
                        case STRING_CFML:
                        case STRING:
                        case SEMI_COLON:
                        case VAR:
                        case EQUALS:
                        case OPEN_PAREN:
                        case CLOSE_PAREN:
                        case RETURN:
                        case OPERATOR:
                        case NOT:
                        case NUMBER:
                        case DOT:
                        case DOUBLE_QUOTE:
                        case ESCAPE_DOUBLE_QUOTE:
                        case IDENTIFIER:
                        case OPEN_SQUARE:
                        case CLOSE_SQUARE:
                        case COMMA:
                        case FUNCTION:
                        case IF:
                        case ELSE:
                        case TRY:
                        case CATCH:
                        case FOR:
                        case IN:
                        case WHILE:
                        case DO:
                        case OPEN_CURLY:
                        case CLOSE_CURLY:
                        case SWITCH:
                        case CASE:
                        case COLON:
                        case DEFAULT:
                        case BREAK:
                        case MATH_OPERATOR:
                        case STRING_OPERATOR:
                        case CONDITION_OPERATOR:
                        case BOOLEAN_OPERATOR:
                        case DIGIT:
                        case LETTER:
                        case UNDERSCORE:
                        case WS:
                        case COMMENT:
                        case LINE_COMMENT:
                            {
                            alt15=3;
                            }
                            break;

                        }

                        switch (alt15) {
                    	case 1 :
                    	    // ./CFScript.g:229:19: ESCAPE_SINGLE_QUOTE
                    	    {
                    	    ESCAPE_SINGLE_QUOTE48=(Token)input.LT(1);
                    	    match(input,ESCAPE_SINGLE_QUOTE,FOLLOW_ESCAPE_SINGLE_QUOTE_in_stringLiteral497); 
                    	    ESCAPE_SINGLE_QUOTE48_tree = (Object)adaptor.create(ESCAPE_SINGLE_QUOTE48);
                    	    adaptor.addChild(root_0, ESCAPE_SINGLE_QUOTE48_tree);


                    	    }
                    	    break;
                    	case 2 :
                    	    // ./CFScript.g:229:41: innerStringCFML
                    	    {
                    	    pushFollow(FOLLOW_innerStringCFML_in_stringLiteral501);
                    	    innerStringCFML49=innerStringCFML();
                    	    _fsp--;

                    	    adaptor.addChild(root_0, innerStringCFML49.getTree());

                    	    }
                    	    break;
                    	case 3 :
                    	    // ./CFScript.g:229:59: ~ ( SINGLE_QUOTE | ESCAPE_SINGLE_QUOTE | HASH )
                    	    {
                    	    set50=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=FUNCTION_CALL && input.LA(1)<=NUMBER)||(input.LA(1)>=DOT && input.LA(1)<=ESCAPE_DOUBLE_QUOTE)||(input.LA(1)>=IDENTIFIER && input.LA(1)<=LINE_COMMENT) ) {
                    	        input.consume();
                    	        adaptor.addChild(root_0, adaptor.create(set50));
                    	        errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_stringLiteral505);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    SINGLE_QUOTE51=(Token)input.LT(1);
                    match(input,SINGLE_QUOTE,FOLLOW_SINGLE_QUOTE_in_stringLiteral521); 
                    SINGLE_QUOTE51_tree = (Object)adaptor.create(SINGLE_QUOTE51);
                    adaptor.addChild(root_0, SINGLE_QUOTE51_tree);


                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("stringLiteral", 14);
        }
        return retval;
    }
    // $ANTLR end stringLiteral

    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start identifier
    // ./CFScript.g:233:1: identifier : IDENTIFIER ( struct )? ;
    public final identifier_return identifier() throws RecognitionException {
    traceIn("identifier", 15);
        identifier_return retval = new identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER52=null;
        struct_return struct53 = null;


        Object IDENTIFIER52_tree=null;

        try {
            // ./CFScript.g:235:2: ( IDENTIFIER ( struct )? )
            // ./CFScript.g:235:2: IDENTIFIER ( struct )?
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER52=(Token)input.LT(1);
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier536); 
            IDENTIFIER52_tree = (Object)adaptor.create(IDENTIFIER52);
            adaptor.addChild(root_0, IDENTIFIER52_tree);

            // ./CFScript.g:235:13: ( struct )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==OPEN_SQUARE) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ./CFScript.g:235:14: struct
                    {
                    pushFollow(FOLLOW_struct_in_identifier539);
                    struct53=struct();
                    _fsp--;

                    adaptor.addChild(root_0, struct53.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("identifier", 15);
        }
        return retval;
    }
    // $ANTLR end identifier

    public static class struct_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start struct
    // ./CFScript.g:238:1: struct : OPEN_SQUARE codeStatement CLOSE_SQUARE ;
    public final struct_return struct() throws RecognitionException {
    traceIn("struct", 16);
        struct_return retval = new struct_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN_SQUARE54=null;
        Token CLOSE_SQUARE56=null;
        codeStatement_return codeStatement55 = null;


        Object OPEN_SQUARE54_tree=null;
        Object CLOSE_SQUARE56_tree=null;

        try {
            // ./CFScript.g:240:2: ( OPEN_SQUARE codeStatement CLOSE_SQUARE )
            // ./CFScript.g:240:2: OPEN_SQUARE codeStatement CLOSE_SQUARE
            {
            root_0 = (Object)adaptor.nil();

            OPEN_SQUARE54=(Token)input.LT(1);
            match(input,OPEN_SQUARE,FOLLOW_OPEN_SQUARE_in_struct554); 
            OPEN_SQUARE54_tree = (Object)adaptor.create(OPEN_SQUARE54);
            adaptor.addChild(root_0, OPEN_SQUARE54_tree);

            pushFollow(FOLLOW_codeStatement_in_struct556);
            codeStatement55=codeStatement();
            _fsp--;

            adaptor.addChild(root_0, codeStatement55.getTree());
            CLOSE_SQUARE56=(Token)input.LT(1);
            match(input,CLOSE_SQUARE,FOLLOW_CLOSE_SQUARE_in_struct558); 
            CLOSE_SQUARE56_tree = (Object)adaptor.create(CLOSE_SQUARE56);
            adaptor.addChild(root_0, CLOSE_SQUARE56_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("struct", 16);
        }
        return retval;
    }
    // $ANTLR end struct

    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start function
    // ./CFScript.g:243:1: function : id= IDENTIFIER OPEN_PAREN ( argumentStatement )? CLOSE_PAREN -> ^( FUNCTION_CALL[$id] OPEN_PAREN ( argumentStatement )? CLOSE_PAREN ) ;
    public final function_return function() throws RecognitionException {
    traceIn("function", 17);
        function_return retval = new function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;
        Token OPEN_PAREN57=null;
        Token CLOSE_PAREN59=null;
        argumentStatement_return argumentStatement58 = null;


        Object id_tree=null;
        Object OPEN_PAREN57_tree=null;
        Object CLOSE_PAREN59_tree=null;
        RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
        RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_argumentStatement=new RewriteRuleSubtreeStream(adaptor,"rule argumentStatement");
        try {
            // ./CFScript.g:245:2: (id= IDENTIFIER OPEN_PAREN ( argumentStatement )? CLOSE_PAREN -> ^( FUNCTION_CALL[$id] OPEN_PAREN ( argumentStatement )? CLOSE_PAREN ) )
            // ./CFScript.g:245:2: id= IDENTIFIER OPEN_PAREN ( argumentStatement )? CLOSE_PAREN
            {
            id=(Token)input.LT(1);
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function573); 
            stream_IDENTIFIER.add(id);

            OPEN_PAREN57=(Token)input.LT(1);
            match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_function575); 
            stream_OPEN_PAREN.add(OPEN_PAREN57);

            // ./CFScript.g:245:27: ( argumentStatement )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==OPEN_PAREN||(LA18_0>=NOT && LA18_0<=HASH)||LA18_0==DOUBLE_QUOTE||LA18_0==SINGLE_QUOTE||LA18_0==IDENTIFIER) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ./CFScript.g:245:28: argumentStatement
                    {
                    pushFollow(FOLLOW_argumentStatement_in_function578);
                    argumentStatement58=argumentStatement();
                    _fsp--;

                    stream_argumentStatement.add(argumentStatement58.getTree());

                    }
                    break;

            }

            CLOSE_PAREN59=(Token)input.LT(1);
            match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_function582); 
            stream_CLOSE_PAREN.add(CLOSE_PAREN59);


            // AST REWRITE
            // elements: argumentStatement, OPEN_PAREN, CLOSE_PAREN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 246:2: -> ^( FUNCTION_CALL[$id] OPEN_PAREN ( argumentStatement )? CLOSE_PAREN )
            {
                // ./CFScript.g:246:5: ^( FUNCTION_CALL[$id] OPEN_PAREN ( argumentStatement )? CLOSE_PAREN )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FUNCTION_CALL, id), root_1);

                adaptor.addChild(root_1, stream_OPEN_PAREN.next());
                // ./CFScript.g:246:37: ( argumentStatement )?
                if ( stream_argumentStatement.hasNext() ) {
                    adaptor.addChild(root_1, stream_argumentStatement.next());

                }
                stream_argumentStatement.reset();
                adaptor.addChild(root_1, stream_CLOSE_PAREN.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("function", 17);
        }
        return retval;
    }
    // $ANTLR end function

    public static class argumentStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start argumentStatement
    // ./CFScript.g:249:1: argumentStatement : codeStatement ( COMMA codeStatement )* ;
    public final argumentStatement_return argumentStatement() throws RecognitionException {
    traceIn("argumentStatement", 18);
        argumentStatement_return retval = new argumentStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA61=null;
        codeStatement_return codeStatement60 = null;

        codeStatement_return codeStatement62 = null;


        Object COMMA61_tree=null;

        try {
            // ./CFScript.g:251:2: ( codeStatement ( COMMA codeStatement )* )
            // ./CFScript.g:251:2: codeStatement ( COMMA codeStatement )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_codeStatement_in_argumentStatement612);
            codeStatement60=codeStatement();
            _fsp--;

            adaptor.addChild(root_0, codeStatement60.getTree());
            // ./CFScript.g:251:16: ( COMMA codeStatement )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ./CFScript.g:251:17: COMMA codeStatement
            	    {
            	    COMMA61=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_argumentStatement615); 
            	    COMMA61_tree = (Object)adaptor.create(COMMA61);
            	    adaptor.addChild(root_0, COMMA61_tree);

            	    pushFollow(FOLLOW_codeStatement_in_argumentStatement617);
            	    codeStatement62=codeStatement();
            	    _fsp--;

            	    adaptor.addChild(root_0, codeStatement62.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("argumentStatement", 18);
        }
        return retval;
    }
    // $ANTLR end argumentStatement

    public static class functionDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start functionDeclaration
    // ./CFScript.g:254:1: functionDeclaration : FUNCTION id= IDENTIFIER OPEN_PAREN ( argumentDeclaration )? CLOSE_PAREN block -> ^( FUNCTION FUNCTION_DECLARATION[$id] OPEN_PAREN ( argumentDeclaration )? CLOSE_PAREN block ) ;
    public final functionDeclaration_return functionDeclaration() throws RecognitionException {
    traceIn("functionDeclaration", 19);
        functionDeclaration_return retval = new functionDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;
        Token FUNCTION63=null;
        Token OPEN_PAREN64=null;
        Token CLOSE_PAREN66=null;
        argumentDeclaration_return argumentDeclaration65 = null;

        block_return block67 = null;


        Object id_tree=null;
        Object FUNCTION63_tree=null;
        Object OPEN_PAREN64_tree=null;
        Object CLOSE_PAREN66_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
        RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_argumentDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule argumentDeclaration");
        try {
            // ./CFScript.g:256:2: ( FUNCTION id= IDENTIFIER OPEN_PAREN ( argumentDeclaration )? CLOSE_PAREN block -> ^( FUNCTION FUNCTION_DECLARATION[$id] OPEN_PAREN ( argumentDeclaration )? CLOSE_PAREN block ) )
            // ./CFScript.g:256:2: FUNCTION id= IDENTIFIER OPEN_PAREN ( argumentDeclaration )? CLOSE_PAREN block
            {
            FUNCTION63=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclaration631); 
            stream_FUNCTION.add(FUNCTION63);

            id=(Token)input.LT(1);
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_functionDeclaration635); 
            stream_IDENTIFIER.add(id);

            OPEN_PAREN64=(Token)input.LT(1);
            match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_functionDeclaration637); 
            stream_OPEN_PAREN.add(OPEN_PAREN64);

            // ./CFScript.g:256:36: ( argumentDeclaration )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENTIFIER) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ./CFScript.g:256:37: argumentDeclaration
                    {
                    pushFollow(FOLLOW_argumentDeclaration_in_functionDeclaration640);
                    argumentDeclaration65=argumentDeclaration();
                    _fsp--;

                    stream_argumentDeclaration.add(argumentDeclaration65.getTree());

                    }
                    break;

            }

            CLOSE_PAREN66=(Token)input.LT(1);
            match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_functionDeclaration644); 
            stream_CLOSE_PAREN.add(CLOSE_PAREN66);

            pushFollow(FOLLOW_block_in_functionDeclaration647);
            block67=block();
            _fsp--;

            stream_block.add(block67.getTree());

            // AST REWRITE
            // elements: argumentDeclaration, CLOSE_PAREN, OPEN_PAREN, block, FUNCTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 258:2: -> ^( FUNCTION FUNCTION_DECLARATION[$id] OPEN_PAREN ( argumentDeclaration )? CLOSE_PAREN block )
            {
                // ./CFScript.g:258:5: ^( FUNCTION FUNCTION_DECLARATION[$id] OPEN_PAREN ( argumentDeclaration )? CLOSE_PAREN block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.next(), root_1);

                adaptor.addChild(root_1, adaptor.create(FUNCTION_DECLARATION, id));
                adaptor.addChild(root_1, stream_OPEN_PAREN.next());
                // ./CFScript.g:258:53: ( argumentDeclaration )?
                if ( stream_argumentDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_argumentDeclaration.next());

                }
                stream_argumentDeclaration.reset();
                adaptor.addChild(root_1, stream_CLOSE_PAREN.next());
                adaptor.addChild(root_1, stream_block.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("functionDeclaration", 19);
        }
        return retval;
    }
    // $ANTLR end functionDeclaration

    public static class argumentDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start argumentDeclaration
    // ./CFScript.g:261:1: argumentDeclaration : IDENTIFIER ( COMMA IDENTIFIER )* ;
    public final argumentDeclaration_return argumentDeclaration() throws RecognitionException {
    traceIn("argumentDeclaration", 20);
        argumentDeclaration_return retval = new argumentDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER68=null;
        Token COMMA69=null;
        Token IDENTIFIER70=null;

        Object IDENTIFIER68_tree=null;
        Object COMMA69_tree=null;
        Object IDENTIFIER70_tree=null;

        try {
            // ./CFScript.g:263:2: ( IDENTIFIER ( COMMA IDENTIFIER )* )
            // ./CFScript.g:263:2: IDENTIFIER ( COMMA IDENTIFIER )*
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER68=(Token)input.LT(1);
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_argumentDeclaration681); 
            IDENTIFIER68_tree = (Object)adaptor.create(IDENTIFIER68);
            adaptor.addChild(root_0, IDENTIFIER68_tree);

            // ./CFScript.g:263:13: ( COMMA IDENTIFIER )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ./CFScript.g:263:14: COMMA IDENTIFIER
            	    {
            	    COMMA69=(Token)input.LT(1);
            	    match(input,COMMA,FOLLOW_COMMA_in_argumentDeclaration684); 
            	    COMMA69_tree = (Object)adaptor.create(COMMA69);
            	    adaptor.addChild(root_0, COMMA69_tree);

            	    IDENTIFIER70=(Token)input.LT(1);
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_argumentDeclaration686); 
            	    IDENTIFIER70_tree = (Object)adaptor.create(IDENTIFIER70);
            	    adaptor.addChild(root_0, IDENTIFIER70_tree);


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("argumentDeclaration", 20);
        }
        return retval;
    }
    // $ANTLR end argumentDeclaration

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ifStatement
    // ./CFScript.g:266:1: ifStatement : IF OPEN_PAREN codeStatement CLOSE_PAREN block ( elseifStatement )* ( elseStatement )? ;
    public final ifStatement_return ifStatement() throws RecognitionException {
    traceIn("ifStatement", 21);
        ifStatement_return retval = new ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF71=null;
        Token OPEN_PAREN72=null;
        Token CLOSE_PAREN74=null;
        codeStatement_return codeStatement73 = null;

        block_return block75 = null;

        elseifStatement_return elseifStatement76 = null;

        elseStatement_return elseStatement77 = null;


        Object IF71_tree=null;
        Object OPEN_PAREN72_tree=null;
        Object CLOSE_PAREN74_tree=null;

        try {
            // ./CFScript.g:268:2: ( IF OPEN_PAREN codeStatement CLOSE_PAREN block ( elseifStatement )* ( elseStatement )? )
            // ./CFScript.g:268:2: IF OPEN_PAREN codeStatement CLOSE_PAREN block ( elseifStatement )* ( elseStatement )?
            {
            root_0 = (Object)adaptor.nil();

            IF71=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_ifStatement700); 
            IF71_tree = (Object)adaptor.create(IF71);
            root_0 = (Object)adaptor.becomeRoot(IF71_tree, root_0);

            OPEN_PAREN72=(Token)input.LT(1);
            match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_ifStatement703); 
            OPEN_PAREN72_tree = (Object)adaptor.create(OPEN_PAREN72);
            adaptor.addChild(root_0, OPEN_PAREN72_tree);

            pushFollow(FOLLOW_codeStatement_in_ifStatement705);
            codeStatement73=codeStatement();
            _fsp--;

            adaptor.addChild(root_0, codeStatement73.getTree());
            CLOSE_PAREN74=(Token)input.LT(1);
            match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_ifStatement707); 
            CLOSE_PAREN74_tree = (Object)adaptor.create(CLOSE_PAREN74);
            adaptor.addChild(root_0, CLOSE_PAREN74_tree);

            pushFollow(FOLLOW_block_in_ifStatement710);
            block75=block();
            _fsp--;

            adaptor.addChild(root_0, block75.getTree());
            // ./CFScript.g:270:2: ( elseifStatement )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ELSE) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==IF) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ./CFScript.g:270:3: elseifStatement
            	    {
            	    pushFollow(FOLLOW_elseifStatement_in_ifStatement714);
            	    elseifStatement76=elseifStatement();
            	    _fsp--;

            	    adaptor.addChild(root_0, elseifStatement76.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ./CFScript.g:271:2: ( elseStatement )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ELSE) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ./CFScript.g:271:3: elseStatement
                    {
                    pushFollow(FOLLOW_elseStatement_in_ifStatement720);
                    elseStatement77=elseStatement();
                    _fsp--;

                    adaptor.addChild(root_0, elseStatement77.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("ifStatement", 21);
        }
        return retval;
    }
    // $ANTLR end ifStatement

    public static class elseifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start elseifStatement
    // ./CFScript.g:274:1: elseifStatement : ELSE IF OPEN_PAREN codeStatement CLOSE_PAREN block -> ^( ELSEIF ELSE IF OPEN_PAREN codeStatement CLOSE_PAREN block ) ;
    public final elseifStatement_return elseifStatement() throws RecognitionException {
    traceIn("elseifStatement", 22);
        elseifStatement_return retval = new elseifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ELSE78=null;
        Token IF79=null;
        Token OPEN_PAREN80=null;
        Token CLOSE_PAREN82=null;
        codeStatement_return codeStatement81 = null;

        block_return block83 = null;


        Object ELSE78_tree=null;
        Object IF79_tree=null;
        Object OPEN_PAREN80_tree=null;
        Object CLOSE_PAREN82_tree=null;
        RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
        RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_codeStatement=new RewriteRuleSubtreeStream(adaptor,"rule codeStatement");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // ./CFScript.g:276:2: ( ELSE IF OPEN_PAREN codeStatement CLOSE_PAREN block -> ^( ELSEIF ELSE IF OPEN_PAREN codeStatement CLOSE_PAREN block ) )
            // ./CFScript.g:276:2: ELSE IF OPEN_PAREN codeStatement CLOSE_PAREN block
            {
            ELSE78=(Token)input.LT(1);
            match(input,ELSE,FOLLOW_ELSE_in_elseifStatement735); 
            stream_ELSE.add(ELSE78);

            IF79=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_elseifStatement737); 
            stream_IF.add(IF79);

            OPEN_PAREN80=(Token)input.LT(1);
            match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_elseifStatement739); 
            stream_OPEN_PAREN.add(OPEN_PAREN80);

            pushFollow(FOLLOW_codeStatement_in_elseifStatement741);
            codeStatement81=codeStatement();
            _fsp--;

            stream_codeStatement.add(codeStatement81.getTree());
            CLOSE_PAREN82=(Token)input.LT(1);
            match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_elseifStatement743); 
            stream_CLOSE_PAREN.add(CLOSE_PAREN82);

            pushFollow(FOLLOW_block_in_elseifStatement747);
            block83=block();
            _fsp--;

            stream_block.add(block83.getTree());

            // AST REWRITE
            // elements: CLOSE_PAREN, OPEN_PAREN, IF, ELSE, codeStatement, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 278:2: -> ^( ELSEIF ELSE IF OPEN_PAREN codeStatement CLOSE_PAREN block )
            {
                // ./CFScript.g:278:5: ^( ELSEIF ELSE IF OPEN_PAREN codeStatement CLOSE_PAREN block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ELSEIF, "ELSEIF"), root_1);

                adaptor.addChild(root_1, stream_ELSE.next());
                adaptor.addChild(root_1, stream_IF.next());
                adaptor.addChild(root_1, stream_OPEN_PAREN.next());
                adaptor.addChild(root_1, stream_codeStatement.next());
                adaptor.addChild(root_1, stream_CLOSE_PAREN.next());
                adaptor.addChild(root_1, stream_block.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("elseifStatement", 22);
        }
        return retval;
    }
    // $ANTLR end elseifStatement

    public static class elseStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start elseStatement
    // ./CFScript.g:284:1: elseStatement : ELSE block ;
    public final elseStatement_return elseStatement() throws RecognitionException {
    traceIn("elseStatement", 23);
        elseStatement_return retval = new elseStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ELSE84=null;
        block_return block85 = null;


        Object ELSE84_tree=null;

        try {
            // ./CFScript.g:286:2: ( ELSE block )
            // ./CFScript.g:286:2: ELSE block
            {
            root_0 = (Object)adaptor.nil();

            ELSE84=(Token)input.LT(1);
            match(input,ELSE,FOLLOW_ELSE_in_elseStatement791); 
            ELSE84_tree = (Object)adaptor.create(ELSE84);
            root_0 = (Object)adaptor.becomeRoot(ELSE84_tree, root_0);

            pushFollow(FOLLOW_block_in_elseStatement795);
            block85=block();
            _fsp--;

            adaptor.addChild(root_0, block85.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("elseStatement", 23);
        }
        return retval;
    }
    // $ANTLR end elseStatement

    public static class tryStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tryStatement
    // ./CFScript.g:290:1: tryStatement : TRY block catchStatement ;
    public final tryStatement_return tryStatement() throws RecognitionException {
    traceIn("tryStatement", 24);
        tryStatement_return retval = new tryStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TRY86=null;
        block_return block87 = null;

        catchStatement_return catchStatement88 = null;


        Object TRY86_tree=null;

        try {
            // ./CFScript.g:292:2: ( TRY block catchStatement )
            // ./CFScript.g:292:2: TRY block catchStatement
            {
            root_0 = (Object)adaptor.nil();

            TRY86=(Token)input.LT(1);
            match(input,TRY,FOLLOW_TRY_in_tryStatement807); 
            TRY86_tree = (Object)adaptor.create(TRY86);
            root_0 = (Object)adaptor.becomeRoot(TRY86_tree, root_0);

            pushFollow(FOLLOW_block_in_tryStatement811);
            block87=block();
            _fsp--;

            adaptor.addChild(root_0, block87.getTree());
            pushFollow(FOLLOW_catchStatement_in_tryStatement814);
            catchStatement88=catchStatement();
            _fsp--;

            adaptor.addChild(root_0, catchStatement88.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("tryStatement", 24);
        }
        return retval;
    }
    // $ANTLR end tryStatement

    public static class catchClass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start catchClass
    // ./CFScript.g:298:1: catchClass : IDENTIFIER ( DOT IDENTIFIER )* ;
    public final catchClass_return catchClass() throws RecognitionException {
    traceIn("catchClass", 25);
        catchClass_return retval = new catchClass_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER89=null;
        Token DOT90=null;
        Token IDENTIFIER91=null;

        Object IDENTIFIER89_tree=null;
        Object DOT90_tree=null;
        Object IDENTIFIER91_tree=null;

        try {
            // ./CFScript.g:300:2: ( IDENTIFIER ( DOT IDENTIFIER )* )
            // ./CFScript.g:300:2: IDENTIFIER ( DOT IDENTIFIER )*
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER89=(Token)input.LT(1);
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_catchClass828); 
            IDENTIFIER89_tree = (Object)adaptor.create(IDENTIFIER89);
            adaptor.addChild(root_0, IDENTIFIER89_tree);

            // ./CFScript.g:300:12: ( DOT IDENTIFIER )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==DOT) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ./CFScript.g:300:13: DOT IDENTIFIER
            	    {
            	    DOT90=(Token)input.LT(1);
            	    match(input,DOT,FOLLOW_DOT_in_catchClass830); 
            	    DOT90_tree = (Object)adaptor.create(DOT90);
            	    adaptor.addChild(root_0, DOT90_tree);

            	    IDENTIFIER91=(Token)input.LT(1);
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_catchClass832); 
            	    IDENTIFIER91_tree = (Object)adaptor.create(IDENTIFIER91);
            	    adaptor.addChild(root_0, IDENTIFIER91_tree);


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("catchClass", 25);
        }
        return retval;
    }
    // $ANTLR end catchClass

    public static class catchStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start catchStatement
    // ./CFScript.g:303:1: catchStatement : CATCH OPEN_PAREN catchClass IDENTIFIER CLOSE_PAREN block -> ^( CATCH OPEN_PAREN catchClass IDENTIFIER CLOSE_PAREN block ) ;
    public final catchStatement_return catchStatement() throws RecognitionException {
    traceIn("catchStatement", 26);
        catchStatement_return retval = new catchStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CATCH92=null;
        Token OPEN_PAREN93=null;
        Token IDENTIFIER95=null;
        Token CLOSE_PAREN96=null;
        catchClass_return catchClass94 = null;

        block_return block97 = null;


        Object CATCH92_tree=null;
        Object OPEN_PAREN93_tree=null;
        Object IDENTIFIER95_tree=null;
        Object CLOSE_PAREN96_tree=null;
        RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
        RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
        RewriteRuleTokenStream stream_CATCH=new RewriteRuleTokenStream(adaptor,"token CATCH");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_catchClass=new RewriteRuleSubtreeStream(adaptor,"rule catchClass");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // ./CFScript.g:305:2: ( CATCH OPEN_PAREN catchClass IDENTIFIER CLOSE_PAREN block -> ^( CATCH OPEN_PAREN catchClass IDENTIFIER CLOSE_PAREN block ) )
            // ./CFScript.g:305:2: CATCH OPEN_PAREN catchClass IDENTIFIER CLOSE_PAREN block
            {
            CATCH92=(Token)input.LT(1);
            match(input,CATCH,FOLLOW_CATCH_in_catchStatement847); 
            stream_CATCH.add(CATCH92);

            OPEN_PAREN93=(Token)input.LT(1);
            match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_catchStatement849); 
            stream_OPEN_PAREN.add(OPEN_PAREN93);

            pushFollow(FOLLOW_catchClass_in_catchStatement851);
            catchClass94=catchClass();
            _fsp--;

            stream_catchClass.add(catchClass94.getTree());
            IDENTIFIER95=(Token)input.LT(1);
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_catchStatement853); 
            stream_IDENTIFIER.add(IDENTIFIER95);

            CLOSE_PAREN96=(Token)input.LT(1);
            match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_catchStatement855); 
            stream_CLOSE_PAREN.add(CLOSE_PAREN96);

            pushFollow(FOLLOW_block_in_catchStatement858);
            block97=block();
            _fsp--;

            stream_block.add(block97.getTree());

            // AST REWRITE
            // elements: CATCH, IDENTIFIER, OPEN_PAREN, CLOSE_PAREN, catchClass, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 307:2: -> ^( CATCH OPEN_PAREN catchClass IDENTIFIER CLOSE_PAREN block )
            {
                // ./CFScript.g:307:5: ^( CATCH OPEN_PAREN catchClass IDENTIFIER CLOSE_PAREN block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_CATCH.next(), root_1);

                adaptor.addChild(root_1, stream_OPEN_PAREN.next());
                adaptor.addChild(root_1, stream_catchClass.next());
                adaptor.addChild(root_1, stream_IDENTIFIER.next());
                adaptor.addChild(root_1, stream_CLOSE_PAREN.next());
                adaptor.addChild(root_1, stream_block.next());

                adaptor.addChild(root_0, root_1);
                }

            }



            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("catchStatement", 26);
        }
        return retval;
    }
    // $ANTLR end catchStatement

    public static class forStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forStatement
    // ./CFScript.g:311:1: forStatement : FOR OPEN_PAREN ( forConditions | forIn ) CLOSE_PAREN block ;
    public final forStatement_return forStatement() throws RecognitionException {
    traceIn("forStatement", 27);
        forStatement_return retval = new forStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR98=null;
        Token OPEN_PAREN99=null;
        Token CLOSE_PAREN102=null;
        forConditions_return forConditions100 = null;

        forIn_return forIn101 = null;

        block_return block103 = null;


        Object FOR98_tree=null;
        Object OPEN_PAREN99_tree=null;
        Object CLOSE_PAREN102_tree=null;

        try {
            // ./CFScript.g:313:2: ( FOR OPEN_PAREN ( forConditions | forIn ) CLOSE_PAREN block )
            // ./CFScript.g:313:2: FOR OPEN_PAREN ( forConditions | forIn ) CLOSE_PAREN block
            {
            root_0 = (Object)adaptor.nil();

            FOR98=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forStatement890); 
            FOR98_tree = (Object)adaptor.create(FOR98);
            root_0 = (Object)adaptor.becomeRoot(FOR98_tree, root_0);

            OPEN_PAREN99=(Token)input.LT(1);
            match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_forStatement893); 
            OPEN_PAREN99_tree = (Object)adaptor.create(OPEN_PAREN99);
            adaptor.addChild(root_0, OPEN_PAREN99_tree);

            // ./CFScript.g:313:18: ( forConditions | forIn )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==VAR||LA25_0==OPEN_PAREN||(LA25_0>=NOT && LA25_0<=HASH)||LA25_0==DOUBLE_QUOTE||LA25_0==SINGLE_QUOTE) ) {
                alt25=1;
            }
            else if ( (LA25_0==IDENTIFIER) ) {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==SEMI_COLON||(LA25_2>=EQUALS && LA25_2<=OPEN_PAREN)||LA25_2==OPERATOR||LA25_2==DOT||LA25_2==OPEN_SQUARE) ) {
                    alt25=1;
                }
                else if ( (LA25_2==IN) ) {
                    alt25=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("313:18: ( forConditions | forIn )", 25, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("313:18: ( forConditions | forIn )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ./CFScript.g:313:19: forConditions
                    {
                    pushFollow(FOLLOW_forConditions_in_forStatement896);
                    forConditions100=forConditions();
                    _fsp--;

                    adaptor.addChild(root_0, forConditions100.getTree());

                    }
                    break;
                case 2 :
                    // ./CFScript.g:313:35: forIn
                    {
                    pushFollow(FOLLOW_forIn_in_forStatement900);
                    forIn101=forIn();
                    _fsp--;

                    adaptor.addChild(root_0, forIn101.getTree());

                    }
                    break;

            }

            CLOSE_PAREN102=(Token)input.LT(1);
            match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_forStatement903); 
            CLOSE_PAREN102_tree = (Object)adaptor.create(CLOSE_PAREN102);
            adaptor.addChild(root_0, CLOSE_PAREN102_tree);

            pushFollow(FOLLOW_block_in_forStatement906);
            block103=block();
            _fsp--;

            adaptor.addChild(root_0, block103.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("forStatement", 27);
        }
        return retval;
    }
    // $ANTLR end forStatement

    public static class forIn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forIn
    // ./CFScript.g:316:1: forIn : IDENTIFIER IN cfmlLinking ;
    public final forIn_return forIn() throws RecognitionException {
    traceIn("forIn", 28);
        forIn_return retval = new forIn_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENTIFIER104=null;
        Token IN105=null;
        cfmlLinking_return cfmlLinking106 = null;


        Object IDENTIFIER104_tree=null;
        Object IN105_tree=null;

        try {
            // ./CFScript.g:318:2: ( IDENTIFIER IN cfmlLinking )
            // ./CFScript.g:318:2: IDENTIFIER IN cfmlLinking
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER104=(Token)input.LT(1);
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_forIn917); 
            IDENTIFIER104_tree = (Object)adaptor.create(IDENTIFIER104);
            adaptor.addChild(root_0, IDENTIFIER104_tree);

            IN105=(Token)input.LT(1);
            match(input,IN,FOLLOW_IN_in_forIn919); 
            IN105_tree = (Object)adaptor.create(IN105);
            adaptor.addChild(root_0, IN105_tree);

            pushFollow(FOLLOW_cfmlLinking_in_forIn921);
            cfmlLinking106=cfmlLinking();
            _fsp--;

            adaptor.addChild(root_0, cfmlLinking106.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("forIn", 28);
        }
        return retval;
    }
    // $ANTLR end forIn

    public static class forConditions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forConditions
    // ./CFScript.g:321:1: forConditions : setStatement SEMI_COLON setStatement SEMI_COLON setStatement ;
    public final forConditions_return forConditions() throws RecognitionException {
    traceIn("forConditions", 29);
        forConditions_return retval = new forConditions_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI_COLON108=null;
        Token SEMI_COLON110=null;
        setStatement_return setStatement107 = null;

        setStatement_return setStatement109 = null;

        setStatement_return setStatement111 = null;


        Object SEMI_COLON108_tree=null;
        Object SEMI_COLON110_tree=null;

        try {
            // ./CFScript.g:323:2: ( setStatement SEMI_COLON setStatement SEMI_COLON setStatement )
            // ./CFScript.g:323:2: setStatement SEMI_COLON setStatement SEMI_COLON setStatement
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_setStatement_in_forConditions933);
            setStatement107=setStatement();
            _fsp--;

            adaptor.addChild(root_0, setStatement107.getTree());
            SEMI_COLON108=(Token)input.LT(1);
            match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_forConditions936); 
            SEMI_COLON108_tree = (Object)adaptor.create(SEMI_COLON108);
            adaptor.addChild(root_0, SEMI_COLON108_tree);

            pushFollow(FOLLOW_setStatement_in_forConditions939);
            setStatement109=setStatement();
            _fsp--;

            adaptor.addChild(root_0, setStatement109.getTree());
            SEMI_COLON110=(Token)input.LT(1);
            match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_forConditions942); 
            SEMI_COLON110_tree = (Object)adaptor.create(SEMI_COLON110);
            adaptor.addChild(root_0, SEMI_COLON110_tree);

            pushFollow(FOLLOW_setStatement_in_forConditions945);
            setStatement111=setStatement();
            _fsp--;

            adaptor.addChild(root_0, setStatement111.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("forConditions", 29);
        }
        return retval;
    }
    // $ANTLR end forConditions

    public static class whileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start whileStatement
    // ./CFScript.g:330:1: whileStatement : WHILE OPEN_PAREN codeStatement CLOSE_PAREN block ;
    public final whileStatement_return whileStatement() throws RecognitionException {
    traceIn("whileStatement", 30);
        whileStatement_return retval = new whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE112=null;
        Token OPEN_PAREN113=null;
        Token CLOSE_PAREN115=null;
        codeStatement_return codeStatement114 = null;

        block_return block116 = null;


        Object WHILE112_tree=null;
        Object OPEN_PAREN113_tree=null;
        Object CLOSE_PAREN115_tree=null;

        try {
            // ./CFScript.g:332:2: ( WHILE OPEN_PAREN codeStatement CLOSE_PAREN block )
            // ./CFScript.g:332:2: WHILE OPEN_PAREN codeStatement CLOSE_PAREN block
            {
            root_0 = (Object)adaptor.nil();

            WHILE112=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement957); 
            WHILE112_tree = (Object)adaptor.create(WHILE112);
            root_0 = (Object)adaptor.becomeRoot(WHILE112_tree, root_0);

            OPEN_PAREN113=(Token)input.LT(1);
            match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_whileStatement960); 
            OPEN_PAREN113_tree = (Object)adaptor.create(OPEN_PAREN113);
            adaptor.addChild(root_0, OPEN_PAREN113_tree);

            pushFollow(FOLLOW_codeStatement_in_whileStatement962);
            codeStatement114=codeStatement();
            _fsp--;

            adaptor.addChild(root_0, codeStatement114.getTree());
            CLOSE_PAREN115=(Token)input.LT(1);
            match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_whileStatement964); 
            CLOSE_PAREN115_tree = (Object)adaptor.create(CLOSE_PAREN115);
            adaptor.addChild(root_0, CLOSE_PAREN115_tree);

            pushFollow(FOLLOW_block_in_whileStatement967);
            block116=block();
            _fsp--;

            adaptor.addChild(root_0, block116.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("whileStatement", 30);
        }
        return retval;
    }
    // $ANTLR end whileStatement

    public static class doWhileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start doWhileStatement
    // ./CFScript.g:336:1: doWhileStatement : DO block WHILE OPEN_PAREN codeStatement CLOSE_PAREN ;
    public final doWhileStatement_return doWhileStatement() throws RecognitionException {
    traceIn("doWhileStatement", 31);
        doWhileStatement_return retval = new doWhileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DO117=null;
        Token WHILE119=null;
        Token OPEN_PAREN120=null;
        Token CLOSE_PAREN122=null;
        block_return block118 = null;

        codeStatement_return codeStatement121 = null;


        Object DO117_tree=null;
        Object WHILE119_tree=null;
        Object OPEN_PAREN120_tree=null;
        Object CLOSE_PAREN122_tree=null;

        try {
            // ./CFScript.g:338:2: ( DO block WHILE OPEN_PAREN codeStatement CLOSE_PAREN )
            // ./CFScript.g:338:2: DO block WHILE OPEN_PAREN codeStatement CLOSE_PAREN
            {
            root_0 = (Object)adaptor.nil();

            DO117=(Token)input.LT(1);
            match(input,DO,FOLLOW_DO_in_doWhileStatement979); 
            DO117_tree = (Object)adaptor.create(DO117);
            root_0 = (Object)adaptor.becomeRoot(DO117_tree, root_0);

            pushFollow(FOLLOW_block_in_doWhileStatement983);
            block118=block();
            _fsp--;

            adaptor.addChild(root_0, block118.getTree());
            WHILE119=(Token)input.LT(1);
            match(input,WHILE,FOLLOW_WHILE_in_doWhileStatement986); 
            WHILE119_tree = (Object)adaptor.create(WHILE119);
            adaptor.addChild(root_0, WHILE119_tree);

            OPEN_PAREN120=(Token)input.LT(1);
            match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_doWhileStatement988); 
            OPEN_PAREN120_tree = (Object)adaptor.create(OPEN_PAREN120);
            adaptor.addChild(root_0, OPEN_PAREN120_tree);

            pushFollow(FOLLOW_codeStatement_in_doWhileStatement990);
            codeStatement121=codeStatement();
            _fsp--;

            adaptor.addChild(root_0, codeStatement121.getTree());
            CLOSE_PAREN122=(Token)input.LT(1);
            match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_doWhileStatement992); 
            CLOSE_PAREN122_tree = (Object)adaptor.create(CLOSE_PAREN122);
            adaptor.addChild(root_0, CLOSE_PAREN122_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("doWhileStatement", 31);
        }
        return retval;
    }
    // $ANTLR end doWhileStatement

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start block
    // ./CFScript.g:343:1: block : ( ( OPEN_CURLY script CLOSE_CURLY ) ( SEMI_COLON )? | ( nonBlockStatement ) );
    public final block_return block() throws RecognitionException {
    traceIn("block", 32);
        block_return retval = new block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN_CURLY123=null;
        Token CLOSE_CURLY125=null;
        Token SEMI_COLON126=null;
        script_return script124 = null;

        nonBlockStatement_return nonBlockStatement127 = null;


        Object OPEN_CURLY123_tree=null;
        Object CLOSE_CURLY125_tree=null;
        Object SEMI_COLON126_tree=null;

        try {
            // ./CFScript.g:345:2: ( ( OPEN_CURLY script CLOSE_CURLY ) ( SEMI_COLON )? | ( nonBlockStatement ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==OPEN_CURLY) ) {
                alt27=1;
            }
            else if ( (LA27_0==VAR||LA27_0==OPEN_PAREN||LA27_0==RETURN||(LA27_0>=NOT && LA27_0<=HASH)||LA27_0==DOUBLE_QUOTE||LA27_0==SINGLE_QUOTE||LA27_0==IDENTIFIER||LA27_0==BREAK) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("343:1: block : ( ( OPEN_CURLY script CLOSE_CURLY ) ( SEMI_COLON )? | ( nonBlockStatement ) );", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ./CFScript.g:345:2: ( OPEN_CURLY script CLOSE_CURLY ) ( SEMI_COLON )?
                    {
                    root_0 = (Object)adaptor.nil();

                    // ./CFScript.g:345:2: ( OPEN_CURLY script CLOSE_CURLY )
                    // ./CFScript.g:345:3: OPEN_CURLY script CLOSE_CURLY
                    {
                    OPEN_CURLY123=(Token)input.LT(1);
                    match(input,OPEN_CURLY,FOLLOW_OPEN_CURLY_in_block1005); 
                    OPEN_CURLY123_tree = (Object)adaptor.create(OPEN_CURLY123);
                    adaptor.addChild(root_0, OPEN_CURLY123_tree);

                    pushFollow(FOLLOW_script_in_block1007);
                    script124=script();
                    _fsp--;

                    adaptor.addChild(root_0, script124.getTree());
                    CLOSE_CURLY125=(Token)input.LT(1);
                    match(input,CLOSE_CURLY,FOLLOW_CLOSE_CURLY_in_block1009); 
                    CLOSE_CURLY125_tree = (Object)adaptor.create(CLOSE_CURLY125);
                    adaptor.addChild(root_0, CLOSE_CURLY125_tree);


                    }

                    // ./CFScript.g:345:34: ( SEMI_COLON )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==SEMI_COLON) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ./CFScript.g:345:34: SEMI_COLON
                            {
                            SEMI_COLON126=(Token)input.LT(1);
                            match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_block1012); 
                            SEMI_COLON126_tree = (Object)adaptor.create(SEMI_COLON126);
                            adaptor.addChild(root_0, SEMI_COLON126_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ./CFScript.g:347:2: ( nonBlockStatement )
                    {
                    root_0 = (Object)adaptor.nil();

                    // ./CFScript.g:347:2: ( nonBlockStatement )
                    // ./CFScript.g:347:3: nonBlockStatement
                    {
                    pushFollow(FOLLOW_nonBlockStatement_in_block1020);
                    nonBlockStatement127=nonBlockStatement();
                    _fsp--;

                    adaptor.addChild(root_0, nonBlockStatement127.getTree());

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("block", 32);
        }
        return retval;
    }
    // $ANTLR end block

    public static class switchStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start switchStatement
    // ./CFScript.g:351:1: switchStatement : SWITCH OPEN_PAREN codeStatement CLOSE_PAREN OPEN_CURLY ( caseStatement )* ( defaultStatement )? CLOSE_CURLY ;
    public final switchStatement_return switchStatement() throws RecognitionException {
    traceIn("switchStatement", 33);
        switchStatement_return retval = new switchStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SWITCH128=null;
        Token OPEN_PAREN129=null;
        Token CLOSE_PAREN131=null;
        Token OPEN_CURLY132=null;
        Token CLOSE_CURLY135=null;
        codeStatement_return codeStatement130 = null;

        caseStatement_return caseStatement133 = null;

        defaultStatement_return defaultStatement134 = null;


        Object SWITCH128_tree=null;
        Object OPEN_PAREN129_tree=null;
        Object CLOSE_PAREN131_tree=null;
        Object OPEN_CURLY132_tree=null;
        Object CLOSE_CURLY135_tree=null;

        try {
            // ./CFScript.g:353:2: ( SWITCH OPEN_PAREN codeStatement CLOSE_PAREN OPEN_CURLY ( caseStatement )* ( defaultStatement )? CLOSE_CURLY )
            // ./CFScript.g:353:2: SWITCH OPEN_PAREN codeStatement CLOSE_PAREN OPEN_CURLY ( caseStatement )* ( defaultStatement )? CLOSE_CURLY
            {
            root_0 = (Object)adaptor.nil();

            SWITCH128=(Token)input.LT(1);
            match(input,SWITCH,FOLLOW_SWITCH_in_switchStatement1034); 
            SWITCH128_tree = (Object)adaptor.create(SWITCH128);
            root_0 = (Object)adaptor.becomeRoot(SWITCH128_tree, root_0);

            OPEN_PAREN129=(Token)input.LT(1);
            match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_switchStatement1037); 
            OPEN_PAREN129_tree = (Object)adaptor.create(OPEN_PAREN129);
            adaptor.addChild(root_0, OPEN_PAREN129_tree);

            pushFollow(FOLLOW_codeStatement_in_switchStatement1039);
            codeStatement130=codeStatement();
            _fsp--;

            adaptor.addChild(root_0, codeStatement130.getTree());
            CLOSE_PAREN131=(Token)input.LT(1);
            match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_switchStatement1041); 
            CLOSE_PAREN131_tree = (Object)adaptor.create(CLOSE_PAREN131);
            adaptor.addChild(root_0, CLOSE_PAREN131_tree);

            OPEN_CURLY132=(Token)input.LT(1);
            match(input,OPEN_CURLY,FOLLOW_OPEN_CURLY_in_switchStatement1044); 
            OPEN_CURLY132_tree = (Object)adaptor.create(OPEN_CURLY132);
            adaptor.addChild(root_0, OPEN_CURLY132_tree);

            // ./CFScript.g:355:2: ( caseStatement )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==CASE) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ./CFScript.g:355:3: caseStatement
            	    {
            	    pushFollow(FOLLOW_caseStatement_in_switchStatement1048);
            	    caseStatement133=caseStatement();
            	    _fsp--;

            	    adaptor.addChild(root_0, caseStatement133.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ./CFScript.g:356:2: ( defaultStatement )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==DEFAULT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ./CFScript.g:356:3: defaultStatement
                    {
                    pushFollow(FOLLOW_defaultStatement_in_switchStatement1054);
                    defaultStatement134=defaultStatement();
                    _fsp--;

                    adaptor.addChild(root_0, defaultStatement134.getTree());

                    }
                    break;

            }

            CLOSE_CURLY135=(Token)input.LT(1);
            match(input,CLOSE_CURLY,FOLLOW_CLOSE_CURLY_in_switchStatement1059); 
            CLOSE_CURLY135_tree = (Object)adaptor.create(CLOSE_CURLY135);
            adaptor.addChild(root_0, CLOSE_CURLY135_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("switchStatement", 33);
        }
        return retval;
    }
    // $ANTLR end switchStatement

    public static class caseStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start caseStatement
    // ./CFScript.g:360:1: caseStatement : CASE ( stringLiteral | NUMBER ) COLON script ;
    public final caseStatement_return caseStatement() throws RecognitionException {
    traceIn("caseStatement", 34);
        caseStatement_return retval = new caseStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CASE136=null;
        Token NUMBER138=null;
        Token COLON139=null;
        stringLiteral_return stringLiteral137 = null;

        script_return script140 = null;


        Object CASE136_tree=null;
        Object NUMBER138_tree=null;
        Object COLON139_tree=null;

        try {
            // ./CFScript.g:362:2: ( CASE ( stringLiteral | NUMBER ) COLON script )
            // ./CFScript.g:362:2: CASE ( stringLiteral | NUMBER ) COLON script
            {
            root_0 = (Object)adaptor.nil();

            CASE136=(Token)input.LT(1);
            match(input,CASE,FOLLOW_CASE_in_caseStatement1072); 
            CASE136_tree = (Object)adaptor.create(CASE136);
            root_0 = (Object)adaptor.becomeRoot(CASE136_tree, root_0);

            // ./CFScript.g:362:8: ( stringLiteral | NUMBER )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==DOUBLE_QUOTE||LA30_0==SINGLE_QUOTE) ) {
                alt30=1;
            }
            else if ( (LA30_0==NUMBER) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("362:8: ( stringLiteral | NUMBER )", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ./CFScript.g:362:9: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_caseStatement1076);
                    stringLiteral137=stringLiteral();
                    _fsp--;

                    adaptor.addChild(root_0, stringLiteral137.getTree());

                    }
                    break;
                case 2 :
                    // ./CFScript.g:362:25: NUMBER
                    {
                    NUMBER138=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_caseStatement1080); 
                    NUMBER138_tree = (Object)adaptor.create(NUMBER138);
                    adaptor.addChild(root_0, NUMBER138_tree);


                    }
                    break;

            }

            COLON139=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_caseStatement1083); 
            COLON139_tree = (Object)adaptor.create(COLON139);
            adaptor.addChild(root_0, COLON139_tree);

            pushFollow(FOLLOW_script_in_caseStatement1086);
            script140=script();
            _fsp--;

            adaptor.addChild(root_0, script140.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("caseStatement", 34);
        }
        return retval;
    }
    // $ANTLR end caseStatement

    public static class defaultStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start defaultStatement
    // ./CFScript.g:366:1: defaultStatement : DEFAULT COLON script ;
    public final defaultStatement_return defaultStatement() throws RecognitionException {
    traceIn("defaultStatement", 35);
        defaultStatement_return retval = new defaultStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DEFAULT141=null;
        Token COLON142=null;
        script_return script143 = null;


        Object DEFAULT141_tree=null;
        Object COLON142_tree=null;

        try {
            // ./CFScript.g:368:2: ( DEFAULT COLON script )
            // ./CFScript.g:368:2: DEFAULT COLON script
            {
            root_0 = (Object)adaptor.nil();

            DEFAULT141=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultStatement1098); 
            DEFAULT141_tree = (Object)adaptor.create(DEFAULT141);
            root_0 = (Object)adaptor.becomeRoot(DEFAULT141_tree, root_0);

            COLON142=(Token)input.LT(1);
            match(input,COLON,FOLLOW_COLON_in_defaultStatement1101); 
            COLON142_tree = (Object)adaptor.create(COLON142);
            adaptor.addChild(root_0, COLON142_tree);

            pushFollow(FOLLOW_script_in_defaultStatement1104);
            script143=script();
            _fsp--;

            adaptor.addChild(root_0, script143.getTree());

            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("defaultStatement", 35);
        }
        return retval;
    }
    // $ANTLR end defaultStatement

    public static class breakStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start breakStatement
    // ./CFScript.g:373:1: breakStatement : BREAK ;
    public final breakStatement_return breakStatement() throws RecognitionException {
    traceIn("breakStatement", 36);
        breakStatement_return retval = new breakStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BREAK144=null;

        Object BREAK144_tree=null;

        try {
            // ./CFScript.g:375:2: ( BREAK )
            // ./CFScript.g:375:2: BREAK
            {
            root_0 = (Object)adaptor.nil();

            BREAK144=(Token)input.LT(1);
            match(input,BREAK,FOLLOW_BREAK_in_breakStatement1117); 
            BREAK144_tree = (Object)adaptor.create(BREAK144);
            adaptor.addChild(root_0, BREAK144_tree);


            }

            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
    traceOut("breakStatement", 36);
        }
        return retval;
    }
    // $ANTLR end breakStatement


 

    public static final BitSet FOLLOW_nonBlockStatement_in_script96 = new BitSet(new long[]{0x0000113562AEA802L});
    public static final BitSet FOLLOW_ifStatement_in_script107 = new BitSet(new long[]{0x0000113562AEA802L});
    public static final BitSet FOLLOW_tryStatement_in_script117 = new BitSet(new long[]{0x0000113562AEA802L});
    public static final BitSet FOLLOW_forStatement_in_script127 = new BitSet(new long[]{0x0000113562AEA802L});
    public static final BitSet FOLLOW_whileStatement_in_script137 = new BitSet(new long[]{0x0000113562AEA802L});
    public static final BitSet FOLLOW_doWhileStatement_in_script147 = new BitSet(new long[]{0x0000113562AEA802L});
    public static final BitSet FOLLOW_switchStatement_in_script157 = new BitSet(new long[]{0x0000113562AEA802L});
    public static final BitSet FOLLOW_functionDeclaration_in_script167 = new BitSet(new long[]{0x0000113562AEA802L});
    public static final BitSet FOLLOW_setStatement_in_nonBlockStatement192 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_returnStatement_in_nonBlockStatement200 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_breakStatement_in_nonBlockStatement208 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_COLON_in_nonBlockStatement215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_setStatement232 = new BitSet(new long[]{0x0000000002AE2000L});
    public static final BitSet FOLLOW_codeStatement_in_setStatement236 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_EQUALS_in_setStatement239 = new BitSet(new long[]{0x0000000002AE2000L});
    public static final BitSet FOLLOW_codeStatement_in_setStatement241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_codeStatement259 = new BitSet(new long[]{0x0000000002AE2000L});
    public static final BitSet FOLLOW_codeStatement_in_codeStatement261 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_codeStatement263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cfmlBasicStatement_in_codeStatement271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStatement287 = new BitSet(new long[]{0x0000000002AE2002L});
    public static final BitSet FOLLOW_codeStatement_in_returnStatement291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cfmlValueStatement_in_cfmlBasicStatement305 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_OPERATOR_in_cfmlBasicStatement308 = new BitSet(new long[]{0x0000000002AE2000L});
    public static final BitSet FOLLOW_codeStatement_in_cfmlBasicStatement310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_cfmlValueStatement326 = new BitSet(new long[]{0x0000000002AC0000L});
    public static final BitSet FOLLOW_cfmlValue_in_cfmlValueStatement330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_cfmlValue343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_cfmlValue347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cfmlLinking_in_cfmlValue351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hashCfmlLinking_in_cfmlLinking364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cfmlBasicLinking_in_cfmlLinking370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_hashCfmlLinking383 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_cfmlBasicLinking_in_hashCfmlLinking385 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_HASH_in_hashCfmlLinking387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cfmlBasic_in_cfmlBasicLinking399 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_DOT_in_cfmlBasicLinking402 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_cfmlBasic_in_cfmlBasicLinking404 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_identifier_in_cfmlBasic418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_cfmlBasic422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hashCfmlLinking_in_innerStringCFML434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_QUOTE_in_stringLiteral450 = new BitSet(new long[]{0x007FFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_ESCAPE_DOUBLE_QUOTE_in_stringLiteral455 = new BitSet(new long[]{0x007FFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_innerStringCFML_in_stringLiteral459 = new BitSet(new long[]{0x007FFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_set_in_stringLiteral463 = new BitSet(new long[]{0x007FFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_DOUBLE_QUOTE_in_stringLiteral479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_in_stringLiteral492 = new BitSet(new long[]{0x007FFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_ESCAPE_SINGLE_QUOTE_in_stringLiteral497 = new BitSet(new long[]{0x007FFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_innerStringCFML_in_stringLiteral501 = new BitSet(new long[]{0x007FFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_set_in_stringLiteral505 = new BitSet(new long[]{0x007FFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_in_stringLiteral521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier536 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_struct_in_identifier539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_SQUARE_in_struct554 = new BitSet(new long[]{0x0000000002AE2000L});
    public static final BitSet FOLLOW_codeStatement_in_struct556 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_CLOSE_SQUARE_in_struct558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function573 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_function575 = new BitSet(new long[]{0x0000000002AE6000L});
    public static final BitSet FOLLOW_argumentStatement_in_function578 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_function582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_codeStatement_in_argumentStatement612 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_argumentStatement615 = new BitSet(new long[]{0x0000000002AE2000L});
    public static final BitSet FOLLOW_codeStatement_in_argumentStatement617 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration631 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_functionDeclaration635 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_functionDeclaration637 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_argumentDeclaration_in_functionDeclaration640 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_functionDeclaration644 = new BitSet(new long[]{0x0000104002AEA800L});
    public static final BitSet FOLLOW_block_in_functionDeclaration647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_argumentDeclaration681 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_argumentDeclaration684 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_argumentDeclaration686 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement700 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_ifStatement703 = new BitSet(new long[]{0x0000000002AE2000L});
    public static final BitSet FOLLOW_codeStatement_in_ifStatement705 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_ifStatement707 = new BitSet(new long[]{0x0000104002AEA800L});
    public static final BitSet FOLLOW_block_in_ifStatement710 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_elseifStatement_in_ifStatement714 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_elseStatement_in_ifStatement720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseifStatement735 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_IF_in_elseifStatement737 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_elseifStatement739 = new BitSet(new long[]{0x0000000002AE2000L});
    public static final BitSet FOLLOW_codeStatement_in_elseifStatement741 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_elseifStatement743 = new BitSet(new long[]{0x0000104002AEA800L});
    public static final BitSet FOLLOW_block_in_elseifStatement747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_elseStatement791 = new BitSet(new long[]{0x0000104002AEA800L});
    public static final BitSet FOLLOW_block_in_elseStatement795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStatement807 = new BitSet(new long[]{0x0000104002AEA800L});
    public static final BitSet FOLLOW_block_in_tryStatement811 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_catchStatement_in_tryStatement814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_catchClass828 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_DOT_in_catchClass830 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_catchClass832 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_CATCH_in_catchStatement847 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_catchStatement849 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_catchClass_in_catchStatement851 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_catchStatement853 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_catchStatement855 = new BitSet(new long[]{0x0000104002AEA800L});
    public static final BitSet FOLLOW_block_in_catchStatement858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement890 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_forStatement893 = new BitSet(new long[]{0x0000000002AE2800L});
    public static final BitSet FOLLOW_forConditions_in_forStatement896 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_forIn_in_forStatement900 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_forStatement903 = new BitSet(new long[]{0x0000104002AEA800L});
    public static final BitSet FOLLOW_block_in_forStatement906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_forIn917 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_IN_in_forIn919 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_cfmlLinking_in_forIn921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setStatement_in_forConditions933 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_COLON_in_forConditions936 = new BitSet(new long[]{0x0000000002AE2800L});
    public static final BitSet FOLLOW_setStatement_in_forConditions939 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_COLON_in_forConditions942 = new BitSet(new long[]{0x0000000002AE2800L});
    public static final BitSet FOLLOW_setStatement_in_forConditions945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement957 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_whileStatement960 = new BitSet(new long[]{0x0000000002AE2000L});
    public static final BitSet FOLLOW_codeStatement_in_whileStatement962 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_whileStatement964 = new BitSet(new long[]{0x0000104002AEA800L});
    public static final BitSet FOLLOW_block_in_whileStatement967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doWhileStatement979 = new BitSet(new long[]{0x0000104002AEA800L});
    public static final BitSet FOLLOW_block_in_doWhileStatement983 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_WHILE_in_doWhileStatement986 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_doWhileStatement988 = new BitSet(new long[]{0x0000000002AE2000L});
    public static final BitSet FOLLOW_codeStatement_in_doWhileStatement990 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_doWhileStatement992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_CURLY_in_block1005 = new BitSet(new long[]{0x000011B562AEA800L});
    public static final BitSet FOLLOW_script_in_block1007 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_in_block1009 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_SEMI_COLON_in_block1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonBlockStatement_in_block1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStatement1034 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_switchStatement1037 = new BitSet(new long[]{0x0000000002AE2000L});
    public static final BitSet FOLLOW_codeStatement_in_switchStatement1039 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_switchStatement1041 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_OPEN_CURLY_in_switchStatement1044 = new BitSet(new long[]{0x00000A8000000000L});
    public static final BitSet FOLLOW_caseStatement_in_switchStatement1048 = new BitSet(new long[]{0x00000A8000000000L});
    public static final BitSet FOLLOW_defaultStatement_in_switchStatement1054 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_CLOSE_CURLY_in_switchStatement1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStatement1072 = new BitSet(new long[]{0x0000000000A40000L});
    public static final BitSet FOLLOW_stringLiteral_in_caseStatement1076 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_NUMBER_in_caseStatement1080 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_COLON_in_caseStatement1083 = new BitSet(new long[]{0x0000113562AEA802L});
    public static final BitSet FOLLOW_script_in_caseStatement1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultStatement1098 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_COLON_in_defaultStatement1101 = new BitSet(new long[]{0x0000113562AEA802L});
    public static final BitSet FOLLOW_script_in_defaultStatement1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStatement1117 = new BitSet(new long[]{0x0000000000000002L});

}