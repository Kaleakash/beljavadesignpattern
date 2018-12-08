interface Document{
	public void create();	
} 

class PDFDocument implements Document{
	public void create() {
		System.out.println("Creating PDF File");
	}
}

class XMLDocument implements Document{
	public void create() {
		System.out.println("Creating XML File");
	}
}
class CSVDocument implements Document{
	public void create() {
		System.out.println("Creating CSV File");
	}
}

class DocumentFactory{
	public Document getInstance(String docIdentifier){
    	switch(docIdentifier){
      	case "XML": return new XMLDocument();
      	case "PDF": return new PDFDocument();
      	case "CSV": return new CSVDocument();
    	}
    	return null;
  	}  
}
public class FactoryMethod{
  	public static void main(String args[]){
    	XMLDocument xmlDocument=(XMLDocument) new DocumentFactory().getInstance("XML");
	xmlDocument.create();
    	PDFDocument pdfDocument=(PDFDocument) new DocumentFactory().getInstance("PDF");
	pdfDocument.create();
  	} 
}