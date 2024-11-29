class Solution {
    public int romanToInt(String s) {
         int a=0;
        
         for (int i = 0; i < s.length(); i++){ 
            if (s.charAt(i)!='I'&& s.charAt(i)!='V'&&s.charAt(i)!='X'&&s.charAt(i)!='L'
            &&s.charAt(i)!='C'&&s.charAt(i)!='D'&&s.charAt(i)!='M'){
                System.out.print("Error");
                System.exit(1);
            }
            else{
         switch( s.charAt(i))  {
        case 'I':
          a=a+1;
        break;
        case 'V':
        if (i>0&&s.charAt(i-1)=='I'){a=a+3;}

        else{a=a+5;}
        break;
        case 'X':
         if (i>0&&s.charAt(i-1)=='I'){a=a+8;}
         else{  a=a+10;}
        
        break;
        case 'L':
         if (i>0&&s.charAt(i-1)=='X'){a=a+30;}
         else{   a=a+50;}
       
        break;
        case 'C':
        if (i>0&&s.charAt(i-1)=='X'){a=a+80;}
         else{   a=a+100;}
          
        break;
        case 'D':
         if (i>0&&s.charAt(i-1)=='C'){a=a+300;}
         else{  a=a+500;}
        
        break;
           case 'M':
         if (i>0&&s.charAt(i-1)=='C'){a=a+800;}
         else{  a=a+1000;}
        break;
         }


            }


         }

  return a;

    }
}