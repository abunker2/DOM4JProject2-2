/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.dtd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.dom4j.dtd.InternalEntityDecl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class InternalEntityDeclEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      InternalEntityDecl internalEntityDecl0 = new InternalEntityDecl("U]M45B\"'F>A1:-", "U]M45B\"'F>A1:-");
      String string0 = internalEntityDecl0.getName();
      assertEquals("U]M45B\"'F>A1:-", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      InternalEntityDecl internalEntityDecl0 = new InternalEntityDecl("U]M45B\"'F>A1:-", "U]M45B\"'F>A1:-");
      internalEntityDecl0.setValue("<!ENTITY U]M45B\"'F>A1:- \"U]M45B&#34;&#39;F&#62;A1:-\">");
      String string0 = internalEntityDecl0.toString();
      assertEquals("<!ENTITY U]M45B\"'F>A1:- \"&#38;#60;!ENTITY U]M45B&#34;&#39;F&#62;A1:- &#34;U]M45B&#38;#38;#34;&#38;#38;#39;F&#38;#38;#62;A1:-&#34;&#62;\">", internalEntityDecl0.toString());
      assertNotNull(string0);
      assertEquals("<!ENTITY U]M45B\"'F>A1:- \"&#38;#60;!ENTITY U]M45B&#34;&#39;F&#62;A1:- &#34;U]M45B&#38;#38;#34;&#38;#38;#39;F&#38;#38;#62;A1:-&#34;&#62;\">", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      InternalEntityDecl internalEntityDecl0 = new InternalEntityDecl();
      internalEntityDecl0.setName("%[C&RLA");
      // Undeclared exception!
      try {
        internalEntityDecl0.toString();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      InternalEntityDecl internalEntityDecl0 = new InternalEntityDecl();
      String string0 = internalEntityDecl0.getValue();
      assertNull(string0);
  }

  @Test
  public void test4()  throws Throwable  {
      InternalEntityDecl internalEntityDecl0 = new InternalEntityDecl("U]M45B\"'F>A1:-", "U]M45B\"'F>A1:-");
      String string0 = internalEntityDecl0.toString();
      assertEquals("<!ENTITY U]M45B\"'F>A1:- \"U]M45B&#34;&#39;F&#62;A1:-\">", string0);
      assertNotNull(string0);
  }
}
