package fix.arabic.text;
public class FixArabicText {
    char[][] letter = {{'ا', 'ﺎ', 'ﺎ', 'ا', 'ﻻ', 'ﻼ'},
    {'أ', 'ﺄ', 'ﺄ', 'أ', 'ﻷ', 'ﻸ'},
    {'إ', 'ﺈ', 'ﺈ', 'إ', 'ﻹ', 'ﻺ'},
    {'ﺁ', 'a', 'ﺁ', 'ﺁ', 'ﻵ', 'ﻶ'},
    {'ب', 'ﺐ', 'ﺒ', 'ﺑ', '×', '×'},
    {'ت', 'ﺖ', 'ﺘ', 'ﺗ', 'ة', 'ﺔ'},
    {'ث', 'ﺚ', 'ﺜ', 'ﺛ', '×', '×'},
    {'ج', 'ﺞ', 'ﺠ', 'ﺟ', '×', '×'},
    {'ح', 'ﺢ', 'ﺤ', 'ﺣ', '×', '×'},
    {'خ', 'ﺦ', 'ﺨ', 'ﺧ', '×', '×'},
    {'د', 'ﺪ', 'ﺪ', 'د', '×', '×'},
    {'ذ', 'ﺬ', 'ﺬ', 'ذ', '×', '×'},
    {'ر', 'ﺮ', 'ﺮ', 'ر', '×', '×'},
    {'ز', 'ﺰ', 'ﺰ', 'ز', '×', '×'},
    {'س', 'ﺲ', 'ﺴ', 'ﺳ', '×', '×'},
    {'ش', 'ﺶ', 'ﺸ', 'ﺷ', '×', '×'},
    {'ص', 'ﺺ', 'ﺼ', 'ﺻ', '×', '×'},
    {'ض', 'ﺾ', 'ﻀ', 'ﺿ', '×', '×'},
    {'ط', 'ﻂ', 'ﻄ', 'ﻃ', '×', '×'},
    {'ظ', 'ﻆ', 'ﻈ', 'ﻇ', '×', '×'},
    {'ع', 'ﻊ', 'ﻌ', 'ﻋ', '×', '×'},
    {'غ', 'ﻎ', 'ﻐ', 'ﻏ', '×', '×'},
    {'ف', 'ﻒ', 'ﻔ', 'ﻓ', '×', '×'},
    {'ق', 'ﻖ', 'ﻘ', 'ﻗ', '×', '×'},
    {'ك', 'ﻚ', 'ﻜ', 'ﻛ', '×', '×'},
    {'ل', 'ﻞ', 'ﻠ', 'ﻟ', '×', '×'},
    {'م', 'ﻢ', 'ﻤ', 'ﻣ', '×', '×'},
    {'ن', 'ﻦ', 'ﻨ', 'ﻧ', '×', '×'},
    {'ه', 'ﻪ', 'ﻬ', 'ﻫ', '×', '×'},
    {'و', 'ﻮ', 'ﻮ', 'و', '×', '×'},
    {'ي', 'ﻲ', 'ﻴ', 'ﻳ', '×', '×'},
    {'ى', 'ﯽ', 'ﯩ', 'ﯨ', '×', '×'},
    {'ئ', 'ﺊ', 'ﺌ', 'ﺋ', '×', '×'},
    {'ؤ', 'ﺆ', 'ﺆ', 'ؤ', '×', '×'},
    {'ﺀ', 'ﺀ', 'ﺀ', 'ﺀ', '×', '×'}
    };
    public char Find(char e, int no){
        for(int i = 0; i < letter.length; i++)
            if(e == letter[i][0])
                return letter[i][no];
        return e;
    }
    public String Transfer(String e){
        char chars[] = e.toCharArray();
        String result = "";
        System.out.println("TEXT:\t" + e);
        for(int i = chars.length - 1; i >= 0; i--){
            if(i == chars.length - 1){
                System.out.println("Last:\t" + chars[i]);
                if(chars[i - 1] != ' '){
                    if(chars[i]  == 'ة'){
                        result += letter[5][5];
                        System.out.println("HOOOOO");
                    }else
                        result += Find(chars[i], 1) + "";
                }else{     
                    result += Find(chars[i], 0) + "";
                }
            }else if(i <= 0){
                System.out.println("First:\t" + chars[i]);
                if(chars[1] == ' '){
                    result += Find(chars[i], 0) + "";
                }else{
                    result += Find(chars[i], 3) + "";
                }
            }else{
                System.out.println("No." + (i) + ":\t" + chars[i]);
                if(chars[i - 1]  == ' ' && chars[i + 1]  == ' '){
                    result += Find(chars[i], 0) + "";
                }else if(chars[i - 1]  == ' '){
                    result += Find(chars[i], 3) + "";
                }else if(chars[i + 1]  == ' '){
                    if(chars[i - 1]  == 'ا' || chars[i - 1]  == 'أ' || chars[i - 1]  == 'إ' || chars[i - 1]  == 'آ'){
                        if((chars[i]  == 'ا' || chars[i]  == 'أ' || chars[i]  == 'إ' || chars[i]  == 'آ') && chars[i - 1] == 'ل'){
                            switch(chars[i]){
                                case 'ا':
                                    result += letter[0][4];
                                    i--;
                                    break;
                                case 'أ':
                                    result += letter[1][4];
                                    i--;
                                    break;
                                case 'إ':
                                    result += letter[2][4];
                                    i--;
                                    break;
                                case 'آ':
                                    result += letter[3][4];
                                    i--;
                                    break;
                            }
                        }else{
                            result += Find(chars[i], 0) + "";
                        }
                    }else{
                        if((chars[i]  == 'ا' || chars[i]  == 'أ' || chars[i]  == 'إ' || chars[i]  == 'آ') && chars[i - 1] == 'ل'){
                            switch(chars[i]){
                                case 'ا':
                                    result += letter[0][4];
                                    i--;
                                    break;
                                case 'أ':
                                    result += letter[1][4];
                                    i--;
                                    break;
                                case 'إ':
                                    result += letter[2][4];
                                    i--;
                                    break;
                                case 'آ':
                                    result += letter[3][4];
                                    i--;
                                    break;
                            }
                        }else{
                            if(chars[i]  == 'ة')
                                result += letter[5][5];
                            else
                                result += Find(chars[i], 1) + "";
                        }
                    }
                }else{
                    if((chars[i]  == 'ا' || chars[i]  == 'أ' || chars[i]  == 'إ' || chars[i]  == 'آ') && chars[i - 1] == 'ل' && (chars[i + 1] == 'ا' || chars[i + 1] == 'أ' || chars[i + 1] == 'إ' || chars[i + 1] == 'آ')){
                        switch(chars[i]){
                            case 'ا':
                                result += letter[0][4];
                                i--;
                                break;
                            case 'أ':
                                result += letter[1][4];
                                i--;
                                break;
                            case 'إ':
                                result += letter[2][4];
                                i--;
                                break;
                            case 'آ':
                                result += letter[3][4];
                                i--;
                                break;
                        }
                    }else if((chars[i]  == 'ا' || chars[i]  == 'أ' || chars[i]  == 'إ' || chars[i]  == 'آ') && chars[i - 1] == 'ل'){
                        switch(chars[i]){
                            case 'ا':
                                if(chars[i - 2]  == 'ا' || chars[i - 2]  == 'أ' || chars[i - 2]  == 'إ' || chars[i - 2]  == 'آ')
                                    result += letter[0][4];
                                else
                                    result += letter[0][5];
                                i--;
                                break;
                            case 'أ':
                                if(chars[i - 2]  == 'ا' || chars[i - 2]  == 'أ' || chars[i - 2]  == 'إ' || chars[i - 2]  == 'آ')
                                    result += letter[1][4];
                                else
                                    result += letter[1][5];
                                i--;
                                break;
                            case 'إ':
                                if(chars[i - 2]  == 'ا' || chars[i - 2]  == 'أ' || chars[i - 2]  == 'إ' || chars[i - 2]  == 'آ')
                                    result += letter[2][4];
                                else
                                    result += letter[2][5];
                                i--;
                                break;
                            case 'آ':
                                if(chars[i - 2]  == 'ا' || chars[i - 2]  == 'أ' || chars[i - 2]  == 'إ' || chars[i - 2]  == 'آ')
                                    result += letter[3][4];
                                else
                                    result += letter[3][5];
                                i--;
                                break;
                        }
                    }else{
                        result += Find(chars[i], 2) + "";
                    }
                }
            }
        }
        System.out.println();
        return result;
    }
}