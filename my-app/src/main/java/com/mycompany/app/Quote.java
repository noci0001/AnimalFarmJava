package com.mycompany.app;

public class Quote {
   public String quote;
   public String explaination;
   public Quote[] quotes;
   
   public Quote(String quote, String explaination) {
      this.quote = quote;
      this.explaination = explaination;
   }

   public String getQuote() {
      return quote;
   }

   public String getExplaination() {
      return explaination;
   }
}
