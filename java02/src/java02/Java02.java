package java02;

import javax.swing.*;
public class Java02 {
	
	public static void main(String[] args)  {
		int divCount = 0;
		String componentName;
		String functionalComponent;
		String content = "";
		String insidepTag = "";
		String buttonWithFunction = "";
		
		
		
		String div = "<div>"+  content + "</div>";
		String divWithPTag = "<div>"+  insidepTag + "</div>";
		String pTag = "<p>" + insidepTag +"</p>";
		String h1 = "<h1></h1>";
		String h2 = "<h1></h1>";
		String h3 = "<h1></h1>";
		String button = "<button></button>";
		String buttonWithOnClick = "<button onClick{()=> window.open(https://youtube.com)} ></button>";
		
		String onClick = "onClick{()=> }";
	

		System.out.println("React Component Creater");
		System.out.println("How Does It Work ?");
		System.out.println("Copy the first export default function text into the blank page after u copy the divs with other content after the return statement");
		
		
		componentName = JOptionPane.showInputDialog("Component Name ?");
		functionalComponent = "export default function " + componentName  + "() { return ( place divs here ) }";
		System.out.println(functionalComponent);
		divCount = Integer.parseInt(JOptionPane.showInputDialog(" wie viele absaetze wollen sie haben bzw divs"));
		System.out.println(divCount);
		System.out.println("was soll in dem absatz bsw div stehen p fuer ptag oder b fuer button ");
		content = JOptionPane.showInputDialog("pTag oder button");
		
	
		
		if (content.equals("pTag") || content.equals("ptag")) {
			insidepTag = JOptionPane.showInputDialog("Welcher Text soll dort stehen?");
			pTag = "<p>" + insidepTag + "</p>";
		
			
		}else if (content.equals("button")) {
			buttonWithFunction = JOptionPane.showInputDialog("Soll der button eine Onclick function haben ?");
			if(buttonWithFunction.equals("ja")) {
				button = buttonWithOnClick;
			}else if(content.equals("nein")) {
				button = button;
			}
			
			
		}
		
		if (content.equals("pTag") || content.equals("ptag")) {
			
		    divWithPTag = "<div>"+ "\n" + pTag + "\n" + "</div>";
		    System.out.println(divWithPTag);
		} else if (content.equals("button")) {
		    div = "<div>"+ "\n"+ button + "\n" + "</div>";
		    System.out.println(div);
		}
		
		
	
		
		
		
		
		
		
		
		
	}
	
	
	
}

