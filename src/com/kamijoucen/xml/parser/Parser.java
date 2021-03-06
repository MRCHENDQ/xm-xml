package com.kamijoucen.xml.parser;

import com.kamijoucen.xml.ast.BaseAst;
import com.kamijoucen.xml.ast.TagEndAst;
import com.kamijoucen.xml.ast.TagStartAst;
import com.kamijoucen.xml.ast.result.AttrResult;
import com.kamijoucen.xml.ast.result.TextResult;
import com.kamijoucen.xml.ast.result.XmlHeaderResult;

public interface Parser {

    BaseAst parserTagBlock();

    TagEndAst parserTagEnd();

    TagStartAst parserTagStart();

    AttrResult parserAttr();

    TextResult parserChildText();

    XmlHeaderResult parserXmlHeader();

}
