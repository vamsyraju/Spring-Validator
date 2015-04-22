package com.tutorialpoint.spring.di;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class TextEditor {
	@Autowired
	private SpellChecker spellChecker;
	
	@Autowired
	public TextEditor(SpellChecker spellChecker){
		 System.out.println("Inside TextEditor constructor." );
	      this.spellChecker = spellChecker;
	}
	 @Autowired
	 @Required
	   public void setSpellChecker( SpellChecker spellChecker ){
	      this.spellChecker = spellChecker;
	   }
	   public SpellChecker getSpellChecker( ) {
	      return spellChecker;
	   }
	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
	   
//	   @PostConstruct
	   public void init(){
	      System.out.println("Bean is going through init.");
	   }
//	   @PreDestroy
	   public void destroy(){
	      System.out.println("Bean will destroy now.");
	   }
}
