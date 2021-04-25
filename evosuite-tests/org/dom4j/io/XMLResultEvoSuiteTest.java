/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLResult;
import org.dom4j.io.XMLWriter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class XMLResultEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      OutputFormat outputFormat0 = new OutputFormat("Adding text to an XML document must not be null", true, "Adding text to an XML document must not be null");
      XMLResult xMLResult0 = new XMLResult((Writer) null, outputFormat0);
      XMLWriter xMLWriter0 = xMLResult0.getXMLWriter();
      xMLResult0.setXMLWriter(xMLWriter0);
      assertEquals(true, xMLWriter0.resolveEntityRefs());
  }

  @Test
  public void test1()  throws Throwable  {
      XMLResult xMLResult0 = new XMLResult();
      XMLWriter xMLWriter0 = (XMLWriter)xMLResult0.getLexicalHandler();
      assertEquals(true, xMLWriter0.resolveEntityRefs());
  }

  @Test
  public void test2()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) byteArrayOutputStream0);
      XMLResult xMLResult0 = new XMLResult((OutputStream) filterOutputStream0);
      assertNull(xMLResult0.getSystemId());
  }

  @Test
  public void test3()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      OutputFormat outputFormat0 = new OutputFormat("", true);
      XMLResult xMLResult0 = new XMLResult((OutputStream) byteArrayOutputStream0, outputFormat0);
      assertNull(xMLResult0.getSystemId());
  }

  @Test
  public void test4()  throws Throwable  {
      OutputFormat outputFormat0 = OutputFormat.createPrettyPrint();
      XMLWriter xMLWriter0 = new XMLWriter(outputFormat0);
      XMLResult xMLResult0 = new XMLResult(xMLWriter0);
      XMLWriter xMLWriter1 = (XMLWriter)xMLResult0.getHandler();
      assertSame(xMLWriter1, xMLWriter0);
  }

  @Test
  public void test5()  throws Throwable  {
      XMLResult xMLResult0 = new XMLResult((Writer) null);
      assertNull(xMLResult0.getSystemId());
  }
}
