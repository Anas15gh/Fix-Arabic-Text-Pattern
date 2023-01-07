package fix.arabic.text;
public class FixArabicText {
    char[][] letter = {{'ا', 'ﺎ', 'ﺎ', 'ا', 'ﻻ', 'ﻼ', '1'},
    {'أ', 'ﺄ', 'ﺄ', 'أ', 'ﻷ', 'ﻸ', '1'},
    {'إ', 'ﺈ', 'ﺈ', 'إ', 'ﻹ', 'ﻺ', '1'},
    {'آ', 'ﺂ', 'ﺂ', 'آ', 'ﻵ', 'ﻶ', '1'},
    {'ب', 'ﺐ', 'ﺒ', 'ﺑ', '×', '×', '0'},
    {'ت', 'ﺖ', 'ﺘ', 'ﺗ', 'ة', 'ﺔ', '0'},
    {'ث', 'ﺚ', 'ﺜ', 'ﺛ', '×', '×', '0'},
    {'ج', 'ﺞ', 'ﺠ', 'ﺟ', '×', '×', '0'},
    {'ح', 'ﺢ', 'ﺤ', 'ﺣ', '×', '×', '0'},
    {'خ', 'ﺦ', 'ﺨ', 'ﺧ', '×', '×', '0'},
    {'د', 'ﺪ', 'ﺪ', 'د', '×', '×', '1'},
    {'ذ', 'ﺬ', 'ﺬ', 'ذ', '×', '×', '1'},
    {'ر', 'ﺮ', 'ﺮ', 'ر', '×', '×', '1'},
    {'ز', 'ﺰ', 'ﺰ', 'ز', '×', '×', '1'},
    {'س', 'ﺲ', 'ﺴ', 'ﺳ', '×', '×', '0'},
    {'ش', 'ﺶ', 'ﺸ', 'ﺷ', '×', '×', '0'},
    {'ص', 'ﺺ', 'ﺼ', 'ﺻ', '×', '×', '0'},
    {'ض', 'ﺾ', 'ﻀ', 'ﺿ', '×', '×', '0'},
    {'ط', 'ﻂ', 'ﻄ', 'ﻃ', '×', '×', '0'},
    {'ظ', 'ﻆ', 'ﻈ', 'ﻇ', '×', '×', '0'},
    {'ع', 'ﻊ', 'ﻌ', 'ﻋ', '×', '×', '0'},
    {'غ', 'ﻎ', 'ﻐ', 'ﻏ', '×', '×', '0'},
    {'ف', 'ﻒ', 'ﻔ', 'ﻓ', '×', '×', '0'},
    {'ق', 'ﻖ', 'ﻘ', 'ﻗ', '×', '×', '0'},
    {'ك', 'ﻚ', 'ﻜ', 'ﻛ', '×', '×', '0'},
    {'ل', 'ﻞ', 'ﻠ', 'ﻟ', '×', '×', '0'},
    {'م', 'ﻢ', 'ﻤ', 'ﻣ', '×', '×', '0'},
    {'ن', 'ﻦ', 'ﻨ', 'ﻧ', '×', '×', '0'},
    {'ه', 'ﻪ', 'ﻬ', 'ﻫ', '×', '×', '0'},
    {'و', 'ﻮ', 'ﻮ', 'و', '×', '×', '1'},
    {'ي', 'ﻲ', 'ﻴ', 'ﻳ', '×', '×', '0'},
    {'ى', 'ﯽ', 'ﯩ', 'ﯨ', '×', '×', '0'},
    {'ئ', 'ﺊ', 'ﺌ', 'ﺋ', '×', '×', '0'},
    {'ؤ', 'ﺆ', 'ﺆ', 'ؤ', '×', '×', '1'},
    {'ء', 'ء', 'ء', 'ء', '×', '×', '2'}
    };
    public char Find(char e, int no){
        for(int i = 0; i < letter.length; i++)
            if(e == letter[i][0])
                return letter[i][no];
        return e;
    }
    public char GetRightSymbol(char previous, char current, char next){
        if((Find(previous, 6) == '2' || Find(previous, 6) == '1') && Find(next, 6) == '2'){
            return Find(current, 0);
        }else if(Find(previous, 6) == '0'&& Find(next, 6) == '2'){
            return Find(current, 1);
        }else if(Find(previous, 6) == '1' && next == ' '){
            return Find(current, 0);
        }else if(Find(previous, 6) == '1'){
            if(Find(current, 0) == 'ل' && (Find(next, 0) == 'ا' || Find(next, 0) == 'أ' || Find(next, 0) == 'إ' || Find(next, 0) == 'آ')){
                return Find(next, 4);
            }
            return Find(current, 3);
        }else if(Find(previous, 6) == '0' && next == ' '){
            return Find(current, 1);
        }else if(Find(previous, 6) == '0' && Find(next, 6) == '1'){
            if(Find(current, 0) == 'ل' && (Find(next, 0) == 'ا' || Find(next, 0) == 'أ' || Find(next, 0) == 'إ' || Find(next, 0) == 'آ')){
                return Find(next, 5);
            }
            return Find(current, 2);
        }else if(Find(previous, 6) == '0' && Find(next, 6) == '0'){
            
            return Find(current, 2);
        }else if(Find(next, 6) == '0'){
            return Find(current, 3);
        }else{
            return Find(current, 0);
        }
    }
    public String Transfer(String e){
        char chars[] = e.toCharArray();
        String result = "";
        System.out.println("TEXT:\t" + e);
        for(int i = chars.length - 1; i >= 0; i--){
            if(i == chars.length - 1){
                System.out.println("Last:\t" + chars[i]+ "\t\t[ " + i + " ]");
                if(chars[i - 1] != ' '){
                    if(chars[i] == 'ة' && Find(chars[i - 1], 6) == '0'){
                        result += letter[5][5];
                    }else
                        result += Find(chars[i], 1) + "";
                }else{     
                    result += Find(chars[i], 0) + "";
                }
            }else if(i <= 0){
                System.out.println("First:\t" + chars[i] + "\t\t[ " + i + " ]");
                if(chars[i] == ' '){
                    result += " ";
                }else{
                    result += Find(chars[i], 3) + "";
                }
            }else{
                if(chars[i] == 'ة'){
                    if(Find(chars[i - 1], 6) == '0'){
                        result += 'ﺔ';
                    }else{
                        result += 'ة';
                    }
                }else{
                    result += GetRightSymbol(chars[i - 1], chars[i], chars[i + 1]) + "";
                    System.out.println("No." + i + ":\t" + chars[i] + "\t\t[ " + GetRightSymbol(chars[i - 1], chars[i], chars[i + 1]) + " ]");
                }
                switch(GetRightSymbol(chars[i - 1], chars[i], chars[i + 1])){
                    case 'ﻻ':
                    case 'ﻼ':
                    case 'ﻷ':
                    case 'ﻸ':
                    case 'ﻹ':
                    case 'ﻺ': 
                    case 'ﻵ':
                    case 'ﻶ':
                        i--;
                    break;
                }
                
            }
        }
        System.out.println();
        return result;
    }
}
