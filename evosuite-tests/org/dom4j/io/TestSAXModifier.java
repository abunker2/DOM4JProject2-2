/*
 * This file was automatically generated by EvoSuite
 */

package org.dom4j.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import org.dom4j.DefaultDocumentFactory;
import org.dom4j.DocumentException;
import org.dom4j.DocumentFactory;
import org.dom4j.io.ElementModifier;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXModifier;
import org.dom4j.io.XMLWriter;
import org.junit.BeforeClass;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLFilterImpl;

@RunWith(EvoSuiteRunner.class)
public class TestSAXModifier {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SAXModifier sAXModifier0 = new SAXModifier();
      sAXModifier0.resetModifiers();
      sAXModifier0.resetModifiers();
      assertEquals(false, sAXModifier0.isPruneElements());
  }

  @Test
  public void test1()  throws Throwable  {
      SAXModifier sAXModifier0 = new SAXModifier(true);
      DefaultDocumentFactory defaultDocumentFactory0 = (DefaultDocumentFactory)DefaultDocumentFactory.getInstance();
      sAXModifier0.setDocumentFactory((DocumentFactory) defaultDocumentFactory0);
      assertEquals(true, sAXModifier0.isPruneElements());
  }

  @Test
  public void test2()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(67);
      OutputFormat outputFormat0 = new OutputFormat();
      XMLWriter xMLWriter0 = new XMLWriter((OutputStream) byteArrayOutputStream0, outputFormat0);
      SAXModifier sAXModifier0 = new SAXModifier((XMLReader) xMLWriter0);
      try {
        sAXModifier0.modify((Reader) null, "internal/symbol-table");
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * No parent for filter Nested exception: No parent for filter
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      SAXModifier sAXModifier0 = new SAXModifier(true);
      File file0 = new File(")", ")");
      URI uRI0 = file0.toURI();
      URL uRL0 = uRI0.toURL();
      try {
        sAXModifier0.modify(uRL0);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * /mnt/fastdata/ac1gf/SF110/dist/62_dom4j/)/) (No such file or directory) Nested exception: /mnt/fastdata/ac1gf/SF110/dist/62_dom4j/)/) (No such file or directory)
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      SAXModifier sAXModifier0 = new SAXModifier((XMLReader) null, true);
      assertEquals(false, sAXModifier0.isPruneElements());
  }

  @Test
  public void test5()  throws Throwable  {
      SAXModifier sAXModifier0 = new SAXModifier();
      InputSource inputSource0 = new InputSource();
      try {
        sAXModifier0.modify(inputSource0);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * null Nested exception: null
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      SAXModifier sAXModifier0 = new SAXModifier(false);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      FileInputStream fileInputStream0 = new FileInputStream(fileDescriptor0);
      try {
        sAXModifier0.modify((InputStream) fileInputStream0, "No such namespace prefix: ");
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * Stream Closed Nested exception: Stream Closed
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      SAXModifier sAXModifier0 = new SAXModifier();
      DefaultDocumentFactory defaultDocumentFactory0 = (DefaultDocumentFactory)sAXModifier0.getDocumentFactory();
      assertNotNull(defaultDocumentFactory0);
  }

  @Test
  public void test8()  throws Throwable  {
      SAXModifier sAXModifier0 = new SAXModifier();
      sAXModifier0.addModifier(" namespace: \"", (ElementModifier) null);
      // Undeclared exception!
      try {
        sAXModifier0.modify((File) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * name can't be null
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      SAXModifier sAXModifier0 = new SAXModifier(true);
      StringReader stringReader0 = new StringReader("~lVI/FCIq:z_.*d");
      try {
        sAXModifier0.modify((Reader) stringReader0);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * Error on line 1 of document  : Content is not allowed in prolog. Nested exception: Content is not allowed in prolog.
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      XMLFilterImpl xMLFilterImpl0 = new XMLFilterImpl();
      SAXModifier sAXModifier0 = new SAXModifier((XMLReader) xMLFilterImpl0);
      try {
        sAXModifier0.modify("claMss");
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * No parent for filter Nested exception: No parent for filter
         */
      }
  }

  @Test
  public void test11()  throws Throwable  {
      XMLWriter xMLWriter0 = new XMLWriter();
      SAXModifier sAXModifier0 = new SAXModifier((XMLReader) xMLWriter0);
      PipedInputStream pipedInputStream0 = new PipedInputStream(1474);
      try {
        sAXModifier0.modify((InputStream) pipedInputStream0);
        fail("Expecting exception: DocumentException");
      } catch(DocumentException e) {
        /*
         * No parent for filter Nested exception: No parent for filter
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      SAXModifier sAXModifier0 = new SAXModifier();
      sAXModifier0.removeModifier(" namespace: \"");
      assertEquals(false, sAXModifier0.isPruneElements());
  }

  @Test
  public void test13()  throws Throwable  {
      SAXModifier sAXModifier0 = new SAXModifier();
      PipedWriter pipedWriter0 = new PipedWriter();
      OutputFormat outputFormat0 = new OutputFormat(" namespace: \"", false, " namespace: \"");
      XMLWriter xMLWriter0 = new XMLWriter((Writer) pipedWriter0, outputFormat0);
      sAXModifier0.setXMLWriter(xMLWriter0);
      assertEquals(true, xMLWriter0.resolveEntityRefs());
  }
}
