package com.millennialmedia.intellibot.psi;

import com.intellij.psi.tree.TokenSet;

public interface RobotTokenTypes {
    RobotElementType HEADING = new RobotElementType("HEADING");
    RobotElementType SETTING = new RobotElementType("SETTING");
    RobotElementType IMPORT = new RobotElementType("IMPORT");
    RobotElementType TC_KW_NAME = new RobotElementType("TC_KW_NAME");
    RobotElementType KEYWORD = new RobotElementType("KEYWORD");
    RobotElementType ARGUMENT = new RobotElementType("ARGUMENT");
    RobotElementType VARIABLE = new RobotElementType("VARIABLE");
    RobotElementType COMMENT = new RobotElementType("COMMENT");
    RobotElementType SEPARATOR = new RobotElementType("SEPARATOR");
    RobotElementType SYNTAX = new RobotElementType("SYNTAX");
    RobotElementType GHERKIN = new RobotElementType("GHERKIN");
    RobotElementType ERROR = new RobotElementType("ERROR");

    TokenSet KEYWORDS = TokenSet.create(HEADING, SETTING, IMPORT, COMMENT, SYNTAX, GHERKIN);
}