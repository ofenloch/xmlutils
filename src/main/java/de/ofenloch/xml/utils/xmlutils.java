package de.ofenloch.xml.utils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * Utility Class XML documents and elements
 * 
 * @author Oliver Ofenloch
 *
 */
public class xmlutils {

    public static void writeDocToFile(Document document, String fileName, boolean excludeDeclaration,
            boolean prettyPrint, int indent) {
        try (FileWriter writer = new FileWriter(new File(fileName))) {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            if (excludeDeclaration) {
                transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            }
            if (prettyPrint) {
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", Integer.toString(indent));
                Node docRoot = document.getFirstChild();
                NamedNodeMap docRootAttributes = docRoot.getAttributes();
                if (docRootAttributes != null) {
                    Node space = docRootAttributes.getNamedItem("space");
                    if (space != null) {
                        docRootAttributes.removeNamedItem("space");
                    }
                    Node xmlspace = docRootAttributes.getNamedItem("xml:space");
                    if (xmlspace != null) {
                        docRootAttributes.removeNamedItem("xml:space");
                    }
                }
            }
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(writer);
            transformer.transform(source, result);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        } catch (TransformerConfigurationException e) {
            throw new IllegalStateException(e);
        } catch (TransformerException e) {
            throw new IllegalArgumentException(e);
        }
    } // public void write(Document document, String fileName, boolean
      // excludeDeclaration, boolean prettyPrint, int indent)

    public static void writeDocToFile(Document document, String fileName) {
        writeDocToFile(document, fileName, false, true, 2);
    } // public static void writeDocToFile(Document document, String fileName)

    public static Document loadXMLDocumentFromString(String xmlString)
            throws IOException, ParserConfigurationException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(xmlString));
            return builder.parse(is);
        } catch (SAXException e) {
            throw new SAXException(e);
        } catch (ParserConfigurationException e) {
            throw e;
        } catch (IOException e) {
            throw new IOException(e);
        }
    } // public static Document loadXMLDocumentFromString(String xmlString)

    public static Document loadXMLDocumentFromFile(String xmlFileName)
            throws IOException, ParserConfigurationException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            InputSource is = new InputSource(new FileReader(new File(xmlFileName)));
            return builder.parse(is);
        } catch (SAXException e) {
            throw new SAXException(e);
        } catch (ParserConfigurationException e) {
            throw e;
        } catch (IOException e) {
            throw new IOException(e);
        }
    } // public static Document loadXMLDocumentFromFile(String xmlFileName)
} // public class xmlutils
