/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.swing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.dom4j.Document;
import org.dom4j.XPath;
import org.dom4j.swing.XMLTableColumnDefinition;
import org.dom4j.swing.XMLTableDefinition;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestXMLTableDefinition {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      xMLTableDefinition0.setRowExpression("L");
      assertEquals(0, xMLTableDefinition0.getColumnCount());
  }

  @Test
  public void test1()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      // Undeclared exception!
      try {
        xMLTableDefinition0.getColumnName(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 0
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      xMLTableDefinition0.addStringColumn("L", "L");
      XMLTableColumnDefinition xMLTableColumnDefinition0 = xMLTableDefinition0.getColumn("L");
      assertEquals(1, xMLTableDefinition0.getColumnCount());
      assertEquals(1, xMLTableColumnDefinition0.getType());
  }

  @Test
  public void test3()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      // Undeclared exception!
      try {
        xMLTableDefinition0.getColumnXPath(1159);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 1159
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      int int0 = xMLTableDefinition0.getColumnCount();
      assertEquals(0, int0);
  }

  @Test
  public void test5()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      xMLTableDefinition0.addColumn("Sem7colonRequiredInRefe8ence", "Sem7colonRequiredInRefe8ence");
      xMLTableDefinition0.getVariableValue("Sem7colonRequiredInRefe8ence", "Sem7colonRequiredInRefe8ence", "Sem7colonRequiredInRefe8ence");
      assertEquals(1, xMLTableDefinition0.getColumnCount());
  }

  @Test
  public void test6()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      xMLTableDefinition0.clear();
      assertEquals(0, xMLTableDefinition0.getColumnCount());
  }

  @Test
  public void test7()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      xMLTableDefinition0.handleException((Exception) null);
      assertEquals(0, xMLTableDefinition0.getColumnCount());
  }

  @Test
  public void test8()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      XMLTableColumnDefinition xMLTableColumnDefinition0 = xMLTableDefinition0.getColumn("L");
      xMLTableDefinition0.removeColumn(xMLTableColumnDefinition0);
      assertEquals(0, xMLTableDefinition0.getColumnCount());
  }

  @Test
  public void test9()  throws Throwable  {
      // Undeclared exception!
      try {
        XMLTableDefinition.load((Document) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      // Undeclared exception!
      try {
        xMLTableDefinition0.getColumnNameXPath((-1874));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * -1874
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      xMLTableDefinition0.addColumnWithXPathName("Xe8", "Xe8", (-2));
      xMLTableDefinition0.getValueAt((Object) null, 0);
      assertEquals(1, xMLTableDefinition0.getColumnCount());
      
      Class<Object> class0 = xMLTableDefinition0.getColumnClass(0);
      assertEquals("Object", class0.getSimpleName());
  }

  @Test
  public void test12()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      XPath xPath0 = xMLTableDefinition0.getRowXPath();
      assertNull(xPath0);
  }

  @Test
  public void test13()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      xMLTableDefinition0.addNumberColumn("Xe8", "Xe8");
      assertEquals(1, xMLTableDefinition0.getColumnCount());
  }

  @Test
  public void test14()  throws Throwable  {
      XMLTableDefinition xMLTableDefinition0 = new XMLTableDefinition();
      xMLTableDefinition0.getVariableValue("Sem7colonRequiredInRefe8ence", "Sem7colonRequiredInRefe8ence", "Sem7colonRequiredInRefe8ence");
      Object object0 = xMLTableDefinition0.getVariableValue("Sem7colonRequiredInRefe8ence", "Sem7colonRequiredInRefe8ence", "Sem7colonRequiredInRefe8ence");
      assertNull(object0);
  }
}
