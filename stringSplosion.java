// Problem link: https://codingbat.com/prob/p117334

public String stringSplosion(String str) {
    StringBuilder sb = new StringBuilder();
    
    for(int i = 0; i<= str.length(); i++) {
      sb.append(str.substring(0,i));
    }
    
    return sb.toString();
  }
  